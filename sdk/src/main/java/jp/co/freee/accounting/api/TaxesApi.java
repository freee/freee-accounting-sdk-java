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
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20010;
import jp.co.freee.accounting.models.InlineResponse2009;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TaxResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TaxesApi {
  /**
   * 税区分コードの取得
   * 
   * @param code 税区分コード (required)
   * @return Observable&lt;TaxResponse&gt;
   */
  @GET("api/1/taxes/codes/{code}")
  Observable<TaxResponse> getTaxCode(
    @retrofit2.http.Path("code") Integer code
  );

  /**
   * 税区分コード一覧の取得
   * 
   * @return Observable&lt;InlineResponse2009&gt;
   */
  @GET("api/1/taxes/codes")
  Observable<InlineResponse2009> getTaxCodes();
    

  /**
   * 税区分コード詳細一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse20010&gt;
   */
  @GET("api/1/taxes/companies/{company_id}")
  Observable<InlineResponse20010> getTaxesCompanies(
    @retrofit2.http.Path("company_id") Integer companyId
  );

}
