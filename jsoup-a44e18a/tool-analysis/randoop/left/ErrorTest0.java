import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.jsoup.nodes.Node node23 = textNode2.wrap("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.jsoup.nodes.Node node20 = textNode2.wrap("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        org.jsoup.nodes.Node node14 = node12.wrap("#text");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.jsoup.nodes.Node node27 = textNode17.wrap("h");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node13 = textNode9.wrap("i!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Node node6 = textNode2.wrap("h");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node12 = node10.wrap("#text");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        org.jsoup.nodes.Node node20 = textNode2.wrap("i!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.equals((java.lang.Object) "h");
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node15 = node13.wrap("#text");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        org.jsoup.nodes.Node node5 = textNode2.wrap("i!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        org.jsoup.nodes.Node node25 = textNode2.wrap("h");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        org.jsoup.nodes.Node node20 = textNode2.wrap("hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node6 = node4.wrap("hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        org.jsoup.nodes.Node node23 = node21.wrap("h");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        org.jsoup.nodes.Node node15 = node11.wrap("hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        org.jsoup.nodes.Attributes attributes16 = textNode9.attributes();
        org.jsoup.nodes.Node node18 = textNode9.wrap("hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.attr("");
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText(0);
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        org.jsoup.nodes.Node node14 = node12.wrap("hi!");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "i!");
        org.jsoup.nodes.Node node7 = node5.wrap("h");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode6.toString();
        org.jsoup.nodes.Node node15 = textNode6.wrap("hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        boolean boolean17 = textNode2.isBlank();
        org.jsoup.nodes.Node node19 = textNode2.wrap("hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean13 = textNode2.hasAttr("#text");
        int int14 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        org.jsoup.nodes.Node node39 = node37.wrap("#text");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
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
        org.jsoup.nodes.Node node28 = textNode17.wrap("#text");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
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
        org.jsoup.nodes.Node node14 = node12.wrap("i!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.nodeName();
        org.jsoup.nodes.Node node12 = textNode9.wrap("i!");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Node node13 = textNode10.wrap("i!");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        org.jsoup.nodes.Node node4 = textNode2.wrap("#text");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
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
        java.lang.String str17 = textNode9.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode9.childNodesCopy();
        org.jsoup.nodes.Node node20 = textNode9.wrap("hi!");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
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
        org.jsoup.nodes.Node node32 = textNode6.wrap("h");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        org.jsoup.nodes.Node node18 = node16.wrap("hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        int int6 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str11 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
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
        java.lang.String str27 = textNode20.absUrl("h");
        org.jsoup.nodes.Node node29 = textNode20.wrap("#text");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.outerHtml();
        boolean boolean10 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
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
        org.jsoup.nodes.Node node27 = textNode20.wrap("h");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
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
        org.jsoup.nodes.Node node26 = textNode20.wrap("hi!");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node7 = node5.wrap("hi!");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.wrap("h");
    }
}

