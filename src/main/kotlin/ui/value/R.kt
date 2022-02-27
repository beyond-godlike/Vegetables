package ui.value

import androidx.compose.ui.graphics.Color

object R {
    @Suppress("ClassName")
    object color {
        val PictonBlue = Color(0xff30A3E6)
        val BigStone = Color(0xff0D1D32)
        val Elephant = Color(0xff0D2841)
        val WildWatermelon = Color(0xffFF5370)
    }

    @Suppress("ClassName")
    object string {
        const val ACTION_MAIN_CLICK_ME = "Click Me!"
        val month: Array<String> = arrayOf(
            "Jan", "Feb", "March",
            "Apr", "May", "June",
            "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec"
        )
        val tom: Array<String> = arrayOf(
            "tom.png", "empty.png", "empty.png", "empty.png",
            "pot.png", "pot.png", "sap.png",
            "empty.png", "empty.png", "empty.png",
            "empty.png", "empty.png", "pot.png"
        )

        val cucumber: Array<String> = arrayOf(
            "cucumber.png", "empty.png", "empty.png", "empty.png",
            "pot.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val beetroot: Array<String> = arrayOf(
            "beetroot.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val pepper: Array<String> = arrayOf(
            "pepper.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val onion: Array<String> = arrayOf(
            "onion.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val bakl: Array<String> = arrayOf(
            "bakl.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val carrot: Array<String> = arrayOf(
            "carrot.png", "empty.png", "empty.png", "empty.png",
            "pot.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val potato: Array<String> = arrayOf(
            "potato.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "sap.png", "sap.png",
            "empty.png", "empty.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val celery: Array<String> = arrayOf(
            "celery.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val pumpkin: Array<String> = arrayOf(
            "pumpkin.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )
        val cab: Array<String> = arrayOf(
            "cab.png", "empty.png", "empty.png", "empty.png",
            "empty.png", "pot.png", "pot.png",
            "sap.png", "sap.png", "empty.png",
            "empty.png", "empty.png", "empty.png"
        )

        val vegetables: Array<Array<String>> = arrayOf(
            tom, cucumber, beetroot,
            pepper, onion, bakl,
            carrot,potato, celery,
            pumpkin, cab
        )
    }
}