/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rautr
 */
public class Student extends Person {
    private String major;

  public Student(String n, int byear, String m) 
 {
     super(n, byear);
     major = m;
 }
  public String toString()
  {
    return "Student[super =" + super.toString() + ",major =" + major + "]";
  }
}