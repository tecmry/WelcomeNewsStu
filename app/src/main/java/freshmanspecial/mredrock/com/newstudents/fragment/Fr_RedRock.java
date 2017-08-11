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

public class Fr_RedRock extends BaseFragment {
    private RecyclerView Rv;
    private OrganizationAdpter adapter;

    private List<OrganizationData> list = new ArrayList<OrganizationData>();

    private OrganizationData data1 = new OrganizationData();
    private OrganizationData data2 = new OrganizationData();
    private OrganizationData data3 = new OrganizationData();
    private static final String News = "红岩网校工作站\n" +
            "重庆邮电大学红岩网校工作站是一个校园互联网开发团队，自2000年创立以来，已有17个年头了。它是一群志趣相投的在校大学生共同创建的，在校团委老师的指导下，学生自我管理，多年来走出了一大批优秀的IT人才。红岩网校工作站包括五个部门：产品策划及运营部，视觉设计部，Web研发部, 移动开发部和运维安全部。各个部门相互协作，共同推出了重邮小帮手微信公众号、掌上重邮、BT down铺、校园二手拾货网等一系列优秀的校园互联网产品，满足了广大师生的需求，获得一致好评。\n" +
            "\n" +
            "【产品策划及运营部】Ta以产品、宣传 、组织、赞助为核心方向，是挖掘用户需求，推广网站文化的运营师；Ta负责产品策划，原型设计，是创意的集结点，是项目的瞭望塔，也是网校各部门沟通的桥梁，是一名产品经理，；Ta负责网站线上线下活动的推广，收集并分析用户意见，提出产品功能升级方案，在网校，他们负责网站内容的发布和栏目的更新、网站专题及线上线下活动的策划和制作，利用新媒体平台宣传网校的产品和活动，负责与其他部门组织联系，进行网上的合作共建。我们需要耐心、细心与恒心，以及对产品的热情与责任心，需要学习Office、Ps、Ae、Axure等软件的操作，需要一个产品人的沟通能力和认真态度。\n" +
            "\n" +
            "【视觉设计部】\tTa是设计产品图形用户界面，跟踪产品视觉及体验效果的设计师。Ta负责对网站进行整体创意和美术设计，移动端和PC端用户的界面设计；网页宣传海报设计；网站产品的动画及动效设计 ；对设计成果进行定期评估和研究，进行视觉元素的优化设计。部门的发展方向是视觉设计师和UI设计师。\n" +
            "\n" +
            "【Web研发部】\tTa分为前端和后台方向。前端主要负责前端开发和页面制作，根据设计图用HTML和CSS完成页面制作；对网站前端性能做相应的优化。而后端是负责数据库设计和服务端逻辑开发；利用LNAMP搭建功能全面、操作方便的后台管理系统。在Web研发部学长学姐们的带领下，能让你感受到 HTML、CSS、JavaScript、PHP的深深的”善意”。在这里大家将会写代码，会上课，那么就会有作业。Web部里的骚年们上可搭建服务器，下可横扫pc移动h5。\n" +
            "\n" +
            "【移动开发部】Ta主要负责移动端产品的开发，以 Java&Kotlin，OC&Swift，C#为主要开发语言，涵盖Android，iOS，Windows 三个平台。在这里你可以学到App的开发制作。移动互联网就是我们的日常；从被大神虐哭到自己成为大神。在移动开发部你将对App开发感兴趣，对App制作有狂热的欲望。\n" +
            "【运维安全部】  Ta 既是红岩网校运维安全部(内部称之为 网校 SRE ( Site Reliability Engineering ))，也是重庆邮电大学 Linux 协会( CQUPT Linux User Group )。Ta 主要负责维护网校的服务器稳定和安全，同时也负责新项目的部署、环境安全配置和性能优化，还负责了校内的很多公益项目，例如 重庆邮电大学开源镜像站、重庆邮电大学 OpenStack 云计算资源池、重庆邮电大学 MineCraft/CounterStrike 服务器等等。在这里你可以学习到非常多的酷炫的 Linux 知识和信息安全知识，我们使用 Python 和 Go 语言来开发好玩有趣的项目，在这里你可以利用丰富的服务器资源来搭建自己想做的任何项目。在运维安全部，你要对技术执着、对高性能孜孜不倦，“如果不能优雅的解决这个问题，那我们就有了两个问题”。|´・ω・)ノ";
    public static Fragment getFragmnet()
    {
        Fr_RedRock redRock = new Fr_RedRock();
        return redRock;
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
