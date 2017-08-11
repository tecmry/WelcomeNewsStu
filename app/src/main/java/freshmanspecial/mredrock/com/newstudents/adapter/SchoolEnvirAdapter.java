package freshmanspecial.mredrock.com.newstudents.adapter;

import android.content.Context;
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

import com.bumptech.glide.Glide;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.activity.Special_2017_MainActivity;


/**
 * Created by king on 2017/8/3.
 */
public class SchoolEnvirAdapter extends RecyclerView.Adapter<SchoolEnvirAdapter.ViewHolder>{

    private Context context;
    private Special_2017_MainActivity activity;
    private String []texts_contents={"站在腾飞广场，做着属于我们的腾飞梦，从这一刻便开启了你的大学新篇章。秉持“修德、博学、求实、创新”校训，书写你的重邮梦。很高兴能与你在重邮相遇。",
                    "挑战杯、创青春、互联网+、数模……在各类创新创业竞赛中，都可以看到重邮人的身影，他们不断地充实着大学生活，和重邮人在一起，自己在会变得更好。",
                    "在这里，时间变慢，重邮人的脚步变快。从图书馆开门到熄灯，总会看到埋头学习的重邮人，一整天都可以在窗户透过的光芒里，全神贯注。没错，爱学习的重邮人最好看啦！",
                    "伴着余晖，二教像披着一层朦胧的纱幔，金黄的银杏叶妆点着她的美。漫步在春华秋实广场，邂逅一场邮苑专属浪漫。",
                    "在重邮信科楼旁的高山流水只是简单一个缩影，却包含了重邮学子的内心广阔。流水溅射过青松，把一切都转换为学子的高山俯仰之情。",
                    "红砖绿荫的映衬下的雨红莲，是重邮人的活动聚集地。丰富的校园活动常常在这里开展，洋着重邮人的活力，展示重邮浓厚的校园文化。",
                    "八教是传媒艺术学院的学子艺术灵感的发源地，创意在这里闪亮聚集，也是重邮人乘风破浪，扬帆起航的象征。勇敢追梦吧，重邮学子们。",
    };
    private String[]texts_titles={
            "巍巍南山，美丽重邮",
            "科创信科楼",
            "科创信科楼",
            "夕阳下的二教",
            "高山流水",
            "雨红莲",
            "仰望八教",
    };
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
    private PopupWindow popupWindow;

    public SchoolEnvirAdapter(Context context, Special_2017_MainActivity activity){
        this.context=context;
        this.activity=activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_envir, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //holder.img_envir.setImageResource(imageId[position]);
        Glide.with(context).load(imageId[position]).into(holder.img_envir);
        holder.school_describe_title.setText(texts_titles[position]);
        holder.school_describe_content.setText(texts_contents[position]);
        holder.img_envir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //5.弹出新气泡之前，删除旧气泡
                hidePopuwindow();
                View contentView = View.inflate(context, R.layout.special_2017_popu_window_img, null);
                ImageView big_img = (ImageView) contentView.findViewById(R.id.big_img);
                big_img.setImageResource(imageId[position]);
                popupWindow = new PopupWindow(contentView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                popupWindow.setFocusable(true);


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

                big_img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hidePopuwindow();
                    }
                });

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
        return texts_titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView img_envir;
        private final TextView school_describe_title;
        private final TextView school_describe_content;

        public ViewHolder(View view) {
            super(view);
            img_envir = (ImageView) view.findViewById(R.id.img_envir);
            school_describe_title = (TextView) view.findViewById(R.id.school_describe_title);
            school_describe_content = (TextView) view.findViewById(R.id.school_describe_content);
        }
    }
}
