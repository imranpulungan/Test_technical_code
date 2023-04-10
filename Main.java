/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        generateGanjil(10);
        generateSegitiga(1345000);
    }
    
    static void generateGanjil(int n){
        for(int i = 0; i<n; i++){
            if (i % 2 != 0) {
                System.out.println("Bilangan Ganjil ke- " + i);                
            }
        }
    }

    static void generateSegitiga(int n){
        char[] chars = ("" + n).toCharArray();
        for(int i = 0; i<chars.length ; i++){ 
            System.out.println(chars[i] + getZero(i));
        }
    }

    static String getZero(int n){
        char[] chars = ("0").toCharArray();
        char[] newChars = new char[n + 1];
        System.arraycopy(chars, 0, newChars, 0, chars.length);
        for (int i = 0; i < n; i++) {
            newChars[chars.length + i] = '0';
        }
        chars = newChars;
        return String.valueOf(chars);
    }
}