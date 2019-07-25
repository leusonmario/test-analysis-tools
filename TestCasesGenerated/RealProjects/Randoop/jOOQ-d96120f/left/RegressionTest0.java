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
        org.jooq.Field<java.lang.Boolean> booleanField0 = null;
        try {
            org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not(booleanField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression0 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray2 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray3 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray2;
        wildcardCommonTableExpressionArray3[0] = wildcardCommonTableExpression0;
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression8 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray10 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray11 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray10;
        wildcardCommonTableExpressionArray11[0] = wildcardCommonTableExpression8;
        org.jooq.WithStep withStep14 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray11);
        org.jooq.CommonTableExpression[] commonTableExpressionArray16 = new org.jooq.CommonTableExpression[0];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray17 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray16;
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression18 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray20 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray21 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray20;
        wildcardCommonTableExpressionArray21[0] = wildcardCommonTableExpression18;
        org.jooq.WithStep withStep24 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray21);
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression25 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray27 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray28 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray27;
        wildcardCommonTableExpressionArray28[0] = wildcardCommonTableExpression25;
        org.jooq.WithStep withStep31 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray28);
        try {
            org.jooq.Row7<org.jooq.CommonTableExpression<?>[], java.io.Serializable, java.lang.Object, org.jooq.WithStep, org.jooq.CommonTableExpression<?>[], org.jooq.CommonTableExpression<?>[], org.jooq.QueryPart> wildcardCommonTableExpressionArrayRow7_32 = org.jooq.impl.DSL.row(wildcardCommonTableExpressionArray3, (java.io.Serializable) (byte) 10, (java.lang.Object) (byte) 1, withStep14, (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray16, wildcardCommonTableExpressionArray21, (org.jooq.QueryPart) withStep31);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.CommonTableExpression is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(commonTableExpressionArray2);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray3);
        org.junit.Assert.assertNotNull(commonTableExpressionArray10);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray11);
        org.junit.Assert.assertNotNull(withStep14);
        org.junit.Assert.assertNotNull(commonTableExpressionArray16);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray17);
        org.junit.Assert.assertNotNull(commonTableExpressionArray20);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray21);
        org.junit.Assert.assertNotNull(withStep24);
        org.junit.Assert.assertNotNull(commonTableExpressionArray27);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray28);
        org.junit.Assert.assertNotNull(withStep31);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jooq.Name name0 = null;
        try {
            org.jooq.Schema schema1 = org.jooq.impl.DSL.schema(name0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.jooq.Name name6 = org.jooq.impl.DSL.name(strArray5);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence9 = org.jooq.impl.DSL.sequence("");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField16 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField19);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.jooq.Name name22 = org.jooq.impl.DSL.name(strArray21);
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_48 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField23, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField32, strField33, "", (org.jooq.GroupField) strField38, strField45, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep49 = org.jooq.impl.DSL.lag(strField33);
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField56 = null;
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.lpad(strField56, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField60 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.lpad(strField60, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField65 = null;
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.lpad(strField65, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField69 = null;
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.lpad(strField69, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_75 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField50, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField59, strField60, "", (org.jooq.GroupField) strField65, strField72, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        try {
            org.jooq.Row11<org.jooq.SelectField<java.lang.String>, org.jooq.Name, java.lang.String, org.jooq.Sequence<java.math.BigInteger>, java.lang.String[], java.lang.String, org.jooq.Field<java.lang.String>, java.io.Serializable, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row, java.lang.Object> strSelectFieldRow11_77 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField4, name6, "hi!", bigIntegerSequence9, strArray14, "hi!", strField19, (java.io.Serializable) name22, strWindowIgnoreNullsStep49, (org.jooq.Row) strSelectFieldRow10_75, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.NameImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(bigIntegerSequence9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_48);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep49);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_75);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.month(date0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.coth((java.lang.Number) 0);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connection0, sQLDialect1, settings2);
        org.junit.Assert.assertNotNull(dSLContext3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jooq.Table<org.jooq.Record> recordTable0 = org.jooq.impl.DSL.dual();
        org.junit.Assert.assertNotNull(recordTable0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connection0, sQLDialect1, settings2);
        org.jooq.Scope[] scopeArray4 = new org.jooq.Scope[] { dSLContext3 };
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.Scope>> scopeRecord1QuantifiedSelect5 = org.jooq.impl.DSL.all(scopeArray4);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Scope is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dSLContext3);
        org.junit.Assert.assertNotNull(scopeArray4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jooq.Row2<java.io.Serializable, org.jooq.Sequence<java.math.BigInteger>> serializableRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<java.io.Serializable, org.jooq.Sequence<java.math.BigInteger>>[] serializableRow2Array3 = (org.jooq.Row2<java.io.Serializable, org.jooq.Sequence<java.math.BigInteger>>[]) row2Array2;
        serializableRow2Array3[0] = serializableRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<java.io.Serializable, org.jooq.Sequence<java.math.BigInteger>>> serializableRecord2Table6 = org.jooq.impl.DSL.values(serializableRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(serializableRow2Array3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jooq.Row6<org.jooq.WindowOverStep<java.lang.String>, org.jooq.Query, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strWindowOverStepRow6_0 = null;
        org.jooq.Row6[] row6Array2 = new org.jooq.Row6[1];
        @SuppressWarnings("unchecked") org.jooq.Row6<org.jooq.WindowOverStep<java.lang.String>, org.jooq.Query, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[] strWindowOverStepRow6Array3 = (org.jooq.Row6<org.jooq.WindowOverStep<java.lang.String>, org.jooq.Query, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row6Array2;
        strWindowOverStepRow6Array3[0] = strWindowOverStepRow6_0;
        try {
            org.jooq.Table<org.jooq.Record6<org.jooq.WindowOverStep<java.lang.String>, org.jooq.Query, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>> strWindowOverStepRecord6Table6 = org.jooq.impl.DSL.values(strWindowOverStepRow6Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row6Array2);
        org.junit.Assert.assertNotNull(strWindowOverStepRow6Array3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        javax.sql.DataSource dataSource0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(dataSource0, sQLDialect1, settings2);
        org.junit.Assert.assertNotNull(dSLContext3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jooq.Row2<org.jooq.Table<?>, java.lang.Comparable<java.lang.String>> wildcardTableRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<org.jooq.Table<?>, java.lang.Comparable<java.lang.String>>[] wildcardTableRow2Array3 = (org.jooq.Row2<org.jooq.Table<?>, java.lang.Comparable<java.lang.String>>[]) row2Array2;
        wildcardTableRow2Array3[0] = wildcardTableRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.Table<?>, java.lang.Comparable<java.lang.String>>> wildcardTableRecord2Table6 = org.jooq.impl.DSL.values(wildcardTableRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(wildcardTableRow2Array3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jooq.DropIndexFinalStep dropIndexFinalStep1 = org.jooq.impl.DSL.dropIndex("hi!");
        org.jooq.Query[] queryArray2 = new org.jooq.Query[] { dropIndexFinalStep1 };
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.Query>> queryRecord1QuantifiedSelect3 = org.jooq.impl.DSL.all(queryArray2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Query is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dropIndexFinalStep1);
        org.junit.Assert.assertNotNull(queryArray2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.charLength("");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.pi();
        org.junit.Assert.assertNotNull(bigDecimalField0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenPreceding(10);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String[] strArray0 = null;
        try {
            org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.tableByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Table<org.jooq.Record> recordTable2 = org.jooq.impl.DSL.table(name1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jooq.Row8<org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row, java.lang.Object, java.lang.Object, org.jooq.Field<?>[], org.jooq.GroupField> windowSpecificationRowsAndStepRow8_0 = null;
        org.jooq.Row8[] row8Array2 = new org.jooq.Row8[1];
        @SuppressWarnings("unchecked") org.jooq.Row8<org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row, java.lang.Object, java.lang.Object, org.jooq.Field<?>[], org.jooq.GroupField>[] windowSpecificationRowsAndStepRow8Array3 = (org.jooq.Row8<org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row, java.lang.Object, java.lang.Object, org.jooq.Field<?>[], org.jooq.GroupField>[]) row8Array2;
        windowSpecificationRowsAndStepRow8Array3[0] = windowSpecificationRowsAndStepRow8_0;
        try {
            org.jooq.Table<org.jooq.Record8<org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row, java.lang.Object, java.lang.Object, org.jooq.Field<?>[], org.jooq.GroupField>> windowSpecificationRowsAndStepRecord8Table6 = org.jooq.impl.DSL.values(windowSpecificationRowsAndStepRow8Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row8Array2);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStepRow8Array3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField2 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestamp1);
        org.junit.Assert.assertNotNull(dayToSecondField2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep1 = org.jooq.impl.DSL.alterSequence("");
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jooq.Row18[] row18Array1 = new org.jooq.Row18[0];
        @SuppressWarnings("unchecked") org.jooq.Row18<org.jooq.Table<?>, java.lang.CharSequence, org.jooq.Field<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Scope, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.io.Serializable, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition[], org.jooq.DSLContext, org.jooq.Keyword>[] wildcardTableRow18Array2 = (org.jooq.Row18<org.jooq.Table<?>, java.lang.CharSequence, org.jooq.Field<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Scope, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.io.Serializable, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition[], org.jooq.DSLContext, org.jooq.Keyword>[]) row18Array1;
        try {
            org.jooq.Table<org.jooq.Record18<org.jooq.Table<?>, java.lang.CharSequence, org.jooq.Field<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Scope, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.io.Serializable, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition[], org.jooq.DSLContext, org.jooq.Keyword>> wildcardTableRecord18Table3 = org.jooq.impl.DSL.values((org.jooq.Row18<org.jooq.Table<?>, java.lang.CharSequence, org.jooq.Field<?>[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Scope, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.io.Serializable, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition[], org.jooq.DSLContext, org.jooq.Keyword>[]) row18Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row18Array1);
        org.junit.Assert.assertNotNull(wildcardTableRow18Array2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) (-1));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jooq.Row5[] row5Array1 = new org.jooq.Row5[0];
        @SuppressWarnings("unchecked") org.jooq.Row5<java.lang.Comparable<java.lang.String>, java.io.Serializable, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object>[] strComparableRow5Array2 = (org.jooq.Row5<java.lang.Comparable<java.lang.String>, java.io.Serializable, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object>[]) row5Array1;
        try {
            org.jooq.Table<org.jooq.Record5<java.lang.Comparable<java.lang.String>, java.io.Serializable, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object>> strComparableRecord5Table3 = org.jooq.impl.DSL.values(strComparableRow5Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row5Array1);
        org.junit.Assert.assertNotNull(strComparableRow5Array2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        try {
            org.jooq.Field<org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord12Field79 = org.jooq.impl.DSL.field(strRow12_78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jooq.Row15[] row15Array1 = new org.jooq.Row15[0];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.GroupField, org.jooq.Condition[], org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Field<?>[], org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectField<java.lang.String>, org.jooq.SelectField<java.lang.String>, java.lang.String[], java.lang.String[], java.lang.Comparable<java.lang.String>, org.jooq.Attachable>[] groupFieldRow15Array2 = (org.jooq.Row15<org.jooq.GroupField, org.jooq.Condition[], org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Field<?>[], org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectField<java.lang.String>, org.jooq.SelectField<java.lang.String>, java.lang.String[], java.lang.String[], java.lang.Comparable<java.lang.String>, org.jooq.Attachable>[]) row15Array1;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.GroupField, org.jooq.Condition[], org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Field<?>[], org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectField<java.lang.String>, org.jooq.SelectField<java.lang.String>, java.lang.String[], java.lang.String[], java.lang.Comparable<java.lang.String>, org.jooq.Attachable>> groupFieldRecord15Table3 = org.jooq.impl.DSL.values((org.jooq.Row15<org.jooq.GroupField, org.jooq.Condition[], org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Field<?>[], org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectField<java.lang.String>, org.jooq.SelectField<java.lang.String>, java.lang.String[], java.lang.String[], java.lang.Comparable<java.lang.String>, org.jooq.Attachable>[]) row15Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row15Array1);
        org.junit.Assert.assertNotNull(groupFieldRow15Array2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Properties properties1 = null;
        try {
            org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using("hi!", properties1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for hi!");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jooq.SQLDialect sQLDialect0 = null;
        org.jooq.conf.Settings settings1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(sQLDialect0, settings1);
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jooq.Row2<org.jooq.DropIndexFinalStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>> dropIndexFinalStepRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<org.jooq.DropIndexFinalStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[] dropIndexFinalStepRow2Array3 = (org.jooq.Row2<org.jooq.DropIndexFinalStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[]) row2Array2;
        dropIndexFinalStepRow2Array3[0] = dropIndexFinalStepRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.DropIndexFinalStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>> dropIndexFinalStepRecord2Table6 = org.jooq.impl.DSL.values(dropIndexFinalStepRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(dropIndexFinalStepRow2Array3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Date date0 = null;
        org.jooq.DatePart datePart1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.extract(date0, datePart1);
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jooq.Row4<org.jooq.Row, org.jooq.Field<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Scope> rowRow4_0 = null;
        org.jooq.Row4[] row4Array2 = new org.jooq.Row4[1];
        @SuppressWarnings("unchecked") org.jooq.Row4<org.jooq.Row, org.jooq.Field<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Scope>[] rowRow4Array3 = (org.jooq.Row4<org.jooq.Row, org.jooq.Field<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Scope>[]) row4Array2;
        rowRow4Array3[0] = rowRow4_0;
        try {
            org.jooq.Table<org.jooq.Record4<org.jooq.Row, org.jooq.Field<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Scope>> rowRecord4Table6 = org.jooq.impl.DSL.values(rowRow4Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row4Array2);
        org.junit.Assert.assertNotNull(rowRow4Array3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jooq.DropIndexFinalStep dropIndexFinalStep1 = org.jooq.impl.DSL.dropIndex("hi!");
        try {
            org.jooq.Param<org.jooq.DropIndexFinalStep> dropIndexFinalStepParam2 = org.jooq.impl.DSL.value(dropIndexFinalStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.DropIndexImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dropIndexFinalStep1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jooq.Row18<java.lang.Object, java.lang.String[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Name, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], java.lang.Object[], org.jooq.Field<?>[], org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.FieldLike, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>> objRow18_0 = null;
        org.jooq.Row18[] row18Array2 = new org.jooq.Row18[1];
        @SuppressWarnings("unchecked") org.jooq.Row18<java.lang.Object, java.lang.String[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Name, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], java.lang.Object[], org.jooq.Field<?>[], org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.FieldLike, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>>[] objRow18Array3 = (org.jooq.Row18<java.lang.Object, java.lang.String[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Name, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], java.lang.Object[], org.jooq.Field<?>[], org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.FieldLike, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>>[]) row18Array2;
        objRow18Array3[0] = objRow18_0;
        try {
            org.jooq.Table<org.jooq.Record18<java.lang.Object, java.lang.String[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Name, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], java.lang.Object[], org.jooq.Field<?>[], org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.FieldLike, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>>> objRecord18Table6 = org.jooq.impl.DSL.values(objRow18Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row18Array2);
        org.junit.Assert.assertNotNull(objRow18Array3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jooq.Operator operator0 = null;
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] {};
        org.jooq.Condition condition2 = org.jooq.impl.DSL.or(conditionArray1);
        try {
            org.jooq.Condition condition3 = org.jooq.impl.DSL.condition(operator0, conditionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The argument 'operator' must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(conditionArray1);
        org.junit.Assert.assertNotNull(condition2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.junit.Assert.assertNotNull(bigDecimalField0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jooq.Row3[] row3Array1 = new org.jooq.Row3[0];
        @SuppressWarnings("unchecked") org.jooq.Row3<org.jooq.WithStep, org.jooq.DropTableStep, org.jooq.CommonTableExpression<?>[]>[] withStepRow3Array2 = (org.jooq.Row3<org.jooq.WithStep, org.jooq.DropTableStep, org.jooq.CommonTableExpression<?>[]>[]) row3Array1;
        try {
            org.jooq.Table<org.jooq.Record3<org.jooq.WithStep, org.jooq.DropTableStep, org.jooq.CommonTableExpression<?>[]>> withStepRecord3Table3 = org.jooq.impl.DSL.values(withStepRow3Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row3Array1);
        org.junit.Assert.assertNotNull(withStepRow3Array2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.AggregateFilterStep[] aggregateFilterStepArray5 = new org.jooq.AggregateFilterStep[1];
        @SuppressWarnings("unchecked") org.jooq.AggregateFilterStep<java.lang.String>[] strAggregateFilterStepArray6 = (org.jooq.AggregateFilterStep<java.lang.String>[]) aggregateFilterStepArray5;
        strAggregateFilterStepArray6[0] = strAggregateFunction3;
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.AggregateFilterStep<java.lang.String>>> strAggregateFilterStepRecord1QuantifiedSelect9 = org.jooq.impl.DSL.any(strAggregateFilterStepArray6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.AggregateFilterStep is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(aggregateFilterStepArray5);
        org.junit.Assert.assertNotNull(strAggregateFilterStepArray6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.sign((java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jooq.Row13<java.io.Serializable, org.jooq.DDLQuery, org.jooq.Table<?>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], java.lang.Object, org.jooq.Attachable, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, java.lang.Object> serializableRow13_0 = null;
        org.jooq.Row13[] row13Array2 = new org.jooq.Row13[1];
        @SuppressWarnings("unchecked") org.jooq.Row13<java.io.Serializable, org.jooq.DDLQuery, org.jooq.Table<?>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], java.lang.Object, org.jooq.Attachable, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, java.lang.Object>[] serializableRow13Array3 = (org.jooq.Row13<java.io.Serializable, org.jooq.DDLQuery, org.jooq.Table<?>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], java.lang.Object, org.jooq.Attachable, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, java.lang.Object>[]) row13Array2;
        serializableRow13Array3[0] = serializableRow13_0;
        try {
            org.jooq.Table<org.jooq.Record13<java.io.Serializable, org.jooq.DDLQuery, org.jooq.Table<?>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], java.lang.Object, org.jooq.Attachable, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, java.lang.Object>> serializableRecord13Table6 = org.jooq.impl.DSL.values(serializableRow13Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row13Array2);
        org.junit.Assert.assertNotNull(serializableRow13Array3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep7 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jooq.Query query1 = org.jooq.impl.DSL.query("");
        org.junit.Assert.assertNotNull(query1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.two();
        org.junit.Assert.assertNotNull(intField0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jooq.Case case0 = org.jooq.impl.DSL.decode();
        org.junit.Assert.assertNotNull(case0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tan((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jooq.Row15<org.jooq.Keyword, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.RowN> keywordRow15_0 = null;
        org.jooq.Row15[] row15Array2 = new org.jooq.Row15[1];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.Keyword, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.RowN>[] keywordRow15Array3 = (org.jooq.Row15<org.jooq.Keyword, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.RowN>[]) row15Array2;
        keywordRow15Array3[0] = keywordRow15_0;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.Keyword, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CommonTableExpression<?>[], org.jooq.ArrayAggOrderByStep<java.lang.String[]>, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.RowN>> keywordRecord15Table6 = org.jooq.impl.DSL.values(keywordRow15Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row15Array2);
        org.junit.Assert.assertNotNull(keywordRow15Array3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cosh((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Field<java.lang.Object> objField2 = org.jooq.impl.DSL.field(name1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.day(date0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.cumeDist();
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jooq.Field<java.sql.Timestamp> timestampField0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField3 = org.jooq.impl.DSL.timestampAdd(timestampField0, (java.lang.Number) 10, datePart2);
        java.sql.Timestamp timestamp4 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField5 = org.jooq.impl.DSL.timestampDiff(timestampField0, timestamp4);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(dayToSecondField5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Number number0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cosh(number0);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.length("hi!");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jooq.Field<java.lang.Object> objField0 = org.jooq.impl.DSL.defaultValue();
        org.junit.Assert.assertNotNull(objField0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.length(strField0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Number number0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sinh(number0);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.year(date0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(100, 0);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenCurrentRow();
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.Integer> intField80 = org.jooq.impl.DSL.position(strField11, "");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(intField80);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.denseRank();
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) 0L);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.rank();
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.octetLength("");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jooq.Row6[] row6Array1 = new org.jooq.Row6[0];
        @SuppressWarnings("unchecked") org.jooq.Row6<org.jooq.Attachable, org.jooq.WindowSpecificationRowsAndStep, java.lang.CharSequence, org.jooq.Field<?>[], java.lang.Object[], java.lang.Object>[] attachableRow6Array2 = (org.jooq.Row6<org.jooq.Attachable, org.jooq.WindowSpecificationRowsAndStep, java.lang.CharSequence, org.jooq.Field<?>[], java.lang.Object[], java.lang.Object>[]) row6Array1;
        try {
            org.jooq.Table<org.jooq.Record6<org.jooq.Attachable, org.jooq.WindowSpecificationRowsAndStep, java.lang.CharSequence, org.jooq.Field<?>[], java.lang.Object[], java.lang.Object>> attachableRecord6Table3 = org.jooq.impl.DSL.values((org.jooq.Row6<org.jooq.Attachable, org.jooq.WindowSpecificationRowsAndStep, java.lang.CharSequence, org.jooq.Field<?>[], java.lang.Object[], java.lang.Object>[]) row6Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row6Array1);
        org.junit.Assert.assertNotNull(attachableRow6Array2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.nvl(strField2, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField4, 0);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep7 = org.jooq.impl.DSL.selectZero();
        try {
            org.jooq.Row3<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.lang.String>, org.jooq.Attachable> intRecord1IterableRow3_8 = org.jooq.impl.DSL.row((java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, strField4, (org.jooq.Attachable) intRecord1SelectSelectStep7);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_0 = null;
        try {
            org.jooq.Field<org.jooq.Record10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>> strSelectFieldRecord10Field1 = org.jooq.impl.DSL.field(strSelectFieldRow10_0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jooq.Row13<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration, org.jooq.Field<?>[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>, org.jooq.RowN, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> intRecord1SelectDistinctOnStepRow13_0 = null;
        org.jooq.Row13[] row13Array2 = new org.jooq.Row13[1];
        @SuppressWarnings("unchecked") org.jooq.Row13<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration, org.jooq.Field<?>[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>, org.jooq.RowN, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[] record1SelectDistinctOnStepRow13Array3 = (org.jooq.Row13<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration, org.jooq.Field<?>[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>, org.jooq.RowN, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row13Array2;
        record1SelectDistinctOnStepRow13Array3[0] = intRecord1SelectDistinctOnStepRow13_0;
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration, org.jooq.Field<?>[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>, org.jooq.RowN, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>> record1SelectDistinctOnStepRecord13Table6 = org.jooq.impl.DSL.values(record1SelectDistinctOnStepRow13Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row13Array2);
        org.junit.Assert.assertNotNull(record1SelectDistinctOnStepRow13Array3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jooq.Field<java.sql.Time> timeField0 = org.jooq.impl.DSL.currentTime();
        org.junit.Assert.assertNotNull(timeField0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep1 = org.jooq.impl.DSL.dropSequence("hi!");
        org.junit.Assert.assertNotNull(dropSequenceFinalStep1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jooq.Operator operator0 = null;
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition("hi!");
        org.jooq.Condition[] conditionArray3 = new org.jooq.Condition[] {};
        org.jooq.Condition condition4 = org.jooq.impl.DSL.or(conditionArray3);
        org.jooq.Condition condition5 = org.jooq.impl.DSL.or(conditionArray3);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep6 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition7 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep6);
        org.jooq.Condition[] conditionArray8 = new org.jooq.Condition[] { condition2, condition5, condition7 };
        try {
            org.jooq.Condition condition9 = org.jooq.impl.DSL.condition(operator0, conditionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The argument 'operator' must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(conditionArray3);
        org.junit.Assert.assertNotNull(condition4);
        org.junit.Assert.assertNotNull(condition5);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep6);
        org.junit.Assert.assertNotNull(condition7);
        org.junit.Assert.assertNotNull(conditionArray8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.sign((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence5 = org.jooq.impl.DSL.sequenceByName(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : \"hi!\".\"hi!\".\"hi!\".\"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.connectByRoot(strField5);
        org.jooq.Field<java.lang.Integer> intField10 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.space(intField10);
        org.jooq.Field<java.lang.String> strField13 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.concat("hi!", strField13);
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField31 = null;
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.lpad(strField31, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField36 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField40 = null;
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.lpad(strField40, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_46 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField21, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField30, strField31, "", (org.jooq.GroupField) strField36, strField43, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField47 = null;
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.space(intField47);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.ltrim(strField48);
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", strField51);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.lpad(strField55, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField60 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.lpad(strField60, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.concat("hi!", strField60);
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.lpad(strField64, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField72 = null;
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.space(intField72);
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.ltrim(strField73);
        org.jooq.Field<java.lang.Integer> intField75 = null;
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.space(intField75);
        org.jooq.Field<java.lang.String> strField77 = null;
        org.jooq.Field<java.lang.String> strField80 = org.jooq.impl.DSL.lpad(strField77, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField81 = null;
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.lpad(strField81, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField84);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep87 = org.jooq.impl.DSL.lag(strField84, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_88 = org.jooq.impl.DSL.row(strField11, strField13, strField19, strField21, strField48, strField58, strField64, strField71, strField74, strField76, strField80, strField84);
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.lpad(strField13, (int) (short) 100, '4');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep92 = org.jooq.impl.DSL.lag(strField5, (int) ' ', strField13);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strField80);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strField85);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep87);
        org.junit.Assert.assertNotNull(strRow12_88);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep92);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jooq.Param<java.lang.Object> objParam0 = org.jooq.impl.DSL.param();
        org.junit.Assert.assertNotNull(objParam0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jooq.Row17[] row17Array1 = new org.jooq.Row17[0];
        @SuppressWarnings("unchecked") org.jooq.Row17<java.lang.Class<?>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.DropSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectField<java.lang.String>>[] wildcardClassRow17Array2 = (org.jooq.Row17<java.lang.Class<?>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.DropSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectField<java.lang.String>>[]) row17Array1;
        try {
            org.jooq.Table<org.jooq.Record17<java.lang.Class<?>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.DropSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectField<java.lang.String>>> wildcardClassRecord17Table3 = org.jooq.impl.DSL.values((org.jooq.Row17<java.lang.Class<?>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.DropSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectField<java.lang.String>>[]) row17Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row17Array1);
        org.junit.Assert.assertNotNull(wildcardClassRow17Array2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = null;
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField5 = org.jooq.impl.DSL.timestampAdd(timestampField2, (java.lang.Number) 10, datePart4);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField6 = org.jooq.impl.DSL.timestampDiff(timestamp1, timestampField5);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField7 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestampField5);
        org.junit.Assert.assertNotNull(timestampField5);
        org.junit.Assert.assertNotNull(dayToSecondField6);
        org.junit.Assert.assertNotNull(dayToSecondField7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) (byte) -1, (java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jooq.Row8[] row8Array1 = new org.jooq.Row8[0];
        @SuppressWarnings("unchecked") org.jooq.Row8<org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SQL, org.jooq.WindowSpecificationRowsAndStep, java.lang.String[]>[] recordCreateTableAsStepRow8Array2 = (org.jooq.Row8<org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SQL, org.jooq.WindowSpecificationRowsAndStep, java.lang.String[]>[]) row8Array1;
        try {
            org.jooq.Table<org.jooq.Record8<org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SQL, org.jooq.WindowSpecificationRowsAndStep, java.lang.String[]>> recordCreateTableAsStepRecord8Table3 = org.jooq.impl.DSL.values((org.jooq.Row8<org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SQL, org.jooq.WindowSpecificationRowsAndStep, java.lang.String[]>[]) row8Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row8Array1);
        org.junit.Assert.assertNotNull(recordCreateTableAsStepRow8Array2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jooq.Row1[] row1Array1 = new org.jooq.Row1[0];
        @SuppressWarnings("unchecked") org.jooq.Row1<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[] record1SelectGroupByStepRow1Array2 = (org.jooq.Row1<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[]) row1Array1;
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>> record1SelectGroupByStepRecord1Table3 = org.jooq.impl.DSL.values((org.jooq.Row1<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[]) row1Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row1Array1);
        org.junit.Assert.assertNotNull(record1SelectGroupByStepRow1Array2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jooq.Configuration configuration0 = null;
        org.jooq.DSLContext dSLContext1 = org.jooq.impl.DSL.using(configuration0);
        org.junit.Assert.assertNotNull(dSLContext1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jooq.Row20[] row20Array1 = new org.jooq.Row20[0];
        @SuppressWarnings("unchecked") org.jooq.Row20<org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WithStep, org.jooq.GroupField, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowSpecificationRowsStep, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Object[], org.jooq.Field<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition, org.jooq.Keyword, org.jooq.DropTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.AnnotatedElement, org.jooq.WindowSpecification, org.jooq.WindowSpecification, org.jooq.AlterTableStep>[] record1SelectRow20Array2 = (org.jooq.Row20<org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WithStep, org.jooq.GroupField, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowSpecificationRowsStep, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Object[], org.jooq.Field<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition, org.jooq.Keyword, org.jooq.DropTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.AnnotatedElement, org.jooq.WindowSpecification, org.jooq.WindowSpecification, org.jooq.AlterTableStep>[]) row20Array1;
        try {
            org.jooq.Table<org.jooq.Record20<org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WithStep, org.jooq.GroupField, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowSpecificationRowsStep, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Object[], org.jooq.Field<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Condition, org.jooq.Keyword, org.jooq.DropTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.AnnotatedElement, org.jooq.WindowSpecification, org.jooq.WindowSpecification, org.jooq.AlterTableStep>> record1SelectRecord20Table3 = org.jooq.impl.DSL.values(record1SelectRow20Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row20Array1);
        org.junit.Assert.assertNotNull(record1SelectRow20Array2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jooq.DropIndexFinalStep dropIndexFinalStep1 = org.jooq.impl.DSL.dropIndexIfExists("");
        org.junit.Assert.assertNotNull(dropIndexFinalStep1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence2 = org.jooq.impl.DSL.sequence(name1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Time> timeField1 = org.jooq.impl.DSL.time(date0);
        org.junit.Assert.assertNotNull(timeField1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.trunc(timestamp0);
        java.sql.Timestamp timestamp2 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField3 = org.jooq.impl.DSL.timestampDiff(timestampField1, timestamp2);
        org.junit.Assert.assertNotNull(timestampField1);
        org.junit.Assert.assertNotNull(dayToSecondField3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.connectByRoot(strField5);
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.space(intField9);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.ltrim(strField10);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction12 = org.jooq.impl.DSL.minDistinct(strField10);
        org.jooq.Field<java.lang.String> strField13 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField28 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField32 = null;
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.lpad(strField32, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_38 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField13, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField22, strField23, "", (org.jooq.GroupField) strField28, strField35, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction12, strField35);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.left(strField45, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.right(strField45, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.escape(strField45, '4');
        org.jooq.Field<java.lang.String> strField52 = null;
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.lpad(strField52, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField55);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep58 = org.jooq.impl.DSL.lag(strField55, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.mid(strField55, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.nullif(strField64, "hi!");
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField73 = null;
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.lpad(strField73, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField77 = null;
        org.jooq.Field<java.lang.String> strField80 = org.jooq.impl.DSL.lpad(strField77, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField82 = null;
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.lpad(strField82, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField86 = null;
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.lpad(strField86, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_92 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField67, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField76, strField77, "", (org.jooq.GroupField) strField82, strField89, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField93 = null;
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.space(intField93);
        org.jooq.Field<java.lang.String> strField95 = org.jooq.impl.DSL.ltrim(strField94);
        org.jooq.Field<java.lang.String> strField98 = org.jooq.impl.DSL.lpad(strField94, 10, ' ');
        try {
            org.jooq.SelectSelectStep<org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord7SelectSelectStep99 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField5, (org.jooq.SelectField<java.lang.String>) strField35, (org.jooq.SelectField<java.lang.String>) strField51, (org.jooq.SelectField<java.lang.String>) strField61, (org.jooq.SelectField<java.lang.String>) strField66, (org.jooq.SelectField<java.lang.String>) strField67, (org.jooq.SelectField<java.lang.String>) strField98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strAggregateFunction12);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep58);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strField80);
        org.junit.Assert.assertNotNull(strField85);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_92);
        org.junit.Assert.assertNotNull(strField94);
        org.junit.Assert.assertNotNull(strField95);
        org.junit.Assert.assertNotNull(strField98);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.coth((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Table<org.jooq.Record> recordTable2 = org.jooq.impl.DSL.tableByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep0 = org.jooq.impl.DSL.rowsUnboundedPreceding();
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jooq.Field<java.lang.Object> objField1 = org.jooq.impl.DSL.field("");
        org.junit.Assert.assertNotNull(objField1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) true);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(booleanField1);
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos((java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep9 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.rad((java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jooq.Row4[] row4Array1 = new org.jooq.Row4[0];
        @SuppressWarnings("unchecked") org.jooq.Row4<org.jooq.DDLQuery, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Field<java.lang.String>, java.lang.Object[]>[] dDLQueryRow4Array2 = (org.jooq.Row4<org.jooq.DDLQuery, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Field<java.lang.String>, java.lang.Object[]>[]) row4Array1;
        try {
            org.jooq.Table<org.jooq.Record4<org.jooq.DDLQuery, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Field<java.lang.String>, java.lang.Object[]>> dDLQueryRecord4Table3 = org.jooq.impl.DSL.values(dDLQueryRow4Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row4Array1);
        org.junit.Assert.assertNotNull(dDLQueryRow4Array2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.trunc(date0);
        java.sql.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.dateDiff(dateField1, date2);
        org.junit.Assert.assertNotNull(dateField1);
        org.junit.Assert.assertNotNull(intField3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.nullif(strField1, "");
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction8 = org.jooq.impl.DSL.countDistinct(strField1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(intAggregateFunction8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jooq.Field<java.sql.Timestamp> timestampField0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField3 = org.jooq.impl.DSL.timestampAdd(timestampField0, (java.lang.Number) 10, datePart2);
        java.sql.Timestamp timestamp4 = null;
        org.jooq.DatePart datePart5 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField6 = org.jooq.impl.DSL.trunc(timestamp4, datePart5);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField7 = org.jooq.impl.DSL.timestampDiff(timestampField0, timestampField6);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(timestampField6);
        org.junit.Assert.assertNotNull(dayToSecondField7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.octetLength("hi!");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.trunc(date1);
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Date> dateField5 = org.jooq.impl.DSL.dateAdd(dateField2, (java.lang.Number) (-1.0d), datePart4);
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.dateDiff(date0, dateField2);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.space(intField6);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(dateField5);
        org.junit.Assert.assertNotNull(intField6);
        org.junit.Assert.assertNotNull(strField7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jooq.Row20[] row20Array1 = new org.jooq.Row20[0];
        @SuppressWarnings("unchecked") org.jooq.Row20<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AlterTableStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Name, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.RowN, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[] selectFieldRow10Row20Array2 = (org.jooq.Row20<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AlterTableStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Name, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.RowN, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[]) row20Array1;
        try {
            org.jooq.Table<org.jooq.Record20<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AlterTableStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Name, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.RowN, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>> selectFieldRow10Record20Table3 = org.jooq.impl.DSL.values((org.jooq.Row20<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AlterTableStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Name, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.RowN, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[]) row20Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row20Array1);
        org.junit.Assert.assertNotNull(selectFieldRow10Row20Array2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.substring(strField1, 1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.lag(strField7, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.mid(strField7, 10, (-1));
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.md5(strField13);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (-1), "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.coerce(strField3, strField14);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jooq.Row3<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> intRecord1IterableRow3_0 = null;
        org.jooq.Row3[] row3Array2 = new org.jooq.Row3[1];
        @SuppressWarnings("unchecked") org.jooq.Row3<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[] record1IterableRow3Array3 = (org.jooq.Row3<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row3Array2;
        record1IterableRow3Array3[0] = intRecord1IterableRow3_0;
        try {
            org.jooq.Table<org.jooq.Record3<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>> record1IterableRecord3Table6 = org.jooq.impl.DSL.values(record1IterableRow3Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row3Array2);
        org.junit.Assert.assertNotNull(record1IterableRow3Array3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.RowN rowN2 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray0);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence3 = org.jooq.impl.DSL.sequenceByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(rowN2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep0 = null;
        org.jooq.Param<org.jooq.CreateSequenceFinalStep> createSequenceFinalStepParam1 = org.jooq.impl.DSL.value(createSequenceFinalStep0);
        org.junit.Assert.assertNotNull(createSequenceFinalStepParam1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jooq.Keyword keyword1 = org.jooq.impl.DSL.keyword("hi!");
        try {
            org.jooq.Param<org.jooq.Keyword> keywordParam2 = org.jooq.impl.DSL.value(keyword1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.KeywordImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(keyword1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence2 = org.jooq.impl.DSL.sequenceByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.one();
        org.junit.Assert.assertNotNull(intField0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsLeaf();
        org.junit.Assert.assertNotNull(booleanField0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((int) 'a', 0);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression2 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray4 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray5 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray4;
        wildcardCommonTableExpressionArray5[0] = wildcardCommonTableExpression2;
        org.jooq.WithStep withStep8 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray5);
        org.jooq.Condition condition9 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray5);
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery10 = org.jooq.impl.DSL.resultQuery("", (java.lang.Object[]) wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(commonTableExpressionArray4);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(withStep8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(recordResultQuery10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.trunc(date1);
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Date> dateField5 = org.jooq.impl.DSL.dateAdd(dateField2, (java.lang.Number) (byte) 1, datePart4);
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.dateDiff(date0, dateField2);
        java.sql.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.dateDiff(dateField2, date7);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(dateField5);
        org.junit.Assert.assertNotNull(intField6);
        org.junit.Assert.assertNotNull(intField8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jooq.Row18<org.jooq.WindowSpecificationOrderByStep, org.jooq.Table<?>, org.jooq.WithStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupField, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.Row, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep> windowSpecificationOrderByStepRow18_0 = null;
        org.jooq.Row18[] row18Array2 = new org.jooq.Row18[1];
        @SuppressWarnings("unchecked") org.jooq.Row18<org.jooq.WindowSpecificationOrderByStep, org.jooq.Table<?>, org.jooq.WithStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupField, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.Row, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep>[] windowSpecificationOrderByStepRow18Array3 = (org.jooq.Row18<org.jooq.WindowSpecificationOrderByStep, org.jooq.Table<?>, org.jooq.WithStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupField, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.Row, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep>[]) row18Array2;
        windowSpecificationOrderByStepRow18Array3[0] = windowSpecificationOrderByStepRow18_0;
        try {
            org.jooq.Table<org.jooq.Record18<org.jooq.WindowSpecificationOrderByStep, org.jooq.Table<?>, org.jooq.WithStep, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupField, org.jooq.WindowBeforeOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.Row, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep>> windowSpecificationOrderByStepRecord18Table6 = org.jooq.impl.DSL.values(windowSpecificationOrderByStepRow18Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row18Array2);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStepRow18Array3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jooq.Row2<org.jooq.SQL, java.lang.Class<?>> sQLRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<org.jooq.SQL, java.lang.Class<?>>[] sQLRow2Array3 = (org.jooq.Row2<org.jooq.SQL, java.lang.Class<?>>[]) row2Array2;
        sQLRow2Array3[0] = sQLRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.SQL, java.lang.Class<?>>> sQLRecord2Table6 = org.jooq.impl.DSL.values(sQLRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(sQLRow2Array3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sqrt((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jooq.AlterTableStep alterTableStep1 = org.jooq.impl.DSL.alterTable("hi!");
        org.junit.Assert.assertNotNull(alterTableStep1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(timestampField2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jooq.Row16[] row16Array1 = new org.jooq.Row16[0];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CreateIndexStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep>[] record1SelectFinalStepRow16Array2 = (org.jooq.Row16<org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CreateIndexStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep>[]) row16Array1;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CreateIndexStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep>> record1SelectFinalStepRecord16Table3 = org.jooq.impl.DSL.values((org.jooq.Row16<org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CreateIndexStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep>[]) row16Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row16Array1);
        org.junit.Assert.assertNotNull(record1SelectFinalStepRow16Array2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence6 = org.jooq.impl.DSL.sequenceByName(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : \"hi!\".\"hi!\".\"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jooq.WithAsStep withAsStep1 = org.jooq.impl.DSL.withRecursive("hi!");
        org.junit.Assert.assertNotNull(withAsStep1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep79 = org.jooq.impl.DSL.groupConcatDistinct(strField54);
        org.jooq.Field<java.lang.String> strField80 = null;
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.lpad(strField80, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField83);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep86 = org.jooq.impl.DSL.lag(strField83, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.mid(strField83, 10, (-1));
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.md5(strField89);
        org.jooq.Param<java.lang.String> strParam91 = org.jooq.impl.DSL.value((java.lang.Object) groupConcatOrderByStep79, strField89);
        org.jooq.Field<java.lang.Integer> intField92 = org.jooq.impl.DSL.length(strField89);
        org.jooq.Field<java.lang.String> strField93 = null;
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.replace(strField89, strField93);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep79);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep86);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strParam91);
        org.junit.Assert.assertNotNull(intField92);
        org.junit.Assert.assertNotNull(strField94);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) (byte) 0, (java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.Field<java.lang.String> strField3 = null;
        try {
            org.jooq.CaseConditionStep<java.lang.String> strCaseConditionStep4 = org.jooq.impl.DSL.when(condition2, strField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(condition2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jooq.DropViewFinalStep dropViewFinalStep1 = org.jooq.impl.DSL.dropView("");
        org.junit.Assert.assertNotNull(dropViewFinalStep1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep1 = org.jooq.impl.DSL.createSequence("");
        org.junit.Assert.assertNotNull(createSequenceFinalStep1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jooq.Row3[] row3Array1 = new org.jooq.Row3[0];
        @SuppressWarnings("unchecked") org.jooq.Row3<org.jooq.Condition, org.jooq.Query, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>>[] conditionRow3Array2 = (org.jooq.Row3<org.jooq.Condition, org.jooq.Query, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>>[]) row3Array1;
        try {
            org.jooq.Table<org.jooq.Record3<org.jooq.Condition, org.jooq.Query, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>>> conditionRecord3Table3 = org.jooq.impl.DSL.values(conditionRow3Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row3Array1);
        org.junit.Assert.assertNotNull(conditionRow3Array2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing((int) (byte) 100);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence3 = org.jooq.impl.DSL.sequence(name2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        try {
            org.jooq.Row1<org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectHavingStepRow1_1 = org.jooq.impl.DSL.row((org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.nullif(strField1, "");
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.upper(strField1);
        org.jooq.Field<java.lang.String> strField9 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField12);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField13);
        java.lang.Class<?> wildcardClass15 = strField14.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep16 = org.jooq.impl.DSL.lag(strField14);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence18 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep19 = org.jooq.impl.DSL.createSequence(bigIntegerSequence18);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.space(intField20);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.ltrim(strField21);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField21, 10, ' ');
        org.jooq.Param<java.lang.String> strParam26 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep19, strField25);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep27 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField1, (org.jooq.SelectField<java.lang.String>) strField14, (org.jooq.SelectField<java.lang.String>) strParam26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep16);
        org.junit.Assert.assertNotNull(bigIntegerSequence18);
        org.junit.Assert.assertNotNull(createSequenceFinalStep19);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strParam26);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.exp((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_25 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField9, strField10, "", (org.jooq.GroupField) strField15, strField22, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.SelectField<java.lang.String> strSelectField28 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction32 = org.jooq.impl.DSL.groupConcat(strField30, "");
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.rpad(strField30, 100, "");
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction40 = org.jooq.impl.DSL.groupConcat(strField38, "");
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.nvl2(strField30, "", (org.jooq.Field<java.lang.String>) strAggregateFunction40);
        org.jooq.Field<java.lang.Integer> intField42 = null;
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.space(intField42);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.ltrim(strField43);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.nullif(strField44, "hi!");
        try {
            org.jooq.SelectSelectStep<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5SelectSelectStep47 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField0, (org.jooq.SelectField<java.lang.String>) strField27, strSelectField28, (org.jooq.SelectField<java.lang.String>) strField30, (org.jooq.SelectField<java.lang.String>) strField44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strAggregateFunction32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strAggregateFunction40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jooq.Row14[] row14Array1 = new org.jooq.Row14[0];
        @SuppressWarnings("unchecked") org.jooq.Row14<org.jooq.WindowSpecification, org.jooq.Row, org.jooq.Table<?>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.SelectField<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[] windowSpecificationRow14Array2 = (org.jooq.Row14<org.jooq.WindowSpecification, org.jooq.Row, org.jooq.Table<?>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.SelectField<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row14Array1;
        try {
            org.jooq.Table<org.jooq.Record14<org.jooq.WindowSpecification, org.jooq.Row, org.jooq.Table<?>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.SelectField<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>> windowSpecificationRecord14Table3 = org.jooq.impl.DSL.values((org.jooq.Row14<org.jooq.WindowSpecification, org.jooq.Row, org.jooq.Table<?>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.SelectField<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row14Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row14Array1);
        org.junit.Assert.assertNotNull(windowSpecificationRow14Array2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction79 = org.jooq.impl.DSL.minDistinct(strField3);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strAggregateFunction79);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jooq.DropTableStep dropTableStep2 = org.jooq.impl.DSL.dropTableIfExists("hi!");
        try {
            org.jooq.Param<org.jooq.DropTableStep> dropTableStepParam3 = org.jooq.impl.DSL.param("", dropTableStep2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.DropTableImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dropTableStep2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.length(strField9);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(intField11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.SQL sQL6 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.rank(wildcardFieldArray3);
        org.jooq.Field[] fieldArray10 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray11 = (org.jooq.Field<?>[]) fieldArray10;
        org.jooq.GroupField groupField12 = org.jooq.impl.DSL.rollup(wildcardFieldArray11);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep13 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray11);
        org.jooq.SQL sQL14 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray11);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction15 = org.jooq.impl.DSL.rank(wildcardFieldArray11);
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep16 = org.jooq.impl.DSL.percentRank();
        java.lang.Class<?> wildcardClass17 = bigDecimalWindowOverStep16.getClass();
        try {
            org.jooq.Field<java.lang.Class<?>> wildcardClassField18 = org.jooq.impl.DSL.decode(intOrderedAggregateFunction7, intOrderedAggregateFunction15, wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(fieldArray10);
        org.junit.Assert.assertNotNull(wildcardFieldArray11);
        org.junit.Assert.assertNotNull(groupField12);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep13);
        org.junit.Assert.assertNotNull(sQL14);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction15);
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jooq.SQL sQL1 = org.jooq.impl.DSL.sql("hi!");
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("");
        org.junit.Assert.assertNotNull(recordTable1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jooq.Param<java.lang.String>[] strParamArray0 = null;
        org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.Param<java.lang.String>>> strParamRecord1QuantifiedSelect1 = org.jooq.impl.DSL.all(strParamArray0);
        org.junit.Assert.assertNotNull(strParamRecord1QuantifiedSelect1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cos((java.lang.Number) (-1));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jooq.Row16<org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, org.jooq.Param<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.WindowSpecificationRowsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<java.lang.String>, org.jooq.FieldLike> record1QuantifiedSelectCaseConditionStepRow16_0 = null;
        org.jooq.Row16[] row16Array2 = new org.jooq.Row16[1];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, org.jooq.Param<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.WindowSpecificationRowsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<java.lang.String>, org.jooq.FieldLike>[] quantifiedSelectCaseConditionStepRow16Array3 = (org.jooq.Row16<org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, org.jooq.Param<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.WindowSpecificationRowsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<java.lang.String>, org.jooq.FieldLike>[]) row16Array2;
        quantifiedSelectCaseConditionStepRow16Array3[0] = record1QuantifiedSelectCaseConditionStepRow16_0;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Attachable, java.lang.reflect.GenericDeclaration, org.jooq.Param<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.WindowSpecificationRowsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<java.lang.String>, org.jooq.FieldLike>> quantifiedSelectCaseConditionStepRecord16Table6 = org.jooq.impl.DSL.values(quantifiedSelectCaseConditionStepRow16Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row16Array2);
        org.junit.Assert.assertNotNull(quantifiedSelectCaseConditionStepRow16Array3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jooq.DropTableStep dropTableStep1 = org.jooq.impl.DSL.dropTable("");
        org.jooq.DropTableStep dropTableStep3 = org.jooq.impl.DSL.dropTableIfExists("");
        org.jooq.DropTableStep dropTableStep5 = org.jooq.impl.DSL.dropTableIfExists("hi!");
        org.jooq.DropTableFinalStep[] dropTableFinalStepArray6 = new org.jooq.DropTableFinalStep[] { dropTableStep1, dropTableStep3, dropTableStep5 };
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.DropTableFinalStep>> dropTableFinalStepRecord1QuantifiedSelect7 = org.jooq.impl.DSL.any(dropTableFinalStepArray6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.DropTableFinalStep is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dropTableStep1);
        org.junit.Assert.assertNotNull(dropTableStep3);
        org.junit.Assert.assertNotNull(dropTableStep5);
        org.junit.Assert.assertNotNull(dropTableFinalStepArray6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (-1L), datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String[] strArray0 = null;
        try {
            org.jooq.Field<java.lang.Object> objField1 = org.jooq.impl.DSL.fieldByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jooq.QueryPart queryPart1 = org.jooq.impl.DSL.queryPart("hi!");
        org.junit.Assert.assertNotNull(queryPart1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jooq.Row16<org.jooq.SQL, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.String, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Scope, org.jooq.DropTableStep, org.jooq.Row, org.jooq.WithAsStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>> sQLRow16_0 = null;
        org.jooq.Row16[] row16Array2 = new org.jooq.Row16[1];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.SQL, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.String, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Scope, org.jooq.DropTableStep, org.jooq.Row, org.jooq.WithAsStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>>[] sQLRow16Array3 = (org.jooq.Row16<org.jooq.SQL, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.String, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Scope, org.jooq.DropTableStep, org.jooq.Row, org.jooq.WithAsStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>>[]) row16Array2;
        sQLRow16Array3[0] = sQLRow16_0;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.SQL, java.lang.reflect.AnnotatedElement, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.String, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Scope, org.jooq.DropTableStep, org.jooq.Row, org.jooq.WithAsStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>>> sQLRecord16Table6 = org.jooq.impl.DSL.values(sQLRow16Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row16Array2);
        org.junit.Assert.assertNotNull(sQLRow16Array3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.RowN rowN4 = org.jooq.impl.DSL.row(wildcardFieldArray2);
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray7);
        org.jooq.RowN rowN9 = org.jooq.impl.DSL.row(wildcardFieldArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jooq.Name name11 = org.jooq.impl.DSL.name(strArray10);
        org.jooq.RowN rowN12 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray10);
        org.jooq.RowN[] rowNArray13 = new org.jooq.RowN[] { rowN4, rowN9, rowN12 };
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.RowN>> rowNRecord1QuantifiedSelect14 = org.jooq.impl.DSL.any(rowNArray13);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.RowN is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(rowN4);
        org.junit.Assert.assertNotNull(fieldArray6);
        org.junit.Assert.assertNotNull(wildcardFieldArray7);
        org.junit.Assert.assertNotNull(groupField8);
        org.junit.Assert.assertNotNull(rowN9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(rowN12);
        org.junit.Assert.assertNotNull(rowNArray13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jooq.Field<java.lang.Object> objField1 = org.jooq.impl.DSL.field("hi!");
        org.junit.Assert.assertNotNull(objField1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jooq.Row10[] row10Array1 = new org.jooq.Row10[0];
        @SuppressWarnings("unchecked") org.jooq.Row10<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DropIndexFinalStep, org.jooq.AggregateFunction<java.lang.String>>[] bigIntegerSequenceRow10Array2 = (org.jooq.Row10<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DropIndexFinalStep, org.jooq.AggregateFunction<java.lang.String>>[]) row10Array1;
        try {
            org.jooq.Table<org.jooq.Record10<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DropIndexFinalStep, org.jooq.AggregateFunction<java.lang.String>>> bigIntegerSequenceRecord10Table3 = org.jooq.impl.DSL.values((org.jooq.Row10<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DropIndexFinalStep, org.jooq.AggregateFunction<java.lang.String>>[]) row10Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row10Array1);
        org.junit.Assert.assertNotNull(bigIntegerSequenceRow10Array2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep2 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition3 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep2);
        org.jooq.DropTableStep dropTableStep5 = org.jooq.impl.DSL.dropTableIfExists("hi!");
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.concat("hi!", strField8);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.left(strField12, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.right(strField12, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { intRecord1SelectSelectStep2, "hi!", strField12 };
        org.jooq.Table<org.jooq.Record> recordTable19 = org.jooq.impl.DSL.table("", objArray18);
        org.jooq.SQL sQL20 = org.jooq.impl.DSL.sql("", objArray18);
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression23 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray25 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray26 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray25;
        wildcardCommonTableExpressionArray26[0] = wildcardCommonTableExpression23;
        org.jooq.WithStep withStep29 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray26);
        org.jooq.Condition condition30 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray26);
        org.jooq.SQL sQL31 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray26);
        org.jooq.Field[] fieldArray34 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray35 = (org.jooq.Field<?>[]) fieldArray34;
        org.jooq.GroupField groupField36 = org.jooq.impl.DSL.rollup(wildcardFieldArray35);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep37 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray35);
        org.jooq.SQL sQL38 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray35);
        org.jooq.Field[] fieldArray41 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray42 = (org.jooq.Field<?>[]) fieldArray41;
        org.jooq.GroupField groupField43 = org.jooq.impl.DSL.rollup(wildcardFieldArray42);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep44 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray42);
        org.jooq.SQL sQL45 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray42);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep48 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition49 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep48);
        org.jooq.DropTableStep dropTableStep51 = org.jooq.impl.DSL.dropTableIfExists("hi!");
        org.jooq.Field<java.lang.String> strField54 = null;
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.concat("hi!", strField54);
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.left(strField58, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.right(strField58, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField58);
        java.lang.Object[] objArray64 = new java.lang.Object[] { intRecord1SelectSelectStep48, "hi!", strField58 };
        org.jooq.Table<org.jooq.Record> recordTable65 = org.jooq.impl.DSL.table("", objArray64);
        org.jooq.SQL sQL66 = org.jooq.impl.DSL.sql("", objArray64);
        org.jooq.Field[] fieldArray69 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray70 = (org.jooq.Field<?>[]) fieldArray69;
        org.jooq.GroupField groupField71 = org.jooq.impl.DSL.rollup(wildcardFieldArray70);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep72 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray70);
        org.jooq.SQL sQL73 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray70);
        org.jooq.Field[] fieldArray76 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray77 = (org.jooq.Field<?>[]) fieldArray76;
        org.jooq.GroupField groupField78 = org.jooq.impl.DSL.rollup(wildcardFieldArray77);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep79 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray77);
        org.jooq.SQL sQL80 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray77);
        org.jooq.SQL[] sQLArray81 = new org.jooq.SQL[] { sQL31, sQL38, sQL45, sQL66, sQL73, sQL80 };
        try {
            org.jooq.Field<org.jooq.SQL> sQLField82 = org.jooq.impl.DSL.greatest(sQL20, sQLArray81);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SQLImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep2);
        org.junit.Assert.assertNotNull(condition3);
        org.junit.Assert.assertNotNull(dropTableStep5);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(recordTable19);
        org.junit.Assert.assertNotNull(sQL20);
        org.junit.Assert.assertNotNull(commonTableExpressionArray25);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray26);
        org.junit.Assert.assertNotNull(withStep29);
        org.junit.Assert.assertNotNull(condition30);
        org.junit.Assert.assertNotNull(sQL31);
        org.junit.Assert.assertNotNull(fieldArray34);
        org.junit.Assert.assertNotNull(wildcardFieldArray35);
        org.junit.Assert.assertNotNull(groupField36);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep37);
        org.junit.Assert.assertNotNull(sQL38);
        org.junit.Assert.assertNotNull(fieldArray41);
        org.junit.Assert.assertNotNull(wildcardFieldArray42);
        org.junit.Assert.assertNotNull(groupField43);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep44);
        org.junit.Assert.assertNotNull(sQL45);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep48);
        org.junit.Assert.assertNotNull(condition49);
        org.junit.Assert.assertNotNull(dropTableStep51);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(recordTable65);
        org.junit.Assert.assertNotNull(sQL66);
        org.junit.Assert.assertNotNull(fieldArray69);
        org.junit.Assert.assertNotNull(wildcardFieldArray70);
        org.junit.Assert.assertNotNull(groupField71);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep72);
        org.junit.Assert.assertNotNull(sQL73);
        org.junit.Assert.assertNotNull(fieldArray76);
        org.junit.Assert.assertNotNull(wildcardFieldArray77);
        org.junit.Assert.assertNotNull(groupField78);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep79);
        org.junit.Assert.assertNotNull(sQL80);
        org.junit.Assert.assertNotNull(sQLArray81);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.Field<java.lang.Boolean> booleanField3 = org.jooq.impl.DSL.not(booleanField1);
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(booleanField3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep1 = org.jooq.impl.DSL.selectZero();
        org.jooq.Condition condition2 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.space(intField4);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.ltrim(strField5);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.rpad(strField6, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep10 = org.jooq.impl.DSL.arrayAgg(strField6);
        org.jooq.Field[] fieldArray12 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray13 = (org.jooq.Field<?>[]) fieldArray12;
        org.jooq.GroupField groupField14 = org.jooq.impl.DSL.rollup(wildcardFieldArray13);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep15 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray13);
        org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectForUpdateStep16 = null;
        org.jooq.Field<java.lang.Integer> intField17 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.space(intField17);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.ltrim(strField18);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction20 = org.jooq.impl.DSL.minDistinct(strField18);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep21 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction20);
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression22 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray24 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray25 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray24;
        wildcardCommonTableExpressionArray25[0] = wildcardCommonTableExpression22;
        org.jooq.WithStep withStep28 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray25);
        org.jooq.DropViewFinalStep dropViewFinalStep30 = org.jooq.impl.DSL.dropViewIfExists("hi!");
        org.jooq.Field<java.lang.String> strField31 = null;
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.lpad(strField31, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField37 = null;
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.lpad(strField37, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField46 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_56 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField31, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField40, strField41, "", (org.jooq.GroupField) strField46, strField53, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<org.jooq.Record10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>> strSelectFieldRecord10Field57 = org.jooq.impl.DSL.field(strSelectFieldRow10_56);
        org.jooq.WithAsStep withAsStep59 = org.jooq.impl.DSL.withRecursive("");
        org.jooq.Field<java.lang.String> strField60 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.lpad(strField60, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField66 = null;
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.lpad(strField66, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField70 = null;
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.lpad(strField70, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = null;
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.lpad(strField75, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField79 = null;
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.lpad(strField79, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_85 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField60, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField69, strField70, "", (org.jooq.GroupField) strField75, strField82, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass86 = strField82.getClass();
        org.jooq.Field<java.lang.String> strField87 = null;
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.lpad(strField87, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField90);
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField91);
        java.lang.Class<?> wildcardClass93 = strField92.getClass();
        try {
            org.jooq.Row13<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.WindowSpecificationRowsStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.DropViewFinalStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.WithAsStep, java.lang.Class<?>, java.lang.reflect.AnnotatedElement> intRecord1SelectSelectStepRow13_94 = org.jooq.impl.DSL.row(intRecord1SelectSelectStep0, (org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1, (java.lang.Comparable<java.lang.String>) "", strArrayArrayAggOrderByStep10, (org.jooq.WindowSpecificationRowsStep) windowSpecificationOrderByStep15, intRecord1SelectForUpdateStep16, strAggregateFunction20, wildcardCommonTableExpressionArray25, dropViewFinalStep30, strSelectFieldRow10_56, withAsStep59, wildcardClass86, (java.lang.reflect.AnnotatedElement) wildcardClass93);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep10);
        org.junit.Assert.assertNotNull(fieldArray12);
        org.junit.Assert.assertNotNull(wildcardFieldArray13);
        org.junit.Assert.assertNotNull(groupField14);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strAggregateFunction20);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep21);
        org.junit.Assert.assertNotNull(commonTableExpressionArray24);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray25);
        org.junit.Assert.assertNotNull(withStep28);
        org.junit.Assert.assertNotNull(dropViewFinalStep30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_56);
        org.junit.Assert.assertNotNull(strSelectFieldRecord10Field57);
        org.junit.Assert.assertNotNull(withAsStep59);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jooq.Param<java.lang.Object> objParam1 = org.jooq.impl.DSL.param("hi!");
        org.junit.Assert.assertNotNull(objParam1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep1 = org.jooq.impl.DSL.percentRank();
        java.lang.Class<?> wildcardClass2 = bigDecimalWindowOverStep1.getClass();
        try {
            org.jooq.Param<java.lang.reflect.Type> typeParam3 = org.jooq.impl.DSL.param("", (java.lang.reflect.Type) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction13 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray6);
        org.jooq.QueryPart queryPart14 = org.jooq.impl.DSL.queryPart("", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(objField11);
        org.junit.Assert.assertNotNull(objField12);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(queryPart14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField4 = org.jooq.impl.DSL.timestampAdd(timestamp1, (java.lang.Number) (-1), datePart3);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField5 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestampField4);
        org.junit.Assert.assertNotNull(timestampField4);
        org.junit.Assert.assertNotNull(dayToSecondField5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jooq.Row1<java.lang.String> strRow1_0 = null;
        org.jooq.Row1[] row1Array2 = new org.jooq.Row1[1];
        @SuppressWarnings("unchecked") org.jooq.Row1<java.lang.String>[] strRow1Array3 = (org.jooq.Row1<java.lang.String>[]) row1Array2;
        strRow1Array3[0] = strRow1_0;
        try {
            org.jooq.Table<org.jooq.Record1<java.lang.String>> strRecord1Table6 = org.jooq.impl.DSL.values(strRow1Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row1Array2);
        org.junit.Assert.assertNotNull(strRow1Array3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jooq.Row16<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Param<java.lang.String>, java.io.Serializable, org.jooq.Scope, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification> strSelectFieldRow10Row16_0 = null;
        org.jooq.Row16[] row16Array2 = new org.jooq.Row16[1];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Param<java.lang.String>, java.io.Serializable, org.jooq.Scope, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification>[] selectFieldRow10Row16Array3 = (org.jooq.Row16<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Param<java.lang.String>, java.io.Serializable, org.jooq.Scope, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification>[]) row16Array2;
        selectFieldRow10Row16Array3[0] = strSelectFieldRow10Row16_0;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Param<java.lang.String>, java.io.Serializable, org.jooq.Scope, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification>> selectFieldRow10Record16Table6 = org.jooq.impl.DSL.values(selectFieldRow10Row16Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row16Array2);
        org.junit.Assert.assertNotNull(selectFieldRow10Row16Array3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.space(intField9);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.ltrim(strField10);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.lpad(strField18, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField31 = null;
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.lpad(strField31, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_37 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField12, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField21, strField22, "", (org.jooq.GroupField) strField27, strField34, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.space(intField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.ltrim(strField39);
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.concat("hi!", strField42);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", strField51);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.lpad(strField55, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField63 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.space(intField63);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.ltrim(strField64);
        org.jooq.Field<java.lang.Integer> intField66 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.space(intField66);
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField72 = null;
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.lpad(strField72, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep78 = org.jooq.impl.DSL.lag(strField75, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_79 = org.jooq.impl.DSL.row(strField2, strField4, strField10, strField12, strField39, strField49, strField55, strField62, strField65, strField67, strField71, strField75);
        org.jooq.Field<java.lang.Integer> intField80 = org.jooq.impl.DSL.bitLength(strField71);
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.nullif("hi!", strField71);
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction85 = org.jooq.impl.DSL.groupConcat(strField83, "");
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.rpad(strField83, 100, "");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep89 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField81, (org.jooq.SelectField<java.lang.String>) strField83);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep90 = org.jooq.impl.DSL.lead(strField81);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep78);
        org.junit.Assert.assertNotNull(strRow12_79);
        org.junit.Assert.assertNotNull(intField80);
        org.junit.Assert.assertNotNull(strField81);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strAggregateFunction85);
        org.junit.Assert.assertNotNull(strField88);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep89);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep90);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jooq.ArrayAggOrderByStep[] arrayAggOrderByStepArray1 = new org.jooq.ArrayAggOrderByStep[0];
        @SuppressWarnings("unchecked") org.jooq.ArrayAggOrderByStep<java.lang.String[]>[] strArrayArrayAggOrderByStepArray2 = (org.jooq.ArrayAggOrderByStep<java.lang.String[]>[]) arrayAggOrderByStepArray1;
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.ArrayAggOrderByStep<java.lang.String[]>>> strArrayArrayAggOrderByStepRecord1QuantifiedSelect3 = org.jooq.impl.DSL.any((org.jooq.ArrayAggOrderByStep<java.lang.String[]>[]) arrayAggOrderByStepArray1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.ArrayAggOrderByStep is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(arrayAggOrderByStepArray1);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStepArray2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) (-1L), (int) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jooq.Row11<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Class<?>, org.jooq.WithStep, org.jooq.TableLike<?>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Row> intRecord1SelectWhereStepRow11_0 = null;
        org.jooq.Row11[] row11Array2 = new org.jooq.Row11[1];
        @SuppressWarnings("unchecked") org.jooq.Row11<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Class<?>, org.jooq.WithStep, org.jooq.TableLike<?>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Row>[] record1SelectWhereStepRow11Array3 = (org.jooq.Row11<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Class<?>, org.jooq.WithStep, org.jooq.TableLike<?>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Row>[]) row11Array2;
        record1SelectWhereStepRow11Array3[0] = intRecord1SelectWhereStepRow11_0;
        try {
            org.jooq.Table<org.jooq.Record11<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.Class<?>, org.jooq.WithStep, org.jooq.TableLike<?>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Row>> record1SelectWhereStepRecord11Table6 = org.jooq.impl.DSL.values(record1SelectWhereStepRow11Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row11Array2);
        org.junit.Assert.assertNotNull(record1SelectWhereStepRow11Array3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep4 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray2);
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray7);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep9 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray7);
        try {
            org.jooq.Field<org.jooq.WindowSpecificationRowsStep> windowSpecificationRowsStepField10 = org.jooq.impl.DSL.isnull((org.jooq.WindowSpecificationRowsStep) windowSpecificationOrderByStep4, (org.jooq.WindowSpecificationRowsStep) windowSpecificationOrderByStep9);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep4);
        org.junit.Assert.assertNotNull(fieldArray6);
        org.junit.Assert.assertNotNull(wildcardFieldArray7);
        org.junit.Assert.assertNotNull(groupField8);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction3 = org.jooq.impl.DSL.every(condition2);
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(booleanAggregateFunction3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jooq.WithAsStep withAsStep1 = org.jooq.impl.DSL.withRecursive("");
        org.jooq.WithAsStep withAsStep3 = org.jooq.impl.DSL.withRecursive("");
        org.jooq.WithAsStep withAsStep5 = org.jooq.impl.DSL.withRecursive("hi!");
        org.jooq.WithAsStep withAsStep7 = org.jooq.impl.DSL.withRecursive("");
        org.jooq.WithAsStep[] withAsStepArray8 = new org.jooq.WithAsStep[] { withAsStep3, withAsStep5, withAsStep7 };
        try {
            org.jooq.Field<org.jooq.WithAsStep> withAsStepField9 = org.jooq.impl.DSL.greatest(withAsStep1, withAsStepArray8);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WithImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(withAsStep1);
        org.junit.Assert.assertNotNull(withAsStep3);
        org.junit.Assert.assertNotNull(withAsStep5);
        org.junit.Assert.assertNotNull(withAsStep7);
        org.junit.Assert.assertNotNull(withAsStepArray8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jooq.QueryPart queryPart1 = org.jooq.impl.DSL.queryPart("");
        org.junit.Assert.assertNotNull(queryPart1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField4, 10, ' ');
        org.jooq.Param<java.lang.String> strParam9 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep2, strField8);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.substring(strField8, (-1), (int) (short) 100);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strParam9);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.rand();
        org.junit.Assert.assertNotNull(bigDecimalField0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jooq.Row21[] row21Array1 = new org.jooq.Row21[0];
        @SuppressWarnings("unchecked") org.jooq.Row21<org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectField<java.lang.String>, java.lang.reflect.Type, java.lang.reflect.Type, org.jooq.FieldLike, org.jooq.CreateIndexStep, org.jooq.DropViewFinalStep, java.lang.reflect.AnnotatedElement, org.jooq.RowN, org.jooq.CreateSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>[] strRow12Row21Array2 = (org.jooq.Row21<org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectField<java.lang.String>, java.lang.reflect.Type, java.lang.reflect.Type, org.jooq.FieldLike, org.jooq.CreateIndexStep, org.jooq.DropViewFinalStep, java.lang.reflect.AnnotatedElement, org.jooq.RowN, org.jooq.CreateSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>[]) row21Array1;
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectField<java.lang.String>, java.lang.reflect.Type, java.lang.reflect.Type, org.jooq.FieldLike, org.jooq.CreateIndexStep, org.jooq.DropViewFinalStep, java.lang.reflect.AnnotatedElement, org.jooq.RowN, org.jooq.CreateSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>> strRow12Record21Table3 = org.jooq.impl.DSL.values((org.jooq.Row21<org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectField<java.lang.String>, java.lang.reflect.Type, java.lang.reflect.Type, org.jooq.FieldLike, org.jooq.CreateIndexStep, org.jooq.DropViewFinalStep, java.lang.reflect.AnnotatedElement, org.jooq.RowN, org.jooq.CreateSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>[]) row21Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row21Array1);
        org.junit.Assert.assertNotNull(strRow12Row21Array2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.nullif(strField1, "");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep8 = org.jooq.impl.DSL.lastValue(strField1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Properties properties1 = null;
        try {
            org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using("", properties1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for ");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsCycle();
        org.junit.Assert.assertNotNull(booleanField0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jooq.ConnectionProvider connectionProvider0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connectionProvider0, sQLDialect1);
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, sQLDialect1);
        try {
            org.jooq.Param<org.jooq.Scope> scopeParam3 = org.jooq.impl.DSL.value((org.jooq.Scope) dSLContext2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.DefaultDSLContext is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jooq.Row5<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.reflect.Type, org.jooq.Table<?>> bigIntegerSequenceRow5_0 = null;
        org.jooq.Row5[] row5Array2 = new org.jooq.Row5[1];
        @SuppressWarnings("unchecked") org.jooq.Row5<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.reflect.Type, org.jooq.Table<?>>[] bigIntegerSequenceRow5Array3 = (org.jooq.Row5<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.reflect.Type, org.jooq.Table<?>>[]) row5Array2;
        bigIntegerSequenceRow5Array3[0] = bigIntegerSequenceRow5_0;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.reflect.Type, org.jooq.Table<?>>> bigIntegerSequenceRecord5Table6 = org.jooq.impl.DSL.values(bigIntegerSequenceRow5Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row5Array2);
        org.junit.Assert.assertNotNull(bigIntegerSequenceRow5Array3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.rowNumber();
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for hi!");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jooq.Row1<org.jooq.DDLQuery> dDLQueryRow1_0 = null;
        org.jooq.Row1[] row1Array2 = new org.jooq.Row1[1];
        @SuppressWarnings("unchecked") org.jooq.Row1<org.jooq.DDLQuery>[] dDLQueryRow1Array3 = (org.jooq.Row1<org.jooq.DDLQuery>[]) row1Array2;
        dDLQueryRow1Array3[0] = dDLQueryRow1_0;
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.DDLQuery>> dDLQueryRecord1Table6 = org.jooq.impl.DSL.values(dDLQueryRow1Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row1Array2);
        org.junit.Assert.assertNotNull(dDLQueryRow1Array3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        try {
            org.jooq.DSLContext dSLContext1 = org.jooq.impl.DSL.using("hi!");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for hi!");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression7 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray9 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray10 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray9;
        wildcardCommonTableExpressionArray10[0] = wildcardCommonTableExpression7;
        org.jooq.WithStep withStep13 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray10);
        org.jooq.Condition condition14 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray10);
        org.jooq.WithStep withStep15 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray10);
        org.jooq.Field<?> wildcardField18 = null;
        org.jooq.Field[] fieldArray20 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray21 = (org.jooq.Field<?>[]) fieldArray20;
        wildcardFieldArray21[0] = wildcardField18;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction24 = org.jooq.impl.DSL.denseRank(wildcardFieldArray21);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.concat(wildcardFieldArray21);
        org.jooq.Field<java.lang.Object> objField26 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray21);
        org.jooq.Field<java.lang.Object> objField27 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray21);
        try {
            org.jooq.Field<java.lang.Object[]> objArrayField28 = org.jooq.impl.DSL.nvl2(strField5, (java.lang.Object[]) wildcardCommonTableExpressionArray10, (java.lang.Object[]) wildcardFieldArray21);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.CommonTableExpression is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(commonTableExpressionArray9);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray10);
        org.junit.Assert.assertNotNull(withStep13);
        org.junit.Assert.assertNotNull(condition14);
        org.junit.Assert.assertNotNull(withStep15);
        org.junit.Assert.assertNotNull(fieldArray20);
        org.junit.Assert.assertNotNull(wildcardFieldArray21);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(objField26);
        org.junit.Assert.assertNotNull(objField27);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep3 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        try {
            org.jooq.Field<org.jooq.WindowSpecificationFinalStep> windowSpecificationFinalStepField4 = org.jooq.impl.DSL.nvl(windowSpecificationFinalStep1, windowSpecificationFinalStep3);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jooq.Row1[] row1Array1 = new org.jooq.Row1[0];
        @SuppressWarnings("unchecked") org.jooq.Row1<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>[] record1SelectOrderByStepRow1Array2 = (org.jooq.Row1<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>[]) row1Array1;
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>> record1SelectOrderByStepRecord1Table3 = org.jooq.impl.DSL.values((org.jooq.Row1<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>>[]) row1Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row1Array1);
        org.junit.Assert.assertNotNull(record1SelectOrderByStepRow1Array2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep4 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        try {
            org.jooq.Param<org.jooq.AlterSequenceRestartStep<java.math.BigInteger>> bigIntegerAlterSequenceRestartStepParam5 = org.jooq.impl.DSL.value(bigIntegerAlterSequenceRestartStep4);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.AlterSequenceImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<?> wildcardField6 = null;
        org.jooq.Field[] fieldArray8 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray9 = (org.jooq.Field<?>[]) fieldArray8;
        wildcardFieldArray9[0] = wildcardField6;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction12 = org.jooq.impl.DSL.denseRank(wildcardFieldArray9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.concat(wildcardFieldArray9);
        org.jooq.Field<java.lang.Object> objField14 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray9);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.least(strField4, wildcardFieldArray9);
        org.jooq.Field<java.lang.Integer> intField16 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.space(intField16);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.nvl(strField17, "hi!");
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.concat("hi!", strField21);
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.nullif(strField21, "");
        org.jooq.Field<java.lang.String> strField28 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField31);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField32);
        java.lang.Class<?> wildcardClass34 = strField33.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep35 = org.jooq.impl.DSL.lag(strField33);
        org.jooq.Field<java.lang.String> strField36 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField39);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep42 = org.jooq.impl.DSL.lag(strField39, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.mid(strField39, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField46 = null;
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.space(intField46);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.ltrim(strField47);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction49 = org.jooq.impl.DSL.minDistinct(strField47);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction50 = org.jooq.impl.DSL.maxDistinct(strField47);
        org.jooq.Field<java.lang.String> strField53 = null;
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.lpad(strField53, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.concat("hi!", strField53);
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.left(strField57, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.right(strField57, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField57);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.coalesce(strField57, "");
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.lpad(strField64, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_68 = org.jooq.impl.DSL.row(strField33, strField39, strField47, strField64);
        org.jooq.Field<java.lang.Integer> intField69 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.space(intField69);
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.ltrim(strField70);
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField70, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep76 = org.jooq.impl.DSL.lead(strField74, (int) (byte) 10);
        org.jooq.Field<java.lang.String> strField78 = null;
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.lpad(strField78, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.concat("hi!", strField78);
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.left(strField82, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.connectByRoot(strField82);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record6<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord6SelectSelectStep86 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField4, (org.jooq.SelectField<java.lang.String>) strField17, (org.jooq.SelectField<java.lang.String>) strField21, (org.jooq.SelectField<java.lang.String>) strField33, (org.jooq.SelectField<java.lang.String>) strField74, (org.jooq.SelectField<java.lang.String>) strField85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(fieldArray8);
        org.junit.Assert.assertNotNull(wildcardFieldArray9);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(objField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep35);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep42);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strAggregateFunction49);
        org.junit.Assert.assertNotNull(strAggregateFunction50);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strRow4_68);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep76);
        org.junit.Assert.assertNotNull(strField81);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strField85);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jooq.Row21[] row21Array1 = new org.jooq.Row21[0];
        @SuppressWarnings("unchecked") org.jooq.Row21<org.jooq.WindowSpecificationOrderByStep, org.jooq.CreateIndexStep, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.GroupConcatSeparatorStep, org.jooq.RowN[], org.jooq.DropTableStep, org.jooq.Row, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.DropIndexFinalStep, org.jooq.SelectField<java.lang.String>, org.jooq.CaseValueStep<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>[] windowSpecificationOrderByStepRow21Array2 = (org.jooq.Row21<org.jooq.WindowSpecificationOrderByStep, org.jooq.CreateIndexStep, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.GroupConcatSeparatorStep, org.jooq.RowN[], org.jooq.DropTableStep, org.jooq.Row, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.DropIndexFinalStep, org.jooq.SelectField<java.lang.String>, org.jooq.CaseValueStep<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>[]) row21Array1;
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.WindowSpecificationOrderByStep, org.jooq.CreateIndexStep, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.GroupConcatSeparatorStep, org.jooq.RowN[], org.jooq.DropTableStep, org.jooq.Row, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.DropIndexFinalStep, org.jooq.SelectField<java.lang.String>, org.jooq.CaseValueStep<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>> windowSpecificationOrderByStepRecord21Table3 = org.jooq.impl.DSL.values((org.jooq.Row21<org.jooq.WindowSpecificationOrderByStep, org.jooq.CreateIndexStep, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.GroupConcatSeparatorStep, org.jooq.RowN[], org.jooq.DropTableStep, org.jooq.Row, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.DropIndexFinalStep, org.jooq.SelectField<java.lang.String>, org.jooq.CaseValueStep<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>[]) row21Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row21Array1);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStepRow21Array2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Table<org.jooq.Record> recordTable3 = org.jooq.impl.DSL.tableByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        try {
            org.jooq.Row1<org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectFromStepRow1_1 = org.jooq.impl.DSL.row((org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectFromStep0 = null;
        org.jooq.Row1<org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectFromStepRow1_1 = org.jooq.impl.DSL.row(intRecord1SelectFromStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectFromStepRow1_1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.lpad(strField3, (int) (short) 100, '4');
        try {
            org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.castNull(strField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField81);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.Object[] objArray0 = null;
        try {
            org.jooq.Table<?> wildcardTable1 = org.jooq.impl.DSL.table(objArray0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Converting arbitrary types into array tables is currently not supported");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jooq.Row12<org.jooq.Field<java.lang.String>, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Row, org.jooq.Case, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>> strFieldRow12_0 = null;
        org.jooq.Row12[] row12Array2 = new org.jooq.Row12[1];
        @SuppressWarnings("unchecked") org.jooq.Row12<org.jooq.Field<java.lang.String>, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Row, org.jooq.Case, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>>[] strFieldRow12Array3 = (org.jooq.Row12<org.jooq.Field<java.lang.String>, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Row, org.jooq.Case, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>>[]) row12Array2;
        strFieldRow12Array3[0] = strFieldRow12_0;
        try {
            org.jooq.Table<org.jooq.Record12<org.jooq.Field<java.lang.String>, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Row, org.jooq.Case, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>>> strFieldRecord12Table6 = org.jooq.impl.DSL.values(strFieldRow12Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row12Array2);
        org.junit.Assert.assertNotNull(strFieldRow12Array3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for hi!");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jooq.Row17<org.jooq.Condition, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Table<?>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DSLContext, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Case, org.jooq.WithStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Attachable> conditionRow17_0 = null;
        org.jooq.Row17[] row17Array2 = new org.jooq.Row17[1];
        @SuppressWarnings("unchecked") org.jooq.Row17<org.jooq.Condition, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Table<?>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DSLContext, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Case, org.jooq.WithStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Attachable>[] conditionRow17Array3 = (org.jooq.Row17<org.jooq.Condition, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Table<?>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DSLContext, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Case, org.jooq.WithStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Attachable>[]) row17Array2;
        conditionRow17Array3[0] = conditionRow17_0;
        try {
            org.jooq.Table<org.jooq.Record17<org.jooq.Condition, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Table<?>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DSLContext, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Case, org.jooq.WithStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Attachable>> conditionRecord17Table6 = org.jooq.impl.DSL.values(conditionRow17Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row17Array2);
        org.junit.Assert.assertNotNull(conditionRow17Array3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<?> wildcardField6 = null;
        org.jooq.Field[] fieldArray8 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray9 = (org.jooq.Field<?>[]) fieldArray8;
        wildcardFieldArray9[0] = wildcardField6;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction12 = org.jooq.impl.DSL.denseRank(wildcardFieldArray9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.concat(wildcardFieldArray9);
        org.jooq.Field<java.lang.Object> objField14 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray9);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.least(strField4, wildcardFieldArray9);
        try {
            org.jooq.Table<?> wildcardTable16 = org.jooq.impl.DSL.unnest((java.lang.Object[]) wildcardFieldArray9);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Field is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(fieldArray8);
        org.junit.Assert.assertNotNull(wildcardFieldArray9);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(objField14);
        org.junit.Assert.assertNotNull(strField15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery1 = org.jooq.impl.DSL.resultQuery("");
        org.junit.Assert.assertNotNull(recordResultQuery1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.isnull("", strField6);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jooq.Row22[] row22Array1 = new org.jooq.Row22[0];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.RowN[], org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.AnnotatedElement, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Field<?>[], org.jooq.Attachable, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.AlterTableStep, org.jooq.Attachable, org.jooq.TableLike<?>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, java.io.Serializable, java.lang.reflect.Type, org.jooq.Condition, org.jooq.SelectField<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[] rowNArrayRow22Array2 = (org.jooq.Row22<org.jooq.RowN[], org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.AnnotatedElement, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Field<?>[], org.jooq.Attachable, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.AlterTableStep, org.jooq.Attachable, org.jooq.TableLike<?>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, java.io.Serializable, java.lang.reflect.Type, org.jooq.Condition, org.jooq.SelectField<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[]) row22Array1;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.RowN[], org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.AnnotatedElement, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Field<?>[], org.jooq.Attachable, org.jooq.WithStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.AlterTableStep, org.jooq.Attachable, org.jooq.TableLike<?>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, java.io.Serializable, java.lang.reflect.Type, org.jooq.Condition, org.jooq.SelectField<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.WindowIgnoreNullsStep<java.lang.String>>> rowNArrayRecord22Table3 = org.jooq.impl.DSL.values(rowNArrayRow22Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row22Array1);
        org.junit.Assert.assertNotNull(rowNArrayRow22Array2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date("hi!");
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField79 = org.jooq.impl.DSL.rtrim(strField1);
        org.jooq.Field<java.lang.String> strField80 = org.jooq.impl.DSL.prior(strField1);
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.substring(strField1, 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField79);
        org.junit.Assert.assertNotNull(strField80);
        org.junit.Assert.assertNotNull(strField83);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep1 = org.jooq.impl.DSL.dropSequenceIfExists("hi!");
        org.junit.Assert.assertNotNull(dropSequenceFinalStep1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jooq.Row19[] row19Array1 = new org.jooq.Row19[0];
        @SuppressWarnings("unchecked") org.jooq.Row19<java.lang.String[], java.lang.String[], org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.Field<?>[], org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.CreateIndexStep, org.jooq.Condition>[] strArrayRow19Array2 = (org.jooq.Row19<java.lang.String[], java.lang.String[], org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.Field<?>[], org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.CreateIndexStep, org.jooq.Condition>[]) row19Array1;
        try {
            org.jooq.Table<org.jooq.Record19<java.lang.String[], java.lang.String[], org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.Field<?>[], org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.CreateIndexStep, org.jooq.Condition>> strArrayRecord19Table3 = org.jooq.impl.DSL.values((org.jooq.Row19<java.lang.String[], java.lang.String[], org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.Field<?>[], org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.CreateIndexStep, org.jooq.Condition>[]) row19Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row19Array1);
        org.junit.Assert.assertNotNull(strArrayRow19Array2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsFollowing(1);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jooq.SelectField<java.lang.String> strSelectField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.minDistinct(strField2);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction5 = org.jooq.impl.DSL.maxDistinct(strField2);
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField9);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField9, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.mid(strField9, 10, (-1));
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.md5(strField15);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep17 = org.jooq.impl.DSL.select(strSelectField0, (org.jooq.SelectField<java.lang.String>) strAggregateFunction5, (org.jooq.SelectField<java.lang.String>) strField15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(strAggregateFunction5);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.rpad(strField54, (int) (byte) 0, "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField81);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jooq.Row9<org.jooq.Condition, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.Name, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.WithStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Name> conditionRow9_0 = null;
        org.jooq.Row9[] row9Array2 = new org.jooq.Row9[1];
        @SuppressWarnings("unchecked") org.jooq.Row9<org.jooq.Condition, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.Name, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.WithStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Name>[] conditionRow9Array3 = (org.jooq.Row9<org.jooq.Condition, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.Name, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.WithStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Name>[]) row9Array2;
        conditionRow9Array3[0] = conditionRow9_0;
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.Condition, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Table<?>, org.jooq.Name, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.WithStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Name>> conditionRecord9Table6 = org.jooq.impl.DSL.values(conditionRow9Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row9Array2);
        org.junit.Assert.assertNotNull(conditionRow9Array3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createTemporaryTable("");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_27 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField2, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField11, strField12, "", (org.jooq.GroupField) strField17, strField24, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = strField24.getClass();
        try {
            org.jooq.Row2<org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Class<?>> recordCreateTableAsStepRow2_29 = org.jooq.impl.DSL.row(recordCreateTableAsStep1, wildcardClass28);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateTableImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (byte) -1, '#');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.nvl("", strField9);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lower(strField13);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.ascii("");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.atan((java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_25 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField9, strField10, "", (org.jooq.GroupField) strField15, strField22, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Row1<java.lang.String> strRow1_26 = org.jooq.impl.DSL.row(strField0);
        try {
            org.jooq.Field<org.jooq.Record1<java.lang.String>> strRecord1Field27 = org.jooq.impl.DSL.field(strRow1_26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strRow1_26);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileCont((java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.deg((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jooq.Row18<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.DropViewFinalStep, org.jooq.Case, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Name, org.jooq.RowN[], org.jooq.FieldLike, org.jooq.Condition, java.lang.String[], org.jooq.CreateSequenceFinalStep, org.jooq.Name> intRecord1SelectGroupByStepRow18_0 = null;
        org.jooq.Row18[] row18Array2 = new org.jooq.Row18[1];
        @SuppressWarnings("unchecked") org.jooq.Row18<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.DropViewFinalStep, org.jooq.Case, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Name, org.jooq.RowN[], org.jooq.FieldLike, org.jooq.Condition, java.lang.String[], org.jooq.CreateSequenceFinalStep, org.jooq.Name>[] record1SelectGroupByStepRow18Array3 = (org.jooq.Row18<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.DropViewFinalStep, org.jooq.Case, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Name, org.jooq.RowN[], org.jooq.FieldLike, org.jooq.Condition, java.lang.String[], org.jooq.CreateSequenceFinalStep, org.jooq.Name>[]) row18Array2;
        record1SelectGroupByStepRow18Array3[0] = intRecord1SelectGroupByStepRow18_0;
        try {
            org.jooq.Table<org.jooq.Record18<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.DropViewFinalStep, org.jooq.Case, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Name, org.jooq.RowN[], org.jooq.FieldLike, org.jooq.Condition, java.lang.String[], org.jooq.CreateSequenceFinalStep, org.jooq.Name>> record1SelectGroupByStepRecord18Table6 = org.jooq.impl.DSL.values(record1SelectGroupByStepRow18Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row18Array2);
        org.junit.Assert.assertNotNull(record1SelectGroupByStepRow18Array3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jooq.Row16<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.WindowSpecificationRowsStep, org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.AlterTableStep, java.lang.reflect.Type, org.jooq.CreateSequenceFinalStep, org.jooq.CreateSequenceFinalStep, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>> intRecord1QuantifiedSelectRow16_0 = null;
        org.jooq.Row16[] row16Array2 = new org.jooq.Row16[1];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.WindowSpecificationRowsStep, org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.AlterTableStep, java.lang.reflect.Type, org.jooq.CreateSequenceFinalStep, org.jooq.CreateSequenceFinalStep, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>>[] record1QuantifiedSelectRow16Array3 = (org.jooq.Row16<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.WindowSpecificationRowsStep, org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.AlterTableStep, java.lang.reflect.Type, org.jooq.CreateSequenceFinalStep, org.jooq.CreateSequenceFinalStep, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>>[]) row16Array2;
        record1QuantifiedSelectRow16Array3[0] = intRecord1QuantifiedSelectRow16_0;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.WindowSpecificationRowsStep, org.jooq.WindowOverStep<java.lang.String>, java.lang.reflect.Type, org.jooq.AlterTableStep, java.lang.reflect.Type, org.jooq.CreateSequenceFinalStep, org.jooq.CreateSequenceFinalStep, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>>> record1QuantifiedSelectRecord16Table6 = org.jooq.impl.DSL.values(record1QuantifiedSelectRow16Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row16Array2);
        org.junit.Assert.assertNotNull(record1QuantifiedSelectRow16Array3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep1 = org.jooq.impl.DSL.alterSequence("hi!");
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep79 = org.jooq.impl.DSL.groupConcatDistinct(strField54);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction80 = org.jooq.impl.DSL.maxDistinct(strField54);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep79);
        org.junit.Assert.assertNotNull(strAggregateFunction80);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jooq.Row3[] row3Array1 = new org.jooq.Row3[0];
        @SuppressWarnings("unchecked") org.jooq.Row3<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Keyword, org.jooq.Condition[]>[] selectFieldRow10Row3Array2 = (org.jooq.Row3<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Keyword, org.jooq.Condition[]>[]) row3Array1;
        try {
            org.jooq.Table<org.jooq.Record3<org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Keyword, org.jooq.Condition[]>> selectFieldRow10Record3Table3 = org.jooq.impl.DSL.values(selectFieldRow10Row3Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row3Array1);
        org.junit.Assert.assertNotNull(selectFieldRow10Row3Array2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jooq.Row10[] row10Array1 = new org.jooq.Row10[0];
        @SuppressWarnings("unchecked") org.jooq.Row10<org.jooq.Param<java.lang.String>, org.jooq.WindowSpecification, org.jooq.Field<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.GroupConcatOrderByStep, org.jooq.WindowSpecificationRowsStep, java.lang.String[], org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>>[] strParamRow10Array2 = (org.jooq.Row10<org.jooq.Param<java.lang.String>, org.jooq.WindowSpecification, org.jooq.Field<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.GroupConcatOrderByStep, org.jooq.WindowSpecificationRowsStep, java.lang.String[], org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>>[]) row10Array1;
        try {
            org.jooq.Table<org.jooq.Record10<org.jooq.Param<java.lang.String>, org.jooq.WindowSpecification, org.jooq.Field<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.GroupConcatOrderByStep, org.jooq.WindowSpecificationRowsStep, java.lang.String[], org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>>> strParamRecord10Table3 = org.jooq.impl.DSL.values(strParamRow10Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row10Array1);
        org.junit.Assert.assertNotNull(strParamRow10Array2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField79 = null;
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.lpad(strField79, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.cast(strField3, strField82);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField83);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jooq.Row15<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.CreateIndexStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Condition[], java.lang.String, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectDistinctOnStepRow15_0 = null;
        org.jooq.Row15[] row15Array2 = new org.jooq.Row15[1];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.CreateIndexStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Condition[], java.lang.String, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>[] record1SelectDistinctOnStepRow15Array3 = (org.jooq.Row15<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.CreateIndexStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Condition[], java.lang.String, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>[]) row15Array2;
        record1SelectDistinctOnStepRow15Array3[0] = intRecord1SelectDistinctOnStepRow15_0;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.CreateIndexStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Condition[], java.lang.String, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>> record1SelectDistinctOnStepRecord15Table6 = org.jooq.impl.DSL.values(record1SelectDistinctOnStepRow15Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row15Array2);
        org.junit.Assert.assertNotNull(record1SelectDistinctOnStepRow15Array3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.atan((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jooq.SelectField<java.lang.String> strSelectField0 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.groupConcat(strField2, "");
        try {
            org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep5 = org.jooq.impl.DSL.selectDistinct(strSelectField0, (org.jooq.SelectField<java.lang.String>) strAggregateFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jooq.Field<java.sql.Timestamp> timestampField0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField2 = org.jooq.impl.DSL.timestampDiff(timestampField0, timestamp1);
        org.junit.Assert.assertNotNull(dayToSecondField2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_25 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField9, strField10, "", (org.jooq.GroupField) strField15, strField22, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<org.jooq.Record10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>> strSelectFieldRecord10Field26 = org.jooq.impl.DSL.field(strSelectFieldRow10_25);
        org.jooq.Field<org.jooq.Record10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>> strSelectFieldRecord10Field27 = org.jooq.impl.DSL.field(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strSelectFieldRecord10Field26);
        org.junit.Assert.assertNotNull(strSelectFieldRecord10Field27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lower(strField5);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.dateDiff(date0, date1);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, 100);
        org.junit.Assert.assertNotNull(intField2);
        org.junit.Assert.assertNotNull(intRecord1Table4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) 1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.prior(strField5);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cot((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect2 = org.jooq.impl.DSL.all((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        try {
            org.jooq.Param<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>> intRecord1QuantifiedSelectParam3 = org.jooq.impl.DSL.inline(intRecord1QuantifiedSelect2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.QuantifiedSelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding(0);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) '#');
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField3, (int) '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.trim(strField3);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray1);
        org.jooq.Table<?> wildcardTable3 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray1);
        org.jooq.WithAsStep withAsStep4 = org.jooq.impl.DSL.withRecursive("", strArray1);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence5 = org.jooq.impl.DSL.sequenceByName(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(name2);
        org.junit.Assert.assertNotNull(wildcardTable3);
        org.junit.Assert.assertNotNull(withAsStep4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jooq.Row22<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, java.lang.Comparable<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateViewAsStep, org.jooq.Row, org.jooq.WithAsStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.AggregateFunction<java.lang.String>> intRecord1SelectForUpdateStepRow22_0 = null;
        org.jooq.Row22[] row22Array2 = new org.jooq.Row22[1];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, java.lang.Comparable<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateViewAsStep, org.jooq.Row, org.jooq.WithAsStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.AggregateFunction<java.lang.String>>[] record1SelectForUpdateStepRow22Array3 = (org.jooq.Row22<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, java.lang.Comparable<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateViewAsStep, org.jooq.Row, org.jooq.WithAsStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.AggregateFunction<java.lang.String>>[]) row22Array2;
        record1SelectForUpdateStepRow22Array3[0] = intRecord1SelectForUpdateStepRow22_0;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropSequenceFinalStep, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, java.lang.Comparable<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateViewAsStep, org.jooq.Row, org.jooq.WithAsStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.AggregateFunction<java.lang.String>>> record1SelectForUpdateStepRecord22Table6 = org.jooq.impl.DSL.values(record1SelectForUpdateStepRow22Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row22Array2);
        org.junit.Assert.assertNotNull(record1SelectForUpdateStepRow22Array3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jooq.Condition[] conditionArray0 = new org.jooq.Condition[] {};
        org.jooq.Condition condition1 = org.jooq.impl.DSL.or(conditionArray0);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(condition1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.jooq.Field<java.lang.Boolean> booleanField4 = org.jooq.impl.DSL.not((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(conditionArray0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(condition3);
        org.junit.Assert.assertNotNull(booleanField4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.denseRank(wildcardFieldArray5);
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery9 = org.jooq.impl.DSL.resultQuery("hi!", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Query query10 = org.jooq.impl.DSL.query("", (org.jooq.QueryPart[]) wildcardFieldArray5);
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction8);
        org.junit.Assert.assertNotNull(recordResultQuery9);
        org.junit.Assert.assertNotNull(query10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep79 = org.jooq.impl.DSL.groupConcatDistinct(strField54);
        org.jooq.Field<java.lang.String> strField80 = null;
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.lpad(strField80, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField83);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep86 = org.jooq.impl.DSL.lag(strField83, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.mid(strField83, 10, (-1));
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.md5(strField89);
        org.jooq.Param<java.lang.String> strParam91 = org.jooq.impl.DSL.value((java.lang.Object) groupConcatOrderByStep79, strField89);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction92 = org.jooq.impl.DSL.max((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep93 = org.jooq.impl.DSL.lastValue((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep79);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep86);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strParam91);
        org.junit.Assert.assertNotNull(strAggregateFunction92);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep93);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.space(intField9);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.ltrim(strField10);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.lpad(strField18, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField31 = null;
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.lpad(strField31, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_37 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField12, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField21, strField22, "", (org.jooq.GroupField) strField27, strField34, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.space(intField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.ltrim(strField39);
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.concat("hi!", strField42);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", strField51);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.lpad(strField55, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField63 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.space(intField63);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.ltrim(strField64);
        org.jooq.Field<java.lang.Integer> intField66 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.space(intField66);
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField72 = null;
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.lpad(strField72, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep78 = org.jooq.impl.DSL.lag(strField75, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_79 = org.jooq.impl.DSL.row(strField2, strField4, strField10, strField12, strField39, strField49, strField55, strField62, strField65, strField67, strField71, strField75);
        org.jooq.Field<java.lang.String> strField81 = null;
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.lpad(strField81, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.concat("hi!", strField81);
        org.jooq.Field<java.lang.String> strField87 = org.jooq.impl.DSL.nullif(strField81, "");
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.nullif(strField65, strField81);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.nvl("hi!", strField65);
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.trim(strField89);
        org.jooq.Field<java.lang.Integer> intField91 = org.jooq.impl.DSL.octetLength(strField90);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep78);
        org.junit.Assert.assertNotNull(strRow12_79);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strField85);
        org.junit.Assert.assertNotNull(strField87);
        org.junit.Assert.assertNotNull(strField88);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(intField91);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.concat("hi!", strField12);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.left(strField16, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.right(strField16, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.concat("hi!", strField22);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.left(strField26, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.right(strField26, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.replace(strField10, strField20, strField26);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.rtrim(strField26);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.defaultValue(strField26);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for ");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jooq.Row12<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.GroupConcatSeparatorStep, java.lang.Comparable<java.lang.String>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, java.lang.Object, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Condition[]>[] record1SelectWhereStepRow12Array0 = null;
        try {
            org.jooq.Table<org.jooq.Record12<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.GroupConcatSeparatorStep, java.lang.Comparable<java.lang.String>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, java.lang.Object, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Condition[]>> record1SelectWhereStepRecord12Table1 = org.jooq.impl.DSL.values(record1SelectWhereStepRow12Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField6, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField6);
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(strField11);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.sign((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.bitLength("hi!");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression1 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray3 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray4 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray3;
        wildcardCommonTableExpressionArray4[0] = wildcardCommonTableExpression1;
        org.jooq.WithStep withStep7 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray4);
        org.jooq.Condition condition8 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray4);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction9 = org.jooq.impl.DSL.every(condition8);
        org.junit.Assert.assertNotNull(commonTableExpressionArray3);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(withStep7);
        org.junit.Assert.assertNotNull(condition8);
        org.junit.Assert.assertNotNull(booleanAggregateFunction9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) 10L, (java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.Field<java.lang.Boolean> booleanField4 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction5 = org.jooq.impl.DSL.every(booleanField4);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction5);
        try {
            org.jooq.Field<org.jooq.Condition> conditionField7 = org.jooq.impl.DSL.isnull(condition2, condition6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.FieldCondition is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(booleanField4);
        org.junit.Assert.assertNotNull(booleanAggregateFunction5);
        org.junit.Assert.assertNotNull(condition6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.denseRank(wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat(wildcardFieldArray5);
        org.jooq.Field<java.lang.Object> objField10 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray5);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep12 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(objField10);
        org.junit.Assert.assertNotNull(objField11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        try {
            org.jooq.Param<org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectConnectByStepParam1 = org.jooq.impl.DSL.val((org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.rpad(strField5, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("", strField8);
        org.jooq.Param<java.lang.String> strParam10 = org.jooq.impl.DSL.val((java.lang.Object) (byte) 1, strField8);
        org.jooq.Param<java.lang.String> strParam12 = org.jooq.impl.DSL.inline((java.lang.CharSequence) "hi!");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep13 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strParam10, (org.jooq.SelectField<java.lang.String>) strParam12);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strParam10);
        org.junit.Assert.assertNotNull(strParam12);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.maxDistinct(strField1);
        try {
            org.jooq.Param<org.jooq.AggregateFunction<java.lang.String>> strAggregateFunctionParam5 = org.jooq.impl.DSL.inline(strAggregateFunction4);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.Function is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] {};
        org.jooq.Condition condition2 = org.jooq.impl.DSL.or(conditionArray1);
        org.jooq.Field<java.lang.Object> objField3 = org.jooq.impl.DSL.field("hi!", (java.lang.Object[]) conditionArray1);
        org.junit.Assert.assertNotNull(conditionArray1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(objField3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", 0);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.Number number0 = null;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileCont(number0);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jooq.Field<java.sql.Time> timeField1 = org.jooq.impl.DSL.time("hi!");
        org.junit.Assert.assertNotNull(timeField1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jooq.Row15<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SortField<?>[], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.SelectField<java.lang.String>, org.jooq.Field<?>[], org.jooq.DropTableFinalStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Keyword, org.jooq.Keyword, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.GroupConcatSeparatorStep>[] bigIntegerSequenceRow15Array0 = null;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.Sequence<java.math.BigInteger>, org.jooq.SortField<?>[], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.SelectField<java.lang.String>, org.jooq.Field<?>[], org.jooq.DropTableFinalStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Keyword, org.jooq.Keyword, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.GroupConcatSeparatorStep>> bigIntegerSequenceRecord15Table1 = org.jooq.impl.DSL.values(bigIntegerSequenceRow15Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField1 = null;
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField4 = org.jooq.impl.DSL.timestampAdd(timestampField1, (java.lang.Number) 10, datePart3);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField5 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestampField4);
        org.jooq.Field<java.sql.Timestamp> timestampField6 = null;
        org.jooq.DatePart datePart8 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField9 = org.jooq.impl.DSL.timestampAdd(timestampField6, (java.lang.Number) 10, datePart8);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField10 = org.jooq.impl.DSL.timestampDiff(timestampField4, timestampField9);
        org.junit.Assert.assertNotNull(timestampField4);
        org.junit.Assert.assertNotNull(dayToSecondField5);
        org.junit.Assert.assertNotNull(timestampField9);
        org.junit.Assert.assertNotNull(dayToSecondField10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline('a');
        org.junit.Assert.assertNotNull(strParam1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep9 = org.jooq.impl.DSL.choose(strField5);
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep10 = org.jooq.impl.DSL.arrayAgg(strField5);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strCaseValueStep9);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jooq.Field<java.sql.Date> dateField0 = org.jooq.impl.DSL.currentDate();
        java.sql.Date date1 = null;
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Date> dateField4 = org.jooq.impl.DSL.dateAdd(date1, (java.lang.Number) (byte) 100, datePart3);
        java.sql.Date date5 = null;
        org.jooq.Field<java.sql.Date> dateField7 = org.jooq.impl.DSL.dateSub(date5, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.dateDiff(dateField4, dateField7);
        org.jooq.DatePart datePart10 = null;
        org.jooq.Field<java.sql.Date> dateField11 = org.jooq.impl.DSL.dateAdd(dateField7, (java.lang.Number) (-1.0d), datePart10);
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.dateDiff(dateField0, dateField7);
        org.junit.Assert.assertNotNull(dateField0);
        org.junit.Assert.assertNotNull(dateField4);
        org.junit.Assert.assertNotNull(dateField7);
        org.junit.Assert.assertNotNull(intField8);
        org.junit.Assert.assertNotNull(dateField11);
        org.junit.Assert.assertNotNull(intField12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField6);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.concat("hi!", strField11);
        org.jooq.Field<java.lang.Integer> intField16 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.space(intField16);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.ltrim(strField17);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField34 = null;
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.lpad(strField34, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_44 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField19, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField28, strField29, "", (org.jooq.GroupField) strField34, strField41, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField45 = null;
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.space(intField45);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.ltrim(strField46);
        org.jooq.Field<java.lang.String> strField49 = null;
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.lpad(strField49, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.concat("hi!", strField49);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.lpad(strField53, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.concat("hi!", strField58);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.lpad(strField62, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField66 = null;
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.lpad(strField66, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField70 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.space(intField70);
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.ltrim(strField71);
        org.jooq.Field<java.lang.Integer> intField73 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.space(intField73);
        org.jooq.Field<java.lang.String> strField75 = null;
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.lpad(strField75, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField79 = null;
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.lpad(strField79, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField82);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep85 = org.jooq.impl.DSL.lag(strField82, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_86 = org.jooq.impl.DSL.row(strField9, strField11, strField17, strField19, strField46, strField56, strField62, strField69, strField72, strField74, strField78, strField82);
        org.jooq.Field<java.lang.String> strField88 = null;
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.lpad(strField88, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.concat("hi!", strField88);
        org.jooq.Field<java.lang.String> strField95 = org.jooq.impl.DSL.lpad(strField92, (int) (byte) 10, '4');
        org.jooq.SelectSelectStep<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4SelectSelectStep96 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField2, (org.jooq.SelectField<java.lang.String>) strField6, (org.jooq.SelectField<java.lang.String>) strField17, (org.jooq.SelectField<java.lang.String>) strField95);
        org.jooq.Field<java.lang.String> strField99 = org.jooq.impl.DSL.mid(strField95, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep85);
        org.junit.Assert.assertNotNull(strRow12_86);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(strField95);
        org.junit.Assert.assertNotNull(strRecord4SelectSelectStep96);
        org.junit.Assert.assertNotNull(strField99);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction13 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray6);
        org.jooq.GroupField groupField14 = org.jooq.impl.DSL.rollup(wildcardFieldArray6);
        org.jooq.Table<org.jooq.Record> recordTable15 = org.jooq.impl.DSL.table("hi!", (java.lang.Object[]) wildcardFieldArray6);
        try {
            org.jooq.Table<?> wildcardTable16 = org.jooq.impl.DSL.unnest((java.lang.Object[]) wildcardFieldArray6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Field is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(objField11);
        org.junit.Assert.assertNotNull(objField12);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(groupField14);
        org.junit.Assert.assertNotNull(recordTable15);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep1 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        try {
            org.jooq.Field<org.jooq.Select<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectField4 = org.jooq.impl.DSL.nullif((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, (org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(condition3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) 'a');
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.ascii(strField2);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(intField3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence2 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep3 = org.jooq.impl.DSL.createSequence(bigIntegerSequence2);
        try {
            org.jooq.Param<org.jooq.Attachable> attachableParam4 = org.jooq.impl.DSL.param("hi!", (org.jooq.Attachable) createSequenceFinalStep3);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateSequenceImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigIntegerSequence2);
        org.junit.Assert.assertNotNull(createSequenceFinalStep3);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jooq.Row1<org.jooq.Condition[]> conditionArrayRow1_0 = null;
        org.jooq.Row1[] row1Array2 = new org.jooq.Row1[1];
        @SuppressWarnings("unchecked") org.jooq.Row1<org.jooq.Condition[]>[] conditionArrayRow1Array3 = (org.jooq.Row1<org.jooq.Condition[]>[]) row1Array2;
        conditionArrayRow1Array3[0] = conditionArrayRow1_0;
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.Condition[]>> conditionArrayRecord1Table6 = org.jooq.impl.DSL.values(conditionArrayRow1Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row1Array2);
        org.junit.Assert.assertNotNull(conditionArrayRow1Array3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField6, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField6);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.coalesce(strField6, "");
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, 1, '4');
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction18 = org.jooq.impl.DSL.groupConcat(strField13, "");
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strAggregateFunction18);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.nullif(strField1, "");
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(strField1, "");
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_25 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField9, strField10, "", (org.jooq.GroupField) strField15, strField22, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strField22.getClass();
        try {
            org.jooq.CaseValueStep<java.lang.reflect.GenericDeclaration> genericDeclarationCaseValueStep27 = org.jooq.impl.DSL.choose((java.lang.reflect.GenericDeclaration) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction80 = org.jooq.impl.DSL.listAgg(strField48, "");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction80);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (byte) 0);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction10 = org.jooq.impl.DSL.max(strField5);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strAggregateFunction10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jooq.Row8<org.jooq.DSLContext, java.lang.reflect.AnnotatedElement, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>> dSLContextRow8_0 = null;
        org.jooq.Row8[] row8Array2 = new org.jooq.Row8[1];
        @SuppressWarnings("unchecked") org.jooq.Row8<org.jooq.DSLContext, java.lang.reflect.AnnotatedElement, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>>[] dSLContextRow8Array3 = (org.jooq.Row8<org.jooq.DSLContext, java.lang.reflect.AnnotatedElement, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>>[]) row8Array2;
        dSLContextRow8Array3[0] = dSLContextRow8_0;
        try {
            org.jooq.Table<org.jooq.Record8<org.jooq.DSLContext, java.lang.reflect.AnnotatedElement, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField<java.lang.String>, org.jooq.DropTableFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>>> dSLContextRecord8Table6 = org.jooq.impl.DSL.values(dSLContextRow8Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row8Array2);
        org.junit.Assert.assertNotNull(dSLContextRow8Array3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cot((java.lang.Number) 1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.rpad(strField5, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("", strField8);
        org.jooq.Param<java.lang.String> strParam10 = org.jooq.impl.DSL.val((java.lang.Object) (byte) 1, strField8);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.rtrim((org.jooq.Field<java.lang.String>) strParam10);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strParam10);
        org.junit.Assert.assertNotNull(strField11);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cot((java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.replace(strField5, "");
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.concat("hi!", strField12);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (byte) -1, '#');
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField19, 0, "");
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField29);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep32 = org.jooq.impl.DSL.lag(strField29, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.mid(strField29, 10, (-1));
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.replace(strField10, strField19, strField35);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField36);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField9, (int) 'a');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField9);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jooq.Field<java.lang.String> strField0 = null;
        try {
            org.jooq.Table<?> wildcardTable1 = org.jooq.impl.DSL.table(strField0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jooq.Row7<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.WithAsStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>>[] record1IterableRow7Array0 = null;
        try {
            org.jooq.Table<org.jooq.Record7<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.WithAsStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>>> record1IterableRecord7Table1 = org.jooq.impl.DSL.values(record1IterableRow7Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.timestamp("");
        org.junit.Assert.assertNotNull(timestampField1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jooq.Row19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupField> intRecord1SelectOrderByStepRow19_0 = null;
        org.jooq.Row19[] row19Array2 = new org.jooq.Row19[1];
        @SuppressWarnings("unchecked") org.jooq.Row19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupField>[] record1SelectOrderByStepRow19Array3 = (org.jooq.Row19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupField>[]) row19Array2;
        record1SelectOrderByStepRow19Array3[0] = intRecord1SelectOrderByStepRow19_0;
        try {
            org.jooq.Table<org.jooq.Record19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupField>> record1SelectOrderByStepRecord19Table6 = org.jooq.impl.DSL.values(record1SelectOrderByStepRow19Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row19Array2);
        org.junit.Assert.assertNotNull(record1SelectOrderByStepRow19Array3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", '#');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str2 = org.jooq.impl.DSL.escape("hi!", ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.level();
        org.junit.Assert.assertNotNull(intField0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing((int) (byte) 1);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jooq.Schema schema1 = org.jooq.impl.DSL.schemaByName("hi!");
        try {
            org.jooq.Param<org.jooq.Schema> schemaParam2 = org.jooq.impl.DSL.val(schema1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SchemaImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep0 = null;
        org.jooq.Param<org.jooq.ArrayAggOrderByStep<java.lang.String[]>> strArrayArrayAggOrderByStepParam1 = org.jooq.impl.DSL.inline(strArrayArrayAggOrderByStep0);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStepParam1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.String str2 = org.jooq.impl.DSL.escape("hi!", '#');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jooq.Operator operator0 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray4);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.jooq.Condition[] conditionArray8 = new org.jooq.Condition[] { condition7 };
        org.jooq.Condition condition9 = org.jooq.impl.DSL.and(conditionArray8);
        org.jooq.Condition condition10 = org.jooq.impl.DSL.and(conditionArray8);
        org.jooq.Condition condition11 = org.jooq.impl.DSL.or(conditionArray8);
        try {
            org.jooq.Condition condition12 = org.jooq.impl.DSL.condition(operator0, conditionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The argument 'operator' must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(groupField5);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep6);
        org.junit.Assert.assertNotNull(condition7);
        org.junit.Assert.assertNotNull(conditionArray8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(condition10);
        org.junit.Assert.assertNotNull(condition11);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep1 = org.jooq.impl.DSL.ntile((int) (short) 1);
        org.junit.Assert.assertNotNull(intWindowOverStep1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jooq.Row17<java.io.Serializable, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SQL, java.lang.Class<?>, org.jooq.Query, org.jooq.Case, java.lang.reflect.Type, org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.CharSequence, java.lang.Class<?>, java.lang.reflect.AnnotatedElement, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>> serializableRow17_0 = null;
        org.jooq.Row17[] row17Array2 = new org.jooq.Row17[1];
        @SuppressWarnings("unchecked") org.jooq.Row17<java.io.Serializable, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SQL, java.lang.Class<?>, org.jooq.Query, org.jooq.Case, java.lang.reflect.Type, org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.CharSequence, java.lang.Class<?>, java.lang.reflect.AnnotatedElement, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>>[] serializableRow17Array3 = (org.jooq.Row17<java.io.Serializable, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SQL, java.lang.Class<?>, org.jooq.Query, org.jooq.Case, java.lang.reflect.Type, org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.CharSequence, java.lang.Class<?>, java.lang.reflect.AnnotatedElement, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>>[]) row17Array2;
        serializableRow17Array3[0] = serializableRow17_0;
        try {
            org.jooq.Table<org.jooq.Record17<java.io.Serializable, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SQL, java.lang.Class<?>, org.jooq.Query, org.jooq.Case, java.lang.reflect.Type, org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.CharSequence, java.lang.Class<?>, java.lang.reflect.AnnotatedElement, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>>> serializableRecord17Table6 = org.jooq.impl.DSL.values(serializableRow17Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row17Array2);
        org.junit.Assert.assertNotNull(serializableRow17Array3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenPreceding((int) (short) 1);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.trunc(timestamp0);
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField4 = org.jooq.impl.DSL.timestampAdd(timestampField1, (java.lang.Number) 10L, datePart3);
        java.sql.Timestamp timestamp5 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField6 = org.jooq.impl.DSL.timestampDiff(timestampField4, timestamp5);
        org.junit.Assert.assertNotNull(timestampField1);
        org.junit.Assert.assertNotNull(timestampField4);
        org.junit.Assert.assertNotNull(dayToSecondField6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.space(intField4);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.ltrim(strField5);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction7 = org.jooq.impl.DSL.minDistinct(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.lpad(strField18, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_33 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField8, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField17, strField18, "", (org.jooq.GroupField) strField23, strField30, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction7, strField30);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction7, "");
        org.jooq.Field<?> wildcardField37 = null;
        org.jooq.Field[] fieldArray39 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray40 = (org.jooq.Field<?>[]) fieldArray39;
        wildcardFieldArray40[0] = wildcardField37;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction43 = org.jooq.impl.DSL.denseRank(wildcardFieldArray40);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction44 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray40);
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.least(strField36, wildcardFieldArray40);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction49 = org.jooq.impl.DSL.groupConcat(strField47, "");
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.rpad(strField47, 100, "");
        org.jooq.Field<java.lang.String> strField53 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.decode(strField36, strField52, strField53);
        org.jooq.Field<java.lang.String> strField56 = null;
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.lpad(strField56, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.concat("hi!", strField56);
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.left(strField60, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.right(strField60, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.left(strField64, (int) 'a');
        org.jooq.Field<java.lang.Integer> intField67 = null;
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.space(intField67);
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.ltrim(strField68);
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.lpad(strField68, 10, ' ');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.left("hi!", (int) '4');
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep76 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField68, (org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.SelectSelectStep<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4SelectSelectStep77 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strAggregateFunction3, (org.jooq.SelectField<java.lang.String>) strField36, (org.jooq.SelectField<java.lang.String>) strField64, (org.jooq.SelectField<java.lang.String>) strField68);
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep78 = org.jooq.impl.DSL.choose(strField64);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strAggregateFunction7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(fieldArray39);
        org.junit.Assert.assertNotNull(wildcardFieldArray40);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction43);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strAggregateFunction49);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep76);
        org.junit.Assert.assertNotNull(strRecord4SelectSelectStep77);
        org.junit.Assert.assertNotNull(strCaseValueStep78);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.RowN rowN2 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray0);
        try {
            org.jooq.Table<org.jooq.Record> recordTable3 = org.jooq.impl.DSL.tableByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(rowN2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Table<org.jooq.Record> recordTable3 = org.jooq.impl.DSL.table(name2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jooq.Row13[] row13Array1 = new org.jooq.Row13[0];
        @SuppressWarnings("unchecked") org.jooq.Row13<org.jooq.CommonTableExpression<?>[], org.jooq.SQL, org.jooq.Sequence<java.math.BigInteger>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DSLContext, org.jooq.RowN, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropIndexFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Row1<java.lang.String>, org.jooq.CommonTableExpression<?>[]>[] wildcardCommonTableExpressionArrayRow13Array2 = (org.jooq.Row13<org.jooq.CommonTableExpression<?>[], org.jooq.SQL, org.jooq.Sequence<java.math.BigInteger>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DSLContext, org.jooq.RowN, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropIndexFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Row1<java.lang.String>, org.jooq.CommonTableExpression<?>[]>[]) row13Array1;
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.CommonTableExpression<?>[], org.jooq.SQL, org.jooq.Sequence<java.math.BigInteger>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.DSLContext, org.jooq.RowN, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropIndexFinalStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Row1<java.lang.String>, org.jooq.CommonTableExpression<?>[]>> wildcardCommonTableExpressionArrayRecord13Table3 = org.jooq.impl.DSL.values(wildcardCommonTableExpressionArrayRow13Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row13Array1);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArrayRow13Array2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.lpad(strField3, (int) (short) 100, '4');
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField81);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField81);
        org.junit.Assert.assertNotNull(strField82);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jooq.Row3[] row3Array1 = new org.jooq.Row3[0];
        @SuppressWarnings("unchecked") org.jooq.Row3<org.jooq.Table<?>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>>[] wildcardTableRow3Array2 = (org.jooq.Row3<org.jooq.Table<?>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>>[]) row3Array1;
        try {
            org.jooq.Table<org.jooq.Record3<org.jooq.Table<?>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>>> wildcardTableRecord3Table3 = org.jooq.impl.DSL.values(wildcardTableRow3Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row3Array1);
        org.junit.Assert.assertNotNull(wildcardTableRow3Array2);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.bitCount((java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsFollowing(0);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sinh((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.space(intField9);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.ltrim(strField10);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.lpad(strField18, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField31 = null;
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.lpad(strField31, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_37 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField12, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField21, strField22, "", (org.jooq.GroupField) strField27, strField34, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.space(intField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.ltrim(strField39);
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.concat("hi!", strField42);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", strField51);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.lpad(strField55, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField63 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.space(intField63);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.ltrim(strField64);
        org.jooq.Field<java.lang.Integer> intField66 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.space(intField66);
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField72 = null;
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.lpad(strField72, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep78 = org.jooq.impl.DSL.lag(strField75, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_79 = org.jooq.impl.DSL.row(strField2, strField4, strField10, strField12, strField39, strField49, strField55, strField62, strField65, strField67, strField71, strField75);
        org.jooq.Field<java.lang.Integer> intField80 = org.jooq.impl.DSL.bitLength(strField71);
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.nullif("hi!", strField71);
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction83 = org.jooq.impl.DSL.listAgg(strField81, "hi!");
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep78);
        org.junit.Assert.assertNotNull(strRow12_79);
        org.junit.Assert.assertNotNull(intField80);
        org.junit.Assert.assertNotNull(strField81);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction83);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.escape((org.jooq.Field<java.lang.String>) strAggregateFunction3, 'a');
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.concat("hi!", strField7);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.left(strField11, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.right(strField11, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.md5(strField11);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.isnull(strField5, strField11);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.substring(strField17, (-1));
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.escape(strField17, '4');
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField21);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.SQL sQL13 = org.jooq.impl.DSL.sql("", (org.jooq.QueryPart[]) wildcardFieldArray6);
        try {
            org.jooq.Param<org.jooq.SQL> sQLParam14 = org.jooq.impl.DSL.value(sQL13);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SQLImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(objField11);
        org.junit.Assert.assertNotNull(objField12);
        org.junit.Assert.assertNotNull(sQL13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jooq.Row8<org.jooq.CreateViewAsStep, org.jooq.QueryPart, org.jooq.GroupField, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, org.jooq.GroupConcatSeparatorStep, org.jooq.Condition[]> createViewAsStepRow8_0 = null;
        org.jooq.Row8[] row8Array2 = new org.jooq.Row8[1];
        @SuppressWarnings("unchecked") org.jooq.Row8<org.jooq.CreateViewAsStep, org.jooq.QueryPart, org.jooq.GroupField, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, org.jooq.GroupConcatSeparatorStep, org.jooq.Condition[]>[] createViewAsStepRow8Array3 = (org.jooq.Row8<org.jooq.CreateViewAsStep, org.jooq.QueryPart, org.jooq.GroupField, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, org.jooq.GroupConcatSeparatorStep, org.jooq.Condition[]>[]) row8Array2;
        createViewAsStepRow8Array3[0] = createViewAsStepRow8_0;
        try {
            org.jooq.Table<org.jooq.Record8<org.jooq.CreateViewAsStep, org.jooq.QueryPart, org.jooq.GroupField, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, org.jooq.GroupConcatSeparatorStep, org.jooq.Condition[]>> createViewAsStepRecord8Table6 = org.jooq.impl.DSL.values(createViewAsStepRow8Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row8Array2);
        org.junit.Assert.assertNotNull(createViewAsStepRow8Array3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction7 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenPreceding((int) (short) 10);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.percentRank();
        java.lang.Class<?> wildcardClass1 = bigDecimalWindowOverStep0.getClass();
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_27 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField2, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField11, strField12, "", (org.jooq.GroupField) strField17, strField24, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = strField24.getClass();
        org.jooq.Condition[] conditionArray29 = new org.jooq.Condition[] {};
        org.jooq.Condition condition30 = org.jooq.impl.DSL.or(conditionArray29);
        try {
            org.jooq.Field<java.lang.Object[]> objArrayField31 = org.jooq.impl.DSL.decode((java.lang.reflect.AnnotatedElement) wildcardClass1, (java.lang.reflect.AnnotatedElement) wildcardClass28, (java.lang.Object[]) conditionArray29);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(conditionArray29);
        org.junit.Assert.assertNotNull(condition30);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.escape(strField5, '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.rtrim(strField11);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.nvl(strField11, "");
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.SQL sQL6 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.rank(wildcardFieldArray3);
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction9 = org.jooq.impl.DSL.countDistinct(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(groupField8);
        org.junit.Assert.assertNotNull(intAggregateFunction9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.nullif("", strField5);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] {};
        org.jooq.Condition condition2 = org.jooq.impl.DSL.or(conditionArray1);
        org.jooq.Table<org.jooq.Record> recordTable3 = org.jooq.impl.DSL.table("hi!", (org.jooq.QueryPart[]) conditionArray1);
        org.jooq.Condition condition4 = org.jooq.impl.DSL.or(conditionArray1);
        org.junit.Assert.assertNotNull(conditionArray1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(recordTable3);
        org.junit.Assert.assertNotNull(condition4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jooq.Row22[] row22Array1 = new org.jooq.Row22[0];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.DSLContext, org.jooq.GroupField, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.Field<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.RowN, org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.String[], org.jooq.SelectField<java.lang.String>, org.jooq.Attachable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.AlterTableStep>[] dSLContextRow22Array2 = (org.jooq.Row22<org.jooq.DSLContext, org.jooq.GroupField, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.Field<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.RowN, org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.String[], org.jooq.SelectField<java.lang.String>, org.jooq.Attachable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.AlterTableStep>[]) row22Array1;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.DSLContext, org.jooq.GroupField, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.Field<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.RowN, org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.String[], org.jooq.SelectField<java.lang.String>, org.jooq.Attachable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.AlterTableStep>> dSLContextRecord22Table3 = org.jooq.impl.DSL.values((org.jooq.Row22<org.jooq.DSLContext, org.jooq.GroupField, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.GroupConcatOrderByStep, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.Field<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.RowN, org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.String[], org.jooq.SelectField<java.lang.String>, org.jooq.Attachable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.AlterTableStep>[]) row22Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row22Array1);
        org.junit.Assert.assertNotNull(dSLContextRow22Array2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(timestampField2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Table<?> wildcardTable2 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray0);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence3 = org.jooq.impl.DSL.sequenceByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(wildcardTable2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.atan2((java.lang.Number) (short) -1, (java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep79 = org.jooq.impl.DSL.groupConcatDistinct(strField54);
        org.jooq.Field<java.lang.String> strField80 = null;
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.lpad(strField80, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField83);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep86 = org.jooq.impl.DSL.lag(strField83, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.mid(strField83, 10, (-1));
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.md5(strField89);
        org.jooq.Param<java.lang.String> strParam91 = org.jooq.impl.DSL.value((java.lang.Object) groupConcatOrderByStep79, strField89);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction92 = org.jooq.impl.DSL.max((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep95 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) strAggregateFunction92, (int) (byte) 100, "");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep79);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep86);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strParam91);
        org.junit.Assert.assertNotNull(strAggregateFunction92);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep95);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jooq.Row12[] row12Array1 = new org.jooq.Row12[0];
        @SuppressWarnings("unchecked") org.jooq.Row12<org.jooq.Row1<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.String, java.lang.Object[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.CreateSequenceFinalStep, org.jooq.WindowSpecificationOrderByStep, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.WindowBeforeOverStep<java.lang.String>>[] strRow1Row12Array2 = (org.jooq.Row12<org.jooq.Row1<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.String, java.lang.Object[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.CreateSequenceFinalStep, org.jooq.WindowSpecificationOrderByStep, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.WindowBeforeOverStep<java.lang.String>>[]) row12Array1;
        try {
            org.jooq.Table<org.jooq.Record12<org.jooq.Row1<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.String, java.lang.Object[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.CreateSequenceFinalStep, org.jooq.WindowSpecificationOrderByStep, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.WindowBeforeOverStep<java.lang.String>>> strRow1Record12Table3 = org.jooq.impl.DSL.values((org.jooq.Row12<org.jooq.Row1<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, java.lang.String, java.lang.Object[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.CreateSequenceFinalStep, org.jooq.WindowSpecificationOrderByStep, org.jooq.Scope, java.lang.reflect.AnnotatedElement, org.jooq.WindowBeforeOverStep<java.lang.String>>[]) row12Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row12Array1);
        org.junit.Assert.assertNotNull(strRow1Row12Array2);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jooq.Row19[] row19Array1 = new org.jooq.Row19[0];
        @SuppressWarnings("unchecked") org.jooq.Row19<org.jooq.WithAsStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Row1<java.lang.String>, org.jooq.TableLike<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Query, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>>[] withAsStepRow19Array2 = (org.jooq.Row19<org.jooq.WithAsStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Row1<java.lang.String>, org.jooq.TableLike<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Query, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>>[]) row19Array1;
        try {
            org.jooq.Table<org.jooq.Record19<org.jooq.WithAsStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.Row1<java.lang.String>, org.jooq.TableLike<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Query, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>>> withAsStepRecord19Table3 = org.jooq.impl.DSL.values(withAsStepRow19Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row19Array1);
        org.junit.Assert.assertNotNull(withAsStepRow19Array2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("hi!");
        org.junit.Assert.assertNotNull(recordTable1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery1 = org.jooq.impl.DSL.resultQuery("hi!");
        org.junit.Assert.assertNotNull(recordResultQuery1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat(strField0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.sql.Date date0 = null;
        java.lang.Number number1 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, number1, datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField9, (int) 'a');
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction12 = org.jooq.impl.DSL.countDistinct(strField9);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(intAggregateFunction12);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cosh((java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.lang.String str2 = org.jooq.impl.DSL.escape("hi!", 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.DropTableStep dropTableStep2 = org.jooq.impl.DSL.dropTableIfExists("");
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField6);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        java.lang.Class<?> wildcardClass9 = strField8.getClass();
        try {
            org.jooq.Row3<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, java.lang.reflect.AnnotatedElement> intRecord1SelectWhereStepRow3_10 = org.jooq.impl.DSL.row((org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, (org.jooq.DropTableFinalStep) dropTableStep2, (java.lang.reflect.AnnotatedElement) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(dropTableStep2);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jooq.Row15<org.jooq.WindowSpecificationFinalStep, org.jooq.RowN[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.Scope, org.jooq.WithAsStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement, java.lang.String, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.Table<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Field<java.lang.String>> windowSpecificationFinalStepRow15_0 = null;
        org.jooq.Row15[] row15Array2 = new org.jooq.Row15[1];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.WindowSpecificationFinalStep, org.jooq.RowN[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.Scope, org.jooq.WithAsStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement, java.lang.String, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.Table<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Field<java.lang.String>>[] windowSpecificationFinalStepRow15Array3 = (org.jooq.Row15<org.jooq.WindowSpecificationFinalStep, org.jooq.RowN[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.Scope, org.jooq.WithAsStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement, java.lang.String, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.Table<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Field<java.lang.String>>[]) row15Array2;
        windowSpecificationFinalStepRow15Array3[0] = windowSpecificationFinalStepRow15_0;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.WindowSpecificationFinalStep, org.jooq.RowN[], org.jooq.AggregateFunction<java.lang.String>, org.jooq.Scope, org.jooq.WithAsStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement, java.lang.String, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.Table<?>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatOrderByStep, org.jooq.Field<java.lang.String>>> windowSpecificationFinalStepRecord15Table6 = org.jooq.impl.DSL.values(windowSpecificationFinalStepRow15Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row15Array2);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStepRow15Array3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jooq.Row18<org.jooq.RowN[], org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.WithAsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Schema, java.lang.String[], org.jooq.DropIndexFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.Keyword, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.String[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowSpecification, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>> rowNArrayRow18_0 = null;
        org.jooq.Row18[] row18Array2 = new org.jooq.Row18[1];
        @SuppressWarnings("unchecked") org.jooq.Row18<org.jooq.RowN[], org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.WithAsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Schema, java.lang.String[], org.jooq.DropIndexFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.Keyword, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.String[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowSpecification, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>>[] rowNArrayRow18Array3 = (org.jooq.Row18<org.jooq.RowN[], org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.WithAsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Schema, java.lang.String[], org.jooq.DropIndexFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.Keyword, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.String[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowSpecification, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>>[]) row18Array2;
        rowNArrayRow18Array3[0] = rowNArrayRow18_0;
        try {
            org.jooq.Table<org.jooq.Record18<org.jooq.RowN[], org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.WithAsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Schema, java.lang.String[], org.jooq.DropIndexFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.Keyword, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.String[], org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowSpecification, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>>> rowNArrayRecord18Table6 = org.jooq.impl.DSL.values(rowNArrayRow18Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row18Array2);
        org.junit.Assert.assertNotNull(rowNArrayRow18Array3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField10);
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.position(strField3, strField10);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.rtrim(strField3);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(intField12);
        org.junit.Assert.assertNotNull(strField13);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jooq.Condition[] conditionArray0 = new org.jooq.Condition[] {};
        org.jooq.Condition condition1 = org.jooq.impl.DSL.or(conditionArray0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.falseCondition();
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression4 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray6 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray7 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray6;
        wildcardCommonTableExpressionArray7[0] = wildcardCommonTableExpression4;
        org.jooq.WithStep withStep10 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray7);
        org.jooq.Condition condition11 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray7);
        org.jooq.Condition condition12 = org.jooq.impl.DSL.trueCondition();
        org.jooq.Condition[] conditionArray13 = new org.jooq.Condition[] {};
        org.jooq.Condition condition14 = org.jooq.impl.DSL.or(conditionArray13);
        org.jooq.Condition[] conditionArray15 = new org.jooq.Condition[] { condition1, condition2, condition11, condition12, condition14 };
        org.jooq.Condition condition16 = org.jooq.impl.DSL.and(conditionArray15);
        org.jooq.Condition condition17 = org.jooq.impl.DSL.or(conditionArray15);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.concat("hi!", strField19);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.left(strField23, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.right(strField23, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.escape(strField23, '4');
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.rtrim(strField29);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction31 = org.jooq.impl.DSL.count();
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.space((org.jooq.Field<java.lang.Integer>) intAggregateFunction31);
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField36);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField37);
        org.jooq.Field<java.lang.Integer> intField39 = org.jooq.impl.DSL.charLength(strField37);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.nvl(strField32, strField37);
        org.jooq.Field<java.lang.Integer> intField42 = null;
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.space(intField42);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.ltrim(strField43);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction45 = org.jooq.impl.DSL.minDistinct(strField43);
        org.jooq.Field<java.lang.String> strField46 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField52 = null;
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.lpad(strField52, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField56 = null;
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.lpad(strField56, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField61 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.lpad(strField61, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField65 = null;
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.lpad(strField65, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_71 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField46, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField55, strField56, "", (org.jooq.GroupField) strField61, strField68, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction45, strField68);
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strAggregateFunction45);
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.nullif("hi!", strField73);
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_75 = org.jooq.impl.DSL.row(strField30, strField32, strField73);
        try {
            org.jooq.CaseConditionStep<org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>> strRow3CaseConditionStep76 = org.jooq.impl.DSL.when(condition17, strRow3_75);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.RowImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(conditionArray0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(commonTableExpressionArray6);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray7);
        org.junit.Assert.assertNotNull(withStep10);
        org.junit.Assert.assertNotNull(condition11);
        org.junit.Assert.assertNotNull(condition12);
        org.junit.Assert.assertNotNull(conditionArray13);
        org.junit.Assert.assertNotNull(condition14);
        org.junit.Assert.assertNotNull(conditionArray15);
        org.junit.Assert.assertNotNull(condition16);
        org.junit.Assert.assertNotNull(condition17);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(intAggregateFunction31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(intField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strAggregateFunction45);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_71);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strRow3_75);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction6 = org.jooq.impl.DSL.minDistinct(strField4);
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField13 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_32 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField7, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField16, strField17, "", (org.jooq.GroupField) strField22, strField29, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction6, strField29);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction6, "");
        org.jooq.Field<?> wildcardField36 = null;
        org.jooq.Field[] fieldArray38 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray39 = (org.jooq.Field<?>[]) fieldArray38;
        wildcardFieldArray39[0] = wildcardField36;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction42 = org.jooq.impl.DSL.denseRank(wildcardFieldArray39);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction43 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray39);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.least(strField35, wildcardFieldArray39);
        org.jooq.Condition condition45 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray39);
        org.jooq.Query query46 = org.jooq.impl.DSL.query("hi!", (org.jooq.QueryPart[]) wildcardFieldArray39);
        org.jooq.Condition condition47 = org.jooq.impl.DSL.condition("", (org.jooq.QueryPart[]) wildcardFieldArray39);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strAggregateFunction6);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(fieldArray38);
        org.junit.Assert.assertNotNull(wildcardFieldArray39);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction42);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction43);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(condition45);
        org.junit.Assert.assertNotNull(query46);
        org.junit.Assert.assertNotNull(condition47);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jooq.Row16[] row16Array1 = new org.jooq.Row16[0];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.Param<java.lang.String>, java.lang.Object[], org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, java.lang.String[], org.jooq.WindowSpecificationRowsAndStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.RowN, java.lang.String[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep>[] strParamRow16Array2 = (org.jooq.Row16<org.jooq.Param<java.lang.String>, java.lang.Object[], org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, java.lang.String[], org.jooq.WindowSpecificationRowsAndStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.RowN, java.lang.String[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep>[]) row16Array1;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.Param<java.lang.String>, java.lang.Object[], org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, java.lang.String[], org.jooq.WindowSpecificationRowsAndStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.RowN, java.lang.String[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep>> strParamRecord16Table3 = org.jooq.impl.DSL.values((org.jooq.Row16<org.jooq.Param<java.lang.String>, java.lang.Object[], org.jooq.CaseValueStep<java.lang.String>, org.jooq.WindowSpecification, org.jooq.DropTableFinalStep, java.lang.String[], org.jooq.WindowSpecificationRowsAndStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.RowN, java.lang.String[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep>[]) row16Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row16Array1);
        org.junit.Assert.assertNotNull(strParamRow16Array2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cosh((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField1, 10, ' ');
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.concat("hi!", strField11);
        org.jooq.Field<java.lang.Integer> intField16 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.space(intField16);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.ltrim(strField17);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField34 = null;
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.lpad(strField34, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_44 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField19, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField28, strField29, "", (org.jooq.GroupField) strField34, strField41, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField45 = null;
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.space(intField45);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.ltrim(strField46);
        org.jooq.Field<java.lang.String> strField49 = null;
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.lpad(strField49, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.concat("hi!", strField49);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.lpad(strField53, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.concat("hi!", strField58);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.lpad(strField62, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField66 = null;
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.lpad(strField66, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField70 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.space(intField70);
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.ltrim(strField71);
        org.jooq.Field<java.lang.Integer> intField73 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.space(intField73);
        org.jooq.Field<java.lang.String> strField75 = null;
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.lpad(strField75, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField79 = null;
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.lpad(strField79, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField82);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep85 = org.jooq.impl.DSL.lag(strField82, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_86 = org.jooq.impl.DSL.row(strField9, strField11, strField17, strField19, strField46, strField56, strField62, strField69, strField72, strField74, strField78, strField82);
        org.jooq.Field<java.lang.Integer> intField87 = org.jooq.impl.DSL.bitLength(strField78);
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.nullif("hi!", strField78);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.nvl2(strField1, "hi!", strField78);
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep90 = org.jooq.impl.DSL.choose(strField89);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep85);
        org.junit.Assert.assertNotNull(strRow12_86);
        org.junit.Assert.assertNotNull(intField87);
        org.junit.Assert.assertNotNull(strField88);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strCaseValueStep90);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep1 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.DropViewFinalStep dropViewFinalStep4 = org.jooq.impl.DSL.dropViewIfExists("hi!");
        org.jooq.Field<?> wildcardField5 = null;
        org.jooq.Field[] fieldArray7 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray8 = (org.jooq.Field<?>[]) fieldArray7;
        wildcardFieldArray8[0] = wildcardField5;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction11 = org.jooq.impl.DSL.denseRank(wildcardFieldArray8);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.concat(wildcardFieldArray8);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction13 = org.jooq.impl.DSL.percentRank(wildcardFieldArray8);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep14 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition15 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep14);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect16 = org.jooq.impl.DSL.all((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep14);
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep18 = org.jooq.impl.DSL.createTable("hi!");
        org.jooq.Field[] fieldArray21 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray22 = (org.jooq.Field<?>[]) fieldArray21;
        org.jooq.GroupField groupField23 = org.jooq.impl.DSL.rollup(wildcardFieldArray22);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep24 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray22);
        org.jooq.SQL sQL25 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray22);
        org.jooq.RowN rowN26 = org.jooq.impl.DSL.row((java.lang.Object[]) wildcardFieldArray22);
        try {
            org.jooq.Row7<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropViewFinalStep, java.lang.Object, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField[]> intRecord1SelectGroupByStepRow7_27 = org.jooq.impl.DSL.row((org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, (org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1, dropViewFinalStep4, (java.lang.Object) wildcardFieldArray8, (org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep14, recordCreateTableAsStep18, (org.jooq.SelectField[]) wildcardFieldArray22);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(dropViewFinalStep4);
        org.junit.Assert.assertNotNull(fieldArray7);
        org.junit.Assert.assertNotNull(wildcardFieldArray8);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep14);
        org.junit.Assert.assertNotNull(condition15);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect16);
        org.junit.Assert.assertNotNull(recordCreateTableAsStep18);
        org.junit.Assert.assertNotNull(fieldArray21);
        org.junit.Assert.assertNotNull(wildcardFieldArray22);
        org.junit.Assert.assertNotNull(groupField23);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep24);
        org.junit.Assert.assertNotNull(sQL25);
        org.junit.Assert.assertNotNull(rowN26);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep0 = org.jooq.impl.DSL.rowsCurrentRow();
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray1);
        org.jooq.RowN rowN3 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray1);
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        org.jooq.GroupField groupField7 = org.jooq.impl.DSL.rollup(wildcardFieldArray6);
        org.jooq.RowN rowN8 = org.jooq.impl.DSL.row(wildcardFieldArray6);
        org.jooq.RowN[] rowNArray9 = new org.jooq.RowN[] { rowN3, rowN8 };
        org.jooq.Table<org.jooq.Record> recordTable10 = org.jooq.impl.DSL.values(rowNArray9);
        org.jooq.SortField[] sortFieldArray12 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[] wildcardSortFieldArray13 = (org.jooq.SortField<?>[]) sortFieldArray12;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep14 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray13);
        org.jooq.CreateIndexStep createIndexStep16 = org.jooq.impl.DSL.createIndex("hi!");
        java.sql.Connection connection17 = null;
        org.jooq.DSLContext dSLContext18 = org.jooq.impl.DSL.using(connection17);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence20 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep21 = org.jooq.impl.DSL.createSequence(bigIntegerSequence20);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep22 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence20);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep23 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence20);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField28);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep31 = org.jooq.impl.DSL.lag(strField28, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField32 = null;
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.lpad(strField32, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField35);
        org.jooq.Field<java.lang.Integer> intField37 = org.jooq.impl.DSL.position(strField28, strField35);
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.space(intField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.ltrim(strField39);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction41 = org.jooq.impl.DSL.minDistinct(strField39);
        org.jooq.Field<java.lang.Integer> intField42 = null;
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.space(intField42);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.ltrim(strField43);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.rpad(strField44, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep48 = org.jooq.impl.DSL.arrayAgg(strField44);
        org.jooq.Field<java.lang.Integer> intField49 = null;
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.space(intField49);
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.ltrim(strField50);
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField50, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep56 = org.jooq.impl.DSL.lead(strField54, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField57 = null;
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.space(intField57);
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.nvl(strField58, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep62 = org.jooq.impl.DSL.lag(strField60, 0);
        org.jooq.Field<java.lang.Integer> intField63 = org.jooq.impl.DSL.position(strField54, strField60);
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_64 = org.jooq.impl.DSL.row(strField28, (org.jooq.Field<java.lang.String>) strAggregateFunction41, strField44, strField54);
        org.jooq.Field<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4Field65 = org.jooq.impl.DSL.field(strRow4_64);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep66 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition67 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep66);
        org.jooq.Condition condition68 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep66);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect69 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep66);
        org.jooq.Field[] fieldArray72 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray73 = (org.jooq.Field<?>[]) fieldArray72;
        org.jooq.GroupField groupField74 = org.jooq.impl.DSL.rollup(wildcardFieldArray73);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep75 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray73);
        org.jooq.SQL sQL76 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray73);
        org.jooq.RowN rowN77 = org.jooq.impl.DSL.row((java.lang.Object[]) wildcardFieldArray73);
        org.jooq.Field<?>[] wildcardFieldArray78 = null;
        org.jooq.RowN rowN79 = org.jooq.impl.DSL.row(wildcardFieldArray78);
        org.jooq.Field[] fieldArray82 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray83 = (org.jooq.Field<?>[]) fieldArray82;
        org.jooq.GroupField groupField84 = org.jooq.impl.DSL.rollup(wildcardFieldArray83);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep85 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray83);
        org.jooq.SQL sQL86 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray83);
        org.jooq.RowN rowN87 = org.jooq.impl.DSL.row((java.lang.Object[]) wildcardFieldArray83);
        org.jooq.RowN[] rowNArray88 = new org.jooq.RowN[] { rowN77, rowN79, rowN87 };
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep89 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition90 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep89);
        org.jooq.Field<java.lang.Integer> intField91 = null;
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.space(intField91);
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.nvl(strField92, "hi!");
        try {
            org.jooq.Row13<org.jooq.WindowSpecification, org.jooq.RowN[], org.jooq.SortField<?>[], org.jooq.CreateIndexStep, org.jooq.DSLContext, org.jooq.DropSequenceFinalStep, java.lang.String[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, java.lang.Comparable<java.lang.String>> windowSpecificationRow13_96 = org.jooq.impl.DSL.row((org.jooq.WindowSpecification) windowSpecificationFinalStep0, rowNArray9, wildcardSortFieldArray13, createIndexStep16, dSLContext18, dropSequenceFinalStep23, strArray24, strRow4_64, (org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep66, rowNArray88, intRecord1SelectSelectStep89, (java.lang.Object) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(name2);
        org.junit.Assert.assertNotNull(rowN3);
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(groupField7);
        org.junit.Assert.assertNotNull(rowN8);
        org.junit.Assert.assertNotNull(rowNArray9);
        org.junit.Assert.assertNotNull(recordTable10);
        org.junit.Assert.assertNotNull(sortFieldArray12);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray13);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep14);
        org.junit.Assert.assertNotNull(createIndexStep16);
        org.junit.Assert.assertNotNull(dSLContext18);
        org.junit.Assert.assertNotNull(bigIntegerSequence20);
        org.junit.Assert.assertNotNull(createSequenceFinalStep21);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep22);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep31);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(intField37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strAggregateFunction41);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep48);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep56);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep62);
        org.junit.Assert.assertNotNull(intField63);
        org.junit.Assert.assertNotNull(strRow4_64);
        org.junit.Assert.assertNotNull(strRecord4Field65);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep66);
        org.junit.Assert.assertNotNull(condition67);
        org.junit.Assert.assertNotNull(condition68);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect69);
        org.junit.Assert.assertNotNull(fieldArray72);
        org.junit.Assert.assertNotNull(wildcardFieldArray73);
        org.junit.Assert.assertNotNull(groupField74);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep75);
        org.junit.Assert.assertNotNull(sQL76);
        org.junit.Assert.assertNotNull(rowN77);
        org.junit.Assert.assertNotNull(rowN79);
        org.junit.Assert.assertNotNull(fieldArray82);
        org.junit.Assert.assertNotNull(wildcardFieldArray83);
        org.junit.Assert.assertNotNull(groupField84);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep85);
        org.junit.Assert.assertNotNull(sQL86);
        org.junit.Assert.assertNotNull(rowN87);
        org.junit.Assert.assertNotNull(rowNArray88);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep89);
        org.junit.Assert.assertNotNull(condition90);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(strField94);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.ltrim("");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep2 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField1);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep2);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction7 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray3);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(strField8);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", '4');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.space(intField9);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.ltrim(strField10);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.lpad(strField18, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField31 = null;
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.lpad(strField31, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_37 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField12, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField21, strField22, "", (org.jooq.GroupField) strField27, strField34, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.space(intField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.ltrim(strField39);
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.concat("hi!", strField42);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", strField51);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.lpad(strField55, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField63 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.space(intField63);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.ltrim(strField64);
        org.jooq.Field<java.lang.Integer> intField66 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.space(intField66);
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField72 = null;
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.lpad(strField72, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep78 = org.jooq.impl.DSL.lag(strField75, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_79 = org.jooq.impl.DSL.row(strField2, strField4, strField10, strField12, strField39, strField49, strField55, strField62, strField65, strField67, strField71, strField75);
        org.jooq.Field<java.lang.String> strField81 = null;
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.lpad(strField81, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.concat("hi!", strField81);
        org.jooq.Field<java.lang.String> strField87 = org.jooq.impl.DSL.nullif(strField81, "");
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.nullif(strField65, strField81);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.nvl("hi!", strField65);
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.trim(strField89);
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.left(strField89, 10);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep78);
        org.junit.Assert.assertNotNull(strRow12_79);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strField85);
        org.junit.Assert.assertNotNull(strField87);
        org.junit.Assert.assertNotNull(strField88);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strField92);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jooq.Row18[] row18Array1 = new org.jooq.Row18[0];
        @SuppressWarnings("unchecked") org.jooq.Row18<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateViewAsStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Attachable, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Schema, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>[] record1ResultQueryRow18Array2 = (org.jooq.Row18<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateViewAsStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Attachable, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Schema, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>[]) row18Array1;
        try {
            org.jooq.Table<org.jooq.Record18<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateViewAsStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Attachable, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Schema, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>> record1ResultQueryRecord18Table3 = org.jooq.impl.DSL.values((org.jooq.Row18<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateViewAsStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Attachable, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Schema, java.io.Serializable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>[]) row18Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row18Array1);
        org.junit.Assert.assertNotNull(record1ResultQueryRow18Array2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sqrt((java.lang.Number) (-1));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for hi!");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep3 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(createSequenceFinalStep3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jooq.SortField[] sortFieldArray1 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[] wildcardSortFieldArray2 = (org.jooq.SortField<?>[]) sortFieldArray1;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep3 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray2);
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep4 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray2);
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep5 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray2);
        org.junit.Assert.assertNotNull(sortFieldArray1);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray2);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep3);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep4);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep5);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep4 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray2);
        try {
            org.jooq.Param<org.jooq.WindowSpecificationFinalStep> windowSpecificationFinalStepParam5 = org.jooq.impl.DSL.inline((org.jooq.WindowSpecificationFinalStep) windowSpecificationOrderByStep4);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep4);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField3, (int) '4');
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField15);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep18 = org.jooq.impl.DSL.lag(strField15, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.mid(strField15, 10, (-1));
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.md5(strField21);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (-1), "");
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.bitLength(strField22);
        org.jooq.Param<java.lang.String> strParam27 = org.jooq.impl.DSL.val((java.lang.Object) '4', strField22);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep18);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(intField26);
        org.junit.Assert.assertNotNull(strParam27);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_29 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField4, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField13, strField14, "", (org.jooq.GroupField) strField19, strField26, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField26);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, "");
        org.jooq.Field<?> wildcardField33 = null;
        org.jooq.Field[] fieldArray35 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray36 = (org.jooq.Field<?>[]) fieldArray35;
        wildcardFieldArray36[0] = wildcardField33;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction39 = org.jooq.impl.DSL.denseRank(wildcardFieldArray36);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction40 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.least(strField32, wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.coalesce(strField32, "hi!");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence46 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep47 = org.jooq.impl.DSL.createSequence(bigIntegerSequence46);
        org.jooq.Field<java.lang.Integer> intField48 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.space(intField48);
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.ltrim(strField49);
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField49, 10, ' ');
        org.jooq.Param<java.lang.String> strParam54 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep47, strField53);
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", (org.jooq.Field<java.lang.String>) strParam54);
        org.jooq.Param<java.lang.String> strParam57 = org.jooq.impl.DSL.inline('#');
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_58 = org.jooq.impl.DSL.row(strField32, strField55, (org.jooq.Field<java.lang.String>) strParam57);
        org.jooq.Field<java.lang.Integer> intField59 = org.jooq.impl.DSL.length((org.jooq.Field<java.lang.String>) strParam57);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(fieldArray35);
        org.junit.Assert.assertNotNull(wildcardFieldArray36);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction39);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(bigIntegerSequence46);
        org.junit.Assert.assertNotNull(createSequenceFinalStep47);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strParam54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strParam57);
        org.junit.Assert.assertNotNull(strRow3_58);
        org.junit.Assert.assertNotNull(intField59);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jooq.Field<?> wildcardField1 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        wildcardFieldArray4[0] = wildcardField1;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.denseRank(wildcardFieldArray4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat(wildcardFieldArray4);
        org.jooq.Field<java.lang.Object> objField9 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray4);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction10 = org.jooq.impl.DSL.countDistinct(wildcardFieldArray4);
        try {
            org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep11 = org.jooq.impl.DSL.orderBy(wildcardFieldArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(objField9);
        org.junit.Assert.assertNotNull(intAggregateFunction10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing((int) ' ');
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray2);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.least("", strArray2);
        org.jooq.CreateViewAsStep createViewAsStep6 = org.jooq.impl.DSL.createView("hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(wildcardTable4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(createViewAsStep6);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(strParam1);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jooq.Row22<org.jooq.Schema, org.jooq.Param<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row1<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.WithStep, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropTableStep> schemaRow22_0 = null;
        org.jooq.Row22[] row22Array2 = new org.jooq.Row22[1];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.Schema, org.jooq.Param<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row1<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.WithStep, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropTableStep>[] schemaRow22Array3 = (org.jooq.Row22<org.jooq.Schema, org.jooq.Param<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row1<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.WithStep, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropTableStep>[]) row22Array2;
        schemaRow22Array3[0] = schemaRow22_0;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.Schema, org.jooq.Param<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.WindowSpecificationFinalStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Row1<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.WithStep, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Name, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropTableStep>> schemaRecord22Table6 = org.jooq.impl.DSL.values(schemaRow22Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row22Array2);
        org.junit.Assert.assertNotNull(schemaRow22Array3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray1);
        org.jooq.Table<?> wildcardTable3 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray1);
        org.jooq.WithAsStep withAsStep4 = org.jooq.impl.DSL.withRecursive("", strArray1);
        try {
            org.jooq.Param<org.jooq.WithAsStep> withAsStepParam5 = org.jooq.impl.DSL.inline(withAsStep4);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WithImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(name2);
        org.junit.Assert.assertNotNull(wildcardTable3);
        org.junit.Assert.assertNotNull(withAsStep4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.position("hi!", "");
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Field<java.lang.Boolean> booleanField2 = org.jooq.impl.DSL.not(booleanField1);
        org.jooq.Field<java.lang.Boolean> booleanField3 = org.jooq.impl.DSL.not(booleanField1);
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(booleanField2);
        org.junit.Assert.assertNotNull(booleanField3);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) 100.0d, (int) (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.lower("hi!");
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jooq.Row13<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.Condition[], org.jooq.GroupField, org.jooq.AlterTableStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.CreateIndexStep, org.jooq.GroupConcatOrderByStep>[] record1SelectOptionStepRow13Array0 = null;
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.Condition[], org.jooq.GroupField, org.jooq.AlterTableStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectField<java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.CreateIndexStep, org.jooq.GroupConcatOrderByStep>> record1SelectOptionStepRecord13Table1 = org.jooq.impl.DSL.values(record1SelectOptionStepRow13Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep1 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect4 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        try {
            org.jooq.Param<org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectGroupByStepParam5 = org.jooq.impl.DSL.param("", (org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(condition3);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect4);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.space(intField2);
        org.jooq.Field<java.lang.String> strField5 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("hi!", strField5);
        org.jooq.Field<java.lang.Integer> intField10 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.space(intField10);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.ltrim(strField11);
        org.jooq.Field<java.lang.String> strField13 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField28 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField32 = null;
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.lpad(strField32, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_38 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField13, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField22, strField23, "", (org.jooq.GroupField) strField28, strField35, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField39 = null;
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.space(intField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.ltrim(strField40);
        org.jooq.Field<java.lang.String> strField43 = null;
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.lpad(strField43, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.concat("hi!", strField43);
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.lpad(strField47, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField52 = null;
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.lpad(strField52, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.concat("hi!", strField52);
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.lpad(strField56, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField60 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.lpad(strField60, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField64 = null;
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.space(intField64);
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.ltrim(strField65);
        org.jooq.Field<java.lang.Integer> intField67 = null;
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.space(intField67);
        org.jooq.Field<java.lang.String> strField69 = null;
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.lpad(strField69, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField73 = null;
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.lpad(strField73, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField77 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField76);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep79 = org.jooq.impl.DSL.lag(strField76, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_80 = org.jooq.impl.DSL.row(strField3, strField5, strField11, strField13, strField40, strField50, strField56, strField63, strField66, strField68, strField72, strField76);
        org.jooq.Field<java.lang.Integer> intField81 = org.jooq.impl.DSL.bitLength(strField72);
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.nullif("hi!", strField72);
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction86 = org.jooq.impl.DSL.groupConcat(strField84, "");
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.rpad(strField84, 100, "");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep90 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField82, (org.jooq.SelectField<java.lang.String>) strField84);
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.concat("hi!", strField84);
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.connectByRoot(strField84);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_38);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strField77);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep79);
        org.junit.Assert.assertNotNull(strRow12_80);
        org.junit.Assert.assertNotNull(intField81);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strAggregateFunction86);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep90);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strField92);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jooq.Row4[] row4Array1 = new org.jooq.Row4[0];
        @SuppressWarnings("unchecked") org.jooq.Row4<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectField[], org.jooq.GroupField>[] record1IterableRow4Array2 = (org.jooq.Row4<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectField[], org.jooq.GroupField>[]) row4Array1;
        try {
            org.jooq.Table<org.jooq.Record4<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.SelectField[], org.jooq.GroupField>> record1IterableRecord4Table3 = org.jooq.impl.DSL.values(record1IterableRow4Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row4Array1);
        org.junit.Assert.assertNotNull(record1IterableRow4Array2);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression2 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray4 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray5 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray4;
        wildcardCommonTableExpressionArray5[0] = wildcardCommonTableExpression2;
        org.jooq.WithStep withStep8 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray5);
        org.jooq.Query query9 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardCommonTableExpressionArray5);
        org.jooq.QueryPart queryPart10 = org.jooq.impl.DSL.queryPart("", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(commonTableExpressionArray4);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(withStep8);
        org.junit.Assert.assertNotNull(query9);
        org.junit.Assert.assertNotNull(queryPart10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression3 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray5 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray6 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray5;
        wildcardCommonTableExpressionArray6[0] = wildcardCommonTableExpression3;
        org.jooq.WithStep withStep9 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray6);
        org.jooq.Condition condition10 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray6);
        org.jooq.Query query11 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardCommonTableExpressionArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (java.lang.Object[]) wildcardCommonTableExpressionArray6);
        org.junit.Assert.assertNotNull(commonTableExpressionArray5);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray6);
        org.junit.Assert.assertNotNull(withStep9);
        org.junit.Assert.assertNotNull(condition10);
        org.junit.Assert.assertNotNull(query11);
        org.junit.Assert.assertNotNull(objField12);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence3 = org.jooq.impl.DSL.sequenceByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep1 = org.jooq.impl.DSL.firstValue(strField0);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jooq.Row10<org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Attachable, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.CaseValueStep<java.lang.String>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>> bigIntegerAlterSequenceRestartStepRow10_0 = null;
        org.jooq.Row10[] row10Array2 = new org.jooq.Row10[1];
        @SuppressWarnings("unchecked") org.jooq.Row10<org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Attachable, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.CaseValueStep<java.lang.String>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>>[] bigIntegerAlterSequenceRestartStepRow10Array3 = (org.jooq.Row10<org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Attachable, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.CaseValueStep<java.lang.String>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>>[]) row10Array2;
        bigIntegerAlterSequenceRestartStepRow10Array3[0] = bigIntegerAlterSequenceRestartStepRow10_0;
        try {
            org.jooq.Table<org.jooq.Record10<org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.String, org.jooq.DropTableStep, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Attachable, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.CaseValueStep<java.lang.String>, java.lang.Object, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>>> bigIntegerAlterSequenceRestartStepRecord10Table6 = org.jooq.impl.DSL.values(bigIntegerAlterSequenceRestartStepRow10Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row10Array2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStepRow10Array3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing((int) (byte) -1);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep4 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence6 = org.jooq.impl.DSL.sequence("");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence8 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep9 = org.jooq.impl.DSL.createSequence(bigIntegerSequence8);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep10 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence8);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep11 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence8);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep12 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence8);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence14 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep15 = org.jooq.impl.DSL.createSequence(bigIntegerSequence14);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep16 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep17 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep18 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.Sequence[] sequenceArray20 = new org.jooq.Sequence[3];
        @SuppressWarnings("unchecked") org.jooq.Sequence<java.math.BigInteger>[] bigIntegerSequenceArray21 = (org.jooq.Sequence<java.math.BigInteger>[]) sequenceArray20;
        bigIntegerSequenceArray21[0] = bigIntegerSequence6;
        bigIntegerSequenceArray21[1] = bigIntegerSequence8;
        bigIntegerSequenceArray21[2] = bigIntegerSequence14;
        try {
            org.jooq.Field<org.jooq.Sequence<java.math.BigInteger>> bigIntegerSequenceField28 = org.jooq.impl.DSL.greatest(bigIntegerSequence1, bigIntegerSequenceArray21);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SequenceImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep4);
        org.junit.Assert.assertNotNull(bigIntegerSequence6);
        org.junit.Assert.assertNotNull(bigIntegerSequence8);
        org.junit.Assert.assertNotNull(createSequenceFinalStep9);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep10);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep11);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep12);
        org.junit.Assert.assertNotNull(bigIntegerSequence14);
        org.junit.Assert.assertNotNull(createSequenceFinalStep15);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep16);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep17);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep18);
        org.junit.Assert.assertNotNull(sequenceArray20);
        org.junit.Assert.assertNotNull(bigIntegerSequenceArray21);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.SQL sQL13 = org.jooq.impl.DSL.sql("", (org.jooq.QueryPart[]) wildcardFieldArray6);
        try {
            org.jooq.Table<?> wildcardTable14 = org.jooq.impl.DSL.unnest((java.lang.Object[]) wildcardFieldArray6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Field is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(objField11);
        org.junit.Assert.assertNotNull(objField12);
        org.junit.Assert.assertNotNull(sQL13);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.atan((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray2);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.least("", strArray2);
        org.jooq.WithAsStep withAsStep6 = org.jooq.impl.DSL.with("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(wildcardTable4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(withAsStep6);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jooq.Condition[][] conditionArray0 = null;
        org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.Condition[]>> conditionArrayRecord1QuantifiedSelect1 = org.jooq.impl.DSL.any(conditionArray0);
        org.junit.Assert.assertNotNull(conditionArrayRecord1QuantifiedSelect1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tan((java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(strParam1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsFollowing((int) ' ');
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep4 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray2);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep5 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray2);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.percentRank(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep4);
        org.junit.Assert.assertNotNull(recordSelectSelectStep5);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) 1);
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_29 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField4, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField13, strField14, "", (org.jooq.GroupField) strField19, strField26, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField26);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, "");
        org.jooq.Field<?> wildcardField33 = null;
        org.jooq.Field[] fieldArray35 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray36 = (org.jooq.Field<?>[]) fieldArray35;
        wildcardFieldArray36[0] = wildcardField33;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction39 = org.jooq.impl.DSL.denseRank(wildcardFieldArray36);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction40 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.least(strField32, wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.coalesce(strField32, "hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction44 = org.jooq.impl.DSL.min(strField43);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(fieldArray35);
        org.junit.Assert.assertNotNull(wildcardFieldArray36);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction39);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strAggregateFunction44);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for ");
        } catch (org.jooq.exception.DataAccessException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField3 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) (-1), datePart2);
        java.lang.Number number4 = null;
        org.jooq.DatePart datePart5 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField6 = org.jooq.impl.DSL.timestampAdd(timestampField3, number4, datePart5);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(timestampField6);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 0L);
        java.sql.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.dateDiff(dateField2, date3);
        org.jooq.DatePart datePart6 = null;
        org.jooq.Field<java.sql.Date> dateField7 = org.jooq.impl.DSL.dateAdd(dateField2, (java.lang.Number) (short) -1, datePart6);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(intField4);
        org.junit.Assert.assertNotNull(dateField7);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jooq.Row21<org.jooq.QueryPart, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.TableLike<?>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.TableLike<?>, org.jooq.Scope, java.lang.String[], org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.GroupConcatOrderByStep, org.jooq.RowN[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object> queryPartRow21_0 = null;
        org.jooq.Row21[] row21Array2 = new org.jooq.Row21[1];
        @SuppressWarnings("unchecked") org.jooq.Row21<org.jooq.QueryPart, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.TableLike<?>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.TableLike<?>, org.jooq.Scope, java.lang.String[], org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.GroupConcatOrderByStep, org.jooq.RowN[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object>[] queryPartRow21Array3 = (org.jooq.Row21<org.jooq.QueryPart, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.TableLike<?>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.TableLike<?>, org.jooq.Scope, java.lang.String[], org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.GroupConcatOrderByStep, org.jooq.RowN[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object>[]) row21Array2;
        queryPartRow21Array3[0] = queryPartRow21_0;
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.QueryPart, org.jooq.Condition[], org.jooq.Sequence<java.math.BigInteger>, org.jooq.TableLike<?>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row1<java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.TableLike<?>, org.jooq.Scope, java.lang.String[], org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.GroupConcatOrderByStep, org.jooq.RowN[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object>> queryPartRecord21Table6 = org.jooq.impl.DSL.values(queryPartRow21Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row21Array2);
        org.junit.Assert.assertNotNull(queryPartRow21Array3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jooq.Row22<org.jooq.DropTableStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SQL, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.SQL, org.jooq.RowN[], org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, java.io.Serializable, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>> dropTableStepRow22_0 = null;
        org.jooq.Row22[] row22Array2 = new org.jooq.Row22[1];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.DropTableStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SQL, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.SQL, org.jooq.RowN[], org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, java.io.Serializable, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>>[] dropTableStepRow22Array3 = (org.jooq.Row22<org.jooq.DropTableStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SQL, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.SQL, org.jooq.RowN[], org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, java.io.Serializable, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>>[]) row22Array2;
        dropTableStepRow22Array3[0] = dropTableStepRow22_0;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.DropTableStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SQL, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.SQL, org.jooq.RowN[], org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.Name, java.io.Serializable, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.CreateIndexStep, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropSequenceFinalStep, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>>> dropTableStepRecord22Table6 = org.jooq.impl.DSL.values(dropTableStepRow22Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row22Array2);
        org.junit.Assert.assertNotNull(dropTableStepRow22Array3);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_0 = null;
        try {
            org.jooq.Field<org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord12Field1 = org.jooq.impl.DSL.field(strRow12_0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_25 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField9, strField10, "", (org.jooq.GroupField) strField15, strField22, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Row1<java.lang.String> strRow1_26 = org.jooq.impl.DSL.row(strField0);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep27 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition28 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep27);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect29 = org.jooq.impl.DSL.all((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep27);
        org.jooq.Field<?> wildcardField32 = null;
        org.jooq.Field[] fieldArray34 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray35 = (org.jooq.Field<?>[]) fieldArray34;
        wildcardFieldArray35[0] = wildcardField32;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction38 = org.jooq.impl.DSL.denseRank(wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.concat(wildcardFieldArray35);
        org.jooq.Field<java.lang.Object> objField40 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray35);
        org.jooq.Field<java.lang.Object> objField41 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.concat(wildcardFieldArray35);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep43 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition44 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep43);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect45 = org.jooq.impl.DSL.all((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep43);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep46 = org.jooq.impl.DSL.selectZero();
        org.jooq.Condition condition47 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep46);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence48 = null;
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep49 = org.jooq.impl.DSL.createSequence(bigIntegerSequence48);
        org.jooq.SQLDialect sQLDialect50 = null;
        org.jooq.DSLContext dSLContext51 = org.jooq.impl.DSL.using(sQLDialect50);
        org.jooq.Field<java.lang.Integer> intField52 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.space(intField52);
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.ltrim(strField53);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction55 = org.jooq.impl.DSL.minDistinct(strField53);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep56 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction55);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep57 = org.jooq.impl.DSL.groupConcatDistinct((org.jooq.Field<java.lang.String>) strAggregateFunction55);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep59 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) strAggregateFunction55, (int) (byte) 100);
        try {
            org.jooq.Row8<org.jooq.Row1<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<?>[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateSequenceFinalStep, org.jooq.Scope, org.jooq.WindowIgnoreNullsStep<java.lang.String>> strRow1Row8_60 = org.jooq.impl.DSL.row(strRow1_26, (org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep27, wildcardFieldArray35, (org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep43, (org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep46, createSequenceFinalStep49, (org.jooq.Scope) dSLContext51, strWindowIgnoreNullsStep59);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.RowImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strRow1_26);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep27);
        org.junit.Assert.assertNotNull(condition28);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect29);
        org.junit.Assert.assertNotNull(fieldArray34);
        org.junit.Assert.assertNotNull(wildcardFieldArray35);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(objField40);
        org.junit.Assert.assertNotNull(objField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep43);
        org.junit.Assert.assertNotNull(condition44);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect45);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep46);
        org.junit.Assert.assertNotNull(condition47);
        org.junit.Assert.assertNotNull(createSequenceFinalStep49);
        org.junit.Assert.assertNotNull(dSLContext51);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strAggregateFunction55);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep56);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep57);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep59);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField10);
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.position(strField3, strField10);
        org.jooq.Field<java.lang.Integer> intField13 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.space(intField13);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.ltrim(strField14);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction16 = org.jooq.impl.DSL.minDistinct(strField14);
        org.jooq.Field<java.lang.Integer> intField17 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.space(intField17);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.ltrim(strField18);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.rpad(strField19, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep23 = org.jooq.impl.DSL.arrayAgg(strField19);
        org.jooq.Field<java.lang.Integer> intField24 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.space(intField24);
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.ltrim(strField25);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField25, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep31 = org.jooq.impl.DSL.lead(strField29, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField32 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.space(intField32);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.nvl(strField33, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep37 = org.jooq.impl.DSL.lag(strField35, 0);
        org.jooq.Field<java.lang.Integer> intField38 = org.jooq.impl.DSL.position(strField29, strField35);
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_39 = org.jooq.impl.DSL.row(strField3, (org.jooq.Field<java.lang.String>) strAggregateFunction16, strField19, strField29);
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep40 = org.jooq.impl.DSL.arrayAgg((org.jooq.Field<java.lang.String>) strAggregateFunction16);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.defaultValue((org.jooq.Field<java.lang.String>) strAggregateFunction16);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(intField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strAggregateFunction16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep23);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep37);
        org.junit.Assert.assertNotNull(intField38);
        org.junit.Assert.assertNotNull(strRow4_39);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep40);
        org.junit.Assert.assertNotNull(strField41);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray0);
        try {
            org.jooq.Field<java.lang.Object> objField3 = org.jooq.impl.DSL.field(name2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.bitLength(strField10);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.trim(strField10);
        org.jooq.Field<?>[] wildcardFieldArray16 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.least(strField15, wildcardFieldArray16);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.coalesce(strField15, "hi!");
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.octetLength(strField15);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(intField20);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date(date0);
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.minDistinct(strField2);
        org.jooq.Field<java.lang.String> strField5 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = null;
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.lpad(strField20, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField24 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField24, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_30 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField5, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField14, strField15, "", (org.jooq.GroupField) strField20, strField27, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction4, strField27);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction4, "");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction34 = org.jooq.impl.DSL.min((org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Field<java.lang.Integer> intField35 = org.jooq.impl.DSL.position("hi!", (org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table37 = org.jooq.impl.DSL.generateSeries(intField35, (int) ' ');
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strAggregateFunction34);
        org.junit.Assert.assertNotNull(intField35);
        org.junit.Assert.assertNotNull(intRecord1Table37);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jooq.Row22[] row22Array1 = new org.jooq.Row22[0];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.Table<?>, org.jooq.GroupField, org.jooq.DDLQuery, org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.Condition, java.lang.String[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[] wildcardTableRow22Array2 = (org.jooq.Row22<org.jooq.Table<?>, org.jooq.GroupField, org.jooq.DDLQuery, org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.Condition, java.lang.String[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[]) row22Array1;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.Table<?>, org.jooq.GroupField, org.jooq.DDLQuery, org.jooq.Param<java.lang.String>, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.Condition, java.lang.String[], org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>> wildcardTableRecord22Table3 = org.jooq.impl.DSL.values(wildcardTableRow22Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row22Array1);
        org.junit.Assert.assertNotNull(wildcardTableRow22Array2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.bitLength(strField10);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.connectByRoot(strField10);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.SelectField<java.lang.String> strSelectField18 = null;
        org.jooq.Field<?> wildcardField21 = null;
        org.jooq.Field[] fieldArray23 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray24 = (org.jooq.Field<?>[]) fieldArray23;
        wildcardFieldArray24[0] = wildcardField21;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction27 = org.jooq.impl.DSL.denseRank(wildcardFieldArray24);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.concat(wildcardFieldArray24);
        org.jooq.Field<java.lang.Object> objField29 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray24);
        org.jooq.Field<java.lang.Object> objField30 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray24);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.concat(wildcardFieldArray24);
        org.jooq.Field<java.lang.Integer> intField32 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.space(intField32);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.ltrim(strField33);
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.lpad(strField33, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep39 = org.jooq.impl.DSL.lead(strField37, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField40 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.space(intField40);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.nvl(strField41, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep45 = org.jooq.impl.DSL.lag(strField43, 0);
        org.jooq.Field<java.lang.Integer> intField46 = org.jooq.impl.DSL.position(strField37, strField43);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5SelectSelectStep47 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField10, (org.jooq.SelectField<java.lang.String>) strField17, strSelectField18, (org.jooq.SelectField<java.lang.String>) strField31, (org.jooq.SelectField<java.lang.String>) strField37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(fieldArray23);
        org.junit.Assert.assertNotNull(wildcardFieldArray24);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction27);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(objField29);
        org.junit.Assert.assertNotNull(objField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep39);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep45);
        org.junit.Assert.assertNotNull(intField46);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.Field<java.lang.String> strField5 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("hi!", strField5);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField9, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.right(strField9, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.defaultValue(strField9);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.replace(strField2, strField14);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.nvl("hi!", strField14);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction17 = org.jooq.impl.DSL.countDistinct(strField14);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(intAggregateFunction17);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cos((java.lang.Number) (byte) 100);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim("hi!");
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.cast((java.lang.Object) (byte) 100, strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep5 = org.jooq.impl.DSL.lead(strField4);
        org.junit.Assert.assertNotNull(bigDecimalField1);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep5);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 1L);
        java.sql.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.dateDiff(dateField2, date3);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(intField4);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect3 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        try {
            org.jooq.Param<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectWhereStepParam4 = org.jooq.impl.DSL.val((org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect3);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jooq.Row5[] row5Array1 = new org.jooq.Row5[0];
        @SuppressWarnings("unchecked") org.jooq.Row5<org.jooq.RowN[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SQL, org.jooq.Keyword>[] rowNArrayRow5Array2 = (org.jooq.Row5<org.jooq.RowN[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SQL, org.jooq.Keyword>[]) row5Array1;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.RowN[], org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SQL, org.jooq.Keyword>> rowNArrayRecord5Table3 = org.jooq.impl.DSL.values(rowNArrayRow5Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row5Array1);
        org.junit.Assert.assertNotNull(rowNArrayRow5Array2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.escape((org.jooq.Field<java.lang.String>) strAggregateFunction3, 'a');
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.concat("hi!", strField7);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.left(strField11, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.right(strField11, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.md5(strField11);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.isnull(strField5, strField11);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.escape(strField5, 'a');
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.jooq.Row17<java.lang.Object, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.DropTableFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object, org.jooq.Attachable, org.jooq.SortField<?>[], java.lang.reflect.GenericDeclaration, org.jooq.DDLQuery, org.jooq.Condition[], java.lang.reflect.Type, org.jooq.Condition[], org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>> objRow17_0 = null;
        org.jooq.Row17[] row17Array2 = new org.jooq.Row17[1];
        @SuppressWarnings("unchecked") org.jooq.Row17<java.lang.Object, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.DropTableFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object, org.jooq.Attachable, org.jooq.SortField<?>[], java.lang.reflect.GenericDeclaration, org.jooq.DDLQuery, org.jooq.Condition[], java.lang.reflect.Type, org.jooq.Condition[], org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>[] objRow17Array3 = (org.jooq.Row17<java.lang.Object, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.DropTableFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object, org.jooq.Attachable, org.jooq.SortField<?>[], java.lang.reflect.GenericDeclaration, org.jooq.DDLQuery, org.jooq.Condition[], java.lang.reflect.Type, org.jooq.Condition[], org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>[]) row17Array2;
        objRow17Array3[0] = objRow17_0;
        try {
            org.jooq.Table<org.jooq.Record17<java.lang.Object, org.jooq.WithAsStep, org.jooq.SortField<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.DropTableFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsAndStep, java.lang.Object, org.jooq.Attachable, org.jooq.SortField<?>[], java.lang.reflect.GenericDeclaration, org.jooq.DDLQuery, org.jooq.Condition[], java.lang.reflect.Type, org.jooq.Condition[], org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>> objRecord17Table6 = org.jooq.impl.DSL.values(objRow17Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row17Array2);
        org.junit.Assert.assertNotNull(objRow17Array3);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(booleanField1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.lag(strField7, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField14);
        org.jooq.Field<java.lang.Integer> intField16 = org.jooq.impl.DSL.position(strField7, strField14);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.cast((java.lang.Object) booleanAggregateFunction2, strField14);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction18 = org.jooq.impl.DSL.every((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(condition3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(intField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(booleanAggregateFunction18);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.trunc(date0);
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Date> dateField4 = org.jooq.impl.DSL.dateSub(dateField1, (java.lang.Number) (-1.0d), datePart3);
        java.sql.Date date5 = null;
        org.jooq.Field<java.sql.Date> dateField7 = org.jooq.impl.DSL.dateSub(date5, (java.lang.Number) 0L);
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Date> dateField10 = org.jooq.impl.DSL.dateAdd(dateField7, (java.lang.Number) 0.0d, datePart9);
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.dateDiff(dateField4, dateField7);
        org.junit.Assert.assertNotNull(dateField1);
        org.junit.Assert.assertNotNull(dateField4);
        org.junit.Assert.assertNotNull(dateField7);
        org.junit.Assert.assertNotNull(dateField10);
        org.junit.Assert.assertNotNull(intField11);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jooq.Row13[] row13Array1 = new org.jooq.Row13[0];
        @SuppressWarnings("unchecked") org.jooq.Row13<org.jooq.DropTableStep, org.jooq.TableLike<?>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.Name, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Schema, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Param<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.DropTableStep>[] dropTableStepRow13Array2 = (org.jooq.Row13<org.jooq.DropTableStep, org.jooq.TableLike<?>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.Name, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Schema, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Param<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.DropTableStep>[]) row13Array1;
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.DropTableStep, org.jooq.TableLike<?>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.Name, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Schema, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Param<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.DropTableStep>> dropTableStepRecord13Table3 = org.jooq.impl.DSL.values(dropTableStepRow13Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row13Array1);
        org.junit.Assert.assertNotNull(dropTableStepRow13Array2);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.jooq.Row15<org.jooq.CaseValueStep<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.WithAsStep, java.lang.reflect.GenericDeclaration, org.jooq.DropTableFinalStep, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[]> strCaseValueStepRow15_0 = null;
        org.jooq.Row15[] row15Array2 = new org.jooq.Row15[1];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.CaseValueStep<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.WithAsStep, java.lang.reflect.GenericDeclaration, org.jooq.DropTableFinalStep, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[]>[] strCaseValueStepRow15Array3 = (org.jooq.Row15<org.jooq.CaseValueStep<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.WithAsStep, java.lang.reflect.GenericDeclaration, org.jooq.DropTableFinalStep, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[]>[]) row15Array2;
        strCaseValueStepRow15Array3[0] = strCaseValueStepRow15_0;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.CaseValueStep<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<?>, org.jooq.WithAsStep, java.lang.reflect.GenericDeclaration, org.jooq.DropTableFinalStep, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[]>> strCaseValueStepRecord15Table6 = org.jooq.impl.DSL.values(strCaseValueStepRow15Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row15Array2);
        org.junit.Assert.assertNotNull(strCaseValueStepRow15Array3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jooq.Row13<org.jooq.SortField<?>[], org.jooq.Table<?>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateIndexStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Table<?>, org.jooq.Condition, org.jooq.WindowSpecificationRowsStep, org.jooq.Schema, org.jooq.AlterTableStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>> wildcardSortFieldArrayRow13_0 = null;
        org.jooq.Row13[] row13Array2 = new org.jooq.Row13[1];
        @SuppressWarnings("unchecked") org.jooq.Row13<org.jooq.SortField<?>[], org.jooq.Table<?>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateIndexStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Table<?>, org.jooq.Condition, org.jooq.WindowSpecificationRowsStep, org.jooq.Schema, org.jooq.AlterTableStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>[] wildcardSortFieldArrayRow13Array3 = (org.jooq.Row13<org.jooq.SortField<?>[], org.jooq.Table<?>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateIndexStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Table<?>, org.jooq.Condition, org.jooq.WindowSpecificationRowsStep, org.jooq.Schema, org.jooq.AlterTableStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>[]) row13Array2;
        wildcardSortFieldArrayRow13Array3[0] = wildcardSortFieldArrayRow13_0;
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.SortField<?>[], org.jooq.Table<?>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateIndexStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Table<?>, org.jooq.Condition, org.jooq.WindowSpecificationRowsStep, org.jooq.Schema, org.jooq.AlterTableStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>>> wildcardSortFieldArrayRecord13Table6 = org.jooq.impl.DSL.values(wildcardSortFieldArrayRow13Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row13Array2);
        org.junit.Assert.assertNotNull(wildcardSortFieldArrayRow13Array3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.bitLength(strField10);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.connectByRoot(strField10);
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField20);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep23 = org.jooq.impl.DSL.lag(strField20, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.mid(strField20, 10, (-1));
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.md5(strField26);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (-1), "");
        org.jooq.Field<java.lang.Integer> intField31 = org.jooq.impl.DSL.bitLength(strField27);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.connectByRoot(strField27);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep33 = org.jooq.impl.DSL.lead(strField15, 1, strField32);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction34 = org.jooq.impl.DSL.countDistinct(strField15);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep23);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(intField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep33);
        org.junit.Assert.assertNotNull(intAggregateFunction34);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.concat("hi!", strField12);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.left(strField16, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.right(strField16, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.concat("hi!", strField22);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.left(strField26, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.right(strField26, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.replace(strField10, strField20, strField26);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.reverse(strField10);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep1 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect3 = org.jooq.impl.DSL.all((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        org.jooq.SortField[] sortFieldArray5 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[] wildcardSortFieldArray6 = (org.jooq.SortField<?>[]) sortFieldArray5;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep7 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray6);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence8 = null;
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep9 = org.jooq.impl.DSL.createSequence(bigIntegerSequence8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jooq.Name name11 = org.jooq.impl.DSL.name(strArray10);
        org.jooq.Table<?> wildcardTable12 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray10);
        org.jooq.Case case13 = org.jooq.impl.DSL.choose();
        try {
            org.jooq.Row6<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.Table<?>, org.jooq.Case> intRecord1SelectSelectStepRow6_14 = org.jooq.impl.DSL.row(intRecord1SelectSelectStep0, (org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1, wildcardSortFieldArray6, createSequenceFinalStep9, wildcardTable12, case13);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect3);
        org.junit.Assert.assertNotNull(sortFieldArray5);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray6);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep7);
        org.junit.Assert.assertNotNull(createSequenceFinalStep9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(wildcardTable12);
        org.junit.Assert.assertNotNull(case13);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.jooq.Row13[] row13Array1 = new org.jooq.Row13[0];
        @SuppressWarnings("unchecked") org.jooq.Row13<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, java.lang.Comparable<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.TableLike<?>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.Field<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Field<?>[], org.jooq.Schema, org.jooq.Query>[] record1SelectOrderByStepRow13Array2 = (org.jooq.Row13<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, java.lang.Comparable<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.TableLike<?>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.Field<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Field<?>[], org.jooq.Schema, org.jooq.Query>[]) row13Array1;
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, java.lang.Comparable<java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.TableLike<?>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.Field<java.lang.String>, org.jooq.CommonTableExpression<?>[], org.jooq.Field<?>[], org.jooq.Schema, org.jooq.Query>> record1SelectOrderByStepRecord13Table3 = org.jooq.impl.DSL.values(record1SelectOrderByStepRow13Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row13Array1);
        org.junit.Assert.assertNotNull(record1SelectOrderByStepRow13Array2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.right("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.concat("hi!", strField12);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.left(strField16, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.right(strField16, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.concat("hi!", strField22);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.left(strField26, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.right(strField26, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.replace(strField10, strField20, strField26);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.replace(strField26, "hi!");
        org.jooq.Field[] fieldArray35 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray36 = (org.jooq.Field<?>[]) fieldArray35;
        org.jooq.GroupField groupField37 = org.jooq.impl.DSL.rollup(wildcardFieldArray36);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction38 = org.jooq.impl.DSL.percentRank(wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.greatest(strField33, wildcardFieldArray36);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(fieldArray35);
        org.junit.Assert.assertNotNull(wildcardFieldArray36);
        org.junit.Assert.assertNotNull(groupField37);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction38);
        org.junit.Assert.assertNotNull(strField39);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.castNull(strField3);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.exp((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Table<?> wildcardTable2 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray0);
        try {
            org.jooq.Table<org.jooq.Record> recordTable3 = org.jooq.impl.DSL.tableByName(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(wildcardTable2);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_29 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField4, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField13, strField14, "", (org.jooq.GroupField) strField19, strField26, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField26);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep32 = org.jooq.impl.DSL.lag((org.jooq.Field<java.lang.String>) strAggregateFunction3, 10);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.rpad((org.jooq.Field<java.lang.String>) strAggregateFunction3, (int) (short) 10, "hi!");
        org.jooq.Field<java.lang.Integer> intField36 = org.jooq.impl.DSL.length((org.jooq.Field<java.lang.String>) strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(intField36);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sinh((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_25 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField9, strField10, "", (org.jooq.GroupField) strField15, strField22, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strField22.getClass();
        org.jooq.Field<java.lang.String> strField27 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.lpad(strField27, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField37 = null;
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.lpad(strField37, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField46 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_52 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField27, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField36, strField37, "", (org.jooq.GroupField) strField42, strField49, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass53 = strField49.getClass();
        try {
            org.jooq.Field<java.lang.Class<?>> wildcardClassField54 = org.jooq.impl.DSL.nullif(wildcardClass26, wildcardClass53);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField3 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) (-1), datePart2);
        org.jooq.DatePart datePart5 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField6 = org.jooq.impl.DSL.timestampAdd(timestampField3, (java.lang.Number) (byte) -1, datePart5);
        java.sql.Timestamp timestamp7 = null;
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField10 = org.jooq.impl.DSL.timestampAdd(timestamp7, (java.lang.Number) (-1), datePart9);
        org.jooq.DatePart datePart12 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField13 = org.jooq.impl.DSL.timestampAdd(timestampField10, (java.lang.Number) (byte) -1, datePart12);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField14 = org.jooq.impl.DSL.timestampDiff(timestampField3, timestampField10);
        org.jooq.DatePart datePart16 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField17 = org.jooq.impl.DSL.timestampAdd(timestampField3, (java.lang.Number) (-1.0f), datePart16);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(timestampField6);
        org.junit.Assert.assertNotNull(timestampField10);
        org.junit.Assert.assertNotNull(timestampField13);
        org.junit.Assert.assertNotNull(dayToSecondField14);
        org.junit.Assert.assertNotNull(timestampField17);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_29 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField4, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField13, strField14, "", (org.jooq.GroupField) strField19, strField26, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField26);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction3, "");
        org.jooq.Field<?> wildcardField33 = null;
        org.jooq.Field[] fieldArray35 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray36 = (org.jooq.Field<?>[]) fieldArray35;
        wildcardFieldArray36[0] = wildcardField33;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction39 = org.jooq.impl.DSL.denseRank(wildcardFieldArray36);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction40 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.least(strField32, wildcardFieldArray36);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.coalesce(strField32, "hi!");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence46 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep47 = org.jooq.impl.DSL.createSequence(bigIntegerSequence46);
        org.jooq.Field<java.lang.Integer> intField48 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.space(intField48);
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.ltrim(strField49);
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField49, 10, ' ');
        org.jooq.Param<java.lang.String> strParam54 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep47, strField53);
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.concat("hi!", (org.jooq.Field<java.lang.String>) strParam54);
        org.jooq.Param<java.lang.String> strParam57 = org.jooq.impl.DSL.inline('#');
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_58 = org.jooq.impl.DSL.row(strField32, strField55, (org.jooq.Field<java.lang.String>) strParam57);
        org.jooq.Field<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3Field59 = org.jooq.impl.DSL.field(strRow3_58);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(fieldArray35);
        org.junit.Assert.assertNotNull(wildcardFieldArray36);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction39);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(bigIntegerSequence46);
        org.junit.Assert.assertNotNull(createSequenceFinalStep47);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strParam54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strParam57);
        org.junit.Assert.assertNotNull(strRow3_58);
        org.junit.Assert.assertNotNull(strRecord3Field59);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.percentRank();
        java.lang.Class<?> wildcardClass1 = bigDecimalWindowOverStep0.getClass();
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_27 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField2, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField11, strField12, "", (org.jooq.GroupField) strField17, strField24, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = strField24.getClass();
        try {
            org.jooq.Field<java.lang.reflect.AnnotatedElement> annotatedElementField29 = org.jooq.impl.DSL.nullif((java.lang.reflect.AnnotatedElement) wildcardClass1, (java.lang.reflect.AnnotatedElement) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep1 = org.jooq.impl.DSL.ntile(1);
        org.junit.Assert.assertNotNull(intWindowOverStep1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.jooq.SortField[] sortFieldArray1 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[] wildcardSortFieldArray2 = (org.jooq.SortField<?>[]) sortFieldArray1;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep3 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray2);
        org.jooq.SortField<?>[] wildcardSortFieldArray4 = null;
        try {
            org.jooq.Field<org.jooq.SortField<?>[]> wildcardSortFieldArrayField5 = org.jooq.impl.DSL.isnull(wildcardSortFieldArray2, wildcardSortFieldArray4);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.SortField is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(sortFieldArray1);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray2);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep3);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsUnboundedFollowing();
        try {
            org.jooq.Param<org.jooq.WindowSpecificationFinalStep> windowSpecificationFinalStepParam2 = org.jooq.impl.DSL.param("hi!", windowSpecificationFinalStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction9 = org.jooq.impl.DSL.maxDistinct(strField8);
        org.jooq.Param<java.lang.String> strParam10 = org.jooq.impl.DSL.inline((java.lang.Object) intOrderedAggregateFunction7, strField8);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(strAggregateFunction9);
        org.junit.Assert.assertNotNull(strParam10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep79 = org.jooq.impl.DSL.groupConcatDistinct(strField54);
        org.jooq.Field<java.lang.String> strField80 = null;
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.lpad(strField80, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField83);
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField84);
        org.jooq.Field<java.lang.Integer> intField86 = null;
        org.jooq.Field<java.lang.String> strField87 = org.jooq.impl.DSL.space(intField86);
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.ltrim(strField87);
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.rpad(strField88, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.replace((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79, strField84, strField88);
        org.jooq.Field<java.lang.String> strField95 = org.jooq.impl.DSL.substring(strField92, 100, (-1));
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep79);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strField85);
        org.junit.Assert.assertNotNull(strField87);
        org.junit.Assert.assertNotNull(strField88);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(strField95);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep10 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.coalesce(strField3, "");
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep10);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jooq.Row5[] row5Array1 = new org.jooq.Row5[0];
        @SuppressWarnings("unchecked") org.jooq.Row5<org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.Table<?>>[] record1SelectUnionStepRow5Array2 = (org.jooq.Row5<org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.Table<?>>[]) row5Array1;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.Table<?>>> record1SelectUnionStepRecord5Table3 = org.jooq.impl.DSL.values(record1SelectUnionStepRow5Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row5Array1);
        org.junit.Assert.assertNotNull(record1SelectUnionStepRow5Array2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("hi!", 100);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.jooq.Row6[] row6Array1 = new org.jooq.Row6[0];
        @SuppressWarnings("unchecked") org.jooq.Row6<org.jooq.AlterTableStep, java.lang.Object, org.jooq.DSLContext, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.AlterTableStep>[] alterTableStepRow6Array2 = (org.jooq.Row6<org.jooq.AlterTableStep, java.lang.Object, org.jooq.DSLContext, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.AlterTableStep>[]) row6Array1;
        try {
            org.jooq.Table<org.jooq.Record6<org.jooq.AlterTableStep, java.lang.Object, org.jooq.DSLContext, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.AlterTableStep>> alterTableStepRecord6Table3 = org.jooq.impl.DSL.values((org.jooq.Row6<org.jooq.AlterTableStep, java.lang.Object, org.jooq.DSLContext, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.AlterTableStep>[]) row6Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row6Array1);
        org.junit.Assert.assertNotNull(alterTableStepRow6Array2);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction13 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray6);
        org.jooq.QueryPart queryPart14 = org.jooq.impl.DSL.queryPart("hi!", (java.lang.Object[]) wildcardFieldArray6);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep15 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(objField11);
        org.junit.Assert.assertNotNull(objField12);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(queryPart14);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.date("");
        java.sql.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.dateDiff(dateField3, date4);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table6 = org.jooq.impl.DSL.generateSeries((int) (short) 0, intField5);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table7 = org.jooq.impl.DSL.generateSeries(100, intField5);
        org.junit.Assert.assertNotNull(dateField3);
        org.junit.Assert.assertNotNull(intField5);
        org.junit.Assert.assertNotNull(intRecord1Table6);
        org.junit.Assert.assertNotNull(intRecord1Table7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.jooq.Row19[] row19Array1 = new org.jooq.Row19[0];
        @SuppressWarnings("unchecked") org.jooq.Row19<org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropViewFinalStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Object[], org.jooq.CreateSequenceFinalStep, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[] strRow5Row19Array2 = (org.jooq.Row19<org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropViewFinalStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Object[], org.jooq.CreateSequenceFinalStep, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[]) row19Array1;
        try {
            org.jooq.Table<org.jooq.Record19<org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropViewFinalStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Object[], org.jooq.CreateSequenceFinalStep, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>> strRow5Record19Table3 = org.jooq.impl.DSL.values((org.jooq.Row19<org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropViewFinalStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Object[], org.jooq.CreateSequenceFinalStep, org.jooq.SortField<?>[], org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.RowN[], org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>>[]) row19Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row19Array1);
        org.junit.Assert.assertNotNull(strRow5Row19Array2);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline(' ');
        org.junit.Assert.assertNotNull(strParam1);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField5);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.min(strField5);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lastValue(strField5);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.jooq.Field<?>[] wildcardFieldArray0 = null;
        org.jooq.GroupField groupField1 = org.jooq.impl.DSL.rollup(wildcardFieldArray0);
        org.junit.Assert.assertNotNull(groupField1);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.repeat(strField3, (int) '#');
        org.jooq.Field<java.lang.Integer> intField7 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.space(intField7);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.ltrim(strField8);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction10 = org.jooq.impl.DSL.minDistinct(strField8);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.maxDistinct(strField8);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep12 = org.jooq.impl.DSL.groupConcat((org.jooq.Field<java.lang.String>) strAggregateFunction11);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.repeat((org.jooq.Field<java.lang.String>) strAggregateFunction11, (int) (short) -1);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lead(strField3, (int) '#', strField14);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strAggregateFunction10);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep2 = org.jooq.impl.DSL.createTemporaryTable("hi!");
        try {
            org.jooq.Param<org.jooq.CreateTableAsStep<org.jooq.Record>> recordCreateTableAsStepParam3 = org.jooq.impl.DSL.param("hi!", recordCreateTableAsStep2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateTableImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(recordCreateTableAsStep2);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_0 = null;
        try {
            org.jooq.Field<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5Field1 = org.jooq.impl.DSL.field(strRow5_0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space((int) (byte) 1);
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sqrt((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.RowN rowN6 = org.jooq.impl.DSL.row(wildcardFieldArray4);
        org.jooq.Table<org.jooq.Record> recordTable7 = org.jooq.impl.DSL.table("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.jooq.Table<org.jooq.Record> recordTable8 = org.jooq.impl.DSL.table("hi!", (java.lang.Object[]) wildcardFieldArray4);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(groupField5);
        org.junit.Assert.assertNotNull(rowN6);
        org.junit.Assert.assertNotNull(recordTable7);
        org.junit.Assert.assertNotNull(recordTable8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.jooq.Field<java.sql.Time> timeField1 = org.jooq.impl.DSL.time("");
        org.junit.Assert.assertNotNull(timeField1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.jooq.QueryPart[] queryPartArray1 = null;
        org.jooq.QueryPart queryPart2 = org.jooq.impl.DSL.queryPart("", queryPartArray1);
        org.junit.Assert.assertNotNull(queryPart2);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.jooq.Row2<java.lang.reflect.Type, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>> typeRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<java.lang.reflect.Type, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>>[] typeRow2Array3 = (org.jooq.Row2<java.lang.reflect.Type, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>>[]) row2Array2;
        typeRow2Array3[0] = typeRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<java.lang.reflect.Type, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>>> typeRecord2Table6 = org.jooq.impl.DSL.values(typeRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(typeRow2Array3);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline((java.lang.CharSequence) "hi!");
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.currentUser();
        org.jooq.Row1<java.lang.String> strRow1_4 = org.jooq.impl.DSL.row(strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.isnull("", strField3);
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField9);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField9, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.mid(strField9, 10, (-1));
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.md5(strField15);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep17 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField15);
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_18 = org.jooq.impl.DSL.row((org.jooq.Field<java.lang.String>) strParam1, strField3, strField15);
        org.jooq.Field<java.lang.Integer> intField19 = org.jooq.impl.DSL.ascii(strField15);
        org.junit.Assert.assertNotNull(strParam1);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strRow1_4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep17);
        org.junit.Assert.assertNotNull(strRow3_18);
        org.junit.Assert.assertNotNull(intField19);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.rpad(strField54, (int) (short) -1, '4');
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField81);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        org.jooq.Field<java.lang.String> strField80 = null;
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.lpad(strField80, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.concat("hi!", strField80);
        org.jooq.Field<java.lang.String> strField86 = org.jooq.impl.DSL.nullif(strField80, "");
        org.jooq.Field<java.lang.String> strField87 = org.jooq.impl.DSL.nullif(strField64, strField80);
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.replace(strField80, "", "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
        org.junit.Assert.assertNotNull(strField83);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strField86);
        org.junit.Assert.assertNotNull(strField87);
        org.junit.Assert.assertNotNull(strField90);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.RowN rowN2 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray0);
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        org.jooq.GroupField groupField6 = org.jooq.impl.DSL.rollup(wildcardFieldArray5);
        org.jooq.RowN rowN7 = org.jooq.impl.DSL.row(wildcardFieldArray5);
        org.jooq.RowN[] rowNArray8 = new org.jooq.RowN[] { rowN2, rowN7 };
        org.jooq.Table<org.jooq.Record> recordTable9 = org.jooq.impl.DSL.values(rowNArray8);
        org.jooq.Table<org.jooq.Record> recordTable10 = org.jooq.impl.DSL.values(rowNArray8);
        org.jooq.Table<org.jooq.Record> recordTable11 = org.jooq.impl.DSL.values(rowNArray8);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(rowN2);
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(groupField6);
        org.junit.Assert.assertNotNull(rowN7);
        org.junit.Assert.assertNotNull(rowNArray8);
        org.junit.Assert.assertNotNull(recordTable9);
        org.junit.Assert.assertNotNull(recordTable10);
        org.junit.Assert.assertNotNull(recordTable11);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression1 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray3 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray4 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray3;
        wildcardCommonTableExpressionArray4[0] = wildcardCommonTableExpression1;
        org.jooq.WithStep withStep7 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray4);
        org.jooq.Condition condition8 = org.jooq.impl.DSL.condition("", (java.lang.Object[]) wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(commonTableExpressionArray3);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(withStep7);
        org.junit.Assert.assertNotNull(condition8);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.jooq.Name name7 = org.jooq.impl.DSL.name(strArray6);
        org.jooq.WithAsStep withAsStep8 = org.jooq.impl.DSL.withRecursive("", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(withAsStep8);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField10);
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.position(strField3, strField10);
        org.jooq.Field<java.lang.Integer> intField13 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.space(intField13);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.ltrim(strField14);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction16 = org.jooq.impl.DSL.minDistinct(strField14);
        org.jooq.Field<java.lang.Integer> intField17 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.space(intField17);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.ltrim(strField18);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.rpad(strField19, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep23 = org.jooq.impl.DSL.arrayAgg(strField19);
        org.jooq.Field<java.lang.Integer> intField24 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.space(intField24);
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.ltrim(strField25);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField25, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep31 = org.jooq.impl.DSL.lead(strField29, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField32 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.space(intField32);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.nvl(strField33, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep37 = org.jooq.impl.DSL.lag(strField35, 0);
        org.jooq.Field<java.lang.Integer> intField38 = org.jooq.impl.DSL.position(strField29, strField35);
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_39 = org.jooq.impl.DSL.row(strField3, (org.jooq.Field<java.lang.String>) strAggregateFunction16, strField19, strField29);
        try {
            org.jooq.Param<org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRow4Param40 = org.jooq.impl.DSL.val(strRow4_39);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.RowImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(intField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strAggregateFunction16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep23);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep37);
        org.junit.Assert.assertNotNull(intField38);
        org.junit.Assert.assertNotNull(strRow4_39);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.jooq.Row21[] row21Array1 = new org.jooq.Row21[0];
        @SuppressWarnings("unchecked") org.jooq.Row21<org.jooq.CreateViewAsStep, org.jooq.Condition[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN, org.jooq.Scope, org.jooq.DropSequenceFinalStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Condition[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Comparable<java.lang.String>, org.jooq.SQL, org.jooq.Row, org.jooq.Query, org.jooq.SelectField[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL>[] createViewAsStepRow21Array2 = (org.jooq.Row21<org.jooq.CreateViewAsStep, org.jooq.Condition[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN, org.jooq.Scope, org.jooq.DropSequenceFinalStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Condition[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Comparable<java.lang.String>, org.jooq.SQL, org.jooq.Row, org.jooq.Query, org.jooq.SelectField[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL>[]) row21Array1;
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.CreateViewAsStep, org.jooq.Condition[], org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationRowsStep, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN, org.jooq.Scope, org.jooq.DropSequenceFinalStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Condition[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Comparable<java.lang.String>, org.jooq.SQL, org.jooq.Row, org.jooq.Query, org.jooq.SelectField[], org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL>> createViewAsStepRecord21Table3 = org.jooq.impl.DSL.values(createViewAsStepRow21Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row21Array1);
        org.junit.Assert.assertNotNull(createViewAsStepRow21Array2);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray1);
        org.jooq.Table<?> wildcardTable3 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray1);
        org.jooq.WithAsStep withAsStep4 = org.jooq.impl.DSL.with("", strArray1);
        try {
            org.jooq.Table<org.jooq.Record> recordTable5 = org.jooq.impl.DSL.tableByName(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(name2);
        org.junit.Assert.assertNotNull(wildcardTable3);
        org.junit.Assert.assertNotNull(withAsStep4);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.ltrim(strField9);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField17 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField17, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_36 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField20, strField21, "", (org.jooq.GroupField) strField26, strField33, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.space(intField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.ltrim(strField38);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.concat("hi!", strField41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.lpad(strField45, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField58 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.lpad(strField58, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = null;
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.lpad(strField67, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField71 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.lpad(strField71, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep77 = org.jooq.impl.DSL.lag(strField74, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_78 = org.jooq.impl.DSL.row(strField1, strField3, strField9, strField11, strField38, strField48, strField54, strField61, strField64, strField66, strField70, strField74);
        try {
            org.jooq.CaseValueStep<org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRow12CaseValueStep79 = org.jooq.impl.DSL.choose(strRow12_78);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.RowImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep77);
        org.junit.Assert.assertNotNull(strRow12_78);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.jooq.Field<?>[] wildcardFieldArray0 = null;
        try {
            org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep1 = org.jooq.impl.DSL.orderBy(wildcardFieldArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, java.lang.Object[], org.jooq.Name, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>> strSelectFieldRow10_0 = null;
        org.jooq.Row10[] row10Array2 = new org.jooq.Row10[1];
        @SuppressWarnings("unchecked") org.jooq.Row10<org.jooq.SelectField<java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, java.lang.Object[], org.jooq.Name, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>>[] strSelectFieldRow10Array3 = (org.jooq.Row10<org.jooq.SelectField<java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, java.lang.Object[], org.jooq.Name, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>>[]) row10Array2;
        strSelectFieldRow10Array3[0] = strSelectFieldRow10_0;
        try {
            org.jooq.Table<org.jooq.Record10<org.jooq.SelectField<java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, java.lang.Object[], org.jooq.Name, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>>> strSelectFieldRecord10Table6 = org.jooq.impl.DSL.values(strSelectFieldRow10Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row10Array2);
        org.junit.Assert.assertNotNull(strSelectFieldRow10Array3);
    }
}

