package realkiosk

import kotlinx.coroutines.delay


val menus: MutableList<Menu> = ArrayList()
val foods: MutableList<food> = ArrayList()


suspend fun main () {
    init()

    while (true) {
        displaymenu()
        var selectNumber = getPureNumber()
        if(selectNumber == 0) {
            println("3초뒤 종료됩니다.")
            globalDelay(3000)
            return
        }

    }

}

fun init() {


    menus.add(Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"))
    menus.add(Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림"))
    menus.add(Menu("Drinks", "매장에서 직접 만드는 음료"))
    menus.add(Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"))
    menus.add(Menu("Order", "장바구니를 확인 후 주문합니다."))
    menus.add(Menu("Cancel", "진행중인 주문을 취소합니다."))

    foods.add(food("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9, "Burgers"))
    foods.add(food("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9, "Burgers"))
    foods.add(food("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4, "Burgers"))
    foods.add(food("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9, "Burgers"))
    foods.add(food("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4, "Burgers"))


    foods.add(food("Plain Ice Cream", "바닐라 아이스크림", 12.1, "Forzen Custard"))
    foods.add(food("Chocolate Ice Cream", "초콜릿 아이스크림", 10.2, "Forzen Custard"))
    foods.add(food("Fruits Ice Cream", "과일 아이스크림", 15.14, "Forzen Custard"))
    foods.add(food("Nuts Ice Cream", "아몬드 아이스크림", 15.14, "Forzen Custard"))
    foods.add(food("Ice Milk", "저지방 아이스크림", 9.9, "Forzen Custard"))

    // 드링크 종류 추가
    foods.add(food("Ade", "에이드", 7.5, "Drinks"))
    foods.add(food("Americano", "아메리카노", 6.4, "Drinks"))
    foods.add(food("Beverage", "음료수", 6.8, "Drinks"))
    foods.add(food("Black Tea", "홍차", 7.7, "Drinks"))
    foods.add(food("Barley Tea", "보리차", 8.9, "Drinks"))

    // 술 종류 추가
    foods.add(food("Bokbunja", "복분자", 16.2, "Beer"))
    foods.add(food("Bourbon", "버번위스키", 19.2, "Beer"))
    foods.add(food("Cocktail", "칵테일", 15.4, "Beer"))
    foods.add(food("Gin", "진", 25.2, "Beer"))
    foods.add(food("Armand de Brignac", "아르망디 샴페인", 999.99, "Beer"))
}

fun getPureNumber(): Int {
    var userInput: String?
    var number: Int?

    while(true) {
        println("번호를 입력해주세요")
        userInput = readLine()
        number = userInput?.toIntOrNull()

        if(number != null) {
            return number
        } else {
            println("올바른 숫자를 입력해주세요")
        }
    }
}



fun displaymenu () {
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요")
    println("[ SHAKESHACK MENU ]")

    val maxNameLength = menus.maxOfOrNull { it.name.length } ?:0
    var menuSize = menus.size
    for (idx in 1..menuSize) {
        val menu = menus[idx-1]
        var name = menu.name
        if(name == "Order") println("[ Order Menu ]")
        var desc = menu.description
        val padding = " ".repeat(maxNameLength - name.length)
        println("$idx. $name$padding | $desc")
    }
    println("7. 할인목록 | 사용쿠폰 조회")
    println("8. 배달목록 | 요청목록 조회")
    println("0. 종료 | 프로그램 종료")
}



suspend fun globalDelay(time: Long) {
    delay(time)
}