public class QuestionThree {
    public static void main(String[] args) {
        int target = 5;
        System.out.println("Count:" + climb(target));
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
