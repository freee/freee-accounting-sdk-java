package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SegmentTagParams;
import jp.co.freee.accounting.models.SegmentTagsIndexResponse;
import jp.co.freee.accounting.models.SegmentTagsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentTagsApi
 */
public class SegmentTagsApiTest {

    private SegmentTagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SegmentTagsApi.class);
    }

    /**
     * セグメントの作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
     */
    @Test
    public void createSegmentTagTest() {
        Integer segmentId = null;
        SegmentTagParams parameters = null;
        // SegmentTagsResponse response = api.createSegmentTag(segmentId, parameters);

        // TODO: test validations
    }
    /**
     * セグメントタグの削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
     */
    @Test
    public void destroySegmentsTagTest() {
        Integer segmentId = null;
        Integer id = null;
        Integer companyId = null;
        // api.destroySegmentsTag(segmentId, id, companyId);

        // TODO: test validations
    }
    /**
     * セグメントタグ一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグ一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
     */
    @Test
    public void getSegmentTagsTest() {
        Integer segmentId = null;
        Integer companyId = null;
        Integer offset = null;
        Integer limit = null;
        // SegmentTagsIndexResponse response = api.getSegmentTags(segmentId, companyId, offset, limit);

        // TODO: test validations
    }
    /**
     * セグメントタグの更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
     */
    @Test
    public void updateSegmentTagTest() {
        Integer segmentId = null;
        Integer id = null;
        SegmentTagParams parameters = null;
        // SegmentTagsResponse response = api.updateSegmentTag(segmentId, id, parameters);

        // TODO: test validations
    }
}
