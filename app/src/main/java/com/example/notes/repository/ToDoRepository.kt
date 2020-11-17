package com.example.notes.repository

import androidx.lifecycle.LiveData
import com.example.notes.data.ToDoDao
import com.example.notes.model.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao){
    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()
    val sortByHighPrioity: LiveData<List<ToDoData>> = toDoDao.sortByHighPriority()
    val sortByLowPrioity: LiveData<List<ToDoData>> = toDoDao.sortByLowPriority()

    suspend fun inserData(toDoData: ToDoData){
        toDoDao.inserData(toDoData)
    }

    suspend fun updateData(toDoData: ToDoData){
        toDoDao.updateData(toDoData)
    }

    suspend fun deleteData(toDoData: ToDoData){
        toDoDao.deleteData(toDoData)
    }

    suspend fun deleteAll(){
        toDoDao.deleteAll()
    }

    fun searchDatabase(searchQuery:String): LiveData<List<ToDoData>>{
        return toDoDao.searchDatabase(searchQuery)
    }

}