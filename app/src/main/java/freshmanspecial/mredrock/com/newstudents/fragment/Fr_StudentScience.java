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

public class Fr_StudentScience extends BaseFragment {
    private RecyclerView Rv;
    private OrganizationAdpter adapter;

    private List<OrganizationData> list = new ArrayList<OrganizationData>();

    private OrganizationData data1 = new OrganizationData();
    private OrganizationData data2 = new OrganizationData();
    private OrganizationData data3 = new OrganizationData();

    private static final String News = "重庆邮电大学学生科技联合会:\n" +
            "重庆邮电大学学生科技联合会（SSTU：Student  Science  and  Technology  Union）简称学生科联，是团委指导下，以服务学生创新创业为职责的校级学生组织。学生科联以“创新、高效、团结、求实”为宗旨，以“成功与科技相辉映，科联携你我共腾飞”为口号，以“挑战杯”、“创青春”竞赛为龙头，以“学生科技文化节”、“文峰青年大讲堂”、“创新创业训练营”、“重邮青年说”、“学长演播厅”、“无线电猎狐大赛”等活动为品牌，积极参与学校创新创业教育和实践工作。\n" +
            "【主席团】\n" +
            "全面负责科联各项工作的开展；制定科联年度工作计划和发展规划；指导、检查、督促各部门开展工作，协调各方面关系，定期向团委汇报科联的工作情况。\n" +
            "【综合部】\n" +
            "负责学生科联日常事务的管理；组织开展学生科联内部活动；协调各学院学生科协的工作；负责收集和发布校内外科创赛事资讯；负责与兄弟高校及校外商家的联络。\n" +
            "【科创竞赛部】\n" +
            "负责开展“科普先锋秀”、“无线电猎狐大赛”等活动；组织“挑战杯”大学生课外学术科技作品竞赛、“创青春”全国大学生创业大赛的申报和立项工作。\n" +
            "【项目管理部】\n" +
            "组织开展学生科联的创新、创业活动。负责协调开展学生科技节系列活动；负责组织“大学生创新创业训练营”以及“创新创业高端论坛”等活动。\n" +
            "【科技人文部】\n" +
            "组织开展“重邮青年说”、“学长演播厅”等校级品牌活动；负责举办“文峰青年大讲堂”大型高端讲座；指导学生科协系统的创新文化建设工作。\n" +
            "【信息部】\n" +
            "主要负责Html5网页的开发、UI设计、三创网的宣传推广和科技创新实践活动的策划与开展，为科联的活动和宣传提供技术支持。\n" +
            "【媒体运营部】\n" +
            "主要负责海报、活动视频、微电影以及动画的的设计与制作；负责科联公众平台的线上运营和网络宣传推送等；在为科联活动提供创新创意的同时创造多样化创新性活动宣传。 ";
    public static Fragment getFragment()
    {
        Fr_StudentScience science = new Fr_StudentScience();
        return science;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
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
