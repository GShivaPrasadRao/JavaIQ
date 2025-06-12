package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{

    private String name;
    private String branch;
    private int rank;

    public Student (String name,String branch,int rank)
    {
        this.name = name;
        this.branch = branch;
        this.rank = rank;
    }

    //Getters
    public String getName()
    {
        return name;
    }
    public String getBranch()
    {
        return branch;
    }
    public int getRank(){
        return rank;
    }


    // toString() for printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', branch='" + branch + "', rank=" + rank + "}";
    }

}

public class RankBasedFiltering
{
    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student("Shiva", "CSE", 1),
                new Student("Sathish", "ECE", 2),
                new Student("Sharath", "Mech", 3),
                new Student("Nikhil", "Mech", 5),
                new Student("yashmi", "Mech", 2));

        List<Student> rank = students.stream().
                filter(stnt -> stnt.getRank() <3)
                .collect(Collectors.toList());

        //print
        rank.forEach(System.out::println);
    }
}
