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

public class Fr_ArticalUnion extends BaseFragment {
    private RecyclerView Rv;
    private OrganizationAdpter adapter;

    private List<OrganizationData> list = new ArrayList<OrganizationData>();

    private OrganizationData data1 = new OrganizationData();
    private OrganizationData data2 = new OrganizationData();
    private OrganizationData data3 = new OrganizationData();

    private final static  String News = "重庆邮电大学大学生艺术团\n" +
            "重庆邮电大学大学生艺术团是在校团委直接指导管理下的学生艺术团体，肩负组织学校重大文艺活动，代表学校对外联谊，\n" +
            "演出和参加省市文艺大赛的重任。秉承“服务同学，锻炼自我”的宗旨，以丰富校园文化生活，陶冶情操，加强与其他院校艺\n" +
            "术交流与沟通，为校宣传争光，活跃人文气氛等为前提，要求每个成员在艺术实践中以高标准、严要求的态度约束自己。 大\n" +
            "学生艺术团由管乐团、合唱团、舞蹈团、曲艺团组成。主要承担着我校各项大型演出任务，组织编排各项文艺节目，为有文\n" +
            "艺特长的同学搭建良好的交流和展示平台，每个分团都有固定的训练时间和专业指导老师。近年来，大学生艺术团一次次圆\n" +
            "满完成学校交给的各项文艺演出任务，并锻炼和培养了一批批艺术人才。为我校大学生文艺素质的培养，树立了一面旗帜。\n" +
            "【主席团】\n" +
            "全面主持艺术团各项工作；负责艺术团工作计划的制定和艺术团建设规划；负责艺术团分团干部的培养、选拔工作；负责策划\n" +
            "艺术团各类演出活动。\n" +
            "【综合部】\n" +
            "负责艺术团日常事务管理；各类文艺活动的后勤保障工作；负责学生活动中心、管乐团排练厅场地管理；协调和联系其他学生\n" +
            "组织及各分团间的工作；负责礼仪志愿者的日常训练及成员的考核工作。\n" +
            "【管乐团】\n" +
            "负责管乐团的日常训练及管乐团成员的考核、招新工作；组织参加校内外的演出或比赛； 协助指导教师做好管乐团的节目编\n" +
            "排工作。\n" +
            "【舞蹈团】\n" +
            "负责舞蹈团的日常训练及舞蹈团成员的考核、招新工作；组织参加校内外的演出或比赛； 协助指导教师做好舞蹈团的节目编\n" +
            "排工作。\n" +
            "【民乐团】\n" +
            "负责民乐团的日常训练及民乐团成员的考核、招新工作；组织参加校内外的演出或比赛； 协助指导教师做好民乐团的节目编\n" +
            "排工作。\n" +
            "【合唱团】\n" +
            "负责合唱团的日常训练及合唱团成员的考核、招新工作；组织参加校内外的演出或比赛； 协助指导教师做好合唱团的节目编\n" +
            "排工作。\n" +
            "【话剧团】\n" +
            "负责话剧团的日常训练及话剧团成员的考核、招新工作；组织参加校内外的演出或比赛；创作并编排新话剧剧本等。";

    public  static Fragment getFragment()
    {
        Fr_ArticalUnion Union = new Fr_ArticalUnion();
        return Union;
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
        if (isVisible){

        }
    }
}
