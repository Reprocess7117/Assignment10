public class Square extends Shape implements PerimeterCalculable {
public double length, width;

public Square(double l, double w){
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
