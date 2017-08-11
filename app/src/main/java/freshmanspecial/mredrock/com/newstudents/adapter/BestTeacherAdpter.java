package freshmanspecial.mredrock.com.newstudents.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.BestManData;
import freshmanspecial.mredrock.com.newstudents.R;

/**
 * Created by Tecmry on 2017/8/9.
 */

public class BestTeacherAdpter extends RecyclerView.Adapter<BestTeacherAdpter.ViewHolder> {
    private List<BestManData> list;
    public BestTeacherAdpter(List<BestManData> list){
        this.list = list;
    }
    public interface OnItemClickListner{
        void OnItemClickListner(View view, int position);
    }

    private RecyclerViewAdapter.OnItemClickListner listner;
    public void setItemClickListner(RecyclerViewAdapter.OnItemClickListner listner){
        this.listner=listner;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_bestteacheritem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            BestManData bestManData = list.get(position);
            holder.talk.setText(bestManData.getText());
            holder.imageView.setImageDrawable(bestManData.getDrawable());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView talk;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            talk = (TextView)itemView.findViewById(R.id.special_TV_talkteacher);
            imageView = (ImageView)itemView.findViewById(R.id.special_Iv_bestteacher);
        }
    }
}
