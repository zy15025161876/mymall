package com.zhou.mymall.mymallproduct;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhou.mymall.mymallproduct.entity.BrandEntity;
import com.zhou.mymall.mymallproduct.service.BrandService;
import com.zhou.mymall.mymallproduct.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
@Slf4j
@SpringBootTest
class MymallProductApplicationTests {
//    @Autowired
//    OSSClient ossClient;
//    @Autowired
// BrandService brandService;
//    @Test
//    public void upload2() throws FileNotFoundException {
//
//        InputStream inputStream = new FileInputStream("C:\\Users\\ZY\\Desktop\\Desk\\JavaProject\\Electricity project\\project\\photos\\Alex Blajan mod.jpg");
//        ossClient.putObject("zy-mymall", "20.jpg", inputStream);
//        System.out.println("上传完成");
//    }
//    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//
////        brandEntity.setBrandId(1L);
////        brandEntity.setName("涅克");
////          brandService.updateById(brandEntity);
//        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//      brand_id.forEach((item)->{
//          System.out.println(item);
//
//      });
//
//    }

//    @Test
////    public void upload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-chengdu.aliyuncs.com";
//// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI5tJHaeSRX7gDRwYtfDM3";
////        String accessKeySecret = "1uahUlWL3j3fEJ6em54sSdWUvnuZGz";
////
//// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 上传文件流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\ZY\\Desktop\\Desk\\JavaProject\\Electricity project\\project\\photos\\17.jpg");
//        ossClient.putObject("zy-mymall", "17.jpg", inputStream);
//        System.out.println("上传完成");
//// 关闭OSSClient。
//
//
//    }
    @Autowired
    private CategoryService categoryService;
    @Test
    public  void testFind(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径{}", Arrays.asList(catelogPath));


    }

}
