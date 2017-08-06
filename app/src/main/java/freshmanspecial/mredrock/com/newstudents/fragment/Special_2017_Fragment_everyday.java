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
import freshmanspecial.mredrock.com.newstudents.adapter.EverdayAdapter;
import freshmanspecial.mredrock.com.newstudents.utils.MyApplication;

/**
 * 日常生活
 */
public class Special_2017_Fragment_everyday extends Fragment {

    private RecyclerView everyday;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_everyday, null);
        everyday = (RecyclerView) view.findViewById(R.id.everyday);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        everyday.setLayoutManager(manager);
        EverdayAdapter everydayAdapter = new EverdayAdapter();
        everyday.setAdapter(everydayAdapter);

        return view;
    }
}
