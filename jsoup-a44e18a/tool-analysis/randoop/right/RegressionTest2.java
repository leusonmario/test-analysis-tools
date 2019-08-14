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
        try {
            org.jsoup.nodes.Node node21 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        boolean boolean21 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int25 = textNode24.siblingIndex();
        org.jsoup.nodes.Document document26 = textNode24.ownerDocument();
        int int27 = textNode24.childNodeSize();
        java.lang.Class<?> wildcardClass28 = textNode24.getClass();
        org.jsoup.nodes.TextNode textNode30 = textNode24.text("h");
        org.jsoup.nodes.TextNode textNode32 = textNode30.splitText(0);
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode30);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(textNode32);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        textNode2.setBaseUri("#text");
        try {
            org.jsoup.nodes.Node node21 = textNode2.childNode(0);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        try {
            org.jsoup.nodes.Document document25 = node24.ownerDocument();
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
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode39.childNodesCopy();
        int int41 = textNode39.siblingIndex();
        java.lang.String str42 = textNode39.nodeName();
        java.lang.String str44 = textNode39.attr("");
        java.lang.String str45 = textNode39.text();
        org.jsoup.nodes.Node node47 = textNode39.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes48 = textNode39.attributes();
        org.jsoup.nodes.Node node50 = textNode39.removeAttr("i!");
        org.jsoup.nodes.Node node51 = node50.clone();
        org.jsoup.nodes.TextNode textNode54 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean55 = textNode54.isBlank();
        org.jsoup.nodes.Attributes attributes56 = textNode54.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = textNode54.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = textNode54.childNodes();
        boolean boolean59 = node51.equals((java.lang.Object) textNode54);
        try {
            org.jsoup.nodes.Node node60 = textNode25.after((org.jsoup.nodes.Node) textNode54);
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
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "#text" + "'", str42.equals("#text"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        try {
            org.jsoup.nodes.Node node15 = node10.after("i!");
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
            org.jsoup.nodes.Node node26 = node24.after("h");
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.siblingNodes();
        try {
            node12.remove();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("#text");
        org.jsoup.nodes.Attributes attributes20 = textNode19.attributes();
        boolean boolean21 = textNode2.equals((java.lang.Object) attributes20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str6 = node4.baseUri();
        try {
            org.jsoup.nodes.Node node7 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.siblingNodes();
        org.jsoup.nodes.Attributes attributes7 = textNode5.attributes();
        try {
            org.jsoup.nodes.Node node8 = textNode5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node16 = textNode14.removeAttr("hi!");
        org.jsoup.nodes.Node node17 = node16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.siblingNodes();
        boolean boolean19 = textNode2.equals((java.lang.Object) nodeList18);
        try {
            org.jsoup.nodes.Node node21 = textNode2.before("hi!");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.jsoup.nodes.Node node25 = textNode2.attr("i!", "i!");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode31.childNodesCopy();
        int int33 = textNode31.siblingIndex();
        java.lang.String str34 = textNode31.nodeName();
        java.lang.String str36 = textNode31.attr("");
        org.jsoup.nodes.Node node37 = textNode31.previousSibling();
        org.jsoup.nodes.Node node38 = textNode31.previousSibling();
        org.jsoup.nodes.Document document39 = textNode31.ownerDocument();
        try {
            org.jsoup.nodes.Node node40 = textNode17.before((org.jsoup.nodes.Node) document39);
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "#text" + "'", str34.equals("#text"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(document39);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.String str18 = textNode2.text();
        java.lang.String str19 = textNode2.baseUri();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean13 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node16 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node13 = node11.after("h");
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
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.after(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.String str24 = textNode20.text();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.childNodes();
        try {
            org.jsoup.nodes.Node node27 = textNode20.childNode(10);
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        org.jsoup.nodes.Node node24 = node10.nextSibling();
        java.lang.String str25 = node10.baseUri();
        try {
            org.jsoup.nodes.Node node26 = node10.unwrap();
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
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.siblingIndex();
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "hi!");
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        org.jsoup.nodes.Attributes attributes43 = textNode37.attributes();
        java.lang.String str44 = textNode37.text();
        boolean boolean46 = textNode37.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode37.childNodes();
        java.lang.String str48 = textNode37.nodeName();
        org.jsoup.nodes.Node node49 = textNode37.clone();
        try {
            org.jsoup.nodes.Node node50 = node32.after((org.jsoup.nodes.Node) textNode37);
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
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "#text" + "'", str48.equals("#text"));
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
            org.jsoup.nodes.Node node22 = node20.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "h");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int14 = textNode13.siblingIndex();
        org.jsoup.nodes.Document document15 = textNode13.ownerDocument();
        int int16 = textNode13.siblingIndex();
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode13.previousSibling();
        org.jsoup.nodes.Node node20 = textNode13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode13.siblingNodes();
        java.lang.String str22 = textNode13.outerHtml();
        org.jsoup.nodes.Node node23 = textNode13.previousSibling();
        boolean boolean25 = textNode13.hasAttr("#text");
        boolean boolean26 = textNode2.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "h");
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node11 = node9.before("hi!");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.text();
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.jsoup.nodes.Node node22 = textNode12.previousSibling();
        org.jsoup.nodes.Node node23 = textNode12.parent();
        try {
            org.jsoup.nodes.Node node24 = node23.nextSibling();
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node18 = textNode15.attr("i!", "i!");
        try {
            org.jsoup.nodes.Node node19 = node12.after(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.lang.String str15 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node17 = textNode2.before("");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.lang.String str27 = textNode2.absUrl("hi!");
        java.lang.String str28 = textNode2.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "i!" + "'", str28.equals("i!"));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        try {
            org.jsoup.nodes.Node node24 = textNode2.wrap("");
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
        org.junit.Assert.assertNotNull(textNode22);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        try {
            org.jsoup.nodes.Node node15 = textNode2.after("#text");
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        int int11 = node10.siblingIndex();
        int int12 = node10.siblingIndex();
        int int13 = node10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node10.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        try {
            org.jsoup.nodes.Node node16 = node10.traverse(nodeVisitor15);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        java.lang.Class<?> wildcardClass14 = attributes13.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        try {
            node5.setBaseUri("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean13 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node15 = document14.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        try {
            org.jsoup.nodes.Node node19 = textNode2.traverse(nodeVisitor18);
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        int int31 = textNode29.siblingIndex();
        java.lang.String str32 = textNode29.nodeName();
        java.lang.String str33 = textNode29.toString();
        java.lang.String str34 = textNode29.text();
        int int35 = textNode29.siblingIndex();
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode38.childNodesCopy();
        int int40 = textNode38.siblingIndex();
        java.lang.String str41 = textNode38.nodeName();
        java.lang.String str42 = textNode38.toString();
        int int43 = textNode38.siblingIndex();
        boolean boolean44 = textNode29.equals((java.lang.Object) int43);
        org.jsoup.nodes.TextNode textNode46 = textNode29.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode29.siblingNodes();
        org.jsoup.nodes.Attributes attributes48 = textNode29.attributes();
        java.lang.String str49 = textNode29.baseUri();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode29);
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "#text" + "'", str41.equals("#text"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(textNode46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        try {
            org.jsoup.nodes.Node node36 = textNode2.before("#text");
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
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        try {
            org.jsoup.nodes.Node node16 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        boolean boolean8 = textNode2.isBlank();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode13.isBlank();
        boolean boolean16 = textNode13.hasAttr("hi!");
        int int17 = textNode13.childNodeSize();
        java.lang.String str18 = textNode13.text();
        org.jsoup.nodes.Attributes attributes19 = textNode13.attributes();
        org.jsoup.nodes.Node node20 = textNode13.clone();
        org.jsoup.nodes.Node node21 = textNode13.parent();
        org.jsoup.nodes.Attributes attributes22 = textNode13.attributes();
        org.jsoup.nodes.Node node23 = textNode13.previousSibling();
        org.jsoup.nodes.Node node26 = textNode13.attr("#text", "#text");
        try {
            org.jsoup.nodes.Node node27 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        java.lang.String str9 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h" + "'", str9.equals("h"));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        java.lang.String str12 = textNode9.outerHtml();
        org.jsoup.nodes.Node node15 = textNode9.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes16 = textNode9.attributes();
        org.jsoup.nodes.Node node17 = textNode9.parent();
        java.lang.String str19 = textNode9.absUrl("#text");
        boolean boolean20 = textNode9.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode9.childNodes();
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        java.lang.Class<?> wildcardClass13 = textNode2.getClass();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node16 = node14.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.hasAttr("hi!");
        java.lang.String str12 = textNode9.nodeName();
        java.lang.String str13 = textNode9.nodeName();
        try {
            org.jsoup.nodes.Node node15 = textNode9.after("");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        try {
            node13.setBaseUri("#text");
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
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode2.childNodes();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        java.lang.String str16 = textNode11.toString();
        org.jsoup.nodes.Document document17 = textNode11.ownerDocument();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.outerHtml();
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
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.siblingNodes();
        org.jsoup.nodes.Attributes attributes7 = textNode5.attributes();
        org.jsoup.nodes.Node node8 = textNode5.parent();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        int int11 = node10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node10.childNodes();
        int int13 = node10.siblingIndex();
        org.jsoup.nodes.Node node14 = node10.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode18.text("hi!");
        java.lang.String str21 = textNode18.outerHtml();
        java.lang.String str22 = textNode18.getWholeText();
        java.lang.String str24 = textNode18.absUrl("#text");
        java.lang.String str25 = textNode18.toString();
        java.lang.String str26 = textNode18.getWholeText();
        try {
            org.jsoup.nodes.Node node27 = textNode2.after((org.jsoup.nodes.Node) textNode18);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        try {
            org.jsoup.nodes.Node node18 = textNode13.traverse(nodeVisitor17);
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean32 = textNode31.isBlank();
        java.lang.String str33 = textNode31.toString();
        java.lang.String str34 = textNode31.baseUri();
        java.lang.String str36 = textNode31.attr("hi!");
        java.lang.String str38 = textNode31.attr("");
        try {
            org.jsoup.nodes.Node node39 = textNode28.after((org.jsoup.nodes.Node) textNode31);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        try {
            org.jsoup.nodes.Node node13 = node10.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str13 = textNode11.attr("#text");
        try {
            org.jsoup.nodes.Node node14 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        int int26 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode28 = textNode2.text("h");
        try {
            org.jsoup.nodes.Node node30 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNode28);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode6.toString();
        textNode6.setBaseUri("hi!");
        try {
            org.jsoup.nodes.Node node17 = textNode6.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node13 = textNode2.wrap("");
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
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("h");
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        int int16 = node14.childNodeSize();
        try {
            node14.remove();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.TextNode textNode9 = textNode7.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        try {
            org.jsoup.nodes.Node node15 = node12.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.String str9 = textNode5.outerHtml();
        org.jsoup.nodes.Node node10 = textNode5.parent();
        boolean boolean11 = textNode5.isBlank();
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode5.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "i!" + "'", str9.equals("i!"));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node11 = document9.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.jsoup.nodes.Node node21 = node20.parent();
        try {
            java.lang.String str22 = node21.baseUri();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        try {
            org.jsoup.nodes.Node node14 = textNode2.traverse(nodeVisitor13);
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
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("hi!");
        org.jsoup.nodes.Node node14 = textNode11.nextSibling();
        org.jsoup.nodes.Node node15 = textNode11.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode11.childNodes();
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.String str59 = textNode13.absUrl("i!");
        boolean boolean60 = textNode13.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = textNode13.childNodesCopy();
        try {
            org.jsoup.nodes.Node node63 = textNode13.after("");
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeList61);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.attr("");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode15.childNodes();
        org.jsoup.nodes.TextNode textNode22 = textNode15.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode15.childNodesCopy();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean27 = textNode15.equals((java.lang.Object) textNode26);
        org.jsoup.nodes.Node node28 = textNode15.parent();
        java.lang.String str29 = textNode15.toString();
        org.jsoup.nodes.Node node30 = textNode15.previousSibling();
        textNode15.setBaseUri("#text");
        try {
            org.jsoup.nodes.Node node33 = textNode2.before((org.jsoup.nodes.Node) textNode15);
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        org.jsoup.nodes.Node node24 = node10.nextSibling();
        try {
            org.jsoup.nodes.Node node26 = node24.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        int int15 = node14.childNodeSize();
        org.jsoup.nodes.Node node16 = node14.clone();
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode39.childNodesCopy();
        int int41 = textNode39.siblingIndex();
        java.lang.String str42 = textNode39.nodeName();
        java.lang.String str44 = textNode39.attr("");
        org.jsoup.nodes.Node node45 = textNode39.previousSibling();
        org.jsoup.nodes.TextNode textNode47 = textNode39.text("hi!");
        org.jsoup.nodes.TextNode textNode49 = textNode39.splitText(1);
        try {
            org.jsoup.nodes.Node node50 = textNode2.before((org.jsoup.nodes.Node) textNode49);
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
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "#text" + "'", str42.equals("#text"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(textNode47);
        org.junit.Assert.assertNotNull(textNode49);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        try {
            org.jsoup.nodes.Node node23 = textNode2.unwrap();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "h");
        org.jsoup.nodes.Node node8 = node7.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        int int10 = textNode8.siblingIndex();
        java.lang.String str11 = textNode8.nodeName();
        java.lang.String str12 = textNode8.toString();
        java.lang.String str13 = textNode8.text();
        java.lang.String str14 = textNode8.toString();
        boolean boolean15 = textNode8.isBlank();
        java.lang.String str16 = textNode8.nodeName();
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        textNode2.setBaseUri("");
        int int6 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.outerHtml();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.Class<?> wildcardClass9 = textNode5.getClass();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("#text", "hi!");
        textNode12.setBaseUri("");
        try {
            textNode5.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node9 = node7.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode4.childNodesCopy();
        int int6 = textNode4.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.nodeName();
        java.lang.String str13 = textNode9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode9.childNodesCopy();
        textNode9.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode9.childNodesCopy();
        try {
            textNode4.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        try {
            org.jsoup.nodes.Node node11 = textNode8.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.text();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "");
        java.lang.String str3 = textNode2.toString();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "i!" + "'", str3.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        try {
            org.jsoup.nodes.Node node15 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.outerHtml();
        boolean boolean8 = textNode2.isBlank();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.text();
        org.jsoup.nodes.Attributes attributes21 = textNode15.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode15.childNodes();
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode15);
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str11 = textNode7.toString();
        java.lang.String str12 = textNode7.toString();
        boolean boolean14 = textNode7.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode7.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode7.childNodesCopy();
        org.jsoup.nodes.TextNode textNode18 = textNode7.splitText((int) (byte) 1);
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode18);
        try {
            org.jsoup.nodes.Node node22 = textNode18.attr("", "i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = node9.parent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        int int21 = textNode19.siblingIndex();
        java.lang.String str22 = textNode19.nodeName();
        java.lang.String str23 = textNode19.toString();
        int int24 = textNode19.siblingIndex();
        org.jsoup.nodes.Attributes attributes25 = textNode19.attributes();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean29 = textNode28.isBlank();
        org.jsoup.nodes.Attributes attributes30 = textNode28.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode28.siblingNodes();
        boolean boolean32 = textNode19.equals((java.lang.Object) nodeList31);
        org.jsoup.nodes.Attributes attributes33 = textNode19.attributes();
        try {
            org.jsoup.nodes.Node node34 = textNode6.after((org.jsoup.nodes.Node) textNode19);
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        java.lang.String str13 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("hi!");
        java.lang.String str18 = textNode15.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode15.childNodesCopy();
        org.jsoup.nodes.Node node21 = textNode15.removeAttr("h");
        try {
            textNode2.replaceWith(node21);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("i!");
        int int9 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = node12.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.getWholeText();
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
        org.jsoup.nodes.Node node22 = textNode9.parent();
        java.lang.String str23 = textNode9.toString();
        org.jsoup.nodes.Node node24 = textNode9.previousSibling();
        java.lang.String str25 = textNode9.getWholeText();
        try {
            org.jsoup.nodes.Node node26 = textNode2.before((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        java.lang.Class<?> wildcardClass13 = nodeList12.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        int int11 = node10.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = node10.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node5 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node17 = textNode13.clone();
        java.lang.Class<?> wildcardClass18 = textNode13.getClass();
        java.lang.String str19 = textNode13.baseUri();
        java.lang.String str20 = textNode13.outerHtml();
        try {
            org.jsoup.nodes.Node node21 = textNode2.before((org.jsoup.nodes.Node) textNode13);
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
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "h");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = textNode7.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "h");
        boolean boolean12 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean17 = textNode15.hasAttr("h");
        java.lang.String str18 = textNode15.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode15.childNodes();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        try {
            org.jsoup.nodes.Node node25 = textNode17.after("");
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
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        try {
            org.jsoup.nodes.Node node16 = textNode9.before("#text");
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
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode13.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "hi!");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        org.jsoup.nodes.TextNode textNode16 = textNode13.text("#text");
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        java.lang.String str21 = textNode18.nodeName();
        java.lang.String str22 = textNode18.toString();
        int int23 = textNode18.childNodeSize();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode28 = textNode26.text("hi!");
        java.lang.String str29 = textNode26.outerHtml();
        org.jsoup.nodes.Node node32 = textNode26.attr("hi!", "#text");
        org.jsoup.nodes.Node node33 = textNode26.clone();
        boolean boolean34 = textNode18.equals((java.lang.Object) textNode26);
        boolean boolean36 = textNode26.hasAttr("#text");
        try {
            boolean boolean37 = node15.equals((java.lang.Object) textNode26);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str12 = textNode7.attr("");
        java.lang.String str13 = textNode7.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode7.childNodesCopy();
        org.jsoup.nodes.Node node16 = textNode7.removeAttr("#text");
        org.jsoup.nodes.Attributes attributes17 = textNode7.attributes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.baseUri();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str13 = textNode12.baseUri();
        boolean boolean15 = textNode12.hasAttr("hi!");
        boolean boolean16 = textNode12.isBlank();
        java.lang.Class<?> wildcardClass17 = textNode12.getClass();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        java.lang.String str23 = textNode20.nodeName();
        java.lang.String str24 = textNode20.toString();
        int int25 = textNode20.siblingIndex();
        org.jsoup.nodes.Attributes attributes26 = textNode20.attributes();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean30 = textNode29.isBlank();
        org.jsoup.nodes.Attributes attributes31 = textNode29.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode29.siblingNodes();
        boolean boolean33 = textNode20.equals((java.lang.Object) nodeList32);
        boolean boolean34 = textNode12.equals((java.lang.Object) boolean33);
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.String str9 = textNode5.outerHtml();
        org.jsoup.nodes.Node node10 = textNode5.parent();
        try {
            org.jsoup.nodes.Node node12 = textNode5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "i!" + "'", str9.equals("i!"));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        try {
            org.jsoup.nodes.Node node39 = textNode13.attr("", "hi!");
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
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i!");
        boolean boolean9 = textNode7.hasAttr("h");
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode7.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        try {
            org.jsoup.nodes.Node node14 = node11.unwrap();
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.jsoup.nodes.Node node21 = node20.parent();
        try {
            node21.setBaseUri("");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("h", "i!");
        try {
            org.jsoup.nodes.Node node16 = node12.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        try {
            java.lang.String str35 = textNode17.absUrl("");
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
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        try {
            node11.remove();
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        try {
            org.jsoup.nodes.Node node10 = textNode7.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node12 = textNode10.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.Class<?> wildcardClass22 = textNode20.getClass();
        org.jsoup.nodes.Node node23 = textNode20.nextSibling();
        try {
            int int24 = node23.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        int int21 = textNode19.siblingIndex();
        org.jsoup.nodes.Node node23 = textNode19.removeAttr("#text");
        java.lang.String str24 = textNode19.getWholeText();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        java.lang.String str30 = textNode27.nodeName();
        java.lang.String str32 = textNode27.attr("");
        java.lang.String str33 = textNode27.text();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode27.childNodesCopy();
        boolean boolean35 = textNode19.equals((java.lang.Object) textNode27);
        org.jsoup.nodes.TextNode textNode37 = textNode19.text("#text");
        try {
            boolean boolean38 = node16.equals((java.lang.Object) textNode19);
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
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(textNode37);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("h", "i!");
        try {
            org.jsoup.nodes.Node node14 = textNode2.after((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        try {
            org.jsoup.nodes.Node node24 = node22.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node11 = textNode10.nextSibling();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("hi!");
        org.jsoup.nodes.Node node16 = textNode14.removeAttr("h");
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        java.lang.String str23 = textNode20.nodeName();
        java.lang.String str24 = textNode20.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.childNodes();
        org.jsoup.nodes.TextNode textNode27 = textNode20.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode20.childNodesCopy();
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean32 = textNode20.equals((java.lang.Object) textNode31);
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode35.childNodesCopy();
        int int37 = textNode35.siblingIndex();
        org.jsoup.nodes.Node node39 = textNode35.removeAttr("#text");
        java.lang.String str40 = textNode35.getWholeText();
        java.lang.String str41 = textNode35.baseUri();
        boolean boolean42 = textNode31.equals((java.lang.Object) textNode35);
        java.lang.String str43 = textNode35.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode35.siblingNodes();
        java.lang.String str45 = textNode35.outerHtml();
        try {
            textNode6.replaceWith((org.jsoup.nodes.Node) textNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        try {
            org.jsoup.nodes.Node node25 = node23.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.lang.String str12 = textNode11.toString();
        org.jsoup.nodes.Attributes attributes13 = textNode11.attributes();
        org.jsoup.nodes.Document document14 = textNode11.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("i!");
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
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node8 = node7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode23.childNodesCopy();
        int int25 = textNode23.siblingIndex();
        java.lang.String str26 = textNode23.nodeName();
        java.lang.String str27 = textNode23.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode23.childNodes();
        org.jsoup.nodes.TextNode textNode30 = textNode23.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode23.childNodesCopy();
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean35 = textNode23.equals((java.lang.Object) textNode34);
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode38.childNodesCopy();
        int int40 = textNode38.siblingIndex();
        org.jsoup.nodes.Node node42 = textNode38.removeAttr("#text");
        java.lang.String str43 = textNode38.getWholeText();
        java.lang.String str44 = textNode38.baseUri();
        boolean boolean45 = textNode34.equals((java.lang.Object) textNode38);
        org.jsoup.nodes.TextNode textNode48 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = textNode48.childNodesCopy();
        int int50 = textNode48.siblingIndex();
        org.jsoup.nodes.Node node51 = textNode48.previousSibling();
        java.lang.String str52 = textNode48.nodeName();
        org.jsoup.nodes.Node node53 = textNode48.clone();
        org.jsoup.nodes.Document document54 = node53.ownerDocument();
        boolean boolean55 = textNode34.equals((java.lang.Object) node53);
        boolean boolean57 = textNode34.hasAttr("hi!");
        java.lang.String str59 = textNode34.absUrl("hi!");
        org.jsoup.nodes.Node node62 = textNode34.attr("i!", "");
        try {
            org.jsoup.nodes.Node node63 = textNode10.after((org.jsoup.nodes.Node) textNode34);
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
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "#text" + "'", str26.equals("#text"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "#text" + "'", str52.equals("#text"));
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        try {
            textNode16.remove();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        node11.setBaseUri("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean8 = textNode2.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.splitText(0);
        try {
            org.jsoup.nodes.Node node15 = textNode12.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        try {
            java.lang.String str4 = document3.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        try {
            org.jsoup.nodes.Node node13 = textNode11.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean8 = textNode2.isBlank();
        try {
            textNode2.remove();
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node16 = textNode14.removeAttr("hi!");
        java.lang.String str17 = textNode14.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode14.childNodesCopy();
        java.lang.String str19 = textNode14.getWholeText();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str11 = textNode7.toString();
        java.lang.String str12 = textNode7.toString();
        boolean boolean14 = textNode7.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode7.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode7.childNodesCopy();
        org.jsoup.nodes.TextNode textNode18 = textNode7.splitText((int) (byte) 1);
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode18);
        int int20 = textNode2.childNodeSize();
        java.lang.String str21 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "hi!");
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.jsoup.nodes.Node node11 = node9.previousSibling();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        try {
            org.jsoup.nodes.Node node4 = textNode2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("i!");
        try {
            java.lang.String str13 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        int int9 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str10 = textNode9.text();
        textNode9.setBaseUri("");
        int int13 = textNode9.childNodeSize();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodesCopy();
        int int24 = textNode22.siblingIndex();
        java.lang.String str25 = textNode22.nodeName();
        java.lang.String str26 = textNode22.toString();
        int int27 = textNode22.childNodeSize();
        org.jsoup.nodes.TextNode textNode30 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode32 = textNode30.text("hi!");
        java.lang.String str33 = textNode30.outerHtml();
        org.jsoup.nodes.Node node36 = textNode30.attr("hi!", "#text");
        org.jsoup.nodes.Node node37 = textNode30.clone();
        boolean boolean38 = textNode22.equals((java.lang.Object) textNode30);
        org.jsoup.nodes.TextNode textNode40 = textNode22.text("");
        org.jsoup.nodes.TextNode textNode42 = textNode22.text("h");
        org.jsoup.nodes.TextNode textNode44 = textNode22.text("i!");
        try {
            org.jsoup.nodes.Node node45 = textNode2.after((org.jsoup.nodes.Node) textNode44);
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(textNode40);
        org.junit.Assert.assertNotNull(textNode42);
        org.junit.Assert.assertNotNull(textNode44);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str13 = textNode12.baseUri();
        java.lang.String str14 = textNode12.baseUri();
        java.lang.Object obj15 = null;
        boolean boolean16 = textNode12.equals(obj15);
        java.lang.String str17 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        java.lang.String str23 = textNode20.nodeName();
        java.lang.String str24 = textNode20.toString();
        int int25 = textNode20.childNodeSize();
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode30 = textNode28.text("hi!");
        java.lang.String str31 = textNode28.outerHtml();
        org.jsoup.nodes.Node node34 = textNode28.attr("hi!", "#text");
        org.jsoup.nodes.Node node35 = textNode28.clone();
        boolean boolean36 = textNode20.equals((java.lang.Object) textNode28);
        org.jsoup.nodes.Node node37 = textNode20.nextSibling();
        java.lang.Class<?> wildcardClass38 = textNode20.getClass();
        boolean boolean39 = textNode12.equals((java.lang.Object) wildcardClass38);
        try {
            org.jsoup.nodes.Node node40 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        org.jsoup.nodes.Node node13 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node15 = textNode2.after("#text");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        try {
            node11.remove();
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.lang.String str18 = textNode2.text();
        try {
            org.jsoup.nodes.Node node20 = textNode2.before("i!");
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean11 = textNode9.hasAttr("h");
        java.lang.String str12 = textNode9.getWholeText();
        int int13 = textNode9.childNodeSize();
        org.jsoup.nodes.Node node14 = textNode9.parent();
        try {
            org.jsoup.nodes.Node node15 = textNode2.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "i!" + "'", str12.equals("i!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        java.lang.String str16 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.String str27 = textNode24.text();
        java.lang.String str28 = textNode24.nodeName();
        int int29 = textNode24.childNodeSize();
        try {
            org.jsoup.nodes.Node node31 = textNode24.before("i!");
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "i!" + "'", str27.equals("i!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "#text" + "'", str28.equals("#text"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        try {
            org.jsoup.nodes.Node node10 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        java.lang.String str13 = textNode9.absUrl("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode9.attributes();
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode9.splitText((int) ' ');
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node7 = textNode2.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str12 = textNode7.attr("");
        java.lang.String str13 = textNode7.text();
        org.jsoup.nodes.Node node15 = textNode7.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes16 = textNode7.attributes();
        org.jsoup.nodes.Node node18 = textNode7.removeAttr("i!");
        boolean boolean19 = textNode2.equals((java.lang.Object) "i!");
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("h");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        java.lang.String str18 = textNode17.text();
        try {
            org.jsoup.nodes.Node node19 = textNode2.after((org.jsoup.nodes.Node) textNode17);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean8 = textNode2.equals((java.lang.Object) 1.0f);
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean11 = textNode10.isBlank();
        java.lang.String str12 = textNode10.toString();
        org.jsoup.nodes.Node node14 = textNode10.removeAttr("i!");
        try {
            org.jsoup.nodes.Node node15 = textNode2.before((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        org.jsoup.nodes.Document document27 = textNode24.ownerDocument();
        try {
            org.jsoup.nodes.Node node28 = document27.parent();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str11 = textNode7.toString();
        int int12 = textNode7.childNodeSize();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("hi!");
        java.lang.String str18 = textNode15.outerHtml();
        org.jsoup.nodes.Node node21 = textNode15.attr("hi!", "#text");
        org.jsoup.nodes.Node node22 = textNode15.clone();
        boolean boolean23 = textNode7.equals((java.lang.Object) textNode15);
        org.jsoup.nodes.TextNode textNode25 = textNode7.text("");
        java.lang.String str26 = textNode25.getWholeText();
        java.lang.String str28 = textNode25.absUrl("i!");
        boolean boolean29 = textNode25.isBlank();
        try {
            org.jsoup.nodes.Node node30 = textNode2.after((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.attr("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        int int8 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.attr("hi!");
        try {
            org.jsoup.nodes.Node node11 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.siblingNodes();
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int32 = textNode31.siblingIndex();
        org.jsoup.nodes.Document document33 = textNode31.ownerDocument();
        int int34 = textNode31.childNodeSize();
        org.jsoup.nodes.Node node36 = textNode31.removeAttr("i!");
        org.jsoup.nodes.Node node39 = textNode31.attr("i!", "h");
        boolean boolean41 = textNode31.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = textNode31.siblingNodes();
        try {
            org.jsoup.nodes.Node node43 = textNode27.after((org.jsoup.nodes.Node) textNode31);
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
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node11 = node9.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.text();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node16 = textNode15.parent();
        boolean boolean18 = textNode15.hasAttr("h");
        org.jsoup.nodes.Attributes attributes19 = textNode15.attributes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        try {
            org.jsoup.nodes.Node node14 = document12.after("#text");
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        java.lang.String str15 = textNode11.attr("hi!");
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode11.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        boolean boolean12 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass13 = textNode2.getClass();
        textNode2.setBaseUri("i!");
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
        org.jsoup.nodes.TextNode textNode43 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode43.childNodesCopy();
        int int45 = textNode43.siblingIndex();
        org.jsoup.nodes.Node node46 = textNode43.previousSibling();
        java.lang.String str47 = textNode43.nodeName();
        org.jsoup.nodes.Node node48 = textNode43.clone();
        org.jsoup.nodes.Document document49 = node48.ownerDocument();
        boolean boolean50 = textNode29.equals((java.lang.Object) node48);
        org.jsoup.nodes.TextNode textNode53 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = textNode53.childNodesCopy();
        int int55 = textNode53.siblingIndex();
        java.lang.String str56 = textNode53.nodeName();
        java.lang.String str57 = textNode53.toString();
        java.lang.String str58 = textNode53.text();
        int int59 = textNode53.siblingIndex();
        org.jsoup.nodes.TextNode textNode62 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList63 = textNode62.childNodesCopy();
        int int64 = textNode62.siblingIndex();
        java.lang.String str65 = textNode62.nodeName();
        java.lang.String str66 = textNode62.toString();
        int int67 = textNode62.siblingIndex();
        boolean boolean68 = textNode53.equals((java.lang.Object) int67);
        org.jsoup.nodes.TextNode textNode70 = textNode53.text("");
        org.jsoup.nodes.Node node72 = textNode53.removeAttr("hi!");
        boolean boolean73 = textNode29.equals((java.lang.Object) node72);
        java.lang.String str75 = textNode29.attr("h");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "#text" + "'", str47.equals("#text"));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "#text" + "'", str56.equals("#text"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "#text" + "'", str65.equals("#text"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(textNode70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.jsoup.nodes.Node node22 = textNode9.nextSibling();
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node26 = textNode25.nextSibling();
        java.lang.String str27 = textNode25.nodeName();
        org.jsoup.nodes.TextNode textNode29 = textNode25.text("hi!");
        try {
            node22.replaceWith((org.jsoup.nodes.Node) textNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertNotNull(textNode29);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode14.childNodesCopy();
        textNode14.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        java.lang.String str30 = textNode27.nodeName();
        java.lang.String str32 = textNode27.attr("");
        java.lang.String str33 = textNode27.text();
        org.jsoup.nodes.Node node35 = textNode27.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes36 = textNode27.attributes();
        org.jsoup.nodes.Node node38 = textNode27.removeAttr("i!");
        org.jsoup.nodes.Node node39 = node38.clone();
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean43 = textNode42.isBlank();
        org.jsoup.nodes.Attributes attributes44 = textNode42.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = textNode42.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode42.childNodes();
        boolean boolean47 = node39.equals((java.lang.Object) textNode42);
        boolean boolean48 = textNode14.equals((java.lang.Object) textNode42);
        try {
            org.jsoup.nodes.Node node49 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.jsoup.nodes.Node node23 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean27 = textNode26.isBlank();
        java.lang.String str28 = textNode26.toString();
        java.lang.String str29 = textNode26.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode26.siblingNodes();
        java.lang.String str31 = textNode26.text();
        org.jsoup.nodes.Node node33 = textNode26.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node34 = node23.after((org.jsoup.nodes.Node) textNode26);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        org.jsoup.nodes.Document document21 = node20.ownerDocument();
        try {
            org.jsoup.nodes.Node node23 = document21.before("i!");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str24 = textNode23.getWholeText();
        org.jsoup.nodes.Node node25 = textNode23.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode23.siblingNodes();
        java.lang.String str27 = textNode23.text();
        org.jsoup.nodes.Node node28 = textNode23.clone();
        try {
            org.jsoup.nodes.Node node29 = textNode20.before(node28);
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "h" + "'", str24.equals("h"));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "h" + "'", str27.equals("h"));
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode13.splitText((int) ' ');
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
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.lang.String str35 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "#text" + "'", str35.equals("#text"));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("h", "i!");
        org.jsoup.nodes.TextNode textNode19 = textNode17.splitText(0);
        try {
            org.jsoup.nodes.Node node20 = textNode2.before((org.jsoup.nodes.Node) textNode19);
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
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node12 = textNode2.wrap("");
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
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) (byte) 0);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        java.lang.String str15 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.jsoup.nodes.Node node28 = textNode27.nextSibling();
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str13 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node14 = textNode2.unwrap();
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
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = nodeList9.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.jsoup.nodes.Node node38 = node37.parent();
        try {
            org.jsoup.nodes.Node node40 = node38.childNode((int) (short) 100);
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
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.toString();
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        int int9 = node8.childNodeSize();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str17 = textNode12.attr("");
        java.lang.String str18 = textNode12.text();
        org.jsoup.nodes.Node node20 = textNode12.removeAttr("hi!");
        org.jsoup.nodes.Node node21 = node20.previousSibling();
        org.jsoup.nodes.Node node22 = node20.clone();
        java.lang.Class<?> wildcardClass23 = node20.getClass();
        boolean boolean24 = node8.equals((java.lang.Object) node20);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.Object obj6 = null;
        boolean boolean7 = textNode2.equals(obj6);
        java.lang.String str9 = textNode2.absUrl("hi!");
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
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node31 = textNode27.removeAttr("#text");
        java.lang.String str32 = textNode27.getWholeText();
        java.lang.String str33 = textNode27.baseUri();
        boolean boolean34 = textNode23.equals((java.lang.Object) textNode27);
        java.lang.String str35 = textNode27.getWholeText();
        java.lang.String str36 = textNode27.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode27.childNodes();
        boolean boolean39 = textNode27.hasAttr("hi!");
        boolean boolean41 = textNode27.hasAttr("");
        org.jsoup.nodes.Attributes attributes42 = textNode27.attributes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        boolean boolean14 = textNode2.hasAttr("#text");
        int int15 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        int int26 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode28 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode31.childNodesCopy();
        int int33 = textNode31.siblingIndex();
        java.lang.String str34 = textNode31.nodeName();
        java.lang.String str35 = textNode31.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode31.childNodes();
        org.jsoup.nodes.TextNode textNode38 = textNode31.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode31.childNodesCopy();
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean43 = textNode31.equals((java.lang.Object) textNode42);
        org.jsoup.nodes.TextNode textNode46 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode46.childNodesCopy();
        int int48 = textNode46.siblingIndex();
        org.jsoup.nodes.Node node50 = textNode46.removeAttr("#text");
        java.lang.String str51 = textNode46.getWholeText();
        java.lang.String str52 = textNode46.baseUri();
        boolean boolean53 = textNode42.equals((java.lang.Object) textNode46);
        java.lang.String str54 = textNode46.getWholeText();
        java.lang.String str55 = textNode46.baseUri();
        boolean boolean57 = textNode46.hasAttr("#text");
        org.jsoup.nodes.Attributes attributes58 = textNode46.attributes();
        boolean boolean59 = textNode2.equals((java.lang.Object) attributes58);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "#text" + "'", str34.equals("#text"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.Class<?> wildcardClass13 = textNode6.getClass();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode16.childNodes();
        java.lang.String str22 = textNode16.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode16.childNodesCopy();
        int int24 = textNode16.childNodeSize();
        int int25 = textNode16.siblingIndex();
        java.lang.String str26 = textNode16.text();
        try {
            textNode6.replaceWith((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        boolean boolean11 = textNode2.equals((java.lang.Object) nodeList10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node18 = textNode2.attr("i!", "");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        int int23 = textNode21.siblingIndex();
        java.lang.String str24 = textNode21.nodeName();
        java.lang.String str26 = textNode21.attr("");
        org.jsoup.nodes.Node node27 = textNode21.previousSibling();
        org.jsoup.nodes.TextNode textNode29 = textNode21.text("hi!");
        org.jsoup.nodes.Node node31 = textNode21.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node32 = node18.before(node31);
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        org.jsoup.nodes.Node node9 = textNode4.nextSibling();
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodesCopy();
        int int24 = textNode22.siblingIndex();
        java.lang.String str25 = textNode22.nodeName();
        java.lang.String str26 = textNode22.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode22.childNodes();
        org.jsoup.nodes.TextNode textNode29 = textNode22.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode22.childNodesCopy();
        org.jsoup.nodes.TextNode textNode33 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean34 = textNode22.equals((java.lang.Object) textNode33);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode37.childNodesCopy();
        int int39 = textNode37.siblingIndex();
        org.jsoup.nodes.Node node41 = textNode37.removeAttr("#text");
        java.lang.String str42 = textNode37.getWholeText();
        java.lang.String str43 = textNode37.baseUri();
        boolean boolean44 = textNode33.equals((java.lang.Object) textNode37);
        java.lang.String str45 = textNode37.getWholeText();
        java.lang.String str46 = textNode37.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode37.childNodes();
        boolean boolean49 = textNode37.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = textNode37.childNodesCopy();
        java.lang.Class<?> wildcardClass51 = textNode37.getClass();
        org.jsoup.nodes.Node node52 = textNode37.parent();
        java.lang.String str54 = textNode37.absUrl("h");
        try {
            org.jsoup.nodes.Node node55 = textNode2.after((org.jsoup.nodes.Node) textNode37);
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node9 = node8.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node16 = node14.wrap("#text");
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        try {
            org.jsoup.nodes.Node node35 = textNode17.removeAttr("");
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
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Node node15 = textNode12.attr("#text", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
        org.jsoup.nodes.Node node17 = node15.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        int int7 = node6.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
            org.jsoup.nodes.Node node36 = node32.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "hi!");
        try {
            org.jsoup.nodes.Node node11 = node9.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            java.lang.String str10 = document9.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.jsoup.nodes.Node node12 = node10.parent();
        int int13 = node10.siblingIndex();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str21 = textNode16.attr("");
        java.lang.String str22 = textNode16.text();
        org.jsoup.nodes.Node node24 = textNode16.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode27 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode29 = textNode27.text("hi!");
        java.lang.String str30 = textNode27.outerHtml();
        org.jsoup.nodes.Node node33 = textNode27.attr("hi!", "#text");
        java.lang.String str34 = textNode27.baseUri();
        boolean boolean35 = node24.equals((java.lang.Object) textNode27);
        org.jsoup.nodes.Document document36 = node24.ownerDocument();
        try {
            org.jsoup.nodes.Node node37 = node10.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document36);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.lang.String str38 = textNode13.absUrl("h");
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "i!" + "'", str12.equals("i!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        try {
            org.jsoup.nodes.Node node30 = document29.previousSibling();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        java.lang.String str9 = textNode2.nodeName();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        try {
            org.jsoup.nodes.Node node32 = textNode17.unwrap();
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
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str11 = textNode6.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode6.siblingNodes();
        boolean boolean13 = textNode2.equals((java.lang.Object) nodeList12);
        java.lang.String str15 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str20 = textNode18.attr("h");
        boolean boolean22 = textNode18.hasAttr("hi!");
        java.lang.String str24 = textNode18.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode18.siblingNodes();
        try {
            org.jsoup.nodes.Node node26 = textNode2.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        int int9 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node8 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodes();
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode11.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
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
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node14 = node13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        org.jsoup.nodes.TextNode textNode28 = textNode2.text("i!");
        java.lang.Class<?> wildcardClass29 = textNode2.getClass();
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
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.String str22 = textNode20.nodeName();
        boolean boolean23 = textNode20.isBlank();
        try {
            org.jsoup.nodes.Node node24 = textNode20.unwrap();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        java.lang.String str21 = textNode2.attr("i!");
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
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.jsoup.nodes.Node node15 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        java.lang.String str21 = textNode18.nodeName();
        java.lang.String str22 = textNode18.toString();
        int int23 = textNode18.childNodeSize();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode28 = textNode26.text("hi!");
        java.lang.String str29 = textNode26.outerHtml();
        org.jsoup.nodes.Node node32 = textNode26.attr("hi!", "#text");
        org.jsoup.nodes.Node node33 = textNode26.clone();
        boolean boolean34 = textNode18.equals((java.lang.Object) textNode26);
        boolean boolean36 = textNode26.hasAttr("#text");
        java.lang.String str37 = textNode26.getWholeText();
        boolean boolean38 = textNode2.equals((java.lang.Object) str37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.siblingNodes();
        try {
            org.jsoup.nodes.Node node19 = textNode16.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
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
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str12 = textNode2.attr("h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.siblingNodes();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        boolean boolean19 = textNode17.isBlank();
        org.jsoup.nodes.Node node20 = textNode17.parent();
        java.lang.String str21 = textNode17.nodeName();
        java.lang.String str23 = textNode17.attr("i!");
        try {
            org.jsoup.nodes.Node node24 = node12.before((org.jsoup.nodes.Node) textNode17);
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
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        textNode2.setBaseUri("#text");
        java.lang.String str20 = textNode2.getWholeText();
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str8 = textNode6.attr("");
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode6.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node12 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        try {
            java.lang.String str6 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str14 = textNode10.toString();
        java.lang.String str15 = textNode10.text();
        int int16 = textNode10.siblingIndex();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        int int21 = textNode19.siblingIndex();
        java.lang.String str22 = textNode19.nodeName();
        java.lang.String str23 = textNode19.toString();
        int int24 = textNode19.siblingIndex();
        boolean boolean25 = textNode10.equals((java.lang.Object) int24);
        org.jsoup.nodes.TextNode textNode27 = textNode10.text("");
        try {
            org.jsoup.nodes.Node node28 = textNode2.before((org.jsoup.nodes.Node) textNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(textNode27);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.absUrl("h");
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
        java.lang.String str25 = textNode12.baseUri();
        org.jsoup.nodes.Node node26 = textNode12.parent();
        org.jsoup.nodes.Node node29 = textNode12.attr("hi!", "");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        boolean boolean24 = textNode20.isBlank();
        int int25 = textNode20.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        org.jsoup.nodes.Node node16 = textNode9.nextSibling();
        try {
            org.jsoup.nodes.Node node18 = node16.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str12 = textNode2.attr("");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.lang.String str9 = textNode2.attr("");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node14 = node13.clone();
        org.jsoup.nodes.Document document15 = node13.ownerDocument();
        try {
            java.lang.String str16 = document15.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        org.jsoup.nodes.Node node13 = null;
        try {
            org.jsoup.nodes.Node node14 = node12.before(node13);
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
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node14 = textNode2.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        boolean boolean8 = textNode2.hasAttr("h");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node11 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.lang.Class<?> wildcardClass25 = textNode15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        boolean boolean22 = textNode2.hasAttr("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = textNode10.traverse(nodeVisitor12);
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
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        org.jsoup.nodes.Node node26 = textNode19.nextSibling();
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodesCopy();
        org.jsoup.nodes.Document document13 = textNode9.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
            org.jsoup.nodes.Node node14 = textNode2.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        try {
            org.jsoup.nodes.Node node17 = node15.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        java.lang.String str16 = textNode10.outerHtml();
        org.jsoup.nodes.Node node17 = textNode10.parent();
        java.lang.String str18 = textNode10.nodeName();
        org.jsoup.nodes.Node node19 = textNode10.clone();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode10);
        textNode10.setBaseUri("h");
        boolean boolean23 = textNode10.isBlank();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.childNodesCopy();
        int int28 = textNode26.siblingIndex();
        java.lang.String str29 = textNode26.nodeName();
        java.lang.String str31 = textNode26.attr("");
        java.lang.String str32 = textNode26.text();
        org.jsoup.nodes.Node node34 = textNode26.removeAttr("hi!");
        org.jsoup.nodes.Node node35 = textNode26.clone();
        int int36 = textNode26.siblingIndex();
        org.jsoup.nodes.Attributes attributes37 = textNode26.attributes();
        try {
            org.jsoup.nodes.Node node38 = textNode10.before((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        try {
            org.jsoup.nodes.Node node13 = textNode11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode16.text("hi!");
        java.lang.String str19 = textNode18.baseUri();
        int int20 = textNode18.childNodeSize();
        try {
            org.jsoup.nodes.Node node21 = textNode2.before((org.jsoup.nodes.Node) textNode18);
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
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        java.lang.String str28 = textNode17.absUrl("i!");
        boolean boolean30 = textNode17.hasAttr("h");
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean23 = textNode21.hasAttr("hi!");
        boolean boolean24 = textNode21.isBlank();
        org.jsoup.nodes.Node node26 = textNode21.removeAttr("i!");
        int int27 = textNode21.childNodeSize();
        java.lang.String str28 = textNode21.outerHtml();
        try {
            org.jsoup.nodes.Node node29 = textNode2.after((org.jsoup.nodes.Node) textNode21);
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
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        boolean boolean21 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node23 = textNode2.removeAttr("");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int15 = textNode14.siblingIndex();
        org.jsoup.nodes.Document document16 = textNode14.ownerDocument();
        int int17 = textNode14.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode14.clone();
        org.jsoup.nodes.Node node19 = textNode14.nextSibling();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node10 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str15 = textNode2.absUrl("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        try {
            org.jsoup.nodes.Node node17 = textNode2.traverse(nodeVisitor16);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        boolean boolean12 = textNode9.isBlank();
        boolean boolean13 = textNode9.isBlank();
        java.lang.String str14 = textNode9.text();
        int int15 = textNode9.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.parent();
        java.lang.String str12 = node10.baseUri();
        try {
            org.jsoup.nodes.Node node14 = node10.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int8 = textNode7.siblingIndex();
        org.jsoup.nodes.Document document9 = textNode7.ownerDocument();
        int int10 = textNode7.childNodeSize();
        org.jsoup.nodes.Node node12 = textNode7.removeAttr("i!");
        try {
            node4.replaceWith(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getWholeText();
        int int11 = textNode2.childNodeSize();
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
        java.lang.String str37 = textNode29.getWholeText();
        java.lang.String str38 = textNode29.baseUri();
        boolean boolean39 = textNode2.equals((java.lang.Object) textNode29);
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node19 = node18.unwrap();
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
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str11 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.text();
        int int7 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.String str16 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        textNode2.setBaseUri("hi!");
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.jsoup.nodes.Node node23 = node21.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodesCopy();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str12 = textNode7.absUrl("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode7.childNodes();
        org.jsoup.nodes.Node node15 = textNode7.removeAttr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.getWholeText();
        int int8 = textNode2.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.parent();
        java.lang.String str12 = node10.baseUri();
        try {
            org.jsoup.nodes.Node node13 = node10.unwrap();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        textNode10.setBaseUri("i!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        node31.setBaseUri("#text");
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
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        int int13 = textNode2.siblingIndex();
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
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.equals((java.lang.Object) "h");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.lang.String str17 = textNode12.text();
        org.jsoup.nodes.Attributes attributes18 = textNode12.attributes();
        java.lang.String str19 = textNode12.text();
        boolean boolean21 = textNode12.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode12.childNodes();
        java.lang.String str23 = textNode12.nodeName();
        java.lang.String str24 = textNode12.nodeName();
        try {
            org.jsoup.nodes.Node node25 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        try {
            int int6 = node5.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        java.lang.String str15 = textNode2.baseUri();
        boolean boolean17 = textNode2.hasAttr("hi!");
        java.lang.Class<?> wildcardClass18 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str22 = textNode21.getWholeText();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean26 = textNode21.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node27 = textNode21.parent();
        java.lang.String str28 = textNode21.toString();
        int int29 = textNode21.siblingIndex();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode21);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.jsoup.nodes.Node node13 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node15 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("hi!");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        int int8 = textNode6.childNodeSize();
        java.lang.String str9 = textNode6.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode12.childNodes();
        org.jsoup.nodes.Attributes attributes29 = textNode12.attributes();
        java.lang.Class<?> wildcardClass30 = textNode12.getClass();
        boolean boolean32 = textNode12.hasAttr("");
        int int33 = textNode12.childNodeSize();
        try {
            org.jsoup.nodes.Node node34 = textNode2.after((org.jsoup.nodes.Node) textNode12);
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
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        try {
            java.lang.String str17 = node16.baseUri();
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
            textNode14.remove();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node18 = textNode2.attr("i!", "");
        try {
            org.jsoup.nodes.Node node19 = textNode2.unwrap();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        try {
            node10.setBaseUri("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.jsoup.nodes.Node node12 = node10.parent();
        org.jsoup.nodes.Document document13 = node10.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node10.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        try {
            org.jsoup.nodes.Node node16 = node10.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        try {
            org.jsoup.nodes.Node node3 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        java.lang.String str23 = textNode20.nodeName();
        java.lang.String str24 = textNode20.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.childNodes();
        org.jsoup.nodes.TextNode textNode27 = textNode20.text("#text");
        boolean boolean29 = textNode27.hasAttr("hi!");
        java.lang.String str30 = textNode27.nodeName();
        java.lang.String str31 = textNode27.nodeName();
        try {
            org.jsoup.nodes.Node node32 = textNode2.after((org.jsoup.nodes.Node) textNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode12.isBlank();
        java.lang.Class<?> wildcardClass14 = textNode12.getClass();
        org.jsoup.nodes.Attributes attributes15 = textNode12.attributes();
        boolean boolean16 = node9.equals((java.lang.Object) textNode12);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node9.childNodes();
        int int18 = node9.siblingIndex();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str22 = textNode21.outerHtml();
        try {
            org.jsoup.nodes.Node node23 = node9.after((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        org.jsoup.nodes.Document document13 = textNode12.ownerDocument();
        try {
            document13.setBaseUri("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        int int5 = textNode4.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode4.text("#text");
        textNode4.setBaseUri("h");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode12.attr("hi!", "#text");
        int int16 = node15.childNodeSize();
        try {
            textNode4.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        boolean boolean23 = textNode2.hasAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        java.lang.String str3 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node11 = node10.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.childNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode11.childNodesCopy();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean23 = textNode11.equals((java.lang.Object) textNode22);
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.childNodesCopy();
        int int28 = textNode26.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode26.removeAttr("#text");
        java.lang.String str31 = textNode26.getWholeText();
        java.lang.String str32 = textNode26.baseUri();
        boolean boolean33 = textNode22.equals((java.lang.Object) textNode26);
        java.lang.String str34 = textNode26.getWholeText();
        java.lang.String str35 = textNode26.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode26.childNodes();
        try {
            org.jsoup.nodes.Node node37 = textNode2.before((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.outerHtml();
        boolean boolean11 = textNode2.hasAttr("");
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.jsoup.nodes.Node node19 = textNode10.clone();
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("h");
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str14 = textNode13.getWholeText();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean18 = textNode13.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node19 = textNode13.parent();
        org.jsoup.nodes.Node node20 = textNode13.clone();
        org.jsoup.nodes.Node node21 = textNode13.nextSibling();
        boolean boolean22 = textNode13.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode13.childNodesCopy();
        boolean boolean25 = textNode13.hasAttr("h");
        try {
            org.jsoup.nodes.Node node26 = textNode8.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        try {
            textNode2.remove();
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
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode8.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        boolean boolean13 = textNode2.equals((java.lang.Object) node11);
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean17 = textNode16.isBlank();
        textNode16.setBaseUri("h");
        java.lang.String str20 = textNode16.nodeName();
        int int21 = textNode16.childNodeSize();
        try {
            node11.replaceWith((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.jsoup.nodes.Node node61 = textNode13.clone();
        boolean boolean62 = textNode13.isBlank();
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
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        java.lang.String str12 = textNode2.absUrl("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean21 = textNode20.isBlank();
        java.lang.String str22 = textNode20.toString();
        java.lang.String str23 = textNode20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.siblingNodes();
        try {
            org.jsoup.nodes.Node node25 = textNode2.before((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        try {
            java.lang.String str10 = node9.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.lang.Class<?> wildcardClass17 = textNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str14 = textNode10.toString();
        int int15 = textNode10.childNodeSize();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode18.text("hi!");
        java.lang.String str21 = textNode18.outerHtml();
        org.jsoup.nodes.Node node24 = textNode18.attr("hi!", "#text");
        org.jsoup.nodes.Node node25 = textNode18.clone();
        boolean boolean26 = textNode10.equals((java.lang.Object) textNode18);
        org.jsoup.nodes.Node node27 = textNode10.nextSibling();
        java.lang.Class<?> wildcardClass28 = textNode10.getClass();
        boolean boolean29 = textNode2.equals((java.lang.Object) wildcardClass28);
        org.jsoup.nodes.TextNode textNode32 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode32.childNodesCopy();
        int int34 = textNode32.siblingIndex();
        java.lang.String str35 = textNode32.nodeName();
        java.lang.String str36 = textNode32.toString();
        java.lang.String str37 = textNode32.text();
        int int38 = textNode32.siblingIndex();
        org.jsoup.nodes.TextNode textNode41 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = textNode41.childNodesCopy();
        int int43 = textNode41.siblingIndex();
        java.lang.String str44 = textNode41.nodeName();
        java.lang.String str45 = textNode41.toString();
        int int46 = textNode41.siblingIndex();
        boolean boolean47 = textNode32.equals((java.lang.Object) int46);
        org.jsoup.nodes.TextNode textNode49 = textNode32.text("");
        org.jsoup.nodes.Node node50 = textNode32.nextSibling();
        java.lang.String str52 = textNode32.attr("#text");
        int int53 = textNode32.siblingIndex();
        org.jsoup.nodes.Node node54 = textNode32.clone();
        try {
            org.jsoup.nodes.Node node55 = textNode2.after((org.jsoup.nodes.Node) textNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "#text" + "'", str35.equals("#text"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "#text" + "'", str44.equals("#text"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(textNode49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        org.jsoup.nodes.Node node22 = textNode2.parent();
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int22 = textNode21.siblingIndex();
        org.jsoup.nodes.Document document23 = textNode21.ownerDocument();
        org.jsoup.nodes.Node node24 = textNode21.parent();
        try {
            org.jsoup.nodes.Node node25 = textNode2.after(node24);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!" + "'", str18.equals("i!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str13 = textNode2.attr("hi!");
        try {
            org.jsoup.nodes.Node node14 = textNode2.unwrap();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = textNode4.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode4.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode4.clone();
        int int13 = node12.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        try {
            java.lang.String str6 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = textNode4.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode4.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("hi!");
        java.lang.String str17 = textNode14.outerHtml();
        org.jsoup.nodes.Node node20 = textNode14.attr("hi!", "#text");
        org.jsoup.nodes.Node node21 = textNode14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode14.siblingNodes();
        java.lang.String str24 = textNode14.attr("hi!");
        boolean boolean25 = textNode14.isBlank();
        java.lang.String str27 = textNode14.absUrl("hi!");
        try {
            org.jsoup.nodes.Node node28 = textNode4.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str12 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node14 = textNode2.after("h");
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
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(1);
        boolean boolean13 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node14 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("#text");
        try {
            org.jsoup.nodes.Node node9 = textNode5.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        try {
            org.jsoup.nodes.Node node15 = textNode2.after("hi!");
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
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean16 = textNode13.hasAttr("hi!");
        java.lang.String str17 = textNode13.text();
        java.lang.String str18 = textNode13.getWholeText();
        try {
            org.jsoup.nodes.Node node19 = node10.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        try {
            textNode19.remove();
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(textNode22);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        java.lang.String str7 = textNode2.baseUri();
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        int int9 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "#text");
        int int12 = node11.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str16 = textNode15.baseUri();
        boolean boolean18 = textNode15.hasAttr("hi!");
        boolean boolean19 = textNode15.isBlank();
        java.lang.Class<?> wildcardClass20 = textNode15.getClass();
        try {
            org.jsoup.nodes.Node node21 = node11.after((org.jsoup.nodes.Node) textNode15);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.outerHtml();
        boolean boolean17 = textNode2.isBlank();
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode16.childNodes();
        org.jsoup.nodes.TextNode textNode23 = textNode16.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode16.childNodesCopy();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean28 = textNode16.equals((java.lang.Object) textNode27);
        org.jsoup.nodes.Node node29 = textNode16.parent();
        java.lang.String str30 = textNode16.toString();
        org.jsoup.nodes.Node node31 = textNode16.previousSibling();
        java.lang.String str32 = textNode16.getWholeText();
        org.jsoup.nodes.Node node34 = textNode16.removeAttr("i!");
        boolean boolean35 = textNode16.isBlank();
        boolean boolean36 = node12.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass7 = nodeList6.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.jsoup.nodes.Node node23 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node25 = node23.before("");
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
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str26 = textNode24.attr("#text");
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        org.jsoup.nodes.Attributes attributes31 = textNode29.attributes();
        java.lang.String str32 = textNode29.toString();
        boolean boolean33 = textNode24.equals((java.lang.Object) str32);
        try {
            org.jsoup.nodes.Node node34 = textNode2.after((org.jsoup.nodes.Node) textNode24);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "h" + "'", str10.equals("h"));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        try {
            org.jsoup.nodes.Node node19 = textNode2.traverse(nodeVisitor18);
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        textNode2.setBaseUri("");
        int int12 = textNode2.childNodeSize();
        boolean boolean13 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        try {
            java.lang.String str21 = textNode2.absUrl("");
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        java.lang.String str17 = textNode2.getWholeText();
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
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        org.jsoup.nodes.Node node19 = textNode16.previousSibling();
        java.lang.String str20 = textNode16.nodeName();
        org.jsoup.nodes.Node node21 = textNode16.clone();
        org.jsoup.nodes.Node node22 = node21.nextSibling();
        try {
            textNode2.replaceWith(node21);
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Document document11 = textNode10.ownerDocument();
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
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode31 = textNode29.text("hi!");
        org.jsoup.nodes.Node node32 = textNode29.nextSibling();
        java.lang.String str33 = textNode29.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode29.siblingNodes();
        boolean boolean35 = textNode21.equals((java.lang.Object) textNode29);
        boolean boolean36 = textNode10.equals((java.lang.Object) textNode21);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        textNode2.setBaseUri("i!");
        try {
            org.jsoup.nodes.Node node14 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("hi!");
        java.lang.String str17 = textNode16.nodeName();
        java.lang.String str19 = textNode16.absUrl("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        org.jsoup.nodes.Node node16 = textNode10.previousSibling();
        try {
            org.jsoup.nodes.Node node17 = textNode2.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.toString();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.String str20 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node22 = textNode2.after("hi!");
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.jsoup.nodes.TextNode textNode34 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode36 = textNode34.text("hi!");
        java.lang.String str37 = textNode34.outerHtml();
        org.jsoup.nodes.Node node40 = textNode34.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes41 = textNode34.attributes();
        org.jsoup.nodes.Node node42 = textNode34.parent();
        java.lang.String str44 = textNode34.absUrl("#text");
        java.lang.String str45 = textNode34.toString();
        textNode34.setBaseUri("");
        org.jsoup.nodes.TextNode textNode49 = textNode34.text("");
        org.jsoup.nodes.TextNode textNode51 = textNode49.text("hi!");
        try {
            org.jsoup.nodes.Node node52 = textNode13.after((org.jsoup.nodes.Node) textNode49);
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
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode49);
        org.junit.Assert.assertNotNull(textNode51);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Node node13 = textNode2.attr("i!", "h");
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
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        try {
            int int8 = node7.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        java.lang.String str16 = textNode10.outerHtml();
        org.jsoup.nodes.Node node17 = textNode10.parent();
        java.lang.String str18 = textNode10.nodeName();
        org.jsoup.nodes.Node node19 = textNode10.clone();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode10);
        textNode10.setBaseUri("h");
        boolean boolean23 = textNode10.isBlank();
        try {
            org.jsoup.nodes.Node node25 = textNode10.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode34.childNodesCopy();
        int int36 = textNode34.siblingIndex();
        java.lang.String str37 = textNode34.nodeName();
        java.lang.String str38 = textNode34.toString();
        java.lang.String str39 = textNode34.text();
        int int40 = textNode34.siblingIndex();
        org.jsoup.nodes.TextNode textNode43 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode43.childNodesCopy();
        int int45 = textNode43.siblingIndex();
        java.lang.String str46 = textNode43.nodeName();
        java.lang.String str47 = textNode43.toString();
        int int48 = textNode43.siblingIndex();
        boolean boolean49 = textNode34.equals((java.lang.Object) int48);
        org.jsoup.nodes.TextNode textNode51 = textNode34.text("");
        org.jsoup.nodes.Node node52 = textNode34.nextSibling();
        java.lang.String str54 = textNode34.attr("#text");
        java.lang.String str55 = textNode34.text();
        org.jsoup.nodes.Node node56 = textNode34.clone();
        try {
            org.jsoup.nodes.Node node57 = node31.after(node56);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "#text" + "'", str37.equals("#text"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "#text" + "'", str46.equals("#text"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(textNode51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        try {
            org.jsoup.nodes.Node node18 = textNode2.traverse(nodeVisitor17);
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
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        int int27 = textNode24.siblingIndex();
        try {
            textNode24.remove();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        int int11 = node10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node10.childNodes();
        int int13 = node10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node10.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str11 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        textNode2.setBaseUri("#text");
        try {
            org.jsoup.nodes.Node node16 = textNode2.before("");
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node15 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        int int24 = textNode13.childNodeSize();
        java.lang.String str25 = textNode13.getWholeText();
        try {
            org.jsoup.nodes.Node node27 = textNode13.after("i!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        try {
            org.jsoup.nodes.Node node24 = textNode19.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node21 = textNode20.parent();
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
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode12.isBlank();
        java.lang.Class<?> wildcardClass14 = textNode12.getClass();
        org.jsoup.nodes.Attributes attributes15 = textNode12.attributes();
        boolean boolean16 = node9.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Node node17 = textNode12.previousSibling();
        try {
            org.jsoup.nodes.Node node19 = textNode12.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        int int16 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node19 = node18.parent();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodesCopy();
        int int24 = textNode22.childNodeSize();
        org.jsoup.nodes.Document document25 = textNode22.ownerDocument();
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean30 = textNode28.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes31 = textNode28.attributes();
        java.lang.String str32 = textNode28.outerHtml();
        java.lang.Class<?> wildcardClass33 = textNode28.getClass();
        java.lang.String str34 = textNode28.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode28.siblingNodes();
        int int36 = textNode28.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode28.siblingNodes();
        try {
            org.jsoup.nodes.Node node38 = textNode22.after((org.jsoup.nodes.Node) textNode28);
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        node17.setBaseUri("");
        boolean boolean20 = textNode2.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node21 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        org.jsoup.nodes.Attributes attributes8 = textNode6.attributes();
        try {
            org.jsoup.nodes.Node node9 = textNode6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Document document9 = document8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        java.lang.String str15 = node14.outerHtml();
        int int16 = node14.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node18 = textNode2.attr("i!", "");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        int int23 = textNode21.siblingIndex();
        java.lang.String str24 = textNode21.nodeName();
        java.lang.String str25 = textNode21.toString();
        java.lang.String str26 = textNode21.text();
        org.jsoup.nodes.Attributes attributes27 = textNode21.attributes();
        java.lang.String str28 = textNode21.text();
        boolean boolean30 = textNode21.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.TextNode textNode32 = textNode21.splitText(0);
        java.lang.String str33 = textNode21.outerHtml();
        try {
            org.jsoup.nodes.Node node34 = node18.before((org.jsoup.nodes.Node) textNode21);
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        int int13 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node15 = textNode2.before("#text");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        int int21 = textNode19.siblingIndex();
        java.lang.String str22 = textNode19.nodeName();
        java.lang.String str23 = textNode19.toString();
        java.lang.String str24 = textNode19.toString();
        boolean boolean26 = textNode19.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode19.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode19.childNodes();
        java.lang.String str29 = textNode19.nodeName();
        textNode19.setBaseUri("h");
        java.lang.String str32 = textNode19.outerHtml();
        int int33 = textNode19.childNodeSize();
        try {
            org.jsoup.nodes.Node node34 = textNode2.after((org.jsoup.nodes.Node) textNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node12 = node10.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        java.lang.String str11 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node10 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int17 = textNode16.siblingIndex();
        org.jsoup.nodes.Document document18 = textNode16.ownerDocument();
        int int19 = textNode16.childNodeSize();
        java.lang.Class<?> wildcardClass20 = textNode16.getClass();
        org.jsoup.nodes.TextNode textNode22 = textNode16.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodesCopy();
        org.jsoup.nodes.Document document24 = textNode22.ownerDocument();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) document24);
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
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        int int13 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "i!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode11.previousSibling();
        java.lang.String str15 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode17 = textNode11.text("#text");
        java.lang.String str19 = textNode17.attr("");
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        int int8 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.attr("hi!");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        org.jsoup.nodes.Document document25 = textNode24.ownerDocument();
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
        textNode2.setBaseUri("");
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node10 = textNode9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode12.isBlank();
        java.lang.Class<?> wildcardClass14 = textNode12.getClass();
        org.jsoup.nodes.Attributes attributes15 = textNode12.attributes();
        boolean boolean16 = node9.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode21 = textNode19.text("hi!");
        java.lang.String str22 = textNode19.outerHtml();
        org.jsoup.nodes.Node node25 = textNode19.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes26 = textNode19.attributes();
        org.jsoup.nodes.Node node27 = textNode19.parent();
        java.lang.String str29 = textNode19.absUrl("#text");
        java.lang.String str30 = textNode19.toString();
        org.jsoup.nodes.Node node33 = textNode19.attr("#text", "i!");
        try {
            org.jsoup.nodes.Node node34 = textNode12.before(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.setBaseUri("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        try {
            org.jsoup.nodes.Node node26 = textNode2.before("h");
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        try {
            org.jsoup.nodes.Node node23 = textNode2.after("#text");
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        boolean boolean11 = textNode2.hasAttr("h");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.lang.String str23 = textNode2.text();
        org.jsoup.nodes.Node node24 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode27 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode29 = textNode27.text("hi!");
        java.lang.String str30 = textNode27.outerHtml();
        org.jsoup.nodes.Node node31 = textNode27.previousSibling();
        boolean boolean33 = textNode27.hasAttr("#text");
        boolean boolean34 = node24.equals((java.lang.Object) textNode27);
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
        org.jsoup.nodes.Node node57 = node56.clone();
        org.jsoup.nodes.Node node58 = node56.clone();
        try {
            org.jsoup.nodes.Node node59 = textNode27.before(node56);
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
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        try {
            org.jsoup.nodes.Node node19 = textNode2.before("");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        org.jsoup.nodes.Node node22 = textNode9.nextSibling();
        org.jsoup.nodes.Node node24 = textNode9.removeAttr("i!");
        org.jsoup.nodes.Document document25 = node24.ownerDocument();
        try {
            node24.remove();
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = textNode2.traverse(nodeVisitor12);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("hi!");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        boolean boolean7 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.jsoup.nodes.Node node24 = textNode2.attr("h", "i!");
        try {
            org.jsoup.nodes.Node node26 = textNode2.childNode((int) (short) 0);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        try {
            org.jsoup.nodes.Node node14 = textNode2.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.lang.Class<?> wildcardClass27 = textNode17.getClass();
        org.jsoup.nodes.Attributes attributes28 = textNode17.attributes();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        boolean boolean25 = textNode9.hasAttr("");
        try {
            org.jsoup.nodes.Node node27 = textNode9.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
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
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("h");
        java.lang.String str11 = textNode2.attr("hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "#text");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        try {
            org.jsoup.nodes.Node node28 = textNode2.before("#text");
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
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.baseUri();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.absUrl("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node17 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        org.jsoup.nodes.Node node12 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node14 = node12.after("i!");
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        try {
            org.jsoup.nodes.Node node10 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        boolean boolean14 = textNode2.hasAttr("#text");
        int int15 = textNode2.childNodeSize();
        java.lang.String str16 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = textNode2.getWholeText();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        org.jsoup.nodes.Node node24 = node10.nextSibling();
        java.lang.String str25 = node10.baseUri();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode28.childNodes();
        org.jsoup.nodes.Node node30 = textNode28.parent();
        try {
            org.jsoup.nodes.Node node31 = node10.before(node30);
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
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.text();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }
}

