package com.example.translucentbarstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        initListener();
    }



    /**
     * 监听事件
     */
    private void initListener() {

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    /**
     * 初始化布局控件
     */
    private void initialize() {

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(MainActivity.this,FirstActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this,ThreeActivity.class));
                break;
        }
    }
}
