package com.ykkoo.pet.utils;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Map;

/**
 * OkHttp工具类
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/4/22
 * @email : seven_tjb@163.com
 **/
@Slf4j
public enum OkHttpUtil {
    /**
     * 单例
     */
    INSTANCE;

    private static OkHttpClient client;

    private static Request.Builder builder;

    private static Request request;

    public OkHttpClient getClient() {
        if (client == null) {
            client = new OkHttpClient.Builder().build();
//            .addInterceptor(new MyInterceptor())
        }
        return client;
    }

    /**
     * get请求
     *
     * @param url 地址
     * @return 结果
     */
    public Response doGet(String url) {
        return doGet(url, null, null);
    }

    /**
     * get请求
     *
     * @param url  地址
     * @param parm 参数
     * @return 结果
     */
    public Response doGet(String url, Map<String, String> parm) {
        return doGet(url, parm, null);
    }

    /**
     * get请求
     *
     * @param url         地址
     * @param parm        参数
     * @param builderParm 参数
     * @return 结果
     */
    public Response doGet(String url, Map<String, String> parm, Request.Builder builderParm) {

        if (StringUtils.isEmpty(url)) {
            return null;
        }

        if (builderParm != null) {
            builder = builderParm;
        }

        client = getClient();

        url = splicedParm(url, parm);

        request = getRequest(url);

        Response response = getResponse();

        clean();

        return response;
    }

    public Response doPost(String url, Map<String, String> parm) {

        if (StringUtils.isEmpty(url)) {
            return null;
        }

        FormBody.Builder form = new FormBody.Builder();

        for (String key : parm.keySet()) {
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(parm.get(key))) {
                form.add(key, parm.get(key));
            }
        }
        RequestBody body = form.build();

        builder = new Request.Builder().post(body);

        client = getClient();

        request = getRequest(url);

        Response response = getResponse();

        clean();

        return response;
    }

    public static <T> T jsonResponseToClass(Response response, Class<T> cla) {

        if (response.isSuccessful()) {
            String body = null;
            try {
                body = response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (body == null) {
                return null;
            }
            return new Gson().fromJson(body, cla);
        }

        return null;
    }


    /**
     * 拼接参数
     *
     * @param url  链接
     * @param parm 参数
     * @return 拼接结果
     */
    private String splicedParm(String url, Map<String, String> parm) {

        url = checkUrl(url);

        if (parm != null && parm.size() > 0) {
            String getParm = "";
            if (url.contains("?")) {

                if ("&".equals(url.substring(url.length() - 1))) {
                    getParm = url;
                } else {
                    getParm = String.format("%s&", url);
                }
            } else {
                getParm = String.format("%s?", url);
            }

            for (String key : parm.keySet()) {
                if (!StringUtils.isEmpty(parm.get(key).trim()) && !StringUtils.isEmpty(key.trim())) {
                    getParm = String.format("%s%s=%s&", getParm, key, parm.get(key));
                }
            }

            getParm = getParm.substring(0, getParm.length() - 1);

            return getParm;
        }

        return url;
    }

    /**
     * 清除请求对象
     */
    private void clean() {
        request = null;
        builder = null;
    }

    /**
     * 检查链接
     *
     * @param url 链接
     * @return 链接
     */
    private String checkUrl(String url) {
        if (url.contains("?")) {
            String param = url.substring(url.indexOf("?") + 1);

            String[] paramArr = param.split("&");

            String paramLink = "";

            for (String str : paramArr) {
                int remove = 0;
                if (!str.contains("=")) {
                    remove = 1;
                } else {
                    if (str.split("=").length > 1) {
                        if (StringUtils.isEmpty(str.split("=")[0])) {
                            remove = 1;
                        }
                        if (StringUtils.isEmpty(str.split("=")[1])) {
                            remove = 1;
                        }
                    } else {
                        remove = 1;
                    }
                }
                if (remove == 0) {
                    paramLink = String.format("%s%s&", paramLink, str);
                }
            }

            url = String.format("%s?%s", url.substring(0, url.indexOf("?")), paramLink);
        }
        return url;
    }

    /**
     * 获取请求结果
     *
     * @return Response
     */
    private Response getResponse() {
        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取请求体
     *
     * @param url 请求链接
     * @return Request
     */
    private Request getRequest(String url) {
        if (builder == null) {
            request = new Request.Builder().url(url).build();
        } else {
            request = builder.url(url).build();
        }
        return request;
    }


    /**
     * 拦截器
     */
    class MyInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            log.info("请求信息: {}", request);
            return chain.proceed(chain.request());
        }
    }
}
