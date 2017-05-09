package com.jf.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.jf.dagger2.component.DaggerFlowerComponent;
import com.jf.dagger2.component.DaggerMainActivityComponent;
import com.jf.dagger2.component.DaggerPotComponent;
import com.jf.dagger2.model.Pot;
import com.jf.dagger2.model.User;
import com.jf.dagger2.net.AsynHttp;
import com.jf.dagger2.net.HttpResponseCallBack;
import com.umeng.analytics.MobclickAgent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements HttpResponseCallBack {

    @Inject
    User user;

    @Inject
    Pot pot;

    private TextView title_txt;

    AsynHttp asynHttp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobclickAgent.setDebugMode(true);
        title_txt = (TextView) findViewById(R.id.title_txt);

        initData();

        asynHttp = new AsynHttp();
       // asynHttp.getAsynHttp("http://www.baidu.com",this,this);
        asynHttp.getAsynHttp("http://192.168.66.143:8082/watch/server/student.do",this,this);
    }

    private void initData(){
       DaggerMainActivityComponent.builder()
               .potComponent(DaggerPotComponent.builder()
               .flowerComponent(DaggerFlowerComponent.create())
               .build())
               .build().inject(this);
       // user.setName("kkkksfs");

        //title_txt.setText(user.getName());

        String show = pot.show();
        Toast.makeText(MainActivity.this,show,Toast.LENGTH_SHORT).show();
    }
    public void onResume() {

        super.onResume();
        MobclickAgent.onResume(this);
        Log.i("HACK-TAG","SleepBeauty2  onResume");

    }

    public void onPause() {

        super.onPause();
        MobclickAgent.onPause(this);
        Log.i("HACK-TAG","SleepBeauty2  onPause");
    }

    @Override
    public void callback(String msg) {
        title_txt.setText(msg);
    }
}
