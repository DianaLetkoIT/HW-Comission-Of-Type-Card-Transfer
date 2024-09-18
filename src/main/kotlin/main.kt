fun main() {
    val typeOfCard = "Mastercard"
    var previousTransfers = 500000
    var currentTransfers: Int = 15000
    var answer = isComission(typeOfCard, previousTransfers, currentTransfers)
    println(answer)


}


fun isComission(typeOfCard: String, previousTransfers: Int, currentTransfers: Int) =
    if (previousTransfers + currentTransfers <= 600000) {
        if (currentTransfers <= 150000) {
            when {
                typeOfCard == "Mastercard" -> {
                    if (previousTransfers < 75000) {
                        if (currentTransfers + previousTransfers > 75000) {
                            var comission = (currentTransfers - (75000 - previousTransfers)) * 0.006 + 20
                            "Комиссия равна $comission руб"
                        } else {
                            "Комиссия равна 0 руб"
                        }
                    } else {
                        var comission = currentTransfers * 0.006 + 20
                        "Комиссия рвна $comission руб"
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


    } else if (previousTransfers < 600000) {
        if (currentTransfers <= (600000 - previousTransfers)) {
            if (currentTransfers <= 150000) {
                when {
                    typeOfCard == "Mastercard" -> {
                        if (previousTransfers < 75000) {
                            if (currentTransfers + previousTransfers > 75000) {
                                var comission = (currentTransfers - (75000 - previousTransfers)) * 0.006 + 20
                                "Комиссия равна $comission руб"
                            } else {
                                "Комиссия равна 0 руб"
                            }
                        } else {
                            var comission = currentTransfers * 0.006 + 20
                            "Комиссия рвна $comission руб"
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
            var letTransfer = 60000 - previousTransfers
            if (letTransfer <= 150000) {
                when {
                    typeOfCard == "Mastercard" -> {
                        if (previousTransfers < 75000) {
                            if (letTransfer + previousTransfers > 75000) {
                                var comission = (letTransfer - (75000 - previousTransfers)) * 0.006 + 20
                                "Комиссия равна $comission руб"
                            } else {
                                "Комиссия равна 0 руб"
                            }
                        } else {
                            var comission = letTransfer * 0.006 + 20
                            "Комиссия рвна $comission руб"
                        }
                    }

                    typeOfCard == "Visa" -> {
                        if (letTransfer * 0.0075 >= 35) {
                            var comission = letTransfer * 0.0075
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
        }
    } else {
        "В месяц можно переводить не больше 600 000 руб"
    }






