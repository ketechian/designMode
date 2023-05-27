package J2EE.dataAccessObjectPattern;

import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:56
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
