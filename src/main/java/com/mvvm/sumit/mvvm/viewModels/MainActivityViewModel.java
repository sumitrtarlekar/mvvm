package com.mvvm.sumit.mvvm.viewModels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.mvvm.sumit.mvvm.models.User;
import com.mvvm.sumit.mvvm.repositiories.UserRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<User>> userList;
    private UserRepository userRepository;

    public void init(){
        if (userList != null) {
            return;
        }
        userRepository = UserRepository.getInstance();
        userList= userRepository.getUsers();

    }

    public LiveData<List<User>> getUserList(){
        return userList;
    }


}
