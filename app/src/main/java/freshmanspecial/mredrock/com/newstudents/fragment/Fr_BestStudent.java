package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.BestManData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.BestTeacherAdpter;


/**
 * Created by Tecmry on 2017/8/9.
 */

public class Fr_BestStudent extends BaseFragment {

    private RecyclerView Rv;
    private BestTeacherAdpter mAdapter;
    private List<BestManData> list = new ArrayList<BestManData>();

    public static Fragment getFragment()
    {
        Fr_BestStudent frBestStudent = new Fr_BestStudent();
        return frBestStudent;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_beststudent,container,false);
        init(view);
        return view;
    }

    private void init(View view)
    {
        Rv = (RecyclerView)view.findViewById(R.id.Tc_Rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new BestTeacherAdpter(list);
        Rv.setLayoutManager(layoutManager);
        Rv.setAdapter(mAdapter);
    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (isVisible)
        {

        }
    }
}
