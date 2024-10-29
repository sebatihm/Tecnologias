public class Hero{
    public string heroName {get; set;}
    public int level {get; set;}
    public int healthPoints {get; set;}
    public int manna = 0;
    public List<Ability> Abilities {get; set;}

    public Hero(string name, int level, int healthPoints){
        this.heroName = name;
        this.level = level;
        this.healthPoints = healthPoints;
        Abilities = new List<Ability>();
    }

    public void abilityImpact(int lifePointsChanged){
        healthPoints += lifePointsChanged;
        if(lifePointsChanged < 0){
            Console.WriteLine($"{heroName} has taken {lifePointsChanged} damage!");
        } else{
            Console.WriteLine($"{heroName} has recovered {lifePointsChanged} life points!");
        }
    }

    public void coolDown(Ability ability){
        if(ability.type == "heal"){
            manna -= 50;
        }else if(ability.type == "attack"){
            manna += 20;
        } else if (ability.type == "special attack"){
            manna -= 100;
        }

        if(manna > 100){
            manna = 100;
        }
    }
    
    public void die(){
        if(healthPoints < 1){
            healthPoints = 0;
            Console.WriteLine($"{heroName} has perished! You have lost the battle!");
        }
    }

    public void addAbility(Ability ability){
        Abilities.Add(ability);
    }

    public void description(){
        Console.WriteLine($"Hero : {heroName} \nLevel: {level} \nLife Points: {healthPoints} \n Abilities:");
        foreach (var ability in Abilities){
            ability.showAbility();
        }
        Console.WriteLine("");
    }
}