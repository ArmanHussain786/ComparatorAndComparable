import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(101,"Arman");
        Student student2 = new Student(101,"Utkarsh");
        Student student3 = new Student(523,"Rahul");
        Student student4 = new Student(65,"Yameen");
        Student student5 = new Student(90, "Varun");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        Collections.sort(students);
        System.out.println(students);



    }

    static Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.id==o2.id)
            {
                return o1.getName().compareTo(o2.getName());
            }
            else
            {
                return o1.id-o2.id;
            }
        }
    };



   public static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Student o) {

           return id-o.id;
        }

       @Override
       public String toString() {
           return "Student{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   '}';
       }
   }


}
