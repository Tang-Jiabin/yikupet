package com.ykkoo.pet.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

/**
 * 上传文件
 *
 * @author : J.Tang
 * @version : v1.0
 * @email : seven_tjb@163.com
 * @create : 2018-08-30 16:08
 **/
@Slf4j
public class UploadFileUtil {

    private static final String ACCESS_KEY = "xlaA9j8z9qY_TlxI8i_Z3hnGoJxCDC8FP98tcs-x";
    private static final String SECRET_KEY = "iZBPiyEuxyzHQpVdV4Ddf1wT5bCXvKvLmLp1y34K";
    private static final String PET = "pet";
    private static final String PET_URL = "http://pet.ykkoo.com/";


    public static String uploadPetFiles(InputStream inputStream, String fileName) {
        return uploadFile(inputStream, fileName, PET, PET_URL);
    }

    public static String uploadPetFiles(String path, String fileName) {
        return uploadFile(path, fileName, PET, PET_URL);
    }


    private static String uploadFile(InputStream inputStream, String fileName, String bucket, String doman) {
        fileName = fileName.replaceAll(" ", "");
        fileName = fileName.replaceAll("'", "");

        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone1());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名

        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(inputStream, fileName, upToken, null, null);

            if (response.isOK()) {
                return doman + fileName;
            } else {
                return "";
            }
        } catch (Exception e) {
            log.error("上传图片失败");
        }
        return "";
    }

    private static String uploadFile(String path, String fileName, String bucket, String doman) {
        fileName = fileName.replaceAll(" ", "");
        fileName = fileName.replaceAll("'", "");

        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone1());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名

        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(path, fileName, upToken);

            if (response.isOK()) {
                return doman + fileName;
            } else {
                return "";
            }
        } catch (Exception e) {
            log.error("上传图片失败");
        }
        return "";
    }




    private static void util(byte[] bytes, String key) {
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone1());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);

        byte[] uploadBytes = bytes;
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(PET);
        try {
            Response response = uploadManager.put(uploadBytes, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);

        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
    }

}

