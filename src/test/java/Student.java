import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName,long studentID){
        id = studentID;
        name = studentName;
        grades = new ArrayList<>();
    }

    public long getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void addGrade(int grade){
        grades.add(0,grade);
    }

    public double getAverage(){
        double average = 0;

        for(Integer grade : grades){
            average += grade;
        }

        return average / grades.size();
    }

}
