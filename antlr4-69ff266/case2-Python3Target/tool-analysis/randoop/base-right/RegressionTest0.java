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
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        try {
            java.lang.String[] strArray9 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        try {
            java.lang.String str4 = python3Target1.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule3 = null;
        try {
            java.lang.String str4 = python3Target1.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            boolean boolean6 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule5 = null;
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        try {
            java.lang.String str4 = python3Target1.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray8 = new int[] { (short) 1, (short) -1, (short) -1, 0 };
        try {
            java.lang.String[] strArray9 = python3Target1.getTokenTypesAsTargetLabels(grammar3, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule7 = null;
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        try {
            java.lang.String str3 = python3Target1.getLoopLabel(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray13 = new int[] { '4', (short) 10 };
        try {
            java.lang.String[] strArray14 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        try {
            java.lang.String str5 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.tool.Rule rule9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        try {
            java.lang.String str7 = python3Target1.getElementName("tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Rule rule4 = null;
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str5 = python3Target1.getElementName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        try {
            java.lang.String str6 = python3Target1.getTokenTypeAsTargetLabel(grammar4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray8 = new int[] { '4', 10, '4' };
        try {
            java.lang.String[] strArray9 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str8 = python3Target1.getElementName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray10 = new int[] { (short) 100, 10, (short) 1, 1, (short) 100 };
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Rule rule11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray6 = new int[] { 29, (byte) 1 };
        try {
            java.lang.String[] strArray7 = python3Target1.getTokenTypesAsTargetLabels(grammar3, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        try {
            java.lang.String str7 = python3Target1.getElementListName("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str11 = python3Target1.getElementName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass6 = sTGroup5.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray15 = new int[] { (short) 100 };
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            boolean boolean6 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str13 = python3Target1.getElementName("\"4.5.2.1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        try {
            java.lang.String str3 = python3Target1.getElementName("__tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray8 = new int[] { 'a', 100, ' ', 1 };
        try {
            java.lang.String[] strArray9 = python3Target1.getTokenTypesAsTargetLabels(grammar3, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        try {
            java.lang.String str6 = python3Target1.getTokenTypeAsTargetLabel(grammar4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset4.5.2.\"Context" + "'", str16.equals("\"tset4.5.2.\"Context"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("\"4.5.2.1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str6 = python3Target1.getImplicitTokenLabel("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str10 = python3Target1.getElementName("__tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        try {
            java.lang.String str4 = python3Target1.getImplicitTokenLabel("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        try {
            java.lang.String str4 = python3Target1.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass6 = strSet5.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("\"4.5.2.1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getListLabel("4.5.2.1Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1Context" + "'", str6.equals("4.5.2.1Context"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        try {
            java.lang.String str16 = python3Target1.getElementListName("\"Python3\"");
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
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(64);
        try {
            java.lang.String str14 = python3Target1.getElementName("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "@" + "'", str12.equals("@"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        org.antlr.v4.tool.Grammar grammar8 = null;
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("_tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray14 = new int[] { 10, 100, (-1), (byte) 100, (byte) 10, 0 };
        try {
            java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass5 = strSet4.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.", true);
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"tset4.5.2.\"Context" + "'", str9.equals("\"tset4.5.2.\"Context"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\".5.2.\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean9 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str11 = python3Target1.getElementName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.", true);
        try {
            java.lang.String str8 = python3Target1.getElementName("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6.equals("\"tset4.5.2.\""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str8 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            boolean boolean5 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(10);
        try {
            java.lang.String str12 = python3Target1.getElementName("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\n" + "'", str10.equals("\\n"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        try {
            java.lang.String str14 = python3Target1.getElementListName("\\\"\\\"");
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
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"\\\"tset4.5.2.\\\"Context\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray14 = new int[] { 0, 29, (byte) 10, (byte) 1, (-1) };
        try {
            java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str7.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        try {
            java.lang.String str10 = python3Target1.getElementListName("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8.equals("_tset4.5.2.1"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        try {
            java.lang.String str11 = python3Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName(".5.2.");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".5.2.Context" + "'", str11.equals(".5.2.Context"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0" + "'", str8.equals("\\0"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            java.lang.String str6 = python3Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str6 = python3Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray10 = new int[] { (short) 0, ' ' };
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = null;
        try {
            java.lang.String[] strArray13 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray12);
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
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\"");
        org.antlr.v4.tool.Rule rule11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\"" + "'", str10.equals("_\"\""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            boolean boolean16 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\\\"\\\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\\\\\\\"\\\\\\\"\"" + "'", str7.equals("\"\\\\\\\"\\\\\\\"\""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar4 = null;
        try {
            java.lang.String str6 = python3Target1.getTokenTypeAsTargetLabel(grammar4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str12 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str11.equals("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean12 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        try {
            java.lang.String str18 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset4.5.2.\"Context" + "'", str16.equals("\"tset4.5.2.\"Context"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str6 = python3Target1.getElementName("\"\\\".5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray15 = new int[] { (short) 10, (short) 100, 0 };
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getLanguage();
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        try {
            java.lang.String str10 = python3Target1.getElementName("\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        try {
            java.lang.String str11 = python3Target1.getElementName("__tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python3Target1.getLoopCounter(grammarAST15);
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
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        try {
            java.lang.String str5 = python3Target1.getElementName("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        try {
            java.lang.String str7 = python3Target1.getElementListName("\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        try {
            java.lang.String str11 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            boolean boolean6 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"4.5.2.1Context\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str10 = python3Target1.getElementName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"4.5.2.1Context\"" + "'", str7.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"_tset_tset4.5.2.\"" + "'", str6.equals("\"_tset_tset4.5.2.\""));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tse" + "'", str8.equals("tse"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getVersion();
        try {
            java.lang.String str9 = python3Target1.getElementListName("\"_tset_tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar3 = null;
        try {
            java.lang.String str5 = python3Target1.getTokenTypeAsTargetLabel(grammar3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Hi!Context" + "'", str7.equals("Hi!Context"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str13 = python3Target1.getElementListName("\"tset4.5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"tset4.5.2.\"", true);
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        try {
            java.lang.String str10 = python3Target1.getElementName("_\"\"");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\\64");
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\64\"" + "'", str8.equals("\"\\\\64\""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        try {
            boolean boolean6 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        try {
            java.lang.String str15 = python3Target1.getElementName("\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.", true);
        try {
            java.lang.String str8 = python3Target1.getElementListName("_tset\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6.equals("\"tset4.5.2.\""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) '4');
        try {
            java.lang.String str13 = python3Target1.getElementListName("_tset_tset4.5.2.Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        try {
            java.lang.String str7 = python3Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass6 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str12 = python3Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str8 = python3Target1.getImplicitSetLabel("\".5.2.\"Context");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\1" + "'", str6.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset\".5.2.\"Context" + "'", str8.equals("_tset\".5.2.\"Context"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.templatesExist();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\"");
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("\"tset4.5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\"" + "'", str10.equals("_\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\1" + "'", str12.equals("\\1"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.templatesExist();
        try {
            java.lang.String str14 = python3Target1.getElementName("\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str12 = python3Target1.getElementListName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        try {
            java.lang.String str11 = python3Target1.getElementListName("__tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.", true);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\\35");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_\\35" + "'", str9.equals("_\\35"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset\\1" + "'", str7.equals("_tset\\1"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(ruleFunction15);
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
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        java.lang.String str16 = python3Target1.getImplicitSetLabel("_tset4.5.2.");
        try {
            java.lang.String str18 = python3Target1.getImplicitTokenLabel("\\0Context");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset_tset4.5.2." + "'", str16.equals("_tset_tset4.5.2."));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.templatesExist();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        try {
            java.lang.String str10 = python3Target1.getElementName("__\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        org.antlr.v4.tool.Rule rule14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.templatesExist();
        try {
            java.lang.String str6 = python3Target1.getElementName("_tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        try {
            java.lang.String str19 = python3Target1.getElementName("_tset_tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getVersion();
        try {
            java.lang.String str12 = python3Target1.getElementListName(".5.2.Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str6 = python3Target1.getImplicitTokenLabel("\\\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        try {
            java.lang.String str16 = python3Target1.getElementName("\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        try {
            java.lang.String str17 = python3Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"4.5.2.1Context\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_\"4.5.2.1Context\"" + "'", str11.equals("_\"4.5.2.1Context\""));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        java.lang.String str13 = python3Target12.getVersion();
        boolean boolean14 = python3Target12.wantsBaseListener();
        boolean boolean15 = python3Target12.templatesExist();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str19 = python3Target18.getVersion();
        boolean boolean20 = python3Target18.wantsBaseListener();
        java.util.Set<java.lang.String> strSet21 = python3Target18.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "_tset", false);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        java.lang.String str30 = python3Target28.getListLabel("");
        java.lang.String str32 = python3Target28.encodeIntAsCharEscape(0);
        java.lang.String str34 = python3Target28.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass35 = python3Target28.getClass();
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator37);
        java.lang.String str39 = python3Target38.getVersion();
        java.lang.Class<?> wildcardClass40 = python3Target38.getClass();
        org.antlr.v4.tool.Grammar grammar41 = null;
        int[] intArray42 = new int[] {};
        java.lang.String[] strArray43 = python3Target38.getTokenTypesAsTargetLabels(grammar41, intArray42);
        java.lang.String[] strArray44 = python3Target28.getTokenTypesAsTargetLabels(grammar36, intArray42);
        java.lang.String[] strArray45 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray42);
        java.lang.String[] strArray46 = python3Target12.getTokenTypesAsTargetLabels(grammar16, intArray42);
        java.lang.String[] strArray47 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "tse" + "'", str25.equals("tse"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\\0" + "'", str32.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "\"Python3\"" + "'", str34.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "4.5.2.1" + "'", str39.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Hi!Context" + "'", str10.equals("Hi!Context"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        int int15 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule16 = null;
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("\"_tset_tset4.5.2.\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tset\"_tset_tset4.5.2.\"" + "'", str12.equals("_tset\"_tset_tset4.5.2.\""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\64" + "'", str13.equals("\\64"));
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python3" + "'", str12.equals("Python3"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset", false);
        try {
            java.lang.String str10 = python3Target1.getElementListName("_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tse" + "'", str8.equals("tse"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"Python3\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(ruleFunction12);
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"Python3\"" + "'", str10.equals("\"Python3\""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tset\\1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "__tset\\1" + "'", str6.equals("__tset\\1"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\\\\0");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\\\\\\0\"" + "'", str15.equals("\"\\\\\\\\0\""));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"tset4.5.2.\"", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getListLabel("");
        java.lang.String str14 = python3Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target10.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_tset4.5.2.1", false);
        boolean boolean20 = python3Target10.templatesExist();
        java.lang.String str22 = python3Target10.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str24 = python3Target10.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str28 = python3Target27.getVersion();
        java.lang.Class<?> wildcardClass29 = python3Target27.getClass();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target27.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target10.getTokenTypesAsTargetLabels(grammar25, intArray31);
        java.lang.String[] strArray34 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray31);
        org.antlr.v4.tool.ast.GrammarAST grammarAST35 = null;
        try {
            boolean boolean36 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\0" + "'", str14.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "tset4.5.2." + "'", str19.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"4.5.2.1Context\"" + "'", str22.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "_tset@" + "'", str24.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4.5.2.1" + "'", str28.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str9 = python3Target1.getVersion();
        try {
            java.lang.String str11 = python3Target1.getElementName(".5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"4.5.2.1Context\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str15 = python3Target1.getElementName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        int int8 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str10 = python3Target1.getElementListName("_tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str9 = python3Target1.getElementName("\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        java.lang.String str18 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str19 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset4.5.2.\"Context" + "'", str16.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\35" + "'", str18.equals("\\35"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4.5.2.1" + "'", str19.equals("4.5.2.1"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getListLabel("\\0");
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str9 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        org.antlr.v4.tool.Rule rule49 = null;
        try {
            java.lang.String str50 = python3Target1.getRuleFunctionContextStructName(rule49);
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        try {
            java.lang.String str9 = python3Target1.getElementName("_tset_\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_\\64");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\\64" + "'", str11.equals("_tset_\\64"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\"" + "'", str18.equals("\"\""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        boolean boolean9 = python3Target1.wantsBaseListener();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("__tset4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "___tset4.5.2.1" + "'", str9.equals("___tset4.5.2.1"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
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
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "Hi!Context", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\1" + "'", str5.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "i!Contex" + "'", str9.equals("i!Contex"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        org.antlr.v4.tool.Rule rule6 = null;
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        try {
            java.lang.String str5 = python3Target1.getElementName("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        boolean boolean13 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("\"\\\\64\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str10 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        try {
            java.lang.String str10 = python3Target1.getElementName("\"set4.5.2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str9.equals("\\\"4.5.2.1\\\""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST52 = null;
        try {
            java.lang.String str53 = python3Target1.getLoopCounter(grammarAST52);
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
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.String str8 = python3Target1.getLanguage();
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Python3" + "'", str8.equals("Python3"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        org.antlr.v4.tool.Rule rule19 = null;
        try {
            java.lang.String str20 = python3Target1.getRuleFunctionContextStructName(rule19);
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
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\".5.2.\\\"Context\"", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\".5.2.\\\"Context\"" + "'", str9.equals("\"\\\".5.2.\\\"Context\""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset4.5.2.1", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset4.5.2.1Contex" + "'", str9.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\64" + "'", str11.equals("\\64"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15.equals("\"tset4.5.2.\""));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
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
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
            java.lang.String str18 = python3Target1.getImplicitTokenLabel("_tset\".5.2.\"Context");
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.Context", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset4.5.2." + "'", str16.equals("_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"_tset_tset4.5.2.Context\"" + "'", str20.equals("\"_tset_tset4.5.2.Context\""));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"tset4.5.2.\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitSetLabel("\\n");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset\\n" + "'", str10.equals("_tset\\n"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.String str10 = python3Target1.getListLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\\"4.5.2.1\\\"", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str14.equals("\\\"4.5.2.1\\\""));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"set4.5.2\"", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str9.equals("\\\"4.5.2.1\\\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\"set4.5.2\\\"" + "'", str12.equals("\\\"set4.5.2\\\""));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("_tset4.5.2.");
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
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar6 = null;
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(ruleFunction17);
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4.5.2.1" + "'", str16.equals("4.5.2.1"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\\64");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\64Context" + "'", str7.equals("\\64Context"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        boolean boolean18 = python3Target1.wantsBaseVisitor();
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar6 = null;
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        java.lang.String str29 = python3Target1.encodeIntAsCharEscape((int) ' ');
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + " " + "'", str29.equals(" "));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        java.lang.String str6 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Python3" + "'", str6.equals("Python3"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        try {
            java.lang.String str19 = python3Target1.getElementName("\"_tset\\\\1\"");
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str5 = python3Target1.getElementName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"4.5.2.1Context\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"4.5.2.1Context\"" + "'", str7.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
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
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.tool.Grammar grammar8 = null;
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d" + "'", str7.equals("d"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.getListLabel("");
        java.lang.String str19 = python3Target15.getImplicitSetLabel("4.5.2.1");
        java.lang.String str20 = python3Target15.getVersion();
        java.lang.String str22 = python3Target15.getTargetStringLiteralFromString("\\64");
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        java.lang.String str27 = python3Target25.getListLabel("");
        java.lang.String str29 = python3Target25.encodeIntAsCharEscape(0);
        java.lang.String str31 = python3Target25.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass32 = python3Target25.getClass();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        java.lang.String str36 = python3Target35.getVersion();
        java.lang.Class<?> wildcardClass37 = python3Target35.getClass();
        org.antlr.v4.tool.Grammar grammar38 = null;
        int[] intArray39 = new int[] {};
        java.lang.String[] strArray40 = python3Target35.getTokenTypesAsTargetLabels(grammar38, intArray39);
        java.lang.String[] strArray41 = python3Target25.getTokenTypesAsTargetLabels(grammar33, intArray39);
        java.lang.String[] strArray42 = python3Target15.getTokenTypesAsTargetLabels(grammar23, intArray39);
        java.lang.String[] strArray43 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray39);
        java.lang.String str45 = python3Target1.getAltLabelContextStructName("\".5.2.\"ContextContext");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_tset4.5.2.1" + "'", str19.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\\\64\"" + "'", str22.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\\0" + "'", str29.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"Python3\"" + "'", str31.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "4.5.2.1" + "'", str36.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\".5.2.\"ContextContextContext" + "'", str45.equals("\".5.2.\"ContextContextContext"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.", true);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("\".5.2.\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python3Target1.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\".5.2.\"" + "'", str11.equals("\".5.2.\""));
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\".5.2.\"ContextContext" + "'", str14.equals("\".5.2.\"ContextContext"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        java.lang.String str13 = python3Target1.getLanguage();
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Python3" + "'", str13.equals("Python3"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\\1");
        java.lang.String str15 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\1" + "'", str14.equals("_tset\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Python3" + "'", str15.equals("Python3"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"tset4.5.2.\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\\35", false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset4.5.2.\"" + "'", str7.equals("\"tset4.5.2.\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\\35" + "'", str11.equals("\\\\35"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_\\64");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\\64" + "'", str11.equals("_tset_\\64"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\".5.2.\"Context", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("_\"\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("@");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset@" + "'", str11.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("@");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"@\"" + "'", str12.equals("\"@\""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
            java.lang.String str18 = python3Target1.getElementListName("\"\\\\\\\\0\"");
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        try {
            java.lang.String str8 = python3Target1.getElementListName("tse");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.", true);
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\".5.2.\"" + "'", str11.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("__tset\\1");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"__tset\\\\1\"" + "'", str17.equals("\"__tset\\\\1\""));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"4.5.2.1Context\"", false);
        java.lang.String str10 = python3Target1.getListLabel("_tset_tset4.5.2.Context");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_tset_tset4.5.2.Context" + "'", str10.equals("_tset_tset4.5.2.Context"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\\\"4.5.2.1\\\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        try {
            boolean boolean24 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST23);
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str22.equals("\"\\\"4.5.2.1\\\"\""));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.tool.Rule rule14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_hi!" + "'", str13.equals("_hi!"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str13 = python3Target1.getListLabel("\".5.2.\\\"Contex\"");
        org.antlr.v4.tool.Rule rule14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\".5.2.\\\"Contex\"" + "'", str13.equals("\".5.2.\\\"Contex\""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        java.lang.String str29 = python3Target1.getVersion();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "4.5.2.1" + "'", str29.equals("4.5.2.1"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getImplicitSetLabel("_\"4.5.2.1Context\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "_tset_\"4.5.2.1Context\"" + "'", str3.equals("_tset_\"4.5.2.1Context\""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        java.lang.String str55 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator52, "4.5.2.1Context", true);
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
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "\".5.2.1Contex\"" + "'", str55.equals("\".5.2.1Contex\""));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str5 = python3Target1.getImplicitSetLabel("_tset\\n");
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset_tset\\n" + "'", str5.equals("_tset_tset\\n"));
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray10 = new int[] { '4', (byte) 1, (byte) -1, '4', 100 };
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        try {
            java.lang.String str7 = python3Target1.getElementListName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        try {
            java.lang.String str18 = python3Target1.getElementListName("\\n");
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_\\64");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("_tset_\"\\\\\\\"\\\\\\\"\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\\64" + "'", str11.equals("_tset_\\64"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset_\"\\\\\\\"\\\\\\\"\"ContextContext" + "'", str13.equals("_tset_\"\\\\\\\"\\\\\\\"\"ContextContext"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        boolean boolean18 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            boolean boolean7 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"4.5.2.1Context\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getListLabel("\"tset4.5.2.\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"_tset_tset4.5.2.\"", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"tset4.5.2.\"Context" + "'", str5.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "tset\\\"_tset_tset4.5.2." + "'", str9.equals("tset\\\"_tset_tset4.5.2."));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\\64");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\64Context" + "'", str7.equals("\\64Context"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        java.lang.String str18 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Python3" + "'", str14.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\\0" + "'", str17.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Python3" + "'", str18.equals("Python3"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("_tset\"_tset_tset4.5.2.\"");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset\"_tset_tset4.5.2.\"Context" + "'", str7.equals("_tset\"_tset_tset4.5.2.\"Context"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar11 = null;
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        boolean boolean9 = python3Target1.templatesExist();
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("_tset@");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset@Context" + "'", str13.equals("_tset@Context"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.String str9 = python3Target1.getVersion();
        try {
            java.lang.String str11 = python3Target1.getElementName("__tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1Context" + "'", str12.equals("4.5.2.1Context"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        java.lang.String str17 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule18 = null;
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        try {
            java.lang.String str16 = python3Target1.getLoopLabel(grammarAST15);
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
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\"");
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\"" + "'", str10.equals("_\"\""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\1" + "'", str12.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\n" + "'", str14.equals("\\n"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python3" + "'", str10.equals("Python3"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\"\\\\1\"");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\1\"Context" + "'", str8.equals("\"\\\\1\"Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\\35", true);
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\\35\"" + "'", str15.equals("\"\\\\35\""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator18);
        java.lang.String str20 = python3Target19.getVersion();
        java.lang.Class<?> wildcardClass21 = python3Target19.getClass();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target1.getTokenTypesAsTargetLabels(grammar17, intArray23);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset@" + "'", str15.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str12.equals("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        try {
            boolean boolean33 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST32);
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
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar5 = null;
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule10 = null;
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"@\"", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\\\"@\\\"\"" + "'", str16.equals("\"\\\"@\\\"\""));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        int int9 = python3Target1.getInlineTestSetWordSize();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\1" + "'", str8.equals("\\1"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\\1");
        try {
            java.lang.String str16 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Python3" + "'", str11.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset\\1" + "'", str14.equals("_tset\\1"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(sTGroup3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getListLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getListLabel("\"\\\\35\"Context");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("Hi!Context", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\\35\"Context" + "'", str11.equals("\"\\\\35\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Hi!Context" + "'", str14.equals("Hi!Context"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        try {
            java.lang.String str65 = python3Target1.getImplicitTokenLabel("\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str6 = python3Target1.getElementName("_tset_tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        int int28 = python3Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 29 + "'", int28 == 29);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule8 = null;
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str8 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\\\\\"\\\\\\\"\"");
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        boolean boolean15 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_\"\\\\\\\"\\\\\\\"\"" + "'", str13.equals("_\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "__tset4.5.2.1Context", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("_tset_tset\"\"");
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        boolean boolean12 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        try {
            java.lang.String str26 = python3Target1.getLoopLabel(grammarAST25);
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
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        org.antlr.v4.tool.Rule rule32 = null;
        try {
            java.lang.String str33 = python3Target1.getRuleFunctionContextStructName(rule32);
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
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"\\\\\\\"\\\\\\\"\"", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "_tset" + "'", str7.equals("_tset"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".5.2." + "'", str12.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"0Contex\"" + "'", str16.equals("\"0Contex\""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\\\\\\\"\\\\\\\"" + "'", str20.equals("\\\\\\\"\\\\\\\""));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        boolean boolean10 = python3Target1.templatesExist();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("4.5.2.1ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\".5.2.\"Context");
        java.lang.String str16 = python3Target1.getImplicitSetLabel("\\64Context");
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\".5.2.\\\"Context\"" + "'", str14.equals("\"\\\".5.2.\\\"Context\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset\\64Context" + "'", str16.equals("_tset\\64Context"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\\64", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"_\\\\64\"" + "'", str7.equals("\"_\\\\64\""));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_\\35");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "4.5.2.1" + "'", str10.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "__\\35" + "'", str12.equals("__\\35"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("__tset4.5.2.1");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"set4.5.2\"");
        try {
            java.lang.String str13 = python3Target1.getElementName("\"__tset\\\\1\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "___tset4.5.2.1" + "'", str9.equals("___tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"set4.5.2\\\"\"" + "'", str11.equals("\"\\\"set4.5.2\\\"\""));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.templatesExist();
        boolean boolean13 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "tse", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"s\"" + "'", str9.equals("\"s\""));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        try {
            java.lang.String str14 = python3Target1.getElementListName("tset\\\"_tset_tset4.5.2.\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\\\\\"\\\\\\\"\"");
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_\"\\\\\\\"\\\\\\\"\"" + "'", str13.equals("_\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        try {
            java.lang.String str6 = python3Target1.getElementName("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        boolean boolean12 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "__tset4.5.2.1" + "'", str5.equals("__tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\\64");
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\\\\\\\"\\\\\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\\64\"" + "'", str8.equals("\"\\\\64\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "_\"\\\\\\\"\\\\\\\"\"" + "'", str10.equals("_\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str14.equals("\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\""));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        java.lang.String str20 = python3Target1.getImplicitSetLabel("\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context" + "'", str20.equals("_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        java.lang.String str18 = python3Target1.getImplicitSetLabel("_tset\"\"");
        try {
            java.lang.String str20 = python3Target1.getElementListName("\"\\\\\\\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset" + "'", str15.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "_tset_tset\"\"" + "'", str18.equals("_tset_tset\"\""));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getListLabel("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\"" + "'", str15.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\\\"Contex\""));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("@");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"@\"" + "'", str9.equals("\"@\""));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        try {
            java.lang.String str18 = python3Target1.getElementName("\"__tset\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset4.5.2.\"Context" + "'", str16.equals("\"tset4.5.2.\"Context"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"Python3\"", true);
        try {
            java.lang.String str16 = python3Target1.getElementListName("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"Python3\"" + "'", str14.equals("\"Python3\""));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\".5.2.\"Context");
        int int15 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\\".5.2.\\\"Context\"" + "'", str14.equals("\"\\\".5.2.\\\"Context\""));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\\\"4.5.2.1\\\"", true);
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target1.getTemplates();
        java.lang.String str24 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str22.equals("\"\\\"4.5.2.1\\\"\""));
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1" + "'", str24.equals("4.5.2.1"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\\1\"", false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\\"_tset\\\\\\\\1\\\"" + "'", str5.equals("\\\"_tset\\\\\\\\1\\\""));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        try {
            java.lang.String str29 = python3Target1.getLoopLabel(grammarAST28);
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context" + "'", str27.equals("\\\"\\\\\\\"\\\\\\\\\\\\\\\"tset4.5.2.\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Context"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        java.lang.Class<?> wildcardClass19 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"Python3\"" + "'", str18.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"hi!\"Context" + "'", str18.equals("\"hi!\"Context"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"4.5.2.1Context\"", true);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.tool.Grammar grammar10 = null;
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"4.5.2.1Context\"" + "'", str7.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_" + "'", str9.equals("_"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\\35", true);
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        try {
            java.lang.String str18 = python3Target1.getLoopCounter(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\\\\35\"" + "'", str15.equals("\"\\\\35\""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\\1", false);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_tset\\1", true);
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset\"tset4.5.2.\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\\\1" + "'", str14.equals("\\\\1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"_tset\\\\1\"" + "'", str17.equals("\"_tset\\\\1\""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"_tset\\\"tset4.5.2.\\\"Context\"" + "'", str19.equals("\"_tset\\\"tset4.5.2.\\\"Context\""));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        try {
            java.lang.String str33 = python3Target1.getLoopCounter(grammarAST32);
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
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule7 = null;
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getListLabel("4.5.2.1Context");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.getImplicitSetLabel("_tset@Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset_tset@Context" + "'", str5.equals("_tset_tset@Context"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule14 = null;
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", false);
        int int21 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str23 = python3Target1.encodeIntAsCharEscape(29);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\\35" + "'", str23.equals("\\35"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("__tset4.5.2.1");
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("__tset4.5.2.1Context");
        java.lang.String str13 = python3Target1.getListLabel("_tset@Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "___tset4.5.2.1" + "'", str9.equals("___tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset4.5.2.1ContextContext" + "'", str11.equals("__tset4.5.2.1ContextContext"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_tset@Context" + "'", str13.equals("_tset@Context"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("4.5.2.1Context");
        int int7 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str9 = python3Target1.getElementListName("_\"\\\"set4.5.2\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1ContextContext" + "'", str6.equals("4.5.2.1ContextContext"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        try {
            java.lang.String str13 = python3Target1.getElementListName("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\\\"\\\"");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset4.5.2.");
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str12 = python3Target1.getElementListName("__tset\\64ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\0" + "'", str4.equals("\\0"));
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\\\\\\\"\\\\\\\"\"" + "'", str7.equals("\"\\\\\\\"\\\\\\\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset_tset4.5.2." + "'", str9.equals("_tset_tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "__tset4.5.2.1Context" + "'", str14.equals("__tset4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str12 = python3Target11.getVersion();
        boolean boolean13 = python3Target11.templatesExist();
        java.util.Set<java.lang.String> strSet14 = python3Target11.getBadWords();
        java.lang.String str16 = python3Target11.getListLabel("d");
        int int17 = python3Target11.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator19);
        java.lang.String str22 = python3Target20.getListLabel("");
        java.lang.String str24 = python3Target20.getImplicitSetLabel("4.5.2.1");
        boolean boolean25 = python3Target20.supportsOverloadedMethods();
        int int26 = python3Target20.getSerializedATNSegmentLimit();
        boolean boolean27 = python3Target20.templatesExist();
        java.lang.Class<?> wildcardClass28 = python3Target20.getClass();
        java.lang.String str30 = python3Target20.getImplicitSetLabel("\"Python3\"");
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        java.lang.String str35 = python3Target33.getListLabel("");
        java.lang.String str37 = python3Target33.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = python3Target33.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        java.lang.String str42 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator39, "_tset4.5.2.1", false);
        boolean boolean43 = python3Target33.templatesExist();
        java.lang.String str45 = python3Target33.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str47 = python3Target33.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator49);
        java.lang.String str51 = python3Target50.getVersion();
        java.lang.Class<?> wildcardClass52 = python3Target50.getClass();
        org.antlr.v4.tool.Grammar grammar53 = null;
        int[] intArray54 = new int[] {};
        java.lang.String[] strArray55 = python3Target50.getTokenTypesAsTargetLabels(grammar53, intArray54);
        java.lang.String[] strArray56 = python3Target33.getTokenTypesAsTargetLabels(grammar48, intArray54);
        java.lang.String[] strArray57 = python3Target20.getTokenTypesAsTargetLabels(grammar31, intArray54);
        java.lang.String[] strArray58 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray54);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray54);
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target62 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator61);
        java.lang.String str63 = python3Target62.getVersion();
        java.lang.Class<?> wildcardClass64 = python3Target62.getClass();
        org.antlr.v4.tool.Grammar grammar65 = null;
        int[] intArray66 = new int[] {};
        java.lang.String[] strArray67 = python3Target62.getTokenTypesAsTargetLabels(grammar65, intArray66);
        java.lang.String[] strArray68 = python3Target1.getTokenTypesAsTargetLabels(grammar60, intArray66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d" + "'", str16.equals("d"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "_tset4.5.2.1" + "'", str24.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 29 + "'", int26 == 29);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "_tset\"Python3\"" + "'", str30.equals("_tset\"Python3\""));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\0" + "'", str37.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator38);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "tset4.5.2." + "'", str42.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"4.5.2.1Context\"" + "'", str45.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "_tset@" + "'", str47.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "4.5.2.1" + "'", str51.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "4.5.2.1" + "'", str63.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\".5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\".5.2.\"Context" + "'", str8.equals("\".5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12.equals("\"0Contex\""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        java.lang.String str14 = python3Target1.getListLabel("_tset_tset4.5.2.Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_tset_tset4.5.2.Context" + "'", str14.equals("_tset_tset4.5.2.Context"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getListLabel("\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        boolean boolean14 = python3Target1.wantsBaseListener();
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "__tset4.5.2.1" + "'", str13.equals("__tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        try {
            java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_\\64");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("\"__tset\\\\1\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            boolean boolean15 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\\64" + "'", str11.equals("_tset_\\64"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"__tset\\\\1\"Context" + "'", str13.equals("\"__tset\\\\1\"Context"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("_tset\"\\\".5.2.\\\"Context\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"_tset\\\"\\\\\\\".5.2.\\\\\\\"Context\\\"\"" + "'", str9.equals("\"_tset\\\"\\\\\\\".5.2.\\\\\\\"Context\\\"\""));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
            java.lang.String str17 = python3Target1.getLoopCounter(grammarAST16);
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
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Python3" + "'", str7.equals("Python3"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset", false);
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
        java.util.Set<java.lang.String> strSet29 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tse" + "'", str8.equals("tse"));
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
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str8 = python3Target1.getElementListName("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset4.5.2.1", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        try {
            java.lang.String str17 = python3Target1.getElementListName("\"tset4.5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar9 = null;
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
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
        org.antlr.v4.tool.Rule rule13 = null;
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_\\64" + "'", str12.equals("_\\64"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
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
        java.lang.String str19 = python3Target1.getListLabel("_\\\"\\\"");
        java.lang.String str21 = python3Target1.getImplicitSetLabel(".5.2.");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "_\\\"\\\"" + "'", str19.equals("_\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_tset.5.2." + "'", str21.equals("_tset.5.2."));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(ruleFunction20);
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
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
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
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        java.lang.String str18 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str19 = python3Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"4.5.2.1Context\"" + "'", str13.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"tset4.5.2.\"Context" + "'", str16.equals("\"tset4.5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\35" + "'", str18.equals("\\35"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Python3" + "'", str19.equals("Python3"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset@");
        try {
            java.lang.String str13 = python3Target1.getElementListName("_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "__tset@" + "'", str11.equals("__tset@"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_\"\\\\\\\"\\\\\\\"\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0" + "'", str8.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\35" + "'", str10.equals("\\35"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_tset_\"\\\\\\\"\\\\\\\"\"ContextContext" + "'", str12.equals("_tset_\"\\\\\\\"\\\\\\\"\"ContextContext"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        org.antlr.v4.tool.Rule rule12 = null;
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"tset4.5.2.\"Context" + "'", str11.equals("\"tset4.5.2.\"Context"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        boolean boolean6 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.wantsBaseListener();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar7 = null;
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\".5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        try {
            java.lang.String str14 = python3Target1.getElementListName("___tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\".5.2.\"Context" + "'", str8.equals("\".5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12.equals("\"0Contex\""));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getListLabel("hi!");
        boolean boolean5 = python3Target1.templatesExist();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        boolean boolean19 = python3Target1.wantsBaseVisitor();
        java.lang.String str20 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar4 = null;
        try {
            java.lang.String str6 = python3Target1.getTokenTypeAsTargetLabel(grammar4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.", true);
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("__tset\\64Context");
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0Context" + "'", str8.equals("\\0Context"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\".5.2.\"" + "'", str11.equals("\".5.2.\""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "__tset\\64ContextContext" + "'", str13.equals("__tset\\64ContextContext"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "a" + "'", str15.equals("a"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"\\\"set4.5.2\\\"\"");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "__\"\\\"set4.5.2\\\"\"" + "'", str6.equals("__\"\\\"set4.5.2\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet19 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target1.getCodeGenerator();
        try {
            java.lang.String str22 = python3Target1.getImplicitTokenLabel("");
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
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        java.lang.String str10 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python3" + "'", str10.equals("Python3"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseListener();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "4.5.2.1Context", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.getListLabel("");
        java.lang.String str17 = python3Target13.encodeIntAsCharEscape(0);
        java.lang.String str20 = python3Target13.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str22 = python3Target13.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet23 = python3Target13.getBadWords();
        java.lang.Class<?> wildcardClass24 = python3Target13.getClass();
        boolean boolean25 = python3Target13.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        java.lang.String str30 = python3Target28.getListLabel("");
        java.lang.String str32 = python3Target28.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target28.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target28.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "_tset4.5.2.1", false);
        boolean boolean38 = python3Target28.templatesExist();
        java.lang.String str40 = python3Target28.getTargetStringLiteralFromString("4.5.2.1Context");
        java.lang.String str42 = python3Target28.getImplicitSetLabel("@");
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator44);
        java.lang.String str46 = python3Target45.getVersion();
        java.lang.Class<?> wildcardClass47 = python3Target45.getClass();
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python3Target45.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python3Target28.getTokenTypesAsTargetLabels(grammar43, intArray49);
        java.lang.String[] strArray52 = python3Target13.getTokenTypesAsTargetLabels(grammar26, intArray49);
        java.lang.String[] strArray53 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray49);
        java.lang.String str55 = python3Target1.getImplicitSetLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".5.2.1Contex" + "'", str8.equals(".5.2.1Contex"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\\0" + "'", str17.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"4.5.2.1\"" + "'", str20.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\"" + "'", str22.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\\0" + "'", str32.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "tset4.5.2." + "'", str37.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\"4.5.2.1Context\"" + "'", str40.equals("\"4.5.2.1Context\""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "_tset@" + "'", str42.equals("_tset@"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "4.5.2.1" + "'", str46.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str55.equals("_tset\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet12 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = new int[] {};
        java.lang.String[] strArray6 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray5);
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\".5.2.\"");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\".5.2.\"Context" + "'", str8.equals("\".5.2.\"Context"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset4.5.2.1", false);
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tset4.5.2." + "'", str10.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("__tset4.5.2.1ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("\"__tset\\\\1\"Context");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "_tset\"__tset\\\\1\"Context" + "'", str9.equals("_tset\"__tset\\\\1\"Context"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context", false);
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", false);
        org.antlr.v4.tool.Grammar grammar15 = null;
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\\"tset4.5.2.\\\"Context" + "'", str11.equals("\\\"tset4.5.2.\\\"Context"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"" + "'", str14.equals("\\\"\\\\\\\"hi!\\\\\\\"\\\""));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("_tset\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        try {
            java.lang.String str11 = python3Target1.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"Python3\"" + "'", str7.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context" + "'", str9.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"Context"));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str7 = python3Target1.getListLabel("");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        java.lang.String str9 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Python3" + "'", str9.equals("Python3"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "4.5.2.1", false);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        int int12 = python3Target1.getInlineTestSetWordSize();
        try {
            java.lang.String str14 = python3Target1.getElementName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2." + "'", str9.equals(".5.2."));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", false);
        int int21 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str23 = python3Target1.encodeIntAsCharEscape((int) 'a');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "a" + "'", str23.equals("a"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str3 = python3Target1.getVersion();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getListLabel("_\\64");
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_\\64" + "'", str6.equals("_\\64"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
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
        java.lang.String str29 = python3Target1.getLanguage();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Python3" + "'", str29.equals("Python3"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("__tset4.5.2.1");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"set4.5.2\"");
        try {
            java.lang.String str13 = python3Target1.getElementListName("\"tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "___tset4.5.2.1" + "'", str9.equals("___tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\\"set4.5.2\\\"\"" + "'", str11.equals("\"\\\"set4.5.2\\\"\""));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\\1", false);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\\\1" + "'", str18.equals("\\\\1"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getLanguage();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python3" + "'", str4.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1Contex", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "_tset4.5.2.1Contex" + "'", str6.equals("_tset4.5.2.1Contex"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\\1\"" + "'", str9.equals("\"\\\\1\""));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("\"\\\\64\"");
        java.lang.String str23 = python3Target1.getTargetStringLiteralFromString("_\"\"", false);
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("\"d\"");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tset4.5.2." + "'", str12.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\\"\\\"" + "'", str15.equals("\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Python3" + "'", str16.equals("Python3"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"Python3\"" + "'", str18.equals("\"Python3\""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\\\"\\\\\\\\64\\\"\"" + "'", str20.equals("\"\\\"\\\\\\\\64\\\"\""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "_\\\"\\\"" + "'", str23.equals("_\\\"\\\""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"\\\"d\\\"\"" + "'", str25.equals("\"\\\"d\\\"\""));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        java.lang.String str12 = python3Target1.getLanguage();
        boolean boolean13 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Python3" + "'", str12.equals("Python3"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_\\64");
        try {
            java.lang.String str13 = python3Target1.getElementListName("tset\\\"_tset_tset4.5.2.\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1Context" + "'", str8.equals("4.5.2.1Context"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4.5.2.1" + "'", str9.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "_tset_\\64" + "'", str11.equals("_tset_\\64"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getListLabel("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_tset4.5.2.1" + "'", str5.equals("_tset4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"" + "'", str8.equals("\"\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        java.util.Set<java.lang.String> strSet17 = python3Target1.getBadWords();
        try {
            java.lang.String str19 = python3Target1.getImplicitTokenLabel("4.5.2.1ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "_tset" + "'", str15.equals("_tset"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
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
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\"tset4.5.2.\\\"Context\"", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".5.2.Context" + "'", str14.equals(".5.2.Context"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!Contex" + "'", str18.equals("i!Contex"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"" + "'", str21.equals("\\\"_tset\\\\\\\"tset4.5.2.\\\\\\\"Context\\\""));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName(".5.2.1Contex");
        java.lang.String str10 = python3Target1.getLanguage();
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("\"__tset\\\\1\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".5.2.1ContexContext" + "'", str9.equals(".5.2.1ContexContext"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Python3" + "'", str10.equals("Python3"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_tset4.5.2.1", false);
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.5.2.1" + "'", str2.equals("4.5.2.1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tset4.5.2." + "'", str6.equals("tset4.5.2."));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
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
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
}

