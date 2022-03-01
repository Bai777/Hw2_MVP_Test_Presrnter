package com.example.hw1mvp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hw1mvp.databinding.ActivityMainBinding
import com.example.hw1mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this)

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        binding!!.button1.setOnClickListener(listener)
        binding!!.button2.setOnClickListener(listener)
        binding!!.button3.setOnClickListener(listener)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun setButtonText(index: Int, text: String) {
        when(index){
            0->binding!!.button1.text = text
            1->binding!!.button2.text = text
            2->binding!!.button3.text = text
        }

    }
}