import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        textNode11.setBaseUri("");
        textNode11.setBaseUri("h");
        try {
            org.jsoup.nodes.Node node19 = textNode11.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.text();
        textNode2.setBaseUri("h");
        int int7 = textNode2.siblingIndex();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        int int9 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str20 = textNode15.attr("");
        org.jsoup.nodes.Node node21 = textNode15.previousSibling();
        org.jsoup.nodes.TextNode textNode23 = textNode15.text("hi!");
        org.jsoup.nodes.Attributes attributes24 = textNode15.attributes();
        java.lang.String str25 = textNode15.toString();
        java.lang.String str26 = textNode15.text();
        try {
            org.jsoup.nodes.Node node27 = textNode12.after((org.jsoup.nodes.Node) textNode15);
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        int int11 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.attr("h", "");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        org.jsoup.nodes.Node node17 = textNode14.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
        int int19 = node17.childNodeSize();
        try {
            org.jsoup.nodes.Node node20 = textNode2.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        org.jsoup.nodes.Node node8 = textNode4.removeAttr("i!");
        java.lang.String str9 = textNode4.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        try {
            org.jsoup.nodes.Node node26 = textNode20.traverse(nodeVisitor25);
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
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        java.lang.String str15 = textNode9.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodesCopy();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node16 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        boolean boolean8 = textNode2.hasAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        int int14 = textNode2.siblingIndex();
        try {
            org.jsoup.nodes.Node node16 = textNode2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "i!" + "'", str12.equals("i!"));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        java.lang.String str11 = textNode2.toString();
        java.lang.String str13 = textNode2.absUrl("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "i!" + "'", str11.equals("i!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        org.jsoup.nodes.Node node18 = textNode17.parent();
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
            org.jsoup.nodes.Node node25 = node23.wrap("#text");
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
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        java.lang.Class<?> wildcardClass10 = textNode9.getClass();
        try {
            org.jsoup.nodes.Node node11 = textNode2.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.attr("hi!", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodesCopy();
        java.lang.String str15 = node13.outerHtml();
        org.jsoup.nodes.Node node16 = node13.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node13.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
            java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodesCopy();
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
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node15 = textNode2.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        java.lang.String str18 = textNode14.attr("i!");
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.text();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        try {
            org.jsoup.nodes.Node node31 = textNode17.before("i!");
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.hasAttr("#text");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.Object obj6 = null;
        boolean boolean7 = textNode2.equals(obj6);
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean11 = textNode2.hasAttr("h");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        int int6 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.absUrl("#text");
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        org.jsoup.nodes.Node node22 = node21.previousSibling();
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode24 = textNode22.text("hi!");
        org.jsoup.nodes.TextNode textNode26 = textNode24.text("hi!");
        java.lang.String str28 = textNode24.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode24.childNodesCopy();
        java.lang.Class<?> wildcardClass30 = textNode24.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode24.childNodesCopy();
        org.jsoup.nodes.Node node32 = textNode24.clone();
        try {
            org.jsoup.nodes.Node node33 = textNode2.after((org.jsoup.nodes.Node) textNode24);
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str8 = textNode6.attr("");
        textNode6.setBaseUri("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.attr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        java.lang.String str6 = textNode2.nodeName();
        int int7 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str11 = textNode2.attr("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.setBaseUri("");
        try {
            org.jsoup.nodes.Node node18 = textNode2.before("i!");
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
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        java.lang.String str18 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.Node node20 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        org.jsoup.nodes.Node node22 = textNode2.parent();
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        textNode2.setBaseUri("");
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
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        java.lang.String str8 = textNode2.attr("");
        try {
            java.lang.String str10 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        try {
            org.jsoup.nodes.Node node15 = textNode2.unwrap();
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
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        org.jsoup.nodes.Node node22 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node24 = textNode2.childNode((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        int int11 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.absUrl("h");
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str17 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("#text");
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        java.lang.Class<?> wildcardClass22 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        org.jsoup.nodes.Attributes attributes23 = textNode20.attributes();
        java.lang.String str24 = textNode20.getWholeText();
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
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "i!" + "'", str24.equals("i!"));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        java.lang.String str15 = textNode11.absUrl("i!");
        org.jsoup.nodes.Attributes attributes16 = textNode11.attributes();
        java.lang.String str18 = textNode11.attr("#text");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.Class<?> wildcardClass9 = textNode5.getClass();
        org.jsoup.nodes.TextNode textNode11 = textNode5.text("h");
        java.lang.String str12 = textNode5.outerHtml();
        org.jsoup.nodes.Node node13 = textNode5.previousSibling();
        java.lang.String str14 = textNode5.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "h" + "'", str12.equals("h"));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("#text");
        try {
            org.jsoup.nodes.Node node24 = textNode22.after("");
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
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node9 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.Node node14 = textNode11.attr("h", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "#text");
        java.lang.String str4 = textNode2.absUrl("#text");
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        org.jsoup.nodes.Node node14 = textNode2.clone();
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        try {
            org.jsoup.nodes.Node node17 = node14.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
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
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "i!");
        java.lang.String str11 = node10.baseUri();
        org.jsoup.nodes.Node node12 = node10.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        java.lang.String str16 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode21 = textNode19.text("hi!");
        org.jsoup.nodes.Node node22 = textNode19.previousSibling();
        try {
            org.jsoup.nodes.Node node23 = textNode2.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        boolean boolean21 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.outerHtml();
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node13 = textNode2.attr("h", "#text");
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode23 = textNode21.text("hi!");
        java.lang.String str24 = textNode21.outerHtml();
        java.lang.String str25 = textNode21.getWholeText();
        java.lang.String str27 = textNode21.absUrl("#text");
        org.jsoup.nodes.TextNode textNode29 = textNode21.text("hi!");
        org.jsoup.nodes.Document document30 = textNode29.ownerDocument();
        try {
            org.jsoup.nodes.Node node31 = textNode2.after((org.jsoup.nodes.Node) document30);
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
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node20 = textNode2.previousSibling();
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node8 = node7.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
            org.jsoup.nodes.Node node23 = node20.childNode((int) (short) 0);
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
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode17.siblingNodes();
        java.lang.String str27 = textNode17.outerHtml();
        try {
            java.lang.String str29 = textNode17.absUrl("");
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = node10.clone();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        textNode14.setBaseUri("#text");
        try {
            org.jsoup.nodes.Node node18 = node11.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        org.jsoup.nodes.Node node8 = textNode5.nextSibling();
        try {
            textNode5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        org.jsoup.nodes.Node node21 = textNode12.removeAttr("hi!");
        try {
            org.jsoup.nodes.TextNode textNode23 = textNode12.splitText((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.getWholeText();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        int int5 = textNode4.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode4.text("#text");
        java.lang.String str8 = textNode4.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode4.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("hi!");
        try {
            node16.remove();
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        org.jsoup.nodes.Node node19 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        org.jsoup.nodes.Node node17 = textNode9.parent();
        try {
            org.jsoup.nodes.TextNode textNode19 = textNode9.splitText((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.jsoup.nodes.Attributes attributes23 = textNode9.attributes();
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
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        int int11 = textNode2.childNodeSize();
        textNode2.setBaseUri("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str20 = textNode19.text();
        textNode19.setBaseUri("");
        int int23 = textNode19.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode19.siblingNodes();
        java.lang.String str25 = textNode19.outerHtml();
        int int26 = textNode19.childNodeSize();
        try {
            org.jsoup.nodes.Node node27 = node16.before((org.jsoup.nodes.Node) textNode19);
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode8.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        boolean boolean13 = textNode2.equals((java.lang.Object) node11);
        org.jsoup.nodes.Node node16 = textNode2.attr("h", "h");
        java.lang.String str17 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        java.lang.String str9 = textNode8.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        try {
            java.lang.String str25 = textNode15.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
            org.jsoup.nodes.Node node28 = textNode17.before("");
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
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node12 = textNode2.attr("i!", "");
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        textNode2.setBaseUri("h");
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Node node14 = node12.nextSibling();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str12 = textNode7.absUrl("i!");
        java.lang.String str13 = textNode7.getWholeText();
        org.jsoup.nodes.Node node14 = textNode7.parent();
        java.lang.Object obj15 = null;
        boolean boolean16 = textNode7.equals(obj15);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        try {
            org.jsoup.nodes.Node node7 = textNode6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.outerHtml();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        try {
            java.lang.String str6 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        textNode2.setBaseUri("#text");
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int10 = textNode9.siblingIndex();
        org.jsoup.nodes.Document document11 = textNode9.ownerDocument();
        int int12 = textNode9.childNodeSize();
        org.jsoup.nodes.TextNode textNode14 = textNode9.text("i!");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        org.jsoup.nodes.Node node14 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.lang.String str17 = textNode12.toString();
        java.lang.Class<?> wildcardClass18 = textNode12.getClass();
        try {
            org.jsoup.nodes.Node node19 = textNode12.unwrap();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        boolean boolean8 = textNode5.isBlank();
        java.lang.String str10 = textNode5.attr("i!");
        org.jsoup.nodes.Node node11 = textNode5.parent();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("hi!");
        java.lang.String str17 = textNode14.outerHtml();
        org.jsoup.nodes.Node node20 = textNode14.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes21 = textNode14.attributes();
        org.jsoup.nodes.Node node22 = textNode14.parent();
        java.lang.String str24 = textNode14.absUrl("#text");
        java.lang.String str25 = textNode14.toString();
        textNode14.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode14.siblingNodes();
        java.lang.String str30 = textNode14.attr("hi!");
        boolean boolean31 = textNode5.equals((java.lang.Object) textNode14);
        java.lang.String str32 = textNode14.nodeName();
        java.lang.String str33 = textNode14.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        try {
            org.jsoup.nodes.Node node29 = textNode24.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
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
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        java.lang.String str23 = textNode2.attr("");
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
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        java.lang.String str26 = textNode12.absUrl("hi!");
        java.lang.String str27 = textNode12.nodeName();
        org.jsoup.nodes.Node node28 = textNode12.previousSibling();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        int int6 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        java.lang.String str24 = textNode17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.childNodes();
        try {
            org.jsoup.nodes.Node node26 = textNode14.after((org.jsoup.nodes.Node) textNode17);
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Node node14 = textNode12.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        java.lang.String str29 = textNode2.absUrl("#text");
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        boolean boolean14 = textNode2.hasAttr("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
            org.jsoup.nodes.Node node33 = textNode2.after("");
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
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        java.lang.String str17 = textNode2.nodeName();
        java.lang.String str18 = textNode2.outerHtml();
        java.lang.String str19 = textNode2.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        java.lang.String str21 = textNode19.getWholeText();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        int int9 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node17 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.Node node8 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        java.lang.String str15 = textNode12.attr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        java.lang.String str19 = textNode13.getWholeText();
        java.lang.String str20 = textNode13.nodeName();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        java.lang.String str14 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = node6.nextSibling();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode10.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        org.jsoup.nodes.Attributes attributes15 = textNode13.attributes();
        boolean boolean16 = node6.equals((java.lang.Object) attributes15);
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        try {
            org.jsoup.nodes.Node node18 = node6.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        java.lang.Class<?> wildcardClass21 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node23 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        org.jsoup.select.NodeVisitor nodeVisitor33 = null;
        try {
            org.jsoup.nodes.Node node34 = textNode17.traverse(nodeVisitor33);
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
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.jsoup.nodes.Node node22 = textNode2.parent();
        boolean boolean23 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int27 = textNode26.siblingIndex();
        org.jsoup.nodes.Document document28 = textNode26.ownerDocument();
        textNode26.setBaseUri("#text");
        boolean boolean31 = textNode26.isBlank();
        org.jsoup.nodes.TextNode textNode34 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode36 = textNode34.text("hi!");
        org.jsoup.nodes.TextNode textNode38 = textNode36.text("hi!");
        boolean boolean39 = textNode26.equals((java.lang.Object) "hi!");
        boolean boolean41 = textNode26.hasAttr("i!");
        java.lang.String str42 = textNode26.nodeName();
        java.lang.String str43 = textNode26.baseUri();
        try {
            org.jsoup.nodes.Node node44 = textNode2.before((org.jsoup.nodes.Node) textNode26);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "#text" + "'", str42.equals("#text"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "#text" + "'", str43.equals("#text"));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("hi!");
        boolean boolean15 = textNode2.equals((java.lang.Object) "hi!");
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
        org.jsoup.nodes.TextNode textNode36 = textNode18.text("");
        java.lang.Class<?> wildcardClass37 = textNode18.getClass();
        boolean boolean38 = textNode2.equals((java.lang.Object) textNode18);
        java.lang.String str39 = textNode18.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.hasAttr("hi!");
        java.lang.String str12 = textNode9.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode9.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.siblingNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("hi!");
        java.lang.String str19 = textNode14.attr("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        try {
            org.jsoup.nodes.TextNode textNode30 = textNode28.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        org.jsoup.nodes.Node node22 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node24 = textNode2.before("#text");
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        int int5 = textNode4.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode4.text("#text");
        java.lang.String str8 = textNode7.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node14 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean16 = textNode14.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = textNode14.attributes();
        java.lang.String str18 = textNode14.outerHtml();
        org.jsoup.nodes.Node node19 = textNode14.nextSibling();
        java.lang.String str20 = textNode14.toString();
        java.lang.String str21 = textNode14.getWholeText();
        int int22 = textNode14.childNodeSize();
        org.jsoup.nodes.Node node23 = textNode14.nextSibling();
        try {
            org.jsoup.nodes.Node node24 = textNode2.before((org.jsoup.nodes.Node) textNode14);
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
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.Object obj12 = null;
        boolean boolean13 = textNode2.equals(obj12);
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode2.splitText((int) (byte) 0);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        int int14 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Node node14 = textNode12.removeAttr("hi!");
        int int15 = textNode12.siblingIndex();
        try {
            org.jsoup.nodes.Node node18 = textNode12.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        int int14 = textNode2.childNodeSize();
        java.lang.String str15 = textNode2.text();
        org.jsoup.nodes.Node node18 = textNode2.attr("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        org.jsoup.nodes.Node node23 = textNode20.previousSibling();
        org.jsoup.nodes.Node node24 = textNode20.parent();
        java.lang.String str26 = textNode20.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        int int31 = textNode29.siblingIndex();
        org.jsoup.nodes.Node node33 = textNode29.removeAttr("#text");
        java.lang.String str34 = textNode29.getWholeText();
        java.lang.String str35 = textNode29.baseUri();
        boolean boolean37 = textNode29.hasAttr("hi!");
        boolean boolean38 = textNode29.isBlank();
        org.jsoup.nodes.TextNode textNode40 = textNode29.splitText(0);
        try {
            textNode20.replaceWith((org.jsoup.nodes.Node) textNode40);
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(textNode40);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        java.lang.String str34 = textNode17.attr("i!");
        org.jsoup.nodes.Node node36 = textNode17.removeAttr("#text");
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Document document9 = node8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
            java.lang.Class<?> wildcardClass25 = node24.getClass();
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
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        org.jsoup.nodes.Node node22 = textNode18.removeAttr("#text");
        java.lang.String str23 = textNode18.getWholeText();
        java.lang.String str24 = textNode18.baseUri();
        boolean boolean26 = textNode18.hasAttr("hi!");
        boolean boolean27 = textNode18.isBlank();
        org.jsoup.nodes.TextNode textNode29 = textNode18.splitText(0);
        boolean boolean30 = node15.equals((java.lang.Object) textNode18);
        boolean boolean31 = textNode18.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str11 = textNode10.getWholeText();
        java.lang.String str12 = textNode10.text();
        try {
            org.jsoup.nodes.Node node13 = textNode2.before((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text();
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean15 = textNode14.isBlank();
        boolean boolean17 = textNode14.hasAttr("hi!");
        int int18 = textNode14.childNodeSize();
        java.lang.String str19 = textNode14.text();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("hi!");
        org.jsoup.nodes.Node node22 = textNode14.previousSibling();
        try {
            org.jsoup.nodes.Node node23 = textNode2.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
        org.jsoup.nodes.Node node22 = textNode2.attr("hi!", "");
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        try {
            org.jsoup.nodes.Node node24 = node22.traverse(nodeVisitor23);
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str4 = textNode2.absUrl("i!");
        java.lang.String str6 = textNode2.absUrl("h");
        boolean boolean8 = textNode2.hasAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("h");
        boolean boolean12 = textNode2.hasAttr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        int int13 = node12.siblingIndex();
        org.jsoup.nodes.Node node14 = node12.nextSibling();
        try {
            java.lang.String str15 = node14.outerHtml();
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean5 = textNode2.hasAttr("h");
        boolean boolean7 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        java.lang.String str24 = textNode2.absUrl("hi!");
        java.lang.String str25 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        java.lang.String str38 = textNode13.nodeName();
        org.jsoup.nodes.TextNode textNode41 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str43 = textNode41.attr("#text");
        org.jsoup.nodes.TextNode textNode46 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode46.childNodesCopy();
        org.jsoup.nodes.Attributes attributes48 = textNode46.attributes();
        java.lang.String str49 = textNode46.toString();
        boolean boolean50 = textNode41.equals((java.lang.Object) str49);
        boolean boolean51 = textNode13.equals((java.lang.Object) boolean50);
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "#text" + "'", str38.equals("#text"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertNotNull(textNode46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        java.lang.String str15 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.absUrl("h");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("i!");
        java.lang.String str10 = textNode2.absUrl("h");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node17 = textNode13.clone();
        java.lang.Class<?> wildcardClass18 = textNode13.getClass();
        org.jsoup.nodes.Node node19 = textNode13.nextSibling();
        boolean boolean20 = textNode13.isBlank();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str3 = textNode2.text();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        java.lang.String str9 = textNode7.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode7.childNodesCopy();
        java.lang.String str11 = textNode7.outerHtml();
        int int12 = textNode7.siblingIndex();
        java.lang.String str13 = textNode7.outerHtml();
        java.lang.String str14 = textNode7.text();
        org.jsoup.nodes.TextNode textNode16 = textNode7.text("h");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        textNode2.setBaseUri("i!");
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        boolean boolean18 = textNode2.hasAttr("#text");
        java.lang.String str19 = textNode2.getWholeText();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        try {
            org.jsoup.nodes.Node node15 = textNode2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        org.jsoup.nodes.Node node22 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode24 = textNode2.splitText(1);
        java.lang.String str25 = textNode24.outerHtml();
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "i!" + "'", str25.equals("i!"));
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        org.jsoup.select.NodeVisitor nodeVisitor27 = null;
        try {
            org.jsoup.nodes.Node node28 = textNode20.traverse(nodeVisitor27);
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
        org.junit.Assert.assertNotNull(textNode26);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.absUrl("h");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        try {
            org.jsoup.nodes.Node node14 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str21 = textNode17.toString();
        int int22 = textNode17.siblingIndex();
        java.lang.String str23 = textNode17.nodeName();
        org.jsoup.nodes.TextNode textNode25 = textNode17.splitText(0);
        org.jsoup.nodes.TextNode textNode27 = textNode17.text("h");
        java.lang.Class<?> wildcardClass28 = textNode27.getClass();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode27);
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.Class<?> wildcardClass9 = textNode5.getClass();
        org.jsoup.nodes.TextNode textNode11 = textNode5.text("h");
        boolean boolean12 = textNode5.isBlank();
        org.jsoup.nodes.Node node15 = textNode5.attr("hi!", "i!");
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
        java.lang.String str32 = textNode18.absUrl("#text");
        org.jsoup.nodes.Node node34 = textNode18.removeAttr("i!");
        org.jsoup.nodes.Node node36 = textNode18.removeAttr("#text");
        org.jsoup.nodes.Node node37 = textNode18.clone();
        boolean boolean38 = node15.equals((java.lang.Object) textNode18);
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode18.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeList39);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        textNode20.setBaseUri("#text");
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        try {
            org.jsoup.nodes.Node node27 = textNode20.traverse(nodeVisitor26);
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
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        java.lang.String str7 = textNode2.nodeName();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        java.lang.String str33 = textNode17.outerHtml();
        int int34 = textNode17.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node10 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        java.lang.String str24 = textNode7.getWholeText();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "i!" + "'", str24.equals("i!"));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        int int19 = textNode2.siblingIndex();
        java.lang.String str20 = textNode2.outerHtml();
        java.lang.String str22 = textNode2.attr("");
        java.lang.String str23 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        int int18 = textNode13.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        int int11 = node9.siblingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        org.jsoup.nodes.Node node25 = textNode22.clone();
        try {
            org.jsoup.nodes.Node node27 = textNode22.after("i!");
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        try {
            org.jsoup.nodes.Node node20 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        boolean boolean14 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        int int12 = node10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodes();
        try {
            org.jsoup.nodes.Node node15 = node10.before("i!");
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
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        org.jsoup.nodes.Node node19 = textNode2.parent();
        java.lang.String str21 = textNode2.absUrl("h");
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((-1));
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
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        textNode2.setBaseUri("hi!");
        java.lang.String str14 = textNode2.attr("");
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        boolean boolean16 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        int int21 = textNode19.siblingIndex();
        java.lang.String str22 = textNode19.nodeName();
        java.lang.String str23 = textNode19.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode19.childNodes();
        org.jsoup.nodes.TextNode textNode26 = textNode19.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode19.childNodesCopy();
        org.jsoup.nodes.TextNode textNode30 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean31 = textNode19.equals((java.lang.Object) textNode30);
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode34.childNodesCopy();
        int int36 = textNode34.siblingIndex();
        org.jsoup.nodes.Node node38 = textNode34.removeAttr("#text");
        java.lang.String str39 = textNode34.getWholeText();
        java.lang.String str40 = textNode34.baseUri();
        boolean boolean41 = textNode30.equals((java.lang.Object) textNode34);
        java.lang.String str42 = textNode34.getWholeText();
        java.lang.String str43 = textNode34.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode34.childNodes();
        boolean boolean46 = textNode34.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode34.childNodesCopy();
        java.lang.Class<?> wildcardClass48 = textNode34.getClass();
        org.jsoup.nodes.Node node49 = textNode34.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = textNode34.childNodes();
        org.jsoup.nodes.Node node52 = textNode34.removeAttr("i!");
        org.jsoup.nodes.Node node53 = node52.clone();
        try {
            org.jsoup.nodes.Node node54 = textNode2.after(node52);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        try {
            org.jsoup.nodes.Node node15 = node13.after("i!");
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (byte) 0);
        java.lang.String str12 = textNode2.nodeName();
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = textNode4.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = textNode4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        org.jsoup.nodes.Node node25 = textNode20.clone();
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        try {
            org.jsoup.nodes.Node node27 = textNode20.traverse(nodeVisitor26);
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
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("i!");
        try {
            org.jsoup.nodes.Node node17 = textNode16.unwrap();
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
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str13 = textNode2.attr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        int int8 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        node9.setBaseUri("");
        try {
            org.jsoup.nodes.Node node12 = node9.unwrap();
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
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "h");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node19 = textNode13.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes20 = textNode13.attributes();
        org.jsoup.nodes.Node node21 = textNode13.parent();
        java.lang.String str23 = textNode13.absUrl("#text");
        java.lang.String str24 = textNode13.toString();
        textNode13.setBaseUri("");
        org.jsoup.nodes.TextNode textNode28 = textNode13.text("");
        org.jsoup.nodes.TextNode textNode30 = textNode28.text("hi!");
        org.jsoup.nodes.Node node31 = textNode28.clone();
        java.lang.String str32 = textNode28.outerHtml();
        org.jsoup.nodes.Node node35 = textNode28.attr("h", "h");
        boolean boolean36 = node10.equals((java.lang.Object) "h");
        org.jsoup.nodes.TextNode textNode39 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode41 = textNode39.text("hi!");
        org.jsoup.nodes.Node node42 = textNode39.nextSibling();
        org.jsoup.nodes.Node node43 = textNode39.parent();
        java.lang.String str44 = textNode39.getWholeText();
        org.jsoup.nodes.Node node45 = textNode39.clone();
        org.jsoup.nodes.TextNode textNode47 = textNode39.text("hi!");
        try {
            org.jsoup.nodes.Node node48 = node10.after((org.jsoup.nodes.Node) textNode47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertNotNull(textNode41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(textNode47);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("i!");
        try {
            org.jsoup.nodes.Node node12 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("hi!");
        boolean boolean15 = textNode2.equals((java.lang.Object) "hi!");
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
        org.jsoup.nodes.TextNode textNode36 = textNode18.text("");
        java.lang.Class<?> wildcardClass37 = textNode18.getClass();
        boolean boolean38 = textNode2.equals((java.lang.Object) textNode18);
        java.lang.String str39 = textNode2.baseUri();
        org.jsoup.nodes.Node node42 = textNode2.attr("i!", "h");
        try {
            node42.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "#text" + "'", str39.equals("#text"));
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean13 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        java.lang.String str21 = textNode18.nodeName();
        java.lang.String str22 = textNode18.toString();
        java.lang.String str23 = textNode18.text();
        org.jsoup.nodes.Attributes attributes24 = textNode18.attributes();
        java.lang.String str25 = textNode18.text();
        boolean boolean27 = textNode18.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode18.childNodes();
        java.lang.String str29 = textNode18.nodeName();
        org.jsoup.nodes.Node node30 = textNode18.clone();
        boolean boolean31 = textNode15.equals((java.lang.Object) textNode18);
        java.lang.String str32 = textNode18.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        try {
            int int17 = node16.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        try {
            org.jsoup.nodes.Node node12 = node10.before("");
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
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        java.lang.String str19 = textNode2.toString();
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
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode7.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = node10.baseUri();
        try {
            org.jsoup.nodes.Node node13 = node10.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("i!");
        java.lang.String str12 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        java.lang.Class<?> wildcardClass16 = textNode2.getClass();
        org.jsoup.nodes.Node node17 = textNode2.clone();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText(0);
        int int5 = textNode4.siblingIndex();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.nodeName();
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        java.lang.Class<?> wildcardClass15 = textNode2.getClass();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        boolean boolean16 = textNode2.hasAttr("h");
        try {
            org.jsoup.nodes.Node node18 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        org.jsoup.nodes.Node node14 = node13.clone();
        org.jsoup.nodes.Node node15 = node13.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str12 = textNode2.absUrl("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.absUrl("#text");
        boolean boolean12 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node14 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        java.lang.String str18 = textNode16.toString();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.text();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("h");
        int int17 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "#text");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.String str5 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str13 = textNode2.absUrl("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int39 = textNode38.siblingIndex();
        org.jsoup.nodes.Document document40 = textNode38.ownerDocument();
        int int41 = textNode38.childNodeSize();
        java.lang.Class<?> wildcardClass42 = textNode38.getClass();
        int int43 = textNode38.childNodeSize();
        java.lang.String str44 = textNode38.nodeName();
        textNode38.setBaseUri("i!");
        textNode38.setBaseUri("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = textNode38.childNodes();
        org.jsoup.nodes.TextNode textNode52 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = textNode52.childNodesCopy();
        int int54 = textNode52.siblingIndex();
        java.lang.String str55 = textNode52.nodeName();
        java.lang.String str56 = textNode52.toString();
        java.lang.String str57 = textNode52.text();
        org.jsoup.nodes.Attributes attributes58 = textNode52.attributes();
        java.lang.String str59 = textNode52.text();
        boolean boolean61 = textNode52.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.TextNode textNode63 = textNode52.splitText(0);
        java.lang.String str64 = textNode52.outerHtml();
        boolean boolean65 = textNode38.equals((java.lang.Object) textNode52);
        java.util.List<org.jsoup.nodes.Node> nodeList66 = textNode52.childNodesCopy();
        org.jsoup.nodes.Node node67 = textNode52.previousSibling();
        try {
            org.jsoup.nodes.Node node68 = textNode17.after((org.jsoup.nodes.Node) textNode52);
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
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(document40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "#text" + "'", str44.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "#text" + "'", str55.equals("#text"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(textNode63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        try {
            org.jsoup.nodes.Node node22 = textNode2.before("h");
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
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodes();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        java.lang.String str17 = textNode13.getWholeText();
        java.lang.String str19 = textNode13.absUrl("#text");
        java.lang.String str20 = textNode13.toString();
        java.lang.String str21 = textNode13.getWholeText();
        try {
            textNode9.replaceWith((org.jsoup.nodes.Node) textNode13);
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
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        org.jsoup.nodes.TextNode textNode15 = textNode12.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        org.jsoup.nodes.Node node20 = node16.parent();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        org.jsoup.nodes.Document document15 = textNode14.ownerDocument();
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
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "#text");
        java.lang.String str14 = node13.outerHtml();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str22 = textNode17.attr("");
        java.lang.String str23 = textNode17.outerHtml();
        org.jsoup.nodes.Node node24 = textNode17.parent();
        java.lang.String str25 = textNode17.nodeName();
        java.lang.String str26 = textNode17.toString();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        boolean boolean31 = textNode17.equals((java.lang.Object) nodeList30);
        boolean boolean32 = textNode17.isBlank();
        int int33 = textNode17.childNodeSize();
        org.jsoup.nodes.Document document34 = textNode17.ownerDocument();
        boolean boolean35 = node13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode37 = textNode17.text("hi!");
        textNode17.setBaseUri("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(textNode37);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        java.lang.String str28 = textNode24.toString();
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode31.childNodesCopy();
        int int33 = textNode31.siblingIndex();
        java.lang.String str34 = textNode31.nodeName();
        java.lang.String str35 = textNode31.toString();
        int int36 = textNode31.childNodeSize();
        org.jsoup.nodes.TextNode textNode39 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode41 = textNode39.text("hi!");
        java.lang.String str42 = textNode39.outerHtml();
        org.jsoup.nodes.Node node45 = textNode39.attr("hi!", "#text");
        org.jsoup.nodes.Node node46 = textNode39.clone();
        boolean boolean47 = textNode31.equals((java.lang.Object) textNode39);
        org.jsoup.nodes.TextNode textNode49 = textNode31.text("");
        org.jsoup.nodes.TextNode textNode51 = textNode31.text("h");
        org.jsoup.nodes.TextNode textNode53 = textNode31.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = textNode31.childNodes();
        java.lang.String str55 = textNode31.outerHtml();
        org.jsoup.nodes.Node node56 = textNode31.previousSibling();
        int int57 = textNode31.siblingIndex();
        org.jsoup.nodes.Attributes attributes58 = textNode31.attributes();
        try {
            org.jsoup.nodes.Node node59 = textNode24.after((org.jsoup.nodes.Node) textNode31);
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
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "i!" + "'", str28.equals("i!"));
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "#text" + "'", str34.equals("#text"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertNotNull(textNode41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(textNode49);
        org.junit.Assert.assertNotNull(textNode51);
        org.junit.Assert.assertNotNull(textNode53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "i!" + "'", str55.equals("i!"));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(attributes58);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean4 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        org.jsoup.nodes.Document document7 = node5.ownerDocument();
        try {
            document7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        java.lang.String str23 = textNode20.nodeName();
        java.lang.String str25 = textNode20.attr("");
        java.lang.String str26 = textNode20.text();
        org.jsoup.nodes.Node node28 = textNode20.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes29 = textNode20.attributes();
        boolean boolean31 = textNode20.hasAttr("#text");
        int int32 = textNode20.childNodeSize();
        int int33 = textNode20.siblingIndex();
        try {
            node16.replaceWith((org.jsoup.nodes.Node) textNode20);
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        int int13 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        java.lang.Class<?> wildcardClass14 = node11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str12 = textNode9.attr("");
        java.lang.String str13 = textNode9.baseUri();
        java.lang.String str14 = textNode9.toString();
        try {
            org.jsoup.nodes.Node node16 = textNode9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        try {
            org.jsoup.nodes.Node node14 = node12.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        try {
            java.lang.String str17 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("hi!");
        java.lang.String str11 = textNode8.outerHtml();
        org.jsoup.nodes.Node node14 = textNode8.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes15 = textNode8.attributes();
        org.jsoup.nodes.Node node16 = textNode8.clone();
        int int17 = textNode8.childNodeSize();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode8);
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.absUrl("h");
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node7 = node5.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str12 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        int int14 = textNode2.siblingIndex();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        org.jsoup.nodes.Node node21 = textNode12.removeAttr("hi!");
        java.lang.String str22 = textNode12.text();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        int int9 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode8.nextSibling();
        try {
            org.jsoup.nodes.Node node11 = node10.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        java.lang.String str15 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        org.jsoup.nodes.Node node36 = textNode15.attr("i!", "h");
        java.lang.String str37 = textNode15.getWholeText();
        boolean boolean39 = textNode15.hasAttr("");
        try {
            org.jsoup.nodes.Node node40 = textNode2.after((org.jsoup.nodes.Node) textNode15);
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        org.jsoup.nodes.Node node29 = textNode27.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode27.childNodes();
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "h");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("#text");
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
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        java.lang.String str22 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode25.childNodesCopy();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode25);
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        boolean boolean27 = textNode9.hasAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str9 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        org.jsoup.nodes.Node node24 = textNode13.nextSibling();
        try {
            org.jsoup.nodes.Node node26 = node24.childNode((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        java.lang.String str38 = textNode13.absUrl("hi!");
        java.lang.String str40 = textNode13.absUrl("h");
        java.lang.String str41 = textNode13.toString();
        org.jsoup.nodes.Node node42 = textNode13.parent();
        org.jsoup.nodes.TextNode textNode45 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode45.childNodesCopy();
        int int47 = textNode45.siblingIndex();
        java.lang.String str48 = textNode45.nodeName();
        java.lang.String str50 = textNode45.attr("");
        org.jsoup.nodes.Node node51 = textNode45.previousSibling();
        org.jsoup.nodes.TextNode textNode53 = textNode45.text("hi!");
        org.jsoup.nodes.Attributes attributes54 = textNode45.attributes();
        java.lang.String str55 = textNode45.toString();
        org.jsoup.nodes.Node node56 = textNode45.clone();
        try {
            org.jsoup.nodes.Node node57 = textNode13.before(node56);
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "#text" + "'", str48.equals("#text"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(textNode53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        try {
            org.jsoup.nodes.Node node21 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str18 = textNode13.attr("");
        org.jsoup.nodes.Node node19 = textNode13.previousSibling();
        org.jsoup.nodes.TextNode textNode21 = textNode13.text("hi!");
        org.jsoup.nodes.TextNode textNode23 = textNode13.splitText(1);
        boolean boolean24 = textNode2.equals((java.lang.Object) textNode13);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str5 = textNode2.absUrl("h");
        boolean boolean7 = textNode2.hasAttr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        int int11 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        int int14 = textNode2.childNodeSize();
        java.lang.String str15 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        int int16 = textNode2.siblingIndex();
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
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean8 = textNode2.hasAttr("i!");
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        try {
            java.lang.String str16 = textNode9.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.childNodes();
        org.jsoup.nodes.TextNode textNode20 = textNode13.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode13.childNodesCopy();
        java.lang.String str22 = textNode13.getWholeText();
        org.jsoup.nodes.Node node23 = textNode13.parent();
        try {
            org.jsoup.nodes.Node node24 = textNode2.after((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        try {
            org.jsoup.nodes.Node node6 = textNode2.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node5 = node4.clone();
        node4.setBaseUri("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str12 = textNode2.absUrl("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        org.jsoup.nodes.TextNode textNode26 = textNode20.text("#text");
        int int27 = textNode20.siblingIndex();
        try {
            org.jsoup.nodes.Node node28 = textNode20.unwrap();
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
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.attr("i!");
        java.lang.String str9 = textNode2.nodeName();
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        textNode2.setBaseUri("");
        java.lang.String str17 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode10.childNodesCopy();
        boolean boolean19 = textNode10.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode21 = textNode10.splitText((int) (byte) 0);
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(textNode21);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int9 = textNode8.siblingIndex();
        org.jsoup.nodes.Document document10 = textNode8.ownerDocument();
        int int11 = textNode8.childNodeSize();
        java.lang.Class<?> wildcardClass12 = textNode8.getClass();
        org.jsoup.nodes.TextNode textNode14 = textNode8.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        org.jsoup.nodes.Document document16 = textNode14.ownerDocument();
        java.lang.String str18 = textNode14.absUrl("i!");
        org.jsoup.nodes.Node node21 = textNode14.attr("hi!", "");
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        java.lang.String str16 = textNode11.toString();
        boolean boolean18 = textNode11.hasAttr("hi!");
        java.lang.String str19 = textNode11.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode11.siblingNodes();
        try {
            org.jsoup.nodes.Node node21 = textNode2.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        java.lang.String str7 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode20.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.childNodesCopy();
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
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        java.lang.String str20 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str9 = textNode8.getWholeText();
        java.lang.String str10 = textNode8.text();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.childNodes();
        int int12 = textNode8.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode8.previousSibling();
        int int14 = textNode8.siblingIndex();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "i!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        org.jsoup.nodes.Node node16 = textNode10.previousSibling();
        org.jsoup.nodes.TextNode textNode18 = textNode10.text("hi!");
        org.jsoup.nodes.Node node21 = textNode18.attr("hi!", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node21.childNodesCopy();
        java.lang.String str23 = node21.outerHtml();
        try {
            textNode2.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        int int11 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.text();
        java.lang.String str14 = textNode2.absUrl("i!");
        java.lang.String str15 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        boolean boolean22 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int26 = textNode25.siblingIndex();
        org.jsoup.nodes.Document document27 = textNode25.ownerDocument();
        int int28 = textNode25.childNodeSize();
        java.lang.String str30 = textNode25.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode25.childNodes();
        org.jsoup.nodes.TextNode textNode33 = textNode25.text("#text");
        org.jsoup.nodes.TextNode textNode35 = textNode25.text("");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode25);
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertNotNull(textNode35);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.absUrl("#text");
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str14 = textNode2.attr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode9.nodeName();
        java.lang.String str11 = textNode9.getWholeText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) '#');
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean4 = textNode2.hasAttr("h");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.attr("h", "hi!");
        java.lang.String str12 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "");
        int int17 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        java.lang.String str19 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodes();
        java.lang.String str22 = textNode2.attr("h");
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        java.lang.String str38 = textNode13.absUrl("hi!");
        java.lang.String str40 = textNode13.absUrl("h");
        org.jsoup.nodes.Node node41 = textNode13.nextSibling();
        try {
            node41.remove();
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        java.lang.String str21 = textNode2.absUrl("h");
        java.lang.String str22 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        java.lang.String str38 = textNode13.absUrl("hi!");
        boolean boolean39 = textNode13.isBlank();
        try {
            org.jsoup.nodes.Node node40 = textNode13.unwrap();
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
            org.jsoup.nodes.TextNode textNode36 = textNode2.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.lang.String str5 = node3.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        java.lang.String str38 = textNode13.absUrl("hi!");
        boolean boolean39 = textNode13.isBlank();
        org.jsoup.nodes.Node node40 = textNode13.previousSibling();
        java.lang.String str41 = textNode13.text();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("h");
        java.lang.String str8 = textNode2.absUrl("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = node7.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        textNode2.setBaseUri("h");
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        org.jsoup.nodes.Node node8 = textNode4.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("");
        org.jsoup.nodes.Node node11 = textNode10.clone();
        try {
            org.jsoup.nodes.Node node14 = textNode10.attr("", "i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        java.lang.String str31 = textNode29.text();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode29.childNodesCopy();
        java.lang.String str33 = textNode29.outerHtml();
        int int34 = textNode29.siblingIndex();
        org.jsoup.nodes.TextNode textNode37 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode39 = textNode37.text("hi!");
        java.lang.String str40 = textNode37.outerHtml();
        org.jsoup.nodes.Node node43 = textNode37.attr("hi!", "#text");
        org.jsoup.nodes.Node node44 = textNode37.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = textNode37.siblingNodes();
        java.lang.String str47 = textNode37.attr("hi!");
        int int48 = textNode37.childNodeSize();
        org.jsoup.nodes.Node node51 = textNode37.attr("hi!", "hi!");
        boolean boolean52 = textNode29.equals((java.lang.Object) textNode37);
        java.lang.String str54 = textNode37.attr("#text");
        try {
            org.jsoup.nodes.Node node55 = textNode23.before((org.jsoup.nodes.Node) textNode37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "#text" + "'", str47.equals("#text"));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        int int15 = textNode14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode14.siblingNodes();
        try {
            org.jsoup.nodes.Node node19 = textNode14.attr("", "i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
            org.jsoup.nodes.Node node31 = textNode24.after("");
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
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode10 = textNode8.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("h");
        org.jsoup.nodes.Node node15 = textNode8.attr("#text", "h");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
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
        org.jsoup.nodes.TextNode textNode29 = textNode11.splitText((int) (short) 1);
        java.lang.String str30 = textNode29.outerHtml();
        java.lang.String str32 = textNode29.attr("h");
        org.jsoup.nodes.Node node34 = textNode29.removeAttr("h");
        java.lang.String str36 = textNode29.absUrl("h");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "i!" + "'", str30.equals("i!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        org.jsoup.nodes.Node node23 = textNode2.attr("#text", "i!");
        try {
            org.jsoup.nodes.Node node25 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.childNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode11.childNodesCopy();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean23 = textNode11.equals((java.lang.Object) textNode22);
        java.lang.String str25 = textNode11.absUrl("#text");
        org.jsoup.nodes.Node node27 = textNode11.removeAttr("i!");
        org.jsoup.nodes.Node node29 = textNode11.removeAttr("#text");
        org.jsoup.nodes.Node node30 = textNode11.clone();
        try {
            org.jsoup.nodes.Node node31 = node8.after(node30);
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        try {
            java.lang.String str16 = node15.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("h");
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        org.jsoup.nodes.Document document15 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        try {
            org.jsoup.nodes.Node node19 = textNode2.removeAttr("");
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
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(textNode17);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        org.jsoup.nodes.Node node23 = textNode2.removeAttr("hi!");
        int int24 = textNode2.childNodeSize();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("i!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        try {
            org.jsoup.nodes.Node node7 = node5.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        boolean boolean25 = textNode2.isBlank();
        textNode2.setBaseUri("h");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.text();
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = null;
        try {
            textNode2.replaceWith(node11);
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.siblingNodes();
        int int13 = textNode10.siblingIndex();
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        org.jsoup.nodes.Node node17 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node18 = node17.parent();
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.attr("h", "h");
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        boolean boolean8 = textNode5.isBlank();
        java.lang.String str10 = textNode5.attr("i!");
        org.jsoup.nodes.Node node11 = textNode5.parent();
        org.jsoup.nodes.Node node12 = textNode5.parent();
        boolean boolean13 = textNode5.isBlank();
        org.jsoup.nodes.Node node14 = textNode5.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        try {
            org.jsoup.nodes.Node node29 = textNode27.before("");
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
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        textNode2.setBaseUri("i!");
        java.lang.String str11 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "i!" + "'", str11.equals("i!"));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        try {
            org.jsoup.nodes.Node node28 = textNode2.attr("", "#text");
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
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(1);
        java.lang.Class<?> wildcardClass11 = textNode10.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.baseUri();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        textNode11.setBaseUri("h");
        org.jsoup.nodes.Node node17 = textNode11.attr("i!", "h");
        try {
            org.jsoup.nodes.Node node18 = node17.unwrap();
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.getWholeText();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.siblingIndex();
        int int12 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        java.lang.String str21 = textNode2.absUrl("h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        java.lang.String str26 = textNode2.toString();
        java.lang.String str27 = textNode2.baseUri();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        org.jsoup.nodes.Node node31 = textNode17.nextSibling();
        java.lang.String str32 = textNode17.nodeName();
        boolean boolean34 = textNode17.hasAttr("hi!");
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
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        textNode2.setBaseUri("#text");
        java.lang.String str11 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        java.lang.String str13 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        int int22 = textNode2.siblingIndex();
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
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node19 = textNode17.removeAttr("hi!");
        java.lang.String str20 = textNode17.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode17.childNodesCopy();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode17);
        java.lang.String str23 = textNode17.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) "");
        textNode2.setBaseUri("h");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
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
        java.lang.String str39 = textNode14.attr("#text");
        int int40 = textNode14.childNodeSize();
        try {
            org.jsoup.nodes.Node node41 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(document11);
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str7 = textNode6.baseUri();
        java.lang.String str8 = textNode6.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode21.childNodes();
        java.lang.String str27 = textNode21.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode21.childNodesCopy();
        int int29 = textNode21.childNodeSize();
        int int30 = textNode21.siblingIndex();
        java.lang.String str31 = textNode21.text();
        try {
            org.jsoup.nodes.Node node32 = textNode2.before((org.jsoup.nodes.Node) textNode21);
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean27 = textNode25.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes28 = textNode25.attributes();
        java.lang.String str29 = textNode25.outerHtml();
        org.jsoup.nodes.Node node30 = textNode25.nextSibling();
        boolean boolean31 = textNode25.isBlank();
        org.jsoup.nodes.Document document32 = textNode25.ownerDocument();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode25);
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str10 = textNode8.attr("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str18 = textNode13.attr("");
        java.lang.String str19 = textNode13.text();
        org.jsoup.nodes.Node node21 = textNode13.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes22 = textNode13.attributes();
        org.jsoup.nodes.Node node24 = textNode13.removeAttr("i!");
        boolean boolean25 = textNode8.equals((java.lang.Object) "i!");
        boolean boolean26 = textNode2.equals((java.lang.Object) "i!");
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean30 = textNode29.isBlank();
        boolean boolean32 = textNode29.hasAttr("hi!");
        int int33 = textNode29.childNodeSize();
        java.lang.String str34 = textNode29.text();
        org.jsoup.nodes.TextNode textNode37 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode39 = textNode37.text("hi!");
        java.lang.String str40 = textNode37.outerHtml();
        org.jsoup.nodes.Node node41 = textNode37.previousSibling();
        boolean boolean42 = textNode29.equals((java.lang.Object) node41);
        org.jsoup.nodes.Attributes attributes43 = textNode29.attributes();
        boolean boolean44 = textNode29.isBlank();
        org.jsoup.nodes.Node node45 = textNode29.previousSibling();
        org.jsoup.nodes.Node node47 = textNode29.removeAttr("hi!");
        try {
            textNode2.replaceWith(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        try {
            org.jsoup.nodes.Node node19 = textNode17.traverse(nodeVisitor18);
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
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node12 = node10.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode8.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        boolean boolean13 = textNode2.equals((java.lang.Object) node11);
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "h");
        java.lang.String str17 = textNode2.text();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "#text");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        int int13 = textNode2.siblingIndex();
        java.lang.String str14 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "h" + "'", str14.equals("h"));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        int int21 = textNode20.siblingIndex();
        java.lang.String str22 = textNode20.text();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "i!" + "'", str22.equals("i!"));
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        int int8 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.nodeName();
        java.lang.String str13 = textNode9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        org.jsoup.nodes.Node node15 = textNode9.previousSibling();
        int int16 = textNode9.siblingIndex();
        java.lang.String str18 = textNode9.attr("");
        java.lang.String str19 = textNode9.toString();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        java.lang.String str16 = textNode2.text();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodesCopy();
        boolean boolean22 = textNode19.hasAttr("");
        int int23 = textNode19.siblingIndex();
        org.jsoup.nodes.Attributes attributes24 = textNode19.attributes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode19);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean11 = textNode9.hasAttr("h");
        org.jsoup.nodes.Node node12 = textNode9.previousSibling();
        java.lang.String str13 = textNode9.text();
        boolean boolean14 = textNode9.isBlank();
        try {
            org.jsoup.nodes.Node node15 = node5.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "#text");
        java.lang.String str14 = node13.outerHtml();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str22 = textNode17.attr("");
        java.lang.String str23 = textNode17.outerHtml();
        org.jsoup.nodes.Node node24 = textNode17.parent();
        java.lang.String str25 = textNode17.nodeName();
        java.lang.String str26 = textNode17.toString();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        boolean boolean31 = textNode17.equals((java.lang.Object) nodeList30);
        boolean boolean32 = textNode17.isBlank();
        int int33 = textNode17.childNodeSize();
        org.jsoup.nodes.Document document34 = textNode17.ownerDocument();
        boolean boolean35 = node13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode37 = textNode17.text("hi!");
        org.jsoup.nodes.TextNode textNode40 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = textNode40.childNodesCopy();
        int int42 = textNode40.siblingIndex();
        java.lang.String str43 = textNode40.nodeName();
        java.lang.String str45 = textNode40.attr("");
        org.jsoup.nodes.Node node46 = textNode40.previousSibling();
        java.lang.String str48 = textNode40.attr("#text");
        java.lang.String str49 = textNode40.outerHtml();
        org.jsoup.nodes.Node node52 = textNode40.attr("#text", "#text");
        org.jsoup.nodes.Node node53 = textNode40.nextSibling();
        java.lang.String str54 = textNode40.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = textNode40.siblingNodes();
        try {
            org.jsoup.nodes.Node node56 = textNode37.after((org.jsoup.nodes.Node) textNode40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "#text" + "'", str43.equals("#text"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "#text" + "'", str54.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList55);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        org.jsoup.nodes.Node node39 = textNode13.attr("i!", "#text");
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
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        int int13 = textNode9.childNodeSize();
        java.lang.String str14 = textNode9.outerHtml();
        org.jsoup.nodes.Node node15 = textNode9.nextSibling();
        java.lang.String str16 = textNode9.text();
        org.jsoup.nodes.Node node17 = textNode9.previousSibling();
        try {
            org.jsoup.nodes.Node node18 = node17.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodes();
        org.jsoup.nodes.Node node12 = textNode10.previousSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("hi!");
        org.jsoup.nodes.Attributes attributes15 = textNode14.attributes();
        try {
            org.jsoup.nodes.Node node17 = textNode14.before("i!");
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("i!");
        boolean boolean16 = textNode15.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        boolean boolean27 = textNode20.isBlank();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("i!");
        java.lang.Class<?> wildcardClass18 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("h");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        int int10 = node9.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        try {
            org.jsoup.nodes.Node node6 = textNode2.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        int int23 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str27 = textNode26.getWholeText();
        java.lang.String str28 = textNode26.text();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode26.childNodes();
        textNode26.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode26.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode26.childNodes();
        java.lang.String str35 = textNode26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode26.childNodes();
        boolean boolean37 = textNode2.equals((java.lang.Object) nodeList36);
        org.jsoup.nodes.Node node38 = textNode2.nextSibling();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        boolean boolean7 = textNode2.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        textNode2.setBaseUri("#text");
        boolean boolean14 = textNode2.hasAttr("");
        java.lang.String str16 = textNode2.attr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        int int14 = textNode9.childNodeSize();
        int int15 = textNode9.siblingIndex();
        java.lang.String str16 = textNode9.nodeName();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str20 = textNode19.baseUri();
        boolean boolean22 = textNode19.hasAttr("hi!");
        java.lang.String str23 = textNode19.text();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode19.siblingNodes();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        java.lang.String str30 = textNode27.nodeName();
        java.lang.String str32 = textNode27.attr("");
        java.lang.String str33 = textNode27.text();
        org.jsoup.nodes.Node node35 = textNode27.removeAttr("hi!");
        int int36 = node35.siblingIndex();
        int int37 = node35.siblingIndex();
        int int38 = node35.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = node35.childNodes();
        boolean boolean40 = textNode19.equals((java.lang.Object) nodeList39);
        java.lang.String str42 = textNode19.attr("h");
        java.lang.String str43 = textNode19.toString();
        org.jsoup.nodes.Node node44 = textNode19.parent();
        try {
            textNode9.replaceWith(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.absUrl("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        org.jsoup.nodes.Node node23 = textNode2.attr("#text", "i!");
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
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        boolean boolean6 = textNode2.hasAttr("#text");
        try {
            org.jsoup.nodes.Node node9 = textNode2.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        int int11 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.absUrl("h");
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str17 = textNode2.absUrl("hi!");
        java.lang.String str18 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        int int9 = textNode7.siblingIndex();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str11 = textNode7.toString();
        int int12 = textNode7.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str20 = textNode15.attr("");
        java.lang.String str21 = textNode15.outerHtml();
        org.jsoup.nodes.Node node22 = textNode15.parent();
        java.lang.String str23 = textNode15.nodeName();
        org.jsoup.nodes.Node node24 = textNode15.clone();
        boolean boolean25 = textNode7.equals((java.lang.Object) textNode15);
        textNode15.setBaseUri("h");
        try {
            boolean boolean28 = node4.equals((java.lang.Object) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.siblingNodes();
        int int26 = textNode20.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str15 = textNode10.attr("");
        java.lang.String str16 = textNode10.text();
        org.jsoup.nodes.Node node18 = textNode10.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes19 = textNode10.attributes();
        boolean boolean21 = textNode10.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode23 = textNode10.splitText((int) (short) 0);
        java.lang.String str24 = textNode23.baseUri();
        org.jsoup.nodes.Node node26 = textNode23.removeAttr("hi!");
        int int27 = node26.siblingIndex();
        try {
            textNode2.replaceWith(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean8 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean14 = textNode12.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes15 = textNode12.attributes();
        java.lang.String str16 = textNode12.outerHtml();
        java.lang.Class<?> wildcardClass17 = textNode12.getClass();
        java.lang.String str18 = textNode12.getWholeText();
        java.lang.String str20 = textNode12.attr("");
        try {
            org.jsoup.nodes.Node node21 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        boolean boolean16 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("h");
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        java.lang.String str38 = textNode13.absUrl("hi!");
        org.jsoup.nodes.Node node41 = textNode13.attr("i!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node41.siblingNodes();
        try {
            org.jsoup.nodes.Node node44 = node41.childNode(10);
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
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean22 = textNode20.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes23 = textNode20.attributes();
        java.lang.String str24 = textNode20.outerHtml();
        org.jsoup.nodes.Node node25 = textNode20.nextSibling();
        java.lang.String str26 = textNode20.toString();
        java.lang.String str27 = textNode20.getWholeText();
        int int28 = textNode20.childNodeSize();
        org.jsoup.nodes.Node node29 = textNode20.parent();
        boolean boolean30 = node9.equals((java.lang.Object) node29);
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
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("h", "i!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.splitText(0);
        org.jsoup.nodes.Document document17 = textNode16.ownerDocument();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode16);
        java.lang.String str19 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes16 = textNode15.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        org.jsoup.select.NodeVisitor nodeVisitor28 = null;
        try {
            org.jsoup.nodes.Node node29 = textNode27.traverse(nodeVisitor28);
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(textNode27);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        try {
            org.jsoup.nodes.Node node9 = node8.previousSibling();
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
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        try {
            document7.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "i!");
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        org.jsoup.nodes.TextNode textNode28 = textNode2.text("i!");
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
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        org.jsoup.nodes.Node node22 = null;
        try {
            org.jsoup.nodes.Node node23 = node21.before(node22);
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
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        java.lang.String str20 = textNode14.outerHtml();
        org.jsoup.nodes.Node node21 = textNode14.parent();
        org.jsoup.nodes.Document document22 = textNode14.ownerDocument();
        org.jsoup.nodes.Node node23 = textNode14.previousSibling();
        java.lang.String str24 = textNode14.nodeName();
        java.lang.String str25 = textNode14.toString();
        java.lang.String str27 = textNode14.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode14.childNodes();
        org.jsoup.nodes.Node node31 = textNode14.attr("#text", "h");
        java.lang.String str32 = textNode14.nodeName();
        try {
            org.jsoup.nodes.Node node33 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.text();
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        textNode16.setBaseUri("");
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
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
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
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode6.childNodes();
        java.lang.String str18 = textNode6.outerHtml();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        boolean boolean8 = textNode5.isBlank();
        org.jsoup.nodes.Node node10 = textNode5.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode5.parent();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        textNode2.setBaseUri("");
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
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
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str21 = textNode17.toString();
        int int22 = textNode17.siblingIndex();
        org.jsoup.nodes.Attributes attributes23 = textNode17.attributes();
        org.jsoup.nodes.Node node25 = textNode17.removeAttr("i!");
        java.lang.String str26 = textNode17.outerHtml();
        org.jsoup.nodes.Node node27 = textNode17.previousSibling();
        boolean boolean28 = textNode2.equals((java.lang.Object) node27);
        boolean boolean30 = textNode2.hasAttr("hi!");
        boolean boolean32 = textNode2.hasAttr("");
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        textNode2.setBaseUri("#text");
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("");
        try {
            org.jsoup.nodes.Node node16 = textNode11.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        org.jsoup.nodes.Document document14 = textNode9.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.childNodes();
        java.lang.String str26 = textNode20.outerHtml();
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
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str13 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str9 = textNode2.attr("i!");
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        org.jsoup.nodes.Node node25 = textNode21.attr("hi!", "hi!");
        java.lang.String str27 = textNode21.attr("hi!");
        boolean boolean28 = node16.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("hi!");
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("hi!");
        try {
            org.jsoup.nodes.TextNode textNode22 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
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
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node21.siblingNodes();
        int int23 = node21.childNodeSize();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        java.lang.String str33 = textNode2.attr("");
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        int int11 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.absUrl("h");
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        try {
            java.lang.String str16 = node15.outerHtml();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
        try {
            org.jsoup.nodes.Node node20 = textNode18.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node14 = textNode2.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean8 = textNode2.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        boolean boolean12 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        boolean boolean16 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("hi!");
        java.lang.String str19 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("hi!");
        boolean boolean15 = textNode2.equals((java.lang.Object) "hi!");
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
        org.jsoup.nodes.TextNode textNode36 = textNode18.text("");
        java.lang.Class<?> wildcardClass37 = textNode18.getClass();
        boolean boolean38 = textNode2.equals((java.lang.Object) textNode18);
        java.lang.String str39 = textNode2.baseUri();
        org.jsoup.nodes.Node node42 = textNode2.attr("i!", "h");
        org.jsoup.nodes.TextNode textNode45 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean46 = textNode45.isBlank();
        boolean boolean48 = textNode45.hasAttr("hi!");
        int int49 = textNode45.childNodeSize();
        java.lang.String str50 = textNode45.text();
        org.jsoup.nodes.TextNode textNode52 = textNode45.text("hi!");
        org.jsoup.nodes.Node node53 = textNode45.previousSibling();
        java.lang.String str54 = textNode45.text();
        org.jsoup.nodes.Node node55 = textNode45.parent();
        try {
            org.jsoup.nodes.Node node56 = node42.after(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertNotNull(textNode36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "#text" + "'", str39.equals("#text"));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        java.lang.String str15 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        boolean boolean14 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node17 = textNode2.attr("hi!", "h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str15 = textNode14.outerHtml();
        try {
            org.jsoup.nodes.Node node16 = textNode2.before((org.jsoup.nodes.Node) textNode14);
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
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
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
        org.jsoup.nodes.Attributes attributes38 = textNode13.attributes();
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
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        java.lang.String str32 = textNode17.outerHtml();
        org.jsoup.nodes.Node node33 = textNode17.previousSibling();
        try {
            org.jsoup.nodes.Node node36 = textNode17.attr("", "i!");
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("i!");
        org.jsoup.nodes.Attributes attributes17 = textNode16.attributes();
        int int18 = textNode16.siblingIndex();
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
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
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
        org.jsoup.nodes.TextNode textNode36 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean37 = textNode36.isBlank();
        boolean boolean39 = textNode36.hasAttr("hi!");
        int int40 = textNode36.childNodeSize();
        java.lang.String str41 = textNode36.text();
        org.jsoup.nodes.Attributes attributes42 = textNode36.attributes();
        java.lang.String str43 = textNode36.nodeName();
        org.jsoup.nodes.Node node44 = textNode36.parent();
        boolean boolean45 = textNode17.equals((java.lang.Object) textNode36);
        try {
            org.jsoup.nodes.Node node47 = textNode17.after("i!");
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "#text" + "'", str43.equals("#text"));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        try {
            org.jsoup.nodes.Node node17 = textNode2.before("#text");
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
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("i!");
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
        org.junit.Assert.assertNotNull(textNode21);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        int int6 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("");
        java.lang.String str11 = textNode8.baseUri();
        org.jsoup.nodes.Attributes attributes12 = textNode8.attributes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        textNode10.setBaseUri("#text");
        java.lang.Class<?> wildcardClass13 = textNode10.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        boolean boolean19 = textNode2.isBlank();
        org.jsoup.nodes.Node node20 = textNode2.clone();
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
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
        java.lang.String str19 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean23 = textNode22.isBlank();
        java.lang.String str24 = textNode22.toString();
        java.lang.String str25 = textNode22.baseUri();
        java.lang.String str27 = textNode22.attr("hi!");
        java.lang.String str29 = textNode22.attr("");
        java.lang.String str30 = textNode22.toString();
        org.jsoup.nodes.TextNode textNode32 = textNode22.text("hi!");
        org.jsoup.nodes.Node node35 = textNode32.attr("#text", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = textNode2.equals((java.lang.Object) node35);
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        boolean boolean7 = textNode2.hasAttr("h");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.toString();
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        java.lang.String str27 = textNode2.getWholeText();
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        java.lang.String str15 = textNode2.text();
        try {
            org.jsoup.nodes.Node node16 = textNode2.unwrap();
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
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        try {
            org.jsoup.nodes.Node node18 = textNode2.unwrap();
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
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        org.jsoup.nodes.Node node14 = node13.clone();
        java.lang.Object obj15 = null;
        boolean boolean16 = node14.equals(obj15);
        try {
            node14.remove();
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str16 = textNode13.outerHtml();
        org.jsoup.nodes.Node node19 = textNode13.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes20 = textNode13.attributes();
        org.jsoup.nodes.Node node21 = textNode13.clone();
        org.jsoup.nodes.Attributes attributes22 = textNode13.attributes();
        java.lang.Class<?> wildcardClass23 = textNode13.getClass();
        java.lang.Class<?> wildcardClass24 = textNode13.getClass();
        org.jsoup.nodes.Node node25 = textNode13.nextSibling();
        try {
            textNode2.replaceWith(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        org.jsoup.nodes.Node node29 = textNode27.nextSibling();
        boolean boolean31 = textNode27.hasAttr("hi!");
        boolean boolean33 = textNode27.hasAttr("");
        try {
            textNode27.remove();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("hi!");
        java.lang.String str18 = textNode15.outerHtml();
        org.jsoup.nodes.Node node21 = textNode15.attr("hi!", "#text");
        int int22 = node21.childNodeSize();
        org.jsoup.nodes.Node node23 = node21.previousSibling();
        boolean boolean24 = textNode12.equals((java.lang.Object) node21);
        java.lang.String str25 = textNode12.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "h" + "'", str25.equals("h"));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        try {
            org.jsoup.nodes.Node node18 = textNode2.traverse(nodeVisitor17);
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
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        java.lang.String str35 = textNode17.attr("i!");
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode38.childNodesCopy();
        int int40 = textNode38.siblingIndex();
        org.jsoup.nodes.TextNode textNode42 = textNode38.splitText(1);
        org.jsoup.nodes.TextNode textNode44 = textNode38.splitText(0);
        int int45 = textNode38.childNodeSize();
        try {
            org.jsoup.nodes.Node node46 = textNode17.after((org.jsoup.nodes.Node) textNode38);
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(textNode42);
        org.junit.Assert.assertNotNull(textNode44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        textNode2.setBaseUri("hi!");
        boolean boolean19 = textNode2.isBlank();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        try {
            org.jsoup.nodes.Node node21 = textNode2.after("");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean11 = textNode2.hasAttr("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
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
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("#text");
        textNode24.setBaseUri("i!");
        java.lang.String str27 = textNode24.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        org.jsoup.nodes.Attributes attributes26 = textNode17.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
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
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        int int7 = textNode2.siblingIndex();
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        int int13 = textNode9.childNodeSize();
        java.lang.String str14 = textNode9.outerHtml();
        org.jsoup.nodes.Node node15 = textNode9.nextSibling();
        java.lang.String str16 = textNode9.text();
        org.jsoup.nodes.TextNode textNode18 = textNode9.splitText((int) (short) 1);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        try {
            org.jsoup.nodes.Node node14 = textNode12.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("h");
        java.lang.Class<?> wildcardClass10 = textNode9.getClass();
        java.lang.String str12 = textNode9.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode2.childNodes();
        java.lang.String str26 = textNode2.attr("i!");
        boolean boolean27 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode30 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode30.childNodesCopy();
        int int32 = textNode30.siblingIndex();
        java.lang.String str33 = textNode30.nodeName();
        java.lang.String str34 = textNode30.toString();
        java.lang.String str35 = textNode30.text();
        int int36 = textNode30.siblingIndex();
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode39.childNodesCopy();
        int int41 = textNode39.siblingIndex();
        java.lang.String str42 = textNode39.nodeName();
        java.lang.String str43 = textNode39.toString();
        int int44 = textNode39.siblingIndex();
        boolean boolean45 = textNode30.equals((java.lang.Object) int44);
        org.jsoup.nodes.TextNode textNode47 = textNode30.text("");
        try {
            org.jsoup.nodes.Node node48 = textNode2.after((org.jsoup.nodes.Node) textNode30);
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
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "#text" + "'", str42.equals("#text"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(textNode47);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = node8.parent();
        org.jsoup.nodes.Node node10 = node8.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int14 = textNode13.siblingIndex();
        org.jsoup.nodes.Document document15 = textNode13.ownerDocument();
        int int16 = textNode13.siblingIndex();
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode13.previousSibling();
        org.jsoup.nodes.Node node20 = textNode13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode13.siblingNodes();
        boolean boolean23 = textNode13.hasAttr("");
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        boolean boolean24 = textNode15.isBlank();
        java.lang.String str25 = textNode15.baseUri();
        int int26 = textNode15.siblingIndex();
        java.lang.Class<?> wildcardClass27 = textNode15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
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
        org.jsoup.nodes.TextNode textNode43 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode43.childNodesCopy();
        int int45 = textNode43.siblingIndex();
        org.jsoup.nodes.Node node46 = textNode43.previousSibling();
        java.lang.String str47 = textNode43.nodeName();
        org.jsoup.nodes.Node node48 = textNode43.clone();
        org.jsoup.nodes.Document document49 = node48.ownerDocument();
        boolean boolean50 = textNode29.equals((java.lang.Object) node48);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = node48.childNodesCopy();
        boolean boolean52 = textNode2.equals((java.lang.Object) nodeList51);
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
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "#text" + "'", str47.equals("#text"));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.lang.String str3 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str13 = textNode12.baseUri();
        boolean boolean15 = textNode12.hasAttr("hi!");
        java.lang.String str16 = textNode12.getWholeText();
        java.lang.String str17 = textNode12.getWholeText();
        boolean boolean19 = textNode12.hasAttr("");
        java.lang.String str21 = textNode12.absUrl("#text");
        java.lang.String str22 = textNode12.text();
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode12);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        boolean boolean7 = textNode2.hasAttr("h");
        boolean boolean8 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str11 = textNode10.text();
        org.jsoup.nodes.TextNode textNode13 = textNode10.splitText((int) (byte) 1);
        boolean boolean14 = textNode13.isBlank();
        java.lang.String str16 = textNode13.attr("h");
        java.lang.Class<?> wildcardClass17 = textNode13.getClass();
        org.jsoup.nodes.TextNode textNode19 = textNode13.text("h");
        java.lang.String str20 = textNode13.outerHtml();
        boolean boolean22 = textNode13.hasAttr("h");
        try {
            org.jsoup.nodes.Node node23 = textNode7.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "h" + "'", str20.equals("h"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

