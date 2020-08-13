package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TooManyRequestsError;
import jp.co.freee.accounting.models.TrialBsResponse;
import jp.co.freee.accounting.models.TrialBsThreeYearsResponse;
import jp.co.freee.accounting.models.TrialBsTwoYearsResponse;
import jp.co.freee.accounting.models.TrialPlResponse;
import jp.co.freee.accounting.models.TrialPlSectionsResponse;
import jp.co.freee.accounting.models.TrialPlThreeYearsResponse;
import jp.co.freee.accounting.models.TrialPlTwoYearsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrialBalanceApi
 */
public class TrialBalanceApiTest {

    private TrialBalanceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TrialBalanceApi.class);
    }

    /**
     * 貸借対照表の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;opening_balance : 期首残高 &lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;debit_amount : 借方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;credit_amount:  貸方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;composition_ratio : 構成比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&amp;amp;breakdown_display_type&#x3D;partner&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;breakdown_display_type&amp;quot; : &amp;quot;partner&amp;quot;,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;opening_balance&amp;quot; : 100000,         &amp;quot;debit_amount&amp;quot; : 50000,         &amp;quot;credit_amount&amp;quot; : 20000,         &amp;quot;closing_balance&amp;quot; : 130000,         &amp;quot;composition_ratio&amp;quot; : 0.25         &amp;quot;partners&amp;quot; : [{           &amp;quot;id&amp;quot; : 123,           &amp;quot;name&amp;quot; : &amp;quot;freee&amp;quot;,           &amp;quot;opening_balance&amp;quot; : 100000,           &amp;quot;debit_amount&amp;quot; : 50000,           &amp;quot;credit_amount&amp;quot; : 20000,           &amp;quot;closing_balance&amp;quot; : 130000,           &amp;quot;composition_ratio&amp;quot; : 0.25           },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialBsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        String adjustment = null;
        // TrialBsResponse response = api.getTrialBs(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment);

        // TODO: test validations
    }
    /**
     * 貸借対照表(３期間比較)の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表(３期間比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;two_years_before_closing_balance:  前々年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs_three_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs_three_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;two_year_before_closing_balance&amp;quot; : 50000,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialBsThreeYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        String adjustment = null;
        // TrialBsThreeYearsResponse response = api.getTrialBsThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment);

        // TODO: test validations
    }
    /**
     * 貸借対照表(前年比較)の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表(前年比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs_two_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs_two_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85        },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialBsTwoYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        String adjustment = null;
        // TrialBsTwoYearsResponse response = api.getTrialBsTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment);

        // TODO: test validations
    }
    /**
     * 損益計算書の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;opening_balance : 期首残高 &lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;debit_amount : 借方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;credit_amount:  貸方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;composition_ratio : 構成比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&amp;amp;breakdown_display_type&#x3D;partner&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;breakdown_display_type&amp;quot; : &amp;quot;partner&amp;quot;,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;opening_balance&amp;quot; : 100000,         &amp;quot;debit_amount&amp;quot; : 50000,         &amp;quot;credit_amount&amp;quot; : 20000,         &amp;quot;closing_balance&amp;quot; : 130000,         &amp;quot;composition_ratio&amp;quot; : 0.25         &amp;quot;partners&amp;quot; : [{           &amp;quot;id&amp;quot; : 123,           &amp;quot;name&amp;quot; : &amp;quot;freee&amp;quot;,           &amp;quot;opening_balance&amp;quot; : 100000,           &amp;quot;debit_amount&amp;quot; : 50000,           &amp;quot;credit_amount&amp;quot; : 20000,           &amp;quot;closing_balance&amp;quot; : 130000,           &amp;quot;composition_ratio&amp;quot; : 0.25           },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialPlTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        // TrialPlResponse response = api.getTrialPl(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation);

        // TODO: test validations
    }
    /**
     * 損益計算書(部門比較)の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(部門比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;個人向けのプレミアムプラン、法人向けのビジネスプラン以上で利用可能なAPIです。対象外のプランでは401エラーを返却します。&lt;/li&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_section?company_id&#x3D;1&amp;amp;section_ids&#x3D;1,2,3&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt;&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_sections&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;section_ids&amp;quot; : &amp;quot;1,2,3&amp;quot;,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;closing_balance&amp;quot; : 1000000,         &amp;quot;sections&amp;quot; : [{           &amp;quot;id&amp;quot;: 1           &amp;quot;name&amp;quot;: &amp;quot;営業部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 100000         },         {           &amp;quot;id&amp;quot;: 2           &amp;quot;name&amp;quot;: &amp;quot;広報部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 200000         },         {           &amp;quot;id&amp;quot;: 3           &amp;quot;name&amp;quot;: &amp;quot;人事部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 300000         },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialPlSectionsTest() {
        Integer companyId = null;
        String sectionIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        String adjustment = null;
        String costAllocation = null;
        // TrialPlSectionsResponse response = api.getTrialPlSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation);

        // TODO: test validations
    }
    /**
     * 損益計算書(３期間比較)の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(３期間比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;two_years_before_closing_balance:  前々年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_three_years?company_id&#x3D;1&amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_three_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;two_year_before_closing_balance&amp;quot; : 50000,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialPlThreeYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        // TrialPlThreeYearsResponse response = api.getTrialPlThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation);

        // TODO: test validations
    }
    /**
     * 損益計算書(前年比較)の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(前年比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_two_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_two_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85        },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getTrialPlTwoYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        // TrialPlTwoYearsResponse response = api.getTrialPlTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation);

        // TODO: test validations
    }
}
