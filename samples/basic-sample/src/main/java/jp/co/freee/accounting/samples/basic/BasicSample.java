package jp.co.freee.accounting.samples.basic;

import java.util.List;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.api.CompaniesApi;
import jp.co.freee.accounting.api.InvoicesApi;
import jp.co.freee.accounting.api.WalletablesApi;
import jp.co.freee.accounting.models.CompaniesShowResponseCompany;
import jp.co.freee.accounting.models.Invoice;
import jp.co.freee.accounting.models.Walletable;

public class BasicSample {
    public static void main(String[] args) {

        int companyId = 0;
        String token = "";

        // クライアントの作成
        ApiClient client = new ApiClient("oauth2");
        client.setAccessToken(token);

        sample1(companyId, client);
        sample2(companyId, client);
    }

    private static void sample1(int companyId, ApiClient client) {

        // 事業所の詳細情報を取得する
        CompaniesApi companiesApi = client.createService(CompaniesApi.class);
        CompaniesShowResponseCompany company = companiesApi.getCompany(companyId, null, null, null, null, null, null, null, null).blockingSingle().getCompany();
        System.out.println("事業所名 : " + company.getDisplayName());

        // 登録されている口座の一覧を取得する
        WalletablesApi walletablesApi = client.createService(WalletablesApi.class);
        for (Walletable item : walletablesApi.getWalletables(companyId, true).blockingSingle().getWalletables()) {
            System.out.println(String.format("口座名 : %s / 登録残高 %s", item.getName(), item.getWalletableBalance()));
        }

        // 請求書の一覧を取得する
        InvoicesApi invoicesApi = client.createService(InvoicesApi.class);
        List<Invoice> invoices = invoicesApi.getInvoices(companyId, null, null, null, null, null, null, null, null, null, null, null, null).blockingSingle().getInvoices();
        for (Invoice invoice : invoices) {
            System.out.println(String.format("請求日 : %s / 合計金額 : %s", invoice.getIssueDate(), invoice.getTotalAmount()));
        }
    }

    private static void sample2(int companyId, ApiClient client) {

        // 事業所の詳細情報を取得する client.companies() .getAsync(companyId) .subscribe(r ->
        CompaniesApi companiesApi = client.createService(CompaniesApi.class);
        companiesApi
                .getCompany(companyId, null, null, null, null, null, null, null, null)
                .subscribe(c -> System.out.println(c.getCompany().getDisplayName()));

        // 登録されている口座の一覧を取得する
        WalletablesApi walletablesApi = client.createService(WalletablesApi.class);
        walletablesApi
                .getWalletables(companyId, true)
                .flatMapIterable(c -> c.getWalletables())
                .subscribe(w -> System.out.println(String.format("口座名 : %s / 登録残高 %s", w.getName(), w.getWalletableBalance())));

        // 請求書の一覧を取得する
        InvoicesApi invoicesApi = client.createService(InvoicesApi.class);
        invoicesApi
                .getInvoices(companyId, null, null, null, null, null, null, null, null, null, null, null, null)
                .flatMapIterable(c -> c.getInvoices())
                .subscribe(i -> System.out.println(String.format("請求日 : %s / 合計金額 : %s", i.getIssueDate(), i.getTotalAmount())));
    }
}
