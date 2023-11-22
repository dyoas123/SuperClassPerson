/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rautr
 */
public class Instructor extends Person
{
    private double salary;

	public Instructor(String n, int byear, double s)
        {
            super(n, byear);
      salary = s;
        }
public String toString()
    {
        return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
    }
    }