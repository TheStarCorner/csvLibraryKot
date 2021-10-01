import java.io.File
/**
 * Created by www.tutorialkart.com
 * Example program to read contents of a file in Kotlin into BufferedReader
 */
fun main(args: Array<String>) {
    val fileThing = creditCSV()
    fileThing.title = "Ammon's Movie CSV Read & Write Program"
    fileThing.author = "Ammon Wilson"
    fileThing.yearCreate = 2021

    println(fileThing.title)
    println(fileThing.author)
    println(fileThing.yearCreate)

    print("\n")

    val descriptionText = "Hello everyone! " +
            "This program is taking a CSV file of a list of movies that I made. It will take the list and do " +
            "multiple functions throughout the program."
    println(descriptionText)

    print("\n")

    // The line of code below opens the file that is listed in the File section.
    val file = File("movieList.csv")
    // The "bufferedReader" takes the file and reads each line at a time from the File section.
    val bufferedReader = file.bufferedReader()
    // This is a continuation with the "bufferedReader" process and reading each line from the File as a String.
    val text:List<String> = bufferedReader.readLines()

    // This scans each line in the text listed in the file.
    for(line in text){
    }
    val fileStart = csvChecker("movieList.csv")
    fileStart.ageRatings()
    fileStart.animatedOrNot()
}
class creditCSV{
    var title = ""
    var author = ""
    var yearCreate = 0
}
class csvChecker(var fileName: String){
    fun readFileCSV(){
        val file = File(fileName)
//        val file = File("movieList.csv")
        // The "bufferedReader" takes the file and reads each line at a time from the File section.
        val bufferedReader = file.bufferedReader()
//         This is a continuation with the "bufferedReader" process and reading each line from the File as a String.
        val text:List<String> = bufferedReader.readLines()
    }
    fun ageRatings(){
        val file = File(fileName)
//        val file = File("movieList.csv")
        // The "bufferedReader" takes the file and reads each line at a time from the File section.
        val bufferedReader = file.bufferedReader()
        // This is a continuation with the "bufferedReader" process and reading each line from the File as a String.
        val text:List<String> = bufferedReader.readLines()
        var gTotal = 0
        var pgTotal = 0
        var pgTeenTotal = 0
        for(line in text){
            // This prints each line of the CSV file.
            val splitAge = line.split(",")
//        println(splitAge[4])
            if (splitAge[4] == "G"){
                gTotal += 1
            }
            if (splitAge[4] == "PG"){
                pgTotal += 1
            }
            if (splitAge[4] == "PG-13"){
                pgTeenTotal += 1
            }
        }
        println("=============================================================================================")
        print("\n")
        println("Age Ratings: ")

        println("G: $gTotal")
        println("PG: $pgTotal")
        println("PG-13: $pgTeenTotal")
        print("\n")
        println("=============================================================================================")
    }
    fun animatedOrNot() {
        val file = File(fileName)
//        val file = File("movieList.csv")
        // The "bufferedReader" takes the file and reads each line at a time from the File section.
        val bufferedReader = file.bufferedReader()
        // This is a continuation with the "bufferedReader" process and reading each line from the File as a String.
        val text:List<String> = bufferedReader.readLines()
        var yesTotal = 0
        var noTotal = 0
        for(line in text){
            // This prints each line of the CSV file.
//        println(line.split(","))
            val splitData = line.split(",")
//        println(splitData[3])
            if (splitData[3] == "Yes"){
                yesTotal += 1
            }
            if (splitData[3] == "No"){
                noTotal += 1
            }
        }
        println("=============================================================================================")
        println("isItAnimated")
        print("\n")
        println("Yes: $yesTotal")
        print("\n")
        println("No: $noTotal")
        println("=============================================================================================")
    }
}