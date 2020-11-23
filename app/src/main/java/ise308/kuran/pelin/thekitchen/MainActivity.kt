package ise308.kuran.pelin.thekitchen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
* In my project, to be creative I wanted to push limits. Most of the time we are tend to think complex, but this time I tried create my hierarchy from a real life routine with a story. Since many of us live in an apartment I wanted to create an apartment first.
* Then, I created a basic house with some properties such as wall's paint brand and parquet type. There are several functions in the house class and their duties explained in the class itself.
* Finally, when I think about a basic house, kitchen always comes first in my mind, therefore I decided to create a kitchen class.
* The reason I inherited the kitchen class from the house is they share the same constructions and they serve for the same people, and kitchen is inside the house.
*
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun houseInfoCollector() {
        var myHouse = House("Filli Boya", "Antique Wood")
        var myKitchen = Kitchen("Behr", "mosaic parquet", 30)
        var residents = Apartment()

        residents.residents()
        //Override a function
        myHouse.size()
        myKitchen.size()
        myHouse.information()
        print("Color of the kitchen is ${myKitchen.paint} and rest of the house is ${myHouse.paint}")
        //Overload a function
        print("What is happening in the kitchen?")
        myKitchen.stove("Imambayildi")
        print("What do you have for the guests?")
        myKitchen.stove("Cake", "Turkish Coffee")
        print("Before you sleep, be sure that you locked the door.")
        myHouse.doorLocker(true)
        print("Good Night...")
        myHouse.information()

    }
}
