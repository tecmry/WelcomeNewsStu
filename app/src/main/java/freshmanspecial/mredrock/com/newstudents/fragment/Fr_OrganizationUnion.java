package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;


/**
 * Created by Tecmry on 2017/8/9.
 */

public class Fr_OrganizationUnion extends BaseFragment {
    private TextView textView;
    private static final String News = "重庆邮电大学学生社团联合会：\n" +
            "社团联合会在校团委的直接指导下，管理社团工作、服务社团发展的学生组织，旗下管辖着涵盖文学学术、实践服务、艺术\n" +
            "文化、爱好兴趣、体育运动等功能丰富、类型兼备的各类学生社团组织。它以充分调动众多社团及其会员的积极性和创造性，\n" +
            "全面开展有深度、有内涵、有品位、有价值、有意义的社团活动，不断丰富校园文化生活，提高当代大学生的学习能力、实\n" +
            "践能力、组织能力和创新能力为目标。 作为青年自组织，学生社团是培养和发展大学生兴趣爱好的广阔平台，是培养学生自\n" +
            "我教育、自我管理、自我服务的有效形式，是构建“一体两翼”学校团建大格局的重要组成部分，是凝聚青年、丰富校园文化\n" +
            "、培育和传承大学精神的重要载体，目前，能否建设好高校的社团已经成为一个高校是否具有活力和文化氛围的重要标志之\n" +
            "一。学生社团遍布全国高校校园的各个角落，扮演着丰富校园文化生活、提升校园文化品位、引领校园文化时尚的重要角色。\n" +
            "社团联合会扮演着对各社团服务和管理的双重角色，对学生社团的发展起着至关重要的作用 \n" +
            "【主席团】\n" +
            "全面主持学生社联各项工作；制定社联工作计划和发展规划；指导、检查、督促各社团开展工作，协调与各学生组织 和社团\n" +
            "之间的关系。\n" +
            "【综合部】\n" +
            "社联小当家。负责社联内部文书、考勤、活动筹备等工作，策划组织各项内部活动；负责学生社团精品活动物资的审批发放、场地申请；同时负责与兄弟高校社联组织、校内各组织及校外商家的联络。\n" +
            "【宣传部】\n" +
            "活动先行者。负责社联新媒体运营工作，搭建学生社团宣传平台。负责设计社联活动海报、视频等文化产品，同时审批社团活动海报等宣传制品。\n" +
            "【社团服务部】\n" +
            "社团小帮手。负责管理社团，是社联连接社团、社团部的桥梁，组织社团的招新、运行、换届以及社团评奖评优等工作，带动社团的发展。\n" +
            "【社团活动部】\n" +
            "活动执行官。负责审核、指导学生社团开展精品活动，牵头社联各部门举办社团达人秀、社团推广暨展示季等大型活动，增添校园文化色彩。";
       public static Fragment getFragment()
     {
        Fr_OrganizationUnion union = new Fr_OrganizationUnion();
         return union;
     }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_organization,container,false);
        textView = (TextView)view.findViewById(R.id.contentTextView);


        return view;
    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (isVisible){}
    }
}
