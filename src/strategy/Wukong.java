package strategy;

public class Wukong extends ChampionSuperClass implements Champion{

    public Wukong() {
        super("오공", 130);
    }

    @Override
    public void attck(ChampionSuperClass champion) {
        System.out.println( super.name + "이 " + champion.name + "에게 평타!");
        champion.damageHp(10);
    }

    @Override
    public void Q(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 파쇄격!");
        champion.damageHp(20);
    }

    @Override
    public void W(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 분신 전사!");
    }

    @Override
    public void E(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 근두운 급습!");
        champion.damageHp(30);
    }

    @Override
    public void R(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 회전격!");
        for(int i = 0 ; i< 10 ; i++){
            int damage= 5;
            champion.damageHp(damage);
            System.out.println(damage + "만큼의 피해를 입혔습니다.");

        }
    }

}
