//fun main(args: Array<String>)
/*In a class of 57 students the teacher was collecting data of her students,
 * The data she required was:
 * The gender of the students
 * The course they are doing
 * the feedback on boys playing football
 * the feedback on the ladies playing hockey
 * the feedback on the curriculum
 * Using inheritance, represent the gender and the course as
 * properties and the feedback as methods*/

fun main()
{
    val data1=Data()
    data1.course= "COMPUTER STUDIES"
    println("I am studying ${data1.course}")
    data1.cur()
    val student1=Student()
    student1.name="Juliet"
    student1.gender="female"
    println("My name is ${student1.name} i am a ${student1.gender}")
    student1.hockey()
    val student2=Student()
    student2.name="Melk"
    student2.gender="male"
    println("My name is ${student2.name} i am a ${student2.gender}")
    student2.football()
}
open class Data()
{
    var course:String=""
    fun cur()
    {
        println("Sports and Games")
    }
}
class Student:Data()
{
    var name:String=""
    var gender:String=""
    fun hockey()
    {
        println("I am playing hockey")
    }
    fun football()
    {
        println("I am playing football")
    }
}
