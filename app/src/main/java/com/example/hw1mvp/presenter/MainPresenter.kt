package com.example.hw1mvp.presenter

import com.example.hw1mvp.R
import com.example.hw1mvp.databinding.ActivityMainBinding
import com.example.hw1mvp.model.CountersModel
import com.example.hw1mvp.view.MainView

class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    fun counterClick(id: Int) {
        when(id){
            R.id.button_1->{
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            R.id.button_2->{
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            R.id.button_3->{
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }
}