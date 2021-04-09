
public class HeroFabrikasý {
	public Hero heroUret(String heroTuru) {
		if(heroTuru.equals("Goblin")) {
			return new Goblin(100, 50, 500, 10);
		}
		else if(heroTuru.equals("MegaSovalye")) {
			return new MegaSovalye(250, 30, 1000, 25);
		}
		else {
			return null;
		}
	}
}
