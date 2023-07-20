
public class Yeniiiiii {
    static boolean isPalindrom(int number){
        int temp=number, rNumber=0,basN;
        while(temp!=0){
            basN=temp%10;
            rNumber=(rNumber*10)+ basN;
            temp/=10;
        }
        if (rNumber==number)
        return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(188));



        }
    }

//    247 742
