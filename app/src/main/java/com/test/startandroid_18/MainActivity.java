package com.test.startandroid_18;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
//Hello all

public class MainActivity extends ActionBarActivity implements SeekBar.OnSeekBarChangeListener{

    SeekBar sbweight;
    Button btn1,btn2;
    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        sbweight = (SeekBar)findViewById(R.id.sbweight);
        sbweight.setOnSeekBarChangeListener(this);

        lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();





    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int leftValue = progress;
        int rightValue = seekBar.getMax() - progress;

        lParams1.weight = leftValue;
        lParams2.weight = rightValue;
        btn1.setLayoutParams(lParams1);
        btn2.setLayoutParams(lParams2);
       // btn1.setText(String.valueOf(leftValue));
       // btn2.setText(String.valueOf(rightValue));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
