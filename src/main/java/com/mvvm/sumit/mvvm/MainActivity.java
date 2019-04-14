package com.mvvm.sumit.mvvm;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mvvm.sumit.mvvm.models.User;
import com.mvvm.sumit.mvvm.viewModels.MainActivityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        mainActivityViewModel.init();

        mainActivityViewModel.getUserList().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(@Nullable List<User> users) {
               userAdapter.notifyDataSetChanged();
            }
        });

        RecyclerView rvUser = findViewById(R.id.rvView);

         userAdapter = new UserAdapter(mainActivityViewModel.getUserList().getValue());

        rvUser.setLayoutManager(new LinearLayoutManager(this));
        rvUser.setAdapter(userAdapter);
    }
}
