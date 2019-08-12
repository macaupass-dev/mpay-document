## 获取綫上會員卡商戶列表

### [api_name]
mpay.member.merchant.query
### [biz_api_code]
110120001

### [請求]
```json
{
     "biz_content":{}
}
```

### [參數說明]
* biz_content 结构说明：


### [應答]
```json
{

    "sign":"XXXXXXXXXXX",
    "respCode":"000000",
    "Data": {
        "mer_list":[ {
            "mer_card_model_list":[ {
                "mer_logo": "http://pay.macaupass.com/oms/logo.png", "model_id":"0000000000001", "mer_bg":"http://pay.macaupass.com/oms/bg.png", "model_name":"紅色會員卡"
            }
            ],
            "card_offline_bind":true,
            "mer_name":"澳門工會聯合總會",
            "mer_app_id":"0000000001",
            "card_online_apply":false
        }
        ,
            {
            "mer_card_model_list":[ {
                "mer_logo": "http://pay.macaupass.com/oms/logo.png", "model_id":"0000000000002", "mer_bg":"http://pay.macaupass.com/oms/bg.png", "model_name":"藍色會員卡"
            }
            ],
            "card_offline_bind":true,
            "mer_name":"澳門婦女聯合總會",
            "mer_app_id":"0000000002",
            "card_online_apply":true
        }
        ],
        "size":2
    }
    ,
    "respMsg":"success"
}
```


### [參數說明]
* Data 结构说明：
  * mer_list:有會員卡業務的商戶列表
   * mer_app_id: 商戶APP_ID
   * mer_name:商戶名稱
   * card_offline_bind: 線下會員卡綁定按鈕是否可用
   * card_online_apply: 綫上申請會員卡按鈕是否可用
   * mer_card_model_list: 卡模板列表
    * model_id:會員卡模板ID
    * model_name: 會員卡模板名
    * mer_logo:商戶LOGO（中間頁）
    * mer_bg:商戶背景圖
  * size:商戶列表總數