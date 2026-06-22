public class ElseIfStatement {
    public static void main(String[] args){
        int per = 60;
        if(per >=80 || per <=100){
            System.out.println("Grade A");
        }
        else if(per >=60 || per <80){
            System.out.println("Grade B");
        }
        else if(per >=50 || per <60){
            System.out.println("Grade C");
        }
        else if(per >=40 || per <50){
            System.out.println("Grade D");
        }
        else if(per >=0 || per <40){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Invalid percentage");
        }

    }
}