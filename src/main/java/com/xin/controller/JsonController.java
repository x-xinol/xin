package com.xin.controller;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class JsonController {
    @RequestMapping("/json1")
    public String json1(){
        return "/json1";
    }


    @RequestMapping("json")
    public String json(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       @RequestParam("sex") String sex,
                       @RequestParam("age") Integer age){
        System.out.println("+++++++++++++++++++==============+++++++++++++++");
        System.out.println(username+","+password+","+sex+","+age);

//        JSONObject getjson = new JSONObject();                //创建json对象(Json数据)
//        System.out.println(getjson.get("total"));
//        JSONArray getarray = getjson.getJSONArray("rows");        //获取json中的数组（数组名）
//        for (int i = 0; i < getarray.length(); i++) {            //遍历数组
//            JSONObject sonObject = getarray.getJSONObject(i);    //获得数组中的第一个对象
//            System.out.println(sonObject.get("id"));            //根据字段名获得对象的每一个属性字段
//            System.out.println(sonObject.get("name"));
//            System.out.println(sonObject.get("readtime"));

        return "/file";
    }
}
        /**
         *       String jsonString = request().getParameter("mydata");
         *          // string转为JSONArray,从array中获取到JSONObject
         *         JSONArray jsonArray = JSONArray.fromObject(jsonString);
         *         for(int i = 0;i < jsonArray.length(); i++) {
         *             JSONObject jsonObj = jsonArray.getJSONObject(i);
         *             jsonObj.getInt("name");
         *             jsonObj.getString("age");
         *         }
         */



