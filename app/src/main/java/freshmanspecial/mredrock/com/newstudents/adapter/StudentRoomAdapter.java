package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;

/**
 * Created by king on 2017/8/3.
 */
public class StudentRoomAdapter extends RecyclerView.Adapter<StudentRoomAdapter.ViewHolder>{

    private String []Room_titles={"明理苑","宁静苑", "兴业苑" ,"知行苑"};
    private String []Room_pre={"（24—31,39）","（8—12，32--35）", "（17--23）" ,"（1—6，15,16）"};
    private String []Room_content={"（位于千喜鹤食堂正街上，可以俯瞰全校以及南山的部分美丽景色，这里也是重邮夏天最凉爽的地方。可以坐私家车直达寝室，周围有两个超市和上铺，并且校车穿过，每个寝室都为6人间，并设有独立卫生间，每一栋楼里面配置有洗衣机可供大家使用，应有尽有，可以尽情满足同学们的平日生活需求。",
            "坐落在美丽的情人坡旁，是妹子们散心聊天约会的好去处；篮球、网球、羽毛球这些周围球场为大家的锻炼提供了方便，与新校区紧连，周边分布有“千喜鹤”、“延生”等食堂。宿舍基本为6人间基本情况与22-24相同且有独立的阳台、卫浴，床铺是上下铺与上床下桌的混搭，人流量很少，环境比较清静。",

            "屹立于悠悠重邮高处，周边风景秀丽，分布在太极运动场周围，，周边有学校的兴业苑食堂及众多的超市、商铺，校车从这里穿过，内部均设有独立卫生间，并在一些楼层设有洗衣机供大家使用，根据每栋宿舍不同，楼层不同分为4人间、6人间两种。4人间都是上床下铺，而6人间则是上下铺与上床下桌的混搭。" ,
            "位于中心食堂附近的1,5,6栋是学校现存最老的寝室，住宿条件比较差，整体情况是每层楼设有公用的卫生间、洗澡间，这也就意味着每个寝室都没有独立卫生间，没有阳台。处于校园中心，上课、生活都极其便利。但位于情人坡附近的15,16栋，是学校标准的4人间，上床下桌，配有阳台，独立卫生间。楼栋周边环境一流，食堂与超市一应俱全，为学习生活提供不少的便利。"};
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
    }


    @Override
    public int getItemCount() {
        return 4;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView img_img_room;
        private final TextView student_describe_title;
        private final TextView student_describe_pre;
        private final TextView student_describe_content;

        public ViewHolder(View view) {
            super(view);
            img_img_room = (ImageView) view.findViewById(R.id.img_room);
            student_describe_title = (TextView) view.findViewById(R.id.student_describe_title);
            student_describe_pre = (TextView) view.findViewById(R.id.student_describe_pre);
            student_describe_content = (TextView) view.findViewById(R.id.student_describe_content);
        }
    }
}
