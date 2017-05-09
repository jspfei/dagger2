package com.jf.dagger2.net;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by admin on 2017/5/9.
 */

public class AsynHttp {
    private HttpResponseCallBack callBack;
    private OkHttpClient mOkHttpClient;
    public void getAsynHttp(String url, final Activity act,  HttpResponseCallBack callBack1){
        mOkHttpClient = new OkHttpClient();
        callBack = callBack1;
        Request.Builder requestBuilder = new Request.Builder().url(url);
        //可以省略，默认是GET请求
        requestBuilder.method("GET",null);

        Request request= requestBuilder .build();

        Call mCall = mOkHttpClient.newCall(request);

        mCall.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.i("HACK-TAG","cache----");
                callBack.callback("请求失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String msg = "";
                if(null != response.cacheResponse()){
                    String str = response.cacheResponse().toString();
                    Log.i("HACK-TAG","cache----"+str);
                }else{

                    String str = response.body().string();
                    Log.i("HACK-TAG","network----"+str);
                    msg = str;
                }

                final String finalMsg = msg;
                act.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBack.callback(finalMsg);
                    }
                });
            }
        });
    }

}
