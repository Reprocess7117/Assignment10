public class Rectangle extends Shape implements PerimeterCalculable{
double length, width;

public Rectangle(double l, double w){
length=l;
width=w;
}

public double calculatePerimeter(){
double Perimeter = 2*(length+width);
return Perimeter;
}

public double calculateArea(){
double Area=length*width;
return Area;
}

}
