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
import jp.co.freee.accounting.models.TrialCrResponse;
import jp.co.freee.accounting.models.TrialCrSectionsResponse;
import jp.co.freee.accounting.models.TrialCrSegment1TagsResponse;
import jp.co.freee.accounting.models.TrialCrSegment2TagsResponse;
import jp.co.freee.accounting.models.TrialCrSegment3TagsResponse;
import jp.co.freee.accounting.models.TrialCrThreeYearsResponse;
import jp.co.freee.accounting.models.TrialCrTwoYearsResponse;
import jp.co.freee.accounting.models.TrialPlResponse;
import jp.co.freee.accounting.models.TrialPlSectionsResponse;
import jp.co.freee.accounting.models.TrialPlSegment1TagsResponse;
import jp.co.freee.accounting.models.TrialPlSegment2TagsResponse;
import jp.co.freee.accounting.models.TrialPlSegment3TagsResponse;
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
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialBsResponse&gt;
   */
  @GET("api/1/reports/trial_bs")
  Observable<TrialBsResponse> getTrialBs(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 貸借対照表(３期間比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialBsThreeYearsResponse&gt;
   */
  @GET("api/1/reports/trial_bs_three_years")
  Observable<TrialBsThreeYearsResponse> getTrialBsThreeYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 貸借対照表(前年比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialBsTwoYearsResponse&gt;
   */
  @GET("api/1/reports/trial_bs_two_years")
  Observable<TrialBsTwoYearsResponse> getTrialBsTwoYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrResponse&gt;
   */
  @GET("api/1/reports/trial_cr")
  Observable<TrialCrResponse> getTrialCr(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書(部門比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param sectionIds 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択の部門で比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrSectionsResponse&gt;
   */
  @GET("api/1/reports/trial_cr_sections")
  Observable<TrialCrSectionsResponse> getTrialCrSections(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("section_ids") String sectionIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書(セグメント1比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param segment1TagIds 出力するセグメント1タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrSegment1TagsResponse&gt;
   */
  @GET("api/1/reports/trial_cr_segment_1_tags")
  Observable<TrialCrSegment1TagsResponse> getTrialCrSegment1Tags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("segment_1_tag_ids") String segment1TagIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書(セグメント2比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param segment2TagIds 出力するセグメント2タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrSegment2TagsResponse&gt;
   */
  @GET("api/1/reports/trial_cr_segment_2_tags")
  Observable<TrialCrSegment2TagsResponse> getTrialCrSegment2Tags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("segment_2_tag_ids") String segment2TagIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書(セグメント3比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param segment3TagIds 出力するセグメント3タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrSegment3TagsResponse&gt;
   */
  @GET("api/1/reports/trial_cr_segment_3_tags")
  Observable<TrialCrSegment3TagsResponse> getTrialCrSegment3Tags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("segment_3_tag_ids") String segment3TagIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書(３期間比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrThreeYearsResponse&gt;
   */
  @GET("api/1/reports/trial_cr_three_years")
  Observable<TrialCrThreeYearsResponse> getTrialCrThreeYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 製造原価報告書(前年比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialCrTwoYearsResponse&gt;
   */
  @GET("api/1/reports/trial_cr_two_years")
  Observable<TrialCrTwoYearsResponse> getTrialCrTwoYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlResponse&gt;
   */
  @GET("api/1/reports/trial_pl")
  Observable<TrialPlResponse> getTrialPl(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書(部門比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param sectionIds 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択の部門で比較できます。） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlSectionsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_sections")
  Observable<TrialPlSectionsResponse> getTrialPlSections(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("section_ids") String sectionIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書(セグメント1比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param segment1TagIds 出力するセグメント1タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlSegment1TagsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_segment_1_tags")
  Observable<TrialPlSegment1TagsResponse> getTrialPlSegment1Tags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("segment_1_tag_ids") String segment1TagIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書(セグメント2比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param segment2TagIds 出力するセグメント2タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlSegment2TagsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_segment_2_tags")
  Observable<TrialPlSegment2TagsResponse> getTrialPlSegment2Tags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("segment_2_tag_ids") String segment2TagIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書(セグメント3比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param segment3TagIds 出力するセグメント3タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlSegment3TagsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_segment_3_tags")
  Observable<TrialPlSegment3TagsResponse> getTrialPlSegment3Tags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("segment_3_tag_ids") String segment3TagIds, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書(３期間比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlThreeYearsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_three_years")
  Observable<TrialPlThreeYearsResponse> getTrialPlThreeYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

  /**
   * 損益計算書(前年比較)の取得
   * 
   * @param companyId 事業所ID (required)
   * @param fiscalYear 会計年度 (optional)
   * @param startMonth 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 (optional)
   * @param endMonth 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 (optional)
   * @param startDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param accountItemDisplayType 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 (optional)
   * @param breakdownDisplayType 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 (optional)
   * @param costAllocation 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 (optional)
   * @param approvalFlowStatus 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  (optional)
   * @return Observable&lt;TrialPlTwoYearsResponse&gt;
   */
  @GET("api/1/reports/trial_pl_two_years")
  Observable<TrialPlTwoYearsResponse> getTrialPlTwoYears(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("fiscal_year") Integer fiscalYear, @retrofit2.http.Query("start_month") Integer startMonth, @retrofit2.http.Query("end_month") Integer endMonth, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("account_item_display_type") String accountItemDisplayType, @retrofit2.http.Query("breakdown_display_type") String breakdownDisplayType, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("cost_allocation") String costAllocation, @retrofit2.http.Query("approval_flow_status") String approvalFlowStatus
  );

}
