package jp.co.freeee.accounting.samples.basic.web.controller;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.api.CompaniesApi;
import jp.co.freee.accounting.api.UsersApi;

@Controller
public class FreeeController {

    @GetMapping("/user")
    public String user(final Model model, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient) {
        UsersApi api = createService(UsersApi.class, authorizedClient);
        model.addAttribute("response", api.getUsersMe(false).singleOrError());
        return "user";
    }

    @GetMapping("/companies")
    public String companies(final Model model, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient) {
        CompaniesApi api = createService(CompaniesApi.class, authorizedClient);
        model.addAttribute("response", api.getCompanies().singleOrError());
        return "companies";
    }

    @GetMapping("/token")
    public String token(final Model model, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient) {
        model.addAttribute("token", authorizedClient.getAccessToken().getTokenValue());
        return "token";
    }

    public <S> S createService(Class<S> serviceClass, OAuth2AuthorizedClient authorizedClient) {
        ApiClient client = new ApiClient("oauth2").setAccessToken(authorizedClient.getAccessToken().getTokenValue());
        return client.createService(serviceClass);
    }
}