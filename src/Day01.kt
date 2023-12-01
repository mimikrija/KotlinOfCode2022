fun main() {

    fun calibrationValue(line: String): Int  {
        val first = line.first { it.isDigit() }
        val last = line.last {it.isDigit()}
        return "$first$last".toInt()
    }

    fun part1(input: List<String>): Int = input.sumOf { calibrationValue(it) }

    fun part2(input: List<String>): Int {
        return input.size
    }


    val input = readInput("Day01")
    println("Part 1 solution is: ${part1(input)}")
    check(part1(input) == 53386)

}
