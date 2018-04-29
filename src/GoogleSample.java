public class GoogleSample {
    public static void main(String args[]){
       System.out.println(solution("2-4A0r7-4k",3));
    }
    public static String solution(String s,int k){
        int count=0;
        String processed = "";
        StringBuilder builder = new StringBuilder("");
        s= s.replace("-","");
        s.toUpperCase();
        System.out.println("Length is "+s.length());
        int module = s.length()%k;
        if(module==0){
            for(int i=0;i<s.length();i++){
                count++;
                builder.append(s.charAt(i));
                if(count==k){
                    if(i<s.length()-1) {
                        builder.append("-");
                    }
                    count=0;
                }
            }
            processed = builder.toString();
        }
        else{
            for(int i=module;i<s.length();i++){
                count++;
                builder.append(s.charAt(i));
                if(count==k) {
                    if (i < s.length() - 1) {
                        builder.append("-");
                    }
                    count = 0;
                }
            }
            processed=s.substring(0,module)+"-"+builder.toString();
        }
        return processed.toUpperCase();
       }


}
