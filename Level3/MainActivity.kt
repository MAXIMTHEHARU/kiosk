@file:Suppress("UNREACHABLE_CODE")

package Level3

fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e:Exception) {
        false
    }
}


fun main() {
    val burgers = arrayListOf<Burger>()
    val orders = arrayListOf<order>()
    val ntMenu = nextMenu()
    while (true) {
        println("SHAKESHACK BURGER 에 오신걸 환영합니다." +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println(
            "[ SHAKESHACK MENU ] " +
                    "\n1. Burgers         | 앵거스 비프 통살을 다져만든 버거" +
                    "\n2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림" +
                    "\n3. Drinks          | 매장에서 직접 만드는 음료" +
                    "\n4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주" +
                    "\n0. 종료            | 프로그램 종료"
        )
        val menu = readln()
        if (!menu.isNumeric()) {
            System.err.println("메뉴 입력은 숫자만 가능합니다.")
            continue
        }
        if (menu.toInt() > 4) {
            System.err.println()
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
                if (!bugMenu.isNumeric()) {
                    System.err.println("메뉴 입력은 숫자만 가능합니다.")
                    continue
                }
                when (bugMenu.toInt()) {
                    0 -> {
                        continue
                    }
                    1 -> {
                        println("ShackBurger를 선택 하셨습니다.")
                        val shackBurger = ShackBurger("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")

                        shackBurger.choice()
                        println("위메뉴를 장바구니에 추가하시겠습니까?" +
                                "\n 1. 확인  2. 취소")
                        val addChoice = readln()
                        if(!addChoice.isNumeric()) {
                            System.err.println("1번과 2번 중 선택 가능합니다.")
                            continue
                        }
                        if(addChoice.toInt() >2)
                            println("잘못 된 선택입니다.")

                        when (addChoice.toInt()){
                            1 -> {
                                println("${shackBurger.name}가 장바구니에 추가 되었습니다.")
                                ntMenu.NextMenu()
                            }
                            2 -> {
                                continue
                            }
                        }


                    }
                    2 -> {
                        println("SmokeShack를 선택하셨습니다.")
                        val smokeShack = SmokeShack("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")

                        smokeShack.choice()
                        println("위메뉴를 장바구니에 추가하시겠습니까?" +
                                "\n 1. 확인  2. 취소")
                        val addChoice = readln()
                        if(!addChoice.isNumeric()) {
                            System.err.println("1번과 2번 중 선택 가능합니다.")
                            continue
                        }
                        if(addChoice.toInt() >2)
                            System.err.println("잘못 된 선택입니다.")

                        when (addChoice.toInt()){
                            1 -> {
                                println("${smokeShack.name}가 장바구니에 추가 되었습니다.")
                                ntMenu.NextMenu()
                            }
                            2 -> {
                                continue
                            }
                        }
                    }
                    3 -> {
                        println("ShroomBurger를 선택하셨습니다.")
                        val shroomBurger = ShroomBurger("ShroomBurger", 9400, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")

                        shroomBurger.choice()
                        println("위메뉴를 장바구니에 추가하시겠습니까?" +
                                "\n 1. 확인  2. 취소")
                        val addChoice = readln()
                        if(!addChoice.isNumeric()) {
                            System.err.println("1번과 2번 중 선택 가능합니다.")
                            continue
                        }
                        if(addChoice.toInt() >2)
                            println("잘못 된 선택입니다.")

                        when (addChoice.toInt()){
                            1 -> {
                                println("${shroomBurger.name}가 장바구니에 추가 되었습니다.")
                                ntMenu.NextMenu()
                            }
                            2 -> {
                                continue
                            }

                        }
                    }
                    4 -> {
                        println("Cheeseburger를 선택하셨습니다.")
                        val cheeseBurger = CheeseBurger("CheeseBurger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")

                        cheeseBurger.choice()
                        println("위메뉴를 장바구니에 추가하시겠습니까?" +
                                "\n 1. 확인  2. 취소")
                        val addChoice = readln()
                        if(!addChoice.isNumeric()) {
                            System.err.println("1번과 2번 중 선택 가능합니다.")
                            continue
                        }
                        if(addChoice.toInt() >2)
                            println("잘못 된 선택입니다.")

                        when (addChoice.toInt()){
                            1 -> {
                                println("${cheeseBurger.name}가 장바구니에 추가 되었습니다.")
                                ntMenu.NextMenu()
                            }
                            2 -> {
                                continue
                            }
                        }


                    }
                    5 -> {
                        print("Hamburger를 선택하셨습니다.")
                        val hamBurger = HamBurger("HamBurger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거")

                        hamBurger.choice()
                        println(
                            "위메뉴를 장바구니에 추가하시겠습니까?" +
                                    "\n 1. 확인  2. 취소"
                        )
                        val addChoice = readln()
                        if (!addChoice.isNumeric()) {
                            System.err.println("1번과 2번 중 선택 가능합니다.")
                            continue
                        }
                        if (addChoice.toInt() > 2)
                            println("잘못 된 선택입니다.")

                        when (addChoice.toInt()) {
                            1 -> {
                                println("${hamBurger.name}가 장바구니에 추가 되었습니다.")
                                ntMenu.NextMenu()

                            }

                            2 -> {
                                continue
                            }
                        }
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