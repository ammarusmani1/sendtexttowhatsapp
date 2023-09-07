package com.example.sendtexttowhatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.example.sendtexttowhatsapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> {
            // Create an instance of your custom Fragment or use a built-in Fragment
            fragment1 fragment = new fragment1(); // Replace YourFragment with your actual fragment class
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            // Replace the container with the new fragment
            transaction.replace(R.id.linear, fragment);

            // Commit the transaction
            transaction.commit();
        });
    }
}
