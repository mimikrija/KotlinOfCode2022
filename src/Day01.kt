fun main() {
    fun part1(input: List<String>): Int {
        var solution = 0
        val pattern = "\\d".toRegex()
        for (line in input){
            val numbers = pattern.findAll(line)
            val first = numbers.first().value
            val last = numbers.last().value
            val numbersString = "$first$last"
            solution += numbersString.toInt()

        }
        println("Part 1 solution is $solution")
        return solution
    }

    fun part2(input: List<String>): Int {
        return input.size
    }


    val input = readInput("Day01")
    check(part1(input) == 53386)

}
