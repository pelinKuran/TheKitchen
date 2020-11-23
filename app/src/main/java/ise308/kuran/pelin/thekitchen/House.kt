package ise308.kuran.pelin.thekitchen

import android.util.Log

open class House(val paintBrand: String, var parquetryType: String) {

    companion object {                       //I don't want this to be inherited
        const val TAG = "House"
    }

    init {
        Log.i(TAG, "is in use...")
    }

    //Secondary constructor
    var decoration: String = ""

    constructor(paintBrand: String, parquetryType: String, rooms: String) : this(
        paintBrand,
        parquetryType
    ) {
        this.decoration = rooms
    }

    open var size: Int = 185
    open fun size() {
        print("Size of the house is $size")
    }

    fun doorLocker(bool: Boolean) {
        if (bool)
            print("Door is locked.")
        else
            print("Door is not locked.")
    }

    //assign wall color here
    open var paint: String
        get() = paint
        set(paint) {
            this.paint = "bone white"
        }

    //Make a call to the properties of a child method through the parent class.
    fun information() {
        Kitchen::furnutures
    }

}
