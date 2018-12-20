package com.umeng.soexample.gouwuchefenlei.fenlei.left.leftadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.umeng.soexample.gouwuchefenlei.R;
import com.umeng.soexample.gouwuchefenlei.bean.LeftBean;

import java.util.List;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public class LeftAdapter extends RecyclerView.Adapter<LeftAdapter.ViewHolder>{
    private Context context;
    private List<LeftBean.DataBean>  list;

    public LeftAdapter(Context context, List<LeftBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }
    public interface OnItemClickListener{
        void onItemClick(View itemview, int position);
    }
    private OnItemClickListener clickListener;
    public void setOnItemClickListener(OnItemClickListener clickListener){
        this.clickListener = clickListener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.item_list,null);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txtleft.setText(list.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickListener !=null){
                    clickListener.onItemClick(view,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtleft;
        public ViewHolder(View itemview){
            super(itemview);
            txtleft = itemview.findViewById(R.id.txt_left);
        }
    }
}
