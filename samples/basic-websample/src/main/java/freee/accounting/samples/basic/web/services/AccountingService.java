package freee.accounting.samples.basic.web.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.api.CompaniesApi;
import jp.co.freee.accounting.api.UsersApi;
import jp.co.freee.accounting.api.InvoicesApi;
import jp.co.freee.accounting.models.CompanyIndexResponseCompanies;
import jp.co.freee.accounting.models.MeResponseUser;
import jp.co.freee.accounting.models.Invoice;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AccountingService {

    private ApiClient _apiClient;
    private String _token;

    public AccountingService() {
    }

    @PostConstruct
    public void init() {
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) ((OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication()).getDetails();
        _apiClient = new ApiClient("oauth2");
        _token = details.getTokenValue();
        _apiClient.setAccessToken(_token);
    }

    public MeResponseUser getUserInfo() {
        UsersApi api = _apiClient.createService(UsersApi.class);
        return api.getUsersMe(null).blockingSingle().getUser();
    }

    public List<CompanyIndexResponseCompanies> getCompanies() {
        CompaniesApi api = _apiClient.createService(CompaniesApi.class);
        return api.getCompanies().blockingSingle().getCompanies();
    }

    public List<Invoice> getInvoices(Integer companyId) {
        InvoicesApi api = _apiClient.createService(InvoicesApi.class);
        return api.getInvoices(companyId, null, null, null, null, null, null, null, null, null, null, null, null).blockingSingle().getInvoices();
    }

    public String getToken() {
        return _token;
    }
}