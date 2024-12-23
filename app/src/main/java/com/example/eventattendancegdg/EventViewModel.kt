package com.example.eventattendancegdg

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

data class Event(
    val title: String,
    val date: String,
    val time: String,
    val venue: String
)

class EventViewModel : ViewModel() {
    val events = mutableStateListOf<Event>()

    init {
        events.addAll(
            listOf(
                Event("Wimbledon Tennis", "March 21-22", "10:30 AM", "Shivaji Auditorium"),
                Event("Basketball Finals", "March 23", "4:00 PM", "Stadium Arena"),
                Event("Swimming Championship", "April 1-2", "9:00 AM", "Olympic Pool")
            )
        )
    }

    fun addEvent(event: Event) {
        events.add(event)
    }
}
