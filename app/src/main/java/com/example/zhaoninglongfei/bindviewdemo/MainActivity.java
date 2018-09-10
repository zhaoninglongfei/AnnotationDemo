package com.example.zhaoninglongfei.bindviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.apt_annotation.BindView;
import com.example.apt_library.BindTool;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindTool.bind(this);
        textView.setText("bind success");
    }
}
