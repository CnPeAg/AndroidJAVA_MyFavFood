package com.example.myfavfood.model;

import com.example.myfavfood.R;

import java.util.ArrayList;

public class DataMakanan {
    private static String[] NamaMakanan = {
            "Sate Padang",
            "Soto Ayam",
            "Bebek Goreng",
            "Sop Buntut",
            "Bistik",
            "Nasi Goreng",
            "Nasi Padang",
            "Soto Mie",
            "Sate Kambing",
            "Telur Orak Arik"

    };

    private static String[] DetailMakanan = {
            "Sate Padang adalah sebutan untuk tiga jenis varian sate di Sumatra Barat, yaitu Sate Padang, Sate Padang Panjang dan Sate Pariaman.\n" +
                    "\n" + "Sate Padang memakai bahan daging sapi, lidah, atau jerohan (jantung, usus, dan tetelan)[1] dengan bumbu kuah kacang kental (mirip bubur) ditambah cabai yang banyak sehingga rasanya pedas.",
            "Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan. Warna kuning ini dikarenakan oleh kunyit yang digunakan sebagai bumbu. Soto ayam banyak ditemukan " +
                    "di daerah-daerah di Indonesia dan Singapura. Selain ayam bahan yang digunakan juga meliputi telur rebus, irisan kentang, daun seledri, serta bawang goreng. Terkadang soto juga disajikan dengan lontong atau nasi putih. " +
                    "Selain itu soto ayam juga sering dihidangkan dengan sambal, kerupuk dan koya (campuran tumbukan kerupuk dengan bawang putih).",
            "Bebek goreng adalah daging bebek yang digoreng dan dihidangkan dengan lalapan (sayuran segar). Bebek goreng dapat ditemui di warung-warung kaki lima sampai di restoran dan hotel mewah. Karena bebek goreng biasanya dimakan dengan nasi, maka penjual bebek goreng kaki lima menuliskan menu bebek goreng dengan spanduk bertuliskan \"Nasi Bebek\". Sampai saat ini, masih jarang dijumpai sajian bebek yang dimasak atau disajikan dengan selain digoreng. Nasi bebek atau bebek goreng ini biasanya disajikan dalam keadan yang masih panas (baru digoreng) dengan lalapan daun kemangi, timun, dan sambal serta dimakan langsung dengan muluk (bahasa Jawa: menggunakan tangan). Yang paling khas dari bebek goreng adalah bumbunya yang berupa minyak berwarna kuning yang dilumurkan di atas nasi panas tersebut.",
            "Sup buntut dibuat dengan ekor sapi. Sedikitnya ada lima versi sup buntut yang populer di seluruh dunia: makanan tradisional Korea, makanan Cina yang lebih mirip semur, ekor sapi goreng/panggang dicampur dengan berbagai variasi sup merupakan makanan populer di Indonesia, makanan etnis Amerika Serikat Selatan yang sudah ada sejak periode sebelum perang revolusi, dan sup kuah tebal dan gurih yang populer di Britania Raya sejak abad ke-18. Sup buntut Kreol dibuat dari tomat dengan ekor sapi, kentang, kacang hijau, jagung, mirepoix, bawang putih, dan rempah-rempah.",
            "Bistik atau steik adalah sepotong besar daging, biasanya daging sapi. Daging merah, dada ayam dan ikan seringkali dipotong menjadi steik. Kebanyakan steik dipotong tegak lurus dengan serat otot, menambah kelegitan daging. Steik biasanya dimasak dengan dipanggang, meskipun dapat digoreng atau di-\"broil\".\n" +
                    "\n" +
                    "Sebuah restoran yang mengkhususkan dalam steak biasanya dikenal sebagai rumah steik.",
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.\n" +
                    "\n" +
                    "Nasi goreng juga dikenal sebagai masakan nasional Indonesia.Dari sekian banyak hidangan dalam khazanah Masakan Indonesia, hanya sedikit yang dapat dianggap sebagai makanan nasional sejati. Masakan nasional Indonesia ini tidak mengenal batasan kelas sosial. Nasi goreng dapat dinikmati secara sederhana di warung tepi jalan, gerobak penjaja keliling, hingga restoran dan meja prasmanan dalam pesta.[2]\n" +
                    "\n" +
                    "Pada tahun 2011, sebuah polling Internet yang diadakan oleh CNN International dan diikuti oleh 35.000 orang menempatkan Nasi Goreng pada peringkat dua dalam daftar '50 Makanan Terlezat di Dunia' setelah rendang.",
            "Nasi Padang adalah nasi putih yang disajikan dengan berbagai macam lauk pauk khas Indonesia. Padang merujuk pada ibu kota provinsi Sumatra Barat, kampung halaman orang Minangkabau. Nasi Padang adalah sebuah hidangan yang disajikan secara lengkap secara prasmanan dengan daging, ikan, sayuran, dan makanan pedas dimakan dengan nasi putih, itu adalah komoditas ekspor paling terkenal dan masyarakat minangkabau mempunyai kontribusi yang besar untuk masakan Indonesia",
            "Soto mie, Soto mi, (atau disebut Mee soto di Malaysia dan Singapura) adalah hidangan mi berkuah kaldu berbumbu yang lazim ditemukan di Indonesia lebih tepatnya di Sunda, Bogor, Jawa Barat. Masakan Khas Sunda ini kini tidak hanya terdapat di Indonesia, Namun hidangan ini kini juga dikenal di Malaysia dan Singapura. Mie berarti mi telur dari tepung terigu, garam, dan telur, sementara made soto merujuk kepada hidangan sup berkuah khas Indonesia. Di Indonesia soto mie dianggap salah satu jenis hidangan soto atau mi berkuah, sementara di Malaysia dan Singapura hidangan ini disebut mee soto.",
            "Sate kambing adalah sejenis makanan sate terbuat dari daging kambing. Daging kambing tersebut disate (ditusuk dengan bambu yang dibentuk seperti lidi yang agak besar) dan dibumbui dengan rempah-rempah dan bumbu dapur, kemudian dibakar. Penyajiannya disajikan bersama lalapan kubis, tomat, dan bawang merah yang diiris tipis kemudian diberi kecap dan ditambahkan taburan merica. ",
            "Telur orak-arik (bahasa Inggris: scrambled eggs) adalah makanan yang terbuat dari telur (biasanya telur ayam) diaduk atau dikocok bersama dalam wajan atau penggorengan saat dipanaskan dengan lembut, biasanya ditambahkan garam, mentega, dan bahan lainnya yang bervariasi."


    };

    private static int[] Foto = {
            R.drawable.satepadang,
            R.drawable.soto,
            R.drawable.bebek,
            R.drawable.sopbuntut,
            R.drawable.bistik,
            R.drawable.nasigoreng,
            R.drawable.nasipadang,
            R.drawable.sotomi,
            R.drawable.satekambing,
            R.drawable.telurorakarik
    };

    public static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int a = 0; a < NamaMakanan.length;a++){
            Makanan makanan = new Makanan();
            makanan.setNama(NamaMakanan[a]);
            makanan.setDetail(DetailMakanan[a]);
            makanan.setFoto(Foto[a]);
            list.add(makanan);
        }
        return list;
    }
}
