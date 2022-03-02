package com.example.hw1mvp

import com.example.hw1mvp.presenter.MainPresenter
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito.mock

class MainPresenterTest {
    private val buttonClickIdOne = 0
    private val buttonClickIdTwo = 1
    private val buttonClickIdThree = 2

    private val presenter : MainPresenter = mock(MainPresenter::class.java)

    @Test
    fun buttonClickIdOneTest(){
        presenter.counterClick(buttonClickIdOne)
        Assert.assertEquals(0, buttonClickIdOne)
    }

    @Test
    fun buttonClickIdTwo(){
        presenter.counterClick(buttonClickIdTwo)
        Assert.assertEquals(1, buttonClickIdTwo)
    }

    @Test
    fun buttonClickIdThree(){
        presenter.counterClick(buttonClickIdThree)
        Assert.assertEquals(2, buttonClickIdThree)
    }
}