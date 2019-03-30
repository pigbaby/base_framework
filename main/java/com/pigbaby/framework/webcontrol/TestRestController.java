package com.pigbaby.framework.webcontrol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestRestController
 */
@RestController
public class TestRestController {

    @RequestMapping("/TestJson")
    public String testRestControl() {
        String content="";
        try {
            System.out.println(ResourceUtils.getURL("classpath:"));
            File file = new File (ResourceUtils.getURL("classpath:").getPath()+"/static/JSon/testjson.json");
            
            FileInputStream fiOS=new FileInputStream(file);
            BufferedReader buffReader=new BufferedReader(new InputStreamReader(fiOS));
            String eachLine;
            
            eachLine=buffReader.readLine();
            while(eachLine!=null){
                content=content+eachLine;
                eachLine=buffReader.readLine();
            }
            buffReader.close();
            fiOS.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        return content;
    }
}