package Level3

class nextMenu {
    fun NextMenu() {
        while (true) {
            println(
                "[ SHAKESHACK MENU ]\n" +
                        "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                        "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                        "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                        "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                        "\n" +
                        "[ ORDER MENU ]\n" +
                        "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                        "6. Cancel      | 진행중인 주문을 취소합니다."
            )

            var mnChoice = readln()!!
            if (!mnChoice.isNumeric()) {
                System.err.println("메뉴 입력은 숫자만 가능합니다.")
                continue
            }
            when (mnChoice.toInt()) {
                1 -> {

                }



                5 -> {
                    println("[ ORDER MENU ]")

                }
            }
        }
    }
    fun firstMenu() {


    }
}
