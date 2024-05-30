package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
<<<<<<< HEAD
import androidx.fragment.app.FragmentManager;
=======
>>>>>>> d5a76a613f42f13d48b475fe6938a3c219725824
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.fragments.CuadrosFragment;
import com.example.myapplication.fragments.HomeFragment;
import com.example.myapplication.fragments.MapaFragment;
<<<<<<< HEAD
=======
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
>>>>>>> d5a76a613f42f13d48b475fe6938a3c219725824
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    private Fragment fragmentManager = null;
    private FragmentTransaction fragmentTransaction = null;
    private HomeFragment homeFragment = null;
    private CuadrosFragment cuadrosFragment = null;
    private MapaFragment mapaFragment = null;

    private FragmentManager fragmentManager=null;
    private FragmentTransaction fragmentTransaction=null;
    private HomeFragment homeFragment=null;
    private CuadrosFragment cuadrosFragment=null;
    private MapaFragment mapaFragment=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

<<<<<<< HEAD
        fragmentManager = getSupportFragmentManager();

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.menu_home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.menu_home){
                    return true;
                }
                else if(menuItem.getItemId() == R.id.menu_cuadros){
                    return true;
                }
                else if(menuItem.getItemId() == R.id.menu_mapa){
                    return true;
                }
                else {
                    return false;
                }
            }
        });

        TextView welcomeText = findViewById(R.id.welcomeText);
        String username = getIntent().getStringExtra("username");
=======
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.menu_home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return false;
            }
        });
>>>>>>> d5a76a613f42f13d48b475fe6938a3c219725824

    }
    private void loadFragment(Fragment fragment){

    }
}
