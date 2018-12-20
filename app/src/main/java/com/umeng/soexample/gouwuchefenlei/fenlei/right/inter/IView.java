package com.umeng.soexample.gouwuchefenlei.fenlei.right.inter;


import com.umeng.soexample.gouwuchefenlei.bean.RightBean;

import java.util.List;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public  interface IView {
    void getrights(List<RightBean.DataBean> list);
    void failed(Exception e);
}
