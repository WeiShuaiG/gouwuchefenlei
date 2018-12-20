package com.umeng.soexample.gouwuchefenlei.fenlei.left.inter;


import com.umeng.soexample.gouwuchefenlei.bean.LeftBean;

import java.util.List;

/**
 * Created by 红鼻子小黑 on 2018/10/25.
 */

public interface IView {
    void getleft(List<LeftBean.DataBean> list);
    void failed(Exception e);
}
