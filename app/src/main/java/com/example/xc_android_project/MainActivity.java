package com.example.xc_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xc_android_project.XCActivity.RecyclerActivity.XCRecyclerViewActivity;
import com.example.xc_android_project.XCActivity.XCTextViewActivity;

public class MainActivity extends AppCompatActivity {

    // TextView按钮
    private Button zxcTextViewBtn;

    // RecyclerView按钮
    private Button zxcRecyclerViewBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView
        zxcTextViewBtn = (Button) findViewById(R.id.btn_textview);
        zxcTextViewBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XCTextViewActivity.class);
                startActivity(intent);
            }
        });

        // RecyclerView按钮
        zxcRecyclerViewBtn = (Button) findViewById(R.id.btn_recyclerview);
        zxcRecyclerViewBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XCRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}




