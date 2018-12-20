package com.umeng.soexample.gouwuchefenlei.fenlei.left.leftpresenter;


import com.google.gson.reflect.TypeToken;
import com.umeng.soexample.gouwuchefenlei.bean.LeftBean;
import com.umeng.soexample.gouwuchefenlei.fenlei.left.inter.IView;
import com.umeng.soexample.gouwuchefenlei.fenlei.left.leftmodel.LeftModel;
import com.umeng.soexample.gouwuchefenlei.utils.ICallBack;

import java.lang.reflect.Type;
import java.net.URL;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public class LeftPresenter {
    private IView iv;
    private LeftModel leftModel;
    public void attch(final IView iv){
        this.iv = iv;
        leftModel = new LeftModel();
    }
    public void getleft(){
        Type type = new TypeToken<LeftBean>(){}.getType();
        leftModel.getlefts("http://www.zhaoapi.cn/product/getCatagory", new ICallBack() {
            @Override
            public void onSuccess(Object obj) {
                LeftBean leftBean = (LeftBean) obj;
                if (leftBean!=null){
                    iv.getleft(leftBean.getData());
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
