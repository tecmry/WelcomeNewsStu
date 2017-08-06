package freshmanspecial.mredrock.com.newstudents.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.gxz.PagerSlidingTabStrip;

import freshmanspecial.mredrock.com.newstudents.Bean.QQGroup;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_WeChat;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_beautiful_place;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_delicious;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_everyday;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_notion;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_school_envir;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_school_mess;
import freshmanspecial.mredrock.com.newstudents.fragment.Special_2017_Fragment_student_room;
import freshmanspecial.mredrock.com.newstudents.net.Post;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Special_2017_MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private PagerSlidingTabStrip tabs1;
    private Toolbar toolbar;
    final String[] title = { "校园环境", "学生寝室", "学校食堂","入学须知",
            "QQ群","日常生活","周边美食","周边美景" };
    private ImageView back;
    private ImageView go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_activity_main);
        //沉浸式状态栏
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        pager = (ViewPager) findViewById(R.id.view_pager);
        tabs1 = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.special_2017_back_white);
            actionBar.setHomeButtonEnabled(true);

        }
        pager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        tabs1.setViewPager(pager);
       //标题字体大小，sp
        tabs1.setTextSize(15);
        //字体左右间距
        tabs1.setTabPaddingLeftRight(30);

        tabs1.setBackgroundResource(R.color.white);
        tabs1.setFadeEnabled(false);
        tabs1.setDividerPaddingTopBottom(16);
        tabs1.setZoomMax(0.0F);

    }


    private class MyAdapter extends FragmentPagerAdapter {

        Special_2017_Fragment_school_envir fragmentSchoolenvir;
        Special_2017_Fragment_student_room fragmentStudentroom;
        Special_2017_Fragment_school_mess fragmentSchoolmess;
        Special_2017_Fragment_notion fragmentNotion;
        Special_2017_Fragment_WeChat fragmentWeChat;
        Special_2017_Fragment_everyday fragmentEveryday;
        Special_2017_Fragment_delicious fragmentDelicious;
        Special_2017_Fragment_beautiful_place fragmentBeatifulplace;

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(final int position) {

            switch (position) {
                case 0:
                    fragmentSchoolenvir = new Special_2017_Fragment_school_envir();
                    return fragmentSchoolenvir;
                case 1:
                    fragmentStudentroom = new Special_2017_Fragment_student_room();
                    return fragmentStudentroom;
                case 2:
                    fragmentSchoolmess = new Special_2017_Fragment_school_mess();
                    return fragmentSchoolmess;
                case 3:
                    fragmentNotion = new Special_2017_Fragment_notion();
                    return fragmentNotion;
                case 4:
                    fragmentWeChat = new Special_2017_Fragment_WeChat();
                    return fragmentWeChat;
                case 5:
                    fragmentEveryday = new Special_2017_Fragment_everyday();
                    return fragmentEveryday;
                case 6:
                    fragmentDelicious = new Special_2017_Fragment_delicious();
                    return fragmentDelicious;
                case 7:
                    fragmentBeatifulplace = new Special_2017_Fragment_beautiful_place();
                    return fragmentBeatifulplace;
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
