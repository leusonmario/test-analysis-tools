import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_");
        boolean boolean15 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__" + "'", str14.equals("__"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("tset\\\"4.5.2.1");
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\\\\\\\"4.5.2.1\"" + "'", str15.equals("\"tset\\\\\\\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "_hi!" + "'", str17.equals("_hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getVersion();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        int int15 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("_tsetContext", false);
        java.lang.String str20 = python2Target1.getAltLabelContextStructName("_tset_tset_tset_#Context");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tsetContext" + "'", str18.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_tset_tset_#ContextContext" + "'", str20.equals("_tset_tset_tset_#ContextContext"));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_tset4.5.2.1");
        java.lang.String str12 = python2Target1.getLanguage();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset4.5.2.1Context" + "'", str11.equals("_tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        int int10 = python2Target1.getInlineTestSetWordSize();
        boolean boolean11 = python2Target1.templatesExist();
        try {
            java.lang.String str13 = python2Target1.getElementListName("_#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str21 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.lang.String str43 = python2Target40.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str44 = python2Target40.getLanguage();
        java.util.Set<java.lang.String> strSet45 = python2Target40.getBadWords();
        boolean boolean46 = python2Target40.templatesExist();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python2Target24.getTokenTypesAsTargetLabels(grammar38, intArray48);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray48);
        int int52 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_#" + "'", str20.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"hi!\"" + "'", str43.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Python2" + "'", str44.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        int int15 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("_tsetContext", false);
        org.antlr.v4.tool.Grammar grammar19 = null;
        try {
            java.lang.String str21 = python2Target1.getTokenTypeAsTargetLabel(grammar19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tsetContext" + "'", str18.equals("_tsetContext"));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "Hi!Context", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"i!Contex\"" + "'", str16.equals("\"i!Contex\""));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python2" + "'", str10.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "__", true);
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"" + "'", str11.equals("\"\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("\\\\n");
        java.lang.String str15 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\\\\n" + "'", str14.equals("_\\\\n"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4.5.2.1" + "'", str15.equals("4.5.2.1"));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("#");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("_tsetContext");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"");
        boolean boolean16 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"#\"" + "'", str10.equals("\"#\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tsetContextContext" + "'", str13.equals("_tsetContextContext"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\"_tset_\\\\\\\"\\\\\\\\\\\\\\\"#\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str15.equals("\"\\\"_tset_\\\\\\\"\\\\\\\\\\\\\\\"#\\\\\\\\\\\\\\\"\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\1" + "'", str10.equals("\\1"));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\"_tset\\\"hi!\\\"Context\"", true);
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_tset ");
        java.lang.String str16 = python2Target1.getListLabel("\"tset_tset0\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset " + "'", str14.equals("__tset "));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset_tset0\"" + "'", str16.equals("\"tset_tset0\""));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        try {
            java.lang.String str9 = python2Target1.getElementListName("_tset_tsethi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"#\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\"\\\\\\\"#\\\\\\\"\\\"\"Context" + "'", str10.equals("\"\\\"\\\\\\\"#\\\\\\\"\\\"\"Context"));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("ython");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_ython" + "'", str14.equals("_ython"));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("_ython");
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset4.5.2.1" + "'", str14.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"_ython\"" + "'", str16.equals("\"_ython\""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("ython");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\\\n", false);
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_ython" + "'", str8.equals("_ython"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\\\\\n" + "'", str12.equals("\\\\\\\\n"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getVersion();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_tset_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str13 = python2Target10.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str14 = python2Target10.getLanguage();
        java.util.Set<java.lang.String> strSet15 = python2Target10.getBadWords();
        boolean boolean16 = python2Target10.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.lang.String str22 = python2Target19.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str23 = python2Target19.getLanguage();
        java.util.Set<java.lang.String> strSet24 = python2Target19.getBadWords();
        boolean boolean25 = python2Target19.templatesExist();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python2Target19.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python2Target10.getTokenTypesAsTargetLabels(grammar17, intArray27);
        java.lang.String[] strArray30 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray27);
        java.lang.String str31 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"hi!\"" + "'", str13.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python2" + "'", str14.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"hi!\"" + "'", str22.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Python2" + "'", str23.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "4.5.2.1" + "'", str31.equals("4.5.2.1"));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str17 = python2Target12.getListLabel("");
        boolean boolean18 = python2Target12.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass19 = python2Target12.getClass();
        java.lang.Class<?> wildcardClass20 = python2Target12.getClass();
        java.lang.String str23 = python2Target12.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str25 = python2Target12.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        boolean boolean34 = python2Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar35 = null;
        int[] intArray36 = new int[] {};
        java.lang.String[] strArray37 = python2Target28.getTokenTypesAsTargetLabels(grammar35, intArray36);
        java.lang.String[] strArray38 = python2Target12.getTokenTypesAsTargetLabels(grammar26, intArray36);
        java.lang.String[] strArray39 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray36);
        java.lang.String str41 = python2Target1.getImplicitSetLabel("\"tset_tset0\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str23.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\0" + "'", str25.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "_tset\"tset_tset0\"" + "'", str41.equals("_tset\"tset_tset0\""));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str9 = python2Target1.getVersion();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("_\"\\\"\\\\\\\\1\\\"\"");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "__\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("__\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\\"hi!\\\"" + "'", str14.equals("_tset\\\"hi!\\\""));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("");
        boolean boolean17 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_" + "'", str16.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target1.getVersion();
        boolean boolean19 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "4.5.2.1" + "'", str18.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getAltLabelContextStructName("hi!");
        int int21 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet22 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Hi!Context" + "'", str20.equals("Hi!Context"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("_tset_tset\\0Context");
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("__tset");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"_tset_tset\\\\0Context\"" + "'", str18.equals("\"_tset_tset\\\\0Context\""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"__tset\"" + "'", str20.equals("\"__tset\""));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        java.lang.String str20 = python2Target1.getLanguage();
        java.lang.String str21 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "4.5.2.1" + "'", str18.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Python2" + "'", str20.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Python2" + "'", str21.equals("Python2"));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getListLabel("_tset\"\\\\64\"");
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\\64\"" + "'", str11.equals("_tset\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getListLabel("_tset");
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset" + "'", str10.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset#");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"_tset#\"" + "'", str11.equals("\"_tset#\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "@" + "'", str13.equals("@"));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
        boolean boolean18 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str12 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\64");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getImplicitSetLabel("__\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\64\"" + "'", str12.equals("\"\\\\64\""));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset__\"\\\"\\\\\\\\1\\\"\"" + "'", str15.equals("_tset__\"\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass20 = python2Target1.getClass();
        try {
            java.lang.String str22 = python2Target1.getImplicitTokenLabel("__\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "4.5.2.1" + "'", str18.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass15 = python2Target11.getClass();
        boolean boolean16 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet21 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        java.lang.String str39 = python2Target24.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str47 = python2Target42.getListLabel("");
        boolean boolean48 = python2Target42.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass49 = python2Target42.getClass();
        int int50 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.lang.String str56 = python2Target53.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str58 = python2Target53.getListLabel("");
        boolean boolean59 = python2Target53.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass60 = python2Target53.getClass();
        java.lang.Class<?> wildcardClass61 = python2Target53.getClass();
        java.lang.String str64 = python2Target53.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str66 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String str72 = python2Target69.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target69.getLanguage();
        java.util.Set<java.lang.String> strSet74 = python2Target69.getBadWords();
        boolean boolean75 = python2Target69.templatesExist();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target53.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python2Target42.getTokenTypesAsTargetLabels(grammar51, intArray77);
        java.lang.String[] strArray81 = python2Target24.getTokenTypesAsTargetLabels(grammar40, intArray77);
        java.lang.String[] strArray82 = python2Target11.getTokenTypesAsTargetLabels(grammar22, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray77);
        java.lang.String str85 = python2Target1.getAltLabelContextStructName("4.5.2.1Contex");
        try {
            java.lang.String str87 = python2Target1.getImplicitTokenLabel("Python");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\\1\"" + "'", str20.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "__" + "'", str39.equals("__"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\"hi!\"" + "'", str56.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str64.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\\0" + "'", str66.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"hi!\"" + "'", str72.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Python2" + "'", str73.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "4.5.2.1ContexContext" + "'", str85.equals("4.5.2.1ContexContext"));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("tset\\\"4.5.2.1");
        try {
            java.lang.String str17 = python2Target1.getElementListName("___tset_\"\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\\\\\\\"4.5.2.1\"" + "'", str15.equals("\"tset\\\\\\\"4.5.2.1\""));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        try {
            java.lang.String str6 = python2Target1.getElementName("\"_tset4.5.2.1ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "a" + "'", str6.equals("a"));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str18 = python2Target15.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str19 = python2Target15.getLanguage();
        java.util.Set<java.lang.String> strSet20 = python2Target15.getBadWords();
        java.lang.String str22 = python2Target15.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean23 = python2Target15.wantsBaseVisitor();
        java.lang.String str26 = python2Target15.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        java.lang.String str32 = python2Target29.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str33 = python2Target29.getLanguage();
        java.util.Set<java.lang.String> strSet34 = python2Target29.getBadWords();
        boolean boolean35 = python2Target29.templatesExist();
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python2Target29.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python2Target15.getTokenTypesAsTargetLabels(grammar27, intArray37);
        java.lang.String[] strArray40 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray37);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"hi!\"" + "'", str18.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Python2" + "'", str19.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "_\"hi!\"Context" + "'", str22.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\\\\n" + "'", str26.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"hi!\"" + "'", str32.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Python2" + "'", str33.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = python2Target1.getLanguage();
        try {
            java.lang.String str13 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"Contex\"", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"" + "'", str19.equals("\\\"\\\\\\\"hi!\\\\\\\"Contex\\\""));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "Python2", false);
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ython" + "'", str14.equals("ython"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_hi!", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "tset_hi" + "'", str16.equals("tset_hi"));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.wantsBaseListener();
        boolean boolean11 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass15 = python2Target11.getClass();
        boolean boolean16 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet21 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        java.lang.String str39 = python2Target24.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str47 = python2Target42.getListLabel("");
        boolean boolean48 = python2Target42.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass49 = python2Target42.getClass();
        int int50 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.lang.String str56 = python2Target53.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str58 = python2Target53.getListLabel("");
        boolean boolean59 = python2Target53.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass60 = python2Target53.getClass();
        java.lang.Class<?> wildcardClass61 = python2Target53.getClass();
        java.lang.String str64 = python2Target53.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str66 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String str72 = python2Target69.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target69.getLanguage();
        java.util.Set<java.lang.String> strSet74 = python2Target69.getBadWords();
        boolean boolean75 = python2Target69.templatesExist();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target53.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python2Target42.getTokenTypesAsTargetLabels(grammar51, intArray77);
        java.lang.String[] strArray81 = python2Target24.getTokenTypesAsTargetLabels(grammar40, intArray77);
        java.lang.String[] strArray82 = python2Target11.getTokenTypesAsTargetLabels(grammar22, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray77);
        java.lang.String str85 = python2Target1.getAltLabelContextStructName("4.5.2.1Contex");
        try {
            java.lang.String str87 = python2Target1.getImplicitTokenLabel("_tset ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\\1\"" + "'", str20.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "__" + "'", str39.equals("__"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\"hi!\"" + "'", str56.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str64.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\\0" + "'", str66.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"hi!\"" + "'", str72.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Python2" + "'", str73.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "4.5.2.1ContexContext" + "'", str85.equals("4.5.2.1ContexContext"));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule7 = null;
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        boolean boolean19 = python2Target1.templatesExist();
        int int20 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        boolean boolean19 = python2Target1.wantsBaseVisitor();
        boolean boolean20 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        org.antlr.v4.tool.Rule rule9 = null;
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset#", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"_tset#\"" + "'", str11.equals("\"_tset#\""));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String str20 = python2Target17.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str21 = python2Target17.getLanguage();
        java.util.Set<java.lang.String> strSet22 = python2Target17.getBadWords();
        boolean boolean23 = python2Target17.templatesExist();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python2Target17.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String str30 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        java.lang.String str33 = python2Target1.getTargetStringLiteralFromString("\"_tset#\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"hi!\"" + "'", str20.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Python2" + "'", str21.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str30.equals("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\\\"_tset#\\\"\"" + "'", str33.equals("\"\\\"_tset#\\\"\""));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str18 = python2Target15.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str19 = python2Target15.getLanguage();
        java.util.Set<java.lang.String> strSet20 = python2Target15.getBadWords();
        java.lang.String str22 = python2Target15.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean23 = python2Target15.wantsBaseVisitor();
        java.lang.String str26 = python2Target15.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        java.lang.String str32 = python2Target29.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str33 = python2Target29.getLanguage();
        java.util.Set<java.lang.String> strSet34 = python2Target29.getBadWords();
        boolean boolean35 = python2Target29.templatesExist();
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python2Target29.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python2Target15.getTokenTypesAsTargetLabels(grammar27, intArray37);
        java.lang.String[] strArray40 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray37);
        org.antlr.v4.tool.Rule rule41 = null;
        try {
            java.lang.String str42 = python2Target1.getRuleFunctionContextStructName(rule41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"hi!\"" + "'", str18.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Python2" + "'", str19.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "_\"hi!\"Context" + "'", str22.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\\\\n" + "'", str26.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"hi!\"" + "'", str32.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Python2" + "'", str33.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target1.getCodeGenerator();
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        boolean boolean13 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_\\\\n", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"Python2\"Context" + "'", str3.equals("\"Python2\"Context"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\\\\\\\n" + "'", str6.equals("_\\\\\\\\n"));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset\"_tset4.5.2.1ContextContext\"");
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"_tset\\\"_tset4.5.2.1ContextContext\\\"\"" + "'", str9.equals("\"_tset\\\"_tset4.5.2.1ContextContext\\\"\""));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"_tset_\\\"\\\\\\\\1\\\"\"" + "'", str10.equals("\"_tset_\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"_tset\\\"hi!\\\"Context\"");
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\"_tsethi!Context\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_\"_tset\\\"hi!\\\"Context\"" + "'", str9.equals("_\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\\\"_tsethi!Context\\\"\"" + "'", str13.equals("\"\\\"_tsethi!Context\\\"\""));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset\"4.5.2.1\"", false);
        org.antlr.v4.tool.Grammar grammar16 = null;
        try {
            java.lang.String str18 = python2Target1.getTokenTypeAsTargetLabel(grammar16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getVersion();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        int int19 = python2Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str21 = python2Target1.getElementListName("_tset_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.templatesExist();
        try {
            java.lang.String str11 = python2Target1.getElementName("\\\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "#Context", false);
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset_" + "'", str8.equals("_tset_"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Contex" + "'", str12.equals("Contex"));
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass15 = python2Target11.getClass();
        boolean boolean16 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet21 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        java.lang.String str39 = python2Target24.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str47 = python2Target42.getListLabel("");
        boolean boolean48 = python2Target42.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass49 = python2Target42.getClass();
        int int50 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.lang.String str56 = python2Target53.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str58 = python2Target53.getListLabel("");
        boolean boolean59 = python2Target53.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass60 = python2Target53.getClass();
        java.lang.Class<?> wildcardClass61 = python2Target53.getClass();
        java.lang.String str64 = python2Target53.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str66 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String str72 = python2Target69.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target69.getLanguage();
        java.util.Set<java.lang.String> strSet74 = python2Target69.getBadWords();
        boolean boolean75 = python2Target69.templatesExist();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target53.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python2Target42.getTokenTypesAsTargetLabels(grammar51, intArray77);
        java.lang.String[] strArray81 = python2Target24.getTokenTypesAsTargetLabels(grammar40, intArray77);
        java.lang.String[] strArray82 = python2Target11.getTokenTypesAsTargetLabels(grammar22, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray77);
        org.antlr.v4.tool.Rule rule84 = null;
        try {
            java.lang.String str85 = python2Target1.getRuleFunctionContextStructName(rule84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\\1\"" + "'", str20.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "__" + "'", str39.equals("__"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\"hi!\"" + "'", str56.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str64.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\\0" + "'", str66.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"hi!\"" + "'", str72.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Python2" + "'", str73.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"\"" + "'", str11.equals("\"\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"\""));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("#");
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset\"\\\\64\"Context");
        java.lang.String str20 = python2Target1.getAltLabelContextStructName("\"_tset\\\"\\\"hi!\\\"Contex\"");
        org.antlr.v4.tool.Rule rule21 = null;
        try {
            java.lang.String str22 = python2Target1.getRuleFunctionContextStructName(rule21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset#" + "'", str14.equals("_tset#"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + " " + "'", str16.equals(" "));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tset\"\\\\64\"ContextContext" + "'", str18.equals("_tset\"\\\\64\"ContextContext"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"_tset\\\"\\\"hi!\\\"Contex\"Context" + "'", str20.equals("\"_tset\\\"\\\"hi!\\\"Contex\"Context"));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        try {
            java.lang.String str18 = python2Target1.getElementName("_tset_\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"_tset\\\"hi!\\\"Context\"");
        java.lang.String str10 = python2Target1.getListLabel("@");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_tset\\\"hi!\\\"Context\"Context" + "'", str8.equals("\"_tset\\\"hi!\\\"Context\"Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "@" + "'", str10.equals("@"));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getVersion();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str12 = python2Target1.getElementListName("__tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule18 = null;
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass15 = python2Target11.getClass();
        boolean boolean16 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet21 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        java.lang.String str39 = python2Target24.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str47 = python2Target42.getListLabel("");
        boolean boolean48 = python2Target42.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass49 = python2Target42.getClass();
        int int50 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.lang.String str56 = python2Target53.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str58 = python2Target53.getListLabel("");
        boolean boolean59 = python2Target53.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass60 = python2Target53.getClass();
        java.lang.Class<?> wildcardClass61 = python2Target53.getClass();
        java.lang.String str64 = python2Target53.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str66 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String str72 = python2Target69.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target69.getLanguage();
        java.util.Set<java.lang.String> strSet74 = python2Target69.getBadWords();
        boolean boolean75 = python2Target69.templatesExist();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target53.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python2Target42.getTokenTypesAsTargetLabels(grammar51, intArray77);
        java.lang.String[] strArray81 = python2Target24.getTokenTypesAsTargetLabels(grammar40, intArray77);
        java.lang.String[] strArray82 = python2Target11.getTokenTypesAsTargetLabels(grammar22, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray77);
        boolean boolean84 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\\1\"" + "'", str20.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "__" + "'", str39.equals("__"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\"hi!\"" + "'", str56.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str64.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\\0" + "'", str66.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"hi!\"" + "'", str72.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Python2" + "'", str73.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"#\"");
        java.lang.String str12 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getLanguage();
        boolean boolean14 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass15 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"#\\\"\"" + "'", str11.equals("\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str18 = python2Target1.getImplicitSetLabel("hi!");
        try {
            java.lang.String str20 = python2Target1.getElementListName("tsetContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_" + "'", str16.equals("_"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tsethi!" + "'", str18.equals("_tsethi!"));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_tset\"4.5.2.1\"Context", true);
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"_tset4.5.2.1ContextContext\\\"\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"tset_tset\\\"4.5.2.1\\\"Contex\"" + "'", str10.equals("\"tset_tset\\\"4.5.2.1\\\"Contex\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\"_tset\\\\\\\"_tset4.5.2.1ContextContext\\\\\\\"\\\"" + "'", str13.equals("\\\"_tset\\\\\\\"_tset4.5.2.1ContextContext\\\\\\\"\\\""));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getListLabel("_tset_\"\\\"#\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\"\\\"#\\\"\"" + "'", str11.equals("_tset_\"\\\"#\\\"\""));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.tool.Rule rule6 = null;
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        java.lang.String str19 = python2Target1.encodeIntAsCharEscape(64);
        boolean boolean20 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "@" + "'", str19.equals("@"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getVersion();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"#\"");
        java.lang.String str12 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getLanguage();
        boolean boolean14 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"#\\\"\"" + "'", str11.equals("\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "_tset", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "tse" + "'", str21.equals("tse"));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str19 = python2Target14.getListLabel("");
        boolean boolean20 = python2Target14.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass21 = python2Target14.getClass();
        java.lang.Class<?> wildcardClass22 = python2Target14.getClass();
        java.lang.String str25 = python2Target14.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str27 = python2Target14.encodeIntAsCharEscape(0);
        java.lang.String str29 = python2Target14.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.lang.String str35 = python2Target32.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str37 = python2Target32.getListLabel("");
        boolean boolean38 = python2Target32.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass39 = python2Target32.getClass();
        int int40 = python2Target32.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String str46 = python2Target43.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str48 = python2Target43.getListLabel("");
        boolean boolean49 = python2Target43.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass50 = python2Target43.getClass();
        java.lang.Class<?> wildcardClass51 = python2Target43.getClass();
        java.lang.String str54 = python2Target43.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str56 = python2Target43.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        java.lang.String str62 = python2Target59.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str63 = python2Target59.getLanguage();
        java.util.Set<java.lang.String> strSet64 = python2Target59.getBadWords();
        boolean boolean65 = python2Target59.templatesExist();
        org.antlr.v4.tool.Grammar grammar66 = null;
        int[] intArray67 = new int[] {};
        java.lang.String[] strArray68 = python2Target59.getTokenTypesAsTargetLabels(grammar66, intArray67);
        java.lang.String[] strArray69 = python2Target43.getTokenTypesAsTargetLabels(grammar57, intArray67);
        java.lang.String[] strArray70 = python2Target32.getTokenTypesAsTargetLabels(grammar41, intArray67);
        java.lang.String[] strArray71 = python2Target14.getTokenTypesAsTargetLabels(grammar30, intArray67);
        java.lang.String[] strArray72 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray67);
        java.lang.String str74 = python2Target1.getAltLabelContextStructName("\"hi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST75 = null;
        try {
            boolean boolean76 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str25.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\0" + "'", str27.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "__" + "'", str29.equals("__"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"hi!\"" + "'", str35.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"hi!\"" + "'", str46.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str54.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\\0" + "'", str56.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\"hi!\"" + "'", str62.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Python2" + "'", str63.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "\"hi!\"Context" + "'", str74.equals("\"hi!\"Context"));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tset_tset_#Context", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tset_tset_#Contex" + "'", str17.equals("tset_tset_#Contex"));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str10.equals("_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getListLabel("_tset\"\\\\64\"");
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str14 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\\64\"" + "'", str11.equals("_tset\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\64");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python2Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\64\"" + "'", str12.equals("\"\\\\64\""));
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\n", false);
        boolean boolean13 = python2Target1.templatesExist();
        boolean boolean14 = python2Target1.templatesExist();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        try {
            java.lang.String str17 = python2Target1.getImplicitTokenLabel("_tset\"_tset4.5.2.1ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\n" + "'", str12.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getListLabel("#");
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("tsetContex");
        java.lang.String str5 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tsettsetContex" + "'", str4.equals("_tsettsetContex"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_ython");
        java.lang.String str16 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__ython" + "'", str14.equals("__ython"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str16.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str21 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.lang.String str43 = python2Target40.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str44 = python2Target40.getLanguage();
        java.util.Set<java.lang.String> strSet45 = python2Target40.getBadWords();
        boolean boolean46 = python2Target40.templatesExist();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python2Target24.getTokenTypesAsTargetLabels(grammar38, intArray48);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray48);
        boolean boolean52 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar53 = null;
        try {
            java.lang.String str55 = python2Target1.getTokenTypeAsTargetLabel(grammar53, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_#" + "'", str20.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"hi!\"" + "'", str43.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Python2" + "'", str44.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getVersion();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset\"hi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String str19 = python2Target16.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str20 = python2Target16.getLanguage();
        java.util.Set<java.lang.String> strSet21 = python2Target16.getBadWords();
        boolean boolean22 = python2Target16.templatesExist();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = new int[] {};
        java.lang.String[] strArray25 = python2Target16.getTokenTypesAsTargetLabels(grammar23, intArray24);
        java.lang.String[] strArray26 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"hi!\"" + "'", str19.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Python2" + "'", str20.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        java.lang.String str19 = python2Target1.getImplicitSetLabel("");
        java.lang.String str21 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str23 = python2Target1.getListLabel("\"_\\\\64\"");
        java.lang.String str25 = python2Target1.encodeIntAsCharEscape(1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset" + "'", str19.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\0" + "'", str21.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"_\\\\64\"" + "'", str23.equals("\"_\\\\64\""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\1" + "'", str25.equals("\\1"));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str13.equals("_tset_tset_\"hi!\"Context"));
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"hi!\\\"Contex\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"Python2\"Context" + "'", str9.equals("\"Python2\"Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"hi!\\\"Contex\"" + "'", str11.equals("_tset\"\\\"hi!\\\"Contex\""));
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\\1\"" + "'", str10.equals("_\"\\\\1\""));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        int int19 = python2Target1.getInlineTestSetWordSize();
        int int20 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str18 = python2Target15.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str19 = python2Target15.getLanguage();
        java.util.Set<java.lang.String> strSet20 = python2Target15.getBadWords();
        boolean boolean21 = python2Target15.templatesExist();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python2Target15.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray23);
        try {
            java.lang.String str27 = python2Target1.getElementName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\n" + "'", str12.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"hi!\"" + "'", str18.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Python2" + "'", str19.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\\\\\\\n");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset\\\\\\\\n" + "'", str9.equals("_tset\\\\\\\\n"));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str17 = python2Target12.getListLabel("");
        boolean boolean18 = python2Target12.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass19 = python2Target12.getClass();
        java.lang.Class<?> wildcardClass20 = python2Target12.getClass();
        java.lang.String str23 = python2Target12.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str25 = python2Target12.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        boolean boolean34 = python2Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar35 = null;
        int[] intArray36 = new int[] {};
        java.lang.String[] strArray37 = python2Target28.getTokenTypesAsTargetLabels(grammar35, intArray36);
        java.lang.String[] strArray38 = python2Target12.getTokenTypesAsTargetLabels(grammar26, intArray36);
        java.lang.String[] strArray39 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray36);
        java.lang.String str40 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python2Target1.getCodeGenerator();
        java.lang.String str44 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"4.5.2.1\\\"\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str23.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\0" + "'", str25.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\"\\\"_tset\\\\\\\"4.5.2.1\\\\\\\"\\\"\"" + "'", str44.equals("\"\\\"_tset\\\\\\\"4.5.2.1\\\\\\\"\\\"\""));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"");
        try {
            java.lang.String str16 = python2Target1.getElementListName("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str14.equals("\"\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        boolean boolean19 = python2Target1.templatesExist();
        java.lang.String str21 = python2Target1.getListLabel("_tset4.5.2.1Context");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tset4.5.2.1Context" + "'", str21.equals("_tset4.5.2.1Context"));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        int int14 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass15 = python2Target1.getClass();
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\"tset_tset\\\"4.5.2.1\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\\\"tset_tset\\\\\\\"4.5.2.1\\\\\\\"Contex\\\"\"" + "'", str17.equals("\"\\\"tset_tset\\\\\\\"4.5.2.1\\\\\\\"Contex\\\"\""));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.Rule rule15 = null;
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d" + "'", str14.equals("d"));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getVersion();
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean14 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "_tsetContext", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "tsetContex" + "'", str18.equals("tsetContex"));
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"hi!\\\"Context\"", true);
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"_tset#\"Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str12.equals("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\"_tset#\\\"Context\"" + "'", str15.equals("\"\\\"_tset#\\\"Context\""));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("\"\\\"hi!\\\"\"");
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset\"\\\"hi!\\\"\"" + "'", str5.equals("_tset\"\\\"hi!\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        int int11 = python2Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("\\\"_tset\\\\\\\"_tset4.5.2.1ContextContext\\\\\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str5 = python2Target1.getElementListName("\"\\\"hi!\\\\\\\"Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        java.lang.String str13 = python2Target1.getLanguage();
        java.lang.String str15 = python2Target1.getAltLabelContextStructName("\"_tset4.5.2.1ContextContext\"");
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("");
        boolean boolean18 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset4.5.2.1ContextContext\"Context" + "'", str15.equals("\"_tset4.5.2.1ContextContext\"Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "_" + "'", str17.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str13 = python2Target1.getImplicitSetLabel("\\0");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"_tset4.5.2.1ContextContext\"");
        boolean boolean16 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset\\0" + "'", str13.equals("_tset\\0"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\"_tset4.5.2.1ContextContext\\\"\"" + "'", str15.equals("\"\\\"_tset4.5.2.1ContextContext\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        try {
            java.lang.String str11 = python2Target1.getElementListName("_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\"_tset\\\"hi!\\\"Context\"", true);
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_tset ");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset " + "'", str14.equals("__tset "));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\"_tset\\\"hi!\\\"Context\"", true);
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"\\\\64\"", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\\\\\\64\\\"" + "'", str15.equals("\\\"\\\\\\\\64\\\""));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("tset\\\"4.5.2.1");
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\\\\\\\"4.5.2.1\"" + "'", str15.equals("\"tset\\\\\\\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "_hi!" + "'", str17.equals("_hi!"));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\\\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str18 = python2Target14.getLanguage();
        java.util.Set<java.lang.String> strSet19 = python2Target14.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target14.getTemplates();
        boolean boolean21 = python2Target14.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass28 = python2Target24.getClass();
        boolean boolean29 = python2Target24.wantsBaseVisitor();
        java.lang.String str31 = python2Target24.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str33 = python2Target24.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet34 = python2Target24.getBadWords();
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        java.lang.String str40 = python2Target37.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str42 = python2Target37.getListLabel("");
        boolean boolean43 = python2Target37.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass44 = python2Target37.getClass();
        java.lang.Class<?> wildcardClass45 = python2Target37.getClass();
        java.lang.String str48 = python2Target37.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str50 = python2Target37.encodeIntAsCharEscape(0);
        java.lang.String str52 = python2Target37.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        java.lang.String str58 = python2Target55.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str60 = python2Target55.getListLabel("");
        boolean boolean61 = python2Target55.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass62 = python2Target55.getClass();
        int int63 = python2Target55.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar64 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target66 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator65);
        java.lang.String str69 = python2Target66.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str71 = python2Target66.getListLabel("");
        boolean boolean72 = python2Target66.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass73 = python2Target66.getClass();
        java.lang.Class<?> wildcardClass74 = python2Target66.getClass();
        java.lang.String str77 = python2Target66.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str79 = python2Target66.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar80 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator81 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target82 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator81);
        java.lang.String str85 = python2Target82.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str86 = python2Target82.getLanguage();
        java.util.Set<java.lang.String> strSet87 = python2Target82.getBadWords();
        boolean boolean88 = python2Target82.templatesExist();
        org.antlr.v4.tool.Grammar grammar89 = null;
        int[] intArray90 = new int[] {};
        java.lang.String[] strArray91 = python2Target82.getTokenTypesAsTargetLabels(grammar89, intArray90);
        java.lang.String[] strArray92 = python2Target66.getTokenTypesAsTargetLabels(grammar80, intArray90);
        java.lang.String[] strArray93 = python2Target55.getTokenTypesAsTargetLabels(grammar64, intArray90);
        java.lang.String[] strArray94 = python2Target37.getTokenTypesAsTargetLabels(grammar53, intArray90);
        java.lang.String[] strArray95 = python2Target24.getTokenTypesAsTargetLabels(grammar35, intArray90);
        java.lang.String[] strArray96 = python2Target14.getTokenTypesAsTargetLabels(grammar22, intArray90);
        java.lang.String[] strArray97 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray90);
        java.lang.String str98 = python2Target1.getVersion();
        java.lang.String str99 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Python2" + "'", str18.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\\1" + "'", str31.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\\\\1\"" + "'", str33.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\"hi!\"" + "'", str40.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str48.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\\0" + "'", str50.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "__" + "'", str52.equals("__"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "\"hi!\"" + "'", str58.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 64 + "'", int63 == 64);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "\"hi!\"" + "'", str69.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str77.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "\\0" + "'", str79.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "\"hi!\"" + "'", str85.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "Python2" + "'", str86.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertNotNull(strArray97);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "4.5.2.1" + "'", str98.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str99 + "' != '" + "Python2" + "'", str99.equals("Python2"));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("_ython");
        java.lang.String str17 = python2Target1.getVersion();
        boolean boolean18 = python2Target1.wantsBaseVisitor();
        java.lang.String str19 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        try {
            java.lang.String str21 = python2Target1.getLoopLabel(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset4.5.2.1" + "'", str14.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"_ython\"" + "'", str16.equals("\"_ython\""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getListLabel("@");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "@" + "'", str9.equals("@"));
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("#");
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset\"\\\\64\"Context");
        java.lang.String str20 = python2Target1.getAltLabelContextStructName("\"_tset\\\"\\\"hi!\\\"Contex\"");
        java.lang.String str23 = python2Target1.getTargetStringLiteralFromString("\"\\\"Python2\\\"Context\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset#" + "'", str14.equals("_tset#"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + " " + "'", str16.equals(" "));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tset\"\\\\64\"ContextContext" + "'", str18.equals("_tset\"\\\\64\"ContextContext"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"_tset\\\"\\\"hi!\\\"Contex\"Context" + "'", str20.equals("\"_tset\\\"\\\"hi!\\\"Contex\"Context"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\"\\\\\\\"Python2\\\\\\\"Context\\\"\"" + "'", str23.equals("\"\\\"\\\\\\\"Python2\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset\"4.5.2.1\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getListLabel("#");
        boolean boolean13 = python2Target1.templatesExist();
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("4.5.2.1Context");
        java.lang.String str19 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass20 = python2Target1.getClass();
        int int21 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        try {
            boolean boolean23 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_4.5.2.1Context" + "'", str18.equals("_4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Python2" + "'", str19.equals("Python2"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset\"4.5.2.1\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset\"4.5.2.1\"" + "'", str9.equals("_tset_tset\"4.5.2.1\""));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        try {
            java.lang.String str4 = python2Target1.getElementName("___tset_\"\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str13 = python2Target10.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass14 = python2Target10.getClass();
        boolean boolean15 = python2Target10.wantsBaseVisitor();
        java.lang.String str17 = python2Target10.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str19 = python2Target10.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet20 = python2Target10.getBadWords();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String str26 = python2Target23.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str28 = python2Target23.getListLabel("");
        boolean boolean29 = python2Target23.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass30 = python2Target23.getClass();
        java.lang.Class<?> wildcardClass31 = python2Target23.getClass();
        java.lang.String str34 = python2Target23.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str36 = python2Target23.encodeIntAsCharEscape(0);
        java.lang.String str38 = python2Target23.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        java.lang.String str44 = python2Target41.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str46 = python2Target41.getListLabel("");
        boolean boolean47 = python2Target41.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass48 = python2Target41.getClass();
        int int49 = python2Target41.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar50 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator51);
        java.lang.String str55 = python2Target52.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str57 = python2Target52.getListLabel("");
        boolean boolean58 = python2Target52.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass59 = python2Target52.getClass();
        java.lang.Class<?> wildcardClass60 = python2Target52.getClass();
        java.lang.String str63 = python2Target52.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str65 = python2Target52.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar66 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target68 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator67);
        java.lang.String str71 = python2Target68.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str72 = python2Target68.getLanguage();
        java.util.Set<java.lang.String> strSet73 = python2Target68.getBadWords();
        boolean boolean74 = python2Target68.templatesExist();
        org.antlr.v4.tool.Grammar grammar75 = null;
        int[] intArray76 = new int[] {};
        java.lang.String[] strArray77 = python2Target68.getTokenTypesAsTargetLabels(grammar75, intArray76);
        java.lang.String[] strArray78 = python2Target52.getTokenTypesAsTargetLabels(grammar66, intArray76);
        java.lang.String[] strArray79 = python2Target41.getTokenTypesAsTargetLabels(grammar50, intArray76);
        java.lang.String[] strArray80 = python2Target23.getTokenTypesAsTargetLabels(grammar39, intArray76);
        java.lang.String[] strArray81 = python2Target10.getTokenTypesAsTargetLabels(grammar21, intArray76);
        java.lang.String[] strArray82 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray76);
        java.lang.Class<?> wildcardClass83 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"hi!\"" + "'", str13.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\\1" + "'", str17.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\\\\1\"" + "'", str19.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"hi!\"" + "'", str26.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str34.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\\0" + "'", str36.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "__" + "'", str38.equals("__"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\"hi!\"" + "'", str44.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "\"hi!\"" + "'", str55.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str63.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "\\0" + "'", str65.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\"hi!\"" + "'", str71.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Python2" + "'", str72.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\n", false);
        boolean boolean13 = python2Target1.templatesExist();
        boolean boolean14 = python2Target1.templatesExist();
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\n" + "'", str12.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"" + "'", str16.equals("__\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\""));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\"_\\\"hi!\\\"Context\"", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d" + "'", str14.equals("d"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\\\"_\\\\\\\"hi!\\\\\\\"Context\\\"" + "'", str17.equals("\\\"_\\\\\\\"hi!\\\\\\\"Context\\\""));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str16 = python2Target12.getLanguage();
        java.util.Set<java.lang.String> strSet17 = python2Target12.getBadWords();
        boolean boolean18 = python2Target12.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String str24 = python2Target21.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str25 = python2Target21.getLanguage();
        java.util.Set<java.lang.String> strSet26 = python2Target21.getBadWords();
        boolean boolean27 = python2Target21.templatesExist();
        org.antlr.v4.tool.Grammar grammar28 = null;
        int[] intArray29 = new int[] {};
        java.lang.String[] strArray30 = python2Target21.getTokenTypesAsTargetLabels(grammar28, intArray29);
        java.lang.String[] strArray31 = python2Target12.getTokenTypesAsTargetLabels(grammar19, intArray29);
        java.lang.String[] strArray32 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray29);
        org.stringtemplate.v4.STGroup sTGroup33 = python2Target1.getTemplates();
        java.lang.String str35 = python2Target1.encodeIntAsCharEscape(64);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python2" + "'", str16.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\"hi!\"" + "'", str24.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Python2" + "'", str25.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(sTGroup33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "@" + "'", str35.equals("@"));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("ython");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = python2Target1.getVersion();
        try {
            java.lang.String str13 = python2Target1.getElementListName("\"\\\"\\\\\\\"#\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_ython" + "'", str8.equals("_ython"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str16 = python2Target1.getListLabel("_tset_tsethi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\n" + "'", str14.equals("\\n"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset_tsethi!" + "'", str16.equals("_tset_tsethi!"));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"hi!\\\"\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"" + "'", str13.equals("_tset\\\"\\\\\\\"hi!\\\\\\\"\\\""));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        try {
            java.lang.String str21 = python2Target1.getElementName("_tset\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "4.5.2.1" + "'", str18.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.getTemplates();
        boolean boolean17 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass16 = python2Target12.getClass();
        boolean boolean17 = python2Target12.wantsBaseVisitor();
        java.lang.String str19 = python2Target12.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str21 = python2Target12.getTargetStringLiteralFromString("\\1");
        java.lang.String str22 = python2Target12.getLanguage();
        java.lang.String str24 = python2Target12.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "_tsetContext", false);
        int int29 = python2Target12.getSerializedATNSegmentLimit();
        java.lang.String str31 = python2Target12.getImplicitSetLabel("_#");
        java.lang.String str32 = python2Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str40 = python2Target35.getListLabel("");
        boolean boolean41 = python2Target35.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass42 = python2Target35.getClass();
        java.lang.Class<?> wildcardClass43 = python2Target35.getClass();
        java.lang.String str46 = python2Target35.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str48 = python2Target35.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        java.lang.String str54 = python2Target51.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str55 = python2Target51.getLanguage();
        java.util.Set<java.lang.String> strSet56 = python2Target51.getBadWords();
        boolean boolean57 = python2Target51.templatesExist();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python2Target51.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python2Target35.getTokenTypesAsTargetLabels(grammar49, intArray59);
        java.lang.String[] strArray62 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray59);
        java.lang.String[] strArray63 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray59);
        int int64 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule65 = null;
        try {
            java.lang.String str66 = python2Target1.getRuleFunctionContextStructName(rule65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\1" + "'", str19.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\\\\1\"" + "'", str21.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python2" + "'", str22.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1Context" + "'", str24.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tsetContex" + "'", str28.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "_tset_#" + "'", str31.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"hi!\"" + "'", str38.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str46.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\\0" + "'", str48.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"hi!\"" + "'", str54.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Python2" + "'", str55.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 64 + "'", int64 == 64);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getVersion();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_\\\"_tset\\\\\\\"4.5.2.1\\\\\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("");
        try {
            java.lang.String str13 = python2Target1.getElementListName("\"\\\"\\\\\\\"Python2\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"" + "'", str11.equals("\"\""));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean7 = python2Target1.templatesExist();
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("4.5.2.1");
        int int15 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset4.5.2.1" + "'", str14.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getListLabel("\"_tset4.5.2.1ContextContext\"");
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"_tset4.5.2.1ContextContext\"" + "'", str13.equals("\"_tset4.5.2.1ContextContext\""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\n\"", true);
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("#");
        java.lang.String str16 = python2Target1.getImplicitSetLabel("_tset\"\\\"_tset\\\"hi!\\\"Context\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_#" + "'", str14.equals("_#"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset_tset\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str16.equals("_tset_tset\"\\\"_tset\\\"hi!\\\"Context\""));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule12 = null;
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(100);
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"#\\\\\\\"\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "d" + "'", str6.equals("d"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d" + "'", str8.equals("d"));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"\\\\\\\"#\\\\\\\"\\\"\"Context" + "'", str11.equals("\"\\\"\\\\\\\"#\\\\\\\"\\\"\"Context"));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("tset");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"_tset\\\"hi!\\\"Context\"");
        java.lang.String str11 = python2Target1.getListLabel("_tset4.5.2.1ContextContext");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"4.5.2.1\"" + "'", str3.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"hi!\"" + "'", str5.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str9.equals("_tset\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset4.5.2.1ContextContext" + "'", str11.equals("_tset4.5.2.1ContextContext"));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass16 = python2Target12.getClass();
        boolean boolean17 = python2Target12.wantsBaseVisitor();
        java.lang.String str19 = python2Target12.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str21 = python2Target12.getTargetStringLiteralFromString("\\1");
        java.lang.String str22 = python2Target12.getLanguage();
        java.lang.String str24 = python2Target12.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "_tsetContext", false);
        int int29 = python2Target12.getSerializedATNSegmentLimit();
        java.lang.String str31 = python2Target12.getImplicitSetLabel("_#");
        java.lang.String str32 = python2Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str40 = python2Target35.getListLabel("");
        boolean boolean41 = python2Target35.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass42 = python2Target35.getClass();
        java.lang.Class<?> wildcardClass43 = python2Target35.getClass();
        java.lang.String str46 = python2Target35.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str48 = python2Target35.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        java.lang.String str54 = python2Target51.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str55 = python2Target51.getLanguage();
        java.util.Set<java.lang.String> strSet56 = python2Target51.getBadWords();
        boolean boolean57 = python2Target51.templatesExist();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python2Target51.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python2Target35.getTokenTypesAsTargetLabels(grammar49, intArray59);
        java.lang.String[] strArray62 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray59);
        java.lang.String[] strArray63 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray59);
        java.lang.String str65 = python2Target1.getImplicitRuleLabel("__");
        boolean boolean66 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\1" + "'", str19.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\\\\1\"" + "'", str21.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python2" + "'", str22.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1Context" + "'", str24.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tsetContex" + "'", str28.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "_tset_#" + "'", str31.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"hi!\"" + "'", str38.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str46.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\\0" + "'", str48.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"hi!\"" + "'", str54.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Python2" + "'", str55.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "___" + "'", str65.equals("___"));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("\"\\\"hi!\\\"\"");
        java.lang.String str6 = python2Target1.getLanguage();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset\"\\\"hi!\\\"\"" + "'", str5.equals("_tset\"\\\"hi!\\\"\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Python2" + "'", str6.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Python2" + "'", str8.equals("Python2"));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getListLabel("#");
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\"#\\\"\"");
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        boolean boolean17 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        java.lang.String str20 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"" + "'", str15.equals("\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "d" + "'", str20.equals("d"));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str19 = python2Target14.getListLabel("");
        boolean boolean20 = python2Target14.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass21 = python2Target14.getClass();
        java.lang.Class<?> wildcardClass22 = python2Target14.getClass();
        java.lang.String str25 = python2Target14.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str27 = python2Target14.encodeIntAsCharEscape(0);
        java.lang.String str29 = python2Target14.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.lang.String str35 = python2Target32.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str37 = python2Target32.getListLabel("");
        boolean boolean38 = python2Target32.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass39 = python2Target32.getClass();
        int int40 = python2Target32.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String str46 = python2Target43.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str48 = python2Target43.getListLabel("");
        boolean boolean49 = python2Target43.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass50 = python2Target43.getClass();
        java.lang.Class<?> wildcardClass51 = python2Target43.getClass();
        java.lang.String str54 = python2Target43.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str56 = python2Target43.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        java.lang.String str62 = python2Target59.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str63 = python2Target59.getLanguage();
        java.util.Set<java.lang.String> strSet64 = python2Target59.getBadWords();
        boolean boolean65 = python2Target59.templatesExist();
        org.antlr.v4.tool.Grammar grammar66 = null;
        int[] intArray67 = new int[] {};
        java.lang.String[] strArray68 = python2Target59.getTokenTypesAsTargetLabels(grammar66, intArray67);
        java.lang.String[] strArray69 = python2Target43.getTokenTypesAsTargetLabels(grammar57, intArray67);
        java.lang.String[] strArray70 = python2Target32.getTokenTypesAsTargetLabels(grammar41, intArray67);
        java.lang.String[] strArray71 = python2Target14.getTokenTypesAsTargetLabels(grammar30, intArray67);
        java.lang.String[] strArray72 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray67);
        try {
            java.lang.String str74 = python2Target1.getElementName("__tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str25.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\0" + "'", str27.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "__" + "'", str29.equals("__"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"hi!\"" + "'", str35.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"hi!\"" + "'", str46.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str54.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\\0" + "'", str56.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\"hi!\"" + "'", str62.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Python2" + "'", str63.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        java.lang.String str14 = python2Target1.getListLabel("_\"_tset\\\"hi!\\\"Context\"Context");
        int int15 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\"_tset\\\"hi!\\\"Context\"Context" + "'", str14.equals("_\"_tset\\\"hi!\\\"Context\"Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(100);
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("_tset\"\\\\64\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "d" + "'", str6.equals("d"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d" + "'", str8.equals("d"));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset\"\\\\64\"Context" + "'", str11.equals("__tset\"\\\\64\"Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str15.equals("\"tset\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        try {
            java.lang.String str13 = python2Target1.getElementName("_tset\"tset_tset0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass16 = python2Target12.getClass();
        boolean boolean17 = python2Target12.wantsBaseVisitor();
        java.lang.String str19 = python2Target12.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str21 = python2Target12.getTargetStringLiteralFromString("\\1");
        java.lang.String str22 = python2Target12.getLanguage();
        java.lang.String str24 = python2Target12.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "_tsetContext", false);
        int int29 = python2Target12.getSerializedATNSegmentLimit();
        java.lang.String str31 = python2Target12.getImplicitSetLabel("_#");
        java.lang.String str32 = python2Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str40 = python2Target35.getListLabel("");
        boolean boolean41 = python2Target35.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass42 = python2Target35.getClass();
        java.lang.Class<?> wildcardClass43 = python2Target35.getClass();
        java.lang.String str46 = python2Target35.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str48 = python2Target35.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        java.lang.String str54 = python2Target51.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str55 = python2Target51.getLanguage();
        java.util.Set<java.lang.String> strSet56 = python2Target51.getBadWords();
        boolean boolean57 = python2Target51.templatesExist();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python2Target51.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python2Target35.getTokenTypesAsTargetLabels(grammar49, intArray59);
        java.lang.String[] strArray62 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray59);
        java.lang.String[] strArray63 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray59);
        boolean boolean64 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet66 = python2Target1.getBadWords();
        java.lang.String str68 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\1" + "'", str19.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\\\\1\"" + "'", str21.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python2" + "'", str22.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1Context" + "'", str24.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tsetContex" + "'", str28.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "_tset_#" + "'", str31.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"hi!\"" + "'", str38.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str46.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\\0" + "'", str48.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"hi!\"" + "'", str54.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Python2" + "'", str55.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(codeGenerator65);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "\\1" + "'", str68.equals("\\1"));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str21 = python2Target1.getListLabel("_tsettsetContex");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tsettsetContex" + "'", str21.equals("_tsettsetContex"));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str21 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.lang.String str43 = python2Target40.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str44 = python2Target40.getLanguage();
        java.util.Set<java.lang.String> strSet45 = python2Target40.getBadWords();
        boolean boolean46 = python2Target40.templatesExist();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python2Target24.getTokenTypesAsTargetLabels(grammar38, intArray48);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray48);
        java.lang.String str52 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet53 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_#" + "'", str20.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"hi!\"" + "'", str43.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Python2" + "'", str44.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Python2" + "'", str52.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet53);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str13 = python2Target10.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass14 = python2Target10.getClass();
        boolean boolean15 = python2Target10.wantsBaseVisitor();
        java.lang.String str17 = python2Target10.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str19 = python2Target10.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet20 = python2Target10.getBadWords();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String str26 = python2Target23.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str28 = python2Target23.getListLabel("");
        boolean boolean29 = python2Target23.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass30 = python2Target23.getClass();
        java.lang.Class<?> wildcardClass31 = python2Target23.getClass();
        java.lang.String str34 = python2Target23.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str36 = python2Target23.encodeIntAsCharEscape(0);
        java.lang.String str38 = python2Target23.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        java.lang.String str44 = python2Target41.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str46 = python2Target41.getListLabel("");
        boolean boolean47 = python2Target41.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass48 = python2Target41.getClass();
        int int49 = python2Target41.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar50 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator51);
        java.lang.String str55 = python2Target52.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str57 = python2Target52.getListLabel("");
        boolean boolean58 = python2Target52.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass59 = python2Target52.getClass();
        java.lang.Class<?> wildcardClass60 = python2Target52.getClass();
        java.lang.String str63 = python2Target52.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str65 = python2Target52.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar66 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target68 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator67);
        java.lang.String str71 = python2Target68.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str72 = python2Target68.getLanguage();
        java.util.Set<java.lang.String> strSet73 = python2Target68.getBadWords();
        boolean boolean74 = python2Target68.templatesExist();
        org.antlr.v4.tool.Grammar grammar75 = null;
        int[] intArray76 = new int[] {};
        java.lang.String[] strArray77 = python2Target68.getTokenTypesAsTargetLabels(grammar75, intArray76);
        java.lang.String[] strArray78 = python2Target52.getTokenTypesAsTargetLabels(grammar66, intArray76);
        java.lang.String[] strArray79 = python2Target41.getTokenTypesAsTargetLabels(grammar50, intArray76);
        java.lang.String[] strArray80 = python2Target23.getTokenTypesAsTargetLabels(grammar39, intArray76);
        java.lang.String[] strArray81 = python2Target10.getTokenTypesAsTargetLabels(grammar21, intArray76);
        java.lang.String[] strArray82 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray76);
        java.lang.String str83 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"hi!\"" + "'", str13.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\\1" + "'", str17.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\\\\1\"" + "'", str19.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"hi!\"" + "'", str26.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str34.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\\0" + "'", str36.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "__" + "'", str38.equals("__"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\"hi!\"" + "'", str44.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "\"hi!\"" + "'", str55.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str63.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "\\0" + "'", str65.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\"hi!\"" + "'", str71.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Python2" + "'", str72.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "Python2" + "'", str83.equals("Python2"));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str15 = python2Target11.getLanguage();
        java.util.Set<java.lang.String> strSet16 = python2Target11.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target11.getTemplates();
        boolean boolean18 = python2Target11.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\\\\n\"", true);
        java.lang.String str24 = python2Target11.getTargetStringLiteralFromString("4.5.2.1Context");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.lang.String str30 = python2Target27.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str31 = python2Target27.getLanguage();
        java.util.Set<java.lang.String> strSet32 = python2Target27.getBadWords();
        boolean boolean33 = python2Target27.templatesExist();
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python2Target27.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python2Target11.getTokenTypesAsTargetLabels(grammar25, intArray35);
        java.lang.String[] strArray38 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray35);
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python2Target1.getCodeGenerator();
        boolean boolean40 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Python2" + "'", str15.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\\\n\"" + "'", str22.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\"4.5.2.1Context\"" + "'", str24.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\"hi!\"" + "'", str30.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Python2" + "'", str31.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass15 = python2Target11.getClass();
        boolean boolean16 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet21 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        java.lang.String str39 = python2Target24.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str47 = python2Target42.getListLabel("");
        boolean boolean48 = python2Target42.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass49 = python2Target42.getClass();
        int int50 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.lang.String str56 = python2Target53.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str58 = python2Target53.getListLabel("");
        boolean boolean59 = python2Target53.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass60 = python2Target53.getClass();
        java.lang.Class<?> wildcardClass61 = python2Target53.getClass();
        java.lang.String str64 = python2Target53.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str66 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String str72 = python2Target69.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target69.getLanguage();
        java.util.Set<java.lang.String> strSet74 = python2Target69.getBadWords();
        boolean boolean75 = python2Target69.templatesExist();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target53.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python2Target42.getTokenTypesAsTargetLabels(grammar51, intArray77);
        java.lang.String[] strArray81 = python2Target24.getTokenTypesAsTargetLabels(grammar40, intArray77);
        java.lang.String[] strArray82 = python2Target11.getTokenTypesAsTargetLabels(grammar22, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray77);
        java.lang.String str85 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator86 = null;
        java.lang.String str89 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator86, "_tset4.5.2.1", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\\1\"" + "'", str20.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "__" + "'", str39.equals("__"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\"hi!\"" + "'", str56.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str64.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\\0" + "'", str66.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"hi!\"" + "'", str72.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Python2" + "'", str73.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "\\n" + "'", str85.equals("\\n"));
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "tset4.5.2." + "'", str89.equals("tset4.5.2."));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        java.lang.String str19 = python2Target1.getListLabel("\"\\\\1\"");
        java.lang.String str20 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\\\\1\"" + "'", str19.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Python2" + "'", str20.equals("Python2"));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        java.lang.String str13 = python2Target1.getLanguage();
        java.lang.String str15 = python2Target1.getAltLabelContextStructName("\"_tset4.5.2.1ContextContext\"");
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset4.5.2.1ContextContext\"Context" + "'", str15.equals("\"_tset4.5.2.1ContextContext\"Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "_" + "'", str17.equals("_"));
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getListLabel("\\64");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\64" + "'", str14.equals("\\64"));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getVersion();
        boolean boolean10 = python2Target1.wantsBaseListener();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str13 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d" + "'", str12.equals("d"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("tsetContex");
        try {
            java.lang.String str6 = python2Target1.getElementListName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tsettsetContex" + "'", str4.equals("_tsettsetContex"));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset\\\"hi!\\\"Context");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("_tset_tset_\"hi!\"Context", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_tset\\\\\\\"hi!\\\\\\\"Context\"" + "'", str12.equals("\"_tset\\\\\\\"hi!\\\\\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset_tset_\\\"hi!\\\"Context" + "'", str15.equals("_tset_tset_\\\"hi!\\\"Context"));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        try {
            java.lang.Class<?> wildcardClass18 = codeGenerator17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("4.5.2.1Context");
        java.lang.String str19 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        try {
            boolean boolean21 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_4.5.2.1Context" + "'", str18.equals("_4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Python2" + "'", str19.equals("Python2"));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        try {
            java.lang.String str18 = python2Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "#Context", false);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset_" + "'", str8.equals("_tset_"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Contex" + "'", str12.equals("Contex"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str14.equals("\"\\\"Python2\\\"\""));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.templatesExist();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getVersion();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getAltLabelContextStructName("hi!");
        try {
            java.lang.String str22 = python2Target1.getElementListName("_\\\"_tset\\\\\\\"4.5.2.1\\\\\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Hi!Context" + "'", str20.equals("Hi!Context"));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\n" + "'", str9.equals("\\n"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"\\\"Python2\\\"\"", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\"\\\\\\\"Python2\\\\\\\"\\\"" + "'", str11.equals("\\\"\\\\\\\"Python2\\\\\\\"\\\""));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        java.lang.String str19 = python2Target1.getListLabel("_\"\\\"#\\\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        try {
            java.lang.String str21 = python2Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_\"\\\"#\\\"\"" + "'", str19.equals("_\"\\\"#\\\"\""));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("_ython");
        boolean boolean17 = python2Target1.wantsBaseListener();
        int int18 = python2Target1.getInlineTestSetWordSize();
        boolean boolean19 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset4.5.2.1" + "'", str14.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"_ython\"" + "'", str16.equals("\"_ython\""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(100);
        try {
            java.lang.String str8 = python2Target1.getElementName("\"tset\\\\\\\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "d" + "'", str6.equals("d"));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule18 = null;
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getVersion();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("\"\\\"#\\\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        try {
            java.lang.String str22 = python2Target1.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\"\\\\\\\"#\\\\\\\"\\\"\"" + "'", str20.equals("\"\\\"\\\\\\\"#\\\\\\\"\\\"\""));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        int int9 = python2Target1.getInlineTestSetWordSize();
        boolean boolean10 = python2Target1.wantsBaseListener();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_tset_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        boolean boolean13 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tset_tset_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str12.equals("_tset_tset_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset\"_tset4.5.2.1ContextContext\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"_tset\\\"_tset4.5.2.1ContextContext\\\"\"" + "'", str9.equals("\"_tset\\\"_tset4.5.2.1ContextContext\\\"\""));
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str19 = python2Target14.getListLabel("");
        boolean boolean20 = python2Target14.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass21 = python2Target14.getClass();
        java.lang.Class<?> wildcardClass22 = python2Target14.getClass();
        java.lang.String str25 = python2Target14.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str27 = python2Target14.encodeIntAsCharEscape(0);
        java.lang.String str29 = python2Target14.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.lang.String str35 = python2Target32.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str37 = python2Target32.getListLabel("");
        boolean boolean38 = python2Target32.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass39 = python2Target32.getClass();
        int int40 = python2Target32.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String str46 = python2Target43.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str48 = python2Target43.getListLabel("");
        boolean boolean49 = python2Target43.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass50 = python2Target43.getClass();
        java.lang.Class<?> wildcardClass51 = python2Target43.getClass();
        java.lang.String str54 = python2Target43.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str56 = python2Target43.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        java.lang.String str62 = python2Target59.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str63 = python2Target59.getLanguage();
        java.util.Set<java.lang.String> strSet64 = python2Target59.getBadWords();
        boolean boolean65 = python2Target59.templatesExist();
        org.antlr.v4.tool.Grammar grammar66 = null;
        int[] intArray67 = new int[] {};
        java.lang.String[] strArray68 = python2Target59.getTokenTypesAsTargetLabels(grammar66, intArray67);
        java.lang.String[] strArray69 = python2Target43.getTokenTypesAsTargetLabels(grammar57, intArray67);
        java.lang.String[] strArray70 = python2Target32.getTokenTypesAsTargetLabels(grammar41, intArray67);
        java.lang.String[] strArray71 = python2Target14.getTokenTypesAsTargetLabels(grammar30, intArray67);
        java.lang.String[] strArray72 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray67);
        java.lang.String str74 = python2Target1.getAltLabelContextStructName("\"hi!\"");
        org.antlr.v4.tool.Grammar grammar75 = null;
        try {
            java.lang.String str77 = python2Target1.getTokenTypeAsTargetLabel(grammar75, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str25.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\0" + "'", str27.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "__" + "'", str29.equals("__"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"hi!\"" + "'", str35.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"hi!\"" + "'", str46.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str54.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\\0" + "'", str56.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\"hi!\"" + "'", str62.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Python2" + "'", str63.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "\"hi!\"Context" + "'", str74.equals("\"hi!\"Context"));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet19 = python2Target1.getBadWords();
        int int20 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str22 = python2Target1.getImplicitSetLabel("__tsetContext");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "_tset__tsetContext" + "'", str22.equals("_tset__tsetContext"));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\n", false);
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\n" + "'", str12.equals("\\\\n"));
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        int int14 = python2Target1.getInlineTestSetWordSize();
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("#");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_#" + "'", str18.equals("_#"));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getVersion();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getListLabel("_tset");
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset" + "'", str10.equals("_tset"));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("_tset_tset\"4.5.2.1\"");
        boolean boolean11 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset_tset\"4.5.2.1\"Context" + "'", str10.equals("_tset_tset\"4.5.2.1\"Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("__tset");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "___tset" + "'", str6.equals("___tset"));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"hi!\\\"Context\"", true);
        java.lang.String str13 = python2Target1.getLanguage();
        try {
            java.lang.String str15 = python2Target1.getElementListName("_tset\"_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str12.equals("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar4 = null;
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sTGroup3);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\\64");
        boolean boolean13 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\\64" + "'", str12.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset#");
        try {
            java.lang.String str13 = python2Target1.getElementListName("_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"_tset#\"" + "'", str11.equals("\"_tset#\""));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        java.lang.String str19 = python2Target1.getImplicitSetLabel("");
        java.lang.String str21 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str23 = python2Target1.getListLabel("\"_\\\\64\"");
        java.lang.String str24 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass25 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset" + "'", str19.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\0" + "'", str21.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"_\\\\64\"" + "'", str23.equals("\"_\\\\64\""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Python2" + "'", str24.equals("Python2"));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean18 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"Context" + "'", str12.equals("\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str14.equals("\"\\\"hi!\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getListLabel("_tset\"\\\\64\"");
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\\64\"" + "'", str11.equals("_tset\"\\\\64\""));
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        boolean boolean16 = python2Target1.wantsBaseVisitor();
        java.lang.String str17 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str10 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\n" + "'", str9.equals("\\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python2" + "'", str10.equals("Python2"));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "Python2", false);
        int int15 = python2Target1.getInlineTestSetWordSize();
        boolean boolean16 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass17 = python2Target1.getClass();
        java.lang.String str19 = python2Target1.getListLabel("tset4.5.2.1ContextContex");
        org.antlr.v4.tool.Grammar grammar20 = null;
        try {
            java.lang.String str22 = python2Target1.getTokenTypeAsTargetLabel(grammar20, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ython" + "'", str14.equals("ython"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "tset4.5.2.1ContextContex" + "'", str19.equals("tset4.5.2.1ContextContex"));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getListLabel("#");
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\"#\\\"\"");
        java.lang.String str16 = python2Target1.getVersion();
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"" + "'", str15.equals("\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"tset_tset\\\"4.5.2.1\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"tset_tset\\\"4.5.2.1\\\"Contex\"Context" + "'", str12.equals("\"tset_tset\\\"4.5.2.1\\\"Contex\"Context"));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str11.equals("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getListLabel("\\1");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\0" + "'", str16.equals("\\0"));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str21 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.lang.String str43 = python2Target40.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str44 = python2Target40.getLanguage();
        java.util.Set<java.lang.String> strSet45 = python2Target40.getBadWords();
        boolean boolean46 = python2Target40.templatesExist();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python2Target24.getTokenTypesAsTargetLabels(grammar38, intArray48);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray48);
        java.lang.String str52 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass53 = python2Target1.getClass();
        boolean boolean54 = python2Target1.wantsBaseListener();
        java.lang.String str56 = python2Target1.getImplicitSetLabel("\"tset_\\\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        java.lang.String str58 = python2Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_#" + "'", str20.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"hi!\"" + "'", str43.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Python2" + "'", str44.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Python2" + "'", str52.equals("Python2"));
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "_tset\"tset_\\\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str56.equals("_tset\"tset_\\\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str58.equals("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context"));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass16 = python2Target12.getClass();
        boolean boolean17 = python2Target12.wantsBaseVisitor();
        java.lang.String str19 = python2Target12.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str21 = python2Target12.getTargetStringLiteralFromString("\\1");
        java.lang.String str22 = python2Target12.getLanguage();
        java.lang.String str24 = python2Target12.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "_tsetContext", false);
        int int29 = python2Target12.getSerializedATNSegmentLimit();
        java.lang.String str31 = python2Target12.getImplicitSetLabel("_#");
        java.lang.String str32 = python2Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str40 = python2Target35.getListLabel("");
        boolean boolean41 = python2Target35.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass42 = python2Target35.getClass();
        java.lang.Class<?> wildcardClass43 = python2Target35.getClass();
        java.lang.String str46 = python2Target35.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str48 = python2Target35.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        java.lang.String str54 = python2Target51.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str55 = python2Target51.getLanguage();
        java.util.Set<java.lang.String> strSet56 = python2Target51.getBadWords();
        boolean boolean57 = python2Target51.templatesExist();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python2Target51.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python2Target35.getTokenTypesAsTargetLabels(grammar49, intArray59);
        java.lang.String[] strArray62 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray59);
        java.lang.String[] strArray63 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray59);
        java.lang.String str65 = python2Target1.getImplicitRuleLabel("__");
        int int66 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\1" + "'", str19.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\\\\1\"" + "'", str21.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python2" + "'", str22.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1Context" + "'", str24.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tsetContex" + "'", str28.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "_tset_#" + "'", str31.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"hi!\"" + "'", str38.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str46.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\\0" + "'", str48.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"hi!\"" + "'", str54.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Python2" + "'", str55.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "___" + "'", str65.equals("___"));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 64 + "'", int66 == 64);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_tset");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset" + "'", str14.equals("__tset"));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str18 = python2Target14.getLanguage();
        java.util.Set<java.lang.String> strSet19 = python2Target14.getBadWords();
        java.lang.String str21 = python2Target14.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean22 = python2Target14.wantsBaseVisitor();
        java.lang.String str25 = python2Target14.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        boolean boolean34 = python2Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar35 = null;
        int[] intArray36 = new int[] {};
        java.lang.String[] strArray37 = python2Target28.getTokenTypesAsTargetLabels(grammar35, intArray36);
        java.lang.String[] strArray38 = python2Target14.getTokenTypesAsTargetLabels(grammar26, intArray36);
        java.lang.String[] strArray39 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray36);
        boolean boolean40 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str10.equals("_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Python2" + "'", str18.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_\"hi!\"Context" + "'", str21.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\\\n" + "'", str25.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\n\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset4.5.2.1ContextContext", false);
        java.lang.String str18 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "tset4.5.2.1ContextContex" + "'", str16.equals("tset4.5.2.1ContextContex"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        java.lang.String str19 = python2Target1.getImplicitSetLabel("");
        boolean boolean20 = python2Target1.wantsBaseVisitor();
        java.lang.String str22 = python2Target1.getImplicitRuleLabel("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset" + "'", str19.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "_" + "'", str22.equals("_"));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("__tset_\"\\\\1\"");
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("\"tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "___tset_\"\\\\1\"" + "'", str10.equals("___tset_\"\\\\1\""));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass18 = python2Target14.getClass();
        boolean boolean19 = python2Target14.wantsBaseVisitor();
        java.lang.String str21 = python2Target14.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str23 = python2Target14.getTargetStringLiteralFromString("\\1");
        java.lang.String str24 = python2Target14.getLanguage();
        boolean boolean25 = python2Target14.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        java.lang.String str35 = python2Target28.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean36 = python2Target28.wantsBaseVisitor();
        java.lang.String str39 = python2Target28.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str46 = python2Target42.getLanguage();
        java.util.Set<java.lang.String> strSet47 = python2Target42.getBadWords();
        boolean boolean48 = python2Target42.templatesExist();
        org.antlr.v4.tool.Grammar grammar49 = null;
        int[] intArray50 = new int[] {};
        java.lang.String[] strArray51 = python2Target42.getTokenTypesAsTargetLabels(grammar49, intArray50);
        java.lang.String[] strArray52 = python2Target28.getTokenTypesAsTargetLabels(grammar40, intArray50);
        java.lang.String[] strArray53 = python2Target14.getTokenTypesAsTargetLabels(grammar26, intArray50);
        java.lang.String[] strArray54 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray50);
        boolean boolean55 = python2Target1.wantsBaseVisitor();
        boolean boolean56 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\1" + "'", str21.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\\1\"" + "'", str23.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Python2" + "'", str24.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "_\"hi!\"Context" + "'", str35.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\\\\n" + "'", str39.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Python2" + "'", str46.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        try {
            java.lang.String str11 = python2Target1.getElementName("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) ' ');
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + " " + "'", str11.equals(" "));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        java.lang.String str13 = python2Target1.getListLabel("TsetContext");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "TsetContext" + "'", str13.equals("TsetContext"));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getVersion();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        boolean boolean18 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet19 = python2Target1.getBadWords();
        boolean boolean20 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str21 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_#" + "'", str20.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup22);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass16 = python2Target12.getClass();
        boolean boolean17 = python2Target12.wantsBaseVisitor();
        java.lang.String str19 = python2Target12.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str21 = python2Target12.getTargetStringLiteralFromString("\\1");
        java.lang.String str22 = python2Target12.getLanguage();
        java.lang.String str24 = python2Target12.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "_tsetContext", false);
        int int29 = python2Target12.getSerializedATNSegmentLimit();
        java.lang.String str31 = python2Target12.getImplicitSetLabel("_#");
        java.lang.String str32 = python2Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str40 = python2Target35.getListLabel("");
        boolean boolean41 = python2Target35.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass42 = python2Target35.getClass();
        java.lang.Class<?> wildcardClass43 = python2Target35.getClass();
        java.lang.String str46 = python2Target35.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str48 = python2Target35.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        java.lang.String str54 = python2Target51.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str55 = python2Target51.getLanguage();
        java.util.Set<java.lang.String> strSet56 = python2Target51.getBadWords();
        boolean boolean57 = python2Target51.templatesExist();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python2Target51.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python2Target35.getTokenTypesAsTargetLabels(grammar49, intArray59);
        java.lang.String[] strArray62 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray59);
        java.lang.String[] strArray63 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray59);
        boolean boolean64 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar66 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target68 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator67);
        java.lang.String str71 = python2Target68.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target68.getListLabel("");
        boolean boolean74 = python2Target68.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass75 = python2Target68.getClass();
        java.lang.Class<?> wildcardClass76 = python2Target68.getClass();
        java.lang.String str79 = python2Target68.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str81 = python2Target68.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar82 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator83 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target84 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator83);
        java.lang.String str87 = python2Target84.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str88 = python2Target84.getLanguage();
        java.util.Set<java.lang.String> strSet89 = python2Target84.getBadWords();
        boolean boolean90 = python2Target84.templatesExist();
        org.antlr.v4.tool.Grammar grammar91 = null;
        int[] intArray92 = new int[] {};
        java.lang.String[] strArray93 = python2Target84.getTokenTypesAsTargetLabels(grammar91, intArray92);
        java.lang.String[] strArray94 = python2Target68.getTokenTypesAsTargetLabels(grammar82, intArray92);
        java.lang.String[] strArray95 = python2Target1.getTokenTypesAsTargetLabels(grammar66, intArray92);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\1" + "'", str19.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\\\\1\"" + "'", str21.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python2" + "'", str22.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1Context" + "'", str24.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tsetContex" + "'", str28.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "_tset_#" + "'", str31.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"hi!\"" + "'", str38.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str46.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\\0" + "'", str48.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\"hi!\"" + "'", str54.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Python2" + "'", str55.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(codeGenerator65);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\"hi!\"" + "'", str71.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str79.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "\\0" + "'", str81.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "\"hi!\"" + "'", str87.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Python2" + "'", str88.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(strArray95);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\1" + "'", str11.equals("\\1"));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass18 = python2Target14.getClass();
        boolean boolean19 = python2Target14.wantsBaseVisitor();
        java.lang.String str21 = python2Target14.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str23 = python2Target14.getTargetStringLiteralFromString("\\1");
        java.lang.String str24 = python2Target14.getLanguage();
        boolean boolean25 = python2Target14.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        java.lang.String str35 = python2Target28.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean36 = python2Target28.wantsBaseVisitor();
        java.lang.String str39 = python2Target28.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str46 = python2Target42.getLanguage();
        java.util.Set<java.lang.String> strSet47 = python2Target42.getBadWords();
        boolean boolean48 = python2Target42.templatesExist();
        org.antlr.v4.tool.Grammar grammar49 = null;
        int[] intArray50 = new int[] {};
        java.lang.String[] strArray51 = python2Target42.getTokenTypesAsTargetLabels(grammar49, intArray50);
        java.lang.String[] strArray52 = python2Target28.getTokenTypesAsTargetLabels(grammar40, intArray50);
        java.lang.String[] strArray53 = python2Target14.getTokenTypesAsTargetLabels(grammar26, intArray50);
        java.lang.String[] strArray54 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray50);
        try {
            java.lang.String str56 = python2Target1.getImplicitTokenLabel("\"\\\"_tset\\\"hi!\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\1" + "'", str21.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\\1\"" + "'", str23.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Python2" + "'", str24.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "_\"hi!\"Context" + "'", str35.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\\\\n" + "'", str39.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Python2" + "'", str46.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\64");
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Rule rule15 = null;
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\64\"" + "'", str12.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "@" + "'", str14.equals("@"));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape(100);
        try {
            java.lang.String str17 = python2Target1.getElementName("tsetContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "d" + "'", str15.equals("d"));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"hi!\\\\\\\"Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"_tset\\\"\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"\\\"\"" + "'", str10.equals("\"_tset\\\"\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"\\\"\""));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"Python2\"Context" + "'", str3.equals("\"Python2\"Context"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        int int14 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass15 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "\"\\\"hi!\\\"\"", false);
        try {
            java.lang.String str21 = python2Target1.getElementName("\"_tset_\\\"\\\\\\\\1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\\"hi!\\\"" + "'", str19.equals("\\\"hi!\\\""));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        int int19 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        try {
            boolean boolean21 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.tool.Rule rule18 = null;
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"Context" + "'", str12.equals("\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str14.equals("\"\\\"hi!\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"\\\\64\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\"\\\\64\"" + "'", str12.equals("_\"\\\\64\""));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        java.lang.String str19 = python2Target1.getVersion();
        try {
            java.lang.String str21 = python2Target1.getElementListName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str15 = python2Target12.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str17 = python2Target12.getListLabel("");
        boolean boolean18 = python2Target12.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass19 = python2Target12.getClass();
        java.lang.Class<?> wildcardClass20 = python2Target12.getClass();
        java.lang.String str23 = python2Target12.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str25 = python2Target12.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        boolean boolean34 = python2Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar35 = null;
        int[] intArray36 = new int[] {};
        java.lang.String[] strArray37 = python2Target28.getTokenTypesAsTargetLabels(grammar35, intArray36);
        java.lang.String[] strArray38 = python2Target12.getTokenTypesAsTargetLabels(grammar26, intArray36);
        java.lang.String[] strArray39 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray36);
        java.lang.String str40 = python2Target1.getVersion();
        boolean boolean41 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str23.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\0" + "'", str25.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getVersion();
        boolean boolean10 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        int int19 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("_tset_\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass28 = python2Target24.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python2Target24.getCodeGenerator();
        java.util.Set<java.lang.String> strSet30 = python2Target24.getBadWords();
        boolean boolean31 = python2Target24.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target24.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass39 = python2Target35.getClass();
        boolean boolean40 = python2Target35.wantsBaseVisitor();
        java.lang.String str42 = python2Target35.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str44 = python2Target35.getTargetStringLiteralFromString("\\1");
        java.lang.String str45 = python2Target35.getLanguage();
        java.lang.String str47 = python2Target35.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "_tsetContext", false);
        int int52 = python2Target35.getSerializedATNSegmentLimit();
        java.lang.String str54 = python2Target35.getImplicitSetLabel("_#");
        java.lang.String str55 = python2Target35.getVersion();
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target58 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator57);
        java.lang.String str61 = python2Target58.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str63 = python2Target58.getListLabel("");
        boolean boolean64 = python2Target58.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass65 = python2Target58.getClass();
        java.lang.Class<?> wildcardClass66 = python2Target58.getClass();
        java.lang.String str69 = python2Target58.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str71 = python2Target58.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar72 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator73 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target74 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator73);
        java.lang.String str77 = python2Target74.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str78 = python2Target74.getLanguage();
        java.util.Set<java.lang.String> strSet79 = python2Target74.getBadWords();
        boolean boolean80 = python2Target74.templatesExist();
        org.antlr.v4.tool.Grammar grammar81 = null;
        int[] intArray82 = new int[] {};
        java.lang.String[] strArray83 = python2Target74.getTokenTypesAsTargetLabels(grammar81, intArray82);
        java.lang.String[] strArray84 = python2Target58.getTokenTypesAsTargetLabels(grammar72, intArray82);
        java.lang.String[] strArray85 = python2Target35.getTokenTypesAsTargetLabels(grammar56, intArray82);
        java.lang.String[] strArray86 = python2Target24.getTokenTypesAsTargetLabels(grammar33, intArray82);
        java.lang.String[] strArray87 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray82);
        java.lang.String str89 = python2Target1.getImplicitRuleLabel("\"Python2\"Context");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "__tset_\"\\\\1\"" + "'", str21.equals("__tset_\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"hi!\"" + "'", str38.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\\1" + "'", str42.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\"\\\\1\"" + "'", str44.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Python2" + "'", str45.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "4.5.2.1Context" + "'", str47.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "tsetContex" + "'", str51.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "_tset_#" + "'", str54.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "4.5.2.1" + "'", str55.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\"hi!\"" + "'", str61.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str69.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\\0" + "'", str71.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "\"hi!\"" + "'", str77.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "Python2" + "'", str78.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "_\"Python2\"Context" + "'", str89.equals("_\"Python2\"Context"));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("_tset\"\\\"hi!\\\"Contex\"");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "__tset\"\\\"hi!\\\"Contex\"" + "'", str12.equals("__tset\"\\\"hi!\\\"Contex\""));
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getListLabel("_tset_tsethi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset_tsethi!" + "'", str10.equals("_tset_tsethi!"));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        int int14 = python2Target1.getInlineTestSetWordSize();
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
        java.lang.String str19 = python2Target1.getImplicitRuleLabel("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_" + "'", str19.equals("_"));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getListLabel("_tset\"\\\\64\"");
        java.lang.String str12 = python2Target1.getLanguage();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\\64\"" + "'", str11.equals("_tset\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetContextContext", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str10.equals("_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tsetContextContext" + "'", str14.equals("_tsetContextContext"));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str10 = python2Target1.getImplicitSetLabel(" ");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("#");
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset " + "'", str10.equals("_tset "));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#Context" + "'", str12.equals("#Context"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("_\"hi!\"Context");
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"hi!\\\"Contex\"", false);
        java.lang.String str16 = python2Target1.getListLabel("d");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"hi!\"Context" + "'", str11.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"" + "'", str14.equals("_tset\\\"\\\\\\\"hi!\\\\\\\"Contex\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d" + "'", str16.equals("d"));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\"_tset\\\"hi!\\\"Context\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        boolean boolean14 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass15 = python2Target1.getClass();
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("_");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "__" + "'", str17.equals("__"));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str21 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.lang.String str43 = python2Target40.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str44 = python2Target40.getLanguage();
        java.util.Set<java.lang.String> strSet45 = python2Target40.getBadWords();
        boolean boolean46 = python2Target40.templatesExist();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python2Target24.getTokenTypesAsTargetLabels(grammar38, intArray48);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray48);
        boolean boolean52 = python2Target1.supportsOverloadedMethods();
        java.lang.String str54 = python2Target1.getImplicitRuleLabel("\"\\\"_tset4.5.2.1ContextContext\\\"Context\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset_#" + "'", str20.equals("_tset_#"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"hi!\"" + "'", str43.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Python2" + "'", str44.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "_\"\\\"_tset4.5.2.1ContextContext\\\"Context\"" + "'", str54.equals("_\"\\\"_tset4.5.2.1ContextContext\\\"Context\""));
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("tsetContex");
        java.lang.String str6 = python2Target1.getImplicitSetLabel("_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tsettsetContex" + "'", str4.equals("_tsettsetContex"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset_" + "'", str6.equals("_tset_"));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsetContext", false);
        java.lang.String str19 = python2Target1.getListLabel("_\"\\\"#\\\"\"");
        java.lang.String str21 = python2Target1.getImplicitSetLabel("\"Python2\"Context");
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_\"\\\"#\\\"\"" + "'", str19.equals("_\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tset\"Python2\"Context" + "'", str21.equals("_tset\"Python2\"Context"));
        org.junit.Assert.assertNotNull(sTGroup22);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str14 = python2Target11.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass15 = python2Target11.getClass();
        boolean boolean16 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet21 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str29 = python2Target24.getListLabel("");
        boolean boolean30 = python2Target24.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass31 = python2Target24.getClass();
        java.lang.Class<?> wildcardClass32 = python2Target24.getClass();
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str37 = python2Target24.encodeIntAsCharEscape(0);
        java.lang.String str39 = python2Target24.getImplicitRuleLabel("_");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str45 = python2Target42.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str47 = python2Target42.getListLabel("");
        boolean boolean48 = python2Target42.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass49 = python2Target42.getClass();
        int int50 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.lang.String str56 = python2Target53.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str58 = python2Target53.getListLabel("");
        boolean boolean59 = python2Target53.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass60 = python2Target53.getClass();
        java.lang.Class<?> wildcardClass61 = python2Target53.getClass();
        java.lang.String str64 = python2Target53.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str66 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String str72 = python2Target69.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str73 = python2Target69.getLanguage();
        java.util.Set<java.lang.String> strSet74 = python2Target69.getBadWords();
        boolean boolean75 = python2Target69.templatesExist();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target53.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python2Target42.getTokenTypesAsTargetLabels(grammar51, intArray77);
        java.lang.String[] strArray81 = python2Target24.getTokenTypesAsTargetLabels(grammar40, intArray77);
        java.lang.String[] strArray82 = python2Target11.getTokenTypesAsTargetLabels(grammar22, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray77);
        java.lang.String str85 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean86 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"hi!\"" + "'", str14.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\1" + "'", str18.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\\1\"" + "'", str20.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"hi!\"" + "'", str27.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str35.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "__" + "'", str39.equals("__"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"hi!\"" + "'", str45.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\"hi!\"" + "'", str56.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str64.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\\0" + "'", str66.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"hi!\"" + "'", str72.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Python2" + "'", str73.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "\\n" + "'", str85.equals("\\n"));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        try {
            java.lang.String str16 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\n" + "'", str14.equals("\\n"));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String str20 = python2Target17.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str21 = python2Target17.getLanguage();
        java.util.Set<java.lang.String> strSet22 = python2Target17.getBadWords();
        boolean boolean23 = python2Target17.templatesExist();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python2Target17.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String str29 = python2Target1.getTargetStringLiteralFromString("\"hi!\\\"Contex\"");
        java.lang.String str31 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"hi!\"" + "'", str20.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Python2" + "'", str21.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\\"hi!\\\\\\\"Contex\\\"\"" + "'", str29.equals("\"\\\"hi!\\\\\\\"Contex\\\"\""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str31.equals("\"_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getListLabel("_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset" + "'", str10.equals("_tset"));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getVersion();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset\"hi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.lang.String str15 = python2Target1.getListLabel("\"_tset#\"");
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset#\"" + "'", str15.equals("\"_tset#\""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_");
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        java.lang.String str19 = python2Target1.getImplicitSetLabel("_tset");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "__" + "'", str16.equals("__"));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset_tset" + "'", str19.equals("_tset_tset"));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset\"4.5.2.1\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "\"\\\"_tset#\\\"\"", false);
        boolean boolean20 = python2Target1.templatesExist();
        java.lang.String str22 = python2Target1.getAltLabelContextStructName("Python2");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\\"_tset#\\\"" + "'", str19.equals("\\\"_tset#\\\""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python2Context" + "'", str22.equals("Python2Context"));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str17 = python2Target14.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str18 = python2Target14.getLanguage();
        java.util.Set<java.lang.String> strSet19 = python2Target14.getBadWords();
        java.lang.String str21 = python2Target14.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean22 = python2Target14.wantsBaseVisitor();
        java.lang.String str25 = python2Target14.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str31 = python2Target28.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str32 = python2Target28.getLanguage();
        java.util.Set<java.lang.String> strSet33 = python2Target28.getBadWords();
        boolean boolean34 = python2Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar35 = null;
        int[] intArray36 = new int[] {};
        java.lang.String[] strArray37 = python2Target28.getTokenTypesAsTargetLabels(grammar35, intArray36);
        java.lang.String[] strArray38 = python2Target14.getTokenTypesAsTargetLabels(grammar26, intArray36);
        java.lang.String[] strArray39 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray36);
        java.lang.String str41 = python2Target1.getTargetStringLiteralFromString("__tset\"\\\"hi!\\\"Contex\"");
        java.lang.String str42 = python2Target1.getLanguage();
        try {
            java.lang.String str44 = python2Target1.getElementName("_\\\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str10.equals("_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Python2" + "'", str18.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_\"hi!\"Context" + "'", str21.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\\\n" + "'", str25.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"hi!\"" + "'", str31.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Python2" + "'", str32.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\"__tset\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"\"" + "'", str41.equals("\"__tset\\\"\\\\\\\"hi!\\\\\\\"Contex\\\"\""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Python2" + "'", str42.equals("Python2"));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
    }
}

