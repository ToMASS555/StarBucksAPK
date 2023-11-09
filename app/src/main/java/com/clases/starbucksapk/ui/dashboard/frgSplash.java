package com.clases.starbucksapk.ui.dashboard;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.clases.starbucksapk.R;
import com.clases.starbucksapk.databinding.FragmentFrgSplashBinding;

public class frgSplash extends Fragment {
    FragmentFrgSplashBinding binding;
    View view;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFrgSplashBinding.inflate(inflater, container,false);
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        new Handler().postDelayed( () -> Navigation.findNavController(view).navigate(R.id.nav_home),3000);
    }
}