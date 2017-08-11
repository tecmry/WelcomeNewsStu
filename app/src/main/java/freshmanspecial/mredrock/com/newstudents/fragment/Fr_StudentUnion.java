package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class Fr_StudentUnion extends BaseFragment {
    private RecyclerView Rv;
    private OrganizationAdpter adapter;

    private List<OrganizationData> list = new ArrayList<OrganizationData>();

    private OrganizationData data1 = new OrganizationData();
    private OrganizationData data2 = new OrganizationData();
    private OrganizationData data3 = new OrganizationData();

    private String News = "重庆邮电大学学生会:\n" +
            "重庆邮电大学学生会是由校党委、市学联领导，由校团委具体指导的群众性组织。重庆邮电大学学生会以“全心全意为同学服\n" +
            "务”为宗旨，充分发挥同学主人翁精神，加强学风建设，营造浓厚的读书氛围，以提高学生综合素质、推进校园文化建设为目\n" +
            "标，创建了一批深受同学们喜爱的科技文化活动，积极营造校园爱心氛围，结合校园实际，积极加强大学生法制观念，维护大\n" +
            "学生合法权益，开展文体活动，丰富校园文化生活。利用现有资源，打造网络交流平台，通过编撰刊物，展示理论成果。\n" +
            "【主席团】\n" +
            "全面主持学生会日常工作，督促和指导各部门工作的开展； 统筹协调校院两级学生会开展工作；定期向学校领导、学生委员\n" +
            "会、学生代表大会汇报工作；学生会副主席协助主席开展工作，分管相应工作。\n" +
            "【综合部】\n" +
            "负责学生会内部日常管理；协调各学院学生会工作；负责与兄弟高校学生会及校外商家的联络；牵头对各学院学生会的考核。\n" +
            "【学习部】\n" +
            "推进学风建设，搭建师生交流桥梁；组织开展辩论赛、读写行等活动； 建设“朋辈辅导”互助平台。\n" +
            "【宣传部】\n" +
            "利用新媒体开展学生会宣传工作；设计制作视频、微电影、海报等文化产品；开展校园文化创意活动。\n" +
            "【权益提案部】\n" +
            "处理提案工作委员会日常事务；负责学生代表提案的征集、立案、报送、督办等工作；搭建青年学生维权服务平台。\n" +
            "【生活服务部】\n" +
            "处理食品安全与伙食监督管理委员会日常事务；做好与基建后勤、宿舍管理部门的沟通联系；组织开展健康生活、文明生活主\n" +
            "题活动。\n" +
            "【文艺部】\n" +
            "开展校内文艺活动；搭建同学才艺展示平台；培养同学文艺爱好。\n" +
            "【体育部】\n" +
            "组织开展“走下网络、走出宿舍、走向操场”群众性体育锻 炼活动。\n" +
            "【女生部】\n" +
            "反映广大女生的合理利益诉求；组织开展女生节系列活动；配合“文峰女子学堂”开展各类活动。";
    public static Fr_StudentUnion getFragment()
    {
        Fr_StudentUnion frStudentUnion = new Fr_StudentUnion();
        return frStudentUnion;
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
