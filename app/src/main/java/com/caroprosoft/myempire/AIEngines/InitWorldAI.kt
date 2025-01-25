package com.caroprosoft.myempire.AIEngines

import com.caroprosoft.myempire.Country
import com.caroprosoft.myempire.data.CountryNames
import kotlin.random.Random

class InitWorldAI (
    val countryCount: Int,
    val difficultyLevel: Int,  // 1-5
    val sizeMap: Int // 1-5
) {
    init {

    }

    fun createCountry() : Country {
        return Country(createCountryName(), createCountryPeople(), createCountryMoney(), createCountryArmy(), 20, 1)
    }

    fun createCountryName() : String {
        return CountryNames.entries[Random.nextInt(0, CountryNames.values().size - 1)].toString()
    }

    fun createCountryPeople() : Int {
        return Random.nextInt(1, 100)
    }

    fun createCountryMoney() : Int {
        return Random.nextInt(1, 100)
    }

    fun createCountryArmy() : Int {
        return Random.nextInt(1, 100)
    }
}