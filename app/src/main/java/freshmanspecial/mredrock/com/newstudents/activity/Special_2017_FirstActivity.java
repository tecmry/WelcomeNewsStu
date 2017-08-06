package freshmanspecial.mredrock.com.newstudents.activity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.View.special_2017_RoundedImageView;

public class Special_2017_FirstActivity extends AppCompatActivity implements View.OnClickListener{


    /**
     * RoundedImageView
     * */
    private static special_2017_RoundedImageView student_method;
    private static special_2017_RoundedImageView cqupt_data;
    private static special_2017_RoundedImageView student_style;
    private static special_2017_RoundedImageView military_training;

    /**
     * Fragment
     * */
    private android.support.v4.app.Fragment fr_cqupt_data;
    private android.support.v4.app.Fragment fr_student_style;
    /**
     * 等李亮合并
     * */
    private android.support.v4.app.Fragment fr_menwomen;
    private android.support.v4.app.Fragment fr_work;

    private Toolbar toolbar;

    /**
     * 用来判断首页的RoundedImageView是否可见
     * */
    private static int index = 0;


    private static int index_fr ;
    private LinearLayout fl_ll;
    private Toolbar trianing_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_activity_first);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        init();

        setSupportActionBar(trianing_toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.special_2017_back_white);
        }
    }

    private void init() {
        student_method  = (special_2017_RoundedImageView)findViewById(R.id.student_method);
        cqupt_data = (special_2017_RoundedImageView)findViewById(R.id.cqupt_data);
        student_style = (special_2017_RoundedImageView)findViewById(R.id.student_style);
        military_training = (special_2017_RoundedImageView)findViewById(R.id.military_training);
        trianing_toolbar = (Toolbar) findViewById(R.id.main_toolbar);

        student_method.setOnClickListener(this);
        cqupt_data.setOnClickListener(this);
        student_style.setOnClickListener(this);
        military_training.setOnClickListener(this);
        fl_ll = (LinearLayout)findViewById(R.id.main_LL);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.student_method){
            Intent intent = new Intent(Special_2017_FirstActivity.this,Special_2017_MainActivity.class);
            startActivity(intent);

        }else  if(view.getId() == R.id.military_training){
            Intent intent = new Intent(Special_2017_FirstActivity.this,Special_2017_TrainingActivity.class);
            startActivity(intent);
        }

    }

    private void ViewGone(int inde) {
        if (inde == 0) {
            student_method.setVisibility(View.GONE);
            student_style.setVisibility(View.GONE);
            military_training.setVisibility(View.GONE);
            cqupt_data.setVisibility(View.GONE);
            index = 1;
        }else if (index == 1)
        {
            student_method.setVisibility(View.VISIBLE);
            student_style.setVisibility(View.VISIBLE);
            cqupt_data.setVisibility(View.VISIBLE);
            military_training.setVisibility(View.VISIBLE);
            //DeleteFragment();
            index = 0;
        }
    }

    private void DeleteFragment() {
        if (index_fr == 0)
        {

        }else if (index_fr == 1)
        {
            getSupportFragmentManager().beginTransaction().remove(fr_menwomen).commit();

        }else if (index_fr == 2)
        {

            getSupportFragmentManager().beginTransaction().remove(fr_student_style).commit();
        }else if (index_fr == 3)
        {

            getSupportFragmentManager().beginTransaction().remove(fr_cqupt_data).commit();
        }
    }
}
