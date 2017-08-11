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
public class EverdayAdapter extends RecyclerView.Adapter<EverdayAdapter.ViewHolder>{
    private String titles[]={
            "中国工商银行自助服务点",
            "新世纪超市",
            "中国邮政",
            "重庆农村商业银行",
            "ZAKKA生活小铺",
            "永辉超市",
            "多乐迪KTV",
            "渝芳百货商场",
            "联佰大药房",
    };
    private String content[]={
            "距离学校较近，比较方便",
            "各类物品较为齐全",
            "可以办理相关业务，取存款等。 ",
            "方便取存款，办理业务。",
            "文具等用品齐全",
            "物品齐全，价钱相对便宜",
            "环境较好，是个唱歌的好地方",
            "物品较为丰富",
            "药品相对齐全",
    };
    private String adress[]={

            "重庆邮电大学旁，新校门出门，左转直走，老校门出门，右转直走",
            "重庆邮电大学旁，新校门出门右转，过一条马路直走",
            "重庆邮电大学旁，老校门出门，右转。新校门出们，左转",
            "重庆邮电大学旁，老校门出门，过马路，右转",
            "重庆邮电大学旁，新校门出门，左转直走，老校门出门，右转直走",
            "重庆邮电大学旁，新校门出门过马路，右转直走",
            "重庆邮电大学旁，新校门出门右转，中国农业银行楼下",
            "重庆邮电大学旁，新校门出门，左转直走。老校门出门，右转直走",
            "重庆邮电大学旁，新校门出门，过马路，右转直走",
    };

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_everyday, parent, false);
        EverdayAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(EverdayAdapter.ViewHolder holder, int position) {
        holder.tv_everyday_address.setText(adress[position]);
        holder.tv_everyday_content.setText(content[position]);
        holder.tv_everyday_title.setText(titles[position]);
    }


    @Override
    public int getItemCount() {
        return adress.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView img_everyday;
        private final TextView tv_everyday_title;
        private final TextView tv_everyday_content;
        private final TextView tv_everyday_address;

        public ViewHolder(View view) {
            super(view);
            img_everyday = (ImageView) view.findViewById(R.id.iv_everyday_image);
            tv_everyday_title = (TextView) view.findViewById(R.id.tv_everyday_title);
            tv_everyday_content = (TextView) view.findViewById(R.id.tv_everyday_content);
            tv_everyday_address = (TextView) view.findViewById(R.id.tv_everyday_address);
        }
    }
}
