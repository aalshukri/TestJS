/*
Inheritance
is the mechanism by which an object acquires the some/all properties of another object.


Access Specifiers (access levels)
public, private, protected, default(no specifier)


Polymorphism
process objects differently based on their data type.



Non-access modifiers
static,
static final - to create a constant

final class    - to show class which cannot be extended, only instantiated.
abstract class - to show class which cannot be instantacted, only extended.

This  - current instance
super - refer to parent instance

*/

import java.util.Arrays;


/*
Abstract class, means this can only be extended, not instantiated
*/
abstract class Teacher {
	
   // Public (any instance can access)
   public String collegeAddress = "123 Fake Street";

   // Private (cannot be directly accessed using obj.fieldName
   private String designation = "Teacher";

   // Private (cannot be directly accessed using obj.fieldName
   private String collegeName = "Beginnersbook";

   // Protected (can be accessed by this and any extended classes
   protected String collegeTel = "01511233214";

	
   //  static final - to create a constant
   protected static final String LOCATION_VALUE = "England, UK";

	
   // Private static variable
   private static int numTeachers = 0;

   /**
    * Constructor
    */
   public Teacher()
   {numTeachers++;}
   
   public void showNumTeachers()
   {System.out.println("numTeachers = "+numTeachers);}



   //Get
   public String getDesignation() {
	return designation;
   }

   //Set
   protected void setDesignation(String designation) {
	this.designation = designation;
   }

   //
   protected String getCollegeName() {
	return collegeName;
   }

   //
   protected void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
   }


   // Function
   void does(){
	System.out.println("Teaching");
   }

   
   // Override Polymorphism Example 
   // TeachingStyle
   public void teachingStyle(){
	System.out.println("General Teaching Style");   
   }


   // Overloading Polymorphism Example 
   //
   public void lessonPlan(String lesson1){
	System.out.println("LessonPlan One lesson= "+lesson1);   
   }

   public void lessonPlan(String lesson1, String lesson2){
	System.out.println("LessonPlan FirstLesson= "+lesson1+" SecondLesson= "+lesson2);
   }

   public void lessonPlan(String lessons[]){
	System.out.println("ManyLessons "+Arrays.toString(lessons));
   }

}


class PhysicsTeacher extends Teacher{
   String mainSubject = "Physics";

   // Override Polymorphism Example 
   // TeachingStyle
   @Override
   public void teachingStyle(){
	System.out.println("Physics Teaching Style");   
   }

   public void showCollageTel()
   {System.out.println("showCollageTel = "+ super.collegeAddress ); }

}

class MathTeacher extends Teacher{
   String mainSubject = "Math";

   // Override Polymorphism Example 
   // TeachingStyle
   @Override
   public void teachingStyle(){
	System.out.println("Math Teaching Style");   
   }

   public void showCollageTel()
   {System.out.println("showCollageTel = "+ super.collegeAddress ); }

}


/*
final class, means that this cannot be extended.
*/
final class University{
  static final String NAME_VALUE = "University of";
  void universityName()
  {System.out.println("NAME_VALUE = "+NAME_VALUE);}	
}
  

public class InheritanceDemo{

   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();

	//public, can be accessed using obj.fieldName
	// (default access is public due to the keyword being used)
	System.out.println(obj.mainSubject);

	//Public, so can call using obj.fieldName
	System.out.println(obj.collegeAddress);

	//Protected, so access from class, and extended classes using obj.fieldName
	System.out.println(obj.collegeTel);

	// Private, so cannot be accessed using obj.fieldName, need get and set methods
	System.out.println(obj.getCollegeName() );
	System.out.println(obj.getDesignation() );

        // Override Polymorphism Example 
        // TeachingStyle
	obj.teachingStyle();


	obj.does();


        // Override Polymorphism Example 
        // TeachingStyle
	MathTeacher obj1 = new MathTeacher();
	obj1.teachingStyle();


	//Overloading Polymorphism Example 
	obj.lessonPlan("English");
	obj.lessonPlan("English", "Math");

	String[] myStringArray = new String[]{"Sci", "Math", "Eng"};
	obj.lessonPlan(myStringArray );


	//Private static variable 
	obj.showNumTeachers();
	obj1.showNumTeachers();


	// static final - to create a constant
	System.out.println( obj.LOCATION_VALUE );



	// final class
	University uni = new University();
	uni.universityName();


	//Example using super
	obj.showCollageTel();
	obj1.showCollageTel();
   }
} 
