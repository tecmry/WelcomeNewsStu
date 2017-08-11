package freshmanspecial.mredrock.com.newstudents.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

   private List<String> Titles = new ArrayList<>();
    private Context context;
    private List<Fragment> list;
    /**
     * 当数据发生改变时的回调接口
     */
   // private OnReloadListener mListener;
    public ViewPagerAdapter(FragmentManager fm, Context context, List<String> Titles, List<Fragment> list)
    {
        super(fm);
        this.context = context;
        this.Titles = Titles;
        this.list  = list;
    }

    @Override
    public Fragment getItem(int position) {
       for (int i = 0 ; i < list.size() ; i++)
       {
           if (position == i)
           {
                return list.get(i);
           }
       }
        return list.get(0);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        System.out.println("getPageTitle" + position);
        return Titles.get(position);
    }






}
