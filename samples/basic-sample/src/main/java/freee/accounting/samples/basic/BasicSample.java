package freee.accounting.samples.basic;

import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.credentials.TokenCredentials;
import com.microsoft.rest.serializer.JacksonAdapter;

import jp.co.freee.accounting.AccountingClient;
import jp.co.freee.accounting.implementation.AccountingClientImpl;
import jp.co.freee.accounting.models.CompaniesShowResponseCompany;
import jp.co.freee.accounting.models.Invoice;
import jp.co.freee.accounting.models.InvoicesIndexResponse;
import jp.co.freee.accounting.models.WalletablesIndexResponseWalletablesItem;

public class BasicSample {
    public static void main(String[] args) {

        int companyId = 0;
        String token = "";

        // クライアントの作成
        TokenCredentials credentials = new TokenCredentials(null, token);
        RestClient restClient = new RestClient.Builder()
                .withBaseUrl(AccountingClient.DEFAULT_BASE_URL)
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .withCredentials(credentials)
                .build();

        AccountingClient client = new AccountingClientImpl(restClient);

        sample1(companyId, client);

        sample2(companyId, client);

    }

    private static void sample1(int companyId, AccountingClient client) {

        // 事業所の詳細情報を取得する
        CompaniesShowResponseCompany company = client.companies().get(companyId).company();
        System.out.println("事業所名 : " + company.displayName());

        // 登録されている口座の一覧を取得する
        for (WalletablesIndexResponseWalletablesItem item : client.walletables().list(companyId).walletables()) {
            System.out.println(String.format("口座名 : %s / 登録残高 %s", item.name(), item.walletableBalance()));
        }

        // 請求書の一覧を取得する
        InvoicesIndexResponse invoicesIndex = client.invoices().list(companyId);

        for (Invoice invoice : invoicesIndex.invoices()) {
            System.out.println(String.format("売上計上日 : %s / 合計金額 : %s", invoice.bookingDate(), invoice.totalAmount()));
        }
    }

    private static void sample2(int companyId, AccountingClient client) {

        // 事業所の詳細情報を取得する
        client.companies()
                .getAsync(companyId)
                .subscribe(r -> System.out.println("事業所名 : " + r.company().displayName()));

        // 登録されている口座の一覧を取得する
        client.walletables()
                .listAsync(companyId)
                .flatMapIterable(r -> r.walletables())
                .subscribe(w -> System.out.println(String.format("口座名 : %s / 登録残高 %s", w.name(), w.walletableBalance())));

        // 請求書の一覧を取得する
        client.invoices()
                .listAsync(companyId)
                .flatMapIterable(r -> r.invoices())
                .subscribe(i -> System.out.println(String.format("売上計上日 : %s / 合計金額 : %s", i.bookingDate(), i.totalAmount())));
    }

}
