package cn.edu.hqu.cst.tlj.experiment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText show;
    Button bn_inner;
    Button bn_outer;
    Button bn_anonymous;
    Button bn_activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        show = findViewById(R.id.listener_tv);
        bn_inner = findViewById(R.id.listener_bn_inner);
        bn_outer = findViewById(R.id.listener_bn_outer);
        bn_anonymous = findViewById(R.id.listener_bn_anonymous);
        bn_activity = findViewById(R.id.listener_bn_activity);

        bn_inner.setOnClickListener(new InnerListener());
        bn_outer.setOnClickListener(new OuterListener(show));
        bn_activity.setOnClickListener(this);
        bn_anonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("匿名内部类");
            }
        });

    }

    //内部类实现
    class InnerListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            show.setText("内部类");
        }
    }
    //activity本身作为类
    @Override
    public void onClick(View v){
        show.setText("Activity");

    }
    //直接绑定到标签
    public void clickHandler(View view) {
        show.setText("绑定到标签");
    }
}
