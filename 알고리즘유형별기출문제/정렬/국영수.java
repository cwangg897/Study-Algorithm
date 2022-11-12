import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list =  new ArrayList<>();
        for(int i=0; i<n; i++){
            String s =  sc.next();
            int k = sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();
            list.add(new Student(s,k,e,m));
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).name);
        }



    }

    static class Student implements Comparable<Student>{
        String name;
        int korea;
        int english;
        int math;

        public Student(String name, int korea, int english, int math){
            this.name = name;
            this.korea = korea;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student o) {
            if(this.korea == o.korea && this.english == o.english && this.math == o.math){
                return this.name.compareTo(o.name);
            } else if(this.korea == o.korea && this.english == o.english){
                return o.math - this.math;
            } else if(this.korea == o.korea){
                return this.english - o.english;
            } else{
                return o.korea - this.korea;
            }
        }
    }
}
