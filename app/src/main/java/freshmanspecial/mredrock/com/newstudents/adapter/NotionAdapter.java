package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;

/**
 * Created by king on 2017/8/3.
 */
public class NotionAdapter extends RecyclerView.Adapter<NotionAdapter.ViewHolder>{
    private String[]text_top={
            "新生清单",
            "安全守则",
            "乘车路线",
    };
    private String[]text_describe={
            "报道时间：\n" +
                    "本科新生2017年9月14、15日报道\n" +
                    "报道地点：\n" +
                    "重庆邮电大学风雨操场\n" +
                    "新生必带：\n" +
                    "同版近期照片共15张（要求光面相纸洗印，白底一寸，半身，正脸，免冠大头照片），新生档案，党团关系证明，户口本（需要迁户口的同学携带），录取通知书，高考准考证，身份证（建议复印件多复印几份），银行卡（缴学费）,少量现金。\n" +
                    "\n" +
                    "洗护用品 ：\n" +
                    "护肤品，剃须刀，日常洗漱需要的物品（诸如牙膏牙刷，毛巾，沐浴露，洗衣液等）\n" +
                    "\n" +
                    "生活用品：\n" +
                    "四季的衣物（重庆本地的同学或经常回家的同学携带当季衣服即可），各种晾晒衣物的工具，蚊帐，一些基本的床上用品，凉席，遮光帘（要是对灯光比较敏感，建议准备），一些常用药品，台灯，还有各类寝室神器。\n" +
                    "\n" +
                    "个人物品：\n" +
                    "电脑（笔记本最宜，其他的数码产品根据自己的情况进行添置），以及一些学习物品（签字笔，笔记本等等），台灯，水杯等等。",
            "防止上当受骗。一些不法分子利用刚入学的新生不熟悉情况，以老师，学长或者老乡的身份骗取新生信任，然后以代费、减免学费等多种方式进行诈骗。\n" +
                    "\n" +
                    "不携带过多现金。数额较大的现金应该及时存入银行，存折、银行卡、身份证尽量分开放；使用银行卡要谨慎以防密码泄露。\n" +
                    "\n" +
                    "拒绝上门推销。许多不法分子以到寝室推销为名进行诈骗或盗窃，如若发现上门推销人员，应该及时报告宿管人员或者保卫处。\n" +
                    "\n" +
                    "室内注意防盗。要保管好自己的笔记本电脑、手机等贵重物品，不要将其随意放置，以免被“顺手牵羊”。\n" +
                    "\n" +
                    "注意消防安全。爱护消防设施，寝室内不违章使用大功率电器。\n" +
                    "\n" +
                    "注意交通安全。不乘坐“黑车”和存在安全隐患的车辆。\n" +
                    "\n" +
                    "遇到情况及时与公安机关联系。在遇到不法侵害时，要及时与公安机关（110）或者学校保卫处联系（62461018,62460110）",
            "方案一\n" +
                    "迎新接站：报道期间，我校将在重庆火车北站南、北广场设新生接待站，有同学负责引导新生到指定地点乘车\n" +
                    "\n" +
                    "方案二\n" +
                    "重庆江北机场（距离学校约40公里）：可乘机场大巴至上清寺后转乘108路公交车至南坪，再转乘346或347路公交车到学校；或乘轻轨三号线到南坪，再转乘346或347路公交车到学校；直接打车到校费用约为70元；\n" +
                    "\n" +
                    "方案三\n" +
                    "龙头寺火车站、重庆北站（距离学校约20公里）：乘323路或168路公交车至南坪，转乘346或347路公交车至学校：或乘轻轨三号线到南坪，再转乘346或347路公交\n" +
                    "车到学校；直接打车到校费用约40元；\n" +
                    "\n" +
                    "方案四\n" +
                    "菜园坝火车站、汽车站（距离学校约12公里）：可在菜园坝广场乘347路公交车至学校；直接打车到校费用约为25元；\n" +
                    "\n" +
                    "方案五\n" +
                    "朝天门码头（距离学校约9公里）：可乘车至南坪后转乘346或347路公交车至学校；直接打车到校费用约为20元。",

    };

    @Override
    public NotionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_notion, parent, false);
        NotionAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(NotionAdapter.ViewHolder holder, int position) {
        holder.top_title.setText(text_top[position]);
        holder.describe.setText(text_describe[position]);
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView top_title;
        private TextView describe;

        public ViewHolder(View itemView) {
            super(itemView);
            top_title = (TextView) itemView.findViewById(R.id.top_title);
            describe = (TextView) itemView.findViewById(R.id.describe);
        }
    }
}
