package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{
    private String titles[]={
           "大金鹰",
           "黄葛古道",
           "重庆抗战遗址博物馆",
           "老君洞",
           "南滨公园",
           "南之山书店",
           "涂山湖",
           "一棵树观景台",
    };
    private String content[]={
            "数十里景物尽收眼底",
            "重庆的“丝绸之道”",
            "历史、自然气息浓厚",
            "重庆主城区最大最主要的宫观",
            "开放带状公园",
            "一间看得见风景的书店",
            "四季景色尽揽眼底",
            "感受山水之城的起伏面貌",
    };
    private String addresses[]={
            "重庆市南岸区南山路25路大金鹰园内",
            "G65包茂高速附近",
            "重庆市南岸区南山植物园路1号",
            "重庆市南岸区龙黄公路",
            "重庆市南岸区南滨路80号",
            "南山公园北路128号",
            "重庆市南岸区崇文路16号",
            "一棵树观景台",
    };

    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_beautiful_place, parent, false);
        PlaceAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(PlaceAdapter.ViewHolder holder, int position) {

        holder.tv_place_address.setText(addresses[position]);
        holder.tv_place_content.setText(content[position]);
        holder.tv_place_title.setText(titles[position]);
    }


    @Override
    public int getItemCount() {
        return addresses.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView iv_place;
        private final TextView tv_place_title;
        private final TextView tv_place_content;
        private final TextView tv_place_address;

        public ViewHolder(View view) {
            super(view);
            iv_place = (ImageView) view.findViewById(R.id.iv_place_image);
            tv_place_title = (TextView) view.findViewById(R.id.tv_place_title);
            tv_place_content = (TextView) view.findViewById(R.id.tv_place_content);
            tv_place_address = (TextView) view.findViewById(R.id.tv_place_address);
        }
    }
}
