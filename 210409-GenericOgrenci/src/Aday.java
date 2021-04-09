import java.util.Scanner;

public abstract class Aday {
	private String isim;
	private int mat, tr, sosyal, fen;
	
	public Aday() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aday bilgilerini giriniz...");
		System.out.print("Ýsim >>> ");
		this.isim=scanner.nextLine();
		
		System.out.print("Matematik Neti >>> ");
		this.mat=scanner.nextInt();scanner.nextLine();
		System.out.print("Türkçe Neti >>> ");
		this.tr=scanner.nextInt();scanner.nextLine();
		System.out.print("Sosyal Neti >>> ");
		this.sosyal=scanner.nextInt();scanner.nextLine();
		System.out.print("Fen Neti >>> ");
		this.fen=scanner.nextInt();scanner.nextLine();
		
		System.out.println("Kayýt baþarýlý!");
		
	}
	
	abstract double puanHesapla();

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTr() {
		return tr;
	}

	public void setTr(int tr) {
		this.tr = tr;
	}

	public int getSosyal() {
		return sosyal;
	}

	public void setSosyal(int sosyal) {
		this.sosyal = sosyal;
	}

	public int getFen() {
		return fen;
	}

	public void setFen(int fen) {
		this.fen = fen;
	}
	
}
