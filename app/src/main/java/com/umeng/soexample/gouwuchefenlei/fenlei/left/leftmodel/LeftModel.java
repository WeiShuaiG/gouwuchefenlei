package com.umeng.soexample.gouwuchefenlei.fenlei.left.leftmodel;


import com.umeng.soexample.gouwuchefenlei.utils.HttpUtils;
import com.umeng.soexample.gouwuchefenlei.utils.ICallBack;

import java.lang.reflect.Type;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public class LeftModel {
    public void getlefts(String url, ICallBack callBack, Type type){
        HttpUtils.getInstance().get(url,callBack,type);
    }
}
