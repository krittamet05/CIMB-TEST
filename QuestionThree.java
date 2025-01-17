public class QuestionThree {
    public static void main(String[] args) {
        System.out.println("Count:" + climb(2));
        System.out.println("Count:" + climb(3));
        System.out.println("Count:" + climb(5));
        System.out.println("Count:" + climb(10));
    }

    public static int climb(int target){
        if(target <= 2){
            return target;
        }

        int n1 = 1;
        int n2 = 2;
        
        for(int i=3;i<=target;i++){
            int nI = n1 + n2;
            n1 = n2;
            n2 = nI;
        }
        return n2;
    }
}
