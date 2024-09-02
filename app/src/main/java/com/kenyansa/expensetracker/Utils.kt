package com.kenyansa.expensetracker

import java.text.SimpleDateFormat
import java.util.Locale

object Utils {

    fun formatDateToHumanReadable(dateInMillis: Long) : String{
        val dateFormatter = SimpleDateFormat("dd/MMM/yyyy", Locale.getDefault())
        return dateFormatter.format(dateInMillis)

    }
}