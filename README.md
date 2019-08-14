# freee 会計API SDK for Java

freee 会計APIを Java で利用するための SDK です。

会計APIの詳細については、[会計API 概要 | freee Developers Community](https://developer.freee.co.jp/docs/accounting) をご参照ください。

## ステータス: WIP

本SDKは主要な機能が含まれていますが、制限およびバグがある可能性があります。また、このステータスの記載が更新されるまでは、APIは変更される可能性がありますので、ご利用の際はご留意ください。

## 目次

- [チュートリアル](#チュートリアル)
  - [前提条件](#前提条件)
  - [実行環境](#実行環境)
  - [freeeアプリストアへのアプリケーション登録](#freeeアプリストアへのアプリケーション登録)
  - [サンプルの実行方法](#サンプルの実行方法)
  - [SDKの導入方法](#SDKの導入方法) (WIP)
- [コントリビューションについて](#コントリビューションについて)
- [ライセンス](#ライセンス)

## チュートリアル

freee 会計API SDK for Java を利用する手順について記載します。

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

このリポジトリでは、Java SDK 1.8 以上を対象としています。Java SDK をお持ちでない方は、適宜インストールしてください。また、サンプルや導入方法では Spring boot (2.1.6) を利用します。

### freeeアプリストアへのアプリケーション登録

本 SDK で利用する `Client ID` および `Client Secret` を取得するため、freeeアプリストアの開発者ページでアプリケーションを登録します。

こちらの [チュートリアル | freee アプリストア](https://app.secure.freee.co.jp/developers/tutorials/2-%E3%82%A2%E3%83%97%E3%83%AA%E3%82%B1%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%E3%82%92%E4%BD%9C%E6%88%90%E3%81%99%E3%82%8B) を参考に、アプリケーションを登録して下さい。

コールバックURLは、本 SDK をローカル環境で動かす場合、`http://localhost:8080/login` を設定します。

### サンプルの実行方法

#### WebApp のサンプル

本リポジトリをクローンしたのち、PowerShell や bash などのターミナルで下記の操作を行います。

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
# パッケージをインストールする
mvn clean package

# Spring boot を起動する
mvn spring-boot:run
```

_Basic Web Sample for freee_ と書かれたページが表示されれば正常に起動できています。

`Login` ボタンをクリックすると、freeeアプリストアのアプリケーションに対して認証が行われます。初回は「アプリ連携の開始」という画面が表示されますので、内容を確認し「許可する」ボタンをクリックしてください。

正常に認証されれば、 `https://localhost:8080` にリダイレクトされます。画面にユーザー名が表示されていたり、 `User` や `Companies` というリンクを開くと、freeeの情報を取得できていることが確認できます。

### SDKの導入方法

ここでは、Spring boot プロジェクトに、本 SDK を導入する方法を説明します。

WIP

## コントリビューションについて

このプロジェクトへのコントリビューションを歓迎いたします。詳細については[コントリビューションガイド](./CONTRIBUTION_GUIDE.md)をご覧ください。

- [機能リクエスト](./CONTRIBUTION_GUIDE.md#機能リクエスト)
- [不具合報告](./CONTRIBUTION_GUIDE.md#不具合報告)
- [プルリクエストの作成について](./CONTRIBUTION_GUIDE.md#プルリクエストの作成について)

## ライセンス

ライセンスについては下記をご参照ください。

[MIT License](./LICENSE)