package com.umeng.soexample.gouwuchefenlei.fenlei.right.rightmodel;


import com.umeng.soexample.gouwuchefenlei.utils.HttpUtils;
import com.umeng.soexample.gouwuchefenlei.utils.ICallBack;

import java.lang.reflect.Type;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public class RightModel {
    public void getrights(String url, ICallBack callBack, Type type){
        HttpUtils.getInstance().get(url,callBack,type);
    }
}
