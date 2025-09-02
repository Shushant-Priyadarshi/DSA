package stringbuilder;

/*
* Whenever we make changes to a string a new string is created in the heap memory
* This creation takes some time and can increase the overall time taken by a huge softwares
*
* With StringBuilder any change in the string does not make a new string ,rather it change the
* string directly in the heap memory
* */
public class Learning {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Bru");
        System.out.println(sb);

        sb.insert(3,"h");
        System.out.println(sb);

        sb.delete(3,4);
        System.out.println(sb);
    }
}
