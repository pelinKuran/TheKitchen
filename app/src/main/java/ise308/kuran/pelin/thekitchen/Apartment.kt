package ise308.kuran.pelin.thekitchen

import android.util.Log

const val INVALID_ARG = -1

open class Apartment {
    val TAG = "Apartment"

    init {
        Log.i(TAG, "'s being investigating...")
    }

    val Houses = arrayOf(
        arrayOf("Ali", 3),
        arrayOf("Bugra", 4),
        arrayOf("Pelin", 5)

    )

    fun residents() {
        for (House in Houses) {
            print("Residents of this apartment are $House")
        }

    }

}