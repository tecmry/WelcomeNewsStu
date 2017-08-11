package freshmanspecial.mredrock.com.newstudents.adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
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

/**
 * Created by king on 2017/8/3.
 */
public class StudentRoomAdapter extends RecyclerView.Adapter<StudentRoomAdapter.ViewHolder>{

    private final Context context;
    private ImageView imageView;
    private final FragmentActivity activity;
    private String []Room_titles={"明理苑","宁静苑", "兴业苑" ,"知行苑"};
    private String []Room_pre={"（24—31,39）","（8—12，32--35）", "（17--23）" ,"（1—6，15,16）"};
    private String []Room_content={"（位于千喜鹤食堂正街上，可以俯瞰全校以及南山的部分美丽景色，这里也是重邮夏天最凉爽的地方。可以坐私家车直达寝室，周围有两个超市和上铺，并且校车穿过，每个寝室都为6人间，并设有独立卫生间，每一栋楼里面配置有洗衣机可供大家使用，应有尽有，可以尽情满足同学们的平日生活需求。",
            "坐落在美丽的情人坡旁，是妹子们散心聊天约会的好去处；篮球、网球、羽毛球这些周围球场为大家的锻炼提供了方便，与新校区紧连，周边分布有“千喜鹤”、“延生”等食堂。宿舍基本为6人间基本情况与22-24相同且有独立的阳台、卫浴，床铺是上下铺与上床下桌的混搭，人流量很少，环境比较清静。",

            "屹立于悠悠重邮高处，周边风景秀丽，分布在太极运动场周围，，周边有学校的兴业苑食堂及众多的超市、商铺，校车从这里穿过，内部均设有独立卫生间，并在一些楼层设有洗衣机供大家使用，根据每栋宿舍不同，楼层不同分为4人间、6人间两种。4人间都是上床下铺，而6人间则是上下铺与上床下桌的混搭。" ,
            "位于中心食堂附近的1,5,6栋是学校现存最老的寝室，住宿条件比较差，整体情况是每层楼设有公用的卫生间、洗澡间，这也就意味着每个寝室都没有独立卫生间，没有阳台。处于校园中心，上课、生活都极其便利。但位于情人坡附近的15,16栋，是学校标准的4人间，上床下桌，配有阳台，独立卫生间。楼栋周边环境一流，食堂与超市一应俱全，为学习生活提供不少的便利。"};
    private PopupWindow popupWindow;
    private  ArrayList<ImageView> imgs;
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

    public StudentRoomAdapter(Context context, FragmentActivity activity) {
        this.context=context;
        this.activity=activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_room, parent, false);
        StudentRoomAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.student_describe_title.setText(Room_titles[position]);
        holder.student_describe_pre.setText(Room_pre[position]);
        holder.student_describe_content.setText(Room_content[position]);
        holder.img_room.setOnClickListener(new View.OnClickListener() {



            private MypagerAdapter myPagerAdapter;
            class MypagerAdapter extends PagerAdapter {
                private MypagerAdapter(){
                    imgs = new ArrayList<>();
                    for (int i =0;i<imageId.length;i++){
                        //初始化要显示的图片对象
                        imageView = new ImageView(context);
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
                    int newPosition = position% imgs.size();
                    ImageView view =imgs.get(newPosition);
                    //点击图片，收缩气泡，返回主页面
                    view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            hidePopuwindow();
                        }
                    });
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
                View contentView = View.inflate(context, R.layout.special_2017_popu_window_viewpager, null);
                ViewPager vp_big_img = (ViewPager) contentView.findViewById(R.id.vp_big_img);
                myPagerAdapter = new MypagerAdapter();
                vp_big_img.setAdapter(myPagerAdapter);
                popupWindow = new PopupWindow(contentView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT,true);
                //popupWindow = new PopupWindow(contentView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                //两者结合，点击外部消失
                popupWindow.setOutsideTouchable(true);
                popupWindow.setBackgroundDrawable(new BitmapDrawable());
                popupWindow.setFocusable(true);

                backgroundAlpha(0.3f);
                popupWindow.showAtLocation(v, Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);

                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        backgroundAlpha(1.0f);
                    }
                });

                ScaleAnimation scaleAnimation = new ScaleAnimation(0,1,0,1, Animation.RELATIVE_TO_SELF,0,Animation.RELATIVE_TO_SELF,0.5f);
                scaleAnimation.setDuration(500);

                //渐变动画
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.4f, 1.0f);
                alphaAnimation.setDuration(500);

                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(alphaAnimation);
                contentView.startAnimation(animationSet);


            }
        });
    }

    private void hidePopuwindow() {
        if (popupWindow != null) {
            popupWindow.dismiss();//隐藏气泡
            backgroundAlpha(1f);
            popupWindow = null;
        }
    }

    /**
     * 设置添加屏幕的背景透明度
     * @param bgAlpha
     */
    public void backgroundAlpha(float bgAlpha)
    {
        WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
        lp.alpha = bgAlpha; //0.0-1.0
        activity.getWindow().setAttributes(lp);
    }


    @Override
    public int getItemCount() {
        return 4;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView img_room;
        private final TextView student_describe_title;
        private final TextView student_describe_pre;
        private final TextView student_describe_content;

        public ViewHolder(View view) {
            super(view);
            img_room = (ImageView) view.findViewById(R.id.img_room);
            student_describe_title = (TextView) view.findViewById(R.id.student_describe_title);
            student_describe_pre = (TextView) view.findViewById(R.id.student_describe_pre);
            student_describe_content = (TextView) view.findViewById(R.id.student_describe_content);
        }
    }
}
