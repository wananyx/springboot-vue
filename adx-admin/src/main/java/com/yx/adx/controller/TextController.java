package com.yx.adx.controller;

import com.yx.adx.domian.Text;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TextController {

    @GetMapping("/text2")
    public List text(){
        List<Object> result = new ArrayList<>();
        List<Object> result1 = new ArrayList<>();
        //请求的输入流
        InputStream inputStream = this.getClass().getResourceAsStream("/static/1234.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        //输入流的缓冲
        StringBuffer sb = new StringBuffer();
        int i = 0;
        try {
            String str = null;
            //一行一行进行读入
            List<Text> list = new ArrayList<>();
            while ((str = in.readLine()) != null) {
                String[] ss = str.split(";");
                result1.add(i+"个数组个数为"+ss.length);
                Text text = new Text(ss[0], ss[1]);
                list.add(text);
                i++;
                if(i%4==0){
                    result.add(list);
                    list = new ArrayList<>();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close(); //关闭流
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;

    }

}
