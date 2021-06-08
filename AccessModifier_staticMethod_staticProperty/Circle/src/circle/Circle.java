package circle;

public class Circle {

        private double radius;
        private String color;
        private double area;

        public Circle() {

        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setArea() {
            this.area = area;
        }

        public double getArea() {
            return Math.PI*Math.pow(this.radius, 2);
        }
        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return  this.color;
        }
    }

