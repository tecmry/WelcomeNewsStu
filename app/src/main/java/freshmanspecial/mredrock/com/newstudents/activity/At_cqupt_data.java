package freshmanspecial.mredrock.com.newstudents.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.ViewPagerAdapter;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_DifficultProject;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_MenWomen;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_Work;


public class At_cqupt_data extends AppCompatActivity {
    private ViewPager viewPager;
    private ViewPagerAdapter Adapter;
    private TabLayout tabLayout;
    private Toolbar toolbar;

    private Button mButton;
    private List<String> Titles = new ArrayList<>();

    //将Fragment传入List
    private List<Fragment> FrList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_cqupt_data);
        init();
    }

    private void init() {

        Titles.add("男女比例");
        Titles.add("最难科目");
        Titles.add("就业率");

        FrList.add(Fr_MenWomen.getFragment());
        FrList.add(Fr_DifficultProject.getFrament());
        FrList.add(Fr_Work.getFragment());


        viewPager = (ViewPager) findViewById(R.id.cqupt_data_viewPager);
        viewPager.setOffscreenPageLimit(3);
        Adapter = new ViewPagerAdapter(getSupportFragmentManager(), this, Titles, FrList);
        viewPager.setAdapter(Adapter);

        tabLayout = (TabLayout) findViewById(R.id.cqupt_data_tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        mButton = (Button)findViewById(R.id.data_back);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(At_cqupt_data.this,Special_2017_FirstActivity.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout linearLayout = (LinearLayout) tabLayout.getChildAt(0);
        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        linearLayout.setDividerDrawable(ContextCompat.getDrawable(getApplicationContext(),
                R.drawable.special_2017_divider));


        toolbar = (Toolbar) findViewById(R.id.main_toolbar);

        Window window = getWindow();
        //4.4版本及以上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        //5.0版本及以上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }
    }
}