package com.eugenestudio.EugeneWechatServer.controller;

import com.alibaba.fastjson.JSONObject;
import com.eugenestudio.EugeneWechatServer.service.AgentService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.naming.MalformedLinkException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

@Controller("agentController")
public class AgentController {

    @Autowired
    @Resource(name = "agentService")
    private AgentService agentService;

    @RequestMapping(value = "/getOpenid")
    public void getOpenid(@RequestBody Map<String, Object> requestMap) {
        try {
            String sourceUrl = requestMap.get("url").toString();
            URL url = new URL(sourceUrl);
            String content;
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder("");
            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(readLine);
            }
            content = stringBuilder.toString();
            JSONObject jsonObject = JSONObject.parseObject(content);
            System.out.println(jsonObject);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
