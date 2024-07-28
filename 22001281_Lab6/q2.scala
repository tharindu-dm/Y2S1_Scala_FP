object q2
{
  case class Student(name: String, marks:Int, maxMark:Int, percentage:Double, grade:Char)
  var StudentRec: Set[Student] = Set()
  
  def getStudentInfo(): Set[Student] =
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

    StudentRec + Student(name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(): Unit =
  {
    for (student <- StudentRec)
    {
      println(s"${student.name}\t${student.marks}\t${student.maxMark}\t${student.percentage}\t${student.grade}")
    }
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

  def getStudentInfoWithRetry(): Student =
  {
    var studentSet = getStudentInfo()
    var student = studentSet.head
    while (!validateInput(student.name, student.marks, student.maxMark)._1)
    {
      println(validateInput(student.name, student.marks, student.maxMark)._2.get)
      studentSet = getStudentInfo()
      student = studentSet.head
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
        case x if x == "01" => StudentRec = getStudentInfo()
        case x if x == "02" => printStudentRecord()
        case x if x == "03" => println(validateInput(scala.io.StdIn.readLine(), scala.io.StdIn.readLine().toInt, scala.io.StdIn.readLine().toInt))
        case x if x == "04" => println(getStudentInfoWithRetry())
        case x if x == "-1" => return;
        case _ => println("Invalid input\n")
      }
    }
  }
}