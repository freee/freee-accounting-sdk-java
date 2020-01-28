

# ManualJournal

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 振替伝票ID | 
**companyId** | **Integer** | 事業所ID | 
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**adjustment** | **Boolean** | 決算整理仕訳フラグ（falseまたは未指定の場合: 日常仕訳） | 
**txnNumber** | **String** | 仕訳番号 | 
**details** | [**List&lt;ManualJournalDetails&gt;**](ManualJournalDetails.md) | 貸借行一覧（配列）: 貸借合わせて100行まで登録できます。 | 



