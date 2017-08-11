package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.View.PieChartView;


/**
 * Created by Tecmry on 2017/8/2.
 */

public class Fr_Work extends Fragment {
    private PieChartView pieChartView;
    private TextView textView;
    public static Fragment getFragment()
    {
        Fr_Work Fr_Work = new Fr_Work();
        return Fr_Work;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_work,container,false);
        pieChartView = (PieChartView)view.findViewById(R.id.work_PieChartView);
        textView = (TextView)view.findViewById(R.id.work_Tv);

        return view;
    }


}
