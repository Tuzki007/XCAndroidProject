package com.example.xc_android_project.XCActivity.RecyclerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xc_android_project.R;
import com.example.xc_android_project.XCActivity.RecyclerActivity.XCLinearRecyclerViewActivity;

public class XCRecyclerViewActivity extends AppCompatActivity {

    private Button xcBtnLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xcrecycler_view);

        xcBtnLinear = (Button) findViewById(R.id.xc_btn_liner);
        xcBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XCRecyclerViewActivity.this, XCLinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
