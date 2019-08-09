## 綁定線下會員卡

### [api_name]
mpay.member.card.bind
### [biz_api_code]
110120002

### [請求]
```json
{
     "biz_content":{"card_no":"10032365456565652","active_code":"X2224sj3Shjkjs334j3hjh"}
}
```

### [參數說明]
* biz_content 结构说明：
  * card_no: 會員卡卡號
  * active_code: 會員卡激活碼


### [應答]
```json
{"sign":"XXXXXXXXXXX"}
```


### [參數說明]
* Data 结构说明：

