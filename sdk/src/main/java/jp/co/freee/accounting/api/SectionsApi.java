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
import jp.co.freee.accounting.models.InlineResponse2009;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SectionParams;
import jp.co.freee.accounting.models.SectionResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SectionsApi {
  /**
   * 部門の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 
   * @param sectionParams 部門の作成 (optional)
   * @return Observable&lt;SectionResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/sections")
  Observable<SectionResponse> createSection(
    @retrofit2.http.Body SectionParams sectionParams
  );

  /**
   * 部門の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を削除する&lt;/p&gt;
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/sections/{id}")
  Completable destroySection(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を参照する&lt;/p&gt;&lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 
   * @param id 部門ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;SectionResponse&gt;
   */
  @GET("api/1/sections/{id}")
  Observable<SectionResponse> getSection(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 部門一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/sections?company_id&#x3D;1&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;sections&amp;quot; : [     {       &amp;quot;id&amp;quot; : 101,       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,       &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,       &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,       &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,       &amp;quot;indent_count&amp;quot;: 1,       &amp;quot;parent_id&amp;quot;: 11     },     ...   ] } // それ以外のプラン {   &amp;quot;sections&amp;quot; : [     {       &amp;quot;id&amp;quot; : 101,       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,       &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,       &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,       &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;     },     ...   ] }&lt;/code&gt;&lt;/pre&gt; 
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse2009&gt;
   */
  @GET("api/1/sections")
  Observable<InlineResponse2009> getSections(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 部門の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を更新する&lt;/p&gt;&lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 
   * @param id  (required)
   * @param sectionParams 部門の更新 (optional)
   * @return Observable&lt;SectionResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/sections/{id}")
  Observable<SectionResponse> updateSection(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SectionParams sectionParams
  );

}
