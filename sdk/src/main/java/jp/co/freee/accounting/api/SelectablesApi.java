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
import jp.co.freee.accounting.models.SelectablesIndexResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelectablesApi {
  /**
   * フォーム用選択項目情報の取得
   * 
   * @param companyId 事業所ID (required)
   * @param includes 取得する項目(項目: account_item) (optional)
   * @return Observable&lt;SelectablesIndexResponse&gt;
   */
  @GET("api/1/forms/selectables")
  Observable<SelectablesIndexResponse> getFormsSelectables(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("includes") String includes
  );

}
