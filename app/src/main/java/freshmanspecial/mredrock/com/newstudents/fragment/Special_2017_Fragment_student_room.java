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
import freshmanspecial.mredrock.com.newstudents.adapter.StudentRoomAdapter;
import freshmanspecial.mredrock.com.newstudents.utils.MyApplication;

/**
 * 学生寝室
 */
public class Special_2017_Fragment_student_room extends Fragment {
    private RecyclerView student_room;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_student_room, null);
        student_room = (RecyclerView) view.findViewById(R.id.student_room);
        LinearLayoutManager manager = new LinearLayoutManager(MyApplication.getContext());
        student_room.setLayoutManager(manager);
        new StudentRoomAdapter();

        return view;
    }
}
