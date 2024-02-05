package main;

public class Calculator {
    
    public double getAverageGrade (Student s){
        double sum = 0;
        for (int i=0; i< s.getNumberOfCourses();i++){
                sum = sum + s.getCourseGrade(i);
        }
        return sum/ s.getNumberOfCourses();

    }

    public double getMedianGrade(Student s) {
        double median = 0;
        
        return median;
    }

    public double roundToDecimal (double value, int decimal) {
        int scale = (int) Math.pow(10, decimal);
        return (double) Math.round(value * scale) / scale;
    }
        
    }

