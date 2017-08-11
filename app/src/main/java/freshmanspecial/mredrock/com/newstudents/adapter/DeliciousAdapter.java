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
public class DeliciousAdapter extends  RecyclerView.Adapter<DeliciousAdapter.ViewHolder> {
    private String titles[]={

    };
    private String content[]={

    };
    private String adress[]={

    };


    @Override
    public DeliciousAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_delicious, parent, false);
        DeliciousAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(DeliciousAdapter.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return adress.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView img_delicious;
        private final TextView tv_delicious_title;
        private final TextView tv_delicious_content;
        private final TextView tv_delicious_address;

        public ViewHolder(View view) {
            super(view);
            img_delicious = (ImageView) view.findViewById(R.id.iv_delicious_image);
            tv_delicious_title = (TextView) view.findViewById(R.id.tv_delicious_title);
            tv_delicious_content = (TextView) view.findViewById(R.id.tv_delicious_content);
            tv_delicious_address = (TextView) view.findViewById(R.id.tv_delicious_address);
        }
    }
}
