package com.hpj.gaurav.myshop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
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
import com.hpj.gaurav.myshop.fragment.GalleryFragment;
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

        if (id == R.id.nav_camera) {
            setTitle("home");
            Fragment fragment =new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();
        } else if (id == R.id.nav_gallery) {
            setTitle("gallery");
            Fragment fragment =new GalleryFragment();
            fragmentManager.beginTransaction().replace(R.id.content_main,fragment).commitAllowingStateLoss();

        } else if (id == R.id.nav_slideshow) {
            setTitle("quality");
            Fragment fragment =new QualityFragment();

        } else if (id == R.id.nav_manage) {
            setTitle("rate/price");
            Fragment fragment =new RateFragment();

        } else if (id == R.id.nav_share) {
            setTitle("About Us");
            Fragment fragment =new AboutUsFragment();

        } else if (id == R.id.nav_send) {
            setTitle("contact");
            Fragment fragment =new ContactFragment();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
