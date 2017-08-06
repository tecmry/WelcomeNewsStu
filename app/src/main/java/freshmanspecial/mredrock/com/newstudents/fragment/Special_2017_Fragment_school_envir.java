package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import freshmanspecial.mredrock.com.newstudents.utils.MyApplication;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.SchoolEnvirAdapter;

/**
 * 校园环境
 */
public class Special_2017_Fragment_school_envir extends Fragment {

    private RecyclerView school_envir;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_school_envir, null);
        school_envir = (RecyclerView) view.findViewById(R.id.school_envir);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        school_envir.setLayoutManager(manager);
        SchoolEnvirAdapter envirAdapter = new SchoolEnvirAdapter();
        school_envir.setAdapter(envirAdapter);

        return view;
    }
}
