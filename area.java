import java.util.Scanner;

class circle{

int radius;

circle()
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter radius:");
radius = sc.nextInt();
}

void display()
{
System.out.println("Circle:" + (3.14*radius*radius));
}
}

public class area{
public static void main(String[] args){

circle obj = new circle();

obj.display();
}
}
