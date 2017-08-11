package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.OrganizationData;
import freshmanspecial.mredrock.com.newstudents.R;


/**
 * Created by Tecmry on 2017/8/10.
 */

public class OrganizationAdpter extends RecyclerView.Adapter<OrganizationAdpter.ViewHolder> {
    private List<OrganizationData> list;

    public OrganizationAdpter(List<OrganizationData> list){
            this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_organizationitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.News.setText(list.get(position).getNews());
        holder.Title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Title;
        TextView News;


        public ViewHolder(View itemView) {
            super(itemView);
            Title = (TextView)itemView.findViewById(R.id.contentTextView);
            News = (TextView)itemView.findViewById(R.id.newsTextView_one);
        }
    }
}
