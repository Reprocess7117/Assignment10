import java.util.Scanner;
public class Main {

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Please choose a shape:\n(1)Square\n(2)Rectangle\n(3)Equilateral Triangle\n(4)Circle");
int option=input.nextInt();
double l;
double w;
//Clear Console
System.out.print("\033[H\033[2J");
System.out.flush();
switch (option) {
   case 1://Square
	System.out.println("You selected Square\nPlease Enter Length(0.0):");
	l=input.nextDouble();
	System.out.println("Please enter Width(0.0)");
	w=input.nextDouble();
	Square square = new Square(l,w);
	System.out.println("Perimeter: " + square.calculatePerimeter() + "\nArea: " + square.calculateArea());
   	   break;
   case 2://Rectangle
	System.out.println("You selected Rectangle\nPlease Enter Length(0.0):");
	l=input.nextDouble();
	System.out.println("Please enter Width(0.0)");
	w=input.nextDouble();
	Rectangle rectangle = new Rectangle(l,w);
	System.out.println("Perimeter: " + rectangle.calculatePerimeter() + "\nArea: "+ rectangle.calculateArea());
	   break;
   case 3://Triangle
	double s;
	System.out.println("You selected Triangle\nPlease Enter Side Length(0.0):");
	s=input.nextDouble();
	Triangle triangle = new Triangle(s);
	System.out.println("Perimeter: " + triangle.calculatePerimeter() + "\nArea: " + triangle.calculateArea());
   	   break;
   case 4://Circle
	double r;
	System.out.println("You selected Circle\nPlease Enter Radius(0.0):");
	r=input.nextDouble();
	Circle circle = new Circle(r);
	System.out.println("Circumference: " + circle.calculateCircumference() + "\nArea: " + circle.calculateArea());
	   break;
}


}
}
