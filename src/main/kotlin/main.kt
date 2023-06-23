fun main() {
    val amount = 1000 // сумма перевода в рублях
    val commission = if (amount * 0.0075 >= 35) amount * 0.0075 else 35 // вычисление комиссии
    println("Комиссия за перевод составит $commission рублей") // вывод результата
}