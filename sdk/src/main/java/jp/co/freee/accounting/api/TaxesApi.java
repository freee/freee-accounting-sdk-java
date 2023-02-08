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
   * @param displayCategory この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。税区分の表示カテゴリ（ tax_5: 5%表示の税区分、 tax_8: 8%表示の税区分、 tax_r8: 軽減税率8%表示の税区分、 tax_10: 10%表示の税区分、 tax_5_e80: インボイス経過措置5%表示80%控除の税区分、 tax_5_e50: インボイス経過措置5%表示50%控除の税区分、 tax_8_e80: インボイス経過措置8%表示80%控除の税区分、 tax_8_e50: インボイス経過措置8%表示50%控除の税区分、 tax_r8_e80: インボイス経過措置軽減税率8%表示80%控除の税区分、 tax_r8_e50: インボイス経過措置軽減税率8%表示50%控除の税区分、 tax_10_e80: インボイス経過措置10%表示80%控除の税区分、 tax_10_e50: インボイス経過措置10%表示50%控除の税区分） (optional)
   * @param available この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。税区分の使用設定。true: 使用する、false: 使用しない (optional)
   * @return Observable&lt;InlineResponse20010&gt;
   */
  @GET("api/1/taxes/companies/{company_id}")
  Observable<InlineResponse20010> getTaxesCompanies(
    @retrofit2.http.Path("company_id") Integer companyId, @retrofit2.http.Query("display_category") String displayCategory, @retrofit2.http.Query("available") Boolean available
  );

}
