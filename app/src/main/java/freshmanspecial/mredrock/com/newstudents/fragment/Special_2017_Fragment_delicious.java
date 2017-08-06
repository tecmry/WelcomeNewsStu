package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.DeliciousAdapter;
import freshmanspecial.mredrock.com.newstudents.adapter.EverdayAdapter;
import freshmanspecial.mredrock.com.newstudents.utils.MyApplication;

/**
 * 周边美食
 */
public class Special_2017_Fragment_delicious extends Fragment {
    private RecyclerView delicious;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_delicious, null);
        delicious= (RecyclerView) view.findViewById(R.id.delicious);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        delicious.setLayoutManager(manager);
        DeliciousAdapter Adapter = new DeliciousAdapter();
        delicious.setAdapter(Adapter);
        return view;
    }
}
