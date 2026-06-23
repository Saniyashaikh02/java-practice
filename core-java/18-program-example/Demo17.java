public class Demo17 {
    public static void main(String[] args){
        char ch = 'a' ; char chi = 'A';
        for( int i = 1; i<=9; i++){
            if(i %3==0){
                System.out.println((chi++) + "");
            }else{
                System.out.println((ch++) + "");
            }
        }
    }
}
