
public class Circle {
public Circle(double r){
	double radius = r;
}
public static double getRadius(double r){
	return r;
}
public static double getArea(double r){
	return Math.PI * r *r;
}
public static double getDiameter(double r){
	return r*2;
}
public static double getCircumference(double r){
	return Math.PI*r*2;
}
}
