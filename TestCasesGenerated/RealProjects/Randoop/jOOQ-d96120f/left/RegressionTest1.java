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
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.trunc(date0);
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Date> dateField4 = org.jooq.impl.DSL.dateSub(dateField1, (java.lang.Number) (-1.0d), datePart3);
        java.sql.Date date5 = null;
        java.sql.Date date6 = null;
        org.jooq.Field<java.sql.Date> dateField7 = org.jooq.impl.DSL.trunc(date6);
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Date> dateField10 = org.jooq.impl.DSL.dateAdd(dateField7, (java.lang.Number) (-1.0d), datePart9);
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.dateDiff(date5, dateField7);
        org.jooq.DatePart datePart13 = null;
        org.jooq.Field<java.sql.Date> dateField14 = org.jooq.impl.DSL.dateAdd(dateField7, (java.lang.Number) 1.0d, datePart13);
        org.jooq.DatePart datePart16 = null;
        org.jooq.Field<java.sql.Date> dateField17 = org.jooq.impl.DSL.dateAdd(dateField7, (java.lang.Number) (byte) 10, datePart16);
        org.jooq.Field<java.lang.Integer> intField18 = org.jooq.impl.DSL.dateDiff(dateField1, dateField17);
        org.junit.Assert.assertNotNull(dateField1);
        org.junit.Assert.assertNotNull(dateField4);
        org.junit.Assert.assertNotNull(dateField7);
        org.junit.Assert.assertNotNull(dateField10);
        org.junit.Assert.assertNotNull(intField11);
        org.junit.Assert.assertNotNull(dateField14);
        org.junit.Assert.assertNotNull(dateField17);
        org.junit.Assert.assertNotNull(intField18);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.ltrim(strField0);
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.jooq.Row20<org.jooq.Field<?>[], org.jooq.WithAsStep, org.jooq.DropIndexFinalStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Schema, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Row, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>> wildcardFieldArrayRow20_0 = null;
        org.jooq.Row20[] row20Array2 = new org.jooq.Row20[1];
        @SuppressWarnings("unchecked") org.jooq.Row20<org.jooq.Field<?>[], org.jooq.WithAsStep, org.jooq.DropIndexFinalStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Schema, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Row, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[] wildcardFieldArrayRow20Array3 = (org.jooq.Row20<org.jooq.Field<?>[], org.jooq.WithAsStep, org.jooq.DropIndexFinalStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Schema, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Row, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[]) row20Array2;
        wildcardFieldArrayRow20Array3[0] = wildcardFieldArrayRow20_0;
        try {
            org.jooq.Table<org.jooq.Record20<org.jooq.Field<?>[], org.jooq.WithAsStep, org.jooq.DropIndexFinalStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Schema, org.jooq.RowN[], java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.lang.String>, org.jooq.Row, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>> wildcardFieldArrayRecord20Table6 = org.jooq.impl.DSL.values(wildcardFieldArrayRow20Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row20Array2);
        org.junit.Assert.assertNotNull(wildcardFieldArrayRow20Array3);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.jooq.Name name7 = org.jooq.impl.DSL.name(strArray6);
        org.jooq.Param<java.lang.Object[]> objArrayParam8 = org.jooq.impl.DSL.param("", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(objArrayParam8);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.jooq.Condition[] conditionArray0 = new org.jooq.Condition[] {};
        org.jooq.Condition condition1 = org.jooq.impl.DSL.or(conditionArray0);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(condition1);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction3 = org.jooq.impl.DSL.every((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction4 = org.jooq.impl.DSL.every((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(conditionArray0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(booleanAggregateFunction3);
        org.junit.Assert.assertNotNull(booleanAggregateFunction4);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField4, 100, "");
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.charLength(strField4);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(intField8);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) '#');
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.bitCount((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction12 = org.jooq.impl.DSL.groupConcat(strField10, "");
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.rpad(strField10, 100, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction20 = org.jooq.impl.DSL.groupConcat(strField18, "");
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.nvl2(strField10, "", (org.jooq.Field<java.lang.String>) strAggregateFunction20);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep28 = org.jooq.impl.DSL.lag(strField25, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.mid(strField25, 10, (-1));
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep32 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField8, (org.jooq.SelectField<java.lang.String>) strAggregateFunction20, (org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.Field<java.lang.Integer> intField33 = org.jooq.impl.DSL.bitLength(strField25);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strAggregateFunction12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strAggregateFunction20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strRecord3SelectSelectStep32);
        org.junit.Assert.assertNotNull(intField33);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray1);
        org.jooq.RowN rowN3 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray1);
        org.jooq.WithAsStep withAsStep4 = org.jooq.impl.DSL.withRecursive("hi!", strArray1);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence5 = org.jooq.impl.DSL.sequenceByName(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(name2);
        org.junit.Assert.assertNotNull(rowN3);
        org.junit.Assert.assertNotNull(withAsStep4);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.lower("");
        try {
            org.jooq.Table<?> wildcardTable2 = org.jooq.impl.DSL.table(strField1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Converting arbitrary types into array tables is currently not supported");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep4 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep5 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep6 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep4);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep5);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep6);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.jooq.Param<java.lang.Object> objParam1 = org.jooq.impl.DSL.param("");
        org.junit.Assert.assertNotNull(objParam1);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.substring(strField0, 100, 1);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.connectByRoot(strField0);
        org.jooq.Field<java.lang.String> strField5 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField8);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep11 = org.jooq.impl.DSL.lag(strField8, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.mid(strField8, 10, (-1));
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.md5(strField14);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (-1), "");
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.right(strField18, 1);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.concat("hi!", strField22);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction33 = org.jooq.impl.DSL.groupConcat(strField31, "");
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.rpad(strField31, 100, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction41 = org.jooq.impl.DSL.groupConcat(strField39, "");
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.nvl2(strField31, "", (org.jooq.Field<java.lang.String>) strAggregateFunction41);
        org.jooq.Field<java.lang.String> strField43 = null;
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.lpad(strField43, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField46);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep49 = org.jooq.impl.DSL.lag(strField46, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.mid(strField46, 10, (-1));
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep53 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField29, (org.jooq.SelectField<java.lang.String>) strAggregateFunction41, (org.jooq.SelectField<java.lang.String>) strField46);
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.lpad(strField46, 10);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep56 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField0, (org.jooq.SelectField<java.lang.String>) strField20, (org.jooq.SelectField<java.lang.String>) strField46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep11);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strAggregateFunction33);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strAggregateFunction41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep49);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strRecord3SelectSelectStep53);
        org.junit.Assert.assertNotNull(strField55);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) (byte) 10, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createGlobalTemporaryTable("hi!");
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.jooq.SortField[] sortFieldArray1 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[] wildcardSortFieldArray2 = (org.jooq.SortField<?>[]) sortFieldArray1;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep3 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray2);
        org.jooq.SortField[][] sortFieldArray5 = new org.jooq.SortField[0][];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[][] wildcardSortFieldArray6 = (org.jooq.SortField<?>[][]) sortFieldArray5;
        try {
            org.jooq.Field<org.jooq.SortField<?>[]> wildcardSortFieldArrayField7 = org.jooq.impl.DSL.least(wildcardSortFieldArray2, wildcardSortFieldArray6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.SortField is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(sortFieldArray1);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray2);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep3);
        org.junit.Assert.assertNotNull(sortFieldArray5);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray6);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) (short) 100, datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep33 = org.jooq.impl.DSL.selectZero();
        org.jooq.Condition condition34 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep33);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table35 = org.jooq.impl.DSL.table((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep33);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep36 = org.jooq.impl.DSL.selectZero();
        try {
            org.jooq.Field<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectOptionStepField37 = org.jooq.impl.DSL.nvl2(strField32, (org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep33, (org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep36);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
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
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep33);
        org.junit.Assert.assertNotNull(condition34);
        org.junit.Assert.assertNotNull(intRecord1Table35);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep36);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField1, 100, "");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.groupConcat(strField9, "");
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.nvl2(strField1, "", (org.jooq.Field<java.lang.String>) strAggregateFunction11);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.concat(strField1, "hi!");
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.rpad(strField14, (int) (byte) 10, '#');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(strField17, "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField3 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) (-1), datePart2);
        org.jooq.DatePart datePart5 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField6 = org.jooq.impl.DSL.timestampAdd(timestampField3, (java.lang.Number) (byte) -1, datePart5);
        org.jooq.DatePart datePart8 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField9 = org.jooq.impl.DSL.timestampAdd(timestampField3, (java.lang.Number) 100.0f, datePart8);
        org.jooq.DatePart datePart11 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField12 = org.jooq.impl.DSL.timestampAdd(timestampField9, (java.lang.Number) 10.0d, datePart11);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(timestampField6);
        org.junit.Assert.assertNotNull(timestampField9);
        org.junit.Assert.assertNotNull(timestampField12);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.lag(strField11, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.mid(strField11, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction21 = org.jooq.impl.DSL.minDistinct(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction22 = org.jooq.impl.DSL.maxDistinct(strField19);
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.concat("hi!", strField25);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.left(strField29, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.right(strField29, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField29);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.coalesce(strField29, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_40 = org.jooq.impl.DSL.row(strField5, strField11, strField19, strField36);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField44);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField45);
        java.lang.Class<?> wildcardClass47 = strField46.getClass();
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.cast(strField19, strField46);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction49 = org.jooq.impl.DSL.max(strField48);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strAggregateFunction21);
        org.junit.Assert.assertNotNull(strAggregateFunction22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strRow4_40);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strAggregateFunction49);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.jooq.Field<java.lang.String> strField0 = null;
        try {
            org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep1 = org.jooq.impl.DSL.arrayAgg(strField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.jooq.Keyword keyword1 = org.jooq.impl.DSL.keyword("");
        org.junit.Assert.assertNotNull(keyword1);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep1 = org.jooq.impl.DSL.groupConcat(strField0);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.hour(date0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.jooq.Row20<org.jooq.WindowSpecificationRowsStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Name, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.DropTableStep, org.jooq.Param<java.lang.String>, org.jooq.DropTableStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.Case, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Case, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateIndexStep>[] windowSpecificationRowsStepRow20Array0 = null;
        try {
            org.jooq.Table<org.jooq.Record20<org.jooq.WindowSpecificationRowsStep, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Name, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.DropTableStep, org.jooq.Param<java.lang.String>, org.jooq.DropTableStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.Case, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.Case, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateIndexStep>> windowSpecificationRowsStepRecord20Table1 = org.jooq.impl.DSL.values(windowSpecificationRowsStepRow20Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (short) 100, datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.jooq.Row16[] row16Array1 = new org.jooq.Row16[0];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.DropTableStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.GroupConcatSeparatorStep, org.jooq.FieldLike, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>[] record1SelectIntoStepRow16Array2 = (org.jooq.Row16<org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.DropTableStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.GroupConcatSeparatorStep, org.jooq.FieldLike, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>[]) row16Array1;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.DropTableStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.GroupConcatSeparatorStep, org.jooq.FieldLike, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>> record1SelectIntoStepRecord16Table3 = org.jooq.impl.DSL.values((org.jooq.Row16<org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.Row, org.jooq.DropTableStep, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.GroupConcatSeparatorStep, org.jooq.FieldLike, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>>[]) row16Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row16Array1);
        org.junit.Assert.assertNotNull(record1SelectIntoStepRow16Array2);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.jooq.Name name2 = org.jooq.impl.DSL.name(strArray1);
        org.jooq.RowN rowN3 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray1);
        org.jooq.Query query4 = org.jooq.impl.DSL.query("", (java.lang.Object[]) strArray1);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence5 = org.jooq.impl.DSL.sequenceByName(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(name2);
        org.junit.Assert.assertNotNull(rowN3);
        org.junit.Assert.assertNotNull(query4);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.jooq.Row15<org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema, org.jooq.QueryPart> intOrderedAggregateFunctionRow15_0 = null;
        org.jooq.Row15[] row15Array2 = new org.jooq.Row15[1];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema, org.jooq.QueryPart>[] intOrderedAggregateFunctionRow15Array3 = (org.jooq.Row15<org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema, org.jooq.QueryPart>[]) row15Array2;
        intOrderedAggregateFunctionRow15Array3[0] = intOrderedAggregateFunctionRow15_0;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.DropSequenceFinalStep, org.jooq.DropViewFinalStep, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema, org.jooq.QueryPart>> intOrderedAggregateFunctionRecord15Table6 = org.jooq.impl.DSL.values(intOrderedAggregateFunctionRow15Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row15Array2);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunctionRow15Array3);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.coth((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.nullif(strField3, "hi!");
        org.jooq.Param<org.jooq.SelectField<java.lang.String>> strSelectFieldParam6 = org.jooq.impl.DSL.param("", (org.jooq.SelectField<java.lang.String>) strField3);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strSelectFieldParam6);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cos((java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("hi!", (int) '#');
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.nullif(strField4, "");
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.upper(strField4);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep12 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField2, (org.jooq.SelectField<java.lang.String>) strField11);
        try {
            org.jooq.Table<?> wildcardTable13 = org.jooq.impl.DSL.unnest(strField11);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Converting arbitrary types into array tables is currently not supported");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep12);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep13 = org.jooq.impl.DSL.lead(strField10, (int) (short) 10, "hi!");
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.position(strField10, "");
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep13);
        org.junit.Assert.assertNotNull(intField15);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.jooq.Row9<org.jooq.GroupConcatOrderByStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Keyword, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>> groupConcatOrderByStepRow9_0 = null;
        org.jooq.Row9[] row9Array2 = new org.jooq.Row9[1];
        @SuppressWarnings("unchecked") org.jooq.Row9<org.jooq.GroupConcatOrderByStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Keyword, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>>[] groupConcatOrderByStepRow9Array3 = (org.jooq.Row9<org.jooq.GroupConcatOrderByStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Keyword, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>>[]) row9Array2;
        groupConcatOrderByStepRow9Array3[0] = groupConcatOrderByStepRow9_0;
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.GroupConcatOrderByStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.Keyword, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>>> groupConcatOrderByStepRecord9Table6 = org.jooq.impl.DSL.values(groupConcatOrderByStepRow9Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row9Array2);
        org.junit.Assert.assertNotNull(groupConcatOrderByStepRow9Array3);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.jooq.Row5[] row5Array1 = new org.jooq.Row5[0];
        @SuppressWarnings("unchecked") org.jooq.Row5<org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DDLQuery>[] createIndexStepRow5Array2 = (org.jooq.Row5<org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DDLQuery>[]) row5Array1;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DDLQuery>> createIndexStepRecord5Table3 = org.jooq.impl.DSL.values((org.jooq.Row5<org.jooq.CreateIndexStep, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.Field<java.lang.String>, org.jooq.DDLQuery>[]) row5Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row5Array1);
        org.junit.Assert.assertNotNull(createIndexStepRow5Array2);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression1 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray3 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray4 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray3;
        wildcardCommonTableExpressionArray4[0] = wildcardCommonTableExpression1;
        org.jooq.WithStep withStep7 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray4);
        org.jooq.Condition condition8 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray4);
        org.jooq.WithStep withStep9 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(commonTableExpressionArray3);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(withStep7);
        org.junit.Assert.assertNotNull(condition8);
        org.junit.Assert.assertNotNull(withStep9);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.jooq.DropViewFinalStep dropViewFinalStep1 = org.jooq.impl.DSL.dropViewIfExists("");
        org.junit.Assert.assertNotNull(dropViewFinalStep1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.jooq.Condition[] conditionArray0 = new org.jooq.Condition[] {};
        org.jooq.Condition condition1 = org.jooq.impl.DSL.or(conditionArray0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.or(conditionArray0);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.and(conditionArray0);
        org.junit.Assert.assertNotNull(conditionArray0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(condition3);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.escape(strField5, '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.rtrim(strField11);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction13 = org.jooq.impl.DSL.count();
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.space((org.jooq.Field<java.lang.Integer>) intAggregateFunction13);
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField19);
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.charLength(strField19);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.nvl(strField14, strField19);
        org.jooq.Field<java.lang.Integer> intField24 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.space(intField24);
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.ltrim(strField25);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction27 = org.jooq.impl.DSL.minDistinct(strField25);
        org.jooq.Field<java.lang.String> strField28 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField34 = null;
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.lpad(strField34, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField43 = null;
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.lpad(strField43, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField47 = null;
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.lpad(strField47, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_53 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField28, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField37, strField38, "", (org.jooq.GroupField) strField43, strField50, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction27, strField50);
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strAggregateFunction27);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.nullif("hi!", strField55);
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_57 = org.jooq.impl.DSL.row(strField12, strField14, strField55);
        org.jooq.Field<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3Field58 = org.jooq.impl.DSL.field(strRow3_57);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(intAggregateFunction13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(intField21);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strAggregateFunction27);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strRow3_57);
        org.junit.Assert.assertNotNull(strRecord3Field58);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep18 = org.jooq.impl.DSL.firstValue(strField11);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep23 = org.jooq.impl.DSL.groupConcat(strField22);
        org.jooq.Field[] fieldArray25 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray26 = (org.jooq.Field<?>[]) fieldArray25;
        org.jooq.GroupField groupField27 = org.jooq.impl.DSL.rollup(wildcardFieldArray26);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep28 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray26);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep29 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray26);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep30 = null;
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence32 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep33 = org.jooq.impl.DSL.createSequence(bigIntegerSequence32);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep34 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence32);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep35 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence32);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep36 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence32);
        try {
            org.jooq.Row6<org.jooq.WindowIgnoreNullsStep<java.lang.String>, java.lang.String, org.jooq.GroupConcatOrderByStep, org.jooq.WindowSpecificationRowsStep, org.jooq.GroupConcatOrderByStep, org.jooq.Attachable> strWindowIgnoreNullsStepRow6_37 = org.jooq.impl.DSL.row(strWindowIgnoreNullsStep18, "", groupConcatOrderByStep23, (org.jooq.WindowSpecificationRowsStep) windowSpecificationOrderByStep29, groupConcatOrderByStep30, (org.jooq.Attachable) dropSequenceFinalStep36);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
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
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep23);
        org.junit.Assert.assertNotNull(fieldArray25);
        org.junit.Assert.assertNotNull(wildcardFieldArray26);
        org.junit.Assert.assertNotNull(groupField27);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep28);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep29);
        org.junit.Assert.assertNotNull(bigIntegerSequence32);
        org.junit.Assert.assertNotNull(createSequenceFinalStep33);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep34);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep35);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep36);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        try {
            org.jooq.Param<org.jooq.Select<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectParam1 = org.jooq.impl.DSL.inline((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        try {
            org.jooq.Param<org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectLimitStepParam2 = org.jooq.impl.DSL.value((org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.jooq.Row5<org.jooq.SQL, org.jooq.DropIndexFinalStep, java.lang.String[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> sQLRow5_0 = null;
        org.jooq.Row5[] row5Array2 = new org.jooq.Row5[1];
        @SuppressWarnings("unchecked") org.jooq.Row5<org.jooq.SQL, org.jooq.DropIndexFinalStep, java.lang.String[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[] sQLRow5Array3 = (org.jooq.Row5<org.jooq.SQL, org.jooq.DropIndexFinalStep, java.lang.String[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row5Array2;
        sQLRow5Array3[0] = sQLRow5_0;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.SQL, org.jooq.DropIndexFinalStep, java.lang.String[], org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>>> sQLRecord5Table6 = org.jooq.impl.DSL.values(sQLRow5Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row5Array2);
        org.junit.Assert.assertNotNull(sQLRow5Array3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat(strArray5);
        org.jooq.CreateViewAsStep createViewAsStep7 = org.jooq.impl.DSL.createView("hi!", strArray5);
        org.jooq.WithAsStep withAsStep8 = org.jooq.impl.DSL.withRecursive("", strArray5);
        try {
            org.jooq.CaseValueStep<org.jooq.WithAsStep> withAsStepCaseValueStep9 = org.jooq.impl.DSL.choose(withAsStep8);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WithImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(createViewAsStep7);
        org.junit.Assert.assertNotNull(withAsStep8);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) 1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lead(strField6);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.jooq.Query query1 = org.jooq.impl.DSL.query("hi!");
        org.junit.Assert.assertNotNull(query1);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.exp((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) 100, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.bitCount((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.escape(strField0, ' ');
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.jooq.Operator operator0 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray4);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.jooq.Condition[] conditionArray8 = new org.jooq.Condition[] { condition7 };
        org.jooq.Condition condition9 = org.jooq.impl.DSL.and(conditionArray8);
        try {
            org.jooq.Condition condition10 = org.jooq.impl.DSL.condition(operator0, conditionArray8);
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
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(strParam1);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.jooq.Schema schema0 = null;
        org.jooq.Param<org.jooq.Schema> schemaParam1 = org.jooq.impl.DSL.value(schema0);
        org.junit.Assert.assertNotNull(schemaParam1);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.date("");
        java.sql.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.dateDiff(dateField2, date3);
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.dateDiff(date0, dateField2);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(intField4);
        org.junit.Assert.assertNotNull(intField5);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction12 = org.jooq.impl.DSL.groupConcat(strField10, "");
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.rpad(strField10, 100, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction20 = org.jooq.impl.DSL.groupConcat(strField18, "");
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.nvl2(strField10, "", (org.jooq.Field<java.lang.String>) strAggregateFunction20);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep28 = org.jooq.impl.DSL.lag(strField25, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.mid(strField25, 10, (-1));
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep32 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField8, (org.jooq.SelectField<java.lang.String>) strAggregateFunction20, (org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence34 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep35 = org.jooq.impl.DSL.createSequence(bigIntegerSequence34);
        org.jooq.Field<java.lang.Integer> intField36 = null;
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.space(intField36);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.ltrim(strField37);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField37, 10, ' ');
        org.jooq.Param<java.lang.String> strParam42 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep35, strField41);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.nvl2(strField25, strField41, "hi!");
        org.jooq.Field<java.lang.Integer> intField45 = null;
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.space(intField45);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.ltrim(strField46);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction48 = org.jooq.impl.DSL.minDistinct(strField46);
        org.jooq.Field<java.lang.String> strField49 = null;
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.lpad(strField49, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = null;
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.lpad(strField55, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField64 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.lpad(strField64, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_74 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField49, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField58, strField59, "", (org.jooq.GroupField) strField64, strField71, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction48, strField71);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep76 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField41, (org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.sysConnectByPath(strField41, "hi!");
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strAggregateFunction12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strAggregateFunction20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strRecord3SelectSelectStep32);
        org.junit.Assert.assertNotNull(bigIntegerSequence34);
        org.junit.Assert.assertNotNull(createSequenceFinalStep35);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strParam42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strAggregateFunction48);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep76);
        org.junit.Assert.assertNotNull(strField78);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction45 = org.jooq.impl.DSL.groupConcat(strField43, "");
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.rpad(strField43, 100, "");
        org.jooq.Field<java.lang.String> strField49 = null;
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.decode(strField32, strField48, strField49);
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.repeat(strField54, (int) '#');
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction58 = org.jooq.impl.DSL.groupConcat(strField54, "hi!");
        org.jooq.Field<java.lang.String> strField60 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.lpad(strField60, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.concat("hi!", strField60);
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.left(strField64, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.right(strField64, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.md5(strField64);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction70 = org.jooq.impl.DSL.min(strField64);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep71 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField50, (org.jooq.SelectField<java.lang.String>) strField54, (org.jooq.SelectField<java.lang.String>) strAggregateFunction70);
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
        org.junit.Assert.assertNotNull(strAggregateFunction45);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strAggregateFunction58);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strAggregateFunction70);
        org.junit.Assert.assertNotNull(strRecord3SelectSelectStep71);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing((int) (byte) 0);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition("hi!");
        org.jooq.Field<java.lang.Boolean> booleanField2 = org.jooq.impl.DSL.field(condition1);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(booleanField2);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.jooq.Row15[] row15Array1 = new org.jooq.Row15[0];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.GroupField, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Attachable, org.jooq.AggregateFunction<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Object[], org.jooq.Row1<java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema>[] groupFieldRow15Array2 = (org.jooq.Row15<org.jooq.GroupField, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Attachable, org.jooq.AggregateFunction<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Object[], org.jooq.Row1<java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema>[]) row15Array1;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.GroupField, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Attachable, org.jooq.AggregateFunction<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Object[], org.jooq.Row1<java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema>> groupFieldRecord15Table3 = org.jooq.impl.DSL.values((org.jooq.Row15<org.jooq.GroupField, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.Attachable, org.jooq.AggregateFunction<java.lang.String>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Case, java.lang.Object[], org.jooq.Row1<java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema>[]) row15Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row15Array1);
        org.junit.Assert.assertNotNull(groupFieldRow15Array2);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsFollowing((int) (byte) 100);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.trunc(date0);
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Date> dateField4 = org.jooq.impl.DSL.dateAdd(dateField1, (java.lang.Number) (-1.0d), datePart3);
        java.sql.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.dateDiff(dateField4, date5);
        org.junit.Assert.assertNotNull(dateField1);
        org.junit.Assert.assertNotNull(dateField4);
        org.junit.Assert.assertNotNull(intField6);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.RowN rowN5 = org.jooq.impl.DSL.row(wildcardFieldArray3);
        org.jooq.Field<java.lang.Object> objField6 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep8 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(rowN5);
        org.junit.Assert.assertNotNull(objField6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(recordSelectSelectStep8);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat(strArray6);
        org.jooq.CreateViewAsStep createViewAsStep8 = org.jooq.impl.DSL.createView("hi!", strArray6);
        org.jooq.WithAsStep withAsStep9 = org.jooq.impl.DSL.withRecursive("", strArray6);
        org.jooq.WithAsStep withAsStep10 = org.jooq.impl.DSL.withRecursive("hi!", strArray6);
        org.jooq.Table<org.jooq.Record> recordTable11 = org.jooq.impl.DSL.tableByName(strArray6);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence12 = org.jooq.impl.DSL.sequenceByName(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : \"hi!\".\"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(createViewAsStep8);
        org.junit.Assert.assertNotNull(withAsStep9);
        org.junit.Assert.assertNotNull(withAsStep10);
        org.junit.Assert.assertNotNull(recordTable11);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.jooq.Field<?> wildcardField1 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        wildcardFieldArray4[0] = wildcardField1;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.denseRank(wildcardFieldArray4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat(wildcardFieldArray4);
        org.jooq.Field<java.lang.Object> objField9 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray4);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction10 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(objField9);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction10);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.jooq.Field<java.lang.String> strField0 = null;
        try {
            org.jooq.Table<?> wildcardTable1 = org.jooq.impl.DSL.unnest(strField0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("", 10);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.trim("hi!");
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField1, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lead(strField5, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.space(intField8);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.nvl(strField9, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep13 = org.jooq.impl.DSL.lag(strField11, 0);
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.position(strField5, strField11);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lower(strField11);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        try {
            org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep9 = org.jooq.impl.DSL.orderBy(wildcardFieldArray3);
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
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.lag(strField11, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.mid(strField11, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction21 = org.jooq.impl.DSL.minDistinct(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction22 = org.jooq.impl.DSL.maxDistinct(strField19);
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.concat("hi!", strField25);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.left(strField29, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.right(strField29, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField29);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.coalesce(strField29, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_40 = org.jooq.impl.DSL.row(strField5, strField11, strField19, strField36);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep41 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField36);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strAggregateFunction21);
        org.junit.Assert.assertNotNull(strAggregateFunction22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strRow4_40);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep41);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.Field<java.lang.String> strField16 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.concat("hi!", strField16);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.left(strField20, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.right(strField20, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField20);
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField29);
        org.jooq.Field<?> wildcardField32 = null;
        org.jooq.Field[] fieldArray34 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray35 = (org.jooq.Field<?>[]) fieldArray34;
        wildcardFieldArray35[0] = wildcardField32;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction38 = org.jooq.impl.DSL.denseRank(wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.concat(wildcardFieldArray35);
        org.jooq.Field<java.lang.Object> objField40 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.least(strField30, wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.replace(strField13, strField25, strField30);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.defaultValue(strField25);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(fieldArray34);
        org.junit.Assert.assertNotNull(wildcardFieldArray35);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(objField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField43);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField1, 100, "");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.groupConcat(strField9, "");
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.nvl2(strField1, "", (org.jooq.Field<java.lang.String>) strAggregateFunction11);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.concat(strField1, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag(strField14);
        org.jooq.Field<java.lang.String> strField16 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField19);
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.rpad(strField19, 10, "hi!");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep24 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField14, (org.jooq.SelectField<java.lang.String>) strField23);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep24);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep59 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField32);
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
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep59);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        try {
            org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.table(strField1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Converting arbitrary types into array tables is currently not supported");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(timestampField2);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep4 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction3);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.repeat("", (int) 'a');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep9 = org.jooq.impl.DSL.lag(strField7, (int) (short) -1);
        org.jooq.Row2<java.lang.String, java.lang.String> strRow2_10 = org.jooq.impl.DSL.row((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField7);
        org.jooq.Field<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2Field11 = org.jooq.impl.DSL.field(strRow2_10);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep4);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep9);
        org.junit.Assert.assertNotNull(strRow2_10);
        org.junit.Assert.assertNotNull(strRecord2Field11);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        org.jooq.Field<?> wildcardField34 = null;
        org.jooq.Field[] fieldArray36 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray37 = (org.jooq.Field<?>[]) fieldArray36;
        wildcardFieldArray37[0] = wildcardField34;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction40 = org.jooq.impl.DSL.denseRank(wildcardFieldArray37);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction41 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray37);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.least(strField33, wildcardFieldArray37);
        org.jooq.Field<java.lang.Object> objField43 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray37);
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
        org.junit.Assert.assertNotNull(fieldArray36);
        org.junit.Assert.assertNotNull(wildcardFieldArray37);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction40);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(objField43);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.jooq.SortField<?>[] wildcardSortFieldArray0 = null;
        org.jooq.SortField[] sortFieldArray2 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[] wildcardSortFieldArray3 = (org.jooq.SortField<?>[]) sortFieldArray2;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep4 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray3);
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep5 = org.jooq.impl.DSL.orderBy(wildcardSortFieldArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.concat(strArray10);
        org.jooq.CreateViewAsStep createViewAsStep12 = org.jooq.impl.DSL.createView("hi!", strArray10);
        org.jooq.Field[] fieldArray15 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray16 = (org.jooq.Field<?>[]) fieldArray15;
        org.jooq.GroupField groupField17 = org.jooq.impl.DSL.rollup(wildcardFieldArray16);
        org.jooq.RowN rowN18 = org.jooq.impl.DSL.row(wildcardFieldArray16);
        org.jooq.Field<java.lang.Object> objField19 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray16);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction20 = org.jooq.impl.DSL.percentRank(wildcardFieldArray16);
        try {
            org.jooq.Field<org.jooq.CreateViewAsStep> createViewAsStepField21 = org.jooq.impl.DSL.decode(wildcardSortFieldArray0, wildcardSortFieldArray3, createViewAsStep12, (java.lang.Object[]) wildcardFieldArray16);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.SortField is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(sortFieldArray2);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray3);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep4);
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(createViewAsStep12);
        org.junit.Assert.assertNotNull(fieldArray15);
        org.junit.Assert.assertNotNull(wildcardFieldArray16);
        org.junit.Assert.assertNotNull(groupField17);
        org.junit.Assert.assertNotNull(rowN18);
        org.junit.Assert.assertNotNull(objField19);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction20);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.repeat("", (int) '4');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.replace(strField3, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.isnull(strField0, strField3);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing((int) (short) 1);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.lag(strField7, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.mid(strField7, 10, (-1));
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.left(strField7, (int) '4');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(strField7, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5(strField7);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField22);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep25 = org.jooq.impl.DSL.lag(strField22, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.mid(strField22, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField30 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.space(intField30);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.ltrim(strField31);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.rpad(strField32, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.concat("", strField35);
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.concat("hi!", strField38);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.left(strField42, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.right(strField42, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.escape(strField42, '4');
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_49 = org.jooq.impl.DSL.row(strField1, strField7, strField28, strField36, strField42);
        org.jooq.Field<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5Field50 = org.jooq.impl.DSL.field(strRow5_49);
        org.jooq.Field<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5Field51 = org.jooq.impl.DSL.field(strRow5_49);
        org.jooq.Field<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5Field52 = org.jooq.impl.DSL.field(strRow5_49);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep25);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strRow5_49);
        org.junit.Assert.assertNotNull(strRecord5Field50);
        org.junit.Assert.assertNotNull(strRecord5Field51);
        org.junit.Assert.assertNotNull(strRecord5Field52);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] {};
        org.jooq.Condition condition2 = org.jooq.impl.DSL.or(conditionArray1);
        org.jooq.QueryPart queryPart3 = org.jooq.impl.DSL.queryPart("hi!", (java.lang.Object[]) conditionArray1);
        org.junit.Assert.assertNotNull(conditionArray1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(queryPart3);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) (short) 10);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField3 = org.jooq.impl.DSL.timestampAdd(timestamp0, (java.lang.Number) 1, datePart2);
        org.junit.Assert.assertNotNull(timestampField3);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.percentRank();
        java.lang.Class<?> wildcardClass1 = bigDecimalWindowOverStep0.getClass();
        org.jooq.Field<?>[] wildcardFieldArray2 = null;
        org.jooq.RowN rowN3 = org.jooq.impl.DSL.row(wildcardFieldArray2);
        org.jooq.Condition[] conditionArray4 = new org.jooq.Condition[] {};
        org.jooq.Condition condition5 = org.jooq.impl.DSL.or(conditionArray4);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.falseCondition();
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression8 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray10 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray11 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray10;
        wildcardCommonTableExpressionArray11[0] = wildcardCommonTableExpression8;
        org.jooq.WithStep withStep14 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray11);
        org.jooq.Condition condition15 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray11);
        org.jooq.Condition condition16 = org.jooq.impl.DSL.trueCondition();
        org.jooq.Condition[] conditionArray17 = new org.jooq.Condition[] {};
        org.jooq.Condition condition18 = org.jooq.impl.DSL.or(conditionArray17);
        org.jooq.Condition[] conditionArray19 = new org.jooq.Condition[] { condition5, condition6, condition15, condition16, condition18 };
        org.jooq.Condition condition20 = org.jooq.impl.DSL.and(conditionArray19);
        org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectLimitStep21 = null;
        try {
            org.jooq.Row4<java.lang.reflect.Type, org.jooq.RowN, org.jooq.Condition[], org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>> typeRow4_22 = org.jooq.impl.DSL.row((java.lang.reflect.Type) wildcardClass1, rowN3, conditionArray19, intRecord1SelectLimitStep21);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(rowN3);
        org.junit.Assert.assertNotNull(conditionArray4);
        org.junit.Assert.assertNotNull(condition5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(commonTableExpressionArray10);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray11);
        org.junit.Assert.assertNotNull(withStep14);
        org.junit.Assert.assertNotNull(condition15);
        org.junit.Assert.assertNotNull(condition16);
        org.junit.Assert.assertNotNull(conditionArray17);
        org.junit.Assert.assertNotNull(condition18);
        org.junit.Assert.assertNotNull(conditionArray19);
        org.junit.Assert.assertNotNull(condition20);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.jooq.Row5<org.jooq.WindowOverStep<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Keyword, org.jooq.DDLQuery, org.jooq.DropTableStep>[] strWindowOverStepRow5Array0 = null;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.WindowOverStep<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Keyword, org.jooq.DDLQuery, org.jooq.DropTableStep>> strWindowOverStepRecord5Table1 = org.jooq.impl.DSL.values(strWindowOverStepRow5Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sinh((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.jooq.Param<java.lang.Comparable<java.lang.String>> strComparableParam2 = org.jooq.impl.DSL.param("", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableParam2);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileCont((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        try {
            org.jooq.Param<org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectIntoStepParam1 = org.jooq.impl.DSL.inline((org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat(strArray4);
        org.jooq.CreateViewAsStep createViewAsStep6 = org.jooq.impl.DSL.createView("hi!", strArray4);
        org.jooq.Name name7 = org.jooq.impl.DSL.name(strArray4);
        org.jooq.Table<org.jooq.Record> recordTable8 = org.jooq.impl.DSL.table(name7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(createViewAsStep6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(recordTable8);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.denseRank(wildcardFieldArray5);
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery9 = org.jooq.impl.DSL.resultQuery("hi!", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Query query10 = org.jooq.impl.DSL.query("hi!", (org.jooq.QueryPart[]) wildcardFieldArray5);
        org.jooq.GroupField groupField11 = org.jooq.impl.DSL.rollup(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction8);
        org.junit.Assert.assertNotNull(recordResultQuery9);
        org.junit.Assert.assertNotNull(query10);
        org.junit.Assert.assertNotNull(groupField11);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.jooq.DropViewFinalStep dropViewFinalStep1 = org.jooq.impl.DSL.dropView("hi!");
        org.junit.Assert.assertNotNull(dropViewFinalStep1);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField9 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.replace(strField12, "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.escape(strField15, ' ');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.left("", 1);
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_21 = org.jooq.impl.DSL.row(strField5, strField15, strField20);
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.sysConnectByPath(strField5, "hi!");
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strRow3_21);
        org.junit.Assert.assertNotNull(strField23);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray2);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.least("", strArray2);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("hi!", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(wildcardTable4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(condition6);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Date> dateField4 = org.jooq.impl.DSL.dateAdd(date1, (java.lang.Number) (byte) 100, datePart3);
        java.sql.Date date5 = null;
        org.jooq.Field<java.sql.Date> dateField7 = org.jooq.impl.DSL.dateSub(date5, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.dateDiff(dateField4, dateField7);
        org.jooq.DatePart datePart10 = null;
        org.jooq.Field<java.sql.Date> dateField11 = org.jooq.impl.DSL.dateAdd(dateField4, (java.lang.Number) 10.0d, datePart10);
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.dateDiff(date0, dateField4);
        org.junit.Assert.assertNotNull(dateField4);
        org.junit.Assert.assertNotNull(dateField7);
        org.junit.Assert.assertNotNull(intField8);
        org.junit.Assert.assertNotNull(dateField11);
        org.junit.Assert.assertNotNull(intField12);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) (-1.0d), datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.upper(strField19);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.prior(strField19);
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField48 = null;
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.lpad(strField48, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField52 = null;
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.lpad(strField52, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField57 = null;
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.lpad(strField57, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField61 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.lpad(strField61, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_67 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField42, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField51, strField52, "", (org.jooq.GroupField) strField57, strField64, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.nvl(strField41, strField57);
        org.jooq.Row1<java.lang.String> strRow1_69 = org.jooq.impl.DSL.row(strField68);
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
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_67);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strRow1_69);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cos((java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.concat(strArray3);
        org.jooq.Table<org.jooq.Record> recordTable5 = org.jooq.impl.DSL.tableByName(strArray3);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence6 = org.jooq.impl.DSL.sequenceByName(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : \"hi!\".\"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(recordTable5);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.jooq.Field<?>[] wildcardFieldArray0 = null;
        org.jooq.RowN rowN1 = org.jooq.impl.DSL.row(wildcardFieldArray0);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.RowN rowN4 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray2);
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray7);
        org.jooq.RowN rowN9 = org.jooq.impl.DSL.row(wildcardFieldArray7);
        org.jooq.Field<?>[] wildcardFieldArray10 = null;
        org.jooq.RowN rowN11 = org.jooq.impl.DSL.row(wildcardFieldArray10);
        org.jooq.Field[] fieldArray13 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray14 = (org.jooq.Field<?>[]) fieldArray13;
        org.jooq.GroupField groupField15 = org.jooq.impl.DSL.rollup(wildcardFieldArray14);
        org.jooq.RowN rowN16 = org.jooq.impl.DSL.row(wildcardFieldArray14);
        org.jooq.RowN[] rowNArray17 = new org.jooq.RowN[] { rowN1, rowN4, rowN9, rowN11, rowN16 };
        try {
            org.jooq.Table<org.jooq.Record> recordTable18 = org.jooq.impl.DSL.values(rowNArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rowN1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(rowN4);
        org.junit.Assert.assertNotNull(fieldArray6);
        org.junit.Assert.assertNotNull(wildcardFieldArray7);
        org.junit.Assert.assertNotNull(groupField8);
        org.junit.Assert.assertNotNull(rowN9);
        org.junit.Assert.assertNotNull(rowN11);
        org.junit.Assert.assertNotNull(fieldArray13);
        org.junit.Assert.assertNotNull(wildcardFieldArray14);
        org.junit.Assert.assertNotNull(groupField15);
        org.junit.Assert.assertNotNull(rowN16);
        org.junit.Assert.assertNotNull(rowNArray17);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) (-1.0d), 0);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
        org.jooq.Field<java.sql.Timestamp> timestampField17 = org.jooq.impl.DSL.timestampAdd(timestampField10, (java.lang.Number) (byte) 0, datePart16);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(timestampField6);
        org.junit.Assert.assertNotNull(timestampField10);
        org.junit.Assert.assertNotNull(timestampField13);
        org.junit.Assert.assertNotNull(dayToSecondField14);
        org.junit.Assert.assertNotNull(timestampField17);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        try {
            org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep9 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray3);
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
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.concat(strArray3);
        org.jooq.Name name5 = org.jooq.impl.DSL.name(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.timestamp(date0);
        org.junit.Assert.assertNotNull(timestampField1);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.deg((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.atan((java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.jooq.Row22[] row22Array1 = new org.jooq.Row22[0];
        @SuppressWarnings("unchecked") org.jooq.Row22<org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Row, org.jooq.SQL, org.jooq.FieldLike, org.jooq.Table<?>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Table<?>, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>[] strWindowBeforeOverStepRow22Array2 = (org.jooq.Row22<org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Row, org.jooq.SQL, org.jooq.FieldLike, org.jooq.Table<?>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Table<?>, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>[]) row22Array1;
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.Row, org.jooq.SQL, org.jooq.FieldLike, org.jooq.Table<?>, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Table<?>, org.jooq.DropIndexFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>> strWindowBeforeOverStepRecord22Table3 = org.jooq.impl.DSL.values(strWindowBeforeOverStepRow22Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row22Array1);
        org.junit.Assert.assertNotNull(strWindowBeforeOverStepRow22Array2);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.jooq.Row11<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Name, java.lang.Class<?>, java.lang.Object, java.io.Serializable, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectForUpdateStepRow11_0 = null;
        org.jooq.Row11[] row11Array2 = new org.jooq.Row11[1];
        @SuppressWarnings("unchecked") org.jooq.Row11<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Name, java.lang.Class<?>, java.lang.Object, java.io.Serializable, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>>[] record1SelectForUpdateStepRow11Array3 = (org.jooq.Row11<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Name, java.lang.Class<?>, java.lang.Object, java.io.Serializable, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>>[]) row11Array2;
        record1SelectForUpdateStepRow11Array3[0] = intRecord1SelectForUpdateStepRow11_0;
        try {
            org.jooq.Table<org.jooq.Record11<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Name, java.lang.Class<?>, java.lang.Object, java.io.Serializable, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>>> record1SelectForUpdateStepRecord11Table6 = org.jooq.impl.DSL.values(record1SelectForUpdateStepRow11Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row11Array2);
        org.junit.Assert.assertNotNull(record1SelectForUpdateStepRow11Array3);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cot((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.jooq.Row4[] row4Array1 = new org.jooq.Row4[0];
        @SuppressWarnings("unchecked") org.jooq.Row4<org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>[] queryPartRow4Array2 = (org.jooq.Row4<org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>[]) row4Array1;
        try {
            org.jooq.Table<org.jooq.Record4<org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>> queryPartRecord4Table3 = org.jooq.impl.DSL.values((org.jooq.Row4<org.jooq.QueryPart, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>>[]) row4Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row4Array1);
        org.junit.Assert.assertNotNull(queryPartRow4Array2);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) '4');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.replace(strField2, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.right(strField2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.concat(strArray3);
        org.jooq.RowN rowN5 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(rowN5);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.defaultValue(strField5);
        org.jooq.Field[] fieldArray13 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray14 = (org.jooq.Field<?>[]) fieldArray13;
        org.jooq.GroupField groupField15 = org.jooq.impl.DSL.rollup(wildcardFieldArray14);
        org.jooq.RowN rowN16 = org.jooq.impl.DSL.row(wildcardFieldArray14);
        org.jooq.Field<java.lang.Object> objField17 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray14);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction18 = org.jooq.impl.DSL.percentRank(wildcardFieldArray14);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep19 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray14);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.least(strField5, wildcardFieldArray14);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(fieldArray13);
        org.junit.Assert.assertNotNull(wildcardFieldArray14);
        org.junit.Assert.assertNotNull(groupField15);
        org.junit.Assert.assertNotNull(rowN16);
        org.junit.Assert.assertNotNull(objField17);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction18);
        org.junit.Assert.assertNotNull(recordSelectSelectStep19);
        org.junit.Assert.assertNotNull(strField20);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tan((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("", (int) (short) 10);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.rtrim(strField2);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, sQLDialect1);
        java.sql.Connection connection3 = null;
        org.jooq.SQLDialect sQLDialect4 = null;
        org.jooq.conf.Settings settings5 = null;
        org.jooq.DSLContext dSLContext6 = org.jooq.impl.DSL.using(connection3, sQLDialect4, settings5);
        org.jooq.ConnectionProvider connectionProvider7 = null;
        org.jooq.SQLDialect sQLDialect8 = null;
        org.jooq.conf.Settings settings9 = null;
        org.jooq.DSLContext dSLContext10 = org.jooq.impl.DSL.using(connectionProvider7, sQLDialect8, settings9);
        org.jooq.ConnectionProvider connectionProvider11 = null;
        org.jooq.SQLDialect sQLDialect12 = null;
        org.jooq.DSLContext dSLContext13 = org.jooq.impl.DSL.using(connectionProvider11, sQLDialect12);
        org.jooq.Configuration configuration14 = null;
        org.jooq.DSLContext dSLContext15 = org.jooq.impl.DSL.using(configuration14);
        javax.sql.DataSource dataSource16 = null;
        org.jooq.SQLDialect sQLDialect17 = null;
        org.jooq.DSLContext dSLContext18 = org.jooq.impl.DSL.using(dataSource16, sQLDialect17);
        org.jooq.DSLContext[] dSLContextArray19 = new org.jooq.DSLContext[] { dSLContext6, dSLContext10, dSLContext13, dSLContext15, dSLContext18 };
        try {
            org.jooq.Field<org.jooq.DSLContext> dSLContextField20 = org.jooq.impl.DSL.least(dSLContext2, dSLContextArray19);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.DefaultDSLContext is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dSLContext2);
        org.junit.Assert.assertNotNull(dSLContext6);
        org.junit.Assert.assertNotNull(dSLContext10);
        org.junit.Assert.assertNotNull(dSLContext13);
        org.junit.Assert.assertNotNull(dSLContext15);
        org.junit.Assert.assertNotNull(dSLContext18);
        org.junit.Assert.assertNotNull(dSLContextArray19);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.SQL sQL6 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.rank(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep8 = org.jooq.impl.DSL.orderBy(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep8);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.jooq.Field<?>[] wildcardFieldArray0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.concat(wildcardFieldArray0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.trim(strField1);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep4 = org.jooq.impl.DSL.lead(strField1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep4);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] {};
        org.jooq.Condition condition2 = org.jooq.impl.DSL.or(conditionArray1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.or(conditionArray1);
        try {
            org.jooq.Param<org.jooq.Condition[]> conditionArrayParam4 = org.jooq.impl.DSL.param("", conditionArray1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Condition is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(conditionArray1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(condition3);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.denseRank(wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat(wildcardFieldArray5);
        org.jooq.Field<java.lang.Object> objField10 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray5);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction12 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray5);
        org.jooq.GroupField groupField13 = org.jooq.impl.DSL.rollup(wildcardFieldArray5);
        try {
            org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep14 = org.jooq.impl.DSL.orderBy(wildcardFieldArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(objField10);
        org.junit.Assert.assertNotNull(objField11);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction12);
        org.junit.Assert.assertNotNull(groupField13);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createGlobalTemporaryTable("");
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.jooq.Row9<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, java.lang.Comparable<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectWhereStepRow9_0 = null;
        org.jooq.Row9[] row9Array2 = new org.jooq.Row9[1];
        @SuppressWarnings("unchecked") org.jooq.Row9<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, java.lang.Comparable<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>>[] record1SelectWhereStepRow9Array3 = (org.jooq.Row9<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, java.lang.Comparable<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>>[]) row9Array2;
        record1SelectWhereStepRow9Array3[0] = intRecord1SelectWhereStepRow9_0;
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DSLContext, java.lang.Comparable<java.lang.String>, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>>> record1SelectWhereStepRecord9Table6 = org.jooq.impl.DSL.values(record1SelectWhereStepRow9Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row9Array2);
        org.junit.Assert.assertNotNull(record1SelectWhereStepRow9Array3);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.trunc(date1);
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Date> dateField5 = org.jooq.impl.DSL.dateAdd(dateField2, (java.lang.Number) (-1.0d), datePart4);
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.dateDiff(date0, dateField2);
        org.jooq.DatePart datePart8 = null;
        org.jooq.Field<java.sql.Date> dateField9 = org.jooq.impl.DSL.dateAdd(dateField2, (java.lang.Number) 1.0d, datePart8);
        org.jooq.DatePart datePart11 = null;
        org.jooq.Field<java.sql.Date> dateField12 = org.jooq.impl.DSL.dateSub(dateField9, (java.lang.Number) 0, datePart11);
        java.sql.Date date13 = null;
        org.jooq.DatePart datePart15 = null;
        org.jooq.Field<java.sql.Date> dateField16 = org.jooq.impl.DSL.dateAdd(date13, (java.lang.Number) (byte) 100, datePart15);
        java.sql.Date date17 = null;
        org.jooq.Field<java.sql.Date> dateField19 = org.jooq.impl.DSL.dateSub(date17, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.dateDiff(dateField16, dateField19);
        org.jooq.DatePart datePart22 = null;
        org.jooq.Field<java.sql.Date> dateField23 = org.jooq.impl.DSL.dateAdd(dateField19, (java.lang.Number) (-1.0d), datePart22);
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.dateDiff(dateField12, dateField19);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(dateField5);
        org.junit.Assert.assertNotNull(intField6);
        org.junit.Assert.assertNotNull(dateField9);
        org.junit.Assert.assertNotNull(dateField12);
        org.junit.Assert.assertNotNull(dateField16);
        org.junit.Assert.assertNotNull(dateField19);
        org.junit.Assert.assertNotNull(intField20);
        org.junit.Assert.assertNotNull(dateField23);
        org.junit.Assert.assertNotNull(intField24);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.ascii(strField0);
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        org.jooq.Field<?>[] wildcardFieldArray92 = null;
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.greatest((org.jooq.Field<java.lang.String>) strParam91, wildcardFieldArray92);
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
        org.junit.Assert.assertNotNull(strField93);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray4);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.jooq.Condition[] conditionArray8 = new org.jooq.Condition[] { condition7 };
        org.jooq.Condition condition9 = org.jooq.impl.DSL.and(conditionArray8);
        org.jooq.Query query10 = org.jooq.impl.DSL.query("hi!", (org.jooq.QueryPart[]) conditionArray8);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(groupField5);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep6);
        org.junit.Assert.assertNotNull(condition7);
        org.junit.Assert.assertNotNull(conditionArray8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(query10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.concat(strArray31);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.nvl("hi!", strField32);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) strSelectFieldRecord10Field26, strField32);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strSelectFieldRecord10Field26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
        try {
            org.jooq.CaseValueStep<org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>> strRow3CaseValueStep59 = org.jooq.impl.DSL.choose(strRow3_58);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.RowImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
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
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.coth((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.isnull(strField1, "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.length("");
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat("hi!", strField6);
        org.jooq.Field<java.lang.Integer> intField11 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.space(intField11);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.ltrim(strField12);
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = null;
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.lpad(strField20, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField24 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField24, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_39 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField14, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField23, strField24, "", (org.jooq.GroupField) strField29, strField36, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField40 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.space(intField40);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.ltrim(strField41);
        org.jooq.Field<java.lang.String> strField44 = null;
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.lpad(strField44, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.concat("hi!", strField44);
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.lpad(strField48, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField53 = null;
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.lpad(strField53, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.concat("hi!", strField53);
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.lpad(strField57, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField61 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.lpad(strField61, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.space(intField65);
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.ltrim(strField66);
        org.jooq.Field<java.lang.Integer> intField68 = null;
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.space(intField68);
        org.jooq.Field<java.lang.String> strField70 = null;
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.lpad(strField70, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField74 = null;
        org.jooq.Field<java.lang.String> strField77 = org.jooq.impl.DSL.lpad(strField74, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField77);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep80 = org.jooq.impl.DSL.lag(strField77, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_81 = org.jooq.impl.DSL.row(strField4, strField6, strField12, strField14, strField41, strField51, strField57, strField64, strField67, strField69, strField73, strField77);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep82 = org.jooq.impl.DSL.groupConcatDistinct(strField57);
        org.jooq.Field<java.lang.String> strField83 = null;
        org.jooq.Field<java.lang.String> strField86 = org.jooq.impl.DSL.lpad(strField83, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField87 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField86);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep89 = org.jooq.impl.DSL.lag(strField86, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.mid(strField86, 10, (-1));
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.md5(strField92);
        org.jooq.Param<java.lang.String> strParam94 = org.jooq.impl.DSL.value((java.lang.Object) groupConcatOrderByStep82, strField92);
        org.jooq.Field<java.lang.Integer> intField95 = org.jooq.impl.DSL.length(strField92);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table96 = org.jooq.impl.DSL.generateSeries(intField2, intField95);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table97 = org.jooq.impl.DSL.generateSeries((int) (byte) 0, intField95);
        org.junit.Assert.assertNotNull(intField2);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_39);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField77);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep80);
        org.junit.Assert.assertNotNull(strRow12_81);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep82);
        org.junit.Assert.assertNotNull(strField86);
        org.junit.Assert.assertNotNull(strField87);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep89);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(strField93);
        org.junit.Assert.assertNotNull(strParam94);
        org.junit.Assert.assertNotNull(intField95);
        org.junit.Assert.assertNotNull(intRecord1Table96);
        org.junit.Assert.assertNotNull(intRecord1Table97);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.concat(strArray3);
        org.jooq.Table<org.jooq.Record> recordTable5 = org.jooq.impl.DSL.tableByName(strArray3);
        org.jooq.Table<org.jooq.Record> recordTable6 = org.jooq.impl.DSL.tableByName(strArray3);
        org.jooq.Field<java.lang.Object> objField7 = org.jooq.impl.DSL.fieldByName(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(recordTable5);
        org.junit.Assert.assertNotNull(recordTable6);
        org.junit.Assert.assertNotNull(objField7);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.nullif(strField1, "");
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.ltrim(strField7);
        org.jooq.Field<java.lang.String> strField9 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField12);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag(strField12, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.mid(strField12, 10, (-1));
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.md5(strField18);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (-1), "");
        org.jooq.Field<java.lang.String> strField24 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField24, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField27);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep30 = org.jooq.impl.DSL.lag(strField27, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.mid(strField27, 10, (-1));
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.md5(strField33);
        org.jooq.Field<java.lang.String> strField36 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.concat("hi!", strField36);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.left(strField40, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.right(strField40, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField46 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.concat("hi!", strField46);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.left(strField50, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.right(strField50, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.replace(strField34, strField44, strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.replace(strField50, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep58 = org.jooq.impl.DSL.lead(strField19, (int) (short) 0, strField57);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep59 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField7, (org.jooq.SelectField<java.lang.String>) strField19);
        org.jooq.Row1<java.lang.String> strRow1_60 = org.jooq.impl.DSL.row(strField19);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep30);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep58);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep59);
        org.junit.Assert.assertNotNull(strRow1_60);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.jooq.Row20<org.jooq.CreateViewAsStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.WindowSpecification, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.WithAsStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>> createViewAsStepRow20_0 = null;
        org.jooq.Row20[] row20Array2 = new org.jooq.Row20[1];
        @SuppressWarnings("unchecked") org.jooq.Row20<org.jooq.CreateViewAsStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.WindowSpecification, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.WithAsStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>>[] createViewAsStepRow20Array3 = (org.jooq.Row20<org.jooq.CreateViewAsStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.WindowSpecification, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.WithAsStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>>[]) row20Array2;
        createViewAsStepRow20Array3[0] = createViewAsStepRow20_0;
        try {
            org.jooq.Table<org.jooq.Record20<org.jooq.CreateViewAsStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.RowN[], org.jooq.Param<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.WindowSpecification, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.WithAsStep, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseValueStep<java.lang.String>>> createViewAsStepRecord20Table6 = org.jooq.impl.DSL.values(createViewAsStepRow20Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row20Array2);
        org.junit.Assert.assertNotNull(createViewAsStepRow20Array3);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.RowN rowN4 = org.jooq.impl.DSL.row((java.lang.Object[]) strArray2);
        org.jooq.WithAsStep withAsStep5 = org.jooq.impl.DSL.withRecursive("hi!", strArray2);
        org.jooq.WithAsStep withAsStep6 = org.jooq.impl.DSL.with("", strArray2);
        try {
            org.jooq.Table<org.jooq.Record> recordTable7 = org.jooq.impl.DSL.tableByName(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(rowN4);
        org.junit.Assert.assertNotNull(withAsStep5);
        org.junit.Assert.assertNotNull(withAsStep6);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep8 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((-1), (int) (short) 0);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.space(intField5);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.ltrim(strField6);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.replace((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField4, strField7);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction13 = org.jooq.impl.DSL.groupConcat(strField11, "");
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField17);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep20 = org.jooq.impl.DSL.lag(strField17, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.mid(strField17, 10, (-1));
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.left(strField17, (int) '4');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction27 = org.jooq.impl.DSL.listAgg(strField17, "");
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.md5(strField17);
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField32);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep35 = org.jooq.impl.DSL.lag(strField32, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.mid(strField32, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField40 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.space(intField40);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.ltrim(strField41);
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.rpad(strField42, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.concat("", strField45);
        org.jooq.Field<java.lang.String> strField48 = null;
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.lpad(strField48, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.concat("hi!", strField48);
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.left(strField52, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.right(strField52, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.escape(strField52, '4');
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_59 = org.jooq.impl.DSL.row(strField11, strField17, strField38, strField46, strField52);
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep61 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        org.jooq.Field<java.lang.Integer> intField63 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.space(intField63);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.ltrim(strField64);
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.rpad(strField65, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.concat("", strField68);
        org.jooq.Param<java.lang.String> strParam70 = org.jooq.impl.DSL.val((java.lang.Object) (byte) 1, strField68);
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.md5("");
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.substring(strField73, 1);
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.nullif("", strField73);
        org.jooq.Field<java.lang.String> strField79 = org.jooq.impl.DSL.lpad(strField76, (int) (byte) 1, '#');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_80 = org.jooq.impl.DSL.row(strField4, strField38, strField68, strField79);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strAggregateFunction13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep20);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction27);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep35);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strRow5_59);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep61);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strParam70);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strField79);
        org.junit.Assert.assertNotNull(strRow4_80);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lower(strField4);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (byte) -1, '#');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.nvl("", strField9);
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.length(strField9);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.connectByRoot(strField9);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.escape(strField15, '4');
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.jooq.Row3<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateIndexStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>> intRecord1QuantifiedSelectRow3_0 = null;
        org.jooq.Row3[] row3Array2 = new org.jooq.Row3[1];
        @SuppressWarnings("unchecked") org.jooq.Row3<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateIndexStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>[] record1QuantifiedSelectRow3Array3 = (org.jooq.Row3<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateIndexStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>[]) row3Array2;
        record1QuantifiedSelectRow3Array3[0] = intRecord1QuantifiedSelectRow3_0;
        try {
            org.jooq.Table<org.jooq.Record3<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateIndexStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>> record1QuantifiedSelectRecord3Table6 = org.jooq.impl.DSL.values(record1QuantifiedSelectRow3Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row3Array2);
        org.junit.Assert.assertNotNull(record1QuantifiedSelectRow3Array3);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.jooq.Row15[] row15Array1 = new org.jooq.Row15[0];
        @SuppressWarnings("unchecked") org.jooq.Row15<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.DSLContext, org.jooq.WindowSpecification, org.jooq.Row, org.jooq.SortField<?>[], org.jooq.DDLQuery, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>[] record1ResultQueryRow15Array2 = (org.jooq.Row15<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.DSLContext, org.jooq.WindowSpecification, org.jooq.Row, org.jooq.SortField<?>[], org.jooq.DDLQuery, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>[]) row15Array1;
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.DSLContext, org.jooq.WindowSpecification, org.jooq.Row, org.jooq.SortField<?>[], org.jooq.DDLQuery, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>> record1ResultQueryRecord15Table3 = org.jooq.impl.DSL.values((org.jooq.Row15<org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.DSLContext, org.jooq.WindowSpecification, org.jooq.Row, org.jooq.SortField<?>[], org.jooq.DDLQuery, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DDLQuery, org.jooq.Field<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>>[]) row15Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row15Array1);
        org.junit.Assert.assertNotNull(record1ResultQueryRow15Array2);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat(strArray4);
        org.jooq.CreateViewAsStep createViewAsStep6 = org.jooq.impl.DSL.createView("hi!", strArray4);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.concat("hi!", strField8);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.left(strField12, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.connectByRoot(strField12);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.coerce((java.lang.Object) strArray4, strField15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(createViewAsStep6);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.jooq.Row5<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String[]> intRecord1QuantifiedSelectRow5_0 = null;
        org.jooq.Row5[] row5Array2 = new org.jooq.Row5[1];
        @SuppressWarnings("unchecked") org.jooq.Row5<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String[]>[] record1QuantifiedSelectRow5Array3 = (org.jooq.Row5<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String[]>[]) row5Array2;
        record1QuantifiedSelectRow5Array3[0] = intRecord1QuantifiedSelectRow5_0;
        try {
            org.jooq.Table<org.jooq.Record5<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.String[]>> record1QuantifiedSelectRecord5Table6 = org.jooq.impl.DSL.values(record1QuantifiedSelectRow5Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row5Array2);
        org.junit.Assert.assertNotNull(record1QuantifiedSelectRow5Array3);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect1 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        try {
            org.jooq.Param<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectOptionStepParam2 = org.jooq.impl.DSL.inline((org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect1);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.jooq.Field<java.lang.String> strField0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray2);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.least("", strArray2);
        org.jooq.Field<java.lang.Integer> intField6 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.space(intField6);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.ltrim(strField7);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction9 = org.jooq.impl.DSL.minDistinct(strField7);
        org.jooq.Field<java.lang.Integer> intField10 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.space(intField10);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.ltrim(strField11);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction13 = org.jooq.impl.DSL.minDistinct(strField11);
        org.jooq.Field<java.lang.String> strField14 = null;
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.lpad(strField14, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = null;
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.lpad(strField20, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField24 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField24, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_39 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField14, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField23, strField24, "", (org.jooq.GroupField) strField29, strField36, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction13, strField36);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction13, "");
        org.jooq.Field<?> wildcardField43 = null;
        org.jooq.Field[] fieldArray45 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray46 = (org.jooq.Field<?>[]) fieldArray45;
        wildcardFieldArray46[0] = wildcardField43;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction49 = org.jooq.impl.DSL.denseRank(wildcardFieldArray46);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction50 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray46);
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.least(strField42, wildcardFieldArray46);
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction55 = org.jooq.impl.DSL.groupConcat(strField53, "");
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.rpad(strField53, 100, "");
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.decode(strField42, strField58, strField59);
        org.jooq.Field<java.lang.String> strField62 = null;
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.lpad(strField62, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.concat("hi!", strField62);
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.left(strField66, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.right(strField66, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.left(strField70, (int) 'a');
        org.jooq.Field<java.lang.Integer> intField73 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.space(intField73);
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.ltrim(strField74);
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.lpad(strField74, 10, ' ');
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.left("hi!", (int) '4');
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep82 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField74, (org.jooq.SelectField<java.lang.String>) strField81);
        org.jooq.SelectSelectStep<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4SelectSelectStep83 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strAggregateFunction9, (org.jooq.SelectField<java.lang.String>) strField42, (org.jooq.SelectField<java.lang.String>) strField70, (org.jooq.SelectField<java.lang.String>) strField74);
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.decode(strField0, strField5, strField74);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(wildcardTable4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strAggregateFunction9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strAggregateFunction13);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(fieldArray45);
        org.junit.Assert.assertNotNull(wildcardFieldArray46);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction49);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction50);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strAggregateFunction55);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strField81);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep82);
        org.junit.Assert.assertNotNull(strRecord4SelectSelectStep83);
        org.junit.Assert.assertNotNull(strField84);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jooq.Name name1 = org.jooq.impl.DSL.name(strArray0);
        org.jooq.Table<?> wildcardTable2 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray0);
        try {
            org.jooq.Param<org.jooq.Table<?>> wildcardTableParam3 = org.jooq.impl.DSL.inline(wildcardTable2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.ArrayTable is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(wildcardTable2);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Schema schema4 = org.jooq.impl.DSL.schemaByName("hi!");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) 1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.ltrim(strField7);
        java.lang.Class<?> wildcardClass12 = strField11.getClass();
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression13 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray15 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray16 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray15;
        wildcardCommonTableExpressionArray16[0] = wildcardCommonTableExpression13;
        org.jooq.WithStep withStep19 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray16);
        org.jooq.WithStep withStep20 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray16);
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField24);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep27 = org.jooq.impl.DSL.lag(strField24, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.mid(strField24, 10, (-1));
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.left(strField24, (int) '4');
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep34 = org.jooq.impl.DSL.createTable("");
        org.jooq.Field[] fieldArray37 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray38 = (org.jooq.Field<?>[]) fieldArray37;
        org.jooq.GroupField groupField39 = org.jooq.impl.DSL.rollup(wildcardFieldArray38);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep40 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray38);
        org.jooq.Condition condition41 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray38);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep42 = org.jooq.impl.DSL.orderBy(wildcardFieldArray38);
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression45 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray47 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray48 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray47;
        wildcardCommonTableExpressionArray48[0] = wildcardCommonTableExpression45;
        org.jooq.WithStep withStep51 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray48);
        org.jooq.Condition condition52 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray48);
        org.jooq.SQL sQL53 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray48);
        org.jooq.WithStep withStep54 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray48);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.rtrim("");
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.cast((java.lang.Object) withStep54, strField56);
        try {
            org.jooq.Row8<java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.Schema, java.lang.reflect.Type, org.jooq.WithStep, java.lang.Object, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep> intRecord1IterableRow8_58 = org.jooq.impl.DSL.row((java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, schema4, (java.lang.reflect.Type) wildcardClass12, withStep20, (java.lang.Object) strField24, recordCreateTableAsStep34, windowSpecificationOrderByStep42, withStep54);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(commonTableExpressionArray15);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray16);
        org.junit.Assert.assertNotNull(withStep19);
        org.junit.Assert.assertNotNull(withStep20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep27);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(recordCreateTableAsStep34);
        org.junit.Assert.assertNotNull(fieldArray37);
        org.junit.Assert.assertNotNull(wildcardFieldArray38);
        org.junit.Assert.assertNotNull(groupField39);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep40);
        org.junit.Assert.assertNotNull(condition41);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep42);
        org.junit.Assert.assertNotNull(commonTableExpressionArray47);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray48);
        org.junit.Assert.assertNotNull(withStep51);
        org.junit.Assert.assertNotNull(condition52);
        org.junit.Assert.assertNotNull(sQL53);
        org.junit.Assert.assertNotNull(withStep54);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField57);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        org.jooq.DDLQuery dDLQuery1 = null;
        try {
            org.jooq.Row2<org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery> intRecord1SelectFinalStepRow2_2 = org.jooq.impl.DSL.row((org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, dDLQuery1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.trunc(date1);
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Date> dateField5 = org.jooq.impl.DSL.dateAdd(dateField2, (java.lang.Number) (byte) 1, datePart4);
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.dateDiff(date0, dateField2);
        java.sql.Date date7 = null;
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Date> dateField10 = org.jooq.impl.DSL.dateAdd(date7, (java.lang.Number) (byte) 100, datePart9);
        java.sql.Date date11 = null;
        org.jooq.Field<java.sql.Date> dateField13 = org.jooq.impl.DSL.dateSub(date11, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.dateDiff(dateField10, dateField13);
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.dateDiff(dateField2, dateField13);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.space(intField15);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(dateField5);
        org.junit.Assert.assertNotNull(intField6);
        org.junit.Assert.assertNotNull(dateField10);
        org.junit.Assert.assertNotNull(dateField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(intField15);
        org.junit.Assert.assertNotNull(strField16);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cosh((java.lang.Number) 1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) 'a');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep4 = org.jooq.impl.DSL.lag(strField2, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat("hi!", strField6);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (byte) 10, '4');
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep14 = org.jooq.impl.DSL.choose(strField10);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep17 = org.jooq.impl.DSL.lag(strField10, (int) (short) 1, "");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep18 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField2, (org.jooq.SelectField<java.lang.String>) strField10);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep4);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strCaseValueStep14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep17);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep18);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat(strArray7);
        org.jooq.CreateViewAsStep createViewAsStep9 = org.jooq.impl.DSL.createView("hi!", strArray7);
        org.jooq.WithAsStep withAsStep10 = org.jooq.impl.DSL.withRecursive("", strArray7);
        org.jooq.WithAsStep withAsStep11 = org.jooq.impl.DSL.withRecursive("hi!", strArray7);
        org.jooq.Table<org.jooq.Record> recordTable12 = org.jooq.impl.DSL.tableByName(strArray7);
        org.jooq.CreateViewAsStep createViewAsStep13 = org.jooq.impl.DSL.createView("", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(createViewAsStep9);
        org.junit.Assert.assertNotNull(withAsStep10);
        org.junit.Assert.assertNotNull(withAsStep11);
        org.junit.Assert.assertNotNull(recordTable12);
        org.junit.Assert.assertNotNull(createViewAsStep13);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.coalesce(strField5, "");
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strField8);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.jooq.Row10[] row10Array1 = new org.jooq.Row10[0];
        @SuppressWarnings("unchecked") org.jooq.Row10<org.jooq.Row, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Field<?>[], org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.Condition, org.jooq.Row2<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Case>[] rowRow10Array2 = (org.jooq.Row10<org.jooq.Row, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Field<?>[], org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.Condition, org.jooq.Row2<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Case>[]) row10Array1;
        try {
            org.jooq.Table<org.jooq.Record10<org.jooq.Row, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Field<?>[], org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.Condition, org.jooq.Row2<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Case>> rowRecord10Table3 = org.jooq.impl.DSL.values((org.jooq.Row10<org.jooq.Row, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.Field<?>[], org.jooq.WindowSpecificationOrderByStep, org.jooq.WithStep, org.jooq.Condition, org.jooq.Row2<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Case>[]) row10Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row10Array1);
        org.junit.Assert.assertNotNull(rowRow10Array2);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.jooq.DropTableStep dropTableStep1 = org.jooq.impl.DSL.dropTableIfExists("");
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.RowN rowN6 = org.jooq.impl.DSL.row(wildcardFieldArray4);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep7 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition8 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep7);
        org.jooq.Condition condition9 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep7);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect10 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep7);
        org.jooq.Condition condition11 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep7);
        org.jooq.Condition condition12 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep7);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence14 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep15 = org.jooq.impl.DSL.createSequence(bigIntegerSequence14);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep16 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep17 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep18 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep19 = org.jooq.impl.DSL.dropSequenceIfExists(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep20 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression22 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray24 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray25 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray24;
        wildcardCommonTableExpressionArray25[0] = wildcardCommonTableExpression22;
        org.jooq.WithStep withStep28 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray25);
        org.jooq.Condition condition29 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray25);
        org.jooq.WithStep withStep30 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray25);
        try {
            org.jooq.Row5<org.jooq.DropTableStep, org.jooq.RowN, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, java.lang.Object[]> dropTableStepRow5_31 = org.jooq.impl.DSL.row(dropTableStep1, rowN6, (org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep7, bigIntegerSequence14, (java.lang.Object[]) wildcardCommonTableExpressionArray25);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.DropTableImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dropTableStep1);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(groupField5);
        org.junit.Assert.assertNotNull(rowN6);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep7);
        org.junit.Assert.assertNotNull(condition8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect10);
        org.junit.Assert.assertNotNull(condition11);
        org.junit.Assert.assertNotNull(condition12);
        org.junit.Assert.assertNotNull(bigIntegerSequence14);
        org.junit.Assert.assertNotNull(createSequenceFinalStep15);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep16);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep17);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep18);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep19);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep20);
        org.junit.Assert.assertNotNull(commonTableExpressionArray24);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray25);
        org.junit.Assert.assertNotNull(withStep28);
        org.junit.Assert.assertNotNull(condition29);
        org.junit.Assert.assertNotNull(withStep30);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.lag(strField7, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.mid(strField7, 10, (-1));
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.left(strField7, (int) '4');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(strField7, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5(strField7);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField22);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep25 = org.jooq.impl.DSL.lag(strField22, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.mid(strField22, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField30 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.space(intField30);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.ltrim(strField31);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.rpad(strField32, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.concat("", strField35);
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.concat("hi!", strField38);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.left(strField42, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.right(strField42, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.escape(strField42, '4');
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_49 = org.jooq.impl.DSL.row(strField1, strField7, strField28, strField36, strField42);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.substring(strField7, (int) 'a', (int) (short) 0);
        org.jooq.Field<java.lang.Integer> intField54 = org.jooq.impl.DSL.position(strField52, "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep25);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strRow5_49);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(intField54);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction6 = org.jooq.impl.DSL.minDistinct(strField4);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction6);
        org.jooq.CaseConditionStep<org.jooq.WindowOverStep<java.lang.String>> strWindowOverStepCaseConditionStep8 = org.jooq.impl.DSL.when(condition2, (org.jooq.WindowOverStep<java.lang.String>) strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strAggregateFunction6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strWindowOverStepCaseConditionStep8);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.not(condition6);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction8 = org.jooq.impl.DSL.every(condition6);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(condition7);
        org.junit.Assert.assertNotNull(booleanAggregateFunction8);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) (short) 0);
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Date> dateField5 = org.jooq.impl.DSL.dateSub(dateField2, (java.lang.Number) 10, datePart4);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(dateField5);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) 1, 'a');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.replace(strField8, "");
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.charLength(strField13);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag(strField4, (int) '4', strField13);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.not(condition2);
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(condition3);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction11 = org.jooq.impl.DSL.percentRank(wildcardFieldArray6);
        org.jooq.Condition condition12 = org.jooq.impl.DSL.condition("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction13 = org.jooq.impl.DSL.percentRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField14 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.Query query15 = org.jooq.impl.DSL.query("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction11);
        org.junit.Assert.assertNotNull(condition12);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(objField14);
        org.junit.Assert.assertNotNull(query15);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad((org.jooq.Field<java.lang.String>) strAggregateFunction3, (int) (short) 1);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField5);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.space(intField92);
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField93);
        org.jooq.Field<java.lang.Integer> intField95 = org.jooq.impl.DSL.length(strField94);
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
        org.junit.Assert.assertNotNull(strField93);
        org.junit.Assert.assertNotNull(strField94);
        org.junit.Assert.assertNotNull(intField95);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.rad((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space((int) (short) 1);
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.escape((org.jooq.Field<java.lang.String>) strAggregateFunction3, 'a');
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.length(strField5);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(intField6);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect1 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect1);
        org.junit.Assert.assertNotNull(condition2);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.nvl(strField1, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep5 = org.jooq.impl.DSL.lag(strField3, 0);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.firstValue(strField3);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep5);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cot((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        java.sql.Timestamp timestamp15 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField16 = org.jooq.impl.DSL.timestampDiff(timestampField10, timestamp15);
        org.junit.Assert.assertNotNull(timestampField3);
        org.junit.Assert.assertNotNull(timestampField6);
        org.junit.Assert.assertNotNull(timestampField10);
        org.junit.Assert.assertNotNull(timestampField13);
        org.junit.Assert.assertNotNull(dayToSecondField14);
        org.junit.Assert.assertNotNull(dayToSecondField16);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.jooq.Row12<java.lang.Object[], org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.WithStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>> objArrayRow12_0 = null;
        org.jooq.Row12[] row12Array2 = new org.jooq.Row12[1];
        @SuppressWarnings("unchecked") org.jooq.Row12<java.lang.Object[], org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.WithStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>>[] objArrayRow12Array3 = (org.jooq.Row12<java.lang.Object[], org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.WithStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>>[]) row12Array2;
        objArrayRow12Array3[0] = objArrayRow12_0;
        try {
            org.jooq.Table<org.jooq.Record12<java.lang.Object[], org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.WithStep, org.jooq.Sequence<java.math.BigInteger>, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>>> objArrayRecord12Table6 = org.jooq.impl.DSL.values(objArrayRow12Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row12Array2);
        org.junit.Assert.assertNotNull(objArrayRow12Array3);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.jooq.CreateIndexStep createIndexStep1 = org.jooq.impl.DSL.createIndex("");
        try {
            org.jooq.CaseValueStep<org.jooq.CreateIndexStep> createIndexStepCaseValueStep2 = org.jooq.impl.DSL.choose(createIndexStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateIndexImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(createIndexStep1);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField1, 100, "");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.reverse(strField6);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.replace(strField0, "", "");
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_25);
        org.junit.Assert.assertNotNull(strField28);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField3, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("", strField6);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep8 = org.jooq.impl.DSL.firstValue(strField6);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep8);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline('#');
        try {
            org.jooq.Param<org.jooq.Param<java.lang.String>> strParamParam2 = org.jooq.impl.DSL.inline(strParam1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.Val is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strParam1);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep4 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray2);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep5 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray2);
        org.jooq.GroupField groupField6 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep4);
        org.junit.Assert.assertNotNull(recordSelectSelectStep5);
        org.junit.Assert.assertNotNull(groupField6);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.jooq.Row17[] row17Array1 = new org.jooq.Row17[0];
        @SuppressWarnings("unchecked") org.jooq.Row17<org.jooq.Row1<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsStep, java.lang.Comparable<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.Query, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.CreateIndexStep>[] strRow1Row17Array2 = (org.jooq.Row17<org.jooq.Row1<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsStep, java.lang.Comparable<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.Query, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.CreateIndexStep>[]) row17Array1;
        try {
            org.jooq.Table<org.jooq.Record17<org.jooq.Row1<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsStep, java.lang.Comparable<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.Query, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.CreateIndexStep>> strRow1Record17Table3 = org.jooq.impl.DSL.values((org.jooq.Row17<org.jooq.Row1<java.lang.String>, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.WindowSpecificationRowsStep, java.lang.Comparable<java.lang.String>, org.jooq.DropIndexFinalStep, java.lang.Object, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.Type, org.jooq.Query, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[], org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.CreateIndexStep>[]) row17Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row17Array1);
        org.junit.Assert.assertNotNull(strRow1Row17Array2);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.bitLength(strField10);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.connectByRoot(strField10);
        org.jooq.Field[] fieldArray18 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray19 = (org.jooq.Field<?>[]) fieldArray18;
        org.jooq.GroupField groupField20 = org.jooq.impl.DSL.rollup(wildcardFieldArray19);
        org.jooq.RowN rowN21 = org.jooq.impl.DSL.row(wildcardFieldArray19);
        org.jooq.Field<java.lang.Object> objField22 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray19);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction23 = org.jooq.impl.DSL.percentRank(wildcardFieldArray19);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep24 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray19);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.least(strField10, wildcardFieldArray19);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep26 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField25);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(fieldArray18);
        org.junit.Assert.assertNotNull(wildcardFieldArray19);
        org.junit.Assert.assertNotNull(groupField20);
        org.junit.Assert.assertNotNull(rowN21);
        org.junit.Assert.assertNotNull(objField22);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction23);
        org.junit.Assert.assertNotNull(recordSelectSelectStep24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep26);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.lag(strField7, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.mid(strField7, 10, (-1));
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.left(strField7, (int) '4');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(strField7, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5(strField7);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField22);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep25 = org.jooq.impl.DSL.lag(strField22, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.mid(strField22, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField30 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.space(intField30);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.ltrim(strField31);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.rpad(strField32, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.concat("", strField35);
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.concat("hi!", strField38);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.left(strField42, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.right(strField42, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.escape(strField42, '4');
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_49 = org.jooq.impl.DSL.row(strField1, strField7, strField28, strField36, strField42);
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction51 = org.jooq.impl.DSL.listAgg(strField42, "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep25);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strRow5_49);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction51);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.rpad(strField2, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.trim(strField5);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.jooq.Field<?> wildcardField1 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        wildcardFieldArray4[0] = wildcardField1;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.denseRank(wildcardFieldArray4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat(wildcardFieldArray4);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.percentRank(wildcardFieldArray4);
        org.jooq.Condition condition10 = org.jooq.impl.DSL.condition("", (java.lang.Object[]) wildcardFieldArray4);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction11 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(condition10);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction11);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.jooq.Row20[] row20Array1 = new org.jooq.Row20[0];
        @SuppressWarnings("unchecked") org.jooq.Row20<org.jooq.CreateViewAsStep, org.jooq.DDLQuery, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableFinalStep, java.lang.String, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, java.io.Serializable, java.lang.Class<?>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Class<?>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[]>[] createViewAsStepRow20Array2 = (org.jooq.Row20<org.jooq.CreateViewAsStep, org.jooq.DDLQuery, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableFinalStep, java.lang.String, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, java.io.Serializable, java.lang.Class<?>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Class<?>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[]>[]) row20Array1;
        try {
            org.jooq.Table<org.jooq.Record20<org.jooq.CreateViewAsStep, org.jooq.DDLQuery, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Class<?>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.DropTableFinalStep, java.lang.String, org.jooq.WindowSpecificationOrderByStep, org.jooq.DropSequenceFinalStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.lang.String>, java.io.Serializable, java.lang.Class<?>, org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Class<?>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField[]>> createViewAsStepRecord20Table3 = org.jooq.impl.DSL.values(createViewAsStepRow20Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row20Array1);
        org.junit.Assert.assertNotNull(createViewAsStepRow20Array2);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (short) 10);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.jooq.Row18[] row18Array1 = new org.jooq.Row18[0];
        @SuppressWarnings("unchecked") org.jooq.Row18<java.lang.String[], org.jooq.DSLContext, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectField[], org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableStep, org.jooq.DropTableFinalStep, org.jooq.WithAsStep, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.Scope, org.jooq.Query, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.DropTableFinalStep, org.jooq.WindowSpecificationRowsStep>[] strArrayRow18Array2 = (org.jooq.Row18<java.lang.String[], org.jooq.DSLContext, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectField[], org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableStep, org.jooq.DropTableFinalStep, org.jooq.WithAsStep, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.Scope, org.jooq.Query, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.DropTableFinalStep, org.jooq.WindowSpecificationRowsStep>[]) row18Array1;
        try {
            org.jooq.Table<org.jooq.Record18<java.lang.String[], org.jooq.DSLContext, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.SelectField[], org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.DropTableStep, org.jooq.DropTableFinalStep, org.jooq.WithAsStep, org.jooq.SelectField[], org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.Scope, org.jooq.Query, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.DropTableFinalStep, org.jooq.WindowSpecificationRowsStep>> strArrayRecord18Table3 = org.jooq.impl.DSL.values(strArrayRow18Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row18Array1);
        org.junit.Assert.assertNotNull(strArrayRow18Array2);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.jooq.Row6[] row6Array1 = new org.jooq.Row6[0];
        @SuppressWarnings("unchecked") org.jooq.Row6<org.jooq.Query, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification, org.jooq.Scope>[] queryRow6Array2 = (org.jooq.Row6<org.jooq.Query, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification, org.jooq.Scope>[]) row6Array1;
        try {
            org.jooq.Table<org.jooq.Record6<org.jooq.Query, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification, org.jooq.Scope>> queryRecord6Table3 = org.jooq.impl.DSL.values((org.jooq.Row6<org.jooq.Query, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WindowSpecification, org.jooq.Scope>[]) row6Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row6Array1);
        org.junit.Assert.assertNotNull(queryRow6Array2);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.jooq.Row16<org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Row1<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.GroupField, java.lang.CharSequence, org.jooq.Condition[], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Param<java.lang.String>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Field<java.lang.String>> dropTableFinalStepRow16_0 = null;
        org.jooq.Row16[] row16Array2 = new org.jooq.Row16[1];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Row1<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.GroupField, java.lang.CharSequence, org.jooq.Condition[], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Param<java.lang.String>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Field<java.lang.String>>[] dropTableFinalStepRow16Array3 = (org.jooq.Row16<org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Row1<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.GroupField, java.lang.CharSequence, org.jooq.Condition[], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Param<java.lang.String>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Field<java.lang.String>>[]) row16Array2;
        dropTableFinalStepRow16Array3[0] = dropTableFinalStepRow16_0;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.DropTableFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.Row1<java.lang.String>, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.GroupField, java.lang.CharSequence, org.jooq.Condition[], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Param<java.lang.String>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.Field<java.lang.String>>> dropTableFinalStepRecord16Table6 = org.jooq.impl.DSL.values(dropTableFinalStepRow16Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row16Array2);
        org.junit.Assert.assertNotNull(dropTableFinalStepRow16Array3);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep4 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray2);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep5 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray2);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.orderBy(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep4);
        org.junit.Assert.assertNotNull(recordSelectSelectStep5);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep6);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep7 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(recordSelectSelectStep7);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenPreceding(1);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray2);
        org.jooq.WithAsStep withAsStep5 = org.jooq.impl.DSL.with("hi!", strArray2);
        org.jooq.CreateViewAsStep createViewAsStep6 = org.jooq.impl.DSL.createView("hi!", strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.jooq.Name name10 = org.jooq.impl.DSL.name(strArray9);
        org.jooq.Table<?> wildcardTable11 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray9);
        org.jooq.WithAsStep withAsStep12 = org.jooq.impl.DSL.with("hi!", strArray9);
        org.jooq.CreateViewAsStep createViewAsStep13 = org.jooq.impl.DSL.createView("hi!", strArray9);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.jooq.Name name17 = org.jooq.impl.DSL.name(strArray16);
        org.jooq.Table<?> wildcardTable18 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray16);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.least("", strArray16);
        org.jooq.CreateViewAsStep createViewAsStep20 = org.jooq.impl.DSL.createView("hi!", strArray16);
        org.jooq.CreateViewAsStep[] createViewAsStepArray21 = new org.jooq.CreateViewAsStep[] { createViewAsStep13, createViewAsStep20 };
        try {
            org.jooq.Field<org.jooq.CreateViewAsStep> createViewAsStepField22 = org.jooq.impl.DSL.least(createViewAsStep6, createViewAsStepArray21);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateViewImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(wildcardTable4);
        org.junit.Assert.assertNotNull(withAsStep5);
        org.junit.Assert.assertNotNull(createViewAsStep6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(wildcardTable11);
        org.junit.Assert.assertNotNull(withAsStep12);
        org.junit.Assert.assertNotNull(createViewAsStep13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(wildcardTable18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(createViewAsStep20);
        org.junit.Assert.assertNotNull(createViewAsStepArray21);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.length(strField5);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(intField8);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
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
        org.jooq.Field<java.lang.String> strField80 = org.jooq.impl.DSL.isnull("", strField75);
        org.jooq.Field<java.lang.Integer> intField81 = org.jooq.impl.DSL.octetLength(strField75);
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
        org.junit.Assert.assertNotNull(strField80);
        org.junit.Assert.assertNotNull(intField81);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect3 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition4 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition5 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        try {
            org.jooq.CaseValueStep<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectSelectStepCaseValueStep6 = org.jooq.impl.DSL.choose(intRecord1SelectSelectStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect3);
        org.junit.Assert.assertNotNull(condition4);
        org.junit.Assert.assertNotNull(condition5);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
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
        org.jooq.Field<java.lang.String> strField82 = null;
        org.jooq.Field<java.lang.String> strField85 = org.jooq.impl.DSL.lpad(strField82, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField86 = org.jooq.impl.DSL.concat("hi!", strField82);
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.nullif(strField82, "");
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.nullif(strField66, strField82);
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.nvl("hi!", strField66);
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.trim(strField90);
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.coalesce(strField90, "hi!");
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.concat("", strField90);
        org.jooq.Field<java.lang.String> strField96 = org.jooq.impl.DSL.isnull(strField94, "");
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
        org.junit.Assert.assertNotNull(strField85);
        org.junit.Assert.assertNotNull(strField86);
        org.junit.Assert.assertNotNull(strField88);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strField93);
        org.junit.Assert.assertNotNull(strField94);
        org.junit.Assert.assertNotNull(strField96);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.dateDiff(date1, dateField2);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries((int) (byte) -1, intField3);
        org.junit.Assert.assertNotNull(intField3);
        org.junit.Assert.assertNotNull(intRecord1Table4);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) '4');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.replace(strField2, "");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.repeat("", (int) '4');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep11 = org.jooq.impl.DSL.groupConcat(strField10);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.replace(strField2, strField7, (org.jooq.Field<java.lang.String>) groupConcatOrderByStep11);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.rtrim(strField12);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.prior(strField13);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.replace(strField13, "hi!", "");
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField17);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.lag(strField11, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.mid(strField11, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction21 = org.jooq.impl.DSL.minDistinct(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction22 = org.jooq.impl.DSL.maxDistinct(strField19);
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.concat("hi!", strField25);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.left(strField29, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.right(strField29, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField29);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.coalesce(strField29, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_40 = org.jooq.impl.DSL.row(strField5, strField11, strField19, strField36);
        java.sql.Date date41 = null;
        org.jooq.Field<java.sql.Date> dateField42 = null;
        org.jooq.Field<java.lang.Integer> intField43 = org.jooq.impl.DSL.dateDiff(date41, dateField42);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.space(intField43);
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lower(strField44);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep46 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField11, (org.jooq.SelectField<java.lang.String>) strField45);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strAggregateFunction21);
        org.junit.Assert.assertNotNull(strAggregateFunction22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strRow4_40);
        org.junit.Assert.assertNotNull(intField43);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep46);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep1 = org.jooq.impl.DSL.ntile((int) (short) 10);
        org.junit.Assert.assertNotNull(intWindowOverStep1);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
        org.jooq.Field<java.lang.Integer> intField19 = null;
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.space(intField19);
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.ltrim(strField20);
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.concat("hi!", strField23);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.left(strField27, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.right(strField27, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.defaultValue(strField27);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.replace(strField20, strField32);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.nvl("hi!", strField32);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep37 = org.jooq.impl.DSL.lag(strField34, (int) (byte) 10, "hi!");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep38 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField15, (org.jooq.SelectField<java.lang.String>) strField34);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.prior(strField15);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep37);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep38);
        org.junit.Assert.assertNotNull(strField39);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.position("", "hi!");
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep4 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep5 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep4);
        org.junit.Assert.assertNotNull(createSequenceFinalStep5);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.concat(strArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray9, strArray14, strArray19 };
        org.jooq.Field<java.lang.String[]> strArrayField21 = org.jooq.impl.DSL.greatest(strArray3, strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArrayField21);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        try {
            org.jooq.Row1<java.lang.reflect.GenericDeclaration> genericDeclarationRow1_7 = org.jooq.impl.DSL.row((java.lang.reflect.GenericDeclaration) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Class is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.jooq.Row19[] row19Array1 = new org.jooq.Row19[0];
        @SuppressWarnings("unchecked") org.jooq.Row19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.DropViewFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[][], org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, java.io.Serializable, org.jooq.GroupConcatSeparatorStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.DropSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[] record1SelectOrderByStepRow19Array2 = (org.jooq.Row19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.DropViewFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[][], org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, java.io.Serializable, org.jooq.GroupConcatSeparatorStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.DropSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[]) row19Array1;
        try {
            org.jooq.Table<org.jooq.Record19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.DropViewFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[][], org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, java.io.Serializable, org.jooq.GroupConcatSeparatorStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.DropSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>> record1SelectOrderByStepRecord19Table3 = org.jooq.impl.DSL.values((org.jooq.Row19<org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableFinalStep, org.jooq.DropViewFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[][], org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropTableStep, java.io.Serializable, org.jooq.GroupConcatSeparatorStep, org.jooq.CaseValueStep<java.lang.String>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.DropSequenceFinalStep, org.jooq.TableLike<?>, org.jooq.DropViewFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.WindowIgnoreNullsStep<java.lang.String>>[]) row19Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row19Array1);
        org.junit.Assert.assertNotNull(record1SelectOrderByStepRow19Array2);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.Field<java.lang.String> strField16 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.concat("hi!", strField16);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.left(strField20, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.right(strField20, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField20);
        org.jooq.Field<java.lang.String> strField26 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.lpad(strField26, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField29);
        org.jooq.Field<?> wildcardField32 = null;
        org.jooq.Field[] fieldArray34 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray35 = (org.jooq.Field<?>[]) fieldArray34;
        wildcardFieldArray35[0] = wildcardField32;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction38 = org.jooq.impl.DSL.denseRank(wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.concat(wildcardFieldArray35);
        org.jooq.Field<java.lang.Object> objField40 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.least(strField30, wildcardFieldArray35);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.replace(strField13, strField25, strField30);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.md5(strField42);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(fieldArray34);
        org.junit.Assert.assertNotNull(wildcardFieldArray35);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(objField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField43);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.left(strField8, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.right(strField8, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.defaultValue(strField8);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.replace(strField1, strField13);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.replace(strField13, "hi!");
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep19 = org.jooq.impl.DSL.lag(strField16, (int) (short) 100, strField18);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep19);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField5);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.min(strField5);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction12 = org.jooq.impl.DSL.count((org.jooq.Field<java.lang.String>) strAggregateFunction11);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(intAggregateFunction12);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (-1), "");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep14 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField13);
        org.jooq.Field<java.lang.Integer> intField15 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.space(intField15);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.ltrim(strField16);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction18 = org.jooq.impl.DSL.minDistinct(strField16);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep19 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction18);
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField24);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep27 = org.jooq.impl.DSL.lag(strField24, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.mid(strField24, 10, (-1));
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.md5(strField30);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep32 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) strAggregateFunction18, (int) (byte) 1, strField30);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.nvl((org.jooq.Field<java.lang.String>) strAggregateFunction18, "hi!");
        org.jooq.Field<java.lang.Integer> intField35 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.space(intField35);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.nvl(strField36, "hi!");
        org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> strRow3_39 = org.jooq.impl.DSL.row(strField13, strField34, strField38);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep14);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strAggregateFunction18);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep19);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep27);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep32);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strRow3_39);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray4);
        org.jooq.SQL sQL7 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.jooq.SQL sQL8 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(groupField5);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
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
        org.jooq.Field[] fieldArray21 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray22 = (org.jooq.Field<?>[]) fieldArray21;
        org.jooq.GroupField groupField23 = org.jooq.impl.DSL.rollup(wildcardFieldArray22);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep24 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray22);
        org.jooq.Condition condition25 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray22);
        org.jooq.Condition[] conditionArray26 = new org.jooq.Condition[] { condition25 };
        org.jooq.Condition condition27 = org.jooq.impl.DSL.and(conditionArray26);
        org.jooq.Condition condition28 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) conditionArray26);
        org.jooq.Condition condition29 = org.jooq.impl.DSL.and(conditionArray26);
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField33);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep37 = org.jooq.impl.DSL.lag(strField34, 100, "");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep40 = org.jooq.impl.DSL.lead(strField34, (int) (byte) 1, "hi!");
        try {
            org.jooq.Field<org.jooq.WindowIgnoreNullsStep<java.lang.String>> strWindowIgnoreNullsStepField41 = org.jooq.impl.DSL.decode(conditionArray15, conditionArray26, strWindowIgnoreNullsStep40);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Condition is not supported in dialect DEFAULT");
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
        org.junit.Assert.assertNotNull(fieldArray21);
        org.junit.Assert.assertNotNull(wildcardFieldArray22);
        org.junit.Assert.assertNotNull(groupField23);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep24);
        org.junit.Assert.assertNotNull(condition25);
        org.junit.Assert.assertNotNull(conditionArray26);
        org.junit.Assert.assertNotNull(condition27);
        org.junit.Assert.assertNotNull(condition28);
        org.junit.Assert.assertNotNull(condition29);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep37);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep40);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep4 = org.jooq.impl.DSL.groupConcatDistinct((org.jooq.Field<java.lang.String>) strAggregateFunction3);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad((org.jooq.Field<java.lang.String>) groupConcatOrderByStep4, 10, ' ');
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep4);
        org.junit.Assert.assertNotNull(strField7);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction0 = org.jooq.impl.DSL.count();
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space((org.jooq.Field<java.lang.Integer>) intAggregateFunction0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.connectByRoot(strField1);
        org.junit.Assert.assertNotNull(intAggregateFunction0);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.jooq.Row6<org.jooq.Field<?>[], org.jooq.Name, org.jooq.DropViewFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>> wildcardFieldArrayRow6_0 = null;
        org.jooq.Row6[] row6Array2 = new org.jooq.Row6[1];
        @SuppressWarnings("unchecked") org.jooq.Row6<org.jooq.Field<?>[], org.jooq.Name, org.jooq.DropViewFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>>[] wildcardFieldArrayRow6Array3 = (org.jooq.Row6<org.jooq.Field<?>[], org.jooq.Name, org.jooq.DropViewFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>>[]) row6Array2;
        wildcardFieldArrayRow6Array3[0] = wildcardFieldArrayRow6_0;
        try {
            org.jooq.Table<org.jooq.Record6<org.jooq.Field<?>[], org.jooq.Name, org.jooq.DropViewFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowBeforeOverStep<java.lang.String>>> wildcardFieldArrayRecord6Table6 = org.jooq.impl.DSL.values(wildcardFieldArrayRow6Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row6Array2);
        org.junit.Assert.assertNotNull(wildcardFieldArrayRow6Array3);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        java.lang.Number number1 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) 10.0f, number1);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) 10.0d, (java.lang.Number) 1);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep4 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep5 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep6 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep4);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep5);
        org.junit.Assert.assertNotNull(createSequenceFinalStep6);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) '4', 'a');
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField4);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.dateDiff(date0, dateField1);
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.bitLength("");
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.rownum();
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table6 = org.jooq.impl.DSL.generateSeries(intField4, intField5);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table7 = org.jooq.impl.DSL.generateSeries(intField2, intField5);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.space(intField2);
        org.junit.Assert.assertNotNull(intField2);
        org.junit.Assert.assertNotNull(intField4);
        org.junit.Assert.assertNotNull(intField5);
        org.junit.Assert.assertNotNull(intRecord1Table6);
        org.junit.Assert.assertNotNull(intRecord1Table7);
        org.junit.Assert.assertNotNull(strField8);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField1 = null;
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField4 = org.jooq.impl.DSL.timestampAdd(timestampField1, (java.lang.Number) 10, datePart3);
        org.jooq.DatePart datePart6 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField7 = org.jooq.impl.DSL.timestampAdd(timestampField4, (java.lang.Number) 10L, datePart6);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField8 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestampField7);
        java.sql.Timestamp timestamp9 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField10 = org.jooq.impl.DSL.timestampDiff(timestampField7, timestamp9);
        org.junit.Assert.assertNotNull(timestampField4);
        org.junit.Assert.assertNotNull(timestampField7);
        org.junit.Assert.assertNotNull(dayToSecondField8);
        org.junit.Assert.assertNotNull(dayToSecondField10);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep1 = org.jooq.impl.DSL.dropSequence("hi!");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence3 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep4 = org.jooq.impl.DSL.createSequence(bigIntegerSequence3);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep5 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence3);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep6 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence3);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep7 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence3);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep8 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence3);
        org.jooq.DropSequenceFinalStep[] dropSequenceFinalStepArray9 = new org.jooq.DropSequenceFinalStep[] { dropSequenceFinalStep1, dropSequenceFinalStep8 };
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.DropSequenceFinalStep>> dropSequenceFinalStepRecord1QuantifiedSelect10 = org.jooq.impl.DSL.any(dropSequenceFinalStepArray9);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.DropSequenceFinalStep is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(dropSequenceFinalStep1);
        org.junit.Assert.assertNotNull(bigIntegerSequence3);
        org.junit.Assert.assertNotNull(createSequenceFinalStep4);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep5);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep6);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep7);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep8);
        org.junit.Assert.assertNotNull(dropSequenceFinalStepArray9);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.left(strField8, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.right(strField8, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.defaultValue(strField8);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.replace(strField1, strField13);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.replace(strField13, "hi!");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.replace(strField16, "");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.rpad(strField5, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("", strField8);
        org.jooq.Param<java.lang.String> strParam10 = org.jooq.impl.DSL.val((java.lang.Object) (byte) 1, strField8);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.prior(strField8);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField8, 100);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strParam10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (byte) 100, datePart2);
        java.sql.Date date4 = null;
        org.jooq.Field<java.sql.Date> dateField6 = org.jooq.impl.DSL.dateSub(date4, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.dateDiff(dateField3, dateField6);
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.position("", "");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table11 = org.jooq.impl.DSL.generateSeries(intField7, intField10);
        org.junit.Assert.assertNotNull(dateField3);
        org.junit.Assert.assertNotNull(dateField6);
        org.junit.Assert.assertNotNull(intField7);
        org.junit.Assert.assertNotNull(intField10);
        org.junit.Assert.assertNotNull(intRecord1Table11);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.trunc(timestamp1);
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField5 = org.jooq.impl.DSL.timestampAdd(timestampField2, (java.lang.Number) 10L, datePart4);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField6 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestampField2);
        org.junit.Assert.assertNotNull(timestampField2);
        org.junit.Assert.assertNotNull(timestampField5);
        org.junit.Assert.assertNotNull(dayToSecondField6);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.charLength("hi!");
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep34 = org.jooq.impl.DSL.lead(strField32, (int) 'a');
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
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep34);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.space(intField92);
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField93);
        org.jooq.Field<java.lang.String> strField95 = org.jooq.impl.DSL.md5(strField93);
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
        org.junit.Assert.assertNotNull(strField93);
        org.junit.Assert.assertNotNull(strField94);
        org.junit.Assert.assertNotNull(strField95);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.deg((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence2 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep3 = org.jooq.impl.DSL.createSequence(bigIntegerSequence2);
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.space(intField4);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.ltrim(strField5);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField5, 10, ' ');
        org.jooq.Param<java.lang.String> strParam10 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep3, strField9);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.concat("hi!", (org.jooq.Field<java.lang.String>) strParam10);
        org.jooq.Field<java.lang.Integer> intField12 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.space(intField12);
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.concat("hi!", strField15);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.space(intField20);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.ltrim(strField21);
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
        org.jooq.Field<java.lang.Integer> intField49 = null;
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.space(intField49);
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.ltrim(strField50);
        org.jooq.Field<java.lang.String> strField53 = null;
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.lpad(strField53, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.concat("hi!", strField53);
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.lpad(strField57, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField62 = null;
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.lpad(strField62, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.concat("hi!", strField62);
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.lpad(strField66, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField70 = null;
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.lpad(strField70, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField74 = null;
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.space(intField74);
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.ltrim(strField75);
        org.jooq.Field<java.lang.Integer> intField77 = null;
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.space(intField77);
        org.jooq.Field<java.lang.String> strField79 = null;
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.lpad(strField79, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField83 = null;
        org.jooq.Field<java.lang.String> strField86 = org.jooq.impl.DSL.lpad(strField83, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField87 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField86);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep89 = org.jooq.impl.DSL.lag(strField86, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_90 = org.jooq.impl.DSL.row(strField13, strField15, strField21, strField23, strField50, strField60, strField66, strField73, strField76, strField78, strField82, strField86);
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.rtrim(strField13);
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.prior(strField13);
        org.jooq.Field<java.lang.Integer> intField93 = org.jooq.impl.DSL.position((org.jooq.Field<java.lang.String>) strParam10, strField92);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction94 = org.jooq.impl.DSL.min((org.jooq.Field<java.lang.String>) strParam10);
        org.junit.Assert.assertNotNull(bigIntegerSequence2);
        org.junit.Assert.assertNotNull(createSequenceFinalStep3);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strParam10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_48);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField86);
        org.junit.Assert.assertNotNull(strField87);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep89);
        org.junit.Assert.assertNotNull(strRow12_90);
        org.junit.Assert.assertNotNull(strField91);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(intField93);
        org.junit.Assert.assertNotNull(strAggregateFunction94);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.replace(strField5, "");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep11 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField10);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep11);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.lang.Object obj0 = null;
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField6, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.md5(strField10);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.cast(obj0, strField10);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.jooq.ConnectionProvider connectionProvider0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connectionProvider0, sQLDialect1, settings2);
        org.jooq.Field<java.lang.String> strField5 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("hi!", strField5);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField9, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.right(strField9, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction15 = org.jooq.impl.DSL.min(strField9);
        org.jooq.Param<java.lang.String> strParam16 = org.jooq.impl.DSL.inline((java.lang.Object) settings2, (org.jooq.Field<java.lang.String>) strAggregateFunction15);
        org.jooq.Field[] fieldArray19 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray20 = (org.jooq.Field<?>[]) fieldArray19;
        org.jooq.GroupField groupField21 = org.jooq.impl.DSL.rollup(wildcardFieldArray20);
        org.jooq.RowN rowN22 = org.jooq.impl.DSL.row(wildcardFieldArray20);
        org.jooq.Field<java.lang.Object> objField23 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray20);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction24 = org.jooq.impl.DSL.percentRank(wildcardFieldArray20);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep25 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray20);
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.greatest((org.jooq.Field<java.lang.String>) strParam16, wildcardFieldArray20);
        org.junit.Assert.assertNotNull(dSLContext3);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strAggregateFunction15);
        org.junit.Assert.assertNotNull(strParam16);
        org.junit.Assert.assertNotNull(fieldArray19);
        org.junit.Assert.assertNotNull(wildcardFieldArray20);
        org.junit.Assert.assertNotNull(groupField21);
        org.junit.Assert.assertNotNull(rowN22);
        org.junit.Assert.assertNotNull(objField23);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction24);
        org.junit.Assert.assertNotNull(recordSelectSelectStep25);
        org.junit.Assert.assertNotNull(strField26);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sqrt((java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        org.jooq.GroupField groupField7 = org.jooq.impl.DSL.rollup(wildcardFieldArray6);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep8 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray6);
        org.jooq.Condition condition9 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.Condition[] conditionArray10 = new org.jooq.Condition[] { condition9 };
        org.jooq.Condition condition11 = org.jooq.impl.DSL.and(conditionArray10);
        org.jooq.Condition condition12 = org.jooq.impl.DSL.and(conditionArray10);
        try {
            org.jooq.Field<org.jooq.QueryPart> queryPartField13 = org.jooq.impl.DSL.nullif((org.jooq.QueryPart) booleanField1, (org.jooq.QueryPart) condition12);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CombinedCondition is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        org.junit.Assert.assertNotNull(groupField7);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(conditionArray10);
        org.junit.Assert.assertNotNull(condition11);
        org.junit.Assert.assertNotNull(condition12);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression2 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray4 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray5 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray4;
        wildcardCommonTableExpressionArray5[0] = wildcardCommonTableExpression2;
        org.jooq.WithStep withStep8 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray5);
        org.jooq.Query query9 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardCommonTableExpressionArray5);
        org.jooq.Query query10 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(commonTableExpressionArray4);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(withStep8);
        org.junit.Assert.assertNotNull(query9);
        org.junit.Assert.assertNotNull(query10);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField3, (int) '4');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction15 = org.jooq.impl.DSL.groupConcat(strField13, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.rpad(strField13, 100, "");
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction23 = org.jooq.impl.DSL.groupConcat(strField21, "");
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.nvl2(strField13, "", (org.jooq.Field<java.lang.String>) strAggregateFunction23);
        org.jooq.Field<java.lang.Integer> intField26 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.space(intField26);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.ltrim(strField27);
        org.jooq.Field<java.lang.String> strField30 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lpad(strField30, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.concat("hi!", strField30);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.left(strField34, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.right(strField34, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.defaultValue(strField34);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.replace(strField27, strField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.nvl("hi!", strField39);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep42 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField11, (org.jooq.SelectField<java.lang.String>) strAggregateFunction23, (org.jooq.SelectField<java.lang.String>) strField41);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strAggregateFunction15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strAggregateFunction23);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strRecord3SelectSelectStep42);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.not(condition6);
        org.jooq.Field<java.lang.Boolean> booleanField8 = org.jooq.impl.DSL.field(condition6);
        org.jooq.Condition condition9 = org.jooq.impl.DSL.not(condition6);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(condition7);
        org.junit.Assert.assertNotNull(booleanField8);
        org.junit.Assert.assertNotNull(condition9);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (short) -1);
        java.sql.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.dateDiff(dateField2, date3);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(intField4);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep94 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79, (-1));
        org.jooq.Field<java.lang.String> strField96 = org.jooq.impl.DSL.rtrim("hi!");
        org.jooq.Field<java.lang.String> strField97 = org.jooq.impl.DSL.cast((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79, strField96);
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
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep94);
        org.junit.Assert.assertNotNull(strField96);
        org.junit.Assert.assertNotNull(strField97);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.lag(strField11, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.mid(strField11, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction21 = org.jooq.impl.DSL.minDistinct(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction22 = org.jooq.impl.DSL.maxDistinct(strField19);
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.concat("hi!", strField25);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.left(strField29, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.right(strField29, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField29);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.coalesce(strField29, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_40 = org.jooq.impl.DSL.row(strField5, strField11, strField19, strField36);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.repeat(strField5, (int) (short) 1);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strAggregateFunction21);
        org.junit.Assert.assertNotNull(strAggregateFunction22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strRow4_40);
        org.junit.Assert.assertNotNull(strField42);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(booleanField1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray7);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep9 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray7);
        org.jooq.Condition condition10 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray7);
        org.jooq.Condition[] conditionArray11 = new org.jooq.Condition[] { condition10 };
        org.jooq.Condition condition12 = org.jooq.impl.DSL.and(conditionArray11);
        try {
            org.jooq.Field<org.jooq.Condition> conditionField13 = org.jooq.impl.DSL.coalesce(condition3, conditionArray11);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.FieldCondition is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(booleanField1);
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(condition3);
        org.junit.Assert.assertNotNull(fieldArray6);
        org.junit.Assert.assertNotNull(wildcardFieldArray7);
        org.junit.Assert.assertNotNull(groupField8);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep9);
        org.junit.Assert.assertNotNull(condition10);
        org.junit.Assert.assertNotNull(conditionArray11);
        org.junit.Assert.assertNotNull(condition12);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep61 = org.jooq.impl.DSL.lag(strField55, (int) (byte) -1, "");
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
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep61);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression2 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray4 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray5 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray4;
        wildcardCommonTableExpressionArray5[0] = wildcardCommonTableExpression2;
        org.jooq.WithStep withStep8 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray5);
        org.jooq.Query query9 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardCommonTableExpressionArray5);
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery10 = org.jooq.impl.DSL.resultQuery("", (java.lang.Object[]) wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(commonTableExpressionArray4);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(withStep8);
        org.junit.Assert.assertNotNull(query9);
        org.junit.Assert.assertNotNull(recordResultQuery10);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.jooq.Row2<org.jooq.SelectField[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>> selectFieldArrayRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<org.jooq.SelectField[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>[] selectFieldArrayRow2Array3 = (org.jooq.Row2<org.jooq.SelectField[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>[]) row2Array2;
        selectFieldArrayRow2Array3[0] = selectFieldArrayRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.SelectField[], org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>> selectFieldArrayRecord2Table6 = org.jooq.impl.DSL.values(selectFieldArrayRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(selectFieldArrayRow2Array3);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
        org.jooq.Field<java.lang.String> strField94 = org.jooq.impl.DSL.lpad(strField89, (int) (short) 100, ' ');
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
        org.junit.Assert.assertNotNull(strField94);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField4, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.mid(strField4, 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.md5(strField10);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (-1), "");
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.bitLength(strField11);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.trim(strField11);
        org.jooq.Field<?>[] wildcardFieldArray17 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.least(strField16, wildcardFieldArray17);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.space(intField20);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.ltrim(strField21);
        org.jooq.Field<java.lang.String> strField24 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField24, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.concat("hi!", strField24);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.left(strField28, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.right(strField28, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.defaultValue(strField28);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.replace(strField21, strField33);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.nvl("hi!", strField33);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep38 = org.jooq.impl.DSL.lag(strField35, (int) (byte) 10, "hi!");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep39 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField16, (org.jooq.SelectField<java.lang.String>) strField35);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.concat("", strField35);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(intField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep38);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep39);
        org.junit.Assert.assertNotNull(strField40);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.RowN rowN5 = org.jooq.impl.DSL.row(wildcardFieldArray3);
        org.jooq.Field<java.lang.Object> objField6 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction8 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(rowN5);
        org.junit.Assert.assertNotNull(objField6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction8);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.jooq.Field<java.lang.String> strField0 = null;
        try {
            org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.castNull(strField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect3 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition4 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray7);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.percentRank(wildcardFieldArray7);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) 1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.ltrim(strField12);
        java.lang.Class<?> wildcardClass17 = strField16.getClass();
        org.jooq.DropIndexFinalStep dropIndexFinalStep19 = org.jooq.impl.DSL.dropIndexIfExists("hi!");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep21 = org.jooq.impl.DSL.rowsBetweenPreceding((int) '4');
        try {
            org.jooq.Row5<org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.Integer>, java.lang.reflect.GenericDeclaration, org.jooq.DropIndexFinalStep, org.jooq.WindowSpecificationRowsAndStep> intRecord1SelectRow5_22 = org.jooq.impl.DSL.row((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, intOrderedAggregateFunction9, (java.lang.reflect.GenericDeclaration) wildcardClass17, dropIndexFinalStep19, windowSpecificationRowsAndStep21);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect3);
        org.junit.Assert.assertNotNull(condition4);
        org.junit.Assert.assertNotNull(fieldArray6);
        org.junit.Assert.assertNotNull(wildcardFieldArray7);
        org.junit.Assert.assertNotNull(groupField8);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(dropIndexFinalStep19);
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep21);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep2 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.jooq.Row22<java.lang.Object[], org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.Condition, org.jooq.WindowSpecificationOrderByStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.Name, org.jooq.Query, org.jooq.WindowOverStep<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<?>[], org.jooq.Attachable> objArrayRow22_0 = null;
        org.jooq.Row22[] row22Array2 = new org.jooq.Row22[1];
        @SuppressWarnings("unchecked") org.jooq.Row22<java.lang.Object[], org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.Condition, org.jooq.WindowSpecificationOrderByStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.Name, org.jooq.Query, org.jooq.WindowOverStep<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<?>[], org.jooq.Attachable>[] objArrayRow22Array3 = (org.jooq.Row22<java.lang.Object[], org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.Condition, org.jooq.WindowSpecificationOrderByStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.Name, org.jooq.Query, org.jooq.WindowOverStep<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<?>[], org.jooq.Attachable>[]) row22Array2;
        objArrayRow22Array3[0] = objArrayRow22_0;
        try {
            org.jooq.Table<org.jooq.Record22<java.lang.Object[], org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.Condition, org.jooq.WindowSpecificationOrderByStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CreateSequenceFinalStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DropIndexFinalStep, org.jooq.Name, org.jooq.Query, org.jooq.WindowOverStep<java.lang.String>, org.jooq.CreateViewAsStep, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Field<?>[], org.jooq.Attachable>> objArrayRecord22Table6 = org.jooq.impl.DSL.values(objArrayRow22Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row22Array2);
        org.junit.Assert.assertNotNull(objArrayRow22Array3);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cosh((java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
        org.jooq.Field<?> wildcardField34 = null;
        org.jooq.Field[] fieldArray36 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray37 = (org.jooq.Field<?>[]) fieldArray36;
        wildcardFieldArray37[0] = wildcardField34;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction40 = org.jooq.impl.DSL.denseRank(wildcardFieldArray37);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction41 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray37);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.least(strField33, wildcardFieldArray37);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction46 = org.jooq.impl.DSL.groupConcat(strField44, "");
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.rpad(strField44, 100, "");
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.decode(strField33, strField49, strField50);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.nvl("", strField49);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction54 = org.jooq.impl.DSL.groupConcat(strField52, "hi!");
        org.jooq.Field<java.lang.String> strField56 = null;
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.lpad(strField56, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField59);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep62 = org.jooq.impl.DSL.lag(strField59, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.mid(strField59, 10, (-1));
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.md5(strField65);
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.lpad(strField66, (-1), "");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep70 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField69);
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.nvl2((org.jooq.Field<java.lang.String>) strAggregateFunction54, "", strField69);
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
        org.junit.Assert.assertNotNull(fieldArray36);
        org.junit.Assert.assertNotNull(wildcardFieldArray37);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction40);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strAggregateFunction46);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strAggregateFunction54);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep62);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField66);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep70);
        org.junit.Assert.assertNotNull(strField71);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        org.jooq.GroupField groupField5 = org.jooq.impl.DSL.rollup(wildcardFieldArray4);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray4);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.jooq.Table<org.jooq.Record> recordTable8 = org.jooq.impl.DSL.table("", (org.jooq.QueryPart[]) wildcardFieldArray4);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(groupField5);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep6);
        org.junit.Assert.assertNotNull(condition7);
        org.junit.Assert.assertNotNull(recordTable8);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (byte) 100, datePart2);
        java.sql.Date date4 = null;
        org.jooq.Field<java.sql.Date> dateField6 = org.jooq.impl.DSL.dateSub(date4, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.dateDiff(dateField3, dateField6);
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Date> dateField10 = org.jooq.impl.DSL.dateAdd(dateField3, (java.lang.Number) 10.0d, datePart9);
        org.jooq.DatePart datePart12 = null;
        org.jooq.Field<java.sql.Date> dateField13 = org.jooq.impl.DSL.dateAdd(dateField10, (java.lang.Number) (byte) -1, datePart12);
        org.junit.Assert.assertNotNull(dateField3);
        org.junit.Assert.assertNotNull(dateField6);
        org.junit.Assert.assertNotNull(intField7);
        org.junit.Assert.assertNotNull(dateField10);
        org.junit.Assert.assertNotNull(dateField13);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.jooq.Row2[] row2Array1 = new org.jooq.Row2[0];
        @SuppressWarnings("unchecked") org.jooq.Row2<org.jooq.Param<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>[] strParamRow2Array2 = (org.jooq.Row2<org.jooq.Param<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>[]) row2Array1;
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.Param<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>> strParamRecord2Table3 = org.jooq.impl.DSL.values((org.jooq.Row2<org.jooq.Param<java.lang.String>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>[]) row2Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row2Array1);
        org.junit.Assert.assertNotNull(strParamRow2Array2);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.minDistinct(strField2);
        org.jooq.Field<java.lang.Integer> intField5 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.space(intField5);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.ltrim(strField6);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction8 = org.jooq.impl.DSL.minDistinct(strField6);
        org.jooq.Field<java.lang.String> strField9 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField24 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField24, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField28 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_34 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField9, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField18, strField19, "", (org.jooq.GroupField) strField24, strField31, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction8, strField31);
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction8, "");
        org.jooq.Field<?> wildcardField38 = null;
        org.jooq.Field[] fieldArray40 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray41 = (org.jooq.Field<?>[]) fieldArray40;
        wildcardFieldArray41[0] = wildcardField38;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction44 = org.jooq.impl.DSL.denseRank(wildcardFieldArray41);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction45 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray41);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.least(strField37, wildcardFieldArray41);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction50 = org.jooq.impl.DSL.groupConcat(strField48, "");
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.rpad(strField48, 100, "");
        org.jooq.Field<java.lang.String> strField54 = null;
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.decode(strField37, strField53, strField54);
        org.jooq.Field<java.lang.String> strField57 = null;
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.lpad(strField57, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.concat("hi!", strField57);
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.left(strField61, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField65 = org.jooq.impl.DSL.right(strField61, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.left(strField65, (int) 'a');
        org.jooq.Field<java.lang.Integer> intField68 = null;
        org.jooq.Field<java.lang.String> strField69 = org.jooq.impl.DSL.space(intField68);
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.ltrim(strField69);
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.lpad(strField69, 10, ' ');
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.left("hi!", (int) '4');
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep77 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField69, (org.jooq.SelectField<java.lang.String>) strField76);
        org.jooq.SelectSelectStep<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4SelectSelectStep78 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strAggregateFunction4, (org.jooq.SelectField<java.lang.String>) strField37, (org.jooq.SelectField<java.lang.String>) strField65, (org.jooq.SelectField<java.lang.String>) strField69);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep79 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField65);
        org.jooq.Param<java.lang.String> strParam80 = org.jooq.impl.DSL.value((java.lang.Object) 0, strField65);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strAggregateFunction8);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_34);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(fieldArray40);
        org.junit.Assert.assertNotNull(wildcardFieldArray41);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction44);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strAggregateFunction50);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField65);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField69);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField76);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep77);
        org.junit.Assert.assertNotNull(strRecord4SelectSelectStep78);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep79);
        org.junit.Assert.assertNotNull(strParam80);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
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
        org.jooq.Field<?> wildcardField34 = null;
        org.jooq.Field[] fieldArray36 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray37 = (org.jooq.Field<?>[]) fieldArray36;
        wildcardFieldArray37[0] = wildcardField34;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction40 = org.jooq.impl.DSL.denseRank(wildcardFieldArray37);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction41 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray37);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.least(strField33, wildcardFieldArray37);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction46 = org.jooq.impl.DSL.groupConcat(strField44, "");
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.rpad(strField44, 100, "");
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.decode(strField33, strField49, strField50);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.nvl("", strField49);
        org.jooq.Param<java.lang.String> strParam54 = org.jooq.impl.DSL.inline('#');
        org.jooq.Field<java.lang.String> strField55 = null;
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.replace(strField52, (org.jooq.Field<java.lang.String>) strParam54, strField55);
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.rpad(strField52, (int) (short) 10, "");
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
        org.junit.Assert.assertNotNull(fieldArray36);
        org.junit.Assert.assertNotNull(wildcardFieldArray37);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction40);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strAggregateFunction46);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strParam54);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField59);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.lag(strField7, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.mid(strField7, 10, (-1));
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.left(strField7, (int) '4');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(strField7, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5(strField7);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField22);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep25 = org.jooq.impl.DSL.lag(strField22, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.mid(strField22, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField30 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.space(intField30);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.ltrim(strField31);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.rpad(strField32, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.concat("", strField35);
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.concat("hi!", strField38);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.left(strField42, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.right(strField42, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.escape(strField42, '4');
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_49 = org.jooq.impl.DSL.row(strField1, strField7, strField28, strField36, strField42);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep52 = org.jooq.impl.DSL.lag(strField28, (int) 'a', "");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep25);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField35);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strRow5_49);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep52);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.jooq.Field<?> wildcardField1 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        wildcardFieldArray4[0] = wildcardField1;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.denseRank(wildcardFieldArray4);
        org.jooq.SQL sQL8 = org.jooq.impl.DSL.sql("hi!", (java.lang.Object[]) wildcardFieldArray4);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.coth((java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.lag(strField11, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.mid(strField11, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction21 = org.jooq.impl.DSL.minDistinct(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction22 = org.jooq.impl.DSL.maxDistinct(strField19);
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.concat("hi!", strField25);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.left(strField29, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.right(strField29, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField29);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.coalesce(strField29, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_40 = org.jooq.impl.DSL.row(strField5, strField11, strField19, strField36);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField44);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField45);
        java.lang.Class<?> wildcardClass47 = strField46.getClass();
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.cast(strField19, strField46);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.ltrim(strField19);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strAggregateFunction21);
        org.junit.Assert.assertNotNull(strAggregateFunction22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strRow4_40);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField49);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.jooq.Name name3 = org.jooq.impl.DSL.name(strArray2);
        org.jooq.Table<?> wildcardTable4 = org.jooq.impl.DSL.unnest((java.lang.Object[]) strArray2);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.least("", strArray2);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.nvl("hi!", strField5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(wildcardTable4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!" };
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat(strArray4);
        org.jooq.CreateViewAsStep createViewAsStep6 = org.jooq.impl.DSL.createView("hi!", strArray4);
        org.jooq.Name name7 = org.jooq.impl.DSL.name(strArray4);
        org.jooq.Field<java.lang.Object> objField8 = org.jooq.impl.DSL.field(name7);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence9 = org.jooq.impl.DSL.sequence(name7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : \"hi!\".\"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(createViewAsStep6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(objField8);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction0 = org.jooq.impl.DSL.count();
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space((org.jooq.Field<java.lang.Integer>) intAggregateFunction0);
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField5);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField6);
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.charLength(strField6);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.nvl(strField1, strField6);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep10 = org.jooq.impl.DSL.firstValue(strField9);
        org.junit.Assert.assertNotNull(intAggregateFunction0);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(intField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep10);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep4 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep5 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep4);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep5);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.minDistinct(strField2);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep5 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField10);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep13 = org.jooq.impl.DSL.lag(strField10, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.mid(strField10, 10, (-1));
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.md5(strField16);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep18 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) strAggregateFunction4, (int) (byte) 1, strField16);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.right(strField16, (int) (short) -1);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep21 = org.jooq.impl.DSL.firstValue(strField16);
        org.jooq.Field<java.lang.Integer> intField22 = org.jooq.impl.DSL.position(strField0, strField16);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep5);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep13);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep18);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep21);
        org.junit.Assert.assertNotNull(intField22);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileDisc((java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep4 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction3);
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField9);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField9, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.mid(strField9, 10, (-1));
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.md5(strField15);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep17 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) strAggregateFunction3, (int) (byte) 1, strField15);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.right(strField15, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField20 = null;
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.lpad(strField20, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField23);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep26 = org.jooq.impl.DSL.lag(strField23, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.mid(strField23, 10, (-1));
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep30 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField19, (org.jooq.SelectField<java.lang.String>) strField29);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep4);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep26);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep30);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField6, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField6);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.coalesce(strField6, "");
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, 1, '4');
        org.jooq.Field<java.lang.Integer> intField17 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.space(intField17);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.ltrim(strField18);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction20 = org.jooq.impl.DSL.minDistinct(strField18);
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
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction20, strField43);
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction20, "");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction50 = org.jooq.impl.DSL.min((org.jooq.Field<java.lang.String>) strAggregateFunction20);
        org.jooq.Field<java.lang.String> strField51 = null;
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.replace(strField16, (org.jooq.Field<java.lang.String>) strAggregateFunction20, strField51);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.lower((org.jooq.Field<java.lang.String>) strAggregateFunction20);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strAggregateFunction20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strAggregateFunction50);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField56);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.rtrim(strField7);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.nvl(strField7, "");
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField12 = null;
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.lpad(strField12, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField15);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep18 = org.jooq.impl.DSL.lag(strField15, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField19 = null;
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.lpad(strField19, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField22);
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.position(strField15, strField22);
        org.jooq.Field<java.lang.Integer> intField25 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.space(intField25);
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.ltrim(strField26);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction28 = org.jooq.impl.DSL.minDistinct(strField26);
        org.jooq.Field<java.lang.Integer> intField29 = null;
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.space(intField29);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.ltrim(strField30);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.rpad(strField31, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep35 = org.jooq.impl.DSL.arrayAgg(strField31);
        org.jooq.Field<java.lang.Integer> intField36 = null;
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.space(intField36);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.ltrim(strField37);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField37, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep43 = org.jooq.impl.DSL.lead(strField41, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField44 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.space(intField44);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.nvl(strField45, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep49 = org.jooq.impl.DSL.lag(strField47, 0);
        org.jooq.Field<java.lang.Integer> intField50 = org.jooq.impl.DSL.position(strField41, strField47);
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_51 = org.jooq.impl.DSL.row(strField15, (org.jooq.Field<java.lang.String>) strAggregateFunction28, strField31, strField41);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.upper(strField31);
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.prior(strField31);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction54 = org.jooq.impl.DSL.minDistinct(strField53);
        org.jooq.Field<?> wildcardField56 = null;
        org.jooq.Field[] fieldArray58 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray59 = (org.jooq.Field<?>[]) fieldArray58;
        wildcardFieldArray59[0] = wildcardField56;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction62 = org.jooq.impl.DSL.denseRank(wildcardFieldArray59);
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.concat(wildcardFieldArray59);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction64 = org.jooq.impl.DSL.percentRank(wildcardFieldArray59);
        org.jooq.SQL sQL65 = org.jooq.impl.DSL.sql("", (java.lang.Object[]) wildcardFieldArray59);
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.decode(strField7, strField11, (org.jooq.Field<java.lang.String>) strAggregateFunction54, wildcardFieldArray59);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep18);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField23);
        org.junit.Assert.assertNotNull(intField24);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strAggregateFunction28);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep35);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep43);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep49);
        org.junit.Assert.assertNotNull(intField50);
        org.junit.Assert.assertNotNull(strRow4_51);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strAggregateFunction54);
        org.junit.Assert.assertNotNull(fieldArray58);
        org.junit.Assert.assertNotNull(wildcardFieldArray59);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction62);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction64);
        org.junit.Assert.assertNotNull(sQL65);
        org.junit.Assert.assertNotNull(strField66);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
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
        org.jooq.Condition condition18 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
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
        org.junit.Assert.assertNotNull(condition18);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        org.jooq.Field<?> wildcardField7 = null;
        org.jooq.Field[] fieldArray9 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray10 = (org.jooq.Field<?>[]) fieldArray9;
        wildcardFieldArray10[0] = wildcardField7;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction13 = org.jooq.impl.DSL.denseRank(wildcardFieldArray10);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.concat(wildcardFieldArray10);
        org.jooq.Field<java.lang.Object> objField15 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray10);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.least(strField5, wildcardFieldArray10);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.nullif("", strField16);
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep18 = org.jooq.impl.DSL.choose(strField17);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertNotNull(wildcardFieldArray10);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(objField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strCaseValueStep18);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        org.jooq.Row21[] row21Array1 = new org.jooq.Row21[0];
        @SuppressWarnings("unchecked") org.jooq.Row21<org.jooq.Param<java.lang.String>, org.jooq.WithStep, org.jooq.GroupConcatOrderByStep, org.jooq.SortField<?>[], java.lang.Object[], org.jooq.QueryPart, org.jooq.CreateSequenceFinalStep, org.jooq.DropTableStep, java.io.Serializable, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.WindowSpecification, java.lang.String[][], org.jooq.AggregateFunction<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.FieldLike>[] strParamRow21Array2 = (org.jooq.Row21<org.jooq.Param<java.lang.String>, org.jooq.WithStep, org.jooq.GroupConcatOrderByStep, org.jooq.SortField<?>[], java.lang.Object[], org.jooq.QueryPart, org.jooq.CreateSequenceFinalStep, org.jooq.DropTableStep, java.io.Serializable, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.WindowSpecification, java.lang.String[][], org.jooq.AggregateFunction<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.FieldLike>[]) row21Array1;
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.Param<java.lang.String>, org.jooq.WithStep, org.jooq.GroupConcatOrderByStep, org.jooq.SortField<?>[], java.lang.Object[], org.jooq.QueryPart, org.jooq.CreateSequenceFinalStep, org.jooq.DropTableStep, java.io.Serializable, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.WindowSpecification, java.lang.String[][], org.jooq.AggregateFunction<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.FieldLike>> strParamRecord21Table3 = org.jooq.impl.DSL.values((org.jooq.Row21<org.jooq.Param<java.lang.String>, org.jooq.WithStep, org.jooq.GroupConcatOrderByStep, org.jooq.SortField<?>[], java.lang.Object[], org.jooq.QueryPart, org.jooq.CreateSequenceFinalStep, org.jooq.DropTableStep, java.io.Serializable, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Row2<java.lang.String, java.lang.String>, java.io.Serializable, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Keyword, org.jooq.WindowSpecification, java.lang.String[][], org.jooq.AggregateFunction<java.lang.String>, org.jooq.DropViewFinalStep, org.jooq.SelectLimitStep<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.GenericDeclaration, org.jooq.FieldLike>[]) row21Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row21Array1);
        org.junit.Assert.assertNotNull(strParamRow21Array2);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) 1.0d, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction12 = org.jooq.impl.DSL.groupConcat(strField10, "");
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.rpad(strField10, 100, "");
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction20 = org.jooq.impl.DSL.groupConcat(strField18, "");
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.nvl2(strField10, "", (org.jooq.Field<java.lang.String>) strAggregateFunction20);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep28 = org.jooq.impl.DSL.lag(strField25, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.mid(strField25, 10, (-1));
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3SelectSelectStep32 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField8, (org.jooq.SelectField<java.lang.String>) strAggregateFunction20, (org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.ltrim(strField8);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.repeat(strField8, (int) (short) -1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strAggregateFunction12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strAggregateFunction20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep28);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strRecord3SelectSelectStep32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField35);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence0 = null;
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep1 = org.jooq.impl.DSL.dropSequenceIfExists(bigIntegerSequence0);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep1);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField3, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("", strField6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.mid(strField6, (int) (short) 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField14);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep17 = org.jooq.impl.DSL.lag(strField14, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.mid(strField14, 10, (-1));
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.md5(strField20);
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.concat("hi!", strField23);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.left(strField27, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.right(strField27, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.concat("hi!", strField33);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.left(strField37, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.right(strField37, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.replace(strField21, strField31, strField37);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.replace(strField37, "hi!");
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField47 = null;
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction48 = org.jooq.impl.DSL.maxDistinct(strField47);
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.left(strField54, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.right(strField54, (int) (short) -1);
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_59 = org.jooq.impl.DSL.row(strField10, strField44, strField46, (org.jooq.Field<java.lang.String>) strAggregateFunction48, strField54);
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.castNull(strField10);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep17);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strAggregateFunction48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strRow5_59);
        org.junit.Assert.assertNotNull(strField60);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression1 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray3 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray4 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray3;
        wildcardCommonTableExpressionArray4[0] = wildcardCommonTableExpression1;
        org.jooq.WithStep withStep7 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray4);
        org.jooq.Condition condition8 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray4);
        org.jooq.WithStep withStep9 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray4);
        org.jooq.RowN rowN10 = org.jooq.impl.DSL.row((java.lang.Object[]) wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(commonTableExpressionArray3);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray4);
        org.junit.Assert.assertNotNull(withStep7);
        org.junit.Assert.assertNotNull(condition8);
        org.junit.Assert.assertNotNull(withStep9);
        org.junit.Assert.assertNotNull(rowN10);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.upper(strField5);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) 100, datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.rtrim(strField7);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.upper(strField7);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileCont((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.right("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep94 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79, (-1));
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep95 = org.jooq.impl.DSL.groupConcat((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79);
        org.jooq.Field<java.lang.String> strField98 = org.jooq.impl.DSL.replace((org.jooq.Field<java.lang.String>) groupConcatOrderByStep79, "hi!", "hi!");
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
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep94);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep95);
        org.junit.Assert.assertNotNull(strField98);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        org.jooq.Row8[] row8Array1 = new org.jooq.Row8[0];
        @SuppressWarnings("unchecked") org.jooq.Row8<org.jooq.Keyword, org.jooq.WithAsStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.GroupField, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[] keywordRow8Array2 = (org.jooq.Row8<org.jooq.Keyword, org.jooq.WithAsStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.GroupField, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>>[]) row8Array1;
        try {
            org.jooq.Table<org.jooq.Record8<org.jooq.Keyword, org.jooq.WithAsStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.DDLQuery, org.jooq.GroupField, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>>> keywordRecord8Table3 = org.jooq.impl.DSL.values(keywordRow8Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row8Array1);
        org.junit.Assert.assertNotNull(keywordRow8Array2);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep92 = org.jooq.impl.DSL.lead(strField89, 0, "hi!");
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
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep92);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction1 = org.jooq.impl.DSL.minDistinct(strField0);
        org.junit.Assert.assertNotNull(strAggregateFunction1);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect3 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition4 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition5 = org.jooq.impl.DSL.exists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.not(condition5);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(condition2);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect3);
        org.junit.Assert.assertNotNull(condition4);
        org.junit.Assert.assertNotNull(condition5);
        org.junit.Assert.assertNotNull(condition6);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.position("hi!", strField1);
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sinh((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.maxDistinct(strField1);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep5 = org.jooq.impl.DSL.groupConcat((org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.repeat((org.jooq.Field<java.lang.String>) strAggregateFunction4, (int) (short) -1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction8 = org.jooq.impl.DSL.min((org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.substring(strField10, 100, 1);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.connectByRoot(strField10);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag((org.jooq.Field<java.lang.String>) strAggregateFunction4, (int) (short) 1, strField14);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strAggregateFunction8);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
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
        org.jooq.Field<org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>> strRecord3Field19 = org.jooq.impl.DSL.field(strRow3_18);
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
        org.junit.Assert.assertNotNull(strRecord3Field19);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField6, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField6);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.coalesce(strField6, "");
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.rpad(strField13, (int) ' ');
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField15);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.jooq.Field<java.sql.Timestamp> timestampField0 = org.jooq.impl.DSL.currentTimestamp();
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.timestamp("hi!");
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField3 = org.jooq.impl.DSL.timestampDiff(timestampField0, timestampField2);
        java.sql.Timestamp timestamp4 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField6 = org.jooq.impl.DSL.timestampAdd(timestamp4, (java.lang.Number) 10L);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField7 = org.jooq.impl.DSL.timestampDiff(timestampField2, timestampField6);
        org.junit.Assert.assertNotNull(timestampField0);
        org.junit.Assert.assertNotNull(timestampField2);
        org.junit.Assert.assertNotNull(dayToSecondField3);
        org.junit.Assert.assertNotNull(timestampField6);
        org.junit.Assert.assertNotNull(dayToSecondField7);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("hi!", strField3);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (byte) -1, '#');
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.nvl("", strField10);
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.position(strField0, strField14);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep16 = org.jooq.impl.DSL.groupConcat(strField14);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.right((org.jooq.Field<java.lang.String>) groupConcatOrderByStep16, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(intField15);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep16);
        org.junit.Assert.assertNotNull(strField18);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
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
        org.jooq.Field<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4Field40 = org.jooq.impl.DSL.field(strRow4_39);
        org.jooq.Field<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4Field41 = org.jooq.impl.DSL.field(strRow4_39);
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
        org.junit.Assert.assertNotNull(strRecord4Field40);
        org.junit.Assert.assertNotNull(strRecord4Field41);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction6 = org.jooq.impl.DSL.denseRank(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction8 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction8);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.right("", 10);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.concat("", strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.connectByRoot(strField3);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction7 = org.jooq.impl.DSL.groupConcat(strField3, "hi!");
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strAggregateFunction7);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.rad((java.lang.Number) 1);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.upper(strField19);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.prior(strField19);
        org.jooq.Field<java.lang.String> strField42 = null;
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.lpad(strField42, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField48 = null;
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.lpad(strField48, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField52 = null;
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.lpad(strField52, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField57 = null;
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.lpad(strField57, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField61 = null;
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.lpad(strField61, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_67 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField42, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField51, strField52, "", (org.jooq.GroupField) strField57, strField64, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.nvl(strField41, strField57);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction70 = org.jooq.impl.DSL.groupConcat(strField41, "hi!");
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.md5((org.jooq.Field<java.lang.String>) strAggregateFunction70);
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
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strSelectFieldRow10_67);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strAggregateFunction70);
        org.junit.Assert.assertNotNull(strField71);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField3, (int) '4');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField11);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence14 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep15 = org.jooq.impl.DSL.createSequence(bigIntegerSequence14);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep16 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep17 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep18 = org.jooq.impl.DSL.dropSequence(bigIntegerSequence14);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.currentUser();
        org.jooq.Row1<java.lang.String> strRow1_20 = org.jooq.impl.DSL.row(strField19);
        org.jooq.Field<org.jooq.Record1<java.lang.String>> strRecord1Field21 = org.jooq.impl.DSL.field(strRow1_20);
        try {
            org.jooq.Row3<org.jooq.SelectField<java.lang.String>, org.jooq.DDLQuery, org.jooq.Row> strSelectFieldRow3_22 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField11, (org.jooq.DDLQuery) dropSequenceFinalStep18, (org.jooq.Row) strRow1_20);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.DropSequenceImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
        org.junit.Assert.assertNotNull(bigIntegerSequence14);
        org.junit.Assert.assertNotNull(createSequenceFinalStep15);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep16);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep17);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strRow1_20);
        org.junit.Assert.assertNotNull(strRecord1Field21);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.bitLength("");
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.rownum();
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.coalesce(strField4, "");
        org.junit.Assert.assertNotNull(intField1);
        org.junit.Assert.assertNotNull(intField2);
        org.junit.Assert.assertNotNull(intRecord1Table3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField6);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        org.jooq.Param<java.lang.String> strParam1 = org.jooq.impl.DSL.inline((java.lang.CharSequence) "hi!");
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        org.jooq.GroupField groupField6 = org.jooq.impl.DSL.rollup(wildcardFieldArray5);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep7 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray5);
        org.jooq.SQL sQL8 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardFieldArray5);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.rank(wildcardFieldArray5);
        org.jooq.GroupField groupField10 = org.jooq.impl.DSL.rollup(wildcardFieldArray5);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep11 = org.jooq.impl.DSL.orderBy(wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.coalesce((org.jooq.Field<java.lang.String>) strParam1, wildcardFieldArray5);
        org.junit.Assert.assertNotNull(strParam1);
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        org.junit.Assert.assertNotNull(groupField6);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep7);
        org.junit.Assert.assertNotNull(sQL8);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction9);
        org.junit.Assert.assertNotNull(groupField10);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep11);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectWhereStep0 = null;
        org.jooq.CaseValueStep<org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectWhereStepCaseValueStep1 = org.jooq.impl.DSL.choose(intRecord1SelectWhereStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectWhereStepCaseValueStep1);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.rpad(strField2, (int) (byte) 0, "hi!");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep6 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField2);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.trim(strField2);
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep8 = org.jooq.impl.DSL.choose(strField2);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField2, (int) (short) -1);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strRecord1SelectSelectStep6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strCaseValueStep8);
        org.junit.Assert.assertNotNull(strField10);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.Condition[] conditionArray7 = new org.jooq.Condition[] { condition6 };
        org.jooq.Condition condition8 = org.jooq.impl.DSL.and(conditionArray7);
        org.jooq.Condition condition9 = org.jooq.impl.DSL.and(conditionArray7);
        org.jooq.Condition condition10 = org.jooq.impl.DSL.and(conditionArray7);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(conditionArray7);
        org.junit.Assert.assertNotNull(condition8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(condition10);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cos((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect1 = org.jooq.impl.DSL.any((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction5 = org.jooq.impl.DSL.groupConcat(strField3, "");
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField9);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField9, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.mid(strField9, 10, (-1));
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.left(strField9, (int) '4');
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(strField9, "");
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.md5(strField9);
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField24);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep27 = org.jooq.impl.DSL.lag(strField24, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.mid(strField24, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField32 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.space(intField32);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.ltrim(strField33);
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.rpad(strField34, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.concat("", strField37);
        org.jooq.Field<java.lang.String> strField40 = null;
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.lpad(strField40, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.concat("hi!", strField40);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.left(strField44, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.right(strField44, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.escape(strField44, '4');
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_51 = org.jooq.impl.DSL.row(strField3, strField9, strField30, strField38, strField44);
        org.jooq.Param<java.lang.String> strParam52 = org.jooq.impl.DSL.val((java.lang.Object) intRecord1QuantifiedSelect1, strField3);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect1);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strAggregateFunction5);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField24);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep27);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField38);
        org.junit.Assert.assertNotNull(strField43);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strRow5_51);
        org.junit.Assert.assertNotNull(strParam52);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.position("hi!", "hi!");
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.space(intField5);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.ltrim(strField6);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.replace((org.jooq.Field<java.lang.String>) strAggregateFunction3, strField4, strField7);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField4, 1, "");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>> intRecord1QuantifiedSelect2 = org.jooq.impl.DSL.all((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(intRecord1QuantifiedSelect2);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.mid(strField3, 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField3, (int) '4');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep12 = org.jooq.impl.DSL.lag(strField11);
        org.jooq.Field<java.lang.Integer> intField13 = org.jooq.impl.DSL.bitLength(strField11);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep12);
        org.junit.Assert.assertNotNull(intField13);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.jooq.Row10[] row10Array1 = new org.jooq.Row10[0];
        @SuppressWarnings("unchecked") org.jooq.Row10<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Keyword, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WithAsStep, org.jooq.Row1<java.lang.String>, java.lang.String, java.lang.reflect.AnnotatedElement, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>[] record1SelectSelectStepRow10Array2 = (org.jooq.Row10<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Keyword, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WithAsStep, org.jooq.Row1<java.lang.String>, java.lang.String, java.lang.reflect.AnnotatedElement, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>[]) row10Array1;
        try {
            org.jooq.Table<org.jooq.Record10<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Keyword, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WithAsStep, org.jooq.Row1<java.lang.String>, java.lang.String, java.lang.reflect.AnnotatedElement, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>> record1SelectSelectStepRecord10Table3 = org.jooq.impl.DSL.values((org.jooq.Row10<org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Keyword, org.jooq.Sequence<java.math.BigInteger>, org.jooq.WithAsStep, org.jooq.Row1<java.lang.String>, java.lang.String, java.lang.reflect.AnnotatedElement, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>>[]) row10Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row10Array1);
        org.junit.Assert.assertNotNull(record1SelectSelectStepRow10Array2);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField1, 100, "");
        org.jooq.CaseValueStep<java.lang.String> strCaseValueStep7 = org.jooq.impl.DSL.choose(strField6);
        try {
            org.jooq.Param<org.jooq.CaseValueStep<java.lang.String>> strCaseValueStepParam8 = org.jooq.impl.DSL.val(strCaseValueStep7);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CaseValueStepImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strCaseValueStep7);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.jooq.Name name6 = org.jooq.impl.DSL.name(strArray5);
        org.jooq.Field<java.lang.Object> objField7 = org.jooq.impl.DSL.field(name6);
        org.jooq.Field<java.lang.Object> objField8 = org.jooq.impl.DSL.field(name6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(objField7);
        org.junit.Assert.assertNotNull(objField8);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 100);
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        org.jooq.Row2<org.jooq.Case, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>> caseRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked") org.jooq.Row2<org.jooq.Case, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>>[] caseRow2Array3 = (org.jooq.Row2<org.jooq.Case, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>>[]) row2Array2;
        caseRow2Array3[0] = caseRow2_0;
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.Case, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>>> caseRecord2Table6 = org.jooq.impl.DSL.values(caseRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row2Array2);
        org.junit.Assert.assertNotNull(caseRow2Array3);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", 1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) 1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.connectByRoot(strField2);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep2 = org.jooq.impl.DSL.createSequence(bigIntegerSequence1);
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep3 = org.jooq.impl.DSL.alterSequence(bigIntegerSequence1);
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep4 = org.jooq.impl.DSL.dropSequenceIfExists(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(bigIntegerSequence1);
        org.junit.Assert.assertNotNull(createSequenceFinalStep2);
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep3);
        org.junit.Assert.assertNotNull(dropSequenceFinalStep4);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.left(strField8, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.right(strField8, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.defaultValue(strField8);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.replace(strField1, strField13);
        org.jooq.Field<java.lang.Integer> intField15 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.space(intField15);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.ltrim(strField16);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction18 = org.jooq.impl.DSL.minDistinct(strField16);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.escape((org.jooq.Field<java.lang.String>) strAggregateFunction18, 'a');
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.concat("hi!", strField22);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.left(strField26, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.right(strField26, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.md5(strField26);
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.isnull(strField20, strField26);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.lower(strField32);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.right("", (int) '#');
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.coerce(strField32, strField36);
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.space(intField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.ltrim(strField39);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction41 = org.jooq.impl.DSL.minDistinct(strField39);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep42 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction41);
        org.jooq.Field<java.lang.String> strField44 = null;
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.lpad(strField44, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField47);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep50 = org.jooq.impl.DSL.lag(strField47, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.mid(strField47, 10, (-1));
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.md5(strField53);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep55 = org.jooq.impl.DSL.lead((org.jooq.Field<java.lang.String>) strAggregateFunction41, (int) (byte) 1, strField53);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.nvl((org.jooq.Field<java.lang.String>) strAggregateFunction41, "hi!");
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.concat("hi!", strField60);
        org.jooq.SelectSelectStep<org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord4SelectSelectStep62 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField13, (org.jooq.SelectField<java.lang.String>) strField32, (org.jooq.SelectField<java.lang.String>) strAggregateFunction41, (org.jooq.SelectField<java.lang.String>) strField60);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strAggregateFunction18);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strAggregateFunction41);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep42);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep50);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep55);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strRecord4SelectSelectStep62);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.upper("hi!");
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsPreceding((int) (byte) 1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.space(intField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.ltrim(strField4);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.rpad(strField5, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("", strField8);
        org.jooq.Param<java.lang.String> strParam10 = org.jooq.impl.DSL.val((java.lang.Object) (byte) 1, strField8);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.prior(strField8);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.sysConnectByPath(strField11, "hi!");
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strParam10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("", (int) (short) 0);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.rtrim(strField2);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (-1.0d), datePart2);
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction1 = org.jooq.impl.DSL.percentileCont((java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction1);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date1, (java.lang.Number) 0);
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.dateDiff(date0, dateField3);
        org.jooq.DatePart datePart6 = null;
        org.jooq.Field<java.sql.Date> dateField7 = org.jooq.impl.DSL.dateAdd(dateField3, (java.lang.Number) 10, datePart6);
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Date> dateField10 = org.jooq.impl.DSL.dateAdd(dateField7, (java.lang.Number) 0.0d, datePart9);
        org.junit.Assert.assertNotNull(dateField3);
        org.junit.Assert.assertNotNull(intField4);
        org.junit.Assert.assertNotNull(dateField7);
        org.junit.Assert.assertNotNull(dateField10);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        org.jooq.SortField[][] sortFieldArray1 = new org.jooq.SortField[0][];
        @SuppressWarnings("unchecked") org.jooq.SortField<?>[][] wildcardSortFieldArray2 = (org.jooq.SortField<?>[][]) sortFieldArray1;
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.SortField<?>[]>> wildcardSortFieldArrayRecord1QuantifiedSelect3 = org.jooq.impl.DSL.any(wildcardSortFieldArray2);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.SortField is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(sortFieldArray1);
        org.junit.Assert.assertNotNull(wildcardSortFieldArray2);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.dateDiff(date0, dateField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.space(intField2);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lower(strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.defaultValue(strField4);
        org.junit.Assert.assertNotNull(intField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        org.jooq.Row9[] row9Array1 = new org.jooq.Row9[0];
        @SuppressWarnings("unchecked") org.jooq.Row9<org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.Case, org.jooq.Row1<java.lang.String>, org.jooq.Attachable, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[], java.lang.Class<?>, org.jooq.Sequence<java.math.BigInteger>>[] strAggregateFunctionRow9Array2 = (org.jooq.Row9<org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.Case, org.jooq.Row1<java.lang.String>, org.jooq.Attachable, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[], java.lang.Class<?>, org.jooq.Sequence<java.math.BigInteger>>[]) row9Array1;
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.AggregateFunction<java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.Case, org.jooq.Row1<java.lang.String>, org.jooq.Attachable, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String[], java.lang.Class<?>, org.jooq.Sequence<java.math.BigInteger>>> strAggregateFunctionRecord9Table3 = org.jooq.impl.DSL.values(strAggregateFunctionRow9Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row9Array1);
        org.junit.Assert.assertNotNull(strAggregateFunctionRow9Array2);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = null;
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField5 = org.jooq.impl.DSL.timestampAdd(timestampField2, (java.lang.Number) 10, datePart4);
        org.jooq.DatePart datePart7 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField8 = org.jooq.impl.DSL.timestampAdd(timestampField5, (java.lang.Number) 10L, datePart7);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField9 = org.jooq.impl.DSL.timestampDiff(timestamp1, timestampField8);
        org.jooq.Field<java.sql.Timestamp> timestampField10 = null;
        org.jooq.DatePart datePart12 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField13 = org.jooq.impl.DSL.timestampAdd(timestampField10, (java.lang.Number) 10, datePart12);
        org.jooq.DatePart datePart15 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField16 = org.jooq.impl.DSL.timestampAdd(timestampField13, (java.lang.Number) 10L, datePart15);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField17 = org.jooq.impl.DSL.timestampDiff(timestampField8, timestampField13);
        org.jooq.Field<java.sql.Timestamp> timestampField19 = org.jooq.impl.DSL.timestamp("hi!");
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField20 = org.jooq.impl.DSL.timestampDiff(timestampField13, timestampField19);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField21 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestampField19);
        org.junit.Assert.assertNotNull(timestampField5);
        org.junit.Assert.assertNotNull(timestampField8);
        org.junit.Assert.assertNotNull(dayToSecondField9);
        org.junit.Assert.assertNotNull(timestampField13);
        org.junit.Assert.assertNotNull(timestampField16);
        org.junit.Assert.assertNotNull(dayToSecondField17);
        org.junit.Assert.assertNotNull(timestampField19);
        org.junit.Assert.assertNotNull(dayToSecondField20);
        org.junit.Assert.assertNotNull(dayToSecondField21);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.RowN rowN5 = org.jooq.impl.DSL.row(wildcardFieldArray3);
        org.jooq.Field<java.lang.Object> objField6 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction7 = org.jooq.impl.DSL.percentRank(wildcardFieldArray3);
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(rowN5);
        org.junit.Assert.assertNotNull(objField6);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction7);
        org.junit.Assert.assertNotNull(groupField8);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.zero();
        java.lang.Class<?> wildcardClass1 = intField0.getClass();
        org.junit.Assert.assertNotNull(intField0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray0 = null;
        try {
            org.jooq.WithStep withStep1 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.space(intField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.ltrim(strField2);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField3, (int) (byte) 0, "hi!");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.concat("", strField6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.mid(strField6, (int) (short) 10, (-1));
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField14);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep17 = org.jooq.impl.DSL.lag(strField14, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.mid(strField14, 10, (-1));
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.md5(strField20);
        org.jooq.Field<java.lang.String> strField23 = null;
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.lpad(strField23, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.concat("hi!", strField23);
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.left(strField27, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.right(strField27, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField33 = null;
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.lpad(strField33, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.concat("hi!", strField33);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.left(strField37, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.right(strField37, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.replace(strField21, strField31, strField37);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.replace(strField37, "hi!");
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField47 = null;
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction48 = org.jooq.impl.DSL.maxDistinct(strField47);
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.concat("hi!", strField50);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.left(strField54, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.right(strField54, (int) (short) -1);
        org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow5_59 = org.jooq.impl.DSL.row(strField10, strField44, strField46, (org.jooq.Field<java.lang.String>) strAggregateFunction48, strField54);
        org.jooq.Field<org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord5Field60 = org.jooq.impl.DSL.field(strRow5_59);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep17);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField27);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strAggregateFunction48);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strRow5_59);
        org.junit.Assert.assertNotNull(strRecord5Field60);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        org.jooq.Row1[] row1Array1 = new org.jooq.Row1[0];
        @SuppressWarnings("unchecked") org.jooq.Row1<org.jooq.Row>[] rowRow1Array2 = (org.jooq.Row1<org.jooq.Row>[]) row1Array1;
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.Row>> rowRecord1Table3 = org.jooq.impl.DSL.values((org.jooq.Row1<org.jooq.Row>[]) row1Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row1Array1);
        org.junit.Assert.assertNotNull(rowRow1Array2);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.ascii(strField1);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep3 = org.jooq.impl.DSL.groupConcatDistinct(strField1);
        org.jooq.Field<java.lang.String> strField5 = null;
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.lpad(strField5, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat("hi!", strField5);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.left(strField9, (int) (short) 0);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence13 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep14 = org.jooq.impl.DSL.createSequence(bigIntegerSequence13);
        org.jooq.Field<java.lang.Integer> intField15 = null;
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.space(intField15);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.ltrim(strField16);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lpad(strField16, 10, ' ');
        org.jooq.Param<java.lang.String> strParam21 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep14, strField20);
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.isnull(strField11, (org.jooq.Field<java.lang.String>) strParam21);
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.nvl2(strField1, strField22, "hi!");
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(intField2);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep3);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(bigIntegerSequence13);
        org.junit.Assert.assertNotNull(createSequenceFinalStep14);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strParam21);
        org.junit.Assert.assertNotNull(strField22);
        org.junit.Assert.assertNotNull(strField24);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.maxDistinct(strField1);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep5 = org.jooq.impl.DSL.groupConcat((org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.repeat((org.jooq.Field<java.lang.String>) strAggregateFunction4, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right((org.jooq.Field<java.lang.String>) strAggregateFunction4, (int) (short) 10);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        org.jooq.Row11[] row11Array1 = new org.jooq.Row11[0];
        @SuppressWarnings("unchecked") org.jooq.Row11<org.jooq.Row1<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>>[] strRow1Row11Array2 = (org.jooq.Row11<org.jooq.Row1<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>>[]) row11Array1;
        try {
            org.jooq.Table<org.jooq.Record11<org.jooq.Row1<java.lang.String>, org.jooq.AlterTableStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Name, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationOrderByStep, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>>> strRow1Record11Table3 = org.jooq.impl.DSL.values(strRow1Row11Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row11Array1);
        org.junit.Assert.assertNotNull(strRow1Row11Array2);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.right(strField5, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.escape(strField5, '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.rtrim(strField11);
        try {
            org.jooq.Table<?> wildcardTable13 = org.jooq.impl.DSL.table(strField12);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Converting arbitrary types into array tables is currently not supported");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        }
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) 0L);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition("");
        org.jooq.Field<java.lang.Boolean> booleanField2 = org.jooq.impl.DSL.field(condition1);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction3 = org.jooq.impl.DSL.every(booleanField2);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(booleanField2);
        org.junit.Assert.assertNotNull(booleanAggregateFunction3);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        org.jooq.Field[] fieldArray1 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray2 = (org.jooq.Field<?>[]) fieldArray1;
        org.jooq.GroupField groupField3 = org.jooq.impl.DSL.rollup(wildcardFieldArray2);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction4 = org.jooq.impl.DSL.percentRank(wildcardFieldArray2);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction5 = org.jooq.impl.DSL.countDistinct(wildcardFieldArray2);
        org.jooq.Field<java.lang.String> strField6 = null;
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.repeat(strField9, (int) '#');
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction13 = org.jooq.impl.DSL.groupConcat(strField9, "hi!");
        org.jooq.Param<java.lang.String> strParam14 = org.jooq.impl.DSL.inline((java.lang.Object) intAggregateFunction5, strField9);
        org.jooq.Field<java.lang.String> strField15 = null;
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.lpad(strField15, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField18);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep21 = org.jooq.impl.DSL.lag(strField18, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField22 = null;
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.lpad(strField22, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField25);
        org.jooq.Field<java.lang.Integer> intField27 = org.jooq.impl.DSL.position(strField18, strField25);
        org.jooq.Field<java.lang.Integer> intField28 = null;
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.space(intField28);
        org.jooq.Field<java.lang.String> strField30 = org.jooq.impl.DSL.ltrim(strField29);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction31 = org.jooq.impl.DSL.minDistinct(strField29);
        org.jooq.Field<java.lang.Integer> intField32 = null;
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.space(intField32);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.ltrim(strField33);
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.rpad(strField34, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep38 = org.jooq.impl.DSL.arrayAgg(strField34);
        org.jooq.Field<java.lang.Integer> intField39 = null;
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.space(intField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.ltrim(strField40);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField40, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep46 = org.jooq.impl.DSL.lead(strField44, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField47 = null;
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.space(intField47);
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.nvl(strField48, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep52 = org.jooq.impl.DSL.lag(strField50, 0);
        org.jooq.Field<java.lang.Integer> intField53 = org.jooq.impl.DSL.position(strField44, strField50);
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_54 = org.jooq.impl.DSL.row(strField18, (org.jooq.Field<java.lang.String>) strAggregateFunction31, strField34, strField44);
        org.jooq.Param<java.lang.String> strParam55 = org.jooq.impl.DSL.val((java.lang.Object) strField9, strField34);
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertNotNull(wildcardFieldArray2);
        org.junit.Assert.assertNotNull(groupField3);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction4);
        org.junit.Assert.assertNotNull(intAggregateFunction5);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strAggregateFunction13);
        org.junit.Assert.assertNotNull(strParam14);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep21);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(intField27);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField30);
        org.junit.Assert.assertNotNull(strAggregateFunction31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField37);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep38);
        org.junit.Assert.assertNotNull(strField40);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep46);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep52);
        org.junit.Assert.assertNotNull(intField53);
        org.junit.Assert.assertNotNull(strRow4_54);
        org.junit.Assert.assertNotNull(strParam55);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lag(strField3, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField7 = null;
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.lpad(strField7, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField10);
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.position(strField3, strField10);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction14 = org.jooq.impl.DSL.groupConcat(strField10, "");
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep6);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(intField12);
        org.junit.Assert.assertNotNull(strAggregateFunction14);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        org.jooq.SQL sQL1 = org.jooq.impl.DSL.sql("");
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.left(strField6, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.right(strField6, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField6);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.coalesce(strField6, "");
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField13, 1, '4');
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.reverse("");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep19 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField13, (org.jooq.SelectField<java.lang.String>) strField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.lower(strField18);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep22 = org.jooq.impl.DSL.lag(strField20, 10);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep22);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.lpad(strField1, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.concat("hi!", strField1);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.left(strField5, (int) (short) 0);
        org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence9 = org.jooq.impl.DSL.sequence("");
        org.jooq.CreateSequenceFinalStep createSequenceFinalStep10 = org.jooq.impl.DSL.createSequence(bigIntegerSequence9);
        org.jooq.Field<java.lang.Integer> intField11 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.space(intField11);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.ltrim(strField12);
        org.jooq.Field<java.lang.String> strField16 = org.jooq.impl.DSL.lpad(strField12, 10, ' ');
        org.jooq.Param<java.lang.String> strParam17 = org.jooq.impl.DSL.inline((java.lang.Object) createSequenceFinalStep10, strField16);
        org.jooq.Field<java.lang.String> strField18 = org.jooq.impl.DSL.isnull(strField7, (org.jooq.Field<java.lang.String>) strParam17);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep19 = org.jooq.impl.DSL.lead(strField7);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(bigIntegerSequence9);
        org.junit.Assert.assertNotNull(createSequenceFinalStep10);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strParam17);
        org.junit.Assert.assertNotNull(strField18);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep19);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        org.jooq.Row17<org.jooq.Schema, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.GroupConcatOrderByStep, java.lang.CharSequence, org.jooq.CreateViewAsStep, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Scope, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.SQL> schemaRow17_0 = null;
        org.jooq.Row17[] row17Array2 = new org.jooq.Row17[1];
        @SuppressWarnings("unchecked") org.jooq.Row17<org.jooq.Schema, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.GroupConcatOrderByStep, java.lang.CharSequence, org.jooq.CreateViewAsStep, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Scope, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.SQL>[] schemaRow17Array3 = (org.jooq.Row17<org.jooq.Schema, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.GroupConcatOrderByStep, java.lang.CharSequence, org.jooq.CreateViewAsStep, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Scope, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.SQL>[]) row17Array2;
        schemaRow17Array3[0] = schemaRow17_0;
        try {
            org.jooq.Table<org.jooq.Record17<org.jooq.Schema, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.GroupConcatOrderByStep, java.lang.CharSequence, org.jooq.CreateViewAsStep, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.WindowSpecificationOrderByStep, org.jooq.SelectFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>, org.jooq.Scope, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.Row2<java.lang.String, java.lang.String>, org.jooq.DSLContext, org.jooq.SQL>> schemaRecord17Table6 = org.jooq.impl.DSL.values(schemaRow17Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row17Array2);
        org.junit.Assert.assertNotNull(schemaRow17Array3);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos((java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
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
        org.jooq.Field<java.lang.String> strField46 = null;
        org.jooq.Field<java.lang.String> strField49 = org.jooq.impl.DSL.lpad(strField46, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.concat("hi!", strField46);
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.left(strField50, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.right(strField50, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField55 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField50);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.coalesce(strField50, "");
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.lpad(strField57, 1, '4');
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.reverse("");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep63 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField57, (org.jooq.SelectField<java.lang.String>) strField62);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep64 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<java.lang.String>) strField32, (org.jooq.SelectField<java.lang.String>) strField62);
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
        org.junit.Assert.assertNotNull(strField49);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(strField55);
        org.junit.Assert.assertNotNull(strField57);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep63);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep64);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        org.jooq.Field<java.sql.Timestamp> timestampField0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = null;
        org.jooq.DatePart datePart4 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField5 = org.jooq.impl.DSL.timestampAdd(timestampField2, (java.lang.Number) 10, datePart4);
        org.jooq.DatePart datePart7 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField8 = org.jooq.impl.DSL.timestampAdd(timestampField5, (java.lang.Number) 10L, datePart7);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField9 = org.jooq.impl.DSL.timestampDiff(timestamp1, timestampField8);
        org.jooq.Field<java.sql.Timestamp> timestampField10 = null;
        org.jooq.DatePart datePart12 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField13 = org.jooq.impl.DSL.timestampAdd(timestampField10, (java.lang.Number) 10, datePart12);
        org.jooq.DatePart datePart15 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField16 = org.jooq.impl.DSL.timestampAdd(timestampField13, (java.lang.Number) 10L, datePart15);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField17 = org.jooq.impl.DSL.timestampDiff(timestampField8, timestampField13);
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField18 = org.jooq.impl.DSL.timestampDiff(timestampField0, timestampField8);
        org.jooq.DatePart datePart20 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField21 = org.jooq.impl.DSL.timestampAdd(timestampField8, (java.lang.Number) (-1.0d), datePart20);
        org.junit.Assert.assertNotNull(timestampField5);
        org.junit.Assert.assertNotNull(timestampField8);
        org.junit.Assert.assertNotNull(dayToSecondField9);
        org.junit.Assert.assertNotNull(timestampField13);
        org.junit.Assert.assertNotNull(timestampField16);
        org.junit.Assert.assertNotNull(dayToSecondField17);
        org.junit.Assert.assertNotNull(dayToSecondField18);
        org.junit.Assert.assertNotNull(timestampField21);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField1, 100, "");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.groupConcat(strField9, "");
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.nvl2(strField1, "", (org.jooq.Field<java.lang.String>) strAggregateFunction11);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.concat(strField1, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag(strField14);
        org.jooq.Field<java.lang.String> strField16 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField19);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep22 = org.jooq.impl.DSL.lag(strField19, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.mid(strField19, 10, (-1));
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.md5(strField25);
        org.jooq.Field<java.lang.String> strField28 = null;
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.concat("hi!", strField28);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.left(strField32, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.right(strField32, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField38 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.lpad(strField38, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.concat("hi!", strField38);
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.left(strField42, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField46 = org.jooq.impl.DSL.right(strField42, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.replace(strField26, strField36, strField42);
        org.jooq.Field<java.lang.String> strField48 = org.jooq.impl.DSL.rtrim(strField26);
        org.jooq.Field<java.lang.String> strField49 = null;
        org.jooq.Field<java.lang.String> strField52 = org.jooq.impl.DSL.lpad(strField49, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField52);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep55 = org.jooq.impl.DSL.lag(strField52, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField56 = null;
        org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.lpad(strField56, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField59);
        org.jooq.Field<java.lang.Integer> intField61 = org.jooq.impl.DSL.position(strField52, strField59);
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.space(intField62);
        org.jooq.Field<java.lang.String> strField64 = org.jooq.impl.DSL.ltrim(strField63);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction65 = org.jooq.impl.DSL.minDistinct(strField63);
        org.jooq.Field<java.lang.Integer> intField66 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.space(intField66);
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.ltrim(strField67);
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.rpad(strField68, (int) (byte) 0, "hi!");
        org.jooq.ArrayAggOrderByStep<java.lang.String[]> strArrayArrayAggOrderByStep72 = org.jooq.impl.DSL.arrayAgg(strField68);
        org.jooq.Field<java.lang.Integer> intField73 = null;
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.space(intField73);
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.ltrim(strField74);
        org.jooq.Field<java.lang.String> strField78 = org.jooq.impl.DSL.lpad(strField74, 10, ' ');
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep80 = org.jooq.impl.DSL.lead(strField78, (int) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField81 = null;
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.space(intField81);
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.nvl(strField82, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep86 = org.jooq.impl.DSL.lag(strField84, 0);
        org.jooq.Field<java.lang.Integer> intField87 = org.jooq.impl.DSL.position(strField78, strField84);
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_88 = org.jooq.impl.DSL.row(strField52, (org.jooq.Field<java.lang.String>) strAggregateFunction65, strField68, strField78);
        org.jooq.Field<java.lang.String> strField89 = org.jooq.impl.DSL.upper(strField68);
        org.jooq.Field<java.lang.String> strField90 = org.jooq.impl.DSL.prior(strField68);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction91 = org.jooq.impl.DSL.minDistinct(strField90);
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.coerce(strField48, (org.jooq.Field<java.lang.String>) strAggregateFunction91);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep93 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField14, (org.jooq.SelectField<java.lang.String>) strField48);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep22);
        org.junit.Assert.assertNotNull(strField25);
        org.junit.Assert.assertNotNull(strField26);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField32);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField41);
        org.junit.Assert.assertNotNull(strField42);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField46);
        org.junit.Assert.assertNotNull(strField47);
        org.junit.Assert.assertNotNull(strField48);
        org.junit.Assert.assertNotNull(strField52);
        org.junit.Assert.assertNotNull(strField53);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep55);
        org.junit.Assert.assertNotNull(strField59);
        org.junit.Assert.assertNotNull(strField60);
        org.junit.Assert.assertNotNull(intField61);
        org.junit.Assert.assertNotNull(strField63);
        org.junit.Assert.assertNotNull(strField64);
        org.junit.Assert.assertNotNull(strAggregateFunction65);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField71);
        org.junit.Assert.assertNotNull(strArrayArrayAggOrderByStep72);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strField78);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep80);
        org.junit.Assert.assertNotNull(strField82);
        org.junit.Assert.assertNotNull(strField84);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep86);
        org.junit.Assert.assertNotNull(intField87);
        org.junit.Assert.assertNotNull(strRow4_88);
        org.junit.Assert.assertNotNull(strField89);
        org.junit.Assert.assertNotNull(strField90);
        org.junit.Assert.assertNotNull(strAggregateFunction91);
        org.junit.Assert.assertNotNull(strField92);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep93);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        org.jooq.Row16<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowSpecificationFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.Comparable<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectOptionStepRow16_0 = null;
        org.jooq.Row16[] row16Array2 = new org.jooq.Row16[1];
        @SuppressWarnings("unchecked") org.jooq.Row16<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowSpecificationFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.Comparable<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[] record1SelectOptionStepRow16Array3 = (org.jooq.Row16<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowSpecificationFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.Comparable<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>[]) row16Array2;
        record1SelectOptionStepRow16Array3[0] = intRecord1SelectOptionStepRow16_0;
        try {
            org.jooq.Table<org.jooq.Record16<org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SQL, org.jooq.DropTableFinalStep, org.jooq.SelectUnionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.WindowSpecificationFinalStep, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition, org.jooq.AggregateFunction<java.lang.String>, org.jooq.CreateSequenceFinalStep, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[], java.lang.Comparable<java.lang.String>, org.jooq.ResultQuery<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>>> record1SelectOptionStepRecord16Table6 = org.jooq.impl.DSL.values(record1SelectOptionStepRow16Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row16Array2);
        org.junit.Assert.assertNotNull(record1SelectOptionStepRow16Array3);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.asin((java.lang.Number) (-1L));
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.left("hi!", (int) '4');
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.defaultValue(strField4);
        org.jooq.Param<java.lang.String> strParam6 = org.jooq.impl.DSL.value((java.lang.Object) (-1L), strField4);
        org.junit.Assert.assertNotNull(bigDecimalField1);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strParam6);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        org.jooq.Row14[] row14Array1 = new org.jooq.Row14[0];
        @SuppressWarnings("unchecked") org.jooq.Row14<org.jooq.RowN[], org.jooq.DropSequenceFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.DDLQuery, java.lang.Object, org.jooq.GroupConcatSeparatorStep, java.lang.String[][], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.WindowSpecificationOrderByStep>[] rowNArrayRow14Array2 = (org.jooq.Row14<org.jooq.RowN[], org.jooq.DropSequenceFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.DDLQuery, java.lang.Object, org.jooq.GroupConcatSeparatorStep, java.lang.String[][], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.WindowSpecificationOrderByStep>[]) row14Array1;
        try {
            org.jooq.Table<org.jooq.Record14<org.jooq.RowN[], org.jooq.DropSequenceFinalStep, org.jooq.AggregateFilterStep<java.lang.String>, org.jooq.Sequence<java.math.BigInteger>, org.jooq.CaseConditionStep<org.jooq.QuantifiedSelect<org.jooq.Record1<java.lang.Integer>>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SortField<?>[], org.jooq.DDLQuery, java.lang.Object, org.jooq.GroupConcatSeparatorStep, java.lang.String[][], org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.WindowSpecificationOrderByStep>> rowNArrayRecord14Table3 = org.jooq.impl.DSL.values(rowNArrayRow14Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(row14Array1);
        org.junit.Assert.assertNotNull(rowNArrayRow14Array2);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.space(intField0);
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.ltrim(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.minDistinct(strField1);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction4 = org.jooq.impl.DSL.maxDistinct(strField1);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep5 = org.jooq.impl.DSL.groupConcat((org.jooq.Field<java.lang.String>) strAggregateFunction4);
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.repeat((org.jooq.Field<java.lang.String>) strAggregateFunction4, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.defaultValue(strField7);
        org.jooq.Field<java.lang.Integer> intField10 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.space(intField10);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.ltrim(strField11);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction13 = org.jooq.impl.DSL.minDistinct(strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.lang.String>) strAggregateFunction13);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep15 = org.jooq.impl.DSL.groupConcatDistinct((org.jooq.Field<java.lang.String>) strAggregateFunction13);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep16 = org.jooq.impl.DSL.lag(strField7, 100, (org.jooq.Field<java.lang.String>) groupConcatOrderByStep15);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strAggregateFunction4);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep5);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strAggregateFunction13);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(groupConcatOrderByStep15);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep16);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        org.jooq.Row21<org.jooq.AlterTableStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.DropTableFinalStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Schema, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.WithStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Class<?>, java.lang.Object[], org.jooq.GroupField, org.jooq.Schema, org.jooq.TableLike<?>, org.jooq.OrderedAggregateFunction<java.lang.Integer>> alterTableStepRow21_0 = null;
        org.jooq.Row21[] row21Array2 = new org.jooq.Row21[1];
        @SuppressWarnings("unchecked") org.jooq.Row21<org.jooq.AlterTableStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.DropTableFinalStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Schema, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.WithStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Class<?>, java.lang.Object[], org.jooq.GroupField, org.jooq.Schema, org.jooq.TableLike<?>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>[] alterTableStepRow21Array3 = (org.jooq.Row21<org.jooq.AlterTableStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.DropTableFinalStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Schema, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.WithStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Class<?>, java.lang.Object[], org.jooq.GroupField, org.jooq.Schema, org.jooq.TableLike<?>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>[]) row21Array2;
        alterTableStepRow21Array3[0] = alterTableStepRow21_0;
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.AlterTableStep, org.jooq.CommonTableExpression<?>[], org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Condition[], org.jooq.OrderedAggregateFunction<java.lang.Integer>, org.jooq.ArrayAggOrderByStep<java.lang.String[]>, org.jooq.DropTableFinalStep, org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.DropIndexFinalStep, org.jooq.Schema, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, java.lang.reflect.AnnotatedElement, org.jooq.WithStep, org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String>, org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, java.lang.Class<?>, java.lang.Object[], org.jooq.GroupField, org.jooq.Schema, org.jooq.TableLike<?>, org.jooq.OrderedAggregateFunction<java.lang.Integer>>> alterTableStepRecord21Table6 = org.jooq.impl.DSL.values(alterTableStepRow21Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(row21Array2);
        org.junit.Assert.assertNotNull(alterTableStepRow21Array3);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
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
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.coalesce(strField89, "hi!");
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.rtrim(strField92);
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
        org.junit.Assert.assertNotNull(strField93);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.jooq.Name name6 = org.jooq.impl.DSL.name(strArray5);
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence7 = org.jooq.impl.DSL.sequence(name6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must provide a qualified name of length 1 or 2 : \"hi!\".\"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.rtrim("");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep2 = org.jooq.impl.DSL.firstValue(strField1);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField6);
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField7);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep9 = org.jooq.impl.DSL.firstValue(strField7);
        org.jooq.Field<java.lang.String> strField11 = null;
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.lpad(strField11, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.concat("hi!", strField11);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.left(strField15, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.right(strField15, (int) (byte) 0);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.upper(strField19);
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.nullif(strField7, strField20);
        org.jooq.Field<java.lang.Integer> intField22 = org.jooq.impl.DSL.position(strField1, strField7);
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField7, (int) '4');
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep2);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep9);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strField15);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strField21);
        org.junit.Assert.assertNotNull(intField22);
        org.junit.Assert.assertNotNull(strField24);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.rad((java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        java.lang.Class<?> wildcardClass6 = strField5.getClass();
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep7 = org.jooq.impl.DSL.lag(strField5);
        org.jooq.Field<java.lang.String> strField8 = null;
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.lpad(strField8, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField11);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep14 = org.jooq.impl.DSL.lag(strField11, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField17 = org.jooq.impl.DSL.mid(strField11, 10, (-1));
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.ltrim(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction21 = org.jooq.impl.DSL.minDistinct(strField19);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction22 = org.jooq.impl.DSL.maxDistinct(strField19);
        org.jooq.Field<java.lang.String> strField25 = null;
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.lpad(strField25, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField29 = org.jooq.impl.DSL.concat("hi!", strField25);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.left(strField29, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.right(strField29, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField34 = org.jooq.impl.DSL.coerce((java.lang.Object) (byte) 10, strField29);
        org.jooq.Field<java.lang.String> strField36 = org.jooq.impl.DSL.coalesce(strField29, "");
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.lpad(strField36, 1, '4');
        org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow4_40 = org.jooq.impl.DSL.row(strField5, strField11, strField19, strField36);
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.String> strField44 = org.jooq.impl.DSL.lpad(strField41, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField44);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep47 = org.jooq.impl.DSL.lag(strField44, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField50 = org.jooq.impl.DSL.mid(strField44, 10, (-1));
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.md5(strField50);
        org.jooq.Field<java.lang.String> strField54 = org.jooq.impl.DSL.lpad(strField51, (-1), "");
        org.jooq.Field<java.lang.Integer> intField55 = org.jooq.impl.DSL.bitLength(strField51);
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.trim(strField51);
        org.jooq.Field<?>[] wildcardFieldArray57 = null;
        org.jooq.Field<java.lang.String> strField58 = org.jooq.impl.DSL.least(strField56, wildcardFieldArray57);
        org.jooq.Field<java.lang.Integer> intField60 = null;
        org.jooq.Field<java.lang.String> strField61 = org.jooq.impl.DSL.space(intField60);
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.ltrim(strField61);
        org.jooq.Field<java.lang.String> strField64 = null;
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.lpad(strField64, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField68 = org.jooq.impl.DSL.concat("hi!", strField64);
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.left(strField68, (int) (short) 0);
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.right(strField68, (int) (short) -1);
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.defaultValue(strField68);
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.replace(strField61, strField73);
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.nvl("hi!", strField73);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep78 = org.jooq.impl.DSL.lag(strField75, (int) (byte) 10, "hi!");
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep79 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField56, (org.jooq.SelectField<java.lang.String>) strField75);
        org.jooq.Row2<java.lang.String, java.lang.String> strRow2_80 = org.jooq.impl.DSL.row(strField19, strField75);
        org.junit.Assert.assertNotNull(strField3);
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep7);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep14);
        org.junit.Assert.assertNotNull(strField17);
        org.junit.Assert.assertNotNull(strField19);
        org.junit.Assert.assertNotNull(strField20);
        org.junit.Assert.assertNotNull(strAggregateFunction21);
        org.junit.Assert.assertNotNull(strAggregateFunction22);
        org.junit.Assert.assertNotNull(strField28);
        org.junit.Assert.assertNotNull(strField29);
        org.junit.Assert.assertNotNull(strField31);
        org.junit.Assert.assertNotNull(strField33);
        org.junit.Assert.assertNotNull(strField34);
        org.junit.Assert.assertNotNull(strField36);
        org.junit.Assert.assertNotNull(strField39);
        org.junit.Assert.assertNotNull(strRow4_40);
        org.junit.Assert.assertNotNull(strField44);
        org.junit.Assert.assertNotNull(strField45);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep47);
        org.junit.Assert.assertNotNull(strField50);
        org.junit.Assert.assertNotNull(strField51);
        org.junit.Assert.assertNotNull(strField54);
        org.junit.Assert.assertNotNull(intField55);
        org.junit.Assert.assertNotNull(strField56);
        org.junit.Assert.assertNotNull(strField58);
        org.junit.Assert.assertNotNull(strField61);
        org.junit.Assert.assertNotNull(strField62);
        org.junit.Assert.assertNotNull(strField67);
        org.junit.Assert.assertNotNull(strField68);
        org.junit.Assert.assertNotNull(strField70);
        org.junit.Assert.assertNotNull(strField72);
        org.junit.Assert.assertNotNull(strField73);
        org.junit.Assert.assertNotNull(strField74);
        org.junit.Assert.assertNotNull(strField75);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep78);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep79);
        org.junit.Assert.assertNotNull(strRow2_80);
    }
}

