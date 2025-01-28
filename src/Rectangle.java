public class Rectangle {
   private int Lenght;
   private int Width;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      radius = 1.0;
      color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double r) {  // 2nd constructor
      radius = r;
      color = "red";
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   /** Définit le rayon du cercle*/
   public void setRadius(double radius) {
	   this.radius = radius;
   }
   
   /** Permet d'obtenir la circonférence d'un cercle */
   public double getCircumference() {
	   return 2*this.radius * Math.PI;
   }
}