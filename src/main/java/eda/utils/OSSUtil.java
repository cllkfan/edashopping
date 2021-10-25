package eda.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
@Data
public class OSSUtil {
    private String ENDPOINT = "oss-cn-hongkong.aliyuncs.com"; // 地域节点
    private String ACCESSKEYID = "LTAI5t7hQbazt617jAdTyriC";  // 访问ID
    private String ACCESSSECRETKEY = "ODFOPoAhKjLio7mpal4EY0DCuDCCuQ";  // 访问秘钥
    private String BUCKETNAME = "t1014yan1";  // 仓库名称
    private String SUFFER_URL = "t1014yan1.oss-cn-hongkong.aliyuncs.com";  // 外网用户名
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); // 日期

    /**
     * 获取oss的链接
     */
    public OSSClient getOSSClient() {
        // 创建ossClient对象
        OSSClient ossClient = new OSSClient(ENDPOINT, ACCESSKEYID, ACCESSSECRETKEY);
        if (ossClient.doesBucketExist(BUCKETNAME)) {
            System.out.println("bucket 存在");
        }else {
            // 通过api接口创建bucket仓库
            System.out.println("bucket不存在，创建新的bucket：" + BUCKETNAME);
            CreateBucketRequest createBucketRequest = new CreateBucketRequest(null);
            createBucketRequest.setBucketName(BUCKETNAME);
            createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
            ossClient.createBucket(createBucketRequest);
            ossClient.shutdown();
        }
        return ossClient;
    }
}
