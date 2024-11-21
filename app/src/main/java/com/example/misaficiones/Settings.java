package com.example.misaficiones;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.misaficiones.databinding.ActivitySetingsBinding;
import com.example.misaficiones.fr.aficiones.Favoritos;
import com.example.misaficiones.ui.fragments.PaginadorSetings;
import com.google.android.material.tabs.TabLayout;

public class Settings extends AppCompatActivity {

    private ActivitySetingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        binding = ActivitySetingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorSetings paginador = new PaginadorSetings(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabs = binding.setingsTabs;
        tabs.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.go_back) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
