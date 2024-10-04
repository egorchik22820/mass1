fun ValueOfDifNums(matrix : MutableList<MutableList<Int>>) : Int {

    val setMatrix = matrix.flatten().toSet()

    val str = StringBuilder()

    for (i in setMatrix) {
        str.append(i.toString())
    }

    val setStr = mutableSetOf<Int>()
    for (i in 0 until str.length) {
        setStr.add(str[i].toString().toInt())
    }

    return setStr.size
}


fun main() {
    // Запрашиваем у пользователя количество строк
    print("Введите количество строк: ")
    val rows = readLine()?.toIntOrNull() ?: 0

    // Запрашиваем у пользователя количество столбцов
    print("Введите количество столбцов: ")
    val cols = readLine()?.toIntOrNull() ?: 0

    // Создаем динамический двумерный массив
    val dynamicArray = MutableList(rows) { MutableList(cols) { 0 } }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("Введите элемент [$i][$j]: ")
            val value = readLine()?.toIntOrNull() ?: 0
            if (value.toString().length == 3)
                dynamicArray[i][j] = value
            else {
                print("число должно быть трехзначным")
                return
            }
        }
    }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${dynamicArray[i][j]}\t")
        }
        print("\n")
    }

    print(ValueOfDifNums(dynamicArray))
}