package freshmanspecial.mredrock.com.newstudents.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.CreativeData;
import freshmanspecial.mredrock.com.newstudents.R;


/**
 * Created by Tecmry on 2017/8/9.
 */

public class CraetiveCquptAdapter extends RecyclerView.Adapter<CraetiveCquptAdapter.ViewHolder> {

    private Context context;
    private List<CreativeData> list;
    public CraetiveCquptAdapter(List<CreativeData> list,Context context)
    {
        this.list = list;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_creativeitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.rightTv.setText(list.get(position).getRight_name());
        holder.leftTv.setText(list.get(position).getLeft_name());
        Glide.with(context).load(list.get(position).getLeft()).into(holder.leftIv);
        Glide.with(context).load(list.get(position).getRight()).into(holder.rightIv);
        holder.leftIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                Uri uri = Uri.parse(list.get(position).getLeft_uri());
                intent.setData(uri);
                context.startActivity(Intent.createChooser(intent, "请选择浏览器"));
            }
        });

        holder.rightIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                Uri uri = Uri.parse(list.get(position).getRight_uri());
                intent.setData(uri);
                context.startActivity(Intent.createChooser(intent, "请选择浏览器"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView leftTv;
        TextView rightTv;
        ImageView leftIv;
        ImageView rightIv;
        public ViewHolder(View itemView) {
            super(itemView);
            leftIv = (ImageView)itemView.findViewById(R.id.creativeleft_Iv);
            leftTv = (TextView)itemView.findViewById(R.id.creativeleft_Tv);
            rightIv = (ImageView)itemView.findViewById(R.id.creativeright_Iv);
            rightTv = (TextView)itemView.findViewById(R.id.creativeright_Tv);
        }
    }
    private void setUrl(int position)
    {
        if (position==0)
        {

        }
    }
    private void startVideo(Uri uri)
    {

    }
}
