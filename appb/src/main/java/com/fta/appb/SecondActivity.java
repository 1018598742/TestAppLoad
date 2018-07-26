package com.fta.appb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mMessage = ((TextView) findViewById(R.id.ob_value));

        Intent intent = getIntent();
        if (intent != null) {
            mMessage.setText(intent.getStringExtra("info"));
        }

    }
}
