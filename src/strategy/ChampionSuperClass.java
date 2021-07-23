package strategy;

public class ChampionSuperClass {
    int hp;
    String name;
    ChampionSuperClass(String name, int hp){
        this.hp = hp;
        this.name = name;
    }
    public void damageHp(int hp) {
        this.hp -= hp;
    }

    public int info() {
        if(this.hp <= 0){
            System.out.println( name + "이(가) 죽었습니다....");
            return 0;
        } else{
            System.out.println( name + "의 hp 이 " + this.hp + " 가 됐습니다.");
            return 1;
        }
    }

}
