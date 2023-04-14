# このSDKはこれまで定期的にメンテナンスをしていましたが、2023年4月に定期的なメンテナンスを終了しました。 詳細は「[freee会計 Public APIに関するSDKのメンテナンス終了、およびスキーマのymlファイルでの公開終了について](https://developer.freee.co.jp/news/6263)」をご覧ください。

# 会計freee Java SDK

会計freee APIを Java で利用するための SDK です。

会計freee APIの詳細については、[会計API 概要 | freee Developers Community](https://developer.freee.co.jp/docs/accounting) をご参照ください。

このSDKは、リリースバージョンによって、内部で利用するAPIバージョンが異なります。

- 2.0.0 以降 - 会計freee APIの新しいAPIバージョン(v2020-06-15)に対応しています。
- 2.0.0 未満 - 会計freee APIの古いAPIバージョンを利用しています。古いAPIの提供終了に伴い、2020年12月以降に利用不可となります。

## 目次

- [チュートリアル](#チュートリアル)
  - [前提条件](#前提条件)
  - [実行環境](#実行環境)
  - [freeeアプリストアへのアプリケーション登録](#freeeアプリストアへのアプリケーション登録)
  - [サンプルの実行方法](#サンプルの実行方法)
  - [SDKの導入方法](#SDKの導入方法)
- [コントリビューションについて](#コントリビューションについて)
- [ライセンス](#ライセンス)

## チュートリアル

会計freee Java SDK を利用する手順について記載します。

### 前提条件

本SDKを利用する前に下記をご確認ください。

- freee 本体のアカウントがあること
- Java の基礎について理解があること

freee 本体のアカウントは、後述する [freeeアプリストアへのアプリケーション登録](#freeeアプリストアへのアプリケーション登録) で必要になります。

freee API に関しては、[チュートリアルガイド](https://app.secure.freee.co.jp/developers/tutorials/1-freee%20API%E3%82%92%E5%A7%8B%E3%82%81%E3%82%8B#freee%20API%E3%82%92%E5%A7%8B%E3%82%81%E3%82%8B) をご参照ください。

なお、本リポジトリでは本SDKを利用する際に必要な情報を掲載するにとどめ、Java の言語自体の解説やサンプルで扱う Sptring boot に関する詳細は記載いたしません。それぞれ公式情報などをご参照くださいませ。

### 実行環境

このリポジトリは以下の環境を想定しています。

- Java SDK 1.8 以上
- Maven

このリポジトリでは、Java SDK 1.8 以上を対象としています。Java SDK をお持ちでない方は、適宜インストールしてください。また、サンプルや導入方法では Spring Boot (執筆時点のバージョン 2.1.12) を利用します。

### freeeアプリストアへのアプリケーション登録

本 SDK で利用する `Client ID` および `Client Secret` を取得するため、freeeアプリストアの開発者ページでアプリケーションを登録します。

こちらの [チュートリアル | freee アプリストア](https://app.secure.freee.co.jp/developers/tutorials/2-%E3%82%A2%E3%83%97%E3%83%AA%E3%82%B1%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%E3%82%92%E4%BD%9C%E6%88%90%E3%81%99%E3%82%8B) を参考に、アプリケーションを登録して下さい。

コールバックURLは、本 SDK をローカル環境で動かす場合、`http://localhost:8080/login` を設定します。

### サンプルの実行方法

#### WebApp のサンプル

WebApp のサンプルは Spring Boot を使用したウェブアプリです。本リポジトリをクローンしたのち、PowerShell や bash などのターミナルで下記の操作を行います。

```powershell
# クローンしたディレクトリへ移動する
cd <freee-accounting-sdk-javaのクローン先ディレクトリ>

# サンプルのディレクトリに移動する
cd samples/basic-websample

# サンプルをコピーして設定ファイルを用意する
cp src/main/resources/application.sample.yml src/main/resources/application.yml
```

`src\main\resources\application.yml` の `security.oauth2.client` の `client-id` と `client-secret` に、前述の [freeeアプリストアへのアプリケーション登録](#freeeアプリストアへのアプリケーション登録) で取得した `Client ID` と `Client Secret` を設定する

```yaml
security:
  oauth2:
    client:
      client-id: <<set your client id>>
      client-secret: <<set your client secret>>
```

`application.yml` を編集できたら、ターミナルで下記を実行し `http://localhost:8080` を開きます。

```powershell
# パッケージを作成する
mvn clean package

# Spring Boot を起動する
mvn spring-boot:run
```

_Basic Web Sample for freee_ と書かれたページが表示されれば正常に起動できています。

`Login` ボタンをクリックすると、freeeアプリストアのアプリケーションに対して認証が行われます。初回は「アプリ連携の開始」という画面が表示されますので、内容を確認し「許可する」ボタンをクリックしてください。

正常に認証されれば、 `https://localhost:8080` にリダイレクトされます。画面にユーザー名が表示されていたり、 `User` や `Companies` というリンクを開くと、freeeの情報を取得できていることが確認できます。

### SDKの導入方法

Spring Boot プロジェクトに、本 SDK を導入する方法を説明します。

大まかな作業は以下のとおりです。

- Spring Boot のプロジェクトを構成する
- コンフィグレーションを設定する
- アプリケーションクラスを構成する
- 本 SDK を利用するためのサービスを作成する
- コントローラおよびビューを作成する
- 動作確認
- (オプション) Principal をカスタマイズする

なお、ここでは、下記の記事を参考にすすめます。

- [Getting Started · Securing a Web Application](https://spring.io/guides/gs/securing-web/)
- [Tutorial · Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
- [OAuth 2 Developers Guide - Spring Security OAuth](https://projects.spring.io/spring-security-oauth/docs/oauth2.html)
- [Thymeleaf + Spring Security integration basics - Thymeleaf](https://www.thymeleaf.org/doc/articles/springsecurity.html)

#### Spring Boot のプロジェクトを構成する

それではまず、プロジェクトを構成しましょう。ここでは [Spring Initializr](https://start.spring.io/) で構成した Spring Boot のプロジェクトを例に説明します。ご自身のプロジェクトに導入する場合は、適宜読み替えてください。

Spring Initializr で構成する場合は、下記の Dependencies を選択してプロジェクトを作成してください。既存のプロジェクトの場合は、下記に該当するパッケージを追加してください。

- Spring Web (`spring-boot-starter-web`)
- Spring Security (`spring-boot-starter-security`)
- OAuth2 client (`spring-boot-starter-oauth2-client`)
- Thymeleaf (`spring-boot-starter-thymeleaf`)

さらに下記の Dependencies を追加してください。
```xml
<dependencies>

    <!-- 省略 -->

    <dependency>
        <groupId>org.springframework.security.oauth.boot</groupId>
        <artifactId>spring-security-oauth2-autoconfigure</artifactId>
        <version>2.1.12.RELEASE</version> <!-- Spring Boot のバージョンに合わせてください -->
    </dependency>
    <dependency>
        <groupId>org.thymeleaf.extras</groupId>
        <artifactId>thymeleaf-extras-springsecurity5</artifactId>
    </dependency>
    <dependency>
        <groupId>jp.co.freee</groupId>
        <artifactId>freee-accounting-sdk</artifactId>
        <version>2.0.0-beta</version>
    </dependency>
</dependencies>
```

#### コンフィグレーションを設定する

つぎに、コンフィグレーションを設定します。 `src/main/resources` 配下に `application.properties` または `application.yml` を作成し、下記に該当する設定を記述します。下記は `application.yml` における例です。

`<<set your client id>>` および `<<set your client secret>>` は、それぞれ前述の freee アプリケーション登録で取得した `client-id` と `client-secret` を設定してください。

```yaml
server:
  port: 8080
security:
  oauth2:
    client:
      client-id: <<set your client id>>
      client-secret: <<set your client secret>>
      access-token-uri: https://accounts.secure.freee.co.jp/public_api/token
      user-authorization-uri: https://accounts.secure.freee.co.jp/public_api/authorize
      client-authentication-scheme: form
    resource:
      user-info-uri: https://api.freee.co.jp/api/1/users/me
      prefer-token-info: false
    sso:
      login-path: /login
```

#### アプリケーションクラスを構成する

つぎに、アプリケーションクラスを設定します。 `@SpringBootApplication` アノテーションを付与したアプリケーションクラスを以下を参考に編集してください。

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// -- ★1. ここから --
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// -- ★1. ここまで追加 --

@SpringBootApplication
// -- ★2. ここから --
@EnableWebSecurity
@EnableOAuth2Sso
// -- ★2. ここまで追加 --
public class DemoApplication extends WebSecurityConfigurerAdapter {  // -- ★3. WebSecurityConfigurerAdapter を extends する

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // -- ★4. ここから --
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .antMatcher("/**")
            .authorizeRequests()
            .antMatchers("/", "/login**", "/webjars/**", "/error**")
            .permitAll()
            .anyRequest()
            .authenticated();
        http
            .logout()
            .logoutSuccessUrl("/")
            .permitAll();
    }
    // -- ★4. ここまで追加 --
}
```

#### 本 SDK を利用するためのサービスを作成する

つぎに、サービスを作成します。下記を参考に `services/AccountingService.java` として、本 SDK を扱うサービスを作成します。下記では、ユーザー情報を取得する `getUserInfo()` や、企業情報を取得する `getCompanies()` を実装しています。

`src/main/java/com/example/demo/services/AccountingService.java`
```java
package com.example.demo.services;

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
import jp.co.freee.accounting.models.CompaniesIndexResponseCompanies;
import jp.co.freee.accounting.models.UsersMeResponseUser;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AccountingService {

    private ApiClient _apiClient;

    public AccountingService() {
    }

    @PostConstruct
    public void init() {
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) ((OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication()).getDetails();
        _apiClient = new ApiClient("oauth2");
        String token = details.getTokenValue();
        _apiClient.setAccessToken(token);
    }

    public UsersMeResponseUser getUserInfo() {
        UsersApi api = _apiClient.createService(UsersApi.class);
        return api.getUsersMe(null).blockingSingle().getUser();
    }

    public List<CompaniesIndexResponseCompanies> getCompanies() {
        CompaniesApi api = _apiClient.createService(CompaniesApi.class);
        return api.getCompanies().blockingSingle().getCompanies();
    }
}
```

#### コントローラおよびビューを作成する

最後に、コントローラおよびビューを作成しましょう。

まずログイン状態によって表示を変えるトップページを作成しましょう。

`src/main/java/com/example/demo/controller/HomeController.java`
```java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
```

`src/main/resources/templates/home.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/extras/spring-security">

  <head>
    <meta charset="utf-8">
    <title>Home</title>
  </head>

  <body>
    <h1>Home</h1>
    <div sec:authorize="isAuthenticated()">
      <h3 sec:authentication="name"></h3>
      <ul>
        <li><a href="/user">User</a></li>
      </ul>
      <ul>
        <li><a href="/companies">Companies</a></li>
      </ul>
    </div>
    <div>
      <div sec:authorize="!isAuthenticated()">
        <a href="/login">Login</a>
      </div>
      <div sec:authorize="isAuthenticated()">
        <form role="form" id="logout" th:action="@{/logout}" method="post">
          <button type="submit">Logout</button>
        </form>
      </div>
    </div>
  </body>

</html>
```

次に `/user` と `/companies` ページ作成します。

`src/main/java/com/example/demo/controller/FreeeController.java`
```java
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.services.AccountingService;

@Controller
public class FreeeController {

    @Autowired
    private AccountingService _accountingService;

    @GetMapping("/user")
    public ModelAndView user() {
        return new ModelAndView("user", "user", _accountingService.getUserInfo());
    }

    @GetMapping("/companies")
    public ModelAndView companies() {
        return new ModelAndView("companies", "companies", _accountingService.getCompanies());
    }
}
```

`src/main/resources/templates/user.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/extras/spring-security">

  <head>
    <meta charset="utf-8">
    <title>User</title>
  </head>

  <body>
    <h1>User Information</h1>
    <div>
      <table>
        <thead>
          <tr>
            <th>Attribute</th>
            <th>Value</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>id</td>
            <td th:text=${user.getId()}></td>
          </tr>
          <tr>
            <td>email</td>
            <td th:text=${user.getEmail()}></td>
          </tr>
          <tr>
            <td>displayName</td>
            <td th:text=${user.getDisplayName()}></td>
          </tr>
          <tr>
            <td>lastName</td>
            <td th:text=${user.getLastName()}></td>
          </tr>
          <tr>
            <td>firstName</td>
            <td th:text=${user.getFirstName()}></td>
          </tr>
        </tbody>
      </table>
    </div>
  </body>

</html>
```

`src/main/resources/templates/companies.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/extras/spring-security">

  <head>
    <meta charset="utf-8">
    <title>Companies</title>
  </head>

  <body>
    <h1>Companies Information</h1>
    <div>
      <table>
        <tbody th:each="company : ${companies}">
        <tr>
          <td th:text="${company.getId()}"></td>
          <td th:text="${company.getDisplayName()}"></td>
        </tr>
        </tbody>
      </table>
    </div>
  </body>

</html>
```

#### 動作確認

ここまで準備ができたら、アプリケーションを起動してみましょう。ターミナルで下記を実行し、 `https://localhost:8080` を開きます。

```powershell
# パッケージをインストールする
mvn clean package

# Spring Boot を起動する
mvn spring-boot:run
```

正常に動作していれば、 `Login` というリンクからログインができます。すると、ユーザー情報や `/user`, `/companies` へのリンクが表示されるようになり、それぞれのページでも情報が取得できていることを確認できます。

停止するときは、ターミナルで `Ctrl + C` を入力してください。

#### (オプション) Principal をカスタマイズする

さて、前述までの作業では、トップページに表示されるユーザー情報が JSON 形式で表示され扱いにくいものになっています。そこで、 Principal を編集してみましょう。下記のように `PrincipalExtractor` を実装します。

`src/main/java/com/example/demo/FreeePrincipalExtractor.java`
```java
package com.example.demo;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class FreeePrincipalExtractor implements PrincipalExtractor {

    @Override
    @SuppressWarnings("unchecked")
    public Object extractPrincipal(Map<String, Object> map) {
        Map<String, ?> user = (Map<String, ?>) map.get("user");
        return user.get("last_name") + " " + user.get("first_name");
    }
}
```

そして、アプリケーションクラスに、下記のように Bean 設定を追加します。

```java
// -- ★5. ここから --
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
// -- ★5. ここまでの import を追加する

// -- 中略 --

@SpringBootApplication
@EnableOAuth2Sso
public class DemoApplication extends WebSecurityConfigurerAdapter {
    // -- 中略 --

    // -- ★6. ここから --
    @Bean
    public PrincipalExtractor freeePrincipalExtractor() {
        return new FreeePrincipalExtractor();
    }
    // -- ★6. ここまで追加する --
}
```

これで再度ターミナルで下記を実行し、アプリケーションを実行しましょう。 `https://localhost:8080` を開きログインすると、ユーザー情報が JSON ではなく、 `FreeePrincipalExtractor` で実装したように、姓と名がスペースで結合されて表示されていることを確認できます。

```powershell
# Spring Boot を起動する
mvn spring-boot:run
```
### basic-websample-rxについて

チュートリアルで紹介した`basic-websample` を `Sprint WebFlux` と `Spring Security`で再実装したものです。コールバックURLを、`http://localhost:8080/login/oauth2/code/freee`に変更すれば実行できます。


## コントリビューションについて

このプロジェクトへのコントリビューションを歓迎いたします。詳細については[コントリビューションガイド](./CONTRIBUTION_GUIDE.md)をご覧ください。

- [機能リクエスト](./CONTRIBUTION_GUIDE.md#機能リクエスト)
- [不具合報告](./CONTRIBUTION_GUIDE.md#不具合報告)
- [プルリクエストの作成について](./CONTRIBUTION_GUIDE.md#プルリクエストの作成について)

## ライセンス

ライセンスについては下記をご参照ください。

[MIT License](./LICENSE)
