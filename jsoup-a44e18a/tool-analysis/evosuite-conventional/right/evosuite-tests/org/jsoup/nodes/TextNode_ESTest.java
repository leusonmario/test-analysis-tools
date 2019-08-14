/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 14 12:49:55 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(0);
      StringBuilder stringBuilder1 = stringBuilder0.appendCodePoint(0);
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("u6&Q&K{Wb(SD^", "u6&Q&K{Wb(SD^");
      TextNode textNode1 = textNode0.splitText(1);
      assertNotSame(textNode1, textNode0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      // Undeclared exception!
      try { 
        textNode0.splitText(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      textNode0.setSiblingIndex(7);
      TextNode textNode1 = textNode0.text("");
      assertEquals("", textNode1.baseUri());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      textNode0.setSiblingIndex((-113));
      TextNode textNode1 = textNode0.text("^McjLwyI't*7gc}w");
      assertSame(textNode0, textNode1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("embed", "embed");
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      linkedList0.add((Node) textNode0);
      textNode0.childNodes = (List<Node>) linkedList0;
      TextNode textNode1 = textNode0.text("embed");
      assertSame(textNode1, textNode0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      String string0 = textNode0.text();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = TextNode.stripLeadingWhitespace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextNode textNode0 = new TextNode("org.jsoup.nodes.Attribute", "org.jsoup.nodes.Attribute");
      textNode0.setSiblingIndex(1405);
      Node node0 = textNode0.removeAttr("org.jsoup.nodes.Attribute");
      assertEquals(1405, node0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      textNode0.siblingIndex = (-710);
      Node node0 = textNode0.removeAttr("0s78,55");
      assertSame(textNode0, node0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = new TextNode("LHo}|1@+v9<DA(1", "LHo}|1@+v9<DA(1");
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      linkedList0.add((Node) textNode0);
      textNode0.childNodes = (List<Node>) linkedList0;
      Node node0 = textNode0.removeAttr("SqFj0");
      assertSame(node0, textNode0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = TextNode.normaliseWhitespace("fX");
      assertEquals("fX", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TextNode.normaliseWhitespace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextNode textNode0 = new TextNode("", (String) null);
      boolean boolean0 = textNode0.isBlank();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("f?tQBd-C", "f?tQBd-C");
      textNode0.attr("f?tQBd-C", "f?tQBd-C");
      boolean boolean0 = textNode0.hasAttr("f?tQBd-C");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null, (String) null);
      String string0 = textNode0.getWholeText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("embed", "embed");
      Attributes attributes0 = textNode0.attributes();
      assertNotNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("Z", "Z");
      Tag tag0 = Tag.valueOf("Z");
      Element element0 = new Element(tag0, "Z");
      Element element1 = element0.text("Z");
      element1.appendChild(textNode0);
      Node node0 = textNode0.attr("Z", "Z");
      assertEquals("#text", node0.nodeName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextNode textNode0 = new TextNode("C", "C");
      textNode0.setSiblingIndex((-487));
      Node node0 = textNode0.attr("amp", "amp");
      assertSame(textNode0, node0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("Z", "Z");
      Tag tag0 = Tag.valueOf("Z");
      Element element0 = new Element(tag0, "Z");
      element0.text("Z");
      Elements elements0 = element0.getElementsMatchingOwnText("Z");
      LinkedList<Node> linkedList0 = new LinkedList<Node>(elements0);
      textNode0.childNodes = (List<Node>) linkedList0;
      Node node0 = textNode0.attr("Z", "Z");
      assertSame(node0, textNode0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextNode textNode0 = new TextNode("C", "C");
      Node node0 = textNode0.attr("C", "l.5]b@34");
      String string0 = node0.attr("C");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null, (String) null);
      // Undeclared exception!
      try { 
        textNode0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null, "kEUz%tOzR|u&~.");
      TextNode textNode1 = new TextNode("org.jsoup.helper.Validate", "^s+");
      textNode0.parentNode = (Node) textNode1;
      TextNode textNode2 = textNode0.text("kEUz%tOzR|u&~.");
      textNode2.siblingIndex = (-3287);
      // Undeclared exception!
      try { 
        textNode2.toString();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -3286
         //
         verifyException("java.util.Collections$EmptyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      Document document0 = Document.createShell("td");
      document0.setParentNode(textNode0);
      document0.prependChild(textNode0);
      // Undeclared exception!
      try { 
        textNode0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextNode textNode0 = new TextNode("", "");
      textNode0.removeAttr("v*t+1@}n92rnoy4p;");
      // Undeclared exception!
      try { 
        textNode0.text((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null, (String) null);
      // Undeclared exception!
      try { 
        textNode0.text();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        TextNode.stripLeadingWhitespace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TextNode textNode0 = new TextNode("fX", "fX");
      TextNode textNode1 = textNode0.splitText(0);
      textNode1.parentNode = (Node) textNode0;
      // Undeclared exception!
      try { 
        textNode1.splitText(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("AfterDoctypePublicIdentifier", "AfterDoctypePublicIdentifier");
      TextNode textNode1 = textNode0.text("Split offset must not be greater than current text length");
      Attributes attributes0 = new Attributes();
      textNode1.attributes = attributes0;
      // Undeclared exception!
      try { 
        textNode1.splitText(32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null, "");
      // Undeclared exception!
      try { 
        textNode0.splitText(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("b", "b");
      DataNode dataNode0 = DataNode.createFromEncoded("", "");
      textNode0.parentNode = (Node) dataNode0;
      // Undeclared exception!
      try { 
        textNode0.splitText(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      // Undeclared exception!
      try { 
        textNode0.removeAttr("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("fI", "fI");
      Document document0 = Document.createShell("fI");
      document0.prependChild(textNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      textNode0.outerHtmlHead(stringBuilder0, 55296, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(0);
      TextNode textNode0 = TextNode.createFromEncoded("p0I y?8j7K/", "");
      TextNode textNode1 = textNode0.text((String) null);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        textNode1.outerHtmlHead(stringBuilder0, 32, document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TextNode textNode0 = new TextNode("fX", "fX");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.forceAllElementAsBlock(true);
      TextNode textNode1 = textNode0.splitText(0);
      textNode1.parentNode = (Node) textNode0;
      // Undeclared exception!
      try { 
        textNode1.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      Document document0 = Document.createShell("");
      document0.prependChild(textNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead(stringBuilder0, (-31), document_OutputSettings0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // width must be > 0
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      Document document0 = Document.createShell("fm");
      document0.parentNode = (Node) textNode0;
      document0.prependChild(textNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        TextNode.normaliseWhitespace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        TextNode.lastCharIsWhitespace((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TextNode textNode0 = new TextNode("fX", "fX");
      // Undeclared exception!
      try { 
        textNode0.hasAttr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        TextNode.createFromEncoded((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      // Undeclared exception!
      try { 
        textNode0.attr("PV?dk", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("zjz.ksQ?aL$}'~|3", "org.jsoup.nodes.TextNode");
      // Undeclared exception!
      try { 
        textNode0.attr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("jds\"q`?_`8j FX|eo}.", "jds\"q`?_`8j FX|eo}.");
      // Undeclared exception!
      try { 
        textNode0.absUrl((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(" ");
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("u6&Q&K{Wb(SD^", "u6&Q&K{Wb(SD^");
      textNode0.absUrl("u6&Q&K{Wb(SD^");
      String string0 = textNode0.getWholeText();
      assertEquals("u6&Q&K{Wb(SD^", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "e");
      String string0 = textNode0.getWholeText();
      assertEquals("", string0);
      assertEquals("e", textNode0.baseUri());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("b", "b");
      textNode0.attr("b");
      TextNode textNode1 = textNode0.text(";WSqM");
      assertEquals(0, textNode1.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TextNode textNode0 = new TextNode("fX", "fX");
      String string0 = textNode0.nodeName();
      assertEquals("#text", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TextNode textNode0 = new TextNode("fX", "fX");
      boolean boolean0 = textNode0.isBlank();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Document document0 = Document.createShell("~t]4");
      document0.prependText("~t]4");
      Elements elements0 = document0.getElementsMatchingText("");
      assertEquals(4, elements0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      Document document0 = Document.createShell("td");
      document0.prependChild(textNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.forceAllElementAsBlock(true);
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals(1, textNode1.siblingIndex());
      
      textNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings1);
      assertEquals("", stringBuilder0.toString());
      assertEquals(0, textNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      Document document0 = Document.createShell("td");
      document0.prependChild(textNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.forceAllElementAsBlock(true);
      TextNode textNode1 = textNode0.splitText(0);
      textNode1.outerHtmlHead(stringBuilder0, 0, document_OutputSettings1);
      assertEquals("\nfm", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.forceAllElementAsBlock(true);
      textNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings1);
      assertEquals("fm", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Document document0 = Document.createShell("~t]4");
      document0.title("#text");
      String string0 = document0.outerHtml();
      assertEquals("<html>\n <head>\n  <title>#text</title>\n </head>\n <body></body>\n</html>", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TextNode textNode0 = new TextNode("x:", "x:");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
      textNode0.outerHtmlHead(stringBuilder0, 82, document_OutputSettings1);
      assertEquals(0, textNode0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      Document document0 = Document.createShell("td");
      document0.prependChild(textNode0);
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals(1, textNode1.siblingIndex());
      
      String string0 = textNode0.toString();
      assertEquals("", string0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TextNode textNode0 = new TextNode("F)i5s\"", "F)i5s\"");
      // Undeclared exception!
      try { 
        textNode0.splitText(23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      // Undeclared exception!
      try { 
        textNode0.splitText((-28));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TextNode textNode0 = new TextNode("fX", "fX");
      textNode0.hasAttr("fX");
      TextNode textNode1 = textNode0.splitText(0);
      assertNotSame(textNode1, textNode0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TextNode textNode0 = new TextNode("Uez2s&", "Uez2s&");
      StringBuilder stringBuilder0 = new StringBuilder("Uez2s&");
      textNode0.outerHtmlTail(stringBuilder0, 2184, (Document.OutputSettings) null);
      assertEquals(0, textNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TextNode textNode0 = new TextNode("fm", "fm");
      textNode0.toString();
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null, (String) null);
      // Undeclared exception!
      try { 
        textNode0.attributes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TextNode textNode0 = new TextNode("^s+", "^s+");
      String string0 = textNode0.text();
      assertEquals("^s+", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = TextNode.stripLeadingWhitespace("fm");
      assertEquals("fm", string0);
  }
}
