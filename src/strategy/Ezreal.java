package strategy;

public class Ezreal extends ChampionSuperClass implements Champion{
    public Ezreal() {
        super("이즈리얼", 100);
    }


    @Override
    public void attck(ChampionSuperClass champion) {
        System.out.println( super.name + "이 " + champion.name + "에게 평타!");
        champion.damageHp(10);
    }

    @Override
    public void Q(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 신비한 화살!");
        champion.damageHp(30);
    }

    @Override
    public void W(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 비전이동!");
        champion.damageHp(0);
    }

    @Override
    public void E(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 정수의 흐름!");
        champion.damageHp(10);
    }

    @Override
    public void R(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 정조준 일격!");
        champion.damageHp(50);
    }


}
