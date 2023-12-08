package Level3

open class Burger(var name: String, var price: Int, var explanation: String) {
    fun BurgerName() = println("$name")
    fun choice() = println("\"$name     | $price | $explanation\"")


}

class ShackBurger: Burger {
    constructor(name: String, price: Int, explanation: String) : super(name,price, explanation) {
        this.name = "ShackBurger"
        this.price = 6900
        this.explanation = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
    }
}

class SmokeShack: Burger {
    constructor (name: String, price: Int, explanation: String) : super(name,price, explanation) {
        this.name = "SmokeShack"
        this.price = 8900
        this.explanation = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
    }
}

class ShroomBurger: Burger {
    constructor (name: String, price: Int, explanation: String) : super(name,price, explanation) {
        this.name = "ShroomBurger"
        this.price = 9400
        this.explanation = "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
    }
}

class CheeseBurger: Burger {
    constructor (name: String, price: Int, explanation: String) : super(name,price, explanation) {
        this.name = "CheeseBurger"
        this.price = 6900
        this.explanation = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"

    }
}

class HamBurger: Burger {
    constructor (name: String, price: Int, explanation: String) : super(name,price, explanation) {
        this.name = "HamBurger"
        this.price = 5400
        this.explanation = "비프패티를 기반으로 야채가 들어간 기본버거"
    }
}