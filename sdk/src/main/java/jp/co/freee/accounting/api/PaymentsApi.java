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
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PaymentParams;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PaymentsApi {
  /**
   * 取引（収入／支出）の支払行作成
   * 
   * @param id 取引ID (required)
   * @param paymentParams 取引（収入／支出）の支払行作成 (required)
   * @return Observable&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/deals/{id}/payments")
  Observable<DealResponse> createDealPayment(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PaymentParams paymentParams
  );

  /**
   * 取引（収入／支出）の支払行削除
   * 
   * @param id 取引ID (required)
   * @param paymentId 決済ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/deals/{id}/payments/{payment_id}")
  Completable destroyDealPayment(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("payment_id") Long paymentId, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（収入／支出）の支払行更新
   * 
   * @param id 取引ID (required)
   * @param paymentId 決済ID (required)
   * @param paymentParams 取引（収入／支出）の支払行更新 (required)
   * @return Observable&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/deals/{id}/payments/{payment_id}")
  Observable<DealResponse> updateDealPayment(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("payment_id") Long paymentId, @retrofit2.http.Body PaymentParams paymentParams
  );

}
