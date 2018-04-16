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
public class FrameActivity extends Activity {

  //  private Button bn_back = (Button)findViewById(R.id.frame_bn_back);

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);

//        bn_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FrameActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//
//        });
    }
}
