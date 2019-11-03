package furqon.nugroho.ormawapolines;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HmjData {
    public static String[][] data = new String[][]{
            {"0","HMJ Elektro", "HMJ elektro terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, dan Str Teknik Telekomunikasi",
            "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ Teknik Sipil", "HMJ elektro terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, dan Str Teknik Telekomunikasi",
             "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2","HMJ Mesin", "HMJ elektro terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, dan Str Teknik Telekomunikasi",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3","HMJ Akuntansi", "HMJ elektro terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, dan Str Teknik Telekomunikasi",
                    "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4","HMJ Administrasi Bisnis", "HMJ elektro terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, dan Str Teknik Telekomunikasi",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}
    };
    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData: data){
            Hmj hmj= new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);
            list.add(hmj);
        }
        return list;
    }
}

