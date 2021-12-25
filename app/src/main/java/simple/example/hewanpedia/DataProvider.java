package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Semut;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Semut> initDataSemut(Context ctx) {
        List<Semut> semuts = new ArrayList<>();
        semuts.add(new Semut("ochetellus", "laterille",
                "Semut ini berukuran 2,5 - 3 mm dengan warna hitam mengkilat dan sering kita jumpai di dapur atau kamar tidur", R.drawable.semut_ochetellus));
        semuts.add(new Semut("Solenopsis spp", "Amazon, amerika selatan ",
                "Semut ini berwarna coklat tembaga pada kepala dan tubuh, dengan warna lebih gelap, semut ini memili ratu yg memili panjang 5/8mm dan lain hal nya dengan pekerja nya yg memiliki panjang 1/8 - 1/4", R.drawable.semut_solenopsis_spp));
        semuts.add(new Semut("Tapinoma melanocephalum", "kanada, amerika utara",
                "kaki dan perut warna putih dengan panjang 1-16mm, ratu semut jenis ini berpoligami untuk menghasilkan telur ", R.drawable.semut_tapinoma_melanocephalum));
        semuts.add(new Semut("Tapinoma sesile", "afrika",
                "Semut ini memiliki kaki 6 dengan antena 12 segmen dan tidak di akhiri dengan sebuah titik, memakan makanan manis seperti gula dan permen", R.drawable.semut_tapinoma_sessile));
        semuts.add(new Semut("Monomorium pharaonis", "Jerman",
                "Jenis semut ini tertarik pada makanan yg memiliki protein tinggi seperti daging, lemak, serangga mati dll.", R.drawable.semut_monomorium_pharaonis));
        semuts.add(new Semut("Camponotus Pennsylvanicus", "Jepang",
                "Semut ini kerap kali dijumpai pada kayu lembab dan juga kayu kering, jenis semut ini memakan cairan manis, sisa tanaman, dan sisa serangga ", R.drawable.semut_componotus_pennsylvanicus));
        return semuts;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("netherland_dwarf", "belanda",
                "kelinci yang berasal dari belanda dengan berat 1,1-2,5 pon,Dwarf belanda adalah satu ras kelinci terkecil ", R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci("orictolagus_cuniculus", "eropa",
                "kelinci orictolagus cuniculus juga disebut kelinci eropa atau kelinci domestik adalah satu satunya spesies dalam genusnya", R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci("holland_lop", "belanda",
                "kelinci jenis holland lop adalah kelinci yang independent dan playfull", R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci("mini_lop", "jerman",
                "Adalah jenis kelinci domestik yang di akui oleh american rabbit association ", R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci("raksasa", "belgia",
                "jenis kelinci domestik yang sangat besar,biasanya dianggap sebagai jenis terbesar dari spesiesnya ", R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci("rex", "prancis",
                "kelinci ini mempunyai tubuh yang besar,telinga yang tegak,dan ciri khas yang menjadikan kelinci rex ini di sukai adalah bulunya yang seperti karpet ", R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataSemut(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
