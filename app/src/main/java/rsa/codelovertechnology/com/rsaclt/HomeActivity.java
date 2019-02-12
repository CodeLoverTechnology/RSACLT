package rsa.codelovertechnology.com.rsaclt;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;


import rsa.codelovertechnology.com.rsaclt.Fragments.CategoryFragment;
import rsa.codelovertechnology.com.rsaclt.Fragments.FavoriteFragment;
import rsa.codelovertechnology.com.rsaclt.Fragments.HollywoodFragment;
import rsa.codelovertechnology.com.rsaclt.Fragments.NewsListFragment;
import rsa.codelovertechnology.com.rsaclt.Fragments.ProfileFragment;

public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdaptor adaptor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        tabLayout= (TabLayout) findViewById(R.id.tablayout_id);
        viewPager =(ViewPager) findViewById(R.id.viewpager_id);
        adaptor = new ViewPagerAdaptor(getSupportFragmentManager());
        //Add Fragment Here
        adaptor.AddFragment(new NewsListFragment(),null);
        adaptor.AddFragment(new CategoryFragment(),null);
        adaptor.AddFragment(new FavoriteFragment(),null);
        adaptor.AddFragment(new HollywoodFragment(),null);
        adaptor.AddFragment(new ProfileFragment(),null);

        viewPager.setAdapter(adaptor);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_list);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_movie);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_person);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(3);
    }
}
