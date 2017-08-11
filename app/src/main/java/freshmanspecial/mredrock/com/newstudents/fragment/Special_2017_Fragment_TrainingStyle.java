package freshmanspecial.mredrock.com.newstudents.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;

import freshmanspecial.mredrock.com.newstudents.R;


public class Special_2017_Fragment_TrainingStyle extends Fragment implements View.OnClickListener {

    private RecyclerView train_style;
    private ImageView vt_video1;
    private ImageView vt_video2;
    private ArrayList<ImageView> imgs;
    private int []imageId={
            R.drawable.special_2017_laiokan,
            R.drawable.special_2017_xinke,
            R.drawable.special_2017_shuzi,
            R.drawable.special_2017_erjiao,
            R.drawable.special_2017_gaoshan,
            R.drawable.special_2017_yuhong,
            R.drawable.special_2017_yangkan,
            R.drawable.special_2017_chuhua,
    };
    private WindowManager wm;
    private int width;
    private PopupWindow popupWindow;
    private  ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_traingingstyle, null);
        train_style = (RecyclerView) view.findViewById(R.id.rv_train_style);
        vt_video1 = (ImageView) view.findViewById(R.id.vt_video1);
        vt_video2 = (ImageView) view.findViewById(R.id.vt_video2);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        train_style.setLayoutManager(manager);
        TrainingStyleAdapter Adapter = new TrainingStyleAdapter();
        train_style.setAdapter(Adapter);

        //点击事件
        vt_video1.setOnClickListener(this);
        //获取屏幕的宽度
        WindowManager wm =  (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels;

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.vt_video1:
                Uri uri = Uri.parse("https://v.qq.com/x/page/p0522eqzqzz.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.vt_video2:
                Uri uri2 = Uri.parse("https://v.qq.com/x/page/f0526oi2zyx.html");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
        }
    }

    private class TrainingStyleAdapter extends RecyclerView.Adapter<TrainingStyleAdapter.ViewHolder>{

        @Override
        public TrainingStyleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_trainingstyle, parent, false);
            ViewHolder holder = new ViewHolder(view);

            holder.train_style_img.setOnClickListener(new View.OnClickListener() {

                private MypagerAdapter myPagerAdapter;
                class MypagerAdapter extends PagerAdapter{
                    private MypagerAdapter(){
                        imgs = new ArrayList<>();
                        for (int i =0;i<imageId.length;i++){
                            //初始化要显示的图片对象
                            imageView = new ImageView(getContext());
                            imageView.setBackgroundResource(imageId[i]);
                            imgs.add(imageView);
                        }
                    }
                    @Override
                    public int getCount() {
                        return 6;
                    }
                    @Override
                    public boolean isViewFromObject(View view, Object object) {
                        return view==object;
                    }

                    @Override
                    public Object instantiateItem(ViewGroup container, int position) {
                        ImageView view =imgs.get(position);
                        container.addView(view);
                        return view;
                    }

                    @Override
                    public void destroyItem(ViewGroup container, int position, Object object) {
                        container.removeView((View)object);

                    }
                }

                @Override
                public void onClick(View v) {
                    //5.弹出新气泡之前，删除旧气泡
                    hidePopuwindow();
                    View contentView = View.inflate(getContext(), R.layout.special_2017_popu_window_viewpager, null);
                    ViewPager vp_big_img = (ViewPager) contentView.findViewById(R.id.vp_big_img);
                    myPagerAdapter = new MypagerAdapter();

                    popupWindow = new PopupWindow(contentView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    popupWindow.setFocusable(true);
                    vp_big_img.setAdapter(myPagerAdapter);


                    popupWindow.showAtLocation(v, Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);
                    backgroundAlpha(0.3f);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0,1,0,1, Animation.RELATIVE_TO_SELF,0,Animation.RELATIVE_TO_SELF,0.5f);
                    scaleAnimation.setDuration(500);

                    //渐变动画
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.4f, 1.0f);
                    alphaAnimation.setDuration(500);

                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(scaleAnimation);
                    animationSet.addAnimation(alphaAnimation);
                    contentView.startAnimation(animationSet);
                    //点击图片，收缩气泡，返回主页面
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            hidePopuwindow();
                        }
                    });

                }
            });

            return holder;

        }

        @Override
        public void onBindViewHolder(TrainingStyleAdapter.ViewHolder holder, final int position) {
            holder.train_style_img.setImageResource(imageId[position]);

        }


        @Override
        public int getItemCount() {
            return 6;
        }

        class ViewHolder extends RecyclerView.ViewHolder{

            private ImageView train_style_img;
            private TextView train_style_text;
            public ViewHolder(View itemView) {
                super(itemView);
                train_style_img= (ImageView) itemView.findViewById(R.id.training_style_img);
                train_style_text= (TextView) itemView.findViewById(R.id.training_style_text);
            }
        }
    }

    private void backgroundAlpha(float v) {

        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
        lp.alpha = v; //0.0-1.0
        getActivity().getWindow().setAttributes(lp);

    }

    private void hidePopuwindow() {

        if (popupWindow != null) {
            popupWindow.dismiss();//隐藏气泡
            backgroundAlpha(1f);
            popupWindow = null;
        }
    }
}
