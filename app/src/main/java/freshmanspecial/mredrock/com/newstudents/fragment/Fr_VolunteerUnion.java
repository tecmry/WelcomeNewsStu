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
 * Created by Tecmry on 2017/8/9.
 */

public class Fr_VolunteerUnion extends BaseFragment{

    private RecyclerView Rv;
    private OrganizationAdpter adapter;

    private List<OrganizationData> list = new ArrayList<OrganizationData>();

    private OrganizationData data1 = new OrganizationData();
    private OrganizationData data2 = new OrganizationData();
    private OrganizationData data3 = new OrganizationData();


    private static final String News = "重庆邮电大学青年志愿者协会\n" +
            "重庆邮电大学青年志愿者协会成立于2014年6月，由校团委指导，秉承“互相帮助、助人自助、无私奉献、不求回报”的志愿者精神，有效的组织全校志愿者参与校内外志愿服务，同时负责学校社会实践工作和志愿服务活动的协调。组织开展全校“三下乡”社会实践活动、“12.5国际志愿者日”志愿周系列活动、“3•5学雷锋月”系列活动、“重庆邮电大学优秀志愿项目答辩”、“校内志愿服务时长管理”、“市民学校”志愿活动等相关工作。\n" +
            "重庆邮电大学青年志愿者协会的组织结构为：\n" +
            "【主席团】\n" +
            "统筹协调校院两级青年志愿者组织开展工作；拓展对外交流合作平台。\n" +
            "【综合管理部】\n" +
            "负责青协日常事务统筹和物资管理；负责学校各部门和组织的时长认定与监管；完善与各学院，以及其他学校青协的联系与合作。\n" +
            "【青年志愿者服务总队】\n" +
            "负责各类志愿服务活动组织及志愿者招募工作；负责优秀志愿项目的评选工作。\n" +
            "【实践服务部】\n" +
            "负责暑期“三下乡”社会实践活动的组织工作；统筹城乡社区市民学校建设工作。\n" +
            "【宣传推广部】\n" +
            "负责青年志愿服务活动宣传；负责校内外志愿活动的跟踪纪录；对志愿服务品牌项目进行推广；帮助建设好更完善的志愿服体系。";

    public static Fragment getFragment()
    {
        Fr_VolunteerUnion volunteerUnion = new Fr_VolunteerUnion();
        return volunteerUnion;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_organization,container,false);
        Rv = (RecyclerView)view.findViewById(R.id.Og_Rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        adapter = new OrganizationAdpter(list);
        Rv.setLayoutManager(layoutManager);
        Rv.setAdapter(adapter);
        return view;
    }


    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (isVisible){}
    }
}
