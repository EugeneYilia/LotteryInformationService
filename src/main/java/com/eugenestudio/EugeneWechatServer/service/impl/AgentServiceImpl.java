package com.eugenestudio.EugeneWechatServer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.eugenestudio.EugeneWechatServer.service.AgentService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

@Service("agentService")
public class AgentServiceImpl implements AgentService {
    @Override
    public String getOpenid(String sourceUrl) {
        String content = "";
        try {
            URL url = new URL(sourceUrl);
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder("");
            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(readLine);
            }
            content = stringBuilder.toString();
            //System.out.println("content->" + content);
            JSONObject jsonObject = JSONObject.parseObject(content);
            //System.out.println("jsonObject->" + jsonObject);
            content = jsonObject.getString("openid");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
