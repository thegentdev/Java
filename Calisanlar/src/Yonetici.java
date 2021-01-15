
public class Yonetici extends Calisanlar {
	private int sorumluKisi;

	public Yonetici(String isim, String soyisim, int id, int sorumluKisi) {
		super(isim, soyisim, id);
		this.sorumluKisi = sorumluKisi;
	}

	public int getSorumluKisi() {
		return sorumluKisi;
	}

	public void setSorumluKisi(int sorumluKisi) {
		this.sorumluKisi = sorumluKisi;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("\nSorumlu oldu�u ki�i sayisi:" + this.sorumluKisi);
	}

	public void zamYap(int zamMiktari) {
		if (zamMiktari > 0) {
			System.out.println(zamMiktari + "TL zam yap�ld�");
		}
		else {
			System.out.println("Ge�ersiz zam miktar�!");
		}
	}

}
