package com.nikhilv.profileactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void personal(View view){

        profile Profile = profile.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container_view_tag, Profile).addToBackStack(null).commit();
        Toast.makeText(this, "Press back to open profile", Toast.LENGTH_SHORT).show();

    }

    public void friends(View view){
        friends Friends = friends.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container_view_tag, Friends).addToBackStack(null).commit();
        Toast.makeText(this, "Press back to open profile", Toast.LENGTH_SHORT).show();
    }

    public void groups (View view){
        groups Groups = groups.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container_view_tag, Groups).addToBackStack(null).commit();
        Toast.makeText(this, "Press back to open profile", Toast.LENGTH_SHORT).show();
    }

    public void spotify (View view){
        spotify Spotify = spotify.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container_view_tag, Spotify).addToBackStack(null).commit();
        Toast.makeText(this, "Press back to open profile", Toast.LENGTH_SHORT).show();
    }
    public void linkedin (View view){
        linkedin Linkedin = linkedin.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container_view_tag, Linkedin).addToBackStack(null).commit();
        Toast.makeText(this, "Press back to open profile", Toast.LENGTH_SHORT).show();
    }

    public void github (View view){
        github Github = github.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container_view_tag, Github).addToBackStack(null).commit();
        Toast.makeText(this, "Press back to open profile", Toast.LENGTH_SHORT).show();
    }

}