package com.example.mytoolbox

import java.math.RoundingMode
import java.text.DecimalFormat

fun Double.tbx_toOneDecimal() : String {

    val db = DecimalFormat("#.#")
    db.roundingMode = RoundingMode.DOWN
    return db.format(this)
}