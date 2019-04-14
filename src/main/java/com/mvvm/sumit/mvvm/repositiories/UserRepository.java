package com.mvvm.sumit.mvvm.repositiories;

import android.arch.lifecycle.MutableLiveData;

import com.mvvm.sumit.mvvm.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static UserRepository instance;
    private ArrayList<User> dataSet = new ArrayList<>();

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public MutableLiveData<List<User>> getUsers() {
        setUser();
        MutableLiveData<List<User>> data = new MutableLiveData<>();
        data.setValue(dataSet);

        return data;
    }

    private void setUser() {
        dataSet.add(new User("sumit", "9766378022"));
        dataSet.add(new User("sumit", "9766378022"));
        dataSet.add(new User("sumit", "9766378022"));
        dataSet.add(new User("sumit", "9766378022"));
        dataSet.add(new User("sumit", "9766378022"));
        dataSet.add(new User("sumit", "9766378022"));
    }

}
