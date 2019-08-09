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

	/**
	 * @param args
	 * @author ray
	 * @date 2019年8月9日 下午4:07:55 
	 */
	public static void main(String[] args) {
		logger.info(mpayMemberMerchantQuery_resp());
	}

}
