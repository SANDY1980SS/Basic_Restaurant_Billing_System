import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant_Bill_System {
    public static float Total(int[] order ,int size){
        ArrayList<Integer> arr = new ArrayList<>();
        int total = 0;
        for(int i=0;i<order.length;i++){
            if(order[i]==1){
                arr.add(40);
            }
            if(order[i]==2){
                arr.add(65);
            }
            if(order[i]==3){
                arr.add(10);
            }
            if(order[i]==4){
                arr.add(20);
            }
        }
        for(int j=0;j<arr.size();j++){
            total += arr.get(j);
        }
        System.out.println(" Grand Total = total + 5% GST");
        float subTotal = total*0.05F;
        float Grand_Total = total + subTotal;
        return Grand_Total;
    }
    public static void main(String[] args) {
        System.out.println("What would you like to Order? ");
        System.out.println("1.Ice cream (Rs.40/-)\n 2.Panner gravy (Rs.65/-)\n 3.Tawa Roti (Rs.10/-)\n 4.Water Bottle (Rs.20/-)");
        System.out.print("How many number of items you want to order? ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] order = new int[size];
        System.out.println("Now please enter your order serial number: ");
        for(int i=0;i<size;i++){
            order[i] = sc.nextInt();
        }
        float Total = Total(order,size);
        System.out.println(Total);
        System.out.println("Thank You..Visit Again!!!");
    }
}

