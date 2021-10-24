package com.zhou.mymallthirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MymallThirdPartyApplicationTests {
        @Autowired
        OSSClient ossClient;
    @Test
    void contextLoads() {
    }
   @Test
    public void upload2() throws FileNotFoundException {

        InputStream inputStream = new FileInputStream("C:\\Users\\ZY\\Desktop\\Desk\\JavaProject\\Electricity project\\project\\photos\\Alex Blajan mod.jpg");
        ossClient.putObject("zy-mymall", "20.jpg", inputStream);
        System.out.println("上传完成");
    }

}
