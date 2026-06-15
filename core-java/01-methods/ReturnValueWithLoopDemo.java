public class ReturnValueWithLoopDemo{
    static int DoubleGame( int x) {
        return x * 2;
        
    }
    public static void main( String[] args){
        for ( int i=0; i<=5; i++){
            System.out.println(DoubleGame(i));
        }
    }
}