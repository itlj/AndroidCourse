package com.example.tlj.interfaceprogrammingforandroidapplications;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Data : 2018/4/16
 *
 * @author : TLJ
 * @parameter :
 * @return :
 */
public class FrameActivity extends Activity {

    private Button bn_back;
    private int currentColor = 0;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        final int[] colors = new int[]{
                R.color.color1,
                R.color.color2,
                R.color.color3,
                R.color.color4,
                R.color.color5
        };
        final int[] names = new int[]{
                R.id.imageView1,
                R.id.imageView2,
                R.id.imageView3,
                R.id.imageView4,
                R.id.imageView5
        };

        final ImageView[] views = new ImageView[names.length];

        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                if(msg.what == 0x123){
                    for(int i=0;i<names.length;i++){
                        views[i].setBackgroundResource(colors[(i+currentColor)%names.length]);
                    }
                    currentColor++;
                }
                super.handleMessage(msg);
            }
        };

        for(int i=0;i<names.length;i++){
            views[i]=(ImageView) findViewById(names[i]);
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,1000);



        bn_back = (Button)findViewById(R.id.frame_bn_back);
        bn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrameActivity.this,MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
