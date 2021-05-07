package com.example.covidresourceskotlin.Models

class StateModelData(title: String?, confirmed_cases: String?, discharged_cases: String?, total_deaths: String?) {
    private var title: String
    private var confirmed_cases: String
    private var discharged_cases: String
    private var total_deaths: String


    init {
        this.title = title!!
        this.confirmed_cases = confirmed_cases!!
        this.discharged_cases = discharged_cases!!
        this.total_deaths = total_deaths!!
    }
    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
    fun getCcases(): String? {
        return confirmed_cases
    }
    fun setCcases(year: String?) {
        this.confirmed_cases = confirmed_cases!!
    }
    fun getDcases(): String? {
        return discharged_cases
    }
    fun setDcases(genre: String?) {
        this.discharged_cases = discharged_cases!!
    }
    fun getdeaths(): String? {
        return total_deaths
    }
    fun setdeaths(genre: String?) {
        this.total_deaths = total_deaths!!
    }


}



