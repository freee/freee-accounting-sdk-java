package jp.co.freeee.accounting.samples.basic.web.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @SuppressWarnings("unchecked")
    @GetMapping("/")
    public String index(final Model model, @AuthenticationPrincipal final OAuth2User oauth2User) {

        if (oauth2User != null) {
            final Map<String, String> user = (Map<String, String>) oauth2User.getAttribute("user");
            model.addAttribute("username", user.get("last_name") + " " + user.get("first_name"));
        }
        return "index";
    }
}
