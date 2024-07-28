/*  Develop a Scala application for managing student records with the following
 functionalities using Scala Tuples.
 a. Function getStudentInfo:
 Reads a student's name, marks, and total possible marks from
 the keyboard. Validates input to ensure the name is not empty
 and marks are positive integers not exceeding the total possible
 marks. Calculates the percentage and assigns a grade based on:
 1. Afor percentage >= 90%
 2. Bfor 75% <= percentage < 90%
 3. Cfor 50% <= percentage < 75%
 4. Dfor percentage < 50%
 this will be stored by the application

 b. Function printStudentRecord:
search existing records and display the student's name, marks, total possible marks, percentage, and grade.

 c. Function validateInput:
 Validates user input (name, marks, total possible marks) and
 returns (isValid: Boolean, errorMessage: Option[String]).
 d. Function getStudentInfoWithRetry:
 Prompts the user for input until valid data is provided, using
 validateInput. Returns the tuple as specified in getStudentInfo */

object q2
{
  def getStudentInfo(): (String, Int, Int, Double, Char) =
  {
    var name = ""
    var marks = 0
    var totalMarks = 0
    var percentage = 0.0
    var grade = 'F'
    var isValid = false
    while (!isValid)
    {
      print("Enter student name: ")
      name = scala.io.StdIn.readLine()
      print("Enter student marks: ")
      marks = scala.io.StdIn.readLine().toInt
      print("Enter total possible marks: ")
      totalMarks = scala.io.StdIn.readLine().toInt
      percentage = marks.toDouble / totalMarks.toDouble * 100
      grade = percentage match
      {
        case x if x >= 90 => 'A'
        case x if x >= 75 => 'B'
        case x if x >= 50 => 'C'
        case _ => 'D'
      }
      isValid = validateInput(name, marks, totalMarks)._1
    }
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit =
  {
    printf("Name: %s\nMarks: %d\nTotal Marks: %d\nPercentage: %.2f\nGrade: %c\n", student._1, student._2, student._3, student._4, student._5)
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) =
  {
    if (name.isEmpty())
    {
      (false, Some("Name cannot be empty"))
    }
    else if (marks < 0 || marks > totalMarks)
    {
      (false, Some("Marks should be a positive integer not exceeding total possible marks"))
    }
    else
    {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) =
  {
    var student = getStudentInfo()
    while (!validateInput(student._1, student._2, student._3)._1)
    {
      println(validateInput(student._1, student._2, student._3)._2.get)
      student = getStudentInfo()
    }
    student
  }

  def main(args: Array[String]): Unit =
  {
    var input = "11";
    printf("%s", "01 - get student info\n02 - print student record\n03 - validate input\n04 - get student info with retry\nPress -1 to exit\n\n");
    while (input != "-1")
    {
      print("What do you want? ")
      input = scala.io.StdIn.readLine()

      input match
      {
        case x if x == "01" => printStudentRecord(getStudentInfo())
        case x if x == "02" => printStudentRecord(getStudentInfo())
        case x if x == "03" => println(validateInput(scala.io.StdIn.readLine(), scala.io.StdIn.readLine().toInt, scala.io.StdIn.readLine().toInt))
        case x if x == "04" => printStudentRecord(getStudentInfoWithRetry())
        case x if x == "-1" => return;
        case _ => println("Invalid input\n")
      }
    }
  }
}