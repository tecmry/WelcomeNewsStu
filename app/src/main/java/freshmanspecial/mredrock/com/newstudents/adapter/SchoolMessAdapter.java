package freshmanspecial.mredrock.com.newstudents.adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.KeyEvent;
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


public class SchoolMessAdapter extends RecyclerView.Adapter<SchoolMessAdapter.ViewHolder>{


    private Context context;
    private FragmentActivity activity;
    private ImageView imageView;
    private String[]text_titles={
            "中心食堂",
            "红高粱",
            "兴业苑",
            "千喜鹤",
            "大西北",
            "延生",
    };
    private String[]text_contents={
            "中心，中心，听名字就知道位处于重邮中心，地理位置的优越不仅来源于它历史的悠久，更是因为中心特色小面的支持，这里一砖一瓦都沉淀着岁月的气息。由于离二教很近，所以也常常是同学们打包就餐的不二选择。早饭的选择是犹为多的，又大又好吃又便宜的素菜包子和肉花卷、馒头加豆浆，绝对会让你一天都精神饱满的去上课。当然每当早起时，在热闹非凡的雨红莲广场旁，吃着中心的小面，看着红房子，仿佛感受着无声的过去的故事，也是一种极好的感受。",

            "中心，中心，听名字就知道位处于重邮中心，地理位置的优越不仅来源于它历史的悠久，更是因为中心特色小面的支持，这里一砖一瓦都沉淀着岁月的气息。由于离二教很近，所以也常常是同学们打包就餐的不二选择。早饭的选择是犹为多的，又大又好吃又便宜的素菜包子和肉花卷、馒头加豆浆，绝对会让你一天都精神饱满的去上课。当然每当早起时，在热闹非凡的雨红莲广场旁，吃着中心的小面，看着红房子，仿佛感受着无声的过去的故事，也是一种极好的感受。",

            "位处红高粱之下，“快递一条街”之上，毗邻兴业苑宿舍，是兴业苑众多的男神女神便捷的就餐地点。而兴业苑的叔叔阿姨更是对饭菜份量绝对不含糊，深刻关心同学们的营养问题，那可是一勺就一勺，半分手不抖。打包速度之快，重邮就此一家，别无分号。这可是让明理苑、知行苑等的同学嫉妒兴业苑的地理位置得不行呢！",

            "千喜鹤——上过微博热搜的网红食堂，地处明理苑片区，学生宿舍管理中心对面，与延生食堂是“上下层”关系。“五彩琉璃瓦，星光耀重邮。”作为开放到夜晚的千喜鹤食堂，华丽的八角灯和亮丽的小彩灯在五颜六色的高脚凳的映衬下特别有小酒吧的文艺清新范。而美食更多，不仅有水果烤肉套餐、麦嘉基炸鸡，还有文艺的过桥米线，更重要的是在千喜鹤你能享受到下午茶待遇，蛋糕和甜点绝对千喜鹤一大特色。而传说中的“别人家的食堂”现在就是你家的食堂啦！",

            "这，就是学校唯一的清真食堂啦！相对来说这里应该是重邮打包最为方便的地方，里面的阿姨也都是少数民族哟！如果有宗教信仰的小伙伴或者想尝尝大西北特色的同学一定不要错过这里。既然是大西北，西北的美食——兰州拉面也是最为出名的，但我们的大西北食堂同样不遑多让，不仅这里的面韧劲十足，这里的汤也是鲜美可口。如果去大西北，一定要点上一碗牛肉拉面尝尝这里的特色。",

            "千喜鹤之下的优秀食堂，美食窗口众多，各有特色，每年都会不断推陈出新，更重要的是性价比非常高，因此吸引了莘莘学子，客流量很大。来自”延生”不断的热情推出了石锅拌饭、冒菜，咖喱炒饭等特色。而食堂的剁椒拌面绝对符合重庆特色。如果你感觉很辣，那来杯西瓜汁降降火。食堂内有各种鲜榨果汁。军训那几天，喝上一杯延生西瓜汁，真是降火消暑又愉悦人心，睡上一个饱饱的午觉。嗯，该到延生吃饭了哟！",

    };
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

    public SchoolMessAdapter(Context context, FragmentActivity activity) {
        this.context=context;
        this.activity=activity;
    }

    @Override
    public SchoolMessAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_mess, parent, false);
        SchoolMessAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(SchoolMessAdapter.ViewHolder holder, final int position) {
        holder.mess_describe_content.setText(text_contents[position]);
        holder.mess_describe_title.setText(text_titles[position]);
        holder.img_mess.setOnClickListener(new View.OnClickListener() {

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
        return text_titles.length;
    }

        class  ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView img_mess;
        private final TextView mess_describe_title;
        private final TextView mess_describe_content;

        public ViewHolder(View view) {
            super(view);
            img_mess = (ImageView) view.findViewById(R.id.img_mess);
            mess_describe_title = (TextView) view.findViewById(R.id.mess_describe_title);
            mess_describe_content = (TextView) view.findViewById(R.id.mess_describe_content);
        }
    }


}
