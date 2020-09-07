package com.example.runningtracker.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningtracker.repositories.MainRepository

class StatisticalViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
    
}