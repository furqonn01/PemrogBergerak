package furqon.nugroho.utsrecyclerview;

import java.util.ArrayList;

public class HpData {
    public static String[][] data = new String[][]{
            {"0","Blackberry 6210", "BlackBerry membuat gebrakan tahun 2003. Ponsel RIM tersebut memiliki fitur email, email, dan BlackBerry Messenger (BBM).",
                    "https://i-cdn.phonearena.com/images/phones/7597-thumb/BlackBerry-7290.jpg"},
            {"1","Blackberry Pearl", "Usai mencuri perhatian masyarakat dengan BB620, BlackBerry merilis smartphone pertama, BB Pearl. Ponsel tersebut dilengkapi kamera dan trackball.",
                    "https://static.turbosquid.com/Preview/2014/05/25__20_10_45/BB%20Pearl_1.jpg0f72002e-344e-490c-a4f0-d3b9eb61a8f1Larger.jpg"},
            {"2","Blackberry Curve", "Curve merupakan generasi penerus Pearl. Ukurannya yang lebih lebar, Curve lebih canggih dan memiliki resolusi bagus. Inilah ponsel terakhir BlackBerry sebelum kehadiran iPhone.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8zJ23oOLdPWlAUji6fQnXIuI941UN01p5w827s0eEDfsxcP2P3Q&s"},
            {"3","Blackberry Bold", "Kalau kamu dengar nama BlackBerry, ponsel yang mungkin kamu ingat adalah BB Bold. Ponsel ini juga sempat laku keras di Indonesia meski harganya cukup mahal.",
                    "https://cf.shopee.co.id/file/d89c362932ac015e69787553d60bc869_tn"},
            {"4","Blackberry Storm", "Nama BlackBerry semakin melambung berkat kehadiran Storm di tahun 2008. Inilah smartphone pertama BlackBerry dengan layar sentuh. Namun Storm belum dilengkapi WiFi.",
                    "https://images-na.ssl-images-amazon.com/images/I/41AYAz4Ld-L.jpg"}
    };
    public static ArrayList<Hp> getListData(){
        ArrayList<Hp> list = new ArrayList<>();
        for (String[] aData: data){
            Hp hmj= new Hp();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);
            list.add(hmj);
        }
        return list;
    }
}
