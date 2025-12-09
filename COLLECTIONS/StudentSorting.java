// Store students (name, marks, rollNo) in ArrayList and sort by marks descending, then
// rollNo ascending.

import java.util.ArrayList;
class Student {
    String name;
    double marks;
    int rollNo;
    Student(String n,double m,int r){
        name = n;
        marks = m;
        rollNo = r;
    }
}
public class StudentSorting {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ali",87.5,24));
        list.add(new Student("Dua",50.5,29));
        list.add(new Student("Zia",35.5,62));
        list.add(new Student("Eman",50.5,12));
        list.add(new Student("Sara",80,45));

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).marks < list.get(j).marks){
                    Student temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }else if(list.get(i).marks == list.get(j).marks){
                    if(list.get(i).rollNo > list.get(j).rollNo){
                        Student temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).name+" | "+list.get(i).marks+" | "+list.get(i).rollNo);
        }
    }
} 
