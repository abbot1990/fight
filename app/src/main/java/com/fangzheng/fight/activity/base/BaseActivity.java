package com.fangzheng.fight.activity.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fangzheng.fight.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
