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
import freshmanspecial.mredrock.com.newstudents.adapter.PlaceAdapter;
import freshmanspecial.mredrock.com.newstudents.utils.MyApplication;

/**
 * 周边美景
 */
public class Special_2017_Fragment_beautiful_place extends Fragment {
    private RecyclerView place;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_beautiful_place, null);
        place= (RecyclerView) view.findViewById(R.id.place);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        place.setLayoutManager(manager);
        PlaceAdapter adapter = new PlaceAdapter();
        place.setAdapter(adapter);

        return view;
    }
}
