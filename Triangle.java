import java.lang.Math;
public class Triangle extends Shape implements PerimeterCalculable{
public double side;

public Triangle(double s){
side=s;
}

public double calculatePerimeter(){
double Perimeter=3*side;
return Perimeter;
}

public double calculateArea(){
double Area=(side*side*Math.sqrt(3))/4;
return Area;
}

}
