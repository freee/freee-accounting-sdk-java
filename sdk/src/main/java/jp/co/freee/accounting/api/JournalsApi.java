package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.JournalStatusResponse;
import jp.co.freee.accounting.models.JournalsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JournalsApi {
  /**
   * ダウンロード実行
   * 
   * @param id 受け付けID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ResponseBody&gt;
   */
  @GET("api/1/journals/reports/{id}/download")
  Observable<ResponseBody> downloadJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ステータス確認
   * 
   * @param id 受け付けID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;JournalStatusResponse&gt;
   */
  @GET("api/1/journals/reports/{id}/status")
  Observable<JournalStatusResponse> getJournalStatus(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ダウンロード要求
   * 
   * @param downloadType ダウンロード形式 (required)
   * @param companyId 事業所ID (required)
   * @param visibleTags 補助科目やコメントとして出力する項目 (optional)
   * @param visibleIds 追加出力するID項目 (optional)
   * @param startDate 取得開始日 (yyyy-mm-dd) (optional)
   * @param endDate 取得終了日 (yyyy-mm-dd) (optional)
   * @return Observable&lt;JournalsResponse&gt;
   */
  @GET("api/1/journals")
  Observable<JournalsResponse> getJournals(
    @retrofit2.http.Query("download_type") String downloadType, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("visible_tags[]") List<String> visibleTags, @retrofit2.http.Query("visible_ids[]") List<String> visibleIds, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate
  );

}
