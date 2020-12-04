
public class Main {
    public static void main(String[] args) {
        //Stringler bir adet classtan türer yani stringler aslınde bir classtır
        String a = "hllbr";
        String b = new String("@prince");
        System.out.println(b);
        System.out.println("Harf sayısı : "+b.length());
        //stringlerde indexlenir.indexlere ulaşmak diğer indexli yapılar gibi değil metodu bulunuyor
        System.out.println("0.index : "+b.charAt(0));
        System.out.println("5.index : "+b.charAt(5));
        System.out.println("Son index : "+b.charAt(b.length()-1));
        for(int i = 0;i<b.length();i++){
            System.out.println("-*-*-*-*-");
            System.out.println(b.charAt(i));
        }
        System.out.println(b.startsWith("@p"));//string değere soruyoruz ... ile başlıyor mu ?
        System.out.println(b.endsWith("ce"));//string değere soruyoruz ... ile bitiyor mu ?
        System.out.println(b.indexOf("k"));//index bizim referansımızda olamdığı için -1 dönecek
        System.out.println(b.indexOf("i"));//index referansımızda bulunduğu için bulunduğu index değerini dönecek
        System.out.println(b.indexOf('r'));
        System.out.println(b.indexOf('e'));
        System.out.println(b.lastIndexOf('v'));
        System.out.println(b.lastIndexOf('p'));
        //bir string ifadenin tüm değerlerini büyük veya küçük harf yapmak için :
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        //String bir ifadenin integer dönüştürülmesi 
        String c = "123456";
        int d =Integer.parseInt(c);
        System.out.println(d+58);
        //integer bir ifadenin strig ifadeye dönüştürülmesi
        int a1 = 1196;
        String b1 = String.valueOf(a1);
        System.out.println("ahmet "+b1+" yılında dünyaya gelmiştir");
        /*
        tanımlama farkları
        */
        String k = "hllbr";
        String l = "hllbr";
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/");
        if(k == l){
            System.out.println("bellekte aynı yeri gösteriyorlar");
            //değerleri değil objelerin nereyi işaret ettiklerini kontrol etmiş oluyoruz.
        }
        String k1 = new String("@prince");
        String l1 = new String("@prince");
        if(k1 == l1){
            System.out.println("bellekte aynı yeri gösteriyorlar");
            
        }else{
            System.out.println("değerler aynı ama önemi yok bu sorguyla aynı yeri gösterip göstermediklerini sorguladınız ve farklı yerleri gösteriyorlar");
        }
        //oluşturduğun striglerin içindeki değerleri kıyaslamak için 
        if(k1.equals(l1)){
            System.out.println("k1 ve l1 içindeki değerler esittir");
        }
        if(k.equals(l)){
            System.out.println("eşitler");
        }
    }
}
