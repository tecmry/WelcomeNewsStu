package freshmanspecial.mredrock.com.newstudents.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.ViewPagerAdapter;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_BeautifulCqupt;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_BestStudent;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_BestTeacher;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_CreativeCqupt;
import freshmanspecial.mredrock.com.newstudents.fragment.Fr_StudentOrganization;


public class student_style extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<String> Title = new ArrayList<>();
    private List<Fragment> FrList = new ArrayList<Fragment>();
    private ViewPagerAdapter adapter;
    private Button mButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_student_style);
        init();
    }

    private void init() {

        Title.add("学生组织");
        Title.add("原创重邮");
        Title.add("美在重邮");
        Title.add("优秀教师");
        Title.add("优秀学生");

        FrList.add(Fr_StudentOrganization.getFragment());
        FrList.add(Fr_CreativeCqupt.getFragment());
        FrList.add(Fr_BeautifulCqupt.getFragment());
        FrList.add(Fr_BestTeacher.getFragment());
        FrList.add(Fr_BestStudent.getFragment());

        tabLayout = (TabLayout) findViewById(R.id.style_tabLayout);
        viewPager = (ViewPager) findViewById(R.id.style_viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), this, Title, FrList);
        viewPager.setAdapter(adapter);


        toolbar = (Toolbar) findViewById(R.id.style_toolbar);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        mButton = (Button)findViewById(R.id.style_back);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(student_style.this,Special_2017_FirstActivity.class);
                startActivity(intent);
                finish();
            }
        });


        toolbar = (Toolbar) findViewById(R.id.style_toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(student_style.this, Special_2017_FirstActivity.class);
                startActivity(intent);
                finish();
            }
        });
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
