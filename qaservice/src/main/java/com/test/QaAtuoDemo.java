package com.test;

import com.Ziroom.qa.utils.HttpRequest;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwei on 2019/8/8
 **/

public class QaAtuoDemo {
    /*
     * 获取districtName值
     * @return 返回结果
     * @author zhangwei
     * **/

    HttpRequest httpRequest = new HttpRequest();

    public JSONObject getDistrictName(){
        String url = "http://zrbd.t.ziroom.com/webBuilding/webBuilding!getBlockInfoByBlockId.do";
        Map<String,String> map = new HashMap<>();
        map.put("resblockId","1111027373682");
        JSONObject response = httpRequest.postParasReturnJson(url,map);
        String returnValue = response.getString("returnValue");
        JSONObject returnValueJson = JSONObject.fromObject(returnValue);
        String data = returnValueJson.getString("data");
        JSONObject dataJson = JSONObject.fromObject(data);
        String districtName = dataJson.getString("districtName");
        System.out.println("================================");
        System.out.println(districtName);
        System.out.println("================================");
        return response;
    }
}
