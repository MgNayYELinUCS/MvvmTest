package com.example.mvvmtest.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmtest.data.StudentModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    val list = ArrayList<StudentModel>()

    fun getArrayList():List<StudentModel>{
        list.add(StudentModel("Nay Ye Lin",22))
        list.add(StudentModel("Nay Ye Lin",22))
        list.add(StudentModel("Nay Ye Lin",22))
        list.add(StudentModel("Nay Ye Lin",22))
        list.add(StudentModel("Nay Ye Lin",22))

        return list
    }
}



