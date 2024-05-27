package com.example.xc_android_project.XCActivity.RecyclerActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.xc_android_project.R;

public class XCLinearRecyclerViewActivity extends AppCompatActivity {

    // 列表
    private RecyclerView xcRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_xclinear_recycler_view);

        xcRecyclerView = (RecyclerView) findViewById(R.id.xc_recycler_view);

        xcRecyclerView.setLayoutManager(new LinearLayoutManager(XCLinearRecyclerViewActivity.this));

        xcRecyclerView.setAdapter(new XCLinearAdapter(XCLinearRecyclerViewActivity.this));
    }
}