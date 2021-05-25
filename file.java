// public static void main(Stringp[] args){
//     Scanner scn=new Scanner(System.in);
//     int num = scn.nextInt();
    
//     int sum=0;

//     while(num != 0){
//         int a = num % 10;
//         num/=10;
//         sum += a;
//     }

//     System.out.print(sum);
// }


public class file{
public static void main(Stringp[] args){
    Scanner scn=new Scanner(System.in);
    int size = scn.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        if(arr[i] != i+1){
            System.out.println(i+1);
            break;
        }
    }
}

}


