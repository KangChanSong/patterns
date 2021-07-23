package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeagueOfLegends {

    public static void main(String[] args) {

        Map<Integer, Champion> championMap = new HashMap<>();

        championMap.put(1, new Wukong());
        championMap.put(2, new Ezreal());
        championMap.put(3, new Vayne());

        Scanner scanner = new Scanner(System.in);

        Champion userChampion = null;
        ChampionSuperClass targetChampion = null;

        int input = 0;
        boolean flag = true;

        System.out.println("--- 소환사의 협곡에 오신 것을 환영합니다 ---");
        System.out.print("챔피언을 골라주세요 (1: 오공, 2:이즈리얼, 3:베인) : ");

        input = scanner.nextInt();

        userChampion = championMap.get(input);

        System.out.println("당신은 " + ((ChampionSuperClass) userChampion).name + "입니다.");
        System.out.println("--- 싸움을 시작합니다 ---");


        while (flag) {
            System.out.print("공격할 챔피언을 선택하세요 (1: 오공 , 2:이즈리얼 , 3:베인) : ");
            int inputTarget = scanner.nextInt();
            if (inputTarget == input){
                flag = true;
                System.out.println("자신이 선택한 챔피언은 공격할 수 없습니다.");
            } else {
                targetChampion = (ChampionSuperClass) championMap.get(inputTarget);
                flag = false;
            }
        }
        System.out.println( targetChampion.name + " 을 골랐습니다.");

        flag = true;
        while (flag){
            System.out.print("공격할 스킬을 선택해주세요 (펑타: A, 스킬 : {Q, W, E, R}) : ");
            String skill = scanner.nextLine();
            switch (skill){
                case "A":
                    userChampion.attck(targetChampion);
                    if(targetChampion.info() == 0){
                        flag = false;
                    }
                    break;
                case "Q":
                    userChampion.Q(targetChampion);
                    if(targetChampion.info() == 0){
                        flag = false;
                    }
                    break;
                case "W":
                    userChampion.W(targetChampion);
                    if(targetChampion.info() == 0){
                        flag = false;
                    }
                    break;
                case "E":
                    userChampion.E(targetChampion);
                    if(targetChampion.info() == 0){
                        flag = false;
                    }
                    break;
                case "R":
                    userChampion.R(targetChampion);
                    if(targetChampion.info() == 0){
                        flag = false;
                    }
                    break;
            }

        }

        System.out.println("승리했습니다. 게임을 종료합니다.");

        

    }

}
