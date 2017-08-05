package freshmanspecial.mredrock.com.newstudents.activity;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;

import com.gxz.PagerSlidingTabStrip;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_TrainingPS;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_TrainingStyle;

public class Special_2017_TrainingActivity extends AppCompatActivity {


    private ViewPager pager;
    private PagerSlidingTabStrip tabs1;
    private Toolbar toolbar;
    final String[] title = { "军训贴士", "军训风采" };
    private ImageView back;
    private ImageView go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_activity_training);

        //沉浸式状态栏
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        initView();
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.special_2017_back_white);
        }
        pager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        tabs1.setViewPager(pager);
        //标题字体大小，sp
        tabs1.setTextSize(16);
        //字体左右间距
        tabs1.setTabPaddingLeftRight(30);

        tabs1.setBackgroundResource(R.color.white);
        tabs1.setFadeEnabled(false);
        tabs1.setDividerPaddingTopBottom(16);
        tabs1.setZoomMax(0.0F);
    }

    private void initView() {
        pager = (ViewPager) findViewById(R.id.train_view_pager);
        tabs1 = (PagerSlidingTabStrip) findViewById(R.id.train_tabs);
        toolbar = (Toolbar) findViewById(R.id.train_toolbar);
    }


    private class MyAdapter extends FragmentPagerAdapter {

        Special_2017_Fragment_TrainingPS trainingPS;
        Special_2017_Fragment_TrainingStyle trainingStyle;

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    trainingPS = new Special_2017_Fragment_TrainingPS();
                    return trainingPS;
                case 1:
                    trainingStyle = new Special_2017_Fragment_TrainingStyle();
                    return trainingStyle;
                default:
                    return null;
            }
        }


        @Override
        public int getCount() {
            return title.length;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }
}
