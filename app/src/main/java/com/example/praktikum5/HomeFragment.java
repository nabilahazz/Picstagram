package com.example.praktikum5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.praktikum5.DataSource;
import com.example.praktikum5.Instagram;
import com.example.praktikum5.PostinganAdapter;
import com.example.praktikum5.R;
import com.example.praktikum5.MainActivity;

public class HomeFragment extends Fragment {

    public static final String EXTRA_INSTAGRAM = "extra_instagram";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvPostingan = view.findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);
        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.instagrams);
        rvPostingan.setAdapter(postinganAdapter);

        Bundle bundle = getArguments();
        if (bundle != null) {
            Instagram instagram = bundle.getParcelable(EXTRA_INSTAGRAM);
            if (instagram != null) {
                DataSource.instagrams.add(0, instagram);
                postinganAdapter.notifyDataSetChanged();
            }
        }

        ImageView iv_posting = view.findViewById(R.id.IV_Post);
        ImageView iv_profile = view.findViewById(R.id.IV_Profile);
        ImageView iv_search = view.findViewById(R.id.IV_Search);

        iv_search.setOnClickListener(v -> {
            SearchFragment searchFragment = new SearchFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, searchFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_posting.setOnClickListener(v -> {
            com.example.praktikum5.PostinganFragment postinganFragment = new com.example.praktikum5.PostinganFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, postinganFragment)
                    .addToBackStack(null)
                    .commit();
        });

        iv_profile.setOnClickListener(v -> {
            com.example.praktikum5.ProfileFragment profileFragment = new com.example.praktikum5.ProfileFragment();
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, profileFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}