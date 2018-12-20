package com.umeng.soexample.gouwuchefenlei.fenlei.right.rightadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.umeng.soexample.gouwuchefenlei.R;
import com.umeng.soexample.gouwuchefenlei.bean.RightBean;

import java.util.List;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public class RightAdapter extends RecyclerView.Adapter<RightAdapter.ViewHolder> {
    private Context context;
    private List<RightBean.DataBean.ListBean> list;

    public RightAdapter(Context context, List<RightBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_right,null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(list.get(position).getIcon()).into(holder.imageright);
        holder.textright.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageright;
        private TextView textright;
        public ViewHolder(View itemview){
            super(itemview);
            imageright = itemview.findViewById(R.id.img_right);
            textright = itemview.findViewById(R.id.txt_right);
        }
    }
}
