package freshmanspecial.mredrock.com.newstudents.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.Bean.QQGroup;
import freshmanspecial.mredrock.com.newstudents.R;

/**
 *QQ群
 */
public class Special_2017_Fragment_WeChat extends Fragment {

    private AutoCompleteTextView weChat;
    private RecyclerView rv_qqGroup;
    private QQGroup groups;
    private QQGroupAdapter.ViewHolder holder;
    private static final String qqInfo[]={
            "2017贴吧新生总群：636208141",
            "通信与信息工程学院：498167991",
            "计算机与科学技术学院：638612170",
            "自动化学院：574872113",
            "光电学院 国际半导体学院：636449199",
            "外国语学院：333094013",
            "传媒艺术学院：527468298",
            "编导：621039140",
            "2017级重邮编导交流群：277821038",
            "生物学院：637402699",
            "生物2017级新生群：654028289",
            "信管：362192309",
            "经济管理学院： 545772871",
            "工程管理：552540368",
            "软件工程学院：482656306",
            "安法学院院学生会认证官方新生群：162240404",
            "安法学院新生群：615223073",
            "理学院：575159267",
            "体育学院：649510732",
            "国际学院：17443276",
            "先进制造学院：563565394",
            "知行苑1舍	1栋	370756053	1栋宣传交流群",
            "知行苑5舍	5栋	569278976	15重邮五栋信息交流群",
            "知行苑6舍	6栋	552965358	六栋交流群",
            "宁静苑1舍	8栋	370882763	八栋交流群",
            "宁静苑2舍	9栋	217404051	9栋交流群",
            " 宁静苑3舍	10栋	308429475	10栋交流群",
            "宁静苑4舍	11栋	328760815	十一栋交流群",
            "宁静苑5舍	12栋	369823153	12栋交流群",
            "知行苑7舍	15栋	376647835	壮我大15",
            " 知行苑8舍	16栋	397014505	16栋宿管会交流群",
            " 兴业苑1舍	17栋	370634999	17栋交流群",
            " 兴业苑2舍	18栋	179501244	18栋交流群",
            " 兴业苑3舍	19栋	328819288	19栋交流群",
            "兴业苑4舍	20栋	319580292	20栋交流群",
            " 兴业苑6舍	22栋	175502962	22栋交流群",
            " 兴业苑7舍	23A栋	483213823	23A栋交流群",
            "兴业苑8舍	23B栋	368076381	23B栋交流群",
            " 明理苑1舍	24栋	369786189	24栋交流群",
            "明理苑2舍	25栋	188496198	25栋寝室长交流群",
            " 明理苑3舍	26栋	367477687	26栋交流群",
            "明理苑4舍	27栋	221644234	重邮27栋信息交流群",
            " 明理苑5舍	28栋	175648266	28栋宿舍交流群",
            " 明理苑6舍	29栋	305715729	29栋交流群",
            "明理苑7舍	30栋	310896924	30栋交流群",
            "宁静苑6舍	32栋	328068771	32栋交流群",
            "贵州2017：601631814",
            "河北： 548535234",
            "安徽： 562487104",
            "辽宁： 134489031",
            "河南： 310222276",
            "重邮河南老乡群： 251311309",
            "河南安阳： 116198098",
            "山东： 384043802",
            "江苏： 123736116",
            "黑龙江： 316348915",
            "潮汕： 4958681",
            "江西： 3889855",
            "江西上饶： 476426072",
            "浙江： 247010642",
            "广西贵港： 5819894",
            "广西南宁： 16026851",
            "广西： 9651531",
            "广西柳州： 7045893",
            "广东： 113179139",
            " 广东韶关： 66484867",
            " 广东惠州： 213337022",
            "山西： 119738941",
            "海南： 9334029",
            "福建： 173210510",
            "吉林： 118060379",
            "云南宣威： 211910023",
            "云南玉溪： 256581906",
            "云南曲靖： 117499346",
            "云南： 548640416",
            "云南官方群： 42052111",
            "天津： 8690505",
            " 湖北恩施： 179765240",
            " 湖北： 33861584",
            "湖北黄冈： 181704337",
            "湖南： 204491110",
            "重庆梁平： 85423833",
            " 重庆忠县： 115637967",
            "重庆铜梁： 198472776",
            "重庆大足： 462534986",
            "重庆荣昌： 149452192",
            "重庆永川： 467050041",
            "重庆丰都： 343292119",
            "重庆涪陵： 199748999",
            "重庆云阳： 118971621",
            "重庆璧山： 112571803",
            "重庆石柱： 289615375",
            "重庆彭水： 283978475",
            "重庆南川： 423494314",
            "重庆长寿： 69124125",
            " 重庆垫江 307233230",
            " 重庆合川： 226325326",
            " 重庆荣昌： 149452192",
            "重庆綦江： 109665788",
            "重庆奉节： 50078959",
            "重庆铜梁： 198472776",
            "重庆黔江： 102897346",
            "重庆万州： 469527984",
            "重庆巫溪： 143884210",
            "重庆巫山： 129440237",
            " 四川简阳： 570320904",
            "四川大群： 148985246   142604890",
            "四川成都： 298299346",
            " 四川自贡： 444020511",
            "四川绵阳： 191653502",
            "陕西： 193388613",
            "重邮新疆： 248052400",
            "青海： 282597612",
            " 北京： 143833720",
            "甘肃美术老乡： 578076400",
            "甘肃： 155724412",
    };

    private View headerView;
    private View mindView;
    private View finView;
    private ImageView search;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_wechat, null);
        weChat = (AutoCompleteTextView) view.findViewById(R.id.wechat);
        rv_qqGroup = (RecyclerView) view.findViewById(R.id.rv_QQGroup);
        search = (ImageView) view.findViewById(R.id.img_search);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rv_qqGroup.setLayoutManager(manager);
        groups=new QQGroup();
        QQGroupAdapter QQAdapter = new QQGroupAdapter();
        rv_qqGroup.setAdapter(QQAdapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, qqInfo);
        weChat.setAdapter(adapter);

        return view;
    }

    public class QQGroupAdapter extends RecyclerView.Adapter<QQGroupAdapter.ViewHolder>{

        @Override
        public QQGroupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_qqgroup, parent, false);
            holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final QQGroupAdapter.ViewHolder holder, final int position) {
            holder.GroupName_Number.setText(qqInfo[position]);
        }

        @Override
        public int getItemCount() {
            return qqInfo.length;
        }
        public class ViewHolder extends RecyclerView.ViewHolder {

            private final TextView GroupName_Number;

            public ViewHolder(View view) {
                super(view);
                GroupName_Number = (TextView) view.findViewById(R.id.GroupName_Number);
            }
        }
    }



}
