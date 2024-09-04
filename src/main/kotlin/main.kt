fun main() {
    val typeOfCard = "Visa"
    var previousTransfers = 0
    var currentTransfers: Int = 150000
    var answer = isComission(typeOfCard, previousTransfers, currentTransfers)
    println(answer)


}


fun isComission(typeOfCard: String, previousTransfers: Int, currentTransfers: Int) =
    if (previousTransfers <= 600000) {
        if (currentTransfers <= 150000) {
            when {
                typeOfCard == "Mastercard" -> {
                    if (currentTransfers > 75000) {
                        var comission = (currentTransfers - 75000) * 0.006 + 20
                        "Комиссия равна $comission руб"
                    } else {
                        "Комиссия равна 0 руб"
                    }
                }

                typeOfCard == "Visa" -> {
                    if (currentTransfers * 0.0075 >= 35) {
                        var comission = currentTransfers * 0.0075
                        "Комиссия равна $comission руб"
                    } else {
                        "Комиссия равна 35 руб"
                    }
                }

                else -> {
                    "Комиссия равна 0 руб"
                }
            }

        } else {
            "В день можно переводить не больше 150 000 руб"
        }


    } else {
        "В месяц можно переводить не больше 600 000 руб"
    }





