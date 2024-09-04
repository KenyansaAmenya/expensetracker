package com.kenyansa.expensetracker.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kenyansa.expensetracker.data.ExpenseDataBase
import com.kenyansa.expensetracker.data.dao.ExpenseDao
import com.kenyansa.expensetracker.data.model.ExpenseEntity

class AddExpenseViewModel( val dao: ExpenseDao): ViewModel() {

    suspend fun addExpense(expenseEntity: ExpenseEntity): Boolean {
        return try {
            dao.insertExpense(expenseEntity)
            true
        } catch (ex: Throwable) {
            false
        }
    }
}

class AddExpenseViewModelFactory(private val context: Context): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddExpenseViewModel::class.java)) {
            val dao = ExpenseDataBase.getDatabase(context).expenseDao()
            @Suppress("UNCHECKED_CAST")
            return HomeViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}




