package freshmanspecial.mredrock.com.newstudents.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import freshmanspecial.mredrock.com.newstudents.R;


public class Special_2017_Fragment_TrainingStyle extends Fragment implements View.OnClickListener {

    private RecyclerView train_style;
    private ImageView vt_video1;
    private ImageView vt_video2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_traingingstyle, null);
        train_style = (RecyclerView) view.findViewById(R.id.rv_train_style);
        vt_video1 = (ImageView) view.findViewById(R.id.vt_video1);
        vt_video2 = (ImageView) view.findViewById(R.id.vt_video2);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        train_style.setLayoutManager(manager);
        TrainingStyleAdapter Adapter = new TrainingStyleAdapter();
        train_style.setAdapter(Adapter);

        //点击事件
        vt_video1.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.vt_video1:
                Uri uri = Uri.parse("https://v.qq.com/x/page/p0522eqzqzz.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.vt_video2:
                Uri uri2 = Uri.parse("https://v.qq.com/x/page/f0526oi2zyx.html");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
        }
    }

    private class TrainingStyleAdapter extends RecyclerView.Adapter<TrainingStyleAdapter.ViewHolder>{

        @Override
        public TrainingStyleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_2017_item_trainingstyle, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;

        }

        @Override
        public void onBindViewHolder(TrainingStyleAdapter.ViewHolder holder, final int position) {
            holder.train_style_img.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //5.弹出新气泡之前，删除旧气泡
                    hidePopuwindow();
                    View contentView = View.inflate(getContext(), R.layout.special_2017_popu_window_img, null);
                    ImageView big_img = (ImageView) contentView.findViewById(R.id.big_img);
                    big_img.setImageResource(R.drawable.special_2017_chuhua);


                }
            });
        }


        @Override
        public int getItemCount() {
            return 6;
        }

        class ViewHolder extends RecyclerView.ViewHolder{

            private ImageView train_style_img;
            public ViewHolder(View itemView) {
                super(itemView);
                train_style_img= (ImageView) itemView.findViewById(R.id.training_style_img);
            }
        }
    }

    private void hidePopuwindow() {

    }
}
