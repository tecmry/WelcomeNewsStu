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

import freshmanspecial.mredrock.com.newstudents.Bean.OrganizationData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.OrganizationAdpter;


/**
 * Created by Tecmry on 2017/8/6.
 */

public class Fr_Tuanwei extends BaseFragment
{
    private RecyclerView Rv;
    private OrganizationAdpter adapter;

    private List<OrganizationData> list = new ArrayList<OrganizationData>();

    private OrganizationData data1 = new OrganizationData();
    private OrganizationData data2 = new OrganizationData();
    private OrganizationData data3 = new OrganizationData();

    public static Fragment getFragment()
    {
        Fr_Tuanwei organization = new Fr_Tuanwei();
        return organization;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_organization,container,false);
        System.out.println("onCreatView执行了" + "TuanWei");
        Rv = (RecyclerView)view.findViewById(R.id.Og_Rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        adapter = new OrganizationAdpter(list);
        adapter.notifyDataSetChanged();
        Rv.setLayoutManager(layoutManager);
        Rv.setAdapter(adapter);
        return view;
    }



    private void initData(){
        data1.setTitle("【团委办公室】");
        data1.setNews("负责协调和承办团委的日常事务；负责团委大型会议的会务工作；团委相关工作的上传与下达；负责奖状、文件的保管工作；协助管理团委资产。");
        data2.setTitle("【团委组织部】");
        data2.setNews("负责团的基层组织建设工作；开展推优入党工作；负责开展青年马克思主义者培养工程； 指导主题团日活动的开展；开展五\n" +
                "四评优表彰工作。");
        data3.setTitle("【团委宣传部】");
        data3.setNews("负责团属刊物的制作；负责团委官方微博、微信等新媒体阵地的建设；负责myouth平台的建设管理；负责校内各项活动的采\n" +
                "访、拍摄及相关专题视频的制作。");
        list.add(data1);
        list.add(data2);
        list.add(data3);

    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        System.out.println("执行了"+isVisible);
        if (isVisible){
            System.out.println("执行了Change");
            initData();
        }
    }
}
