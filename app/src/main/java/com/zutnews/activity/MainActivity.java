package com.zutnews.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sakura.zutnews.R;
import com.zutnews.fragment.AttentionFragment;
import com.zutnews.fragment.MineFragment;
import com.zutnews.fragment.NewsFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout ml;

    AttentionFragment attentionFragment = new AttentionFragment();
    MineFragment mineFragment = new MineFragment();
    NewsFragment newsFragment = new NewsFragment();




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getFragmentManager().beginTransaction().replace(R.id.ml,newsFragment).commit();

                    return true;
                case R.id.navigation_dashboard:
                    getFragmentManager().beginTransaction().replace(R.id.ml,attentionFragment).commit();

                    return true;
                case R.id.navigation_notifications:
                    getFragmentManager().beginTransaction().replace(R.id.ml,mineFragment).commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ml = findViewById(R.id.ml);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getFragmentManager().beginTransaction().replace(R.id.ml,newsFragment).commit();
    }

}
