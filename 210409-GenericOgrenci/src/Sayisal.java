
public class Sayisal extends Aday {

	public Sayisal() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	double puanHesapla() {
		// TODO Auto-generated method stub
		double puan= 3*getTr()+5*getMat()+2*getSosyal()+5*getFen();
		return puan;
	}

}
