package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.CreativeData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.CraetiveCquptAdapter;

/**
 * Created by Tecmry on 2017/8/6.
 */

public class Fr_CreativeCqupt extends BaseFragment {
    private CreativeData data1 = new CreativeData();
    private CreativeData data2 = new CreativeData();
    private CreativeData data3 = new CreativeData();
    private CreativeData data4 = new CreativeData();


    private CraetiveCquptAdapter mAdapter;
    private RecyclerView Rv;
    private List<CreativeData> list = new ArrayList<>();
    public static Fragment getFragment()
    {
        Fr_CreativeCqupt cqupt = new Fr_CreativeCqupt();
        return cqupt;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_creativecqupt,container,false);
        Rv = (RecyclerView)view.findViewById(R.id.Cc_Rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CraetiveCquptAdapter(list,getContext());
        Rv.setLayoutManager(layoutManager);
        Rv.setAdapter(mAdapter);
        initData();
        return view;
    }


    private void initData()
    {new Thread(new Runnable() {
        @Override
        public void run() {
            data1.setLeft_name("《看见重邮》");
            data1.setRight_name("《时间都去哪了》");
            data1.setRight(R.drawable.time_go);
            data1.setLeft(R.drawable.view_cqupt);
            data1.setLeft_uri("http://v.youku.com/v_show/id_XNzExODM3Njk2.html?from=y1.2-1-95.3.12-2.1-1-1-11-0");
            data1.setRight_uri("http://v.youku.com/v_show/id_XMTI2NjE0MDcwNA==.html?from=s1.8-1-1.2");
            data2.setLeft_name("2015重庆邮电大学宣传片");
            data2.setRight_name("舌尖上的重邮第一集");
            data2.setLeft(R.drawable.view_2015);
            data2.setLeft_uri("http://v.youku.com/v_show/id_XMTc1OTA2MzUzMg==.html?spm=a2h0k.8191407.0.0&from=s1.8-1-1.2");
            data2.setRight(R.drawable.apex_one);
            data2.setRight_uri("http://v.youku.com/v_show/id_XNzA0MDc2ODA0.html?from=s1.8-1-1.1");
            data3.setLeft_name("舌尖上的重邮第二集");
            data3.setRight_name("舌尖上的重邮第三集");
            data3.setLeft(R.drawable.apex_two);
            data3.setLeft_uri("http://v.youku.com/v_show/id_XNDAzNzQ1MjA4.html?from=s1.8-1-1.1");
            data3.setRight_uri("http://v.youku.com/v_show/id_XNDMyNTIzMzAw.html?from=s1.8-1-1.1");
            data3.setRight(R.drawable.apex_three);
            data4.setLeft_name("舌尖上的重邮第二季");
            data4.setRight_name("2016红岩网校工作站招新视频");
            data4.setLeft(R.drawable.apex_four);
            data4.setLeft_uri("http://v.youku.com/v_show/id_XNzIxODU1OTYw.html?from=s1.8-1-1.1");
            data4.setRight_uri("http://v.youku.com/v_show/id_XMTcxOTM2MTc4MA==.html?spm=a2h0j.8191423.module_basic_relation.5~5!2~5~5!7~5~5~A");
            data4.setRight(R.drawable.redrock);
        }
    }).start();
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (isVisible){}
    }
}
