package com.example.btnclickapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private Button button;
    private TextView textView;
    private int cnt = 0;

    /******************************************************/
    private ImageView imageView;
    /******************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // widgetの設定
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View view) {
        cnt++;
        textView.setText(String.format("%d%s", cnt, getResources().getString(R.string.cnt_text)));

        if(cnt % 10 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(),String.format("%d%s", cnt, getResources().getString(R.string.toast_text)), Toast.LENGTH_SHORT);
            toast.show();
        }

        /******************************************************/
        // ナベアツ
        if(cnt % 3 == 0 || (cnt + "").contains("3")) {
            imageView.setVisibility(View.VISIBLE);  // 表示
        }else {
            imageView.setVisibility(View.INVISIBLE);     // 非表示
        }
        /******************************************************/

    }


}