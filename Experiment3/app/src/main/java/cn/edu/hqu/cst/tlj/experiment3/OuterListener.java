package cn.edu.hqu.cst.tlj.experiment3;

import android.view.View;
import android.widget.EditText;

/**
 * Data : 2018/5/6
 *  外部类
 * @author : TLJ
 * @parameter :
 * @return :
 */
public class OuterListener implements View.OnClickListener {
    EditText editText;

    public OuterListener(EditText text){
        editText = text;
    }
    @Override
    public void onClick(View view){
        editText.setText("外部类");
    }
}
