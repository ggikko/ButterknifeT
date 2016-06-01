package ggikko.me.butterknifetapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public class MainActivity extends AppCompatActivity  {

//    TextView mText1, mText2 ,mText3, mText4, mText5;
//    Button mButton1, mButton2 ,mButton3, mButton4, mButton5;

    @BindView(R.id.text1) TextView text1;
    @BindView(R.id.text2) TextView text2;
    @BindView(R.id.text3) TextView text3;
    @BindView(R.id.text4) TextView text4;
    @BindView(R.id.text5) TextView text5;

    @BindColor(R.color.blue) int blue;


    @OnClick({R.id.btn_text1, R.id.btn_text2, R.id.btn_text3, R.id.btn_text4, R.id.btn_text5})
    void pressButtons(View view){
        switch (view.getId()){

            case R.id.btn_text1 :{
                setText(text1, text2, text3, text4, text5);

//                text1.setText("onclick!");
                break;
            }

            case R.id.btn_text2 :{
                text2.setText("onclick!");
                break;
            }

            case R.id.btn_text3 :{
                text3.setText("onclick!");
                break;
            }

            case R.id.btn_text4 :{
                text4.setText("onclick!");
                break;
            }

            case R.id.btn_text5 :{
                text5.setText("onclick!");
                break;
            }
        }
    }

    private void setText(TextView... textViews){
        for(TextView textView : textViews) {
            textView.setText("onclick!");
//            textView.setTextColor(ContextCompat.getColor(this, R.color.blue));
            textView.setTextColor(blue);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        mText1 = (TextView) findViewById(R.id.text1);
//        mText2 = (TextView) findViewById(R.id.text2);
//        mText3 = (TextView) findViewById(R.id.text3);
//        mText4 = (TextView) findViewById(R.id.text4);
//        mText5 = (TextView) findViewById(R.id.text5);
//
//        mButton1 = (Button) findViewById(R.id.btn_text1);
//        mButton2 = (Button) findViewById(R.id.btn_text2);
//        mButton3 = (Button) findViewById(R.id.btn_text3);
//        mButton4 = (Button) findViewById(R.id.btn_text4);
//        mButton5 = (Button) findViewById(R.id.btn_text5);
//
//        mButton1.setOnClickListener(this);
//
//        mButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mText1.setText("one click!");
//            }
//        });
//
//        mButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mText2.setText("one click!");
//            }
//        });
//
//
//        mButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mText3.setText("one click!");
//            }
//        });
//
//
//        mButton4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mText4.setText("one click!");
//            }
//        });
//
//        mButton5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mText5.setText("one click!");
//            }
//        });
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btn_text1:
//                break;
//
//
//        }
//    }


}
