import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 */

/**
 * @author ray
 * @Description JsonMaker
 * @date 2019年8月9日 下午4:07:55 
 * @Copyright 2019 MacauPass Inc. All rights reserved.
 */
public class JsonMaker {
	private static final Logger logger = LoggerFactory.getLogger(JsonMaker.class);
	/**
	 * 
	 */
	public JsonMaker() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static String mpayMemberMerchantQuery_resp(){
		JSONObject resp=new JSONObject();
		JSONObject Data=new JSONObject();
		
		JSONArray mer_list=new JSONArray();
		
		JSONObject mer_obj_1=new JSONObject();
		mer_obj_1.put("mer_app_id", "0000000001");
		mer_obj_1.put("mer_name", "澳門工會聯合總會");
		mer_obj_1.put("card_offline_bind", true);//線下會員卡綁定
		mer_obj_1.put("card_online_apply", false);//綫上會員卡申請
		
		JSONArray mer_1_card_model_list=new JSONArray();
		JSONObject mer_obj_1_card_1=new JSONObject();
		mer_obj_1_card_1.put("model_id", "0000000000001");
		mer_obj_1_card_1.put("model_name", "紅色會員卡");
		mer_obj_1_card_1.put("mer_bg", "http://pay.macaupass.com/oms/bg.png");
		mer_obj_1_card_1.put("mer_logo", "http://pay.macaupass.com/oms/logo.png");
		//mer_obj_1_card_1.put("bind_promotion_img_url", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_1_card_1.put("bind_promotion_img_link", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_1_card_1.put("bind_promotion_type", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_1_card_1.put("bind_succ_img_url", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_1_card_1.put("bind_succ_img_link", "http://pay.macaupass.com/oms/xxx.png");
		mer_1_card_model_list.add(mer_obj_1_card_1);
		mer_obj_1.put("mer_card_model_list", mer_1_card_model_list);
		
		mer_list.add(mer_obj_1);
		
		JSONObject mer_obj_2=new JSONObject();
		mer_obj_2.put("mer_app_id", "0000000002");
		mer_obj_2.put("mer_name", "澳門婦女聯合總會");
		mer_obj_2.put("card_offline_bind", true);//線下會員卡綁定
		mer_obj_2.put("card_online_apply", true);//綫上會員卡申請
		
		JSONArray mer_2_card_model_list=new JSONArray();
		JSONObject mer_obj_2_card_1=new JSONObject();
		mer_obj_2_card_1.put("model_id", "0000000000002");
		mer_obj_2_card_1.put("model_name", "藍色會員卡");
		mer_obj_2_card_1.put("mer_bg", "http://pay.macaupass.com/oms/bg.png");
		mer_obj_2_card_1.put("mer_logo", "http://pay.macaupass.com/oms/logo.png");
		//mer_obj_2_card_1.put("bind_promotion_img_url", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_2_card_1.put("bind_promotion_img_link", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_2_card_1.put("bind_promotion_type", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_2_card_1.put("bind_succ_img_url", "http://pay.macaupass.com/oms/xxx.png");
		//mer_obj_2_card_1.put("bind_succ_img_link", "http://pay.macaupass.com/oms/xxx.png");
		mer_2_card_model_list.add(mer_obj_2_card_1);
		mer_obj_2.put("mer_card_model_list", mer_2_card_model_list);
		
		mer_list.add(mer_obj_2);
		
		Data.put("mer_list", mer_list);
		Data.put("size", 2);
		resp.put("Data", Data);
		resp.put("respCode","000000");
		resp.put("respMsg","success");
		resp.put("sign","XXXXXXXXXXX");
		return resp.toJSONString();
	}
	
	private static String mpayMemberCardBind_req(){
		JSONObject req=new JSONObject();
		JSONObject biz_content=new JSONObject();
		biz_content.put("cust_id", "00000154562145");
		biz_content.put("open_app_id", "mp9x5lr2afjchrs0c0");
		
		biz_content.put("mer_card_no", "0000213465446846847");
		biz_content.put("active_code", "578652");
		biz_content.put("area", "+853");
		biz_content.put("phone_no", "66666666");
		biz_content.put("captcha", "5687");
		biz_content.put("user_name", "");
		biz_content.put("foreign_name", "");
		biz_content.put("nick_name", "");
		biz_content.put("gender", "");
		biz_content.put("cert_no", "");
		biz_content.put("brithday", "");
		
		req.put("biz_content", biz_content);
		return req.toJSONString();
	}
	
	private static String mpayMemberCardBind_resp(){
		JSONObject resp=new JSONObject();
		JSONObject Data=new JSONObject();
		Data.put("open_app_id", "mp9x5lr2afjchrs0c0");
		Data.put("mer_name", "澳門工會聯合總會");
		Data.put("card_name", "澳門工聯會員卡");
		Data.put("mer_card_no", "0000213465446846847");
		Data.put("mpay_card_no", "00164649777978789");
		Data.put("card_logo", "http://xxx.com/logo.png");
		Data.put("card_title_1", "澳門工會聯合總會");
		Data.put("card_title_color_1", "rgb(55,112,179)");
		Data.put("card_title_2", "屬下工會及機構電子會員證");
		Data.put("card_title_color_2", "rgb(55,112,179)");
		Data.put("card_no_color", "rgb(55,112,179)");
		Data.put("card_detail_bg_url", "http://xxx.com/card_detail_bg_url.png");
		Data.put("card_pack_bg_url", "http://xxx.com/card_pack_bg_url.png");
		Data.put("promotion_type", "REDPACK");
		Data.put("promotion_amt", "10");
		Data.put("promotion_img_url", "http://xxx.com/promotion_img_url.png");
		Data.put("promotion_img_link", "http://xxx.com/promotion_img_link.html");
		
		resp.put("Data", Data);
		resp.put("respCode","000000");
		resp.put("respMsg","恭喜！\n會員卡申請成功");
		resp.put("sign","XXXXXXXXXXX");
		return resp.toJSONString();
	}

	private static String mpayCaptchaUnifiedSend_req(){
		JSONObject req=new JSONObject();
		JSONObject biz_content=new JSONObject();
		biz_content.put("cust_id", "00000154562145");
		biz_content.put("phone_area", "+853");
		biz_content.put("phone_no", "66666666");
		biz_content.put("sms_type", "12");
		
		JSONObject sms_params=new JSONObject();
		sms_params.put("open_app_id", "000213655899");
		sms_params.put("mer_card_no", "000012346546779");
		biz_content.put("sms_params", sms_params);
		
		req.put("biz_content", biz_content);
		return req.toJSONString();
	}
	private static String mpayCaptchaUnifiedSend_resp(){
		JSONObject resp=new JSONObject();
		
		resp.put("Data", "");
		resp.put("respCode","000000");
		resp.put("respMsg","success");
		resp.put("sign","XXXXXXXXXXX");
		return resp.toJSONString();
		
	
	}
	
	/**
	 * @param args
	 * @author ray
	 * @date 2019年8月9日 下午4:07:55 
	 */
	public static void main(String[] args) {
		logger.info(mpayCaptchaUnifiedSend_resp());
	}

}
