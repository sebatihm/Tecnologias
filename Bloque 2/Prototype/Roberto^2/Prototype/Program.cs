// See https://aka.ms/new-console-template for more information
Enemy goblin1 = new Goblin("Triky Goblin 1", 10, 50);
Ability bonk = new Ability("bonk", "attack", 5, 10);
goblin1.Abilities.Add(bonk);
Enemy goblin2 = (Goblin)goblin1.Clone();
goblin2.name = "Mayatoblin";
Enemy goblin3 = (Goblin)goblin1.Clone();
goblin3.name = "GoblinBerto";
Enemy orc1 = new Orc("Henry Danger", 6, 80);
Ability smash = new Ability("smash", "attack", 8, 15);
orc1.Abilities.Add(smash);
Enemy orc2 = (Orc)orc1.Clone();
orc2.name = "OrcBerto";

Hero hero1 = new Hero("Hectoooor", 12, 100);
Ability swordSlash = new Ability("sword slash", "attack", 8, 14);
hero1.Abilities.Add(swordSlash);
Ability crystalPurifiedWater = new Ability("Crystal Purified Water", "heal", 30, 50);
hero1.Abilities.Add(crystalPurifiedWater);
Ability finaFlash = new Ability("Final Flash", "special attack", 25, 40);
hero1.Abilities.Add(finaFlash);

List <Enemy> enemies = new List<Enemy>();
enemies.Add(goblin1);
enemies.Add(goblin2);
enemies.Add(goblin3);
enemies.Add(orc1);
enemies.Add(orc2);

while(enemies.Count != 0){
    Console.WriteLine($"There are {enemies.Count} enemies.now.");

    foreach(Enemy tempEnemy in enemies){
        int turn = 0;
        while (tempEnemy.healthPoints > 0){

            turn++;
            if(turn % 2 == 0){
                Console.WriteLine($"You are gonna fight against {tempEnemy.name}");
                Console.WriteLine($"What are you gonna do {hero1.heroName}? \n1. Attack\n2. Heal \n3.Special Attack\n4. Enemy details\nLife points remaining: {hero1.healthPoints} \nCurrent Mana: {hero1.manna}");
                int decision = int.Parse(Console.ReadLine());
                switch (decision){
                    case 1:
                        tempEnemy.abilityImpact(swordSlash.cast());
                        hero1.coolDown(swordSlash);
                        break;
                    case 2:
                        if(hero1.manna > 50){
                            tempEnemy.abilityImpact(crystalPurifiedWater.cast());
                            hero1.coolDown(crystalPurifiedWater);
                        }
                        break;
                    case 3:
                        if(hero1.manna == 100){
                            tempEnemy.abilityImpact(finaFlash.cast());
                            hero1.coolDown(finaFlash);
                        }
                        break;
                    case 4:
                        tempEnemy.description();
                        break;
                    default: 
                        Console.WriteLine("Make no mistake!");
                        break;
                }
            } else{
                
            }
        }



    }

}