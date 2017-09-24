package sathya.com.checkboxapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView tv;
    CheckBox c0,cb1,cb2,cb3;
    CheckBox cb[]=new CheckBox[3];
    int id[] ={R.id.cb1,R.id.cb2,R.id.cb3};
    public  void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        for (int i=0;i<id.length;i++){
            cb[i]=(CheckBox)findViewById(id[i]);
        }
        tv=(TextView)findViewById(R.id.tv);
        c0=(CheckBox)findViewById(R.id.cb0);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
        cb3=(CheckBox)findViewById(R.id.cb3);
    }

    public void display(View v){
        String text="";
        for(int i=0;i<cb.length;i++){
            if(cb[i].isChecked()){
                String s =cb[i].getText().toString();
                text=text+s+" ";
            }
        }
        tv.setText(text);
    }
    public  void selectAll(View v){
        if(c0.isChecked()){
            for(int i=0;i<cb.length;i++) {
                cb[i].setChecked(true);
            }
        }else{
            for(int i=0;i<cb.length;i++) {
                cb[i].setChecked(false);
        }

        }
    }

    public  void submit(View v)//Button Click Method
    {
        if(this.cb1.isChecked()&&this.cb2.isChecked()&&this.cb3.isChecked())
        {
            this.c0.setChecked(true);
            return ;
        }
        this.c0.setChecked(false);
    }


}