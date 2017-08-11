package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.ViewPagerAdapter;


public class Fr_StudentOrganization extends BaseFragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private List<String> Titles = new ArrayList<>();

    private List<Fragment> FrList = new ArrayList<Fragment>();

    private Fr_RedRock fr_redRock;
    public static Fragment getFragment()
    {
        Fr_StudentOrganization organization = new Fr_StudentOrganization();
        return organization;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_studentorganization,container,false);
        init(view);
        return view;
    }
    private void init(View view)
    {

        Titles.add("校团委");
        Titles.add("红岩网校");
        Titles.add("科联");
        Titles.add("校青协");
        Titles.add( "大艺团");
        Titles.add( "校学生会");
        Titles.add("社联");
        FrList.add(Fr_Tuanwei.getFragment());
        FrList.add(Fr_RedRock.getFragmnet());
        FrList.add(Fr_StudentScience.getFragment());
        FrList.add(Fr_VolunteerUnion.getFragment());
        FrList.add(Fr_ArticalUnion.getFragment());
        FrList.add(Fr_StudentUnion.getFragment());
        FrList.add(Fr_OrganizationUnion.getFragment());


        viewPager = (ViewPager)view.findViewById(R.id.organization_viewPager);
        viewPager.setOffscreenPageLimit(7);
        adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(),getContext()
                ,Titles,FrList);
        viewPager.setAdapter(adapter);


        tabLayout  = (TabLayout)view.findViewById(R.id.organization_tabLayout);
        tabLayout.setupWithViewPager(viewPager);
     //   tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }


}
