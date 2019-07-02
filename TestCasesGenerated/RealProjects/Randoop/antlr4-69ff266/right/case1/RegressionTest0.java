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
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar3 = null;
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        try {
            java.lang.String str6 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray11 = new int[] { (byte) 1, (short) 0, 'a', (byte) 10, '#' };
        try {
            java.lang.String[] strArray12 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        try {
            java.lang.String str9 = python2Target1.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Rule rule11 = null;
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.tool.Rule rule7 = null;
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.tool.Grammar grammar6 = null;
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        try {
            java.lang.String str13 = python2Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        try {
            java.lang.String str12 = python2Target1.getElementName("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.Rule rule4 = null;
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"4.5.2.1\"" + "'", str3.equals("\"4.5.2.1\""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"4.5.2.1\"" + "'", str3.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"hi!\"" + "'", str5.equals("\"hi!\""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        org.antlr.v4.tool.Rule rule3 = null;
        try {
            java.lang.String str4 = python2Target1.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
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
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        try {
            java.lang.String str9 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar14 = null;
        try {
            java.lang.String str16 = python2Target1.getTokenTypeAsTargetLabel(grammar14, (int) (byte) -1);
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
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray9 = new int[] { (short) 1, 100, (short) 100, (byte) 1, (byte) 1 };
        try {
            java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar3, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.tool.Rule rule5 = null;
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"4.5.2.1\"" + "'", str3.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"hi!\"" + "'", str5.equals("\"hi!\""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        try {
            java.lang.String str11 = python2Target1.getElementName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"4.5.2.1\"", false);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
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
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        try {
            java.lang.String str6 = python2Target1.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        try {
            java.lang.String str4 = python2Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        int[] intArray21 = new int[] { (byte) 10, 'a', (short) 1, 0 };
        try {
            java.lang.String[] strArray22 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray21);
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
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        try {
            java.lang.String str4 = python2Target1.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        try {
            java.lang.String str17 = python2Target1.getElementListName("\"#\"");
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
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ython" + "'", str14.equals("ython"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(ruleFunction15);
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
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        org.antlr.v4.tool.Rule rule16 = null;
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(rule16);
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
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        int[] intArray17 = null;
        try {
            java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray17);
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
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("\\1");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar8 = null;
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "@" + "'", str9.equals("@"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"4.5.2.1\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        try {
            java.lang.String str11 = python2Target1.getElementName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"4.5.2.1\"" + "'", str3.equals("\"4.5.2.1\""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_ython");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        try {
            java.lang.String str17 = python2Target1.getLoopCounter(grammarAST16);
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
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("_\"hi!\"Context");
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str13 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"hi!\"Context" + "'", str11.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"Python2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"Python2\"Context" + "'", str3.equals("\"Python2\"Context"));
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        try {
            java.lang.String str6 = python2Target1.getElementListName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getListLabel("@");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "@" + "'", str9.equals("@"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        try {
            java.lang.String str21 = python2Target1.getTokenTypeAsTargetLabel(grammar19, (int) (byte) -1);
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
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str10 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getListLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        try {
            java.lang.String str21 = python2Target1.getTokenTypeAsTargetLabel(grammar19, (-1));
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
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("ython");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        try {
            java.lang.String str11 = python2Target1.getElementName("_#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_ython" + "'", str8.equals("_ython"));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("\"Python2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar13 = null;
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
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
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        try {
            java.lang.String str20 = python2Target1.getLoopLabel(grammarAST19);
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
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\n" + "'", str9.equals("\\n"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tset\\0");
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset_tset\\0" + "'", str15.equals("_tset_tset\\0"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getVersion();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        try {
            java.lang.String str18 = python2Target1.getLoopCounter(grammarAST17);
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
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        try {
            java.lang.String str17 = python2Target1.getLoopCounter(grammarAST16);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "tsetContex" + "'", str17.equals("tsetContex"));
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\"\\\\1\"" + "'", str14.equals("_\"\\\\1\""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str11.equals("\"\\\"hi!\\\"\""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"hi!\"Context", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"Context" + "'", str12.equals("\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"hi!\\\"Contex\"" + "'", str16.equals("\"hi!\\\"Contex\""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str15 = python2Target1.getImplicitSetLabel("");
        try {
            java.lang.String str17 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset" + "'", str15.equals("_tset"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("#");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset#" + "'", str14.equals("_tset#"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction40 = null;
        try {
            java.lang.String str41 = python2Target1.getRuleFunctionContextStructName(ruleFunction40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar3 = null;
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(codeGenerator2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        int int9 = python2Target1.getInlineTestSetWordSize();
        boolean boolean10 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset#");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\n\"", true);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"4.5.2.1Context\"" + "'", str14.equals("\"4.5.2.1Context\""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        boolean boolean11 = python2Target1.wantsBaseListener();
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "__\"\\\\1\"" + "'", str13.equals("__\"\\\\1\""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("#");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"#\"" + "'", str10.equals("\"#\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        try {
            java.lang.String str4 = python2Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(codeGenerator2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"hi!\"", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        boolean boolean12 = python2Target1.wantsBaseListener();
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("\"_tset#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("_\"hi!\"Context");
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"hi!\"Context" + "'", str11.equals("_\"hi!\"Context"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\"\\\\n\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\\n\"" + "'", str14.equals("\"\\\\n\""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
        try {
            java.lang.String str12 = python2Target1.getElementListName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        try {
            java.lang.String str10 = python2Target1.getElementName("\"_tset\\\"hi!\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("4.5.2.1Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset4.5.2.1Context" + "'", str8.equals("_tset4.5.2.1Context"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str14 = python2Target1.getVersion();
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("ython");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"ython\"" + "'", str16.equals("\"ython\""));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        java.lang.String str20 = python2Target1.getImplicitSetLabel("tsetContex");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tsetContext" + "'", str18.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tsettsetContex" + "'", str20.equals("_tsettsetContex"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
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
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset4.5.2.1Context");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1ContextContext" + "'", str9.equals("_tset4.5.2.1ContextContext"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("_\"hi!\"Context");
        try {
            java.lang.String str13 = python2Target1.getElementListName("_\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"hi!\"Context" + "'", str11.equals("_\"hi!\"Context"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str9 = python2Target1.getVersion();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_tset\\\"hi!\\\"Context\"", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset\\\"hi!\\\"Context" + "'", str9.equals("_tset\\\"hi!\\\"Context"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_");
        try {
            java.lang.String str10 = python2Target1.getElementName("_\"\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset_" + "'", str8.equals("_tset_"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar3 = null;
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\n\"", true);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("4.5.2.1Context");
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
        java.lang.Class<?> wildcardClass28 = strArray27.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"4.5.2.1Context\"" + "'", str14.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"hi!\"" + "'", str20.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Python2" + "'", str21.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
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
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"Python2\"Context" + "'", str9.equals("\"Python2\"Context"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        org.antlr.v4.tool.Rule rule22 = null;
        try {
            java.lang.String str23 = python2Target1.getRuleFunctionContextStructName(rule22);
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
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str14 = python2Target1.getVersion();
        try {
            java.lang.String str16 = python2Target1.getElementListName("_tset\\0");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset#", true);
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\"" + "'", str15.equals("\"tset\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        java.lang.String str21 = python2Target1.getLanguage();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Python2" + "'", str21.equals("Python2"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getVersion();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset\"hi!\"Context");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_\"\\\\1\"" + "'", str14.equals("_tset_\"\\\\1\""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("ython");
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_ython" + "'", str8.equals("_ython"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python2Target1.getListLabel("#");
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        int int22 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
            boolean boolean18 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\n", false);
        java.lang.String str13 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\n" + "'", str12.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        java.lang.String str13 = python2Target1.getLanguage();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset4.5.2.1\"" + "'", str15.equals("\"_tset4.5.2.1\""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        try {
            java.lang.String str18 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tset\\0");
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\"_tset#\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset_tset\\0" + "'", str15.equals("_tset_tset\\0"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\\\"_tset#\\\"\"" + "'", str17.equals("\"\\\"_tset#\\\"\""));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "@" + "'", str9.equals("@"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Rule rule6 = null;
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        boolean boolean19 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_");
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset_" + "'", str8.equals("_tset_"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
        try {
            java.lang.String str85 = python2Target1.getElementName("_\"hi!\"Context");
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
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        boolean boolean10 = python2Target1.templatesExist();
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        org.antlr.v4.tool.Rule rule11 = null;
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        java.lang.String str16 = python2Target1.getImplicitSetLabel("_\"\\\"#\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset_\"\\\"#\\\"\"" + "'", str16.equals("_tset_\"\\\"#\\\"\""));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("_tset_tset\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset_tset\"4.5.2.1\"Context" + "'", str10.equals("_tset_tset\"4.5.2.1\"Context"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        try {
            java.lang.String str21 = python2Target1.getLoopLabel(grammarAST20);
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\\\\1\"" + "'", str19.equals("\"\\\\1\""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("#");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("_tsetContext");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"#\"" + "'", str10.equals("\"#\""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tsetContextContext" + "'", str13.equals("_tsetContextContext"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset#", true);
        org.antlr.v4.tool.Rule rule16 = null;
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\"" + "'", str15.equals("\"tset\""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
        try {
            java.lang.String str12 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_ythonContext");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"_ythonContext\"" + "'", str14.equals("\"_ythonContext\""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        java.lang.String str14 = python2Target10.getLanguage();
        java.util.Set<java.lang.String> strSet15 = python2Target10.getBadWords();
        boolean boolean16 = python2Target10.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        int[] intArray18 = new int[] {};
        java.lang.String[] strArray19 = python2Target10.getTokenTypesAsTargetLabels(grammar17, intArray18);
        java.lang.String[] strArray20 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray18);
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        try {
            boolean boolean22 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"hi!\"" + "'", str13.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python2" + "'", str14.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        boolean boolean13 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("ython");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\\\n", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_ython" + "'", str8.equals("_ython"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\\\\\n" + "'", str12.equals("\\\\\\\\n"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        try {
            java.lang.String str16 = python2Target1.getElementName("_tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_#" + "'", str14.equals("_#"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        try {
            java.lang.String str22 = python2Target1.getElementListName("_tset_\"\\\\1\"");
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset" + "'", str19.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean7 = python2Target1.templatesExist();
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str9 = python2Target1.getVersion();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_tset_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("_\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"_tset\\\"hi!\\\"Context\"");
        int int10 = python2Target1.getInlineTestSetWordSize();
        boolean boolean11 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_\"_tset\\\"hi!\\\"Context\"" + "'", str9.equals("_\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        boolean boolean52 = python2Target1.wantsBaseVisitor();
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "__tset" + "'", str10.equals("__tset"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"hi!\\\"Contex\"");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\\\"Contex\"Context" + "'", str8.equals("\"hi!\\\"Contex\"Context"));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        try {
            java.lang.String str14 = python2Target1.getElementListName("ython");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean5 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        try {
            java.lang.String str8 = python2Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        try {
            java.lang.String str12 = python2Target1.getElementListName("_tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        boolean boolean19 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tsetContext" + "'", str18.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"ython\"", false);
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_ythonContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ython" + "'", str10.equals("ython"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("_\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"Python2\"Context" + "'", str3.equals("\"Python2\"Context"));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset_\"hi!\"Context" + "'", str7.equals("_tset_\"hi!\"Context"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        try {
            java.lang.String str14 = python2Target1.getElementName("_tset_tset\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\\64" + "'", str12.equals("_\\64"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getListLabel("@");
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"\\\"#\\\"\"");
        boolean boolean13 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "@" + "'", str9.equals("@"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\"\\\"#\\\"\"" + "'", str12.equals("_\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset\"4.5.2.1\"");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"_tset\\\"4.5.2.1\\\"\"" + "'", str11.equals("\"_tset\\\"4.5.2.1\\\"\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "__" + "'", str13.equals("__"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("_ython");
        java.lang.String str9 = python2Target1.getListLabel("_tset_tset\"4.5.2.1\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_ythonContext" + "'", str7.equals("_ythonContext"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset\"4.5.2.1\"Context" + "'", str9.equals("_tset_tset\"4.5.2.1\"Context"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "d" + "'", str6.equals("d"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        java.lang.String str18 = python2Target1.getImplicitSetLabel("\\0");
        try {
            java.lang.String str20 = python2Target1.getElementName("_tsetContext");
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tset\\0" + "'", str18.equals("_tset\\0"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"tset\"", false);
        try {
            java.lang.String str22 = python2Target1.getElementListName("_#");
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "tset" + "'", str20.equals("tset"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getListLabel("@");
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"\\\"#\\\"\"");
        java.lang.String str13 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "@" + "'", str9.equals("@"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\"\\\"#\\\"\"" + "'", str12.equals("_\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        try {
            java.lang.String str16 = python2Target1.getElementName("\"hi!\"");
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
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '4');
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        java.lang.String str29 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1ContextContext");
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target1.getTemplates();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"_tset4.5.2.1ContextContext\"" + "'", str29.equals("\"_tset4.5.2.1ContextContext\""));
        org.junit.Assert.assertNotNull(sTGroup30);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("\"\\\"_tset\\\"hi!\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        java.lang.String str15 = python2Target1.getListLabel("\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"4.5.2.1\"" + "'", str15.equals("\"4.5.2.1\""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        try {
            java.lang.String str17 = python2Target1.getElementListName("ython");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(ruleFunction19);
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
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"hi!\\\"Context\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str12.equals("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str10 = python2Target1.getImplicitSetLabel(" ");
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset " + "'", str10.equals("_tset "));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_tset\"4.5.2.1\"Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"tset_tset\\\"4.5.2.1\\\"Contex\"" + "'", str10.equals("\"tset_tset\\\"4.5.2.1\\\"Contex\""));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "tset\\\"4.5.2.1" + "'", str15.equals("tset\\\"4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\\"_tset#\\\"" + "'", str19.equals("\\\"_tset#\\\""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str10 = python2Target1.getImplicitSetLabel(" ");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("#");
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset " + "'", str10.equals("_tset "));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#Context" + "'", str12.equals("#Context"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        try {
            java.lang.String str15 = python2Target1.getElementName("_\"\\\"#\\\"\"");
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
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tset_\"\\\"#\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tset#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("\"4.5.2.1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        try {
            java.lang.String str16 = python2Target1.getElementName("\"_ythonContext\"");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        boolean boolean21 = python2Target1.templatesExist();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("ython");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_ython" + "'", str8.equals("_ython"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str13 = python2Target1.getImplicitSetLabel("\\0");
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tset\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset\\0" + "'", str13.equals("_tset\\0"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset_tset\"4.5.2.1\"" + "'", str15.equals("_tset_tset\"4.5.2.1\""));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset " + "'", str14.equals("__tset "));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset4.5.2.1ContextContext\"Context" + "'", str15.equals("\"_tset4.5.2.1ContextContext\"Context"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        boolean boolean19 = python2Target1.supportsOverloadedMethods();
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
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"_ythonContext\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"_ythonContext\"" + "'", str10.equals("_\"_ythonContext\""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset\"4.5.2.1\"");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset\"4.5.2.1\"" + "'", str9.equals("_tset_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str12 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"#\\\"\"" + "'", str11.equals("\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python2" + "'", str13.equals("Python2"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        boolean boolean11 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        boolean boolean11 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"Python2\"");
        java.lang.String str5 = python2Target1.getListLabel("_tset_");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"Python2\"Context" + "'", str3.equals("\"Python2\"Context"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset_" + "'", str5.equals("_tset_"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\64");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\64\"" + "'", str12.equals("\"\\\\64\""));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
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
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("\"ython\"");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        boolean boolean11 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"ython\"" + "'", str9.equals("\"ython\""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"" + "'", str10.equals("_\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        java.lang.String str6 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\1" + "'", str9.equals("\\1"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\\1\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_" + "'", str16.equals("_"));
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("_\"hi!\"Context");
        java.lang.String str12 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"hi!\"Context" + "'", str11.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"_ython\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\"_ython\"" + "'", str12.equals("_\"_ython\""));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python2" + "'", str10.equals("Python2"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str13 = python2Target1.getImplicitSetLabel("\\0");
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("_#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset\\0" + "'", str13.equals("_tset\\0"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getListLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"hi!\"Context" + "'", str11.equals("_tset\"hi!\"Context"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str10 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\n" + "'", str9.equals("\\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python2" + "'", str10.equals("Python2"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        java.lang.Class<?> wildcardClass52 = intArray48.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        try {
            boolean boolean18 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "tset4.5.2.1ContextContex" + "'", str16.equals("tset4.5.2.1ContextContex"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
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
        org.antlr.v4.tool.Rule rule16 = null;
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#" + "'", str12.equals("#"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"" + "'", str15.equals("\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\""));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        try {
            java.lang.String str14 = python2Target1.getElementName("_tset_#");
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String str12 = python2Target1.getListLabel("_tset\\\"hi!\\\"Context");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\"\\\\64\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tset\\\"hi!\\\"Context" + "'", str12.equals("_tset\\\"hi!\\\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\"\\\\64\"" + "'", str14.equals("_tset\"\\\\64\""));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getListLabel("\"tset_tset\\\"4.5.2.1\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"tset_tset\\\"4.5.2.1\\\"Contex\"" + "'", str4.equals("\"tset_tset\\\"4.5.2.1\\\"Contex\""));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        boolean boolean12 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\"\\\"hi!\\\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\"\\\"hi!\\\"\"" + "'", str14.equals("_tset\"\\\"hi!\\\"\""));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        org.antlr.v4.tool.Rule rule52 = null;
        try {
            java.lang.String str53 = python2Target1.getRuleFunctionContextStructName(rule52);
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
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
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
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1Context");
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"#\"");
        java.lang.String str12 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"#\\\"\"" + "'", str11.equals("\"\\\"#\\\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1Context" + "'", str10.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\\\\n" + "'", str14.equals("_\\\\n"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "__", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"" + "'", str11.equals("\"\""));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("__tset_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "___tset_\"\\\\1\"" + "'", str10.equals("___tset_\"\\\\1\""));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        java.lang.String str41 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
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
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str41.equals("\"\\\"hi!\\\"\""));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_\"hi!\"Context" + "'", str8.equals("_\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\\n" + "'", str12.equals("\\\\n"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\"\\\\\\\\1\\\"\"" + "'", str10.equals("_\"\\\"\\\\\\\\1\\\"\""));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("Python2");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_Python2" + "'", str14.equals("_Python2"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset_tset\\0");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("__tset_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset_tset\\0Context" + "'", str8.equals("_tset_tset\\0Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "___tset_\"\\\\1\"" + "'", str10.equals("___tset_\"\\\\1\""));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getListLabel("_tset\"\\\\64\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\\64\"" + "'", str11.equals("_tset\"\\\\64\""));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str15 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        java.lang.String str18 = python2Target1.getImplicitSetLabel("_tset_#");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset" + "'", str15.equals("_tset"));
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tset_tset_#" + "'", str18.equals("_tset_tset_#"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\n\"", true);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\\n\"" + "'", str12.equals("\"\\\\n\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"4.5.2.1Context\"" + "'", str14.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\"" + "'", str16.equals("_\"_tset_\\\"\\\\\\\"#\\\\\\\"\\\"\""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        int int10 = python2Target1.getInlineTestSetWordSize();
        int int11 = python2Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("__\"\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset#");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("\"_tset4.5.2.1ContextContext\"Context", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"_tset#\"" + "'", str11.equals("\"_tset#\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "@" + "'", str13.equals("@"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\\\"_tset4.5.2.1ContextContext\\\"Context\"" + "'", str16.equals("\"\\\"_tset4.5.2.1ContextContext\\\"Context\""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset");
        int int13 = python2Target1.getInlineTestSetWordSize();
        int int14 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\"4.5.2.1\"" + "'", str8.equals("_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tsetContext" + "'", str12.equals("_tsetContext"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getVersion();
        try {
            java.lang.String str11 = python2Target1.getElementName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset#", true);
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset\"" + "'", str15.equals("\"tset\""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("@");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str11.equals("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset", false);
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"hi!\"Context");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str9 = python2Target1.getVersion();
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("\"\\\"_tset\\\"hi!\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset\"hi!\"Context" + "'", str6.equals("_tset\"hi!\"Context"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset\"4.5.2.1\"");
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset\"4.5.2.1\"" + "'", str9.equals("_tset_tset\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\1" + "'", str11.equals("\\1"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "_tset" + "'", str4.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.lang.String str15 = python2Target1.getLanguage();
        boolean boolean16 = python2Target1.wantsBaseListener();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("_\\64", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1Context" + "'", str13.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Python2" + "'", str15.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_\\\\64" + "'", str19.equals("_\\\\64"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_tset4.5.2.1");
        java.lang.String str12 = python2Target1.getLanguage();
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset4.5.2.1Context" + "'", str11.equals("_tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python2" + "'", str12.equals("Python2"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_tset_tset\\0", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"tset_tset0\"" + "'", str14.equals("\"tset_tset0\""));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_\\64", true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python2\"" + "'", str10.equals("\"Python2\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"_\\\\64\"" + "'", str14.equals("\"_\\\\64\""));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("4.5.2.1Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"4.5.2.1Context\"" + "'", str10.equals("\"4.5.2.1Context\""));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"_tset\\\"hi!\\\"Context\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_tset\\\"hi!\\\"Context\"Context" + "'", str8.equals("\"_tset\\\"hi!\\\"Context\"Context"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python2" + "'", str9.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
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
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\\n", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"" + "'", str8.equals("\"\""));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"" + "'", str11.equals("\"\""));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset\"4.5.2.1\"");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) ' ');
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("\"\\\"_tset\\\\\\\"hi!\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"_tset\\\"4.5.2.1\\\"\"" + "'", str11.equals("\"_tset\\\"4.5.2.1\\\"\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + " " + "'", str13.equals(" "));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_" + "'", str10.equals("_"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
        java.lang.String str17 = python2Target1.getListLabel("\"hi!\"");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Python2" + "'", str5.equals("Python2"));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"_tset\\\"hi!\\\"Context\"" + "'", str12.equals("\"\\\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"hi!\"" + "'", str17.equals("\"hi!\""));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"_tset\\\"hi!\\\"Context\"");
        int int10 = python2Target1.getInlineTestSetWordSize();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_\"_tset\\\"hi!\\\"Context\"" + "'", str9.equals("_\"_tset\\\"hi!\\\"Context\""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str6 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"ython\"", false);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("tset");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ython" + "'", str10.equals("ython"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "TsetContext" + "'", str12.equals("TsetContext"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("\"\\\"_tset4.5.2.1ContextContext\\\"Context\"");
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\"\\\\\\\"_tset4.5.2.1ContextContext\\\\\\\"Context\\\"\"" + "'", str20.equals("\"\\\"\\\\\\\"_tset4.5.2.1ContextContext\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        java.lang.String str15 = python2Target1.getLanguage();
        boolean boolean16 = python2Target1.wantsBaseListener();
        try {
            java.lang.String str18 = python2Target1.getImplicitTokenLabel("\"_tset\\\"hi!\\\"Context\"Context");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Python2" + "'", str15.equals("Python2"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getListLabel("\\1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"hi!\"" + "'", str4.equals("\"hi!\""));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10.equals("\"\\\\1\""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python2" + "'", str11.equals("Python2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
    }
}

