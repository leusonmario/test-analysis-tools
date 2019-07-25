import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField0, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField3);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField4);
        org.jooq.Field<java.lang.Boolean> booleanField7 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition8 = org.jooq.impl.DSL.condition(booleanField7);
        org.jooq.Field<java.lang.String> strField9 = null;
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.lpad(strField9, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField12);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep15 = org.jooq.impl.DSL.lag(strField12, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField16 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.lpad(strField16, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField19);
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.position(strField12, strField19);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep22 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField19);
        org.jooq.CaseConditionStep<java.lang.String> strCaseConditionStep23 = org.jooq.impl.DSL.when(condition8, strField19);
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.position(strField5, strField19);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on condition8 and booleanField7.", condition8.equals(booleanField7) == booleanField7.equals(condition8));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        org.jooq.GroupField groupField4 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep5 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray3);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep6 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray3);
        org.jooq.Table<org.jooq.Record> recordTable7 = org.jooq.impl.DSL.table("", (java.lang.Object[]) wildcardFieldArray3);
        org.jooq.GroupField groupField8 = org.jooq.impl.DSL.rollup(wildcardFieldArray3);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on windowSpecificationOrderByStep5 and recordTable7.", windowSpecificationOrderByStep5.equals(recordTable7) == recordTable7.equals(windowSpecificationOrderByStep5));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.jooq.Field<?> wildcardField4 = null;
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        wildcardFieldArray7[0] = wildcardField4;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction10 = org.jooq.impl.DSL.denseRank(wildcardFieldArray7);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.concat(wildcardFieldArray7);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray7);
        org.jooq.Field<java.lang.Object> objField13 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray7);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction14 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray7);
        org.jooq.GroupField groupField15 = org.jooq.impl.DSL.rollup(wildcardFieldArray7);
        org.jooq.Table<org.jooq.Record> recordTable16 = org.jooq.impl.DSL.table("hi!", (java.lang.Object[]) wildcardFieldArray7);
        org.jooq.QueryPart queryPart17 = org.jooq.impl.DSL.queryPart("", (org.jooq.QueryPart[]) wildcardFieldArray7);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction18 = org.jooq.impl.DSL.percentRank(wildcardFieldArray7);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on queryPart17 and objField12.", queryPart17.equals(objField12) == objField12.equals(queryPart17));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.upper("");
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        org.jooq.GroupField groupField6 = org.jooq.impl.DSL.rollup(wildcardFieldArray5);
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep7 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray5);
        org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep8 = org.jooq.impl.DSL.select((org.jooq.SelectField<?>[]) wildcardFieldArray5);
        org.jooq.Table<org.jooq.Record> recordTable9 = org.jooq.impl.DSL.table("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.greatest(strField1, wildcardFieldArray5);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on windowSpecificationOrderByStep7 and recordTable9.", windowSpecificationOrderByStep7.equals(recordTable9) == recordTable9.equals(windowSpecificationOrderByStep7));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction8 = org.jooq.impl.DSL.denseRank(wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField9 = org.jooq.impl.DSL.concat(wildcardFieldArray5);
        org.jooq.Field<java.lang.Object> objField10 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.QueryPart queryPart11 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField12 = org.jooq.impl.DSL.concat(wildcardFieldArray5);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on queryPart11 and objField10.", queryPart11.equals(objField10) == objField10.equals(queryPart11));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not((java.lang.Boolean) false);
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.lpad(strField3, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField6);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep9 = org.jooq.impl.DSL.lag(strField6, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField10 = null;
        org.jooq.Field<java.lang.String> strField13 = org.jooq.impl.DSL.lpad(strField10, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField14 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField13);
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.position(strField6, strField13);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.String>> strRecord1SelectSelectStep16 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.String>) strField13);
        org.jooq.CaseConditionStep<java.lang.String> strCaseConditionStep17 = org.jooq.impl.DSL.when(condition2, strField13);
        org.jooq.Field<java.lang.String> strField18 = null;
        org.jooq.Field<java.lang.String> strField21 = org.jooq.impl.DSL.lpad(strField18, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField22 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField21);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep24 = org.jooq.impl.DSL.lag(strField21, (int) (byte) 1);
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.mid(strField21, 10, (-1));
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.md5(strField27);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.lpad(strField28, (-1), "");
        org.jooq.Field<java.lang.Integer> intField32 = org.jooq.impl.DSL.bitLength(strField28);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.trim(strField28);
        org.jooq.Field<?>[] wildcardFieldArray34 = null;
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.least(strField33, wildcardFieldArray34);
        org.jooq.Field<java.lang.String> strField37 = org.jooq.impl.DSL.coalesce(strField33, "hi!");
        org.jooq.Param<java.lang.String> strParam39 = org.jooq.impl.DSL.inline((java.lang.Character) 'a');
        org.jooq.Field<java.lang.Integer> intField40 = null;
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.space(intField40);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.ltrim(strField41);
        org.jooq.AggregateFunction<java.lang.String> strAggregateFunction43 = org.jooq.impl.DSL.minDistinct(strField41);
        org.jooq.Field<java.lang.String> strField44 = null;
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.lpad(strField44, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField50 = null;
        org.jooq.Field<java.lang.String> strField53 = org.jooq.impl.DSL.lpad(strField50, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField54 = null;
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.lpad(strField54, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField63 = null;
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.lpad(strField63, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_69 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField44, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField53, strField54, "", (org.jooq.GroupField) strField59, strField66, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.String> strField70 = org.jooq.impl.DSL.isnull((org.jooq.Field<java.lang.String>) strAggregateFunction43, strField66);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep72 = org.jooq.impl.DSL.lag((org.jooq.Field<java.lang.String>) strAggregateFunction43, 10);
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.rpad((org.jooq.Field<java.lang.String>) strAggregateFunction43, (int) (short) 10, "hi!");
        org.jooq.Field<java.lang.String> strField76 = org.jooq.impl.DSL.replace((org.jooq.Field<java.lang.String>) strParam39, strField75);
        org.jooq.Field<java.lang.String> strField77 = org.jooq.impl.DSL.replace(strField13, strField37, (org.jooq.Field<java.lang.String>) strParam39);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on condition2 and booleanField1.", condition2.equals(booleanField1) == booleanField1.equals(condition2));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction9 = org.jooq.impl.DSL.denseRank(wildcardFieldArray6);
        org.jooq.Field<java.lang.String> strField10 = org.jooq.impl.DSL.concat(wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField11 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray6);
        org.jooq.Field<java.lang.Object> objField12 = org.jooq.impl.DSL.field("hi!", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.SQL sQL13 = org.jooq.impl.DSL.sql("", (org.jooq.QueryPart[]) wildcardFieldArray6);
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction14 = org.jooq.impl.DSL.percentRank(wildcardFieldArray6);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on sQL13 and objField11.", sQL13.equals(objField11) == objField11.equals(sQL13));
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
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
        org.jooq.Field<java.lang.Integer> intField18 = null;
        org.jooq.Field<java.lang.String> strField19 = org.jooq.impl.DSL.space(intField18);
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.String> strField24 = org.jooq.impl.DSL.lpad(strField21, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField25 = org.jooq.impl.DSL.concat("hi!", strField21);
        org.jooq.Field<java.lang.Integer> intField26 = null;
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.space(intField26);
        org.jooq.Field<java.lang.String> strField28 = org.jooq.impl.DSL.ltrim(strField27);
        org.jooq.Field<java.lang.String> strField29 = null;
        org.jooq.Field<java.lang.String> strField32 = org.jooq.impl.DSL.lpad(strField29, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField35 = null;
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.lpad(strField35, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField39 = null;
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.lpad(strField39, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField44 = null;
        org.jooq.Field<java.lang.String> strField47 = org.jooq.impl.DSL.lpad(strField44, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField48 = null;
        org.jooq.Field<java.lang.String> strField51 = org.jooq.impl.DSL.lpad(strField48, (int) (short) -1, 'a');
        org.jooq.Row10<org.jooq.SelectField<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.SelectField<java.lang.String>, org.jooq.Field<java.lang.String>, java.lang.String, org.jooq.GroupField, org.jooq.Field<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> strSelectFieldRow10_54 = org.jooq.impl.DSL.row((org.jooq.SelectField<java.lang.String>) strField29, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!", (org.jooq.SelectField<java.lang.String>) strField38, strField39, "", (org.jooq.GroupField) strField44, strField51, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.jooq.Field<java.lang.Integer> intField55 = null;
        org.jooq.Field<java.lang.String> strField56 = org.jooq.impl.DSL.space(intField55);
        org.jooq.Field<java.lang.String> strField57 = org.jooq.impl.DSL.ltrim(strField56);
        org.jooq.Field<java.lang.String> strField59 = null;
        org.jooq.Field<java.lang.String> strField62 = org.jooq.impl.DSL.lpad(strField59, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.concat("hi!", strField59);
        org.jooq.Field<java.lang.String> strField66 = org.jooq.impl.DSL.lpad(strField63, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField68 = null;
        org.jooq.Field<java.lang.String> strField71 = org.jooq.impl.DSL.lpad(strField68, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField72 = org.jooq.impl.DSL.concat("hi!", strField68);
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.lpad(strField72, (int) (byte) 10, '4');
        org.jooq.Field<java.lang.String> strField76 = null;
        org.jooq.Field<java.lang.String> strField79 = org.jooq.impl.DSL.lpad(strField76, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.Integer> intField80 = null;
        org.jooq.Field<java.lang.String> strField81 = org.jooq.impl.DSL.space(intField80);
        org.jooq.Field<java.lang.String> strField82 = org.jooq.impl.DSL.ltrim(strField81);
        org.jooq.Field<java.lang.Integer> intField83 = null;
        org.jooq.Field<java.lang.String> strField84 = org.jooq.impl.DSL.space(intField83);
        org.jooq.Field<java.lang.String> strField85 = null;
        org.jooq.Field<java.lang.String> strField88 = org.jooq.impl.DSL.lpad(strField85, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField89 = null;
        org.jooq.Field<java.lang.String> strField92 = org.jooq.impl.DSL.lpad(strField89, (int) (short) -1, 'a');
        org.jooq.Field<java.lang.String> strField93 = org.jooq.impl.DSL.field((org.jooq.SelectField<java.lang.String>) strField92);
        org.jooq.WindowIgnoreNullsStep<java.lang.String> strWindowIgnoreNullsStep95 = org.jooq.impl.DSL.lag(strField92, (int) (byte) 1);
        org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> strRow12_96 = org.jooq.impl.DSL.row(strField19, strField21, strField27, strField29, strField56, strField66, strField72, strField79, strField82, strField84, strField88, strField92);
        org.jooq.Field<java.lang.String> strField97 = org.jooq.impl.DSL.rtrim(strField19);
        org.jooq.Param<java.lang.String> strParam98 = org.jooq.impl.DSL.val((java.lang.Object) strField14, strField97);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on condition3 and booleanAggregateFunction2.", condition3.equals(booleanAggregateFunction2) == booleanAggregateFunction2.equals(condition3));
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
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
        org.jooq.Field<?> wildcardField28 = null;
        org.jooq.Field[] fieldArray30 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked") org.jooq.Field<?>[] wildcardFieldArray31 = (org.jooq.Field<?>[]) fieldArray30;
        wildcardFieldArray31[0] = wildcardField28;
        org.jooq.OrderedAggregateFunction<java.lang.Integer> intOrderedAggregateFunction34 = org.jooq.impl.DSL.denseRank(wildcardFieldArray31);
        org.jooq.Field<java.lang.String> strField35 = org.jooq.impl.DSL.concat(wildcardFieldArray31);
        org.jooq.Field<java.lang.Object> objField36 = org.jooq.impl.DSL.field("", (java.lang.Object[]) wildcardFieldArray31);
        org.jooq.QueryPart queryPart37 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray31);
        org.jooq.Field<java.lang.String> strField38 = org.jooq.impl.DSL.least(strField9, wildcardFieldArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on queryPart37 and objField36.", queryPart37.equals(objField36) == objField36.equals(queryPart37));
    }
}

