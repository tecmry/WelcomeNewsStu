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

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_everyday, parent, false);
        EverdayAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(EverdayAdapter.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView img_everyday;
        private final TextView everyday_describe;

        public ViewHolder(View view) {
            super(view);
            img_everyday = (ImageView) view.findViewById(R.id.img_everyday);
            everyday_describe = (TextView) view.findViewById(R.id.everyday_describe);
        }
    }
}
