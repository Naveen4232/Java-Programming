public class Calculator{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        Calculator obj=new Calculator();
        if(a<b)
        {
        a=a-b;
        b=a+b;
        a=b-a;
        }
        switch(c){
        case 1:
            obj.add(a,b);
            break;
        case 2:
            obj.sub(a,b);
            break;
        case 3:
            obj.multi(a,b);
            break;
        case 4:
            obj.div(a,b);
            break;  
        }
    }
    void add(int a,int b)
        {
            int d=a+b;
            System.out.println(d);
        }
    void sub(int a,int b)
        {
            int d=a-b;
            System.out.println(d);
        }
    void multi(int a,int b)
        {
            int d=a*b;
            System.out.println(d);
        }
    void div(int a,int b)
        {
            int d=a/b;
            System.out.println(d);
        }
}