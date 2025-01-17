public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println("result: " +compareRevision("1.01", "1.001"));
        System.out.println("result: " +compareRevision("1.0", "1.0.0"));
        System.out.println("result: " + compareRevision("0.1", "1.1"));
    }

    public static int compareRevision(String version1, String version2){

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for(int i=0; i<maxLength;i++){
            int iV1 = 0;
            if(i<v1.length) iV1 = Integer.parseInt(v1[i]);
            else iV1 = 0;
            

            int iV2 = 0;
            if(i<v2.length) iV2 = Integer.parseInt(v2[i]);
            else iV2 = 0;
            

            if(iV1 < iV2) return -1;
            else if(iV1 > iV2) return 1;
        }
        return 0;
    }
}
