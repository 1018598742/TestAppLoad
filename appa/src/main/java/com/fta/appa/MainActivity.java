package com.fta.appa;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startApp(View view) {
        //1. action
//        Intent intent = new Intent();
//        //这里是采用的自定义action
//        intent.setAction("transBundle.app");
//        intent.putExtra("info", "名字");
//        startActivity(intent);

        //2.包名类名
//        Intent intent = new Intent();
//        ComponentName componentName = new ComponentName("com.fta.appb",//这个是另外一个应用程序的包名
//                "com.fta.appb.SecondActivity");//这个参数是要启动的Activity的全路径名
//
//        intent.setComponent(componentName);
//        startActivity(intent);

        //3.通过scheme启动
        Uri uri = Uri.parse("app://my.test");
        Intent intent = new Intent("transBundle.app", uri);
        startActivity(intent);

    }
}
