package com.example.xc_android_project.XCActivity.RecyclerActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xc_android_project.R;

public class XCLinearAdapter extends RecyclerView.Adapter<XCLinearAdapter.XCLinerViewHolder> {

    private Context mContext;

    // 构造函数
    public XCLinearAdapter(XCLinearRecyclerViewActivity xcLinearRecyclerViewActivity) {
        this.mContext = xcLinearRecyclerViewActivity;
    }

    // iOS TableViewDelegate、TableViewDataSource
    @NonNull
    @Override
    public XCLinearAdapter.XCLinerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        XCLinerViewHolder xcLinerViewHolder = new XCLinerViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_xc_item,parent,false));

        return xcLinerViewHolder;
    }

    // iOS CellForRow
    @Override
    public void onBindViewHolder(@NonNull XCLinearAdapter.XCLinerViewHolder holder, int position) {

        holder.itemTextView.setText("Jaguar XEL Or BWM 325im");
    }

    @Override
    public int getItemCount() {

        return 30;
    }


    // iOS TableViewCell
    class XCLinerViewHolder extends  RecyclerView.ViewHolder {

        private TextView itemTextView;

        public XCLinerViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTextView = (TextView) itemView.findViewById(R.id.liner_item_text_view);

        }
    }

}
