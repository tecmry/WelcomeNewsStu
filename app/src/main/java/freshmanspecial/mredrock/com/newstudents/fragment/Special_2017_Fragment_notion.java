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
import freshmanspecial.mredrock.com.newstudents.adapter.NotionAdapter;
import freshmanspecial.mredrock.com.newstudents.adapter.SchoolEnvirAdapter;
import freshmanspecial.mredrock.com.newstudents.utils.MyApplication;


/**
 * 入学须知
 */
public class Special_2017_Fragment_notion extends Fragment {

    private RecyclerView notion;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_notion, null);
        /*notion = (RecyclerView) view.findViewById(R.id.notion);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        notion.setLayoutManager(manager);
        NotionAdapter adapter = new NotionAdapter();
        notion.setAdapter(adapter);*/

        return view;
    }
}
