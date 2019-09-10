public class Lab1{
    public static void main(String[] args){
        int j;
        for(j =1; j <=100; j++){
            fizzbuzz(j);
            if (j!=100){
                System.out.print(", ");
            }
        }
    }
    public static void fizzbuzz (int i){
    if (i%5==0){
        if (i%7==0){
            System.out.print("fizzbuzz");

        }
        else{
            System.out.print("fizz");
            
        }
    }
    else if (i%7==0){
        System.out.print("buzz");

    }
    else{
        System.out.print(i);
    }
}
}