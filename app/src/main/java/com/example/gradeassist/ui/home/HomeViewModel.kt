package com.example.gradeassist.ui.home

import android.content.Intent
import android.view.View
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to GradeAssist"
    }
    val text: LiveData<String> = _text
}