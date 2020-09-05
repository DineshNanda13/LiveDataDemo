package com.example.livedatademo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingValue: Int) : ViewModel() {

    private var count = MutableLiveData<Int>()
    val totalCount : LiveData<Int>
    get() = count

    init {
        count.value = startingValue
    }

    /*fun getCurrentCount(): Int{
        return count
    }*/

    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }


}