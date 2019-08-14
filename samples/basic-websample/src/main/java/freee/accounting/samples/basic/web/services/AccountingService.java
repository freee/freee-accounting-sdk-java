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

import jp.co.freee.accounting.AccountingClient;
import jp.co.freee.accounting.AccountingClientFactory;
import jp.co.freee.accounting.models.ListOKResponseCompaniesItem;
import jp.co.freee.accounting.models.UsersMeResponseUser;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AccountingService {

    private AccountingClient _accountingClient;

    public AccountingService() {
    }

    @PostConstruct
    public void init() {
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) ((OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication()).getDetails();
        _accountingClient = AccountingClientFactory.create(details.getTokenValue());
    }

    public UsersMeResponseUser getUserInfo() {
        return _accountingClient.users().getMe().user();
    }

    public List<ListOKResponseCompaniesItem> getCompanies() {
        return _accountingClient.companies().list().companies();
    }
}