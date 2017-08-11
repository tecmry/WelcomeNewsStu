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
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.Bean.QQGroup;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.utils.KeyboardListenRelativeLayout;

/**
 *QQ群
 */
public class Special_2017_Fragment_WeChat extends Fragment {

    private boolean hideAllMenu=false;
    private AutoCompleteTextView weChat;
    private RecyclerView rv_qqGroup;
    private QQGroup groups;
    private QQGroupAdapter.ViewHolder holder;
    private TextView tv_cancel;
    private static final String qqInfo[]={
            "重庆邮电大学总群：         636208141",
            "通信与信息工程学院：       498167991",
            "计算机与科学技术学院：      638612170",
            "自动化学院：               574872113",
            "光电学院/国际半导体学院：   636449199",
            "外国语学院：               333094013",
            "传媒艺术学院：             527468298",
            "生物信息学院：              637402699",
            "经济管理学院信息管理与信息系统专业 362192309",
            "经济管理学院：             545772871",
            "经济管理学院工程管理专业： 552540368",
            "软件工程学院：             482656306",
            "网络空间安全与信息法学院：162240404",
            "理学院：                  575159267",
            "体育学院：                649510732",
            "国际学院：                17443276",
            "先进制造工程学院：         563565394",
            "贵州：     601631814",
            "河北：     548535234",
            "安徽：     562487104",
            "辽宁：     134489031",
            "河南：     310222276",
            "重邮河南老乡群： 251311309",
            "河南安阳： 116198098",
            "山东：     384043802",
            "江苏：     123736116",
            "黑龙江：   316348915",
            "潮汕：     4958681",
            "江西：     3889855",
            "江西上饶： 476426072",
            "浙江：     247010642",
            "广西贵港： 5819894",
            "广西南宁： 16026851",
            "广西：      9651531",
            "广西柳州：  7045893",
            "广东：      113179139",
            " 广东韶关： 66484867",
            " 广东惠州： 213337022",
            "山西：     119738941",
            "海南：     9334029",
            "福建：     173210510",
            "吉林：     118060379",
            "云南宣威： 211910023",
            "云南玉溪： 256581906",
            "云南曲靖： 117499346",
            "云南：     548640416",
            "云南官方群：42052111",
            "天津：     8690505",
            "湖北恩施： 179765240",
            "湖北：     33861584",
            "湖北黄冈： 181704337",
            "湖南：     204491110",
            "重庆梁平： 85423833",
            "重庆忠县： 115637967",
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
            "重庆垫江   307233230",
            "重庆合川： 226325326",
            "重庆荣昌： 149452192",
            "重庆綦江： 109665788",
            "重庆奉节： 50078959",
            "重庆铜梁： 198472776",
            "重庆黔江： 102897346",
            "重庆万州： 469527984",
            "重庆巫溪： 143884210",
            "重庆巫山： 129440237",
            "四川简阳： 570320904",
            "四川大群： 142604890",
            "四川成都： 298299346",
            "四川自贡： 444020511",
            "四川绵阳： 191653502",
            "陕西：     193388613",
            "重邮新疆： 248052400",
            "青海：     282597612",
            "北京：     143833720",

    };
    private String titles[]={"新生群：","老乡群："  };
    private String contents[]={
            "通信与信息工程学院：498167991\n" +
            "计算机与科学技术学院：638612170\n" +
            "自动化学院：574872113\n" +
            "光电工程学院/国际半导体学院：636449199\n" +
            "外国语学院：333094013\n" +
            "传媒艺术学院：527468298\n" +
            "生物信息学院：637402699\n" +
            "经济管理学院信息管理与信息系统专业：362192309\n" +
            "经济管理学院： 545772871\t\n" +
            "经济管理学院工程管理专业：552540368\n" +
            "软件工程学院：482656306\n" +
            "网络空间安全与信息法学院：162240404 \n" +
            "理学院：575159267\n" +
            "体育学院：649510732\n" +
            "国际学院：17443276\n" +
            "先进制造工程学院：563565394 ",
            "贵州：601631814\n" +
                    "河北：548535234  \n" +
                    "安徽：562487104  \n" +
                    "辽宁：134489031  \n" +
                    "河南老乡群1：310222276  \n" +
                    "河南老乡群2：251311309  \n" +
                    "河南安阳：116198098  \n" +
                    "山东：384043802  \n" +
                    "江苏：123736116 \n" +
                    "黑龙江：316348915  \n" +
                    "潮汕：4958681  \n" +
                    "江西：3889855  \n" +
                    "江西上饶：476426072  \n" +
                    "浙江：247010642  \n" +
                    "广西贵港：5819894  \n" +
                    "广西南宁：16026851  \n" +
                    "广西：9651531  \n" +
                    "广西柳州：7045893  \n" +
                    "广东：113179139  \n" +
                    "广东韶关：66484867  \n" +
                    "广东惠州：213337022  \n" +
                    "山西：119738941  \n" +
                    "海南：9334029  \n" +
                    "福建：173210510  \n" +
                    "吉林：118060379  \n" +
                    "云南宣威：211910023  \n" +
                    "云南玉溪：256581906  \n" +
                    "云南曲靖：117499346  \n" +
                    "云南：548640416  \n" +
                    "云南官方群：42052111  \n" +
                    "天津：8690505  \n" +
                    "湖北恩施：179765240  \n" +
                    "湖北：33861584  \n" +
                    "湖北黄冈：181704337  \n" +
                    "湖南：204491110  \n" +
                    "重庆梁平：85423833  \n" +
                    "重庆忠县：115637967  \n" +
                    "重庆铜梁：198472776  \n" +
                    "重庆大足：462534986  \n" +
                    "重庆开县：5657168  \n" +
                    "重庆荣昌：149452192  \n" +
                    "重庆永川：467050041  \n" +
                    "重庆丰都：343292119  \n" +
                    "重庆涪陵：199748999  \n" +
                    "重庆云阳：118971621  \n" +
                    "重庆璧山：112571803  \n" +
                    "重庆石柱：289615375  \n" +
                    "重庆彭水：283978475  \n" +
                    "重庆南川：423494314  \n" +
                    "重庆垫江：307233230  \n" +
                    "重庆合川：226325326  \n" +
                    "重庆荣昌：149452192  \n" +
                    "重庆綦江：109665788  \n" +
                    "重庆奉节：50078959  \n" +
                    "重庆铜梁：198472776  \n" +
                    "重庆黔江：102897346  \n" +
                    "重庆万州：469527984  \n" +
                    "重庆巫溪：143884210  \n" +
                    "重庆巫山：129440237  \n" +
                    "四川大群：142604890  \n" +
                    "四川成都：298299346  \n" +
                    "四川自贡：444020511  \n" +
                    "四川绵阳：191653502  \n" +
                    "陕西：193388613  \n" +
                    "新疆：248052400  \n" +
                    "青海：282597612  \n" +
                    "北京：143833720  \n" +
                    "甘肃美术：578076400  \n" +
                    "甘肃：155724412  ",};
    private KeyboardListenRelativeLayout relativeLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_wechat, null);
        weChat = (AutoCompleteTextView) view.findViewById(R.id.wechat);
        rv_qqGroup = (RecyclerView) view.findViewById(R.id.rv_QQGroup);
        relativeLayout = (KeyboardListenRelativeLayout) view.findViewById(R.id.keyboardRelativeLayout);
         tv_cancel= (TextView) view.findViewById(R.id.tv_cancel);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rv_qqGroup.setLayoutManager(manager);
        groups=new QQGroup();
        QQGroupAdapter QQAdapter = new QQGroupAdapter();
        rv_qqGroup.setAdapter(QQAdapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, qqInfo);
        weChat.setAdapter(adapter);

       //键盘的弹出与收回
        relativeLayout.setOnKeyboardStateChangedListener(new KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener() {
            @Override
            public void onKeyboardStateChanged(int state) {
                switch (state){
                    case KeyboardListenRelativeLayout.KEYBOARD_STATE_HIDE:
                        //键盘隐藏
                        tv_cancel.setVisibility(View.INVISIBLE);

                        hideAllMenu=false;
                        break;
                    //键盘显示
                    case KeyboardListenRelativeLayout.KEYBOARD_STATE_SHOW:
                        tv_cancel.setVisibility(View.VISIBLE);
                        //点击“取消”
                        tv_cancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getActivity().onBackPressed();
                                tv_cancel.setVisibility(View.INVISIBLE);
                            }
                        });
                        hideAllMenu=true;
                }
            }
        });

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
            holder.GroupName_Number.setText(contents[position]);
            holder.GroupName_Number_title.setText(titles[position]);
        }

        @Override
        public int getItemCount() {
            return contents.length;
        }
        public class ViewHolder extends RecyclerView.ViewHolder {

            private final TextView GroupName_Number;
            private final TextView GroupName_Number_title;

            public ViewHolder(View view) {
                super(view);
                GroupName_Number = (TextView) view.findViewById(R.id.GroupName_Number);
                GroupName_Number_title = (TextView) view.findViewById(R.id.GroupName_Number_title);
            }
        }
    }



}
