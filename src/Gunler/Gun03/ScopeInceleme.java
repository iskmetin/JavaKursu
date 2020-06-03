package Gunler.Gun03;

public class ScopeInceleme {
    public static void main(String[] args) {

        int a = 5;
        {
            int b = 7;
            a = 65;

            // b değişkeni sadece bu alanda geçerli.
            // a ve b mevcut kulanılabilir. ama b parantez dışında kullanılamıyor
        }

        a = 80;
        // b=70;  b değişkeni sadece parantez içinde geçerli olduğundan kullanılamaz.
        // ancak aynı isimde yeniden tanımlanalarak kullanılabilir istenirse.
    }
}
