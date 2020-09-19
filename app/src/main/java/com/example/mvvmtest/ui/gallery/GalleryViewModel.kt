package com.example.mvvmtest.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmtest.data.StudentModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text

    val studentModel = MutableLiveData<StudentModel>().apply {
        value = StudentModel("Mg Mg",15)
    }
    val data:LiveData<StudentModel> = studentModel
}