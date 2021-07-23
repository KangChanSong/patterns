package strategy;

public class Vayne extends ChampionSuperClass implements Champion{
    int count = 0;
    boolean isR = false;
    public Vayne() {
        super("베인", 90);
    }

    @Override
    public void attck(ChampionSuperClass champion) {
        System.out.println( super.name + "이 " + champion.name + "에게 평타!");

        if(isR == true){
            champion.damageHp(30);
        }else{
            champion.damageHp(10);
        }
    }

    @Override
    public void Q(ChampionSuperClass champion) {
        System.out.println( champion.name + "에게 구르기!");
    }

    @Override
    public void W(ChampionSuperClass champion) {
        if(count == 3){
            champion.damageHp(30);
            count = 0;
        } else {
            champion.damageHp(10);
        }
        System.out.println(champion.name + "에게 은화살! :" + ++count);

    }

    @Override
    public void E(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 선고!");
        champion.damageHp(10);
    }

    @Override
    public void R(ChampionSuperClass champion) {
        System.out.println(champion.name + "에게 결전의 시간!");
        isR = true;
    }

}
