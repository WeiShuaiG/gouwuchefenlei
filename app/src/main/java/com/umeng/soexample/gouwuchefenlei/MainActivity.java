package com.umeng.soexample.gouwuchefenlei;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.umeng.soexample.gouwuchefenlei.fragment.FlFragment;
import com.umeng.soexample.gouwuchefenlei.fragment.GwcFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView1;
    private TextView textView2;
    private FlFragment flFragment;
    private GwcFragment gwcFragment;
    private List<Fragment> list;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.fl);
        textView2 = findViewById(R.id.gwc);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        flFragment = new FlFragment();
        gwcFragment = new GwcFragment();
        list = new ArrayList<>();
        list.add(flFragment);
        list.add(gwcFragment);
        viewPager = findViewById(R.id.vp_s);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fl:
                viewPager.setCurrentItem(0);
                break;

            case R.id.gwc:
                viewPager.setCurrentItem(1);
                break;
        }
    }
}
