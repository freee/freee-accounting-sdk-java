package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.RenewCreateParams;
import jp.co.freee.accounting.models.RenewUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RenewsApi {
  /**
   * 取引（収入／支出）に対する+更新の作成
   * 
   * @param id 取引ID (required)
   * @param renewCreateParams 取引（収入／支出）に対する+更新の情報 (required)
   * @return Observable&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/deals/{id}/renews")
  Observable<DealResponse> createDealRenew(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RenewCreateParams renewCreateParams
  );

  /**
   * 取引（収入／支出）の+更新の削除
   * 
   * @param id 取引ID (required)
   * @param renewId +更新ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;DealResponse&gt;
   */
  @DELETE("api/1/deals/{id}/renews/{renew_id}")
  Observable<DealResponse> deleteDealRenew(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("renew_id") Integer renewId, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（収入／支出）の+更新の更新
   * 
   * @param id 取引ID (required)
   * @param renewId +更新ID (required)
   * @param renewUpdateParams +更新の更新情報 (required)
   * @return Observable&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/deals/{id}/renews/{renew_id}")
  Observable<DealResponse> updateDealRenew(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("renew_id") Integer renewId, @retrofit2.http.Body RenewUpdateParams renewUpdateParams
  );

}
