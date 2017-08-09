package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;


public class Special_2017_Fragment_TrainingPS extends Fragment{

    private RecyclerView train_ps;
    private String text="饮食篇\n" +
            "    1.早餐一定要吃好，午餐一定要吃饱，晚餐要吃得适宜。军训时饭量会增大，不想发胖的妹子在晚饭时一定要管好自己的嘴巴；由于天气比较炎热，也会有一些同学吃不下饭，建议多少吃点，军训体力消耗很大，以免身体不适。\n" +
            "    2.多吃富含多种维生素的水果蔬菜，可以淡化黑色素，在一定程度上起到美白的效果。\n" +
            "    3.饮用水、运动饮料（军训期间会大量流汗，适量补充水分很重要，建议可以喝一些葡萄糖水）\n" +
            "    4.少吃冰的东西（军训期间天气会比较炎热，降暑很有必要，但是要少吃冰的东西，以免引起肠胃的不舒服。）\n" +
            "\n" +
            "防晒篇\n" +
            "    1.军训防晒是最重要的环节，不管是男生还是女生，都一定要注意防晒，因为防晒不仅是要防晒，更是要防晒伤。\n" +
            "    2.防晒霜、防晒喷雾(最好买SPF50、PA+++的，SPF是防晒黑指数，PA是防晒伤指数，军训时长时间在烈日下暴晒，用指数高的比较适宜。出门前半个小时就要涂，因为防晒霜也要时间吸收。可以随身携带防晒霜，军训时出汗多，可以定时补涂一次。防晒霜的涂抹位置最好是脸部、脖子以及所有穿上军训服后能够漏出来的地方。）\n" +
            "    3.湿纸巾、吸油面纸（擦汗必备，擦完脸再涂上防晒霜。）\n" +
            "    4.润唇膏(可选择一些带有防晒指数的)\n" +
            "    5.晒后修复(可以用芦荟胶或大瓶化妆水做水膜，也可以直接敷保湿面膜。)\n" +
            "\n" +
            "药品篇\n" +
            "    1.防暑药（藿香正气水等）\n" +
            "    2.花露水、驱蚊水（晚上军训时会有一些蚊虫，备上以防止叮咬）\n" +
            "    3.风油精(提神醒脑。军训时需要早起，有些同学可能会睡眠不足，可以起到提神的功效。此外，风油精也会让人觉得特别清凉。)\n" +
            "    4.维C片、维E片(补充维生素，淡化黑色素，美白皮肤。)\n" +
            "    5.创可贴、棉签、碘伏(创可贴要随身带几枚，以备不时之需。)\n" +
            "\n" +
            "其他\n" +
            "    1.吸汗速干衣（有的军训服是不吸汗的，穿一件吸汗速干衣作为打底衫会舒服一点。）\n" +
            "    2.发绳、发卡(军训时注重仪容仪表，长头发需要绑起来，刘海需要别起来，另外发卡也是卡帽子神器。)\n" +
            "    3.厚鞋垫、卫生巾（军训发的鞋子会有点硬，大家请备好厚鞋垫或是垫鞋子的卫生巾。卫生巾可以吸汗，垫着也会更软一点，鞋子穿着了，站军姿、踢正步时会更有力量呐）\n" +
            "    4.运动袜（舒适、吸汗。另外，参加走方阵的同学按要求要穿深色的袜子。）\n" +
            "    5.零钱（随身带零钱，以备不时之需）\n" +
            "    6.泡脚（军训训练强度会比较大，用热水泡脚既解乏，又利于睡眠）";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_traingingps, null);
       // train_ps = (RecyclerView) view.findViewById(R.id.train_ps);
        TextView tv_training_ps = (TextView) view.findViewById(R.id.tv_training_ps);
        tv_training_ps.setText(text);


        return view;
    }
}
