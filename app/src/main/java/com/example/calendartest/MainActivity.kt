package com.example.calendartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calendartest.databinding.ActivityMainBinding
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView

class MainActivity : AppCompatActivity(){

    private lateinit var binding : ActivityMainBinding
    lateinit var calendar : MaterialCalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calendar = binding.calendarView
        val today = CalendarDay.today()
        calendar.addDecorators(TodayDecorator(this, today), SaturdayDecorator(), SundayDecorator())

    }
}