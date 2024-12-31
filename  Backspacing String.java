public class BackspaceString {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        if (processString(s).equals(processString(t))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static String processString(String str) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
