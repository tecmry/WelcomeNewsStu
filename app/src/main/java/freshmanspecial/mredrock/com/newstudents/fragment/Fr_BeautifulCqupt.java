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

import freshmanspecial.mredrock.com.newstudents.Bean.BeautifulData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.RecyclerViewAdapter;


public class Fr_BeautifulCqupt extends BaseFragment
{
    private RecyclerView Rv;
    private List<BeautifulData> list = new ArrayList<BeautifulData>();
    private RecyclerViewAdapter adapter;

    public BeautifulData one = new BeautifulData();
    public BeautifulData two = new BeautifulData();
    public BeautifulData three = new BeautifulData();
    public BeautifulData four = new BeautifulData();


    public String Beautiful_Title_One = "春日落樱";
    public String Beautiful_Title_Two = "立夏蝉鸣";
    public String Beautiful_Title_Three = "杏染秋色";
    public String Beautiful_Title_Four = "冬至慕雪";

    public String Beautiful_News_One = "樱花烂漫红陌上，花开花落皆是景\n" +
            "春风暖，吹绿了重邮，朵朵樱花饱吮着雨露的滋润，与绿叶相衬，在春风的轻抚中缓缓舒展。让我们一起漫步在三月的重邮，去欣赏那些美丽的存在。";
    public String Beautiful_News_Two = "蝉鸣午后雨红莲，日落黄昏文峰塔\n" +
            "伴着盛夏的阳光与阵阵蝉鸣，我知道，那个夏天，就像青春一样回不来。 所以，你好，再见，这是毕业的季节。";
    public String Beautiful_News_Three = "秋风瑟瑟杏叶飞，雾绕重邮山麓间\n" +
            "秋天，银杏叶由翠绿变得金黄，飒飒秋风，叶片如黄蝶飞舞，落到地上铺成金黄色的地毯。二教，老图，校园，秋意浓。";
    public String Beautiful_News_Four = "最美纷纷南山雪，邮苑万物裹银装\n" +
            "南山的冬天，没有草木枯荣的景象，绿叶在寒风中展示着一种生命力，轻柔的雪花悠悠地飘落，形成白绿相映的美景。";

    public static Fragment getFragment()
    {
        Fr_BeautifulCqupt cqupt = new Fr_BeautifulCqupt();
        return cqupt;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_beautifulcqupt,container,false);
        Rv = (RecyclerView)view.findViewById(R.id.BC_Rv);
        init();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        adapter = new RecyclerViewAdapter(list);
        Rv.setLayoutManager(layoutManager);
        Rv.setAdapter(adapter);
        return view;
    }
    public void init(){
        one.setTitle("春日落樱");
        one.setNews("樱花烂漫红陌上，花开花落皆是景\n" +
                "春风暖，吹绿了重邮，朵朵樱花饱吮着雨露的滋润，与绿叶相衬，在春风的轻抚中缓缓舒展。让我们一起漫步在三月的重邮，去欣赏那些美丽的存在。");
        two.setNews("蝉鸣午后雨红莲，日落黄昏文峰塔\n" +
                "伴着盛夏的阳光与阵阵蝉鸣，我知道，那个夏天，就像青春一样回不来。 所以，你好，再见，这是毕业的季节。");
        two.setTitle("立夏蝉鸣");
        three.setTitle("杏染秋色");
        three.setNews("秋风瑟瑟杏叶飞，雾绕重邮山麓间\n" +
                "秋天，银杏叶由翠绿变得金黄，飒飒秋风，叶片如黄蝶飞舞，落到地上铺成金黄色的地毯。二教，老图，校园，秋意浓。");
        four.setNews("最美纷纷南山雪，邮苑万物裹银装\n" +
                "南山的冬天，没有草木枯荣的景象，绿叶在寒风中展示着一种生命力，轻柔的雪花悠悠地飘落，形成白绿相映的美景。");
        four.setTitle("冬至慕雪");
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
    }


    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (isVisible){

        }
    }
}
