import java.util.ArrayList;

public class Sarkici {

	ArrayList<String> sarkicilar = new ArrayList<String>();

	public void sarkici_bastir() {
		System.out.println("Þarkýcý listesinde " + sarkicilar.size() + " þarkýcý mevcut:");
		for (String a : sarkicilar) {
			System.out.println(a);
		}
	}

	public void sarkici_ekle(String gelenSarkici) {
		sarkicilar.add(gelenSarkici);
		System.out.println("Liste güncellendi");

	}

	public void sarkici_guncelle(int pozisyon, String yeniSarkici) {
		sarkicilar.set(pozisyon, yeniSarkici);
		System.out.println("Liste güncellendi");
	}

	public void sarkici_sil(int pozisyon) {
		sarkicilar.remove(pozisyon);
		System.out.println("Sarkici silindi");
	}

	public void sarkici_ara(String isim) {
		int pozisyon = sarkicilar.indexOf(isim);
		if (pozisyon >= 0) {
			System.out.println("Sarkici " + (pozisyon + 1) + " siradadir");
		}
		else {
			System.out.println("Sarkici bulunamadi");
		}
	}

}
