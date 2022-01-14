package Exercise.ExamExcersize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndMagic_03_04042020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> heroHP = new TreeMap<>();
        Map<String, Integer> heroMP = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);
            if (hp > 100) {
                hp = 100;
            }
            if (mp > 200) {
                mp = 200;
            }
            heroHP.put(name, hp);
            heroMP.put(name, mp);
        }
        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] arrayCommands = command.split(" - ");
            String name = arrayCommands[1];
            switch (arrayCommands[0]) {
                case "CastSpell":
                    int mp = Integer.parseInt(arrayCommands[2]);
                    String spell = arrayCommands[3];
                    int currentMP = heroMP.get(name);
                    if (currentMP >= mp) {
                        heroMP.put(name, heroMP.get(name) - mp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!", name, spell, heroMP.get(name));
                    } else if(currentMP<mp) {
                        System.out.printf("%s does not have enough MP to cast %s!", name, spell);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(arrayCommands[2]);
                    String attacker = arrayCommands[3];
                    int currentHp=heroHP.get(name);
                    if (currentHp > damage) {
                        heroHP.put(name, heroHP.get(name) - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!", name, damage, attacker, heroHP.get(name));
                    } else if (currentHp <= damage) {
                        heroHP.remove(name);
                        heroMP.remove(name);
                        System.out.printf("%s has been killed by %s!", name, attacker);
                    }

                    break;
                case "Recharge":
                    int amount=Integer.parseInt(arrayCommands[2]);
                    currentMP= heroMP.get(name);
                    int amountRecovered=0;
                    if(currentMP+amount>200){
                        amountRecovered=200-currentMP;
                    }else if (currentMP+amount<=200){
                        amountRecovered=amount;
                    }
                    heroMP.put(name,heroMP.get(name)+amountRecovered);
                    System.out.printf("%s recharged for %d MP!",name,amountRecovered);

                    break;
                case "Heal":
                    amount=Integer.parseInt(arrayCommands[2]);
                    currentHp= heroHP.get(name);
                    amountRecovered=0;
                    if(currentHp+amount>100){
                        amountRecovered=100-currentHp;
                    }else if (currentHp+amount<=100){
                        amountRecovered=amount;
                    }
                    heroHP.put(name,heroHP.get(name)+amountRecovered);
                    System.out.printf("%s healed for %d HP!",name,amountRecovered);
                    break;
            }
            System.out.println();


            command = scan.nextLine();
        }
        heroHP.entrySet().stream()
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                //име -> hp
                .forEach(hero -> {
                    String heroName = hero.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + hero.getValue());
                    System.out.println("  MP: " + heroMP.get(heroName));
                });
    }
}
