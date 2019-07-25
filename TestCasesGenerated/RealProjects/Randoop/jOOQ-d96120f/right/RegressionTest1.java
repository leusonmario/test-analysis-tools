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
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_0 = null;
        try {
            org.jooq.Field<org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>> strRecord12Field1 = org.jooq.impl.DSL.field(strRow12_0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField9);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date(date0);
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        org.junit.Assert.assertNotNull(strField4);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertNotNull(wildcardFieldArray10);
        org.junit.Assert.assertNotNull(intOrderedAggregateFunction13);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(objField15);
        org.junit.Assert.assertNotNull(strField16);
        org.junit.Assert.assertNotNull(strField17);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin((java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 1L);
        java.sql.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.dateDiff(dateField2, date3);
        org.junit.Assert.assertNotNull(dateField2);
        org.junit.Assert.assertNotNull(intField4);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression2 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray4 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked") org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray5 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray4;
        wildcardCommonTableExpressionArray5[0] = wildcardCommonTableExpression2;
        org.jooq.WithStep withStep8 = org.jooq.impl.DSL.with(wildcardCommonTableExpressionArray5);
        org.jooq.Condition condition9 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray5);
        org.jooq.SQL sQL10 = org.jooq.impl.DSL.sql("hi!", (org.jooq.QueryPart[]) wildcardCommonTableExpressionArray5);
        org.jooq.WithStep withStep11 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray5);
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.rtrim("");
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.cast((java.lang.Object) withStep11, strField13);
        org.junit.Assert.assertNotNull(commonTableExpressionArray4);
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray5);
        org.junit.Assert.assertNotNull(withStep8);
        org.junit.Assert.assertNotNull(condition9);
        org.junit.Assert.assertNotNull(sQL10);
        org.junit.Assert.assertNotNull(withStep11);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(strField14);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.jooq.Condition[] conditionArray0 = new org.jooq.Condition[] {};
        org.jooq.Condition condition1 = org.jooq.impl.DSL.or(conditionArray0);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(condition1);
        org.jooq.Condition condition3 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.jooq.Condition condition4 = org.jooq.impl.DSL.condition((org.jooq.Field<java.lang.Boolean>) booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(conditionArray0);
        org.junit.Assert.assertNotNull(condition1);
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
        org.junit.Assert.assertNotNull(condition3);
        org.junit.Assert.assertNotNull(condition4);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("hi!", (int) '#');
        org.jooq.Field<java.lang.String> strField4 = null;
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.lpad(strField4, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField8 = org.jooq.impl.DSL.concat("hi!", strField4);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.nullif(strField4, "");
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.upper(strField4);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.String, java.lang.String>> strRecord2SelectSelectStep12 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField2, (org.jooq.SelectField<java.lang.String>) strField11);
        org.junit.Assert.assertNotNull(strField2);
        org.junit.Assert.assertNotNull(strField7);
        org.junit.Assert.assertNotNull(strField8);
        org.junit.Assert.assertNotNull(strField10);
        org.junit.Assert.assertNotNull(strField11);
        org.junit.Assert.assertNotNull(strRecord2SelectSelectStep12);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction3 = org.jooq.impl.DSL.groupConcat(strField1, "");
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.rpad(strField1, 100, "");
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.md5("");
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction11 = org.jooq.impl.DSL.groupConcat(strField9, "");
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.nvl2(strField1, "", (org.jooq.Field<java.lang.String>) strAggregateFunction11);
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.concat(strField1, "hi!");
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag(strField14);
        org.junit.Assert.assertNotNull(strField1);
        org.junit.Assert.assertNotNull(strAggregateFunction3);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strAggregateFunction11);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField14);
        org.junit.Assert.assertNotNull(strWindowIgnoreNullsStep15);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.right("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.lpad(strField2, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.concat("hi!", strField2);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.lpad(strField6, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (byte) -1, '#');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.nvl("", strField9);
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.length(strField9);
        org.jooq.Field<java.lang.String> strField15 = org.jooq.impl.DSL.connectByRoot(strField9);
        org.junit.Assert.assertNotNull(strField5);
        org.junit.Assert.assertNotNull(strField6);
        org.junit.Assert.assertNotNull(strField9);
        org.junit.Assert.assertNotNull(strField12);
        org.junit.Assert.assertNotNull(strField13);
        org.junit.Assert.assertNotNull(intField14);
        org.junit.Assert.assertNotNull(strField15);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.exp((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sinh((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (byte) 100, datePart2);
        java.sql.Date date4 = null;
        org.jooq.Field<java.sql.Date> dateField6 = org.jooq.impl.DSL.dateSub(date4, (java.lang.Number) 0L);
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.dateDiff(dateField3, dateField6);
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Date> dateField10 = org.jooq.impl.DSL.dateAdd(dateField3, (java.lang.Number) 10.0d, datePart9);
        org.junit.Assert.assertNotNull(dateField3);
        org.junit.Assert.assertNotNull(dateField6);
        org.junit.Assert.assertNotNull(intField7);
        org.junit.Assert.assertNotNull(dateField10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.Condition condition6 = org.jooq.impl.DSL.condition("hi!", (org.jooq.QueryPart[]) wildcardFieldArray3);
        org.jooq.Condition condition7 = org.jooq.impl.DSL.not(condition6);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        org.junit.Assert.assertNotNull(groupField4);
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep5);
        org.junit.Assert.assertNotNull(condition6);
        org.junit.Assert.assertNotNull(condition7);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
}

