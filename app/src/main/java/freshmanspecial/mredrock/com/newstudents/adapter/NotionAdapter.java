package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;

/**
 * Created by king on 2017/8/3.
 */
public class NotionAdapter extends RecyclerView.Adapter<NotionAdapter.ViewHolder>{

    @Override
    public NotionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_notion, parent, false);
        NotionAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(NotionAdapter.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView top_title;
        private TextView describe;

        public ViewHolder(View itemView) {
            super(itemView);
            top_title = (TextView) itemView.findViewById(R.id.top_title);
            describe = (TextView) itemView.findViewById(R.id.describe);
        }
    }
}
