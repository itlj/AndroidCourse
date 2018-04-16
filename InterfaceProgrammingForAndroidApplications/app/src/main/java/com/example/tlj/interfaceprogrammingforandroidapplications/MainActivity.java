package com.example.tlj.interfaceprogrammingforandroidapplications;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Data : 2018/4/16
 *
 * @author : TLJ
 * @parameter :
 * @return :
 */

public class MainActivity extends Activity {

    private Button bn_LinearLayout;
    private Button bn_RelativeLayout;
    private Button bn_FrameLayout;
    private Button bn_TableLayout;
    private Button bn_GridLayout;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn_LinearLayout = (Button)findViewById(R.id.bn_LinearLayout);
        bn_RelativeLayout = (Button)findViewById(R.id.bn_RelativeLayout);
        bn_FrameLayout = (Button)findViewById(R.id.bn_FrameLayout);
        bn_TableLayout = (Button)findViewById(R.id.bn_TableLayout);
        bn_GridLayout = (Button)findViewById(R.id.bn_GridLayout);

        bn_LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });

        bn_RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });

        bn_FrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
            }
        });

        bn_TableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });

        bn_GridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
            }
        });
    }
}
