import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        int int8 = textNode6.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode6.splitText(0);
        boolean boolean12 = textNode10.hasAttr("hi!");
        java.lang.String str13 = textNode10.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText(0);
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode6.childNodesCopy();
        java.lang.String str15 = textNode6.nodeName();
        boolean boolean16 = textNode6.isBlank();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode6);
        java.lang.String str18 = textNode2.getWholeText();
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "i!" + "'", str3.equals("i!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!" + "'", str18.equals("i!"));
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        boolean boolean19 = textNode2.hasAttr("#text");
        java.lang.String str20 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        try {
            org.jsoup.nodes.Node node22 = textNode2.traverse(nodeVisitor21);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        java.lang.String str16 = textNode2.attr("");
        java.lang.String str17 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node19 = textNode13.attr("hi!", "#text");
        org.jsoup.nodes.Node node20 = textNode13.clone();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean24 = textNode23.isBlank();
        java.lang.Class<?> wildcardClass25 = textNode23.getClass();
        org.jsoup.nodes.Attributes attributes26 = textNode23.attributes();
        boolean boolean27 = node20.equals((java.lang.Object) textNode23);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node20.childNodes();
        int int29 = node20.siblingIndex();
        boolean boolean30 = textNode2.equals((java.lang.Object) node20);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode17.text("hi!");
        java.lang.String str20 = textNode17.outerHtml();
        java.lang.String str21 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.absUrl("#text");
        java.lang.String str24 = textNode17.toString();
        java.lang.String str25 = textNode17.getWholeText();
        int int26 = textNode17.childNodeSize();
        boolean boolean27 = textNode2.equals((java.lang.Object) int26);
        try {
            org.jsoup.nodes.Node node29 = textNode2.after("i!");
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
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        org.jsoup.nodes.Node node24 = textNode9.attr("hi!", "#text");
        try {
            org.jsoup.nodes.Node node26 = textNode9.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
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
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str5 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        node16.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node16.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node16.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node15 = textNode2.attr("h", "");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "#text");
        try {
            org.jsoup.nodes.Node node13 = node11.after("#text");
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        int int6 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.baseUri();
        java.lang.String str13 = textNode9.outerHtml();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Node node15 = textNode9.previousSibling();
        java.lang.String str16 = textNode9.text();
        java.lang.String str17 = textNode9.outerHtml();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean21 = textNode20.isBlank();
        boolean boolean23 = textNode20.hasAttr("hi!");
        int int24 = textNode20.childNodeSize();
        java.lang.String str25 = textNode20.text();
        org.jsoup.nodes.Attributes attributes26 = textNode20.attributes();
        org.jsoup.nodes.Node node27 = textNode20.clone();
        org.jsoup.nodes.Node node28 = textNode20.parent();
        org.jsoup.nodes.Attributes attributes29 = textNode20.attributes();
        org.jsoup.nodes.Node node30 = textNode20.previousSibling();
        java.lang.String str31 = textNode20.getWholeText();
        try {
            textNode9.replaceWith((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.nodeName();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node11 = node9.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean8 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        boolean boolean32 = textNode17.hasAttr("h");
        try {
            org.jsoup.nodes.Node node34 = textNode17.removeAttr("");
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean12 = textNode11.isBlank();
        org.jsoup.nodes.Attributes attributes13 = textNode11.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode11.siblingNodes();
        boolean boolean15 = textNode2.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node16 = textNode2.previousSibling();
        java.lang.String str17 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        java.lang.String str14 = textNode10.nodeName();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        boolean boolean17 = textNode2.equals((java.lang.Object) document16);
        java.lang.String str18 = textNode2.text();
        java.lang.String str20 = textNode2.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        int int6 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.absUrl("#text");
        int int9 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.absUrl("i!");
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        org.jsoup.nodes.Attributes attributes32 = textNode17.attributes();
        org.jsoup.nodes.Attributes attributes33 = textNode17.attributes();
        org.jsoup.nodes.TextNode textNode36 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode36.childNodesCopy();
        boolean boolean39 = textNode36.hasAttr("");
        int int40 = textNode36.siblingIndex();
        org.jsoup.nodes.Attributes attributes41 = textNode36.attributes();
        boolean boolean42 = textNode17.equals((java.lang.Object) textNode36);
        org.jsoup.nodes.Node node43 = textNode36.parent();
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
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        try {
            org.jsoup.nodes.Node node17 = textNode2.after("");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node7 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        boolean boolean11 = textNode2.hasAttr("h");
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.lang.String str17 = textNode12.text();
        org.jsoup.nodes.Attributes attributes18 = textNode12.attributes();
        java.lang.String str19 = textNode12.text();
        java.lang.String str21 = textNode12.attr("#text");
        org.jsoup.nodes.TextNode textNode23 = textNode12.text("#text");
        java.lang.String str24 = textNode23.text();
        java.lang.String str25 = textNode23.getWholeText();
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode23);
        org.jsoup.nodes.Attributes attributes27 = textNode23.attributes();
        org.jsoup.nodes.Node node28 = textNode23.parent();
        try {
            org.jsoup.nodes.Node node30 = node28.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        org.jsoup.nodes.Node node22 = node21.clone();
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode27 = textNode25.text("hi!");
        java.lang.String str28 = textNode25.outerHtml();
        org.jsoup.nodes.Node node31 = textNode25.attr("hi!", "#text");
        org.jsoup.nodes.Node node32 = textNode25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode25.siblingNodes();
        org.jsoup.nodes.TextNode textNode35 = textNode25.text("i!");
        boolean boolean36 = node22.equals((java.lang.Object) textNode35);
        java.lang.String str37 = textNode35.getWholeText();
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "i!" + "'", str37.equals("i!"));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        java.lang.String str19 = textNode9.getWholeText();
        try {
            org.jsoup.nodes.TextNode textNode21 = textNode9.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode12.isBlank();
        boolean boolean15 = textNode12.hasAttr("hi!");
        int int16 = textNode12.childNodeSize();
        java.lang.String str17 = textNode12.text();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("hi!");
        java.lang.String str20 = textNode19.nodeName();
        org.jsoup.nodes.Node node21 = textNode19.clone();
        boolean boolean22 = textNode2.equals((java.lang.Object) node21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str14 = textNode13.getWholeText();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean18 = textNode13.equals((java.lang.Object) "hi!");
        java.lang.String str19 = textNode13.toString();
        org.jsoup.nodes.Node node21 = textNode13.removeAttr("i!");
        java.lang.Class<?> wildcardClass22 = node21.getClass();
        org.jsoup.nodes.Node node23 = node21.previousSibling();
        try {
            textNode2.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.jsoup.nodes.Node node14 = textNode13.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodesCopy();
        java.lang.String str14 = textNode10.attr("i!");
        try {
            org.jsoup.nodes.Node node16 = textNode10.wrap("");
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        int int12 = node10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodes();
        java.lang.Class<?> wildcardClass14 = node10.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        try {
            org.jsoup.nodes.Node node16 = node10.traverse(nodeVisitor15);
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        try {
            java.lang.String str5 = node4.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        java.lang.String str26 = textNode17.toString();
        java.lang.String str28 = textNode17.attr("#text");
        java.lang.String str29 = textNode17.nodeName();
        org.jsoup.nodes.TextNode textNode31 = textNode17.text("");
        org.jsoup.nodes.Attributes attributes32 = textNode31.attributes();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.lang.String str37 = textNode2.text();
        int int38 = textNode2.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        int int11 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.absUrl("h");
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        int int15 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node16 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str9 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean13 = textNode8.equals((java.lang.Object) "hi!");
        java.lang.String str14 = textNode8.getWholeText();
        org.jsoup.nodes.Attributes attributes15 = textNode8.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode8.siblingNodes();
        org.jsoup.nodes.Document document17 = textNode8.ownerDocument();
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.jsoup.nodes.Node node16 = textNode2.attr("h", "#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node13 = node12.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        java.lang.String str7 = textNode6.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "i!" + "'", str7.equals("i!"));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node16 = textNode2.attr("h", "i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node10 = textNode2.attr("h", "");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str6 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node9 = textNode2.attr("h", "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.childNodesCopy();
        org.jsoup.nodes.Node node8 = node4.parent();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode15.childNodes();
        org.jsoup.nodes.Node node21 = textNode15.previousSibling();
        boolean boolean22 = textNode2.equals((java.lang.Object) node21);
        java.lang.String str23 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.lang.String str21 = textNode16.text();
        int int22 = textNode16.siblingIndex();
        boolean boolean24 = textNode16.equals((java.lang.Object) (short) 10);
        boolean boolean26 = textNode16.hasAttr("");
        java.lang.String str27 = textNode16.text();
        try {
            org.jsoup.nodes.Node node28 = textNode2.before((org.jsoup.nodes.Node) textNode16);
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.attr("i!", "h");
        java.lang.String str12 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node5 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.absUrl("hi!");
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        try {
            org.jsoup.nodes.Node node15 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        org.jsoup.nodes.Node node13 = textNode12.parent();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.lang.String str21 = textNode16.text();
        org.jsoup.nodes.Attributes attributes22 = textNode16.attributes();
        java.lang.String str23 = textNode16.text();
        java.lang.String str25 = textNode16.attr("#text");
        org.jsoup.nodes.Document document26 = textNode16.ownerDocument();
        java.lang.String str27 = textNode16.baseUri();
        int int28 = textNode16.childNodeSize();
        try {
            boolean boolean29 = node13.equals((java.lang.Object) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "");
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        org.jsoup.nodes.TextNode textNode18 = textNode16.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode16.siblingNodes();
        java.lang.String str20 = textNode16.text();
        org.jsoup.nodes.Node node21 = textNode16.clone();
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
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "h" + "'", str20.equals("h"));
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str23 = textNode22.outerHtml();
        org.jsoup.nodes.Node node25 = textNode22.removeAttr("#text");
        java.lang.String str26 = textNode22.getWholeText();
        try {
            node18.replaceWith((org.jsoup.nodes.Node) textNode22);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Node node13 = textNode2.attr("i!", "h");
        java.lang.String str14 = node13.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str12 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass14 = nodeList13.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        boolean boolean11 = textNode2.equals((java.lang.Object) nodeList10);
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean17 = textNode16.isBlank();
        org.jsoup.nodes.Attributes attributes18 = textNode16.attributes();
        int int19 = textNode16.siblingIndex();
        java.lang.String str20 = textNode16.nodeName();
        try {
            org.jsoup.nodes.Node node21 = node13.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "h");
        boolean boolean12 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.siblingNodes();
        java.lang.String str17 = textNode15.getWholeText();
        org.jsoup.nodes.TextNode textNode19 = textNode15.text("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node9 = node7.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        boolean boolean12 = textNode11.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.Document document15 = textNode14.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "h");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        java.lang.String str7 = textNode6.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        try {
            org.jsoup.nodes.Node node24 = textNode2.unwrap();
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
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        int int3 = textNode2.siblingIndex();
        boolean boolean5 = textNode2.hasAttr("hi!");
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes12 = textNode9.attributes();
        org.jsoup.nodes.Node node13 = textNode9.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        textNode2.setBaseUri("");
        int int12 = textNode2.childNodeSize();
        boolean boolean14 = textNode2.hasAttr("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.baseUri();
        java.lang.String str13 = textNode9.outerHtml();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Node node15 = textNode9.previousSibling();
        try {
            org.jsoup.nodes.Node node16 = node15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("#text");
        org.jsoup.nodes.Node node8 = textNode5.clone();
        int int9 = textNode5.siblingIndex();
        java.lang.Object obj10 = null;
        boolean boolean11 = textNode5.equals(obj10);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        boolean boolean6 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        textNode2.setBaseUri("hi!");
        java.lang.String str11 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        try {
            org.jsoup.nodes.Node node23 = textNode2.traverse(nodeVisitor22);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        try {
            node32.remove();
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
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        int int10 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode8.removeAttr("#text");
        java.lang.String str13 = textNode8.getWholeText();
        java.lang.String str14 = textNode8.baseUri();
        java.lang.String str15 = textNode8.baseUri();
        boolean boolean16 = textNode8.isBlank();
        java.lang.String str17 = textNode8.toString();
        org.jsoup.nodes.Node node18 = textNode8.clone();
        org.jsoup.nodes.Document document19 = textNode8.ownerDocument();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean14 = textNode2.hasAttr("hi!");
        int int15 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        try {
            textNode2.remove();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str9 = textNode2.attr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str11 = textNode2.absUrl("#text");
        java.lang.String str12 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        java.lang.String str14 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean4 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "i!" + "'", str6.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str11 = textNode6.attr("");
        java.lang.String str12 = textNode6.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodesCopy();
        org.jsoup.nodes.Node node15 = textNode6.removeAttr("#text");
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode6);
        org.jsoup.nodes.TextNode textNode18 = textNode6.splitText((int) (short) 1);
        java.lang.String str19 = textNode18.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        try {
            org.jsoup.nodes.Node node21 = textNode18.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "i!" + "'", str19.equals("i!"));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        org.jsoup.nodes.Node node13 = textNode11.removeAttr("#text");
        int int14 = textNode11.childNodeSize();
        org.jsoup.nodes.Attributes attributes15 = textNode11.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "");
        int int17 = textNode2.siblingIndex();
        java.lang.String str19 = textNode2.absUrl("hi!");
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
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = node9.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        int int22 = textNode2.childNodeSize();
        java.lang.String str23 = textNode2.baseUri();
        org.jsoup.nodes.Node node24 = textNode2.clone();
        org.jsoup.nodes.Node node25 = node24.clone();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode28.childNodesCopy();
        int int30 = textNode28.siblingIndex();
        java.lang.String str31 = textNode28.nodeName();
        java.lang.String str32 = textNode28.toString();
        int int33 = textNode28.childNodeSize();
        org.jsoup.nodes.TextNode textNode36 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode38 = textNode36.text("hi!");
        java.lang.String str39 = textNode36.outerHtml();
        org.jsoup.nodes.Node node42 = textNode36.attr("hi!", "#text");
        org.jsoup.nodes.Node node43 = textNode36.clone();
        boolean boolean44 = textNode28.equals((java.lang.Object) textNode36);
        org.jsoup.nodes.TextNode textNode46 = textNode28.splitText((int) (short) 1);
        java.lang.String str47 = textNode46.outerHtml();
        java.lang.String str49 = textNode46.attr("h");
        org.jsoup.nodes.Node node51 = textNode46.removeAttr("h");
        java.lang.String str52 = textNode46.getWholeText();
        boolean boolean54 = textNode46.hasAttr("hi!");
        org.jsoup.nodes.Document document55 = textNode46.ownerDocument();
        org.jsoup.nodes.TextNode textNode57 = textNode46.splitText((int) (short) 1);
        try {
            node25.replaceWith((org.jsoup.nodes.Node) textNode57);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(textNode46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "i!" + "'", str47.equals("i!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "i!" + "'", str52.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(document55);
        org.junit.Assert.assertNotNull(textNode57);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean4 = textNode2.hasAttr("h");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.childNodes();
        java.lang.String str19 = textNode13.outerHtml();
        org.jsoup.nodes.Node node20 = textNode13.parent();
        org.jsoup.nodes.Document document21 = textNode13.ownerDocument();
        org.jsoup.nodes.Node node22 = textNode13.previousSibling();
        textNode13.setBaseUri("i!");
        java.lang.String str26 = textNode13.attr("#text");
        boolean boolean27 = node10.equals((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str18 = textNode17.getWholeText();
        java.lang.String str19 = textNode17.text();
        java.lang.String str20 = textNode17.nodeName();
        org.jsoup.nodes.Node node21 = textNode17.clone();
        boolean boolean22 = textNode14.equals((java.lang.Object) textNode17);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        org.jsoup.nodes.Node node28 = textNode20.clone();
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        org.jsoup.nodes.Node node23 = node22.clone();
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
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        try {
            org.jsoup.nodes.Node node21 = document20.parent();
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        boolean boolean18 = textNode2.hasAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.absUrl("#text");
        int int10 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        org.jsoup.nodes.Document document29 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        int int22 = textNode2.childNodeSize();
        java.lang.String str23 = textNode2.baseUri();
        org.jsoup.nodes.Node node24 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str11 = textNode2.absUrl("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        java.lang.String str14 = textNode12.absUrl("#text");
        java.lang.String str16 = textNode12.attr("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str11 = textNode6.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode6.siblingNodes();
        boolean boolean13 = textNode2.equals((java.lang.Object) nodeList12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node16 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "h");
        org.jsoup.nodes.Node node11 = node10.clone();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = node10.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        boolean boolean8 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
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
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node18 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        boolean boolean26 = textNode20.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode28 = textNode20.text("hi!");
        try {
            org.jsoup.nodes.Node node29 = textNode20.unwrap();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode28);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode14.removeAttr("#text");
        java.lang.String str19 = textNode14.getWholeText();
        java.lang.String str20 = textNode14.baseUri();
        java.lang.String str21 = textNode14.baseUri();
        java.lang.String str22 = textNode14.getWholeText();
        org.jsoup.nodes.Node node24 = textNode14.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node25 = textNode2.after(node24);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        try {
            org.jsoup.nodes.Node node14 = node12.traverse(nodeVisitor13);
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node19 = textNode13.attr("hi!", "#text");
        java.lang.String str20 = textNode13.baseUri();
        boolean boolean21 = node10.equals((java.lang.Object) textNode13);
        int int22 = node10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node10.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        org.jsoup.nodes.Node node13 = textNode12.parent();
        org.jsoup.nodes.Node node14 = textNode12.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.String str14 = textNode2.absUrl("hi!");
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
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i!");
        boolean boolean9 = textNode7.hasAttr("h");
        java.lang.String str10 = textNode7.outerHtml();
        java.lang.String str12 = textNode7.attr("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "i!" + "'", str10.equals("i!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        org.jsoup.nodes.Node node19 = textNode2.attr("#text", "#text");
        try {
            org.jsoup.nodes.Node node20 = textNode2.unwrap();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean18 = textNode16.hasAttr("h");
        org.jsoup.nodes.Node node19 = textNode16.clone();
        java.lang.String str21 = textNode16.absUrl("i!");
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        org.jsoup.nodes.Node node24 = textNode2.attr("i!", "");
        try {
            org.jsoup.nodes.Node node26 = textNode2.after("hi!");
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str14 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        textNode2.setBaseUri("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        int int12 = textNode2.childNodeSize();
        int int13 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        java.lang.String str16 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str10 = textNode2.attr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("hi!");
        int int15 = textNode14.siblingIndex();
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.siblingNodes();
        java.lang.Class<?> wildcardClass19 = textNode17.getClass();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str12 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        textNode2.setBaseUri("h");
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        java.lang.String str32 = textNode2.text();
        java.lang.String str33 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        try {
            org.jsoup.nodes.Node node12 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str11 = textNode2.attr("");
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("#text");
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
        org.junit.Assert.assertNotNull(textNode17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.lang.String str17 = textNode12.text();
        org.jsoup.nodes.Attributes attributes18 = textNode12.attributes();
        java.lang.String str19 = textNode12.text();
        java.lang.String str21 = textNode12.attr("#text");
        org.jsoup.nodes.TextNode textNode23 = textNode12.text("#text");
        java.lang.String str24 = textNode23.text();
        java.lang.String str25 = textNode23.getWholeText();
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode23);
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode31 = textNode29.text("hi!");
        java.lang.String str32 = textNode29.outerHtml();
        org.jsoup.nodes.Node node33 = textNode29.nextSibling();
        boolean boolean34 = textNode2.equals((java.lang.Object) node33);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean14 = textNode12.hasAttr("hi!");
        java.lang.String str16 = textNode12.attr("#text");
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode12);
        try {
            org.jsoup.nodes.TextNode textNode19 = textNode2.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node12 = textNode2.attr("h", "");
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
        boolean boolean27 = textNode15.hasAttr("hi!");
        org.jsoup.nodes.Node node28 = textNode15.parent();
        try {
            org.jsoup.nodes.Node node29 = textNode2.before((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
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
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "h");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = textNode11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        org.jsoup.nodes.Node node19 = textNode2.attr("i!", "h");
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        java.lang.String str23 = textNode22.toString();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.childNodesCopy();
        int int28 = textNode26.siblingIndex();
        java.lang.String str29 = textNode26.nodeName();
        java.lang.String str30 = textNode26.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode26.childNodes();
        org.jsoup.nodes.TextNode textNode33 = textNode26.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode26.childNodesCopy();
        java.lang.String str35 = textNode26.nodeName();
        boolean boolean36 = textNode26.isBlank();
        boolean boolean37 = textNode22.equals((java.lang.Object) textNode26);
        try {
            org.jsoup.nodes.Node node38 = textNode2.before((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "i!" + "'", str23.equals("i!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "#text" + "'", str35.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("hi!");
        java.lang.String str11 = textNode8.outerHtml();
        org.jsoup.nodes.Node node14 = textNode8.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes15 = textNode8.attributes();
        org.jsoup.nodes.Node node16 = textNode8.parent();
        java.lang.String str18 = textNode8.absUrl("#text");
        java.lang.String str19 = textNode8.toString();
        textNode8.setBaseUri("");
        org.jsoup.nodes.TextNode textNode23 = textNode8.text("");
        try {
            node5.replaceWith((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode23);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode6.toString();
        org.jsoup.nodes.Attributes attributes14 = textNode6.attributes();
        org.jsoup.nodes.Node node15 = textNode6.clone();
        java.lang.String str17 = textNode6.attr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "#text");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.nodeName();
        java.lang.String str13 = textNode9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("#text");
        boolean boolean18 = textNode16.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode16.childNodesCopy();
        java.lang.String str21 = textNode16.attr("h");
        org.jsoup.nodes.Node node23 = textNode16.removeAttr("h");
        boolean boolean25 = textNode16.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode16.childNodes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.String str27 = textNode20.attr("");
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodesCopy();
        try {
            node16.remove();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode14.childNodesCopy();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean26 = textNode14.equals((java.lang.Object) textNode25);
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        int int31 = textNode29.siblingIndex();
        org.jsoup.nodes.Node node33 = textNode29.removeAttr("#text");
        java.lang.String str34 = textNode29.getWholeText();
        java.lang.String str35 = textNode29.baseUri();
        boolean boolean36 = textNode25.equals((java.lang.Object) textNode29);
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode39.childNodesCopy();
        int int41 = textNode39.siblingIndex();
        org.jsoup.nodes.Node node42 = textNode39.previousSibling();
        java.lang.String str43 = textNode39.nodeName();
        org.jsoup.nodes.Node node44 = textNode39.clone();
        org.jsoup.nodes.Document document45 = node44.ownerDocument();
        boolean boolean46 = textNode25.equals((java.lang.Object) node44);
        org.jsoup.nodes.TextNode textNode49 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = textNode49.childNodesCopy();
        int int51 = textNode49.siblingIndex();
        java.lang.String str52 = textNode49.nodeName();
        java.lang.String str53 = textNode49.toString();
        java.lang.String str54 = textNode49.text();
        int int55 = textNode49.siblingIndex();
        org.jsoup.nodes.TextNode textNode58 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList59 = textNode58.childNodesCopy();
        int int60 = textNode58.siblingIndex();
        java.lang.String str61 = textNode58.nodeName();
        java.lang.String str62 = textNode58.toString();
        int int63 = textNode58.siblingIndex();
        boolean boolean64 = textNode49.equals((java.lang.Object) int63);
        org.jsoup.nodes.TextNode textNode66 = textNode49.text("");
        org.jsoup.nodes.Node node68 = textNode49.removeAttr("hi!");
        boolean boolean69 = textNode25.equals((java.lang.Object) node68);
        java.lang.String str71 = textNode25.attr("h");
        java.lang.String str72 = textNode25.outerHtml();
        org.jsoup.nodes.Node node73 = textNode25.nextSibling();
        boolean boolean74 = textNode25.isBlank();
        try {
            org.jsoup.nodes.Node node75 = textNode2.before((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "#text" + "'", str43.equals("#text"));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "#text" + "'", str52.equals("#text"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "#text" + "'", str61.equals("#text"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(textNode66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        org.jsoup.nodes.Document document20 = textNode19.ownerDocument();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean25 = textNode23.hasAttr("hi!");
        boolean boolean26 = textNode19.equals((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode19.childNodesCopy();
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str16 = textNode11.attr("");
        java.lang.String str17 = textNode11.text();
        org.jsoup.nodes.Node node19 = textNode11.removeAttr("hi!");
        org.jsoup.nodes.Node node20 = textNode11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode11.childNodesCopy();
        org.jsoup.nodes.TextNode textNode23 = textNode11.splitText((int) (byte) 0);
        org.jsoup.nodes.TextNode textNode25 = textNode11.text("h");
        org.jsoup.nodes.Document document26 = textNode11.ownerDocument();
        try {
            org.jsoup.nodes.Node node27 = textNode2.before((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        java.lang.String str12 = textNode2.attr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("h");
        java.lang.Class<?> wildcardClass10 = textNode9.getClass();
        org.jsoup.nodes.Node node12 = textNode9.removeAttr("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("h");
        java.lang.String str7 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str7 = textNode2.absUrl("h");
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = node9.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        try {
            org.jsoup.nodes.Node node23 = textNode2.before("h");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        java.lang.String str21 = textNode18.nodeName();
        java.lang.String str23 = textNode18.attr("");
        org.jsoup.nodes.Node node24 = textNode18.previousSibling();
        org.jsoup.nodes.Node node25 = textNode18.previousSibling();
        org.jsoup.nodes.Document document26 = textNode18.ownerDocument();
        org.jsoup.nodes.Node node27 = textNode18.previousSibling();
        try {
            org.jsoup.nodes.Node node28 = textNode2.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.absUrl("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        boolean boolean7 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean13 = textNode2.hasAttr("#text");
        int int14 = textNode2.siblingIndex();
        java.lang.Class<?> wildcardClass15 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node17 = textNode2.after("i!");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        boolean boolean15 = textNode2.hasAttr("");
        java.lang.String str17 = textNode2.absUrl("i!");
        boolean boolean19 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node20 = textNode2.parent();
        try {
            java.lang.String str21 = node20.baseUri();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        java.lang.String str31 = textNode17.nodeName();
        org.jsoup.nodes.TextNode textNode33 = textNode17.text("#text");
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(textNode33);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        org.jsoup.nodes.Attributes attributes22 = textNode12.attributes();
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
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        java.lang.String str24 = textNode2.attr("h");
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode12.previousSibling();
        java.lang.String str16 = textNode12.nodeName();
        org.jsoup.nodes.Node node17 = textNode12.clone();
        int int18 = textNode12.siblingIndex();
        org.jsoup.nodes.TextNode textNode20 = textNode12.text("h");
        org.jsoup.nodes.TextNode textNode22 = textNode12.text("i!");
        java.lang.String str23 = textNode22.text();
        boolean boolean24 = textNode2.equals((java.lang.Object) str23);
        org.jsoup.nodes.Node node27 = textNode2.attr("h", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node27.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "i!" + "'", str23.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        int int11 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        int int11 = node10.siblingIndex();
        int int12 = node10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node10.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean14 = textNode2.hasAttr("hi!");
        java.lang.String str15 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node17 = textNode2.after("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i!");
        org.jsoup.nodes.Document document8 = textNode7.ownerDocument();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode9.childNodesCopy();
        java.lang.String str13 = textNode9.absUrl("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.lang.Class<?> wildcardClass35 = node33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        int int13 = textNode2.childNodeSize();
        boolean boolean14 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        try {
            int int15 = node14.siblingIndex();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
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
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node15 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        org.jsoup.nodes.TextNode textNode28 = textNode2.text("hi!");
        org.jsoup.nodes.Node node31 = textNode2.attr("i!", "hi!");
        try {
            org.jsoup.nodes.Node node32 = node31.unwrap();
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
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("#text");
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean20 = textNode19.isBlank();
        boolean boolean22 = textNode19.hasAttr("hi!");
        int int23 = textNode19.childNodeSize();
        org.jsoup.nodes.TextNode textNode25 = textNode19.splitText((int) (short) 0);
        textNode19.setBaseUri("#text");
        try {
            org.jsoup.nodes.Node node28 = textNode2.before((org.jsoup.nodes.Node) textNode19);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNode25);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        org.jsoup.nodes.Node node20 = textNode17.clone();
        java.lang.String str21 = textNode17.outerHtml();
        org.jsoup.nodes.Node node24 = textNode17.attr("h", "h");
        org.jsoup.nodes.Node node25 = textNode17.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode17.siblingNodes();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        java.lang.String str13 = textNode12.baseUri();
        java.lang.String str14 = textNode12.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        org.jsoup.nodes.Node node60 = textNode13.clone();
        try {
            textNode13.remove();
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
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.outerHtml();
        boolean boolean10 = textNode2.hasAttr("i!");
        java.lang.String str12 = textNode2.absUrl("h");
        java.lang.String str13 = textNode2.outerHtml();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        org.jsoup.nodes.TextNode textNode64 = textNode13.text("i!");
        org.jsoup.nodes.Attributes attributes65 = textNode64.attributes();
        try {
            textNode64.remove();
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
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(textNode64);
        org.junit.Assert.assertNotNull(attributes65);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        textNode11.setBaseUri("");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean17 = textNode16.isBlank();
        java.lang.String str18 = textNode16.toString();
        java.lang.String str19 = textNode16.baseUri();
        java.lang.String str21 = textNode16.attr("hi!");
        int int22 = textNode16.siblingIndex();
        try {
            org.jsoup.nodes.Node node23 = textNode11.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        boolean boolean17 = textNode9.isBlank();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        java.lang.String str14 = textNode2.baseUri();
        java.lang.String str15 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node10 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.nodeName();
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        org.jsoup.nodes.Document document20 = textNode19.ownerDocument();
        org.jsoup.nodes.TextNode textNode22 = textNode19.text("hi!");
        java.lang.String str23 = textNode22.nodeName();
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.getWholeText();
        int int5 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean7 = textNode5.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        int int10 = textNode8.siblingIndex();
        java.lang.String str11 = textNode8.nodeName();
        java.lang.String str12 = textNode8.toString();
        java.lang.String str13 = textNode8.text();
        org.jsoup.nodes.Attributes attributes14 = textNode8.attributes();
        java.lang.String str15 = textNode8.text();
        boolean boolean17 = textNode8.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode8.childNodes();
        java.lang.String str19 = textNode8.nodeName();
        org.jsoup.nodes.Node node20 = textNode8.clone();
        try {
            org.jsoup.nodes.Node node21 = textNode2.before((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.lang.String str16 = textNode2.attr("");
        java.lang.String str17 = textNode2.toString();
        org.jsoup.nodes.Node node18 = textNode2.previousSibling();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        boolean boolean18 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node20 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        java.lang.String str6 = textNode2.nodeName();
        int int7 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.attr("h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        java.lang.String str23 = textNode20.attr("h");
        org.jsoup.nodes.Node node25 = textNode20.removeAttr("h");
        java.lang.String str26 = textNode20.getWholeText();
        boolean boolean28 = textNode20.hasAttr("hi!");
        org.jsoup.nodes.Document document29 = textNode20.ownerDocument();
        org.jsoup.nodes.TextNode textNode31 = textNode20.splitText((int) (short) 1);
        java.lang.String str32 = textNode31.nodeName();
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
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "i!" + "'", str26.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = node9.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        org.jsoup.nodes.Node node13 = textNode12.parent();
        org.jsoup.nodes.Attributes attributes14 = textNode12.attributes();
        try {
            org.jsoup.nodes.Node node16 = textNode12.after("h");
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
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.text();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.Object obj6 = null;
        boolean boolean7 = textNode2.equals(obj6);
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("h");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.String str9 = textNode5.outerHtml();
        int int10 = textNode5.childNodeSize();
        java.lang.String str12 = textNode5.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "i!" + "'", str9.equals("i!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.attr("h");
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        boolean boolean7 = textNode2.hasAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        org.jsoup.nodes.Attributes attributes21 = textNode20.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode20.childNodesCopy();
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
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.siblingNodes();
        org.jsoup.nodes.TextNode textNode23 = textNode20.splitText(0);
        boolean boolean24 = textNode20.isBlank();
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        org.jsoup.nodes.Node node21 = textNode2.parent();
        java.lang.String str23 = textNode2.absUrl("#text");
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.Node node8 = textNode6.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int12 = textNode11.siblingIndex();
        org.jsoup.nodes.Document document13 = textNode11.ownerDocument();
        textNode11.setBaseUri("#text");
        boolean boolean17 = textNode11.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.Document document18 = textNode11.ownerDocument();
        try {
            node8.replaceWith((org.jsoup.nodes.Node) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        int int23 = textNode2.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean5 = textNode2.hasAttr("h");
        boolean boolean7 = textNode2.hasAttr("");
        try {
            org.jsoup.nodes.Node node9 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        try {
            org.jsoup.nodes.Node node16 = textNode2.unwrap();
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("");
        java.lang.String str12 = textNode10.attr("");
        java.lang.String str13 = textNode10.nodeName();
        boolean boolean14 = textNode10.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        boolean boolean9 = textNode7.hasAttr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        java.lang.String str9 = textNode2.attr("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.text();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "h");
        int int9 = node8.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.attr("#text");
        textNode2.setBaseUri("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        textNode10.setBaseUri("hi!");
        try {
            org.jsoup.nodes.Node node24 = textNode10.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.attr("");
        boolean boolean14 = textNode2.hasAttr("i!");
        java.lang.String str15 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        java.lang.String str31 = textNode6.getWholeText();
        java.lang.String str32 = textNode6.text();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "i!" + "'", str31.equals("i!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "i!" + "'", str32.equals("i!"));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass20 = nodeList19.getClass();
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.outerHtml();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode27 = textNode25.text("hi!");
        java.lang.String str28 = textNode25.outerHtml();
        org.jsoup.nodes.Node node31 = textNode25.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes32 = textNode25.attributes();
        org.jsoup.nodes.Document document33 = textNode25.ownerDocument();
        java.lang.String str35 = textNode25.attr("");
        java.lang.String str36 = textNode25.baseUri();
        try {
            org.jsoup.nodes.Node node37 = textNode2.after((org.jsoup.nodes.Node) textNode25);
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
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(1);
        java.lang.String str13 = textNode12.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        java.lang.String str35 = textNode2.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        java.lang.Class<?> wildcardClass25 = textNode17.getClass();
        java.lang.String str26 = textNode17.baseUri();
        java.lang.String str27 = textNode17.toString();
        int int28 = textNode17.childNodeSize();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean4 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node10 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "i!" + "'", str6.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        java.lang.Class<?> wildcardClass13 = node11.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        java.lang.String str16 = textNode2.text();
        java.lang.String str17 = textNode2.toString();
        java.lang.String str19 = textNode2.absUrl("hi!");
        java.lang.String str21 = textNode2.absUrl("#text");
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
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        try {
            org.jsoup.nodes.Node node14 = document12.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        int int13 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        int int21 = textNode16.siblingIndex();
        org.jsoup.nodes.Attributes attributes22 = textNode16.attributes();
        org.jsoup.nodes.Node node23 = textNode16.parent();
        org.jsoup.nodes.Node node25 = textNode16.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode27 = textNode16.text("");
        java.lang.String str28 = textNode16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode16.childNodesCopy();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode16);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        java.lang.String str20 = textNode18.baseUri();
        textNode18.setBaseUri("hi!");
        java.lang.String str24 = textNode18.attr("hi!");
        try {
            org.jsoup.nodes.Node node25 = textNode2.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.baseUri();
        boolean boolean17 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        java.lang.String str23 = textNode20.nodeName();
        java.lang.String str24 = textNode20.toString();
        java.lang.String str25 = textNode20.text();
        int int26 = textNode20.siblingIndex();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        int int31 = textNode29.siblingIndex();
        java.lang.String str32 = textNode29.nodeName();
        java.lang.String str33 = textNode29.toString();
        int int34 = textNode29.siblingIndex();
        boolean boolean35 = textNode20.equals((java.lang.Object) int34);
        org.jsoup.nodes.Attributes attributes36 = textNode20.attributes();
        textNode20.setBaseUri("hi!");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode8.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        boolean boolean13 = textNode2.equals((java.lang.Object) node11);
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "h");
        java.lang.String str17 = textNode2.text();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node23 = textNode22.nextSibling();
        java.lang.String str24 = textNode22.nodeName();
        org.jsoup.nodes.TextNode textNode26 = textNode22.text("hi!");
        org.jsoup.nodes.Node node28 = textNode26.removeAttr("h");
        try {
            org.jsoup.nodes.Node node29 = textNode2.before(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean12 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node11 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        boolean boolean15 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Node node19 = textNode2.attr("i!", "i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode7.previousSibling();
        java.lang.String str11 = textNode7.nodeName();
        org.jsoup.nodes.Node node12 = textNode7.clone();
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        boolean boolean14 = textNode4.equals((java.lang.Object) document13);
        try {
            java.lang.Class<?> wildcardClass15 = document13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "i!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        int int17 = textNode12.childNodeSize();
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode22 = textNode20.text("hi!");
        java.lang.String str23 = textNode20.outerHtml();
        org.jsoup.nodes.Node node26 = textNode20.attr("hi!", "#text");
        org.jsoup.nodes.Node node27 = textNode20.clone();
        boolean boolean28 = textNode12.equals((java.lang.Object) textNode20);
        org.jsoup.nodes.TextNode textNode30 = textNode12.splitText((int) (short) 1);
        org.jsoup.nodes.Document document31 = textNode30.ownerDocument();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNull(document31);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        org.jsoup.nodes.Node node24 = node23.nextSibling();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        java.lang.String str30 = textNode27.nodeName();
        java.lang.String str31 = textNode27.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode27.childNodes();
        org.jsoup.nodes.TextNode textNode34 = textNode27.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode27.childNodesCopy();
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean39 = textNode27.equals((java.lang.Object) textNode38);
        java.lang.String str40 = textNode27.baseUri();
        org.jsoup.nodes.Node node41 = textNode27.parent();
        org.jsoup.nodes.Node node44 = textNode27.attr("hi!", "");
        java.lang.String str46 = textNode27.attr("h");
        org.jsoup.nodes.Node node48 = textNode27.removeAttr("h");
        boolean boolean50 = textNode27.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode52 = textNode27.text("h");
        int int53 = textNode52.childNodeSize();
        try {
            org.jsoup.nodes.Node node54 = node24.before((org.jsoup.nodes.Node) textNode52);
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(textNode52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        try {
            org.jsoup.nodes.Node node13 = document12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node14 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        java.lang.String str7 = textNode2.outerHtml();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node18 = textNode17.nextSibling();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        int int23 = textNode21.siblingIndex();
        java.lang.String str24 = textNode21.nodeName();
        java.lang.String str25 = textNode21.toString();
        int int26 = textNode21.childNodeSize();
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode31 = textNode29.text("hi!");
        java.lang.String str32 = textNode29.outerHtml();
        org.jsoup.nodes.Node node35 = textNode29.attr("hi!", "#text");
        org.jsoup.nodes.Node node36 = textNode29.clone();
        boolean boolean37 = textNode21.equals((java.lang.Object) textNode29);
        org.jsoup.nodes.TextNode textNode39 = textNode21.text("");
        org.jsoup.nodes.TextNode textNode41 = textNode21.text("h");
        org.jsoup.nodes.TextNode textNode43 = textNode21.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode21.childNodes();
        boolean boolean45 = textNode17.equals((java.lang.Object) textNode21);
        org.jsoup.nodes.Attributes attributes46 = textNode17.attributes();
        org.jsoup.nodes.Node node47 = textNode17.previousSibling();
        try {
            textNode2.replaceWith(node47);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertNotNull(textNode41);
        org.junit.Assert.assertNotNull(textNode43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        try {
            org.jsoup.nodes.Node node17 = textNode11.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node21 = node20.nextSibling();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        textNode12.setBaseUri("i!");
        org.jsoup.nodes.Node node15 = textNode12.clone();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "");
        try {
            org.jsoup.nodes.Node node15 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node14 = node12.previousSibling();
        try {
            int int15 = node14.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node19 = textNode13.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes20 = textNode13.attributes();
        org.jsoup.nodes.Node node21 = textNode13.parent();
        java.lang.String str23 = textNode13.absUrl("#text");
        java.lang.String str24 = textNode13.toString();
        textNode13.setBaseUri("");
        org.jsoup.nodes.Node node27 = textNode13.clone();
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean4 = textNode2.hasAttr("h");
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        try {
            org.jsoup.nodes.Node node3 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        java.lang.String str23 = textNode19.absUrl("h");
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
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str15 = textNode13.attr("#text");
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        org.jsoup.nodes.Attributes attributes20 = textNode18.attributes();
        java.lang.String str21 = textNode18.toString();
        boolean boolean22 = textNode13.equals((java.lang.Object) str21);
        java.lang.String str24 = textNode13.absUrl("hi!");
        java.lang.Class<?> wildcardClass25 = textNode13.getClass();
        int int26 = textNode13.childNodeSize();
        boolean boolean27 = textNode2.equals((java.lang.Object) int26);
        org.jsoup.nodes.TextNode textNode29 = textNode2.text("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(textNode29);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        java.lang.String str22 = textNode2.nodeName();
        org.jsoup.nodes.Node node25 = textNode2.attr("h", "hi!");
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.Node node7 = textNode6.previousSibling();
        java.lang.String str8 = textNode6.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i!" + "'", str8.equals("i!"));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node15 = node14.parent();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean9 = textNode7.hasAttr("i!");
        int int10 = textNode7.siblingIndex();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean13 = textNode2.hasAttr("#text");
        java.lang.String str15 = textNode2.attr("#text");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node14 = node12.previousSibling();
        try {
            org.jsoup.nodes.Node node16 = node12.before("");
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "h");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        org.jsoup.nodes.Node node16 = textNode10.previousSibling();
        org.jsoup.nodes.TextNode textNode18 = textNode10.text("hi!");
        org.jsoup.nodes.Attributes attributes19 = textNode10.attributes();
        java.lang.String str20 = textNode10.toString();
        org.jsoup.nodes.Node node21 = textNode10.clone();
        org.jsoup.nodes.Node node22 = node21.clone();
        boolean boolean23 = textNode2.equals((java.lang.Object) node22);
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        try {
            org.jsoup.nodes.Node node25 = textNode2.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        java.lang.String str15 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str19 = textNode18.baseUri();
        java.lang.String str20 = textNode18.baseUri();
        boolean boolean21 = textNode13.equals((java.lang.Object) textNode18);
        java.lang.String str23 = textNode18.absUrl("i!");
        java.lang.String str24 = textNode18.getWholeText();
        java.lang.String str25 = textNode18.baseUri();
        boolean boolean26 = textNode2.equals((java.lang.Object) str25);
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        java.lang.String str31 = textNode29.text();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode29.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode29.childNodes();
        boolean boolean34 = textNode29.isBlank();
        java.lang.String str35 = textNode29.outerHtml();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        boolean boolean7 = textNode2.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        org.jsoup.nodes.Node node32 = node31.nextSibling();
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "h");
        java.lang.String str3 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        boolean boolean17 = textNode2.hasAttr("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.Node node13 = textNode2.wrap("");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        boolean boolean13 = textNode9.hasAttr("#text");
        org.jsoup.nodes.Node node14 = textNode9.parent();
        java.lang.String str15 = textNode9.text();
        org.jsoup.nodes.Node node16 = textNode9.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        org.jsoup.nodes.Node node12 = textNode11.clone();
        int int13 = node12.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        java.lang.String str8 = textNode2.text();
        try {
            java.lang.String str10 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node14 = textNode13.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode6.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        org.jsoup.nodes.Node node31 = textNode17.nextSibling();
        java.lang.String str33 = textNode17.attr("hi!");
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
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "i!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        boolean boolean11 = textNode2.hasAttr("h");
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        try {
            org.jsoup.nodes.Document document5 = node4.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean4 = textNode2.hasAttr("h");
        int int5 = textNode2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.siblingIndex();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        boolean boolean13 = textNode9.hasAttr("#text");
        org.jsoup.nodes.Node node14 = textNode9.parent();
        boolean boolean15 = textNode9.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        boolean boolean15 = textNode2.hasAttr("");
        java.lang.Class<?> wildcardClass16 = textNode2.getClass();
        java.lang.String str17 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        java.lang.String str21 = textNode2.text();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Attributes attributes25 = textNode24.attributes();
        org.jsoup.nodes.Node node26 = textNode24.clone();
        try {
            textNode2.replaceWith(node26);
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "h" + "'", str21.equals("h"));
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        java.lang.String str14 = textNode10.nodeName();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        boolean boolean17 = textNode2.equals((java.lang.Object) document16);
        try {
            document16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        boolean boolean6 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.toString();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        node8.setBaseUri("i!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        java.lang.String str24 = textNode20.getWholeText();
        java.lang.String str25 = textNode20.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode20.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "i!" + "'", str24.equals("i!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "i!" + "'", str25.equals("i!"));
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = node6.nextSibling();
        try {
            org.jsoup.nodes.Node node8 = node7.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodesCopy();
        org.jsoup.nodes.Node node7 = node4.clone();
        int int8 = node7.childNodeSize();
        int int9 = node7.siblingIndex();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        java.lang.String str14 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node15 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        int int19 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean23 = textNode22.isBlank();
        java.lang.Class<?> wildcardClass24 = textNode22.getClass();
        org.jsoup.nodes.Node node25 = textNode22.parent();
        java.lang.String str26 = textNode22.toString();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode22);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode6.removeAttr("#text");
        java.lang.String str11 = textNode6.getWholeText();
        java.lang.String str12 = textNode6.baseUri();
        boolean boolean14 = textNode6.hasAttr("hi!");
        int int15 = textNode6.siblingIndex();
        java.lang.String str17 = textNode6.absUrl("h");
        java.lang.Class<?> wildcardClass18 = textNode6.getClass();
        boolean boolean19 = textNode2.equals((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodesCopy();
        try {
            org.jsoup.nodes.Node node11 = textNode4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.attr("");
        int int12 = textNode2.siblingIndex();
        java.lang.String str14 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        try {
            org.jsoup.nodes.Node node19 = textNode16.attr("", "i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        java.lang.String str22 = textNode2.baseUri();
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
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        org.jsoup.nodes.Attributes attributes15 = textNode14.attributes();
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
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        int int6 = textNode2.siblingIndex();
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        org.jsoup.nodes.TextNode textNode20 = textNode12.text("#text");
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
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        java.lang.String str16 = textNode2.attr("");
        java.lang.String str17 = textNode2.toString();
        java.lang.String str18 = textNode2.nodeName();
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) ' ');
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        java.lang.String str18 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        int int23 = textNode21.siblingIndex();
        java.lang.String str24 = textNode21.nodeName();
        java.lang.String str25 = textNode21.toString();
        java.lang.String str26 = textNode21.text();
        boolean boolean27 = textNode21.isBlank();
        boolean boolean28 = textNode2.equals((java.lang.Object) boolean27);
        try {
            org.jsoup.nodes.Node node30 = textNode2.before("hi!");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode10.nodeName();
        java.lang.String str12 = textNode10.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str19 = textNode14.attr("");
        java.lang.String str20 = textNode14.text();
        org.jsoup.nodes.Node node22 = textNode14.removeAttr("hi!");
        java.lang.String str23 = textNode14.nodeName();
        try {
            org.jsoup.nodes.Node node24 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        try {
            org.jsoup.nodes.Node node15 = textNode11.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        int int10 = textNode8.siblingIndex();
        java.lang.String str11 = textNode8.nodeName();
        java.lang.String str13 = textNode8.attr("");
        java.lang.String str14 = textNode8.text();
        org.jsoup.nodes.Node node16 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = textNode8.attributes();
        org.jsoup.nodes.Node node19 = textNode8.removeAttr("i!");
        org.jsoup.nodes.Node node20 = node19.clone();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean24 = textNode23.isBlank();
        org.jsoup.nodes.Attributes attributes25 = textNode23.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode23.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode23.childNodes();
        boolean boolean28 = node20.equals((java.lang.Object) textNode23);
        try {
            org.jsoup.nodes.Node node29 = node5.before((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("h");
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode23.childNodesCopy();
        java.lang.String str25 = textNode23.text();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode23.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode23.siblingNodes();
        java.lang.String str29 = textNode23.attr("#text");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode23);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        int int26 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode28 = textNode2.text("");
        java.lang.String str30 = textNode28.attr("hi!");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str11 = textNode2.absUrl("hi!");
        java.lang.String str12 = textNode2.text();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("#text");
        textNode2.setBaseUri("");
        textNode2.setBaseUri("");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        java.lang.String str24 = textNode2.toString();
        java.lang.Class<?> wildcardClass25 = textNode2.getClass();
        java.lang.String str26 = textNode2.nodeName();
        java.lang.String str28 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node29 = textNode2.parent();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "h" + "'", str24.equals("h"));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "#text" + "'", str26.equals("#text"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean13 = textNode12.isBlank();
        try {
            org.jsoup.nodes.Node node14 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        int int6 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        boolean boolean15 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        textNode2.setBaseUri("i!");
        java.lang.String str19 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        try {
            org.jsoup.nodes.Node node17 = textNode13.traverse(nodeVisitor16);
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
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        java.lang.String str24 = textNode20.getWholeText();
        java.lang.String str25 = textNode20.getWholeText();
        java.lang.String str26 = textNode20.text();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode20.siblingNodes();
        java.lang.String str29 = textNode20.attr("h");
        try {
            textNode20.remove();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "i!" + "'", str24.equals("i!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "i!" + "'", str25.equals("i!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "i!" + "'", str26.equals("i!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.text();
        boolean boolean12 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        int int19 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.attr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.Class<?> wildcardClass7 = attributes6.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        try {
            org.jsoup.nodes.Node node6 = textNode2.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        textNode13.setBaseUri("");
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
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "");
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
            org.jsoup.nodes.Node node28 = textNode26.before("hi!");
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
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        java.lang.String str11 = node10.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        org.jsoup.nodes.Node node14 = textNode2.clone();
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        try {
            org.jsoup.nodes.Node node17 = node14.traverse(nodeVisitor16);
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "h");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str15 = textNode2.absUrl("hi!");
        java.lang.String str16 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean4 = textNode2.hasAttr("h");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        try {
            org.jsoup.nodes.Node node12 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "hi!");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean14 = textNode12.hasAttr("h");
        org.jsoup.nodes.Node node15 = textNode12.previousSibling();
        java.lang.String str16 = textNode12.text();
        try {
            org.jsoup.nodes.Node node17 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "i!" + "'", str16.equals("i!"));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.text();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode9.nodeName();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        org.jsoup.nodes.Node node12 = textNode9.parent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node6 = textNode5.nextSibling();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node11 = textNode9.removeAttr("hi!");
        java.lang.String str12 = textNode9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.childNodesCopy();
        java.lang.String str14 = textNode9.getWholeText();
        int int15 = textNode9.siblingIndex();
        try {
            org.jsoup.nodes.Node node16 = textNode5.before((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        java.lang.Class<?> wildcardClass16 = textNode2.getClass();
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
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.baseUri();
        java.lang.String str17 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node18 = textNode2.previousSibling();
        int int19 = textNode2.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        boolean boolean15 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        textNode2.setBaseUri("i!");
        boolean boolean19 = textNode2.isBlank();
        java.lang.String str21 = textNode2.attr("hi!");
        try {
            org.jsoup.nodes.Node node23 = textNode2.before("");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        try {
            java.lang.String str13 = node12.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("#text");
        java.lang.String str21 = textNode20.text();
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
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node9 = node7.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node10 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        org.jsoup.nodes.Node node28 = textNode25.previousSibling();
        java.lang.String str29 = textNode25.nodeName();
        org.jsoup.nodes.Attributes attributes30 = textNode25.attributes();
        try {
            org.jsoup.nodes.Node node31 = textNode2.before((org.jsoup.nodes.Node) textNode25);
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
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        int int9 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.absUrl("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("hi!");
        org.jsoup.nodes.Node node18 = textNode17.clone();
        try {
            org.jsoup.nodes.Node node20 = textNode17.before("#text");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        org.jsoup.nodes.Node node24 = textNode2.attr("i!", "");
        try {
            node24.remove();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        org.jsoup.nodes.TextNode textNode27 = textNode2.text("");
        org.jsoup.nodes.Node node28 = textNode2.previousSibling();
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
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        java.lang.String str11 = textNode10.baseUri();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        try {
            org.jsoup.nodes.Node node14 = textNode10.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        boolean boolean15 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node18 = textNode2.attr("#text", "h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        int int6 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        try {
            java.lang.String str11 = document10.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        int int15 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        java.lang.String str18 = textNode2.absUrl("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        org.jsoup.nodes.Node node8 = textNode4.removeAttr("i!");
        org.jsoup.nodes.Node node10 = textNode4.removeAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        java.lang.String str16 = textNode10.text();
        org.jsoup.nodes.Node node18 = textNode10.removeAttr("hi!");
        int int19 = node18.siblingIndex();
        int int20 = node18.siblingIndex();
        int int21 = node18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node18.childNodes();
        boolean boolean23 = textNode2.equals((java.lang.Object) nodeList22);
        java.lang.String str25 = textNode2.attr("h");
        org.jsoup.nodes.Attributes attributes26 = textNode2.attributes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        boolean boolean12 = textNode2.hasAttr("#text");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        boolean boolean8 = textNode6.isBlank();
        try {
            org.jsoup.nodes.Node node10 = textNode6.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        org.jsoup.nodes.Document document20 = textNode19.ownerDocument();
        org.jsoup.nodes.TextNode textNode22 = textNode19.text("hi!");
        org.jsoup.nodes.Node node23 = textNode19.clone();
        textNode19.setBaseUri("i!");
        java.lang.String str26 = textNode19.toString();
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str11 = textNode9.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode14.childNodesCopy();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean26 = textNode14.equals((java.lang.Object) textNode25);
        org.jsoup.nodes.Node node27 = textNode14.parent();
        java.lang.String str28 = textNode14.toString();
        org.jsoup.nodes.Node node29 = textNode14.previousSibling();
        java.lang.String str30 = textNode14.nodeName();
        boolean boolean32 = textNode14.hasAttr("");
        org.jsoup.nodes.Node node33 = textNode14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode14.childNodes();
        org.jsoup.nodes.Attributes attributes35 = textNode14.attributes();
        org.jsoup.nodes.Attributes attributes36 = textNode14.attributes();
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode39.childNodesCopy();
        int int41 = textNode39.siblingIndex();
        java.lang.String str42 = textNode39.nodeName();
        java.lang.String str43 = textNode39.toString();
        int int44 = textNode39.siblingIndex();
        org.jsoup.nodes.Attributes attributes45 = textNode39.attributes();
        org.jsoup.nodes.Node node46 = textNode39.parent();
        org.jsoup.nodes.TextNode textNode48 = textNode39.text("");
        java.lang.String str49 = textNode48.toString();
        org.jsoup.nodes.Node node50 = textNode48.previousSibling();
        boolean boolean51 = textNode14.equals((java.lang.Object) node50);
        try {
            textNode9.replaceWith(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "#text" + "'", str28.equals("#text"));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "#text" + "'", str42.equals("#text"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(textNode48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodesCopy();
        java.lang.String str13 = textNode9.nodeName();
        java.lang.Class<?> wildcardClass14 = textNode9.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        try {
            org.jsoup.nodes.Node node41 = textNode13.after("");
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
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        org.jsoup.nodes.TextNode textNode35 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean37 = textNode35.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes38 = textNode35.attributes();
        int int39 = textNode35.childNodeSize();
        boolean boolean40 = textNode17.equals((java.lang.Object) int39);
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
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        java.lang.String str33 = textNode17.nodeName();
        java.lang.String str34 = textNode17.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node21 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int25 = textNode24.siblingIndex();
        org.jsoup.nodes.Document document26 = textNode24.ownerDocument();
        int int27 = textNode24.childNodeSize();
        java.lang.Class<?> wildcardClass28 = textNode24.getClass();
        int int29 = textNode24.childNodeSize();
        boolean boolean30 = textNode24.isBlank();
        org.jsoup.nodes.Attributes attributes31 = textNode24.attributes();
        java.lang.Class<?> wildcardClass32 = textNode24.getClass();
        org.jsoup.nodes.TextNode textNode34 = textNode24.text("h");
        boolean boolean35 = node21.equals((java.lang.Object) textNode24);
        org.jsoup.nodes.Node node36 = textNode24.nextSibling();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "h");
        try {
            org.jsoup.nodes.Node node10 = node8.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "i!" + "'", str3.equals("i!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        org.jsoup.nodes.Attributes attributes25 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode28.childNodesCopy();
        int int30 = textNode28.siblingIndex();
        org.jsoup.nodes.Node node32 = textNode28.removeAttr("#text");
        java.lang.String str33 = textNode28.getWholeText();
        java.lang.String str34 = textNode28.baseUri();
        boolean boolean36 = textNode28.hasAttr("hi!");
        try {
            org.jsoup.nodes.Node node37 = textNode2.after((org.jsoup.nodes.Node) textNode28);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        int int5 = textNode4.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode4.text("#text");
        textNode4.setBaseUri("hi!");
        textNode4.setBaseUri("h");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("#text");
        boolean boolean23 = textNode21.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode21.childNodesCopy();
        java.lang.String str26 = textNode21.attr("h");
        org.jsoup.nodes.TextNode textNode28 = textNode21.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode28.siblingNodes();
        java.lang.String str30 = textNode28.toString();
        textNode28.setBaseUri("h");
        try {
            org.jsoup.nodes.Node node33 = textNode4.after((org.jsoup.nodes.Node) textNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.getWholeText();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.lang.String str21 = textNode16.text();
        int int22 = textNode16.siblingIndex();
        boolean boolean24 = textNode16.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node25 = textNode16.clone();
        org.jsoup.nodes.Attributes attributes26 = textNode16.attributes();
        java.lang.String str27 = textNode16.nodeName();
        boolean boolean28 = textNode16.isBlank();
        boolean boolean29 = textNode16.isBlank();
        java.lang.Class<?> wildcardClass30 = textNode16.getClass();
        boolean boolean31 = textNode2.equals((java.lang.Object) wildcardClass30);
        textNode2.setBaseUri("hi!");
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode4.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = textNode4.getClass();
        org.jsoup.nodes.Node node9 = textNode4.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        int int10 = node9.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = node9.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        java.lang.String str17 = textNode5.toString();
        org.jsoup.nodes.Node node18 = textNode5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode5.childNodesCopy();
        java.lang.String str20 = textNode5.nodeName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode19.childNodes();
        boolean boolean24 = textNode19.hasAttr("");
        java.lang.String str26 = textNode19.attr("#text");
        java.lang.Class<?> wildcardClass27 = textNode19.getClass();
        org.jsoup.nodes.TextNode textNode30 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str32 = textNode30.attr("h");
        boolean boolean34 = textNode30.hasAttr("hi!");
        java.lang.String str36 = textNode30.attr("#text");
        org.jsoup.nodes.Node node39 = textNode30.attr("i!", "i!");
        boolean boolean40 = textNode19.equals((java.lang.Object) "i!");
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
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node5 = document4.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean10 = textNode8.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode8.attributes();
        java.lang.String str12 = textNode8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.siblingNodes();
        java.lang.String str14 = textNode8.nodeName();
        java.lang.String str15 = textNode8.toString();
        try {
            org.jsoup.nodes.Node node16 = textNode2.after((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        int int14 = textNode2.siblingIndex();
        java.lang.String str15 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        int int16 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        int int21 = textNode19.siblingIndex();
        java.lang.String str22 = textNode19.nodeName();
        java.lang.String str23 = textNode19.toString();
        int int24 = textNode19.siblingIndex();
        org.jsoup.nodes.Attributes attributes25 = textNode19.attributes();
        org.jsoup.nodes.Node node26 = textNode19.parent();
        org.jsoup.nodes.TextNode textNode28 = textNode19.text("");
        java.lang.String str29 = textNode28.toString();
        org.jsoup.nodes.Attributes attributes30 = textNode28.attributes();
        java.lang.String str32 = textNode28.absUrl("i!");
        boolean boolean33 = textNode2.equals((java.lang.Object) str32);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.absUrl("h");
        int int11 = textNode2.childNodeSize();
        try {
            java.lang.String str13 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        java.lang.String str16 = textNode10.text();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode10.childNodesCopy();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("#text");
        boolean boolean21 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        try {
            org.jsoup.nodes.Node node25 = textNode2.after("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str12 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        org.jsoup.nodes.Attributes attributes21 = textNode20.attributes();
        try {
            org.jsoup.nodes.Node node23 = textNode20.after("hi!");
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
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean4 = textNode2.hasAttr("h");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        java.lang.String str11 = textNode2.baseUri();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        boolean boolean17 = textNode2.isBlank();
        int int18 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document19 = textNode2.ownerDocument();
        java.lang.String str20 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean7 = textNode2.hasAttr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean15 = textNode14.isBlank();
        boolean boolean17 = textNode14.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node23 = textNode20.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.siblingNodes();
        boolean boolean25 = textNode14.equals((java.lang.Object) node23);
        org.jsoup.nodes.Node node28 = textNode14.attr("hi!", "h");
        try {
            org.jsoup.nodes.Node node29 = textNode2.before(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        int int15 = textNode9.siblingIndex();
        java.lang.String str17 = textNode9.absUrl("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean11 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        textNode2.setBaseUri("");
        java.lang.String str15 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        boolean boolean19 = textNode2.hasAttr("#text");
        boolean boolean21 = textNode2.hasAttr("");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean14 = textNode2.hasAttr("hi!");
        int int15 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node20 = textNode2.parent();
        java.lang.String str22 = textNode2.attr("");
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        textNode2.setBaseUri("");
        java.lang.String str10 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        org.jsoup.nodes.Document document21 = textNode14.ownerDocument();
        org.jsoup.nodes.Node node23 = textNode14.removeAttr("hi!");
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
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.lang.String str6 = textNode5.outerHtml();
        org.jsoup.nodes.Node node7 = textNode5.clone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        int int13 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node17 = node16.clone();
        try {
            org.jsoup.nodes.Node node19 = node16.after("h");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("#text");
        org.jsoup.nodes.Node node8 = textNode5.previousSibling();
        try {
            org.jsoup.nodes.Node node10 = textNode5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        boolean boolean9 = textNode8.isBlank();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node5 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
            org.jsoup.nodes.Node node28 = textNode2.unwrap();
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str38 = textNode37.baseUri();
        boolean boolean40 = textNode37.hasAttr("hi!");
        boolean boolean41 = textNode37.isBlank();
        java.lang.Class<?> wildcardClass42 = textNode37.getClass();
        org.jsoup.nodes.TextNode textNode45 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode45.childNodesCopy();
        int int47 = textNode45.siblingIndex();
        java.lang.String str48 = textNode45.nodeName();
        java.lang.String str49 = textNode45.toString();
        int int50 = textNode45.siblingIndex();
        org.jsoup.nodes.Attributes attributes51 = textNode45.attributes();
        org.jsoup.nodes.TextNode textNode54 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean55 = textNode54.isBlank();
        org.jsoup.nodes.Attributes attributes56 = textNode54.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = textNode54.siblingNodes();
        boolean boolean58 = textNode45.equals((java.lang.Object) nodeList57);
        boolean boolean59 = textNode37.equals((java.lang.Object) boolean58);
        org.jsoup.nodes.Node node62 = textNode37.attr("#text", "hi!");
        try {
            org.jsoup.nodes.Node node63 = textNode33.after(node62);
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "#text" + "'", str48.equals("#text"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str12 = textNode9.attr("");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.text();
        int int21 = textNode15.siblingIndex();
        java.lang.String str22 = textNode15.nodeName();
        try {
            org.jsoup.nodes.Node node23 = textNode9.before((org.jsoup.nodes.Node) textNode15);
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("");
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
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode19.childNodes();
        boolean boolean24 = textNode19.hasAttr("");
        java.lang.String str25 = textNode19.toString();
        java.lang.String str27 = textNode19.attr("hi!");
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
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        java.lang.String str16 = textNode10.text();
        org.jsoup.nodes.Node node18 = textNode10.removeAttr("hi!");
        int int19 = node18.siblingIndex();
        int int20 = node18.siblingIndex();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean25 = textNode23.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes26 = textNode23.attributes();
        java.lang.String str27 = textNode23.outerHtml();
        org.jsoup.nodes.Node node28 = textNode23.nextSibling();
        boolean boolean29 = textNode23.isBlank();
        org.jsoup.nodes.Document document30 = textNode23.ownerDocument();
        boolean boolean31 = node18.equals((java.lang.Object) textNode23);
        boolean boolean32 = textNode23.isBlank();
        java.lang.String str33 = textNode23.baseUri();
        try {
            org.jsoup.nodes.Node node34 = textNode2.before((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            document9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.attr("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        java.lang.String str22 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node24 = textNode2.before("i!");
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("h");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node12 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        java.lang.String str37 = textNode2.absUrl("h");
        java.lang.String str38 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "#text" + "'", str38.equals("#text"));
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodesCopy();
        java.lang.String str18 = textNode2.nodeName();
        java.lang.Object obj19 = null;
        boolean boolean20 = textNode2.equals(obj19);
        org.jsoup.nodes.Node node21 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("h");
        try {
            java.lang.String str25 = textNode23.absUrl("");
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(textNode23);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        java.lang.String str5 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "i!" + "'", str5.equals("i!"));
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        org.jsoup.nodes.Node node8 = node6.previousSibling();
        try {
            node8.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        org.jsoup.nodes.Node node32 = textNode13.clone();
        try {
            org.jsoup.nodes.Node node34 = textNode13.before("");
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
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node9 = document7.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode12.isBlank();
        boolean boolean15 = textNode12.hasAttr("hi!");
        int int16 = textNode12.childNodeSize();
        org.jsoup.nodes.TextNode textNode18 = textNode12.splitText((int) (short) 0);
        try {
            org.jsoup.nodes.Node node19 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        try {
            org.jsoup.nodes.Node node22 = textNode9.unwrap();
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
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str10 = textNode9.baseUri();
        java.lang.String str11 = textNode9.baseUri();
        java.lang.Object obj12 = null;
        boolean boolean13 = textNode9.equals(obj12);
        org.jsoup.nodes.Node node14 = textNode9.previousSibling();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode9);
        textNode9.setBaseUri("#text");
        org.jsoup.nodes.Node node18 = textNode9.clone();
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode9.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.attr("i!", "hi!");
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode16 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean21 = textNode19.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes22 = textNode19.attributes();
        java.lang.String str23 = textNode19.outerHtml();
        org.jsoup.nodes.Node node24 = textNode19.nextSibling();
        boolean boolean25 = textNode19.isBlank();
        org.jsoup.nodes.Document document26 = textNode19.ownerDocument();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        textNode6.setBaseUri("");
        java.lang.String str11 = textNode6.absUrl("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        java.lang.String str27 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass28 = textNode2.getClass();
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "i!" + "'", str27.equals("i!"));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.siblingIndex();
        int int11 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.getWholeText();
        boolean boolean14 = textNode2.hasAttr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.lang.String str12 = textNode11.outerHtml();
        java.lang.String str14 = textNode11.absUrl("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        java.lang.String str13 = textNode12.text();
        org.jsoup.nodes.Attributes attributes14 = textNode12.attributes();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        textNode2.setBaseUri("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.lang.String str21 = textNode16.text();
        org.jsoup.nodes.Attributes attributes22 = textNode16.attributes();
        java.lang.String str23 = textNode16.text();
        boolean boolean25 = textNode16.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.TextNode textNode27 = textNode16.splitText(0);
        java.lang.String str28 = textNode16.outerHtml();
        boolean boolean29 = textNode2.equals((java.lang.Object) textNode16);
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        try {
            org.jsoup.nodes.Node node31 = textNode16.traverse(nodeVisitor30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        java.lang.String str16 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode18 = textNode13.splitText(1);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.baseUri();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        int int19 = textNode14.siblingIndex();
        org.jsoup.nodes.Attributes attributes20 = textNode14.attributes();
        org.jsoup.nodes.Node node22 = textNode14.removeAttr("i!");
        org.jsoup.nodes.Node node23 = node22.previousSibling();
        org.jsoup.nodes.Node node24 = node22.parent();
        int int25 = node22.siblingIndex();
        try {
            org.jsoup.nodes.Node node26 = textNode2.before(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean11 = textNode2.hasAttr("");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        int int6 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("#text");
        org.jsoup.nodes.Node node8 = textNode5.clone();
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        java.lang.String str17 = textNode16.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode4.nextSibling();
        java.lang.String str11 = textNode4.toString();
        boolean boolean13 = textNode4.hasAttr("");
        java.lang.String str14 = textNode4.getWholeText();
        try {
            textNode4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean11 = textNode10.isBlank();
        boolean boolean13 = textNode10.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node19 = textNode16.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
        boolean boolean21 = textNode10.equals((java.lang.Object) node19);
        org.jsoup.nodes.Node node24 = textNode10.attr("hi!", "h");
        java.lang.String str25 = textNode10.text();
        textNode10.setBaseUri("");
        try {
            org.jsoup.nodes.Node node28 = textNode2.before((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.toString();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean4 = textNode2.hasAttr("h");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

