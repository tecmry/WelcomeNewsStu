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
public class SchoolEnvirAdapter extends RecyclerView.Adapter<SchoolEnvirAdapter.ViewHolder>{

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_envir, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.img_envir.setImageResource(R.drawable.special_2017_search);
    }


    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView img_envir;
        private final TextView school_describe;

        public ViewHolder(View view) {
            super(view);
            img_envir = (ImageView) view.findViewById(R.id.img_envir);
            school_describe = (TextView) view.findViewById(R.id.school_describe);
        }
    }
}
