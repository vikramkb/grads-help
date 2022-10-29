public class StringArray {
    public static void main(String[] args) {
        String[] names = {"vikramk", "jaleel", "ramakrishna","sai"};
        int maxLength = 0;
        int maxNameIndex = 0;
        for(int i=0; i < names.length; i++) {
            if(names[i].length() > maxLength){
                maxLength = names[i].length();
                maxNameIndex = i;
            }
        }
        System.out.println(maxLength);
        System.out.println(names[maxNameIndex]);
    }
}
