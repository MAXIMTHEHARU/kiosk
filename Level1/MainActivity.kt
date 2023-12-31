@file:Suppress("UNREACHABLE_CODE")

package Level1

fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e:Exception) {
        false
    }
}


fun main() {
    while (true) {
        println("드시고 싶은 종류를 선택하세요")
        println(
            "[ SHAKESHACK MENU ] " +
                    "\n1. Burgers         | 앵거스 비프 통살을 다져만든 버거" +
                    "\n2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림" +
                    "\n3. 3. Drinks          | 매장에서 직접 만드는 음료" +
                    "\n4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주" +
                    "\n0. 종료            | 프로그램 종료"
        )
        val menu = readln()
        if (!menu.isNumeric()) {
            System.err.println("메뉴 입력은 숫자만 가능합니다.")
            continue
        }
        when (menu.toInt()) {
            1 -> {
                println("버거를 선택해주세요")
                println(
                    "[ Burgers MENU ]" +
                            "\n 1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거" +
                            "\n 2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" +
                            "\n 3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거" +
                            "\n 4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" +
                            "\n 5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거" +
                            "\n 0. 뒤로가기      | 뒤로가기"
                )
                val bugMenu = readln()
                if (!menu.isNumeric()) {
                    System.err.println("메뉴 입력은 숫자만 가능합니다.")
                    continue
                }
                when (bugMenu.toInt()) {
                    0 -> {
                        continue
                    }
                }
            }
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
        }
    }
}