package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import freshmanspecial.mredrock.com.newstudents.R;

/**
 *QQ群
 */
public class Special_2017_Fragment_WeChat extends Fragment {

    private EditText weChat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_fragment_wechat, null);
        weChat = (EditText) view.findViewById(R.id.wechat);



        return view;
    }
}
