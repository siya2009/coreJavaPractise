package com.pratap.practise;

public class AreaCalculator {
    public static double area(double radius){

      double pi = 3.14159;
      double areaOfCircle;
      if (radius < 0) {
          areaOfCircle = -1.0;
      } else{
          areaOfCircle = (radius * radius) * pi;
      }
      return areaOfCircle;
  }

  public static double area(double x, double y){
      double areaOfRectngle;
      if (x < 0 || y < 0 ){
          areaOfRectngle = -1.0;
      } else {
          areaOfRectngle = x * y;
      }

      return areaOfRectngle;
  }

}
