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
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\n" + "'", str10.equals("\\n"));
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str12 = python3Target11.getVersion();
        java.lang.Class<?> wildcardClass13 = python3Target11.getClass();
        org.antlr.v4.tool.Grammar grammar14 = null;
        int[] intArray15 = new int[] {};
        java.lang.String[] strArray16 = python3Target11.getTokenTypesAsTargetLabels(grammar14, intArray15);
        java.lang.String[] strArray17 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray15);
        java.lang.String str18 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "4.5.2.1" + "'", str18.equals("4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getLanguage();
        try {
            java.lang.String str10 = python3Target1.getElementListName("\"0Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Python3" + "'", str8.equals("Python3"));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("@");
        boolean boolean12 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_tset_\"\\\\\\\"\\\\\\\"\"");
        boolean boolean15 = python3Target1.wantsBaseListener();
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_\"\\\\\\\"\\\\\\\"\"Context" + "'", str14.equals("_tset_\"\\\\\\\"\\\\\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "__tset4.5.2.1Context" + "'", str17.equals("__tset4.5.2.1Context"));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\\64");
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\64Context" + "'", str7.equals("\\64Context"));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\n" + "'", str10.equals("\\n"));
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = new int[] {};
        java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str15.equals("\\\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\\\\\\\\\\\\\"\\\\\\\"\\\""));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_\\35");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "@", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "__\\35" + "'", str12.equals("__\\35"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        java.lang.String str14 = python3Target12.getListLabel("");
        java.lang.String str16 = python3Target12.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "4.5.2.1", false);
        boolean boolean21 = python3Target12.wantsBaseListener();
        boolean boolean22 = python3Target12.supportsOverloadedMethods();
        boolean boolean23 = python3Target12.templatesExist();
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getListLabel("");
        java.lang.String str30 = python3Target26.getImplicitSetLabel("4.5.2.1");
        java.lang.String str31 = python3Target26.getVersion();
        java.lang.String str33 = python3Target26.getTargetStringLiteralFromString("\\64");
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getListLabel("");
        java.lang.String str40 = python3Target36.encodeIntAsCharEscape(0);
        java.lang.String str42 = python3Target36.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass43 = python3Target36.getClass();
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str47 = python3Target46.getVersion();
        java.lang.Class<?> wildcardClass48 = python3Target46.getClass();
        org.antlr.v4.tool.Grammar grammar49 = null;
        int[] intArray50 = new int[] {};
        java.lang.String[] strArray51 = python3Target46.getTokenTypesAsTargetLabels(grammar49, intArray50);
        java.lang.String[] strArray52 = python3Target36.getTokenTypesAsTargetLabels(grammar44, intArray50);
        java.lang.String[] strArray53 = python3Target26.getTokenTypesAsTargetLabels(grammar34, intArray50);
        java.lang.String[] strArray54 = python3Target12.getTokenTypesAsTargetLabels(grammar24, intArray50);
        java.lang.String[] strArray55 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray50);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\\1\"" + "'", str9.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\0" + "'", str16.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ".5.2." + "'", str20.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "_tset4.5.2.1" + "'", str30.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "4.5.2.1" + "'", str31.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\\\\64\"" + "'", str33.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\\0" + "'", str40.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\"Python3\"" + "'", str42.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "4.5.2.1" + "'", str47.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_hi!", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_hi!\"" + "'", str8.equals("\"_hi!\""));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        int int7 = python3Target1.getInlineTestSetWordSize();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"_tset4.5.2.1Contex\"" + "'", str10.equals("\"_tset4.5.2.1Contex\""));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.Class<?> wildcardClass18 = python3Target17.getClass();
        boolean boolean19 = python3Target17.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "\"tset4.5.2.\"", true);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getListLabel("");
        java.lang.String str30 = python3Target26.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target26.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python3Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "_tset4.5.2.1", false);
        boolean boolean36 = python3Target26.templatesExist();
        java.lang.String str38 = python3Target26.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str40 = python3Target26.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str44 = python3Target43.getVersion();
        java.lang.Class<?> wildcardClass45 = python3Target43.getClass();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python3Target43.getTokenTypesAsTargetLabels(grammar46, intArray47);
        java.lang.String[] strArray49 = python3Target26.getTokenTypesAsTargetLabels(grammar41, intArray47);
        java.lang.String[] strArray50 = python3Target17.getTokenTypesAsTargetLabels(grammar24, intArray47);
        java.lang.String[] strArray51 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray47);
        int int52 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"tset4.5.2.\"" + "'", str23.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\\0" + "'", str30.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "tset4.5.2." + "'", str35.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"4.5.2.1Context\"" + "'", str38.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "_tset@" + "'", str40.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "4.5.2.1" + "'", str44.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("__tset\\64ContextContext");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Python3" + "'", str7.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset__tset\\64ContextContext" + "'", str9.equals("_tset__tset\\64ContextContext"));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        java.lang.Class<?> wildcardClass20 = python3Target18.getClass();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray22);
        java.lang.String str27 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context", false);
        boolean boolean28 = python3Target1.supportsOverloadedMethods();
        int int29 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str30 = python3Target1.getVersion();
        int int31 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context" + "'", str27.equals("\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "4.5.2.1" + "'", str30.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 29 + "'", int31 == 29);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        java.lang.Class<?> wildcardClass20 = python3Target18.getClass();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray22);
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean27 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule28 = null;
        try {
            java.lang.String str29 = python3Target1.getRuleFunctionContextStructName(rule28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str26.equals("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\"tset4.5.2.\\\"Context\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str15.equals("\"\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"\\\\35\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\\35\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\\35\\\"\""));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        java.lang.String str8 = python3Target7.getVersion();
        boolean boolean9 = python3Target7.wantsBaseListener();
        java.util.Set<java.lang.String> strSet10 = python3Target7.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_tset", false);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.getListLabel("");
        java.lang.String str21 = python3Target17.encodeIntAsCharEscape(0);
        java.lang.String str23 = python3Target17.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass24 = python3Target17.getClass();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str28 = python3Target27.getVersion();
        java.lang.Class<?> wildcardClass29 = python3Target27.getClass();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target27.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target17.getTokenTypesAsTargetLabels(grammar25, intArray31);
        java.lang.String[] strArray34 = python3Target7.getTokenTypesAsTargetLabels(grammar15, intArray31);
        java.lang.String[] strArray35 = python3Target1.getTokenTypesAsTargetLabels(grammar5, intArray31);
        java.lang.Class<?> wildcardClass36 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST37 = null;
        try {
            java.lang.String str38 = python3Target1.getLoopCounter(grammarAST37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "tse" + "'", str14.equals("tse"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\0" + "'", str21.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"Python3\"" + "'", str23.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4.5.2.1" + "'", str28.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("\"tset4.5.2.\"Context");
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("__tset\\64Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tset\"tset4.5.2.\"Context" + "'", str12.equals("_tset\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "___tset\\64Context" + "'", str15.equals("___tset\\64Context"));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "Hi!Context", false);
        try {
            java.lang.String str20 = python3Target1.getElementListName("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\\35\"");
        org.antlr.v4.tool.Rule rule12 = null;
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\\35\"Context" + "'", str11.equals("\"\\\\35\"Context"));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator13);
        java.lang.String str15 = python3Target14.getVersion();
        boolean boolean16 = python3Target14.wantsBaseListener();
        java.lang.String str17 = python3Target14.getLanguage();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator19);
        java.lang.String str22 = python3Target20.getListLabel("");
        java.lang.String str24 = python3Target20.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target20.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target20.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "_tset4.5.2.1", false);
        boolean boolean30 = python3Target20.templatesExist();
        java.lang.String str32 = python3Target20.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str34 = python3Target20.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator36);
        java.lang.String str38 = python3Target37.getVersion();
        java.lang.Class<?> wildcardClass39 = python3Target37.getClass();
        org.antlr.v4.tool.Grammar grammar40 = null;
        int[] intArray41 = new int[] {};
        java.lang.String[] strArray42 = python3Target37.getTokenTypesAsTargetLabels(grammar40, intArray41);
        java.lang.String[] strArray43 = python3Target20.getTokenTypesAsTargetLabels(grammar35, intArray41);
        java.lang.String[] strArray44 = python3Target14.getTokenTypesAsTargetLabels(grammar18, intArray41);
        java.lang.String[] strArray45 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray41);
        java.lang.Class<?> wildcardClass46 = strArray45.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\".5.2.\"" + "'", str11.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4.5.2.1" + "'", str15.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Python3" + "'", str17.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\\0" + "'", str24.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "tset4.5.2." + "'", str29.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"4.5.2.1Context\"" + "'", str32.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "_tset@" + "'", str34.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "4.5.2.1" + "'", str38.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.getImplicitSetLabel("\"\"");
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset\"\"" + "'", str5.equals("_tset\"\""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "__tset4.5.2.1Context" + "'", str7.equals("__tset4.5.2.1Context"));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getListLabel("\"\\\\35\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            boolean boolean13 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\\35\"Context" + "'", str11.equals("\"\\\\35\"Context"));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getListLabel("\"\"");
        org.antlr.v4.tool.Rule rule12 = null;
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"" + "'", str11.equals("\"\""));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        java.lang.String str18 = python3Target1.getListLabel("@");
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "@" + "'", str18.equals("@"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\\1" + "'", str20.equals("\\1"));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\\\\1");
        boolean boolean15 = python3Target1.templatesExist();
        java.lang.String str16 = python3Target1.getVersion();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\\1\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14.equals("_tset\\\\1"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\\\"_tset\\\\\\\\1\\\"\"" + "'", str18.equals("\"\\\"_tset\\\\\\\\1\\\"\""));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        boolean boolean11 = python3Target1.wantsBaseListener();
        java.lang.String str13 = python3Target1.getListLabel("\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str13.equals("\"\\\"4.5.2.1\\\"\""));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\\64\"", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\\\64" + "'", str16.equals("\\\\64"));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        int int7 = python3Target1.getInlineTestSetWordSize();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\\"4.5.2.1\\\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str12.equals("\"\\\"4.5.2.1\\\"\""));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\"");
        java.lang.String str11 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            boolean boolean13 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\"" + "'", str10.equals("_\"\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "___tset4.5.2.1", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "__tset4.5.2." + "'", str9.equals("__tset4.5.2."));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        java.lang.String str16 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target1.getCodeGenerator();
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("\\\"_tset\\\\\\\\1\\\"");
        boolean boolean20 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\\"_tset\\\\\\\\1\\\"Context" + "'", str19.equals("\\\"_tset\\\\\\\\1\\\"Context"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        java.lang.String str14 = python3Target12.getListLabel("");
        java.lang.String str16 = python3Target12.encodeIntAsCharEscape(0);
        java.lang.String str19 = python3Target12.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str21 = python3Target12.getTargetStringLiteralFromString("");
        boolean boolean22 = python3Target12.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        java.lang.String str27 = python3Target25.getListLabel("");
        java.lang.String str29 = python3Target25.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python3Target25.getCodeGenerator();
        java.lang.String str32 = python3Target25.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        java.lang.String str36 = python3Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator33, "_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        java.lang.String str40 = python3Target39.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        java.lang.String str44 = python3Target39.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator41, "_tset4.5.2.1", false);
        int int45 = python3Target39.getSerializedATNSegmentLimit();
        boolean boolean46 = python3Target39.supportsOverloadedMethods();
        boolean boolean47 = python3Target39.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass48 = python3Target39.getClass();
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target51 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator50);
        java.lang.String str52 = python3Target51.getVersion();
        boolean boolean53 = python3Target51.wantsBaseListener();
        boolean boolean54 = python3Target51.templatesExist();
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target57 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator56);
        java.lang.String str58 = python3Target57.getVersion();
        boolean boolean59 = python3Target57.wantsBaseListener();
        java.util.Set<java.lang.String> strSet60 = python3Target57.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        java.lang.String str64 = python3Target57.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator61, "_tset", false);
        org.antlr.v4.tool.Grammar grammar65 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator66 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target67 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator66);
        java.lang.String str69 = python3Target67.getListLabel("");
        java.lang.String str71 = python3Target67.encodeIntAsCharEscape(0);
        java.lang.String str73 = python3Target67.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass74 = python3Target67.getClass();
        org.antlr.v4.tool.Grammar grammar75 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator76 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target77 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator76);
        java.lang.String str78 = python3Target77.getVersion();
        java.lang.Class<?> wildcardClass79 = python3Target77.getClass();
        org.antlr.v4.tool.Grammar grammar80 = null;
        int[] intArray81 = new int[] {};
        java.lang.String[] strArray82 = python3Target77.getTokenTypesAsTargetLabels(grammar80, intArray81);
        java.lang.String[] strArray83 = python3Target67.getTokenTypesAsTargetLabels(grammar75, intArray81);
        java.lang.String[] strArray84 = python3Target57.getTokenTypesAsTargetLabels(grammar65, intArray81);
        java.lang.String[] strArray85 = python3Target51.getTokenTypesAsTargetLabels(grammar55, intArray81);
        java.lang.String[] strArray86 = python3Target39.getTokenTypesAsTargetLabels(grammar49, intArray81);
        java.lang.String[] strArray87 = python3Target25.getTokenTypesAsTargetLabels(grammar37, intArray81);
        java.lang.String[] strArray88 = python3Target12.getTokenTypesAsTargetLabels(grammar23, intArray81);
        java.lang.String[] strArray89 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\0" + "'", str16.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"4.5.2.1\"" + "'", str19.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\"" + "'", str21.equals("\"\""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\\0" + "'", str29.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1Context" + "'", str32.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "tset4.5.2." + "'", str36.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "tset4.5.2." + "'", str44.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 29 + "'", int45 == 29);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "4.5.2.1" + "'", str52.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "4.5.2.1" + "'", str58.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "tse" + "'", str64.equals("tse"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\\0" + "'", str71.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "\"Python3\"" + "'", str73.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "4.5.2.1" + "'", str78.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("@");
        boolean boolean12 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_tset_\"\\\\\\\"\\\\\\\"\"");
        boolean boolean15 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_\"\\\\\\\"\\\\\\\"\"Context" + "'", str14.equals("_tset_\"\\\\\\\"\\\\\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.", false);
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset4.5.2." + "'", str11.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.getImplicitSetLabel("\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset\"\"" + "'", str5.equals("_tset\"\""));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.wantsBaseListener();
        int int18 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        boolean boolean13 = python3Target1.wantsBaseListener();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("\\\"_tset\\\\\\\\1\\\"");
        boolean boolean16 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset\\\"_tset\\\\\\\\1\\\"" + "'", str15.equals("_tset\\\"_tset\\\\\\\\1\\\""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str15 = python3Target1.getImplicitSetLabel("\"\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset\"\"" + "'", str15.equals("_tset\"\""));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.templatesExist();
        java.lang.String str5 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str14 = python3Target13.getVersion();
        boolean boolean15 = python3Target13.wantsBaseListener();
        boolean boolean16 = python3Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator18);
        java.lang.String str20 = python3Target19.getVersion();
        boolean boolean21 = python3Target19.wantsBaseListener();
        java.util.Set<java.lang.String> strSet22 = python3Target19.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tset", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.getListLabel("");
        java.lang.String str33 = python3Target29.encodeIntAsCharEscape(0);
        java.lang.String str35 = python3Target29.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass36 = python3Target29.getClass();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        java.lang.String str40 = python3Target39.getVersion();
        java.lang.Class<?> wildcardClass41 = python3Target39.getClass();
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python3Target29.getTokenTypesAsTargetLabels(grammar37, intArray43);
        java.lang.String[] strArray46 = python3Target19.getTokenTypesAsTargetLabels(grammar27, intArray43);
        java.lang.String[] strArray47 = python3Target13.getTokenTypesAsTargetLabels(grammar17, intArray43);
        java.lang.String[] strArray48 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray43);
        java.lang.String str50 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction51 = null;
        try {
            java.lang.String str52 = python3Target1.getRuleFunctionContextStructName(ruleFunction51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "tse" + "'", str26.equals("tse"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"Python3\"" + "'", str35.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str50.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("4.5.2.1Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1ContextContext" + "'", str6.equals("4.5.2.1ContextContext"));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("__tset4.5.2.1ContextContext");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"__tset4.5.2.1ContextContext\"" + "'", str9.equals("\"__tset4.5.2.1ContextContext\""));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getListLabel("4.5.2.1Context");
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\"tset4.5.2.\\\"Context\"" + "'", str10.equals("\"\\\"tset4.5.2.\\\"Context\""));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\"\\\\35\"Context", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\\\"\\\\\\\\35\\\"Context\"" + "'", str18.equals("\"\\\"\\\\\\\\35\\\"Context\""));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\\\\\"\\\\\\\"\"");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_\"\\\\\\\"\\\\\\\"\"" + "'", str13.equals("_\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName(".5.2.1Contex");
        try {
            java.lang.String str11 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2.1ContexContext" + "'", str9.equals(".5.2.1ContexContext"));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getListLabel("\"tset4.5.2.\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"tset4.5.2.\"Context" + "'", str5.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("4.5.2.1Context");
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_\\35", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1ContextContext" + "'", str6.equals("4.5.2.1ContextContext"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\\\\35" + "'", str10.equals("_\\\\35"));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\".5.2.1Contex\"");
        boolean boolean16 = python3Target1.wantsBaseListener();
        java.lang.String str18 = python3Target1.getListLabel("\"_tset4.5.2.1Contex\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\".5.2.1Contex\\\"\"" + "'", str15.equals("\"\\\".5.2.1Contex\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"_tset4.5.2.1Contex\"" + "'", str18.equals("\"_tset4.5.2.1Contex\""));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar17 = null;
        try {
            java.lang.String str19 = python3Target1.getTokenTypeAsTargetLabel(grammar17, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str15 = python3Target1.getImplicitSetLabel("");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"\\\"\\\\\\\\64\\\"\"", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset" + "'", str15.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\\\"\\\\\\\\64\\\"" + "'", str20.equals("\\\"\\\\\\\\64\\\""));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\\\"\\\"");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset4.5.2.");
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\\\\\\\"\\\\\\\"\"" + "'", str7.equals("\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset4.5.2." + "'", str9.equals("_tset_tset4.5.2."));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d" + "'", str12.equals("d"));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\0" + "'", str16.equals("\\0"));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass4 = sTGroup3.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context", true);
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\\\"tset4.5.2.\\\"Context\"" + "'", str6.equals("\"\\\"tset4.5.2.\\\"Context\""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        try {
            java.lang.String str11 = python3Target1.getElementListName("\\\"tset4.5.2.\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str9.equals("\\\"4.5.2.1\\\""));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getListLabel("\\64");
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\\35");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\0Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\64" + "'", str5.equals("\\64"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\35Context" + "'", str7.equals("\\35Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\\0Context\"" + "'", str9.equals("\"\\\\0Context\""));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\".5.2.1Contex\"");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\".5.2.1Contex\\\"\"" + "'", str15.equals("\"\\\".5.2.1Contex\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str13.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"\\\"set4.5.2\\\"\"");
        boolean boolean7 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "__\"\\\"set4.5.2\\\"\"" + "'", str6.equals("__\"\\\"set4.5.2\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str15 = python3Target1.getImplicitSetLabel("");
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean17 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset" + "'", str15.equals("_tset"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        boolean boolean13 = python3Target1.wantsBaseListener();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("\\\"_tset\\\\\\\\1\\\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        try {
            java.lang.String str17 = python3Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset\\\"_tset\\\\\\\\1\\\"" + "'", str15.equals("_tset\\\"_tset\\\\\\\\1\\\""));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"4.5.2.1Context\"", false);
        try {
            java.lang.String str10 = python3Target1.getElementName("\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.getImplicitSetLabel("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset\"\"" + "'", str5.equals("_tset\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass5 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            boolean boolean5 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("", false);
        int int11 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\\64");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getListLabel("");
        java.lang.String str15 = python3Target11.encodeIntAsCharEscape(0);
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass18 = python3Target11.getClass();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        java.lang.String str22 = python3Target21.getVersion();
        java.lang.Class<?> wildcardClass23 = python3Target21.getClass();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target21.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target11.getTokenTypesAsTargetLabels(grammar19, intArray25);
        java.lang.String[] strArray28 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray25);
        java.lang.String str30 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\\\\\\n\"");
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\64\"" + "'", str8.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\0" + "'", str15.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"Python3\"" + "'", str17.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "4.5.2.1" + "'", str22.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\"\\\"_tset\\\\\\\\\\\\\\\\n\\\"\"" + "'", str30.equals("\"\\\"_tset\\\\\\\\\\\\\\\\n\\\"\""));
        org.junit.Assert.assertNotNull(sTGroup31);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\\35\"");
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\\35\"Context" + "'", str11.equals("\"\\\\35\"Context"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_tset_tset4.5.2." + "'", str14.equals("_tset_tset_tset4.5.2."));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\\0Context", true);
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("\".5.2.\\\"Contex\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".5.2." + "'", str12.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"0Contex\"" + "'", str16.equals("\"0Contex\""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\".5.2.\\\"Contex\"Context" + "'", str18.equals("\".5.2.\\\"Contex\"Context"));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("d");
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d" + "'", str7.equals("d"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "DContext" + "'", str9.equals("DContext"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0" + "'", str8.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"4.5.2.1Context\"", false);
        java.lang.String str10 = python3Target1.getListLabel("_tset_tset4.5.2.Context");
        try {
            java.lang.String str12 = python3Target1.getElementName("_tset_\"\\\\\\\"\\\\\\\"\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset_tset4.5.2.Context" + "'", str10.equals("_tset_tset4.5.2.Context"));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getListLabel("\\1");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\1" + "'", str12.equals("\\1"));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str16 = python3Target15.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tset4.5.2.1", false);
        int int21 = python3Target15.getSerializedATNSegmentLimit();
        boolean boolean22 = python3Target15.supportsOverloadedMethods();
        boolean boolean23 = python3Target15.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass24 = python3Target15.getClass();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str28 = python3Target27.getVersion();
        boolean boolean29 = python3Target27.wantsBaseListener();
        boolean boolean30 = python3Target27.templatesExist();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        java.lang.String str34 = python3Target33.getVersion();
        boolean boolean35 = python3Target33.wantsBaseListener();
        java.util.Set<java.lang.String> strSet36 = python3Target33.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        java.lang.String str40 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator37, "_tset", false);
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str45 = python3Target43.getListLabel("");
        java.lang.String str47 = python3Target43.encodeIntAsCharEscape(0);
        java.lang.String str49 = python3Target43.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass50 = python3Target43.getClass();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        java.lang.String str54 = python3Target53.getVersion();
        java.lang.Class<?> wildcardClass55 = python3Target53.getClass();
        org.antlr.v4.tool.Grammar grammar56 = null;
        int[] intArray57 = new int[] {};
        java.lang.String[] strArray58 = python3Target53.getTokenTypesAsTargetLabels(grammar56, intArray57);
        java.lang.String[] strArray59 = python3Target43.getTokenTypesAsTargetLabels(grammar51, intArray57);
        java.lang.String[] strArray60 = python3Target33.getTokenTypesAsTargetLabels(grammar41, intArray57);
        java.lang.String[] strArray61 = python3Target27.getTokenTypesAsTargetLabels(grammar31, intArray57);
        java.lang.String[] strArray62 = python3Target15.getTokenTypesAsTargetLabels(grammar25, intArray57);
        java.lang.String[] strArray63 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray57);
        int int64 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean65 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "tset4.5.2." + "'", str20.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4.5.2.1" + "'", str28.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "4.5.2.1" + "'", str34.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "tse" + "'", str40.equals("tse"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\\0" + "'", str47.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "\"Python3\"" + "'", str49.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "4.5.2.1" + "'", str54.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 29 + "'", int64 == 29);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"tset4.5.2.\"" + "'", str13.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.getImplicitSetLabel("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset\"\"" + "'", str5.equals("_tset\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"hi!\"Context" + "'", str11.equals("_\"hi!\"Context"));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"tset4.5.2.\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"Python3\"" + "'", str10.equals("_\"Python3\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.templatesExist();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("_tseta");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("\"\\\"set4.5.2\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        try {
            boolean boolean20 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_\"\\\"set4.5.2\\\"\"" + "'", str18.equals("_\"\\\"set4.5.2\\\"\""));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        try {
            java.lang.String str10 = python3Target1.getElementListName("\"__tset\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("@");
        boolean boolean12 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_tset_\"\\\\\\\"\\\\\\\"\"");
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_\"\\\\\\\"\\\\\\\"\"Context" + "'", str14.equals("_tset_\"\\\\\\\"\\\\\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getListLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\64" + "'", str13.equals("\\64"));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"_tset_tset4.5.2.\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\"\\\\35\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"_tset_tset4.5.2.\"" + "'", str14.equals("\"_tset_tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\\\35\\\"Contex" + "'", str18.equals("\\\\35\\\"Contex"));
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        boolean boolean12 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\\64");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\64Context" + "'", str7.equals("\\64Context"));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("tse");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tse" + "'", str8.equals("_tse"));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray14 = new int[] {};
        java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray14);
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\\35", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str12.equals("\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\\\\35\"" + "'", str18.equals("\"\\\\35\""));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        boolean boolean9 = python3Target1.templatesExist();
        try {
            java.lang.String str11 = python3Target1.getElementName("_tset_tset@Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.getListLabel("_tset4.5.2.1");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\"tset4.5.2.\\\"Context\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str9.equals("\"\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        java.lang.Class<?> wildcardClass20 = python3Target18.getClass();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray22);
        boolean boolean25 = python3Target1.templatesExist();
        org.antlr.v4.tool.Rule rule26 = null;
        try {
            java.lang.String str27 = python3Target1.getRuleFunctionContextStructName(rule26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("__tset\\64ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str9.equals("_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule5 = null;
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d" + "'", str7.equals("d"));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("_tset_tset4.5.2.");
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset_tset4.5.2.Context" + "'", str6.equals("_tset_tset4.5.2.Context"));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str6 = python3Target1.getElementListName("\"\\\"4.5.2.1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.getListLabel("_tset4.5.2.1");
        try {
            java.lang.String str7 = python3Target1.getElementListName("\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        java.lang.Class<?> wildcardClass20 = python3Target18.getClass();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray22);
        java.lang.String str27 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context", false);
        boolean boolean28 = python3Target1.supportsOverloadedMethods();
        int int29 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str31 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context" + "'", str27.equals("\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"\"" + "'", str31.equals("\"\""));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        try {
            java.lang.String str12 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.Class<?> wildcardClass18 = python3Target17.getClass();
        boolean boolean19 = python3Target17.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "\"tset4.5.2.\"", true);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getListLabel("");
        java.lang.String str30 = python3Target26.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target26.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python3Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "_tset4.5.2.1", false);
        boolean boolean36 = python3Target26.templatesExist();
        java.lang.String str38 = python3Target26.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str40 = python3Target26.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str44 = python3Target43.getVersion();
        java.lang.Class<?> wildcardClass45 = python3Target43.getClass();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python3Target43.getTokenTypesAsTargetLabels(grammar46, intArray47);
        java.lang.String[] strArray49 = python3Target26.getTokenTypesAsTargetLabels(grammar41, intArray47);
        java.lang.String[] strArray50 = python3Target17.getTokenTypesAsTargetLabels(grammar24, intArray47);
        java.lang.String[] strArray51 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray47);
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target1.getTemplates();
        java.lang.String str54 = python3Target1.getImplicitSetLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"tset4.5.2.\"" + "'", str23.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\\0" + "'", str30.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "tset4.5.2." + "'", str35.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"4.5.2.1Context\"" + "'", str38.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "_tset@" + "'", str40.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "4.5.2.1" + "'", str44.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str54.equals("_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\1" + "'", str5.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\35" + "'", str7.equals("\\35"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\".5.2.\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\".5.2.\"Context" + "'", str8.equals("\".5.2.\"Context"));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\".5.2.\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\".5.2.\\\\\\\"Contex\\\"\"" + "'", str12.equals("\"\\\".5.2.\\\\\\\"Contex\\\"\""));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        try {
            java.lang.String str12 = python3Target1.getElementListName("_\"4.5.2.1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\35" + "'", str9.equals("\\35"));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.wantsBaseListener();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("__tset@");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"\\\\\\\\64\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"__tset@\"" + "'", str8.equals("\"__tset@\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\\\\"\\\\\\\\\\\\\\\\64\\\\\\\"\"" + "'", str10.equals("\"\\\\\\\"\\\\\\\\\\\\\\\\64\\\\\\\"\""));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str9 = python3Target1.getLanguage();
        try {
            java.lang.String str11 = python3Target1.getElementName("\"@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\"");
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.String str14 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\"" + "'", str10.equals("_\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\1" + "'", str12.equals("\\1"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\1" + "'", str5.equals("\\1"));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\"4.5.2.1Context\"");
        boolean boolean15 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\"4.5.2.1Context\"" + "'", str14.equals("_\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python3Target1.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString(".5.2.1ContexContext");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str15 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.1ContexContext\"" + "'", str13.equals("\".5.2.1ContexContext\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4.5.2.1" + "'", str15.equals("4.5.2.1"));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean4 = python3Target1.templatesExist();
        boolean boolean5 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        int int7 = python3Target1.getInlineTestSetWordSize();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "__tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str10.equals("__tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        try {
            java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context", false);
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", false);
        java.lang.String str16 = python3Target1.getImplicitSetLabel("i!Contex");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\"tset4.5.2.\\\"Context" + "'", str11.equals("\\\"tset4.5.2.\\\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"" + "'", str14.equals("\\\"\\\\\\\"hi!\\\\\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tseti!Contex" + "'", str16.equals("_tseti!Contex"));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python3Target1.getListLabel(".5.2.");
        int int11 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ".5.2." + "'", str10.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\\\\1");
        org.antlr.v4.tool.Grammar grammar15 = null;
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14.equals("_tset\\\\1"));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = null;
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\\35\"");
        boolean boolean12 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\\\"4.5.2.1\\\"");
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\\35\"Context" + "'", str11.equals("\"\\\\35\"Context"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\\\"4.5.2.1\\\"" + "'", str14.equals("_\\\"4.5.2.1\\\""));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName(".5.2.1Contex");
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2.1ContexContext" + "'", str9.equals(".5.2.1ContexContext"));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        int int7 = python3Target1.getInlineTestSetWordSize();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "__tset4.5.2.1Context" + "'", str10.equals("__tset4.5.2.1Context"));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\\1\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\"_tset\\\\\\\\1\\\"" + "'", str13.equals("\\\"_tset\\\\\\\\1\\\""));
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str9 = python3Target1.getElementListName("\"d\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        java.lang.String str9 = python3Target7.getListLabel("");
        java.lang.String str11 = python3Target7.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target7.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset4.5.2.1", false);
        boolean boolean17 = python3Target7.templatesExist();
        java.lang.String str19 = python3Target7.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str21 = python3Target7.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        java.lang.String str25 = python3Target24.getVersion();
        java.lang.Class<?> wildcardClass26 = python3Target24.getClass();
        org.antlr.v4.tool.Grammar grammar27 = null;
        int[] intArray28 = new int[] {};
        java.lang.String[] strArray29 = python3Target24.getTokenTypesAsTargetLabels(grammar27, intArray28);
        java.lang.String[] strArray30 = python3Target7.getTokenTypesAsTargetLabels(grammar22, intArray28);
        java.lang.String[] strArray31 = python3Target1.getTokenTypesAsTargetLabels(grammar5, intArray28);
        java.lang.String str33 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        try {
            java.lang.String str35 = python3Target1.getElementListName("__tset\\64ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "tset4.5.2." + "'", str16.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"4.5.2.1Context\"" + "'", str19.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tset@" + "'", str21.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "4.5.2.1" + "'", str25.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getListLabel("\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\1" + "'", str12.equals("\\1"));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset_\"\\\\\\\"\\\\\\\"\"");
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset_\"\\\\\\\"\\\\\\\"\"" + "'", str9.equals("_tset_tset_\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d" + "'", str11.equals("d"));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset\"Python3\"", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d" + "'", str7.equals("d"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"_tset\\\"Python3\\\"\"" + "'", str10.equals("\"_tset\\\"Python3\\\"\""));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Python3" + "'", str6.equals("Python3"));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        try {
            java.lang.String str18 = python3Target1.getElementName("_tset_tset_\"\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.antlr.v4.tool.Rule rule16 = null;
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "Hi!Context", false);
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromString("_tset_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"", false);
        java.lang.String str22 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tset_tset_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"" + "'", str21.equals("_tset_tset_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Python3" + "'", str22.equals("Python3"));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"tset4.5.2.\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        boolean boolean11 = python3Target1.templatesExist();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"Python3\"" + "'", str10.equals("_\"Python3\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tset\\\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_tset\\\\\\\\n\"" + "'", str8.equals("\"_tset\\\\\\\\n\""));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1\"Context" + "'", str13.equals("\"4.5.2.1\"Context"));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getListLabel("\".5.2.\\\"Contex\"");
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\1" + "'", str5.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\35" + "'", str7.equals("\\35"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str10.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target1.getListLabel("_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str14.equals("_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_tset4.5.2.1Contex");
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset_tset4.5.2.1Contex" + "'", str7.equals("_tset_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\0" + "'", str9.equals("\\0"));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName(".5.2.1Contex");
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("_\"\\\\\\\"\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2.1ContexContext" + "'", str9.equals(".5.2.1ContexContext"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\\\\\"\\\\\\\"\"Context" + "'", str11.equals("_\"\\\\\\\"\\\\\\\"\"Context"));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "tset4.5.2.", true);
        java.lang.String str22 = python3Target1.encodeIntAsCharEscape(64);
        int int23 = python3Target1.getSerializedATNSegmentLimit();
        int int24 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"set4.5.2\"" + "'", str20.equals("\"set4.5.2\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "@" + "'", str22.equals("@"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str14 = python3Target1.getVersion();
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target1.getListLabel("_tset\"Python3\"");
        java.lang.String str19 = python3Target1.getImplicitRuleLabel("\\\\\\\"\\\\\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\\0" + "'", str13.equals("\\\\0"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "_tset\"Python3\"" + "'", str17.equals("_tset\"Python3\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_\\\\\\\"\\\\\\\"" + "'", str19.equals("_\\\\\\\"\\\\\\\""));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset", false);
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset_\"\\\\\\\"\\\\\\\"\"ContextContext");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tse" + "'", str8.equals("tse"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset_\"\\\\\\\"\\\\\\\"\"ContextContext" + "'", str11.equals("__tset_\"\\\\\\\"\\\\\\\"\"ContextContext"));
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("tse");
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tse" + "'", str8.equals("_tse"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\1" + "'", str11.equals("\\1"));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "Hi!Context", false);
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + " " + "'", str20.equals(" "));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName(".5.2.");
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("\"set4.5.2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".5.2.Context" + "'", str11.equals(".5.2.Context"));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        try {
            java.lang.String str12 = python3Target1.getElementName("_tset\"_tset_tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        java.lang.String str16 = python3Target1.getLanguage();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("Python3");
        int int19 = python3Target1.getInlineTestSetWordSize();
        int int20 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"Python3\"" + "'", str18.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context", false);
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\"tset4.5.2.\\\"Context" + "'", str11.equals("\\\"tset4.5.2.\\\"Context"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getInlineTestSetWordSize();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean14 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar15 = null;
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("\\\"_tset\\\\\\\\1\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\"_tset\\\\\\\\1\\\"Context" + "'", str13.equals("\\\"_tset\\\\\\\\1\\\"Context"));
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.templatesExist();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\"\\\".5.2.\\\"Context\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getListLabel("");
        java.lang.String str14 = python3Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target10.getCodeGenerator();
        java.util.Set<java.lang.String> strSet16 = python3Target10.getBadWords();
        java.lang.Class<?> wildcardClass17 = python3Target10.getClass();
        boolean boolean18 = python3Target10.wantsBaseVisitor();
        java.lang.String str19 = python3Target10.getVersion();
        boolean boolean20 = python3Target10.supportsOverloadedMethods();
        java.lang.String str21 = python3Target10.getLanguage();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        java.lang.String str26 = python3Target24.getListLabel("");
        java.lang.String str28 = python3Target24.encodeIntAsCharEscape(0);
        java.lang.String str31 = python3Target24.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        boolean boolean35 = python3Target34.wantsBaseVisitor();
        java.lang.String str38 = python3Target34.getTargetStringLiteralFromString("4.5.2.1", false);
        int int39 = python3Target34.getInlineTestSetWordSize();
        java.lang.String str41 = python3Target34.getAltLabelContextStructName("\\0");
        java.lang.String str44 = python3Target34.getTargetStringLiteralFromString(".5.2.", true);
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator46);
        java.lang.String str48 = python3Target47.getVersion();
        boolean boolean49 = python3Target47.wantsBaseListener();
        java.lang.String str50 = python3Target47.getLanguage();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        java.lang.String str55 = python3Target53.getListLabel("");
        java.lang.String str57 = python3Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = python3Target53.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        java.lang.String str62 = python3Target53.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator59, "_tset4.5.2.1", false);
        boolean boolean63 = python3Target53.templatesExist();
        java.lang.String str65 = python3Target53.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str67 = python3Target53.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target70 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator69);
        java.lang.String str71 = python3Target70.getVersion();
        java.lang.Class<?> wildcardClass72 = python3Target70.getClass();
        org.antlr.v4.tool.Grammar grammar73 = null;
        int[] intArray74 = new int[] {};
        java.lang.String[] strArray75 = python3Target70.getTokenTypesAsTargetLabels(grammar73, intArray74);
        java.lang.String[] strArray76 = python3Target53.getTokenTypesAsTargetLabels(grammar68, intArray74);
        java.lang.String[] strArray77 = python3Target47.getTokenTypesAsTargetLabels(grammar51, intArray74);
        java.lang.String[] strArray78 = python3Target34.getTokenTypesAsTargetLabels(grammar45, intArray74);
        java.lang.String[] strArray79 = python3Target24.getTokenTypesAsTargetLabels(grammar32, intArray74);
        java.lang.String[] strArray80 = python3Target10.getTokenTypesAsTargetLabels(grammar22, intArray74);
        java.lang.String[] strArray81 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray74);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset\"\\\".5.2.\\\"Context\"" + "'", str7.equals("_tset\"\\\".5.2.\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Python3" + "'", str21.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\\0" + "'", str28.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"4.5.2.1\"" + "'", str31.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "4.5.2.1" + "'", str38.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\\0Context" + "'", str41.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\".5.2.\"" + "'", str44.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "4.5.2.1" + "'", str48.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Python3" + "'", str50.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\\0" + "'", str57.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator58);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "tset4.5.2." + "'", str62.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "\"4.5.2.1Context\"" + "'", str65.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "_tset@" + "'", str67.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "4.5.2.1" + "'", str71.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getVersion();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset\\64Context");
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_tsethi!");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("tse");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str9.equals("_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset\\64Context" + "'", str11.equals("__tset\\64Context"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset_tsethi!" + "'", str13.equals("_tset_tsethi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tse\"" + "'", str15.equals("\"tse\""));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar16 = null;
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        try {
            java.lang.String str9 = python3Target1.getElementName("\"\\\"_hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d" + "'", str7.equals("d"));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\\64");
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\64Context" + "'", str7.equals("\\64Context"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.String str10 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str11 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tsethi!" + "'", str10.equals("_tsethi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"4.5.2.1Context\"", false);
        java.lang.String str10 = python3Target1.getImplicitSetLabel("a");
        java.lang.String str11 = python3Target1.getVersion();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tseta" + "'", str10.equals("_tseta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        java.lang.String str17 = python3Target1.getImplicitRuleLabel("_tset\".5.2.1Contex\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "__tset\".5.2.1Contex\"" + "'", str17.equals("__tset\".5.2.1Contex\""));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        int int14 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str16 = python3Target1.getElementListName("_\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean4 = python3Target1.templatesExist();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean4 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("@");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_@" + "'", str6.equals("_@"));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape(10);
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\n" + "'", str7.equals("\\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\\64");
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\\0Context");
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str18 = python3Target1.getListLabel("__\"\\\"set4.5.2\\\"\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\\64" + "'", str12.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\0Context" + "'", str14.equals("_tset\\0Context"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str16.equals("\"\\\"hi!\\\"\""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "__\"\\\"set4.5.2\\\"\"" + "'", str18.equals("__\"\\\"set4.5.2\\\"\""));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_" + "'", str12.equals("_"));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) '#');
        int int13 = python3Target1.getInlineTestSetWordSize();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        java.lang.String str16 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getLanguage();
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str12 = python3Target11.getVersion();
        java.lang.Class<?> wildcardClass13 = python3Target11.getClass();
        org.antlr.v4.tool.Grammar grammar14 = null;
        int[] intArray15 = new int[] {};
        java.lang.String[] strArray16 = python3Target11.getTokenTypesAsTargetLabels(grammar14, intArray15);
        java.lang.String[] strArray17 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray15);
        boolean boolean18 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator19);
        java.lang.String str21 = python3Target20.getVersion();
        boolean boolean22 = python3Target20.templatesExist();
        java.util.Set<java.lang.String> strSet23 = python3Target20.getBadWords();
        java.lang.String str25 = python3Target20.getListLabel("d");
        int int26 = python3Target20.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.getListLabel("");
        java.lang.String str33 = python3Target29.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target29.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "4.5.2.1", false);
        boolean boolean38 = python3Target29.wantsBaseListener();
        boolean boolean39 = python3Target29.supportsOverloadedMethods();
        boolean boolean40 = python3Target29.templatesExist();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str45 = python3Target43.getListLabel("");
        java.lang.String str47 = python3Target43.getImplicitSetLabel("4.5.2.1");
        java.lang.String str48 = python3Target43.getVersion();
        java.lang.String str50 = python3Target43.getTargetStringLiteralFromString("\\64");
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        java.lang.String str55 = python3Target53.getListLabel("");
        java.lang.String str57 = python3Target53.encodeIntAsCharEscape(0);
        java.lang.String str59 = python3Target53.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass60 = python3Target53.getClass();
        org.antlr.v4.tool.Grammar grammar61 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target63 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator62);
        java.lang.String str64 = python3Target63.getVersion();
        java.lang.Class<?> wildcardClass65 = python3Target63.getClass();
        org.antlr.v4.tool.Grammar grammar66 = null;
        int[] intArray67 = new int[] {};
        java.lang.String[] strArray68 = python3Target63.getTokenTypesAsTargetLabels(grammar66, intArray67);
        java.lang.String[] strArray69 = python3Target53.getTokenTypesAsTargetLabels(grammar61, intArray67);
        java.lang.String[] strArray70 = python3Target43.getTokenTypesAsTargetLabels(grammar51, intArray67);
        java.lang.String[] strArray71 = python3Target29.getTokenTypesAsTargetLabels(grammar41, intArray67);
        java.lang.String[] strArray72 = python3Target20.getTokenTypesAsTargetLabels(grammar27, intArray67);
        java.lang.String[] strArray73 = python3Target1.getTokenTypesAsTargetLabels(grammar18, intArray67);
        java.util.Set<java.lang.String> strSet74 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "d" + "'", str25.equals("d"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 29 + "'", int26 == 29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ".5.2." + "'", str37.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "_tset4.5.2.1" + "'", str47.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "4.5.2.1" + "'", str48.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\"\\\\64\"" + "'", str50.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\\0" + "'", str57.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "\"Python3\"" + "'", str59.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "4.5.2.1" + "'", str64.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strSet74);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean13 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str9.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "Hi!Context", false);
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getLanguage();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\"tse\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\"tse\"" + "'", str14.equals("_\"tse\""));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getLanguage();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("__tset4.5.2.");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset__tset4.5.2." + "'", str15.equals("_tset__tset4.5.2."));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.Class<?> wildcardClass18 = python3Target17.getClass();
        boolean boolean19 = python3Target17.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "\"tset4.5.2.\"", true);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getListLabel("");
        java.lang.String str30 = python3Target26.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target26.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python3Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "_tset4.5.2.1", false);
        boolean boolean36 = python3Target26.templatesExist();
        java.lang.String str38 = python3Target26.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str40 = python3Target26.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str44 = python3Target43.getVersion();
        java.lang.Class<?> wildcardClass45 = python3Target43.getClass();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python3Target43.getTokenTypesAsTargetLabels(grammar46, intArray47);
        java.lang.String[] strArray49 = python3Target26.getTokenTypesAsTargetLabels(grammar41, intArray47);
        java.lang.String[] strArray50 = python3Target17.getTokenTypesAsTargetLabels(grammar24, intArray47);
        java.lang.String[] strArray51 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray47);
        org.antlr.v4.tool.Grammar grammar52 = null;
        try {
            java.lang.String str54 = python3Target1.getTokenTypeAsTargetLabel(grammar52, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"tset4.5.2.\"" + "'", str23.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\\0" + "'", str30.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "tset4.5.2." + "'", str35.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\"4.5.2.1Context\"" + "'", str38.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "_tset@" + "'", str40.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "4.5.2.1" + "'", str44.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\\64");
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_\\64" + "'", str9.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"\\\\64\"");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\64\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\64\\\"\""));
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("\"__tset@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getImplicitSetLabel("\\\"\\\\\\\"hi!\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"" + "'", str13.equals("_tset\\\"\\\\\\\"hi!\\\\\\\"\\\""));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str14 = python3Target13.getVersion();
        boolean boolean15 = python3Target13.wantsBaseListener();
        boolean boolean16 = python3Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator18);
        java.lang.String str20 = python3Target19.getVersion();
        boolean boolean21 = python3Target19.wantsBaseListener();
        java.util.Set<java.lang.String> strSet22 = python3Target19.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tset", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.getListLabel("");
        java.lang.String str33 = python3Target29.encodeIntAsCharEscape(0);
        java.lang.String str35 = python3Target29.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass36 = python3Target29.getClass();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        java.lang.String str40 = python3Target39.getVersion();
        java.lang.Class<?> wildcardClass41 = python3Target39.getClass();
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python3Target29.getTokenTypesAsTargetLabels(grammar37, intArray43);
        java.lang.String[] strArray46 = python3Target19.getTokenTypesAsTargetLabels(grammar27, intArray43);
        java.lang.String[] strArray47 = python3Target13.getTokenTypesAsTargetLabels(grammar17, intArray43);
        java.lang.String[] strArray48 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray43);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "tse" + "'", str26.equals("tse"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"Python3\"" + "'", str35.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getVersion();
        try {
            java.lang.String str8 = python3Target1.getElementListName("\"\\\"\\\\\\\\35\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target1.getListLabel("\".5.2.\\\"Contex\"Context");
        java.lang.Class<?> wildcardClass18 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        java.lang.String str23 = python3Target21.getListLabel("");
        java.lang.String str25 = python3Target21.encodeIntAsCharEscape(0);
        java.lang.String str27 = python3Target21.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass28 = python3Target21.getClass();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        java.lang.String str32 = python3Target31.getVersion();
        java.lang.Class<?> wildcardClass33 = python3Target31.getClass();
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python3Target31.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python3Target21.getTokenTypesAsTargetLabels(grammar29, intArray35);
        java.lang.String[] strArray38 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray35);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\".5.2.\\\"Contex\"Context" + "'", str17.equals("\".5.2.\\\"Contex\"Context"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\\0" + "'", str25.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"Python3\"" + "'", str27.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("tset\\\"_tset_tset4.5.2.");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"tset\\\\\\\"_tset_tset4.5.2.\"" + "'", str9.equals("\"tset\\\\\\\"_tset_tset4.5.2.\""));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"Python3\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"Python3\"" + "'", str11.equals("_tset\"Python3\""));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str14 = python3Target13.getVersion();
        boolean boolean15 = python3Target13.wantsBaseListener();
        boolean boolean16 = python3Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator18);
        java.lang.String str20 = python3Target19.getVersion();
        boolean boolean21 = python3Target19.wantsBaseListener();
        java.util.Set<java.lang.String> strSet22 = python3Target19.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tset", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.getListLabel("");
        java.lang.String str33 = python3Target29.encodeIntAsCharEscape(0);
        java.lang.String str35 = python3Target29.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass36 = python3Target29.getClass();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        java.lang.String str40 = python3Target39.getVersion();
        java.lang.Class<?> wildcardClass41 = python3Target39.getClass();
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python3Target29.getTokenTypesAsTargetLabels(grammar37, intArray43);
        java.lang.String[] strArray46 = python3Target19.getTokenTypesAsTargetLabels(grammar27, intArray43);
        java.lang.String[] strArray47 = python3Target13.getTokenTypesAsTargetLabels(grammar17, intArray43);
        java.lang.String[] strArray48 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray43);
        java.lang.String str50 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str52 = python3Target1.encodeIntAsCharEscape((int) 'a');
        try {
            java.lang.String str54 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "tse" + "'", str26.equals("tse"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"Python3\"" + "'", str35.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str50.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "a" + "'", str52.equals("a"));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getListLabel("Python3");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"_tset\\\"\\\\\\\".5.2.\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"_tset\\\"\\\\\\\".5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_tset\"_tset\\\"\\\\\\\".5.2.\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str14 = python3Target1.getElementListName("tse");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"Python3\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator13);
        java.lang.String str16 = python3Target14.getListLabel("");
        java.lang.String str18 = python3Target14.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target14.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "_tset4.5.2.1", false);
        boolean boolean24 = python3Target14.templatesExist();
        java.lang.String str26 = python3Target14.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str28 = python3Target14.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        java.lang.String str32 = python3Target31.getVersion();
        java.lang.Class<?> wildcardClass33 = python3Target31.getClass();
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python3Target31.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python3Target14.getTokenTypesAsTargetLabels(grammar29, intArray35);
        java.lang.String[] strArray38 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray35);
        java.lang.String str40 = python3Target1.getImplicitRuleLabel("__tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"Python3\"" + "'", str11.equals("_tset\"Python3\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\0" + "'", str18.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "tset4.5.2." + "'", str23.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"4.5.2.1Context\"" + "'", str26.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "_tset@" + "'", str28.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "___tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str40.equals("___tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"\\\"tset4.5.2.\\\"Context\"");
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getImplicitSetLabel("_tset");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str7.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset_tset" + "'", str10.equals("_tset_tset"));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset\\n", false);
        java.lang.String str7 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\\\\n" + "'", str6.equals("_tset\\\\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Python3" + "'", str7.equals("Python3"));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray14 = new int[] {};
        java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray14);
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str12.equals("\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str10 = python3Target1.getElementListName("\"\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getListLabel("\".5.2.\\\"Contex\"");
        java.lang.String str11 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\1" + "'", str5.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\35" + "'", str7.equals("\\35"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str10.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\"tse\"", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\"tse" + "'", str11.equals("\\\"tse"));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "Hi!Context", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\\\".5.2.\\\"Context\"", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\\\".5.2.\\\"Context" + "'", str22.equals("\\\".5.2.\\\"Context"));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\\1", false);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_tset\\1", true);
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str19 = python3Target1.getVersion();
        java.lang.String str21 = python3Target1.getImplicitSetLabel("\".5.2.1Contex\"");
        boolean boolean22 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\\\1" + "'", str14.equals("\\\\1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"_tset\\\\1\"" + "'", str17.equals("\"_tset\\\\1\""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tset\".5.2.1Contex\"" + "'", str21.equals("_tset\".5.2.1Contex\""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.String str10 = python3Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tsethi!" + "'", str10.equals("_tsethi!"));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\\"set4.5.2\\\"", false);
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\"set4.5.2\\\"" + "'", str11.equals("\\\"set4.5.2\\\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.lang.String str16 = python3Target1.getVersion();
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("_tset_tset4.5.2.1Contex");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "__tset_tset4.5.2.1Contex" + "'", str18.equals("__tset_tset4.5.2.1Contex"));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_tset_tset_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str12.equals("\"_tset_tset_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.wantsBaseListener();
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("_tset_tset\"\"");
        java.lang.String str21 = python3Target1.getAltLabelContextStructName("__\"\\\"set4.5.2\\\"\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset_tset\"\"Context" + "'", str19.equals("_tset_tset\"\"Context"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "__\"\\\"set4.5.2\\\"\"Context" + "'", str21.equals("__\"\\\"set4.5.2\\\"\"Context"));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        java.lang.Class<?> wildcardClass20 = python3Target18.getClass();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray22);
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        int int27 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str26.equals("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29 + "'", int27 == 29);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str14 = python3Target13.getVersion();
        boolean boolean15 = python3Target13.wantsBaseListener();
        boolean boolean16 = python3Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator18);
        java.lang.String str20 = python3Target19.getVersion();
        boolean boolean21 = python3Target19.wantsBaseListener();
        java.util.Set<java.lang.String> strSet22 = python3Target19.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tset", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.getListLabel("");
        java.lang.String str33 = python3Target29.encodeIntAsCharEscape(0);
        java.lang.String str35 = python3Target29.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass36 = python3Target29.getClass();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        java.lang.String str40 = python3Target39.getVersion();
        java.lang.Class<?> wildcardClass41 = python3Target39.getClass();
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python3Target29.getTokenTypesAsTargetLabels(grammar37, intArray43);
        java.lang.String[] strArray46 = python3Target19.getTokenTypesAsTargetLabels(grammar27, intArray43);
        java.lang.String[] strArray47 = python3Target13.getTokenTypesAsTargetLabels(grammar17, intArray43);
        java.lang.String[] strArray48 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray43);
        org.antlr.v4.tool.ast.GrammarAST grammarAST49 = null;
        try {
            boolean boolean50 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "tse" + "'", str26.equals("tse"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"Python3\"" + "'", str35.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        try {
            java.lang.String str11 = python3Target1.getElementListName("\"\\\\35\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("4.5.2.1Context");
        try {
            java.lang.String str8 = python3Target1.getElementListName("\\\"_tset\\\\\\\\1\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1ContextContext" + "'", str6.equals("4.5.2.1ContextContext"));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getListLabel("4.5.2.1Context");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.wantsBaseListener();
        boolean boolean18 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str7.equals("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.", true);
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\64", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\\64\"" + "'", str9.equals("\"\\\\64\""));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\"4.5.2.1Context\"");
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\"4.5.2.1Context\"" + "'", str14.equals("_\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"ContextContext" + "'", str16.equals("\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"ContextContext"));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("@");
        boolean boolean12 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_tset_\"\\\\\\\"\\\\\\\"\"");
        boolean boolean15 = python3Target1.wantsBaseListener();
        boolean boolean16 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_\"\\\\\\\"\\\\\\\"\"Context" + "'", str14.equals("_tset_\"\\\\\\\"\\\\\\\"\"Context"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getVersion();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet12 = python3Target1.getBadWords();
        java.lang.String str14 = python3Target1.getListLabel("_tset\\\\n");
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str20 = python3Target18.getListLabel("");
        java.lang.String str22 = python3Target18.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target18.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "_tset4.5.2.1", false);
        boolean boolean28 = python3Target18.templatesExist();
        java.lang.String str30 = python3Target18.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str31 = python3Target18.getLanguage();
        java.lang.String str33 = python3Target18.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean34 = python3Target18.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator36);
        java.lang.String str38 = python3Target37.getVersion();
        boolean boolean39 = python3Target37.templatesExist();
        java.util.Set<java.lang.String> strSet40 = python3Target37.getBadWords();
        java.lang.String str42 = python3Target37.getListLabel("d");
        int int43 = python3Target37.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str48 = python3Target46.getListLabel("");
        java.lang.String str50 = python3Target46.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        java.lang.String str54 = python3Target46.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator51, "4.5.2.1", false);
        boolean boolean55 = python3Target46.wantsBaseListener();
        boolean boolean56 = python3Target46.supportsOverloadedMethods();
        boolean boolean57 = python3Target46.templatesExist();
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target60 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator59);
        java.lang.String str62 = python3Target60.getListLabel("");
        java.lang.String str64 = python3Target60.getImplicitSetLabel("4.5.2.1");
        java.lang.String str65 = python3Target60.getVersion();
        java.lang.String str67 = python3Target60.getTargetStringLiteralFromString("\\64");
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target70 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator69);
        java.lang.String str72 = python3Target70.getListLabel("");
        java.lang.String str74 = python3Target70.encodeIntAsCharEscape(0);
        java.lang.String str76 = python3Target70.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass77 = python3Target70.getClass();
        org.antlr.v4.tool.Grammar grammar78 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator79 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target80 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator79);
        java.lang.String str81 = python3Target80.getVersion();
        java.lang.Class<?> wildcardClass82 = python3Target80.getClass();
        org.antlr.v4.tool.Grammar grammar83 = null;
        int[] intArray84 = new int[] {};
        java.lang.String[] strArray85 = python3Target80.getTokenTypesAsTargetLabels(grammar83, intArray84);
        java.lang.String[] strArray86 = python3Target70.getTokenTypesAsTargetLabels(grammar78, intArray84);
        java.lang.String[] strArray87 = python3Target60.getTokenTypesAsTargetLabels(grammar68, intArray84);
        java.lang.String[] strArray88 = python3Target46.getTokenTypesAsTargetLabels(grammar58, intArray84);
        java.lang.String[] strArray89 = python3Target37.getTokenTypesAsTargetLabels(grammar44, intArray84);
        java.lang.String[] strArray90 = python3Target18.getTokenTypesAsTargetLabels(grammar35, intArray84);
        java.lang.String[] strArray91 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray84);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\\\n" + "'", str14.equals("_tset\\\\n"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\\0" + "'", str22.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "tset4.5.2." + "'", str27.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\"4.5.2.1Context\"" + "'", str30.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Python3" + "'", str31.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "_tset4.5.2." + "'", str33.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "4.5.2.1" + "'", str38.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "d" + "'", str42.equals("d"));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 29 + "'", int43 == 29);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\\0" + "'", str50.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ".5.2." + "'", str54.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "_tset4.5.2.1" + "'", str64.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "4.5.2.1" + "'", str65.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "\"\\\\64\"" + "'", str67.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "\\0" + "'", str74.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "\"Python3\"" + "'", str76.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "4.5.2.1" + "'", str81.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        java.lang.Class<?> wildcardClass20 = python3Target18.getClass();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray22);
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean27 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python3Target1.getCodeGenerator();
        boolean boolean29 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str26.equals("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar14 = null;
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1Context" + "'", str12.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        int int17 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\35\"Context", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\35\\\"Contex\"" + "'", str12.equals("\"\\\\35\\\"Contex\""));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getLanguage();
        java.lang.String str10 = python3Target1.getListLabel("\"set4.5.2\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Python3" + "'", str8.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"set4.5.2\"" + "'", str10.equals("\"set4.5.2\""));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getListLabel("\"\\\\35\"Context");
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape(100);
        try {
            java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\\35\"Context" + "'", str11.equals("\"\\\\35\"Context"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "d" + "'", str15.equals("d"));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        java.lang.String str16 = python3Target1.getLanguage();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean19 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str21 = python3Target1.getElementListName("_tset\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"Python3\"" + "'", str18.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        boolean boolean20 = python3Target1.wantsBaseVisitor();
        int int21 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"hi!\"Context" + "'", str18.equals("\"hi!\"Context"));
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertNull(codeGenerator23);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_\\64");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("\"__tset\\\\1\"");
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\\64" + "'", str11.equals("_tset_\\64"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"__tset\\\\1\"Context" + "'", str13.equals("\"__tset\\\\1\"Context"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0" + "'", str8.equals("\\0"));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context", true);
        java.lang.String str7 = python3Target1.getLanguage();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\\\"tset4.5.2.\\\"Context\"" + "'", str6.equals("\"\\\"tset4.5.2.\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Python3" + "'", str7.equals("Python3"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.templatesExist();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\"\\\".5.2.\\\"Context\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset\"\\\".5.2.\\\"Context\"" + "'", str7.equals("_tset\"\\\".5.2.\\\"Context\""));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass6 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset\\64Context");
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_tsethi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str9.equals("_tset_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset\\64Context" + "'", str11.equals("__tset\\64Context"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset_tsethi!" + "'", str13.equals("_tset_tsethi!"));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("tset4.5.2.");
        boolean boolean17 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = null;
        try {
            java.lang.String[] strArray20 = python3Target1.getTokenTypesAsTargetLabels(grammar18, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString(".5.2.");
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getListLabel("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\".5.2.\"" + "'", str8.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str14 = python3Target1.getVersion();
        int int15 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\\0" + "'", str13.equals("\\\\0"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\\\\1");
        boolean boolean15 = python3Target1.templatesExist();
        java.lang.String str16 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14.equals("_tset\\\\1"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\".5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", true);
        boolean boolean13 = python3Target1.wantsBaseListener();
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\".5.2.\"Context" + "'", str8.equals("\".5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\".5.2.\"" + "'", str12.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context", true);
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "4.5.2.1ContextContext", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset\\1" + "'", str11.equals("__tset\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ".5.2.1ContextContex" + "'", str15.equals(".5.2.1ContextContex"));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getInlineTestSetWordSize();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str14 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\\0" + "'", str13.equals("\\\\0"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.", true);
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("__tset\\64Context");
        java.lang.String str15 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\".5.2.\"" + "'", str11.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "__tset\\64ContextContext" + "'", str13.equals("__tset\\64ContextContext"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\"" + "'", str15.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\""));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray14 = new int[] {};
        java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray14);
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str12.equals("\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        boolean boolean18 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet19 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\\0" + "'", str17.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1");
        int int15 = python3Target1.getInlineTestSetWordSize();
        int int16 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\1" + "'", str11.equals("\\1"));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.", true);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\".5.2.\"" + "'", str11.equals("\".5.2.\""));
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("tse");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("_\"tse\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tse" + "'", str8.equals("_tse"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"tse\"Context" + "'", str11.equals("_\"tse\"Context"));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_\"\\\\\\\"\\\\\\\"\"Context", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset_\\\"\\\\\\\"\\\\\\\"\\\"Contex\"" + "'", str16.equals("\"tset_\\\"\\\\\\\"\\\\\\\"\\\"Contex\""));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("_\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\"" + "'", str14.equals("\"\""));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        try {
            java.lang.String str12 = python3Target1.getElementName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("@");
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("\"\\\"set4.5.2\\\"\"");
        java.lang.String str19 = python3Target1.getVersion();
        boolean boolean20 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_\"\\\"set4.5.2\\\"\"" + "'", str18.equals("_\"\\\"set4.5.2\\\"\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_" + "'", str9.equals("_"));
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("tse");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tse" + "'", str11.equals("_tse"));
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\\1", false);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_tset\\1", true);
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        int int19 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromString("\".5.2.\\\"Contex\"Context", true);
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromString("_\"4.5.2.1Context\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\\\1" + "'", str14.equals("\\\\1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"_tset\\\\1\"" + "'", str17.equals("\"_tset\\\\1\""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\\".5.2.\\\\\\\"Contex\\\"Context\"" + "'", str22.equals("\"\\\".5.2.\\\\\\\"Contex\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\"_\\\"4.5.2.1Context\\\"\"" + "'", str24.equals("\"_\\\"4.5.2.1Context\\\"\""));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        int int7 = python3Target1.getInlineTestSetWordSize();
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("@");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) '4');
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\64" + "'", str13.equals("\\64"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        java.lang.String str14 = python3Target1.getListLabel("_tset_tset4.5.2.Context");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"_hi!\"", true);
        int int18 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_tset4.5.2.Context" + "'", str14.equals("_tset_tset4.5.2.Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\\\"_hi!\\\"\"" + "'", str17.equals("\"\\\"_hi!\\\"\""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str16 = python3Target15.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tset4.5.2.1", false);
        int int21 = python3Target15.getSerializedATNSegmentLimit();
        boolean boolean22 = python3Target15.supportsOverloadedMethods();
        boolean boolean23 = python3Target15.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass24 = python3Target15.getClass();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str28 = python3Target27.getVersion();
        boolean boolean29 = python3Target27.wantsBaseListener();
        boolean boolean30 = python3Target27.templatesExist();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        java.lang.String str34 = python3Target33.getVersion();
        boolean boolean35 = python3Target33.wantsBaseListener();
        java.util.Set<java.lang.String> strSet36 = python3Target33.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        java.lang.String str40 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator37, "_tset", false);
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str45 = python3Target43.getListLabel("");
        java.lang.String str47 = python3Target43.encodeIntAsCharEscape(0);
        java.lang.String str49 = python3Target43.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass50 = python3Target43.getClass();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        java.lang.String str54 = python3Target53.getVersion();
        java.lang.Class<?> wildcardClass55 = python3Target53.getClass();
        org.antlr.v4.tool.Grammar grammar56 = null;
        int[] intArray57 = new int[] {};
        java.lang.String[] strArray58 = python3Target53.getTokenTypesAsTargetLabels(grammar56, intArray57);
        java.lang.String[] strArray59 = python3Target43.getTokenTypesAsTargetLabels(grammar51, intArray57);
        java.lang.String[] strArray60 = python3Target33.getTokenTypesAsTargetLabels(grammar41, intArray57);
        java.lang.String[] strArray61 = python3Target27.getTokenTypesAsTargetLabels(grammar31, intArray57);
        java.lang.String[] strArray62 = python3Target15.getTokenTypesAsTargetLabels(grammar25, intArray57);
        java.lang.String[] strArray63 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray57);
        java.lang.String str66 = python3Target1.getTargetStringLiteralFromString("\".5.2.1Contex\"", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "tset4.5.2." + "'", str20.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4.5.2.1" + "'", str28.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "4.5.2.1" + "'", str34.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "tse" + "'", str40.equals("tse"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\\0" + "'", str47.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "\"Python3\"" + "'", str49.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "4.5.2.1" + "'", str54.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\"\\\".5.2.1Contex\\\"\"" + "'", str66.equals("\"\\\".5.2.1Contex\\\"\""));
    }
}

