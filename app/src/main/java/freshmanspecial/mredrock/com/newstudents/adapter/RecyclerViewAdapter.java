package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.BeautifulData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.View.special_2017_RoundedImageView;


/**
 * Created by Tecmry on 2017/8/7.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<BeautifulData> list;


    public RecyclerViewAdapter(List<BeautifulData> list)
    {
        this.list = list;
    }

    public interface OnItemClickListner{
        void OnItemClickListner(View view, int position);
    }

    private OnItemClickListner listner;
    public void setItemClickListner(OnItemClickListner listner){
        this.listner=listner;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_beautifulitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        BeautifulData beautifulData = list.get(position);
        holder.Tv_Title.setText(beautifulData.getTitle());
        holder.Tv_News.setText(beautifulData.getNews());
            TextPaint tp = holder.Tv_News.getPaint();
        System.out.println("Beautiful"+position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Tv_Title;
        TextView Tv_News;
        special_2017_RoundedImageView Iv;
        public ViewHolder(View itemView) {
            super(itemView);
            Tv_News = (TextView)itemView.findViewById(R.id.beautifulitem_news);
            Tv_Title = (TextView)itemView.findViewById(R.id.beautifulitem_title);
            Iv = (special_2017_RoundedImageView) itemView.findViewById(R.id.beautifulitem_Iv);
        }
    }
}
