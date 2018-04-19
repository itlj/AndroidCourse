package com.example.tlj.interfaceprogrammingforandroidapplications;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Data : 2018/4/16
 *
 * @author : TLJ
 * @parameter :
 * @return :
 */
public class LinearActivity extends Activity {

    private Button bn_back;
    private Button bn_horizontal;
    private Button bn_vertical;
    private Button bn_left;
    private LinearLayout layout ;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);


        layout = (LinearLayout)findViewById(R.id.line_layout);
        bn_back = (Button)findViewById(R.id.line_bn_back);
        bn_horizontal = (Button)findViewById(R.id.bn_horizontal);
        bn_vertical = (Button)findViewById(R.id.bn_vertical);
        bn_left = (Button)findViewById(R.id.bn_left);

        bn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bn_horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        bn_vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setOrientation(LinearLayout.VERTICAL);
            }
        });

        bn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setGravity(Gravity.LEFT);
            }
        });

    }



}
