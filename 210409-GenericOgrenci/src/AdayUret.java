
public class AdayUret {
	public Aday adayUret(String adayAlani) {
		if(adayAlani.equals("Sayisal")) {
			return new Sayisal();
		}
		else if(adayAlani.equals("Esit Agirlik")) {
			return new EsitAgirlik();
		}
		else {
			return null;
		}
		
	}

}
