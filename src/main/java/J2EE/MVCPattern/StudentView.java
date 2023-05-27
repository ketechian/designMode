package J2EE.MVCPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:31
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
