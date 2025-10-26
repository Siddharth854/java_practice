// public class string 
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("unused")
//         String[][] number ={ 
//         {"Tom" , "555-3322"},
//         {"gary","222-3311"},
//         {"siddharth","888-9910"}
//                         };
//         int i;
//         if(args.length!=1)
//         {
//             System.out.println(" Usage: java Phone <name> ");
//         }else{
//             for(i=0;i<number.length;i++)
//             {
//                 if(number[i][0].equals(args[0])) {
//                     System.out.println(number[i][0]+": "+number[i][1]);
//                     break;
//                 }
//             }
//             if(i==number.length)
//             {
//                 System.out.println("Name not found");
//             }
//         }
//     }
// }

// public class string {
//     public static void main(String[] args) {
//         System.out.println("Number of arguments: " + args.length);

//         for (int i = 0; i < args.length; i++) {
//             System.out.println("Argument " + i + ": " + args[i]);
//         }
//     }
// }

// public class string {
//     public static void main(String[] args) {
//         char[] ch = {'h','e','l','l','o'};  // lowercase 'a' = 97
//                 for (int i = 0; i < ch.length; i++) 
//         {
//             ch[i] = (char) ((int) ch[i] & 65503);
//         }
//         System.out.println(ch); 
//     }
// }

// public class string{
//     public static void main(String[] args)
//     {
//         String msg = "This is a text";
//         String encmsg="";
//         String decmsg = "";
//         int key = 88;
//         System.out.println("Original message");
//         System.out.println(msg);
//         for(int i=0;i<msg.length();i++)
//         {
//             encmsg = encmsg + (char) (msg.charAt(i) ^ key);
//         }
//         System.out.println("encoded String");
//         System.out.println(encmsg);
        
//         for(int i=0;i<msg.length();i++)
//         {
//             decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
//         }
//         System.out.println("decoded String");
//         System.out.println(decmsg);
//     }
// }
