package ise308.kuran.pelin.thekitchen

import android.util.Log

class Kitchen(paintBrand: String, parquetryType: String, var roomSize: Int) :
    House(paintBrand, parquetryType) {
    //We have primary constructor in this class.
    //This class is inherited from the house class.
    companion object {
        const val TAG = "Kitchen"
    }

    init {
        Log.i(TAG, "is being used by the resident..")
    }

    private lateinit var furnuture: Array<String>
    fun furnutures() {
        furnuture = arrayOf("Table", "Refrigerator", "Stove", "Sink")
        for (element in furnuture)
            print("In this houses kitchen we have $element")

    }

    override var size = roomSize
    override fun size() {
        print("Size of the kitchen is $size meter square")
    }

    //Overload a function.
    fun stove(food: String) {
        print("I am cooking $food")
    }

    fun stove(food: String, beverage: String) {
        print("$beverage is boiling and $food is being cook.")
    }

    //override the setter of the property.
    override var paint: String
        get() = paint
        set(paint) {
            this.paint = "black"


        }


}