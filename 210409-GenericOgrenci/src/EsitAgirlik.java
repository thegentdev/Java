
public class EsitAgirlik extends Aday {

	public EsitAgirlik() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	double puanHesapla() {
		// TODO Auto-generated method stub
		double puan=4*getTr()+5*getMat()+4*getSosyal()+2*getFen();		
		return puan;
	}

}
