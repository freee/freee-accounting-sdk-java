package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.CompanyIndexResponse;
import jp.co.freee.accounting.models.CompanyResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CompaniesApi {
  /**
   * 事業所一覧の取得
   * 
   * @return Observable&lt;CompanyIndexResponse&gt;
   */
  @GET("api/1/companies")
  Observable<CompanyIndexResponse> getCompanies();
    

  /**
   * 事業所の詳細情報の取得
   * 
   * @param id 事業所ID (required)
   * @param details 取得情報に勘定科目・税区分コード・税区分・品目・取引先・部門・メモタグ・口座の一覧を含める (optional)
   * @param accountItems 取得情報に勘定科目一覧を含める (optional)
   * @param taxes 取得情報に税区分コード・税区分一覧を含める (optional)
   * @param items 取得情報に品目一覧を含める (optional)
   * @param partners 取得情報に取引先一覧を含める (optional)
   * @param sections 取得情報に部門一覧を含める (optional)
   * @param tags 取得情報にメモタグ一覧を含める (optional)
   * @param walletables 取得情報に口座一覧を含める (optional)
   * @return Observable&lt;CompanyResponse&gt;
   */
  @GET("api/1/companies/{id}")
  Observable<CompanyResponse> getCompany(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("details") Boolean details, @retrofit2.http.Query("account_items") Boolean accountItems, @retrofit2.http.Query("taxes") Boolean taxes, @retrofit2.http.Query("items") Boolean items, @retrofit2.http.Query("partners") Boolean partners, @retrofit2.http.Query("sections") Boolean sections, @retrofit2.http.Query("tags") Boolean tags, @retrofit2.http.Query("walletables") Boolean walletables
  );

}
