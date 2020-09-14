package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TrialBalanceApi {
  /**
   * 貸借対照表の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;opening_balance : 期首残高 &lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;debit_amount : 借方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;credit_amount:  貸方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;composition_ratio : 構成比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&amp;amp;breakdown_display_type&#x3D;partner&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;breakdown_display_type&amp;quot; : &amp;quot;partner&amp;quot;,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;opening_balance&amp;quot; : 100000,         &amp;quot;debit_amount&amp;quot; : 50000,         &amp;quot;credit_amount&amp;quot; : 20000,         &amp;quot;closing_balance&amp;quot; : 130000,         &amp;quot;composition_ratio&amp;quot; : 0.25         &amp;quot;partners&amp;quot; : [{           &amp;quot;id&amp;quot; : 123,           &amp;quot;name&amp;quot; : &amp;quot;freee&amp;quot;,           &amp;quot;opening_balance&amp;quot; : 100000,           &amp;quot;debit_amount&amp;quot; : 50000,           &amp;quot;credit_amount&amp;quot; : 20000,           &amp;quot;closing_balance&amp;quot; : 130000,           &amp;quot;composition_ratio&amp;quot; : 0.25           },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @return Observable&lt;TrialBsResponse&gt;
   */
  @GET("api/1/reports/trial_bs")
  Observable<TrialBsResponse> getTrialBs(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("adjustment") String adjustment
  );

  /**
   * 貸借対照表(３期間比較)の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表(３期間比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;two_years_before_closing_balance:  前々年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs_three_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs_three_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;two_year_before_closing_balance&amp;quot; : 50000,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @return Observable&lt;TrialBsThreeYearsResponse&gt;
   */
  @GET("api/1/reports/trial_bs_three_years")
  Observable<TrialBsThreeYearsResponse> getTrialBsThreeYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("adjustment") String adjustment
  );

  /**
   * 貸借対照表(前年比較)の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表(前年比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs_two_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs_two_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85        },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @return Observable&lt;TrialBsTwoYearsResponse&gt;
   */
  @GET("api/1/reports/trial_bs_two_years")
  Observable<TrialBsTwoYearsResponse> getTrialBsTwoYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("adjustment") String adjustment
  );

  /**
   * 損益計算書の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;opening_balance : 期首残高 &lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;debit_amount : 借方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;credit_amount:  貸方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;composition_ratio : 構成比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&amp;amp;breakdown_display_type&#x3D;partner&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;breakdown_display_type&amp;quot; : &amp;quot;partner&amp;quot;,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;opening_balance&amp;quot; : 100000,         &amp;quot;debit_amount&amp;quot; : 50000,         &amp;quot;credit_amount&amp;quot; : 20000,         &amp;quot;closing_balance&amp;quot; : 130000,         &amp;quot;composition_ratio&amp;quot; : 0.25         &amp;quot;partners&amp;quot; : [{           &amp;quot;id&amp;quot; : 123,           &amp;quot;name&amp;quot; : &amp;quot;freee&amp;quot;,           &amp;quot;opening_balance&amp;quot; : 100000,           &amp;quot;debit_amount&amp;quot; : 50000,           &amp;quot;credit_amount&amp;quot; : 20000,           &amp;quot;closing_balance&amp;quot; : 130000,           &amp;quot;composition_ratio&amp;quot; : 0.25           },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） (optional)
   * @return Observable&lt;TrialPlResponse&gt;
   */
  @GET("api/1/reports/trial_pl")
  Observable<TrialPlResponse> getTrialPl(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation
  );

  /**
   * 損益計算書(部門比較)の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(部門比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;個人向けのプレミアムプラン、法人向けのビジネスプラン以上で利用可能なAPIです。対象外のプランでは401エラーを返却します。&lt;/li&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_section?company_id&#x3D;1&amp;amp;section_ids&#x3D;1,2,3&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt;&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_sections&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;section_ids&amp;quot; : &amp;quot;1,2,3&amp;quot;,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;closing_balance&amp;quot; : 1000000,         &amp;quot;sections&amp;quot; : [{           &amp;quot;id&amp;quot;: 1           &amp;quot;name&amp;quot;: &amp;quot;営業部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 100000         },         {           &amp;quot;id&amp;quot;: 2           &amp;quot;name&amp;quot;: &amp;quot;広報部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 200000         },         {           &amp;quot;id&amp;quot;: 3           &amp;quot;name&amp;quot;: &amp;quot;人事部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 300000         },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param sectionIds 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） (optional)
   * @return Observable&lt;TrialPlSectionsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_sections")
  Observable<TrialPlSectionsResponse> getTrialPlSections(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("section_ids") String sectionIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation
  );

  /**
   * 損益計算書(３期間比較)の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(３期間比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;two_years_before_closing_balance:  前々年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_three_years?company_id&#x3D;1&amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_three_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;two_year_before_closing_balance&amp;quot; : 50000,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） (optional)
   * @return Observable&lt;TrialPlThreeYearsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_three_years")
  Observable<TrialPlThreeYearsResponse> getTrialPlThreeYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation
  );

  /**
   * 損益計算書(前年比較)の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(前年比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_two_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_two_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85        },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12) (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12) (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group） (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） (optional)
   * @return Observable&lt;TrialPlTwoYearsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_two_years")
  Observable<TrialPlTwoYearsResponse> getTrialPlTwoYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation
  );

}
