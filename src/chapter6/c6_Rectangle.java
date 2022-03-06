package chapter6;

public class c6_Rectangle {

    double length;
    double width;

    double getLength(){
        return length;
    }

    void setLength (double length){

    }
    double calculatePerimeter(){
        return (2* length) + (2*width);

    }
    double calculateArea(){
        return length * width;
    }
}
