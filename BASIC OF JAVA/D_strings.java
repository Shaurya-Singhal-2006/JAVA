//                                         STRINGS (immutable)

// 1. concatinate --> join two strings together                                 +
// 2. length -- >     tells the length of the string                           .length()
// 3. charAt -->      tell the char at a perticular index                      cahrAt(1)
// 4. replace -->     replace a cahr with another                              .replace('oldchar' , 'newchar')
// 5. substring --.   gives the required substring from the string             .substring()


public class D_strings {
    
    public static void main(String[] args) {

        String name1 = "Shaurya";
        String name2 = " Singhal";
        String str1 = "hello";
        String str2 = "world";
        String full_name = name1 + name2;
        System.out.println(full_name);                                        // Shaurya Singhal    [ concatination ]

        String full_name1 =  name1 + " and" + name2;
        System.out.println(full_name1);                                       // Shaurya and Singhal [ concatination ]

        System.out.println(full_name.length());                               // 15 [ length ]
        System.out.println(full_name.charAt(4));                       //  r [ chatAt ]
        String str3 = str1.replace('l', 'w');               // gives a new string [ replace ]

        System.out.println(str3);                                            // hewwo

        System.out.println(str2.substring(0,2));        // wo  [first index in included and second in not] [ substring ]
        
    }
}