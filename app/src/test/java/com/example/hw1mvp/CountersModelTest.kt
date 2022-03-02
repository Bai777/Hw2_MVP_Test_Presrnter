package com.example.hw1mvp

import com.example.hw1mvp.model.CountersModel
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class CountersModelTest {
    private val model: CountersModel = mock(CountersModel::class.java)
    private val index = 0

    @Test
    fun nextTest() {
        `when`(model.next(index)).thenReturn(0)
        assertEquals(index, model.next(0))
    }
}