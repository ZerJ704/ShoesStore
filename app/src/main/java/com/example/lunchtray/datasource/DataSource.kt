package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Nike Dunk Low Retro",
            description = "The basketball icon returns with classic details and throwback hoops flair",
            price = 108.00,
        ),
        EntreeItem(
            name = "Nike Air Force 1",
            description = "Crossing hardwood comfort with off-court flair, it puts a fresh spin on what you know best",
            price = 95.90,
        ),
        EntreeItem(
            name = "Nike Air Jordan 1",
            description = "Air jordan 1 retro high og",
            price = 118.90,
        ),
        EntreeItem(
            name = "Nike Zoom Vomero 5",
            description = "Durable cushioning in a street-ready package",
            price = 159.20,
        ),
        EntreeItem(
            name = "Nike Air Jordan 4",
            description = "The Air Jordan 4 Retro upgrades one of Jordan's best-loved silhouettes",
            price = 134.30,
    )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Size US 7",
            description = "25 Centimeters",
            price = 36.40,
        ),
        SideDishItem(
            name = "Size US 8",
            description = "26 Centimeters",
            price = 32.00,
        ),
        SideDishItem(
            name = "Size US 8.5",
            description = "26.5 Centimeters",
            price = 25.60,
        ),
        SideDishItem(
            name = "Size US 9",
            description = "27 Centimeters",
            price = 19.20,
        ),
        SideDishItem(
            name = "Size US 10",
            description = "28 Centimeters",
            price = 12.80,
        ),
        SideDishItem(
            name = "Size US 11",
            description = "29 Centimeters",
            price = 6.40,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "White",
            description = "",
            price = 0.00,
        ),
        AccompanimentItem(
            name = "Gray",
            description = "",
            price = 0.00,
        ),
        AccompanimentItem(
            name = "Black",
            description = "",
            price = 0.00,
        )
    )
}
