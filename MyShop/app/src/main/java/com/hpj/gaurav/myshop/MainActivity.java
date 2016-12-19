package com.hpj.gaurav.myshop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.hpj.gaurav.myshop.fragment.AboutUsFragment;
import com.hpj.gaurav.myshop.fragment.ContactFragment;
import com.hpj.gaurav.myshop.fragment.ProductFragment;
import com.hpj.gaurav.myshop.fragment.HomeFragment;
import com.hpj.gaurav.myshop.fragment.QualityFragment;
import com.hpj.gaurav.myshop.fragment.RateFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentManager = getSupportFragmentManager();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            setTitle("settings");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            setTitle("home");
            Fragment fragment =new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();
        } else if (id == R.id.nav_products) {
            setTitle("gallery");
            Fragment fragment =new ProductFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_quality) {
            setTitle("quality");
            Fragment fragment =new QualityFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_rate) {
            setTitle("Rate");
            Fragment fragment =new RateFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_knowlwdge) {
            setTitle("Knowledge Center");
            Fragment fragment = new ContactFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_press) {
            setTitle("Press Rlease");
            Fragment fragment = new ContactFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_about_us) {
            setTitle("About Us");
            Fragment fragment =new AboutUsFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_contact) {
            setTitle("contact");
            Fragment fragment = new ContactFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commitAllowingStateLoss();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
