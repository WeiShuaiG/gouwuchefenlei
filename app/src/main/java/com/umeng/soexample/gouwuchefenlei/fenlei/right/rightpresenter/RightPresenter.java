package com.umeng.soexample.gouwuchefenlei.fenlei.right.rightpresenter;


import com.google.gson.reflect.TypeToken;
import com.umeng.soexample.gouwuchefenlei.bean.RightBean;
import com.umeng.soexample.gouwuchefenlei.fenlei.right.inter.IView;
import com.umeng.soexample.gouwuchefenlei.fenlei.right.rightmodel.RightModel;
import com.umeng.soexample.gouwuchefenlei.utils.ICallBack;

import java.lang.reflect.Type;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public class RightPresenter {
    private IView iv;
    private RightModel rightModel;
    public void attch(IView iv){
        this.iv = iv;
        rightModel = new RightModel();
    }
    public void getright(String url){
        Type type = new TypeToken<RightBean>(){}.getType();
        rightModel.getrights(url, new ICallBack() {
            @Override
            public void onSuccess(Object obj) {
                RightBean rightBean = (RightBean) obj;
                if (rightBean!=null){
                    iv.getrights(rightBean.getData());
                }
            }

            @Override
            public void onFailed(Exception e) {
                iv.failed(e);
            }
        },type);
    }
    public void detach(){
        if (iv !=null){
            iv = null;
        }
    }
}
