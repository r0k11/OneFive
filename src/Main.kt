fun main()
{
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()
    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()
    if (n != null && x != null && x > 1)
    {
        var y = 0
        var result = 1
        while (result < n)
        {
            y++
            result = Math.pow(x.toDouble(), y.toDouble()).toInt()
        }
        if (result == n)
        {
            println("Целочисленный показатель степени y = $y")
        }
        else
        {
            println("Целочисленный показатель не существует")
        }
    }
    else
    {
        println("Ошибка: введите корректные целые числа. Основание степени должно быть больше 1.")
    }
}
