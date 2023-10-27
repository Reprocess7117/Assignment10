public class Circle extends Shape implements CircumferenceCalculable{
public static final double PI=3.14159;
public double radius;
public Circle(double r){
radius=r;
}

public double calculateCircumference(){
double circumference=2*PI*radius;
return circumference;
}

public double calculateArea(){
double Area=PI*radius*radius;
return Area;
}

}
