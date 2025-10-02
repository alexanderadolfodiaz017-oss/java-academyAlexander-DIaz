package com.pluralsight;

public class SuperSayin {

    String name;
    int powerlevel;

    public void PowerUp(){
        this.powerlevel = this.powerlevel *2;
    }

    public void Stats() {
        System.out.println(this.name + " powerlevel is " + this.powerlevel);
        if(this.powerlevel > 9000)
        {
            System.out.println("Alex Diaz shouts: ITS OVER 9000!");
        }
    }
    public void Attack(SuperSayin _anySaiyan) {
        _anySaiyan.powerlevel = _anySaiyan.powerlevel -100;
    }

    public void SS3() {
        System.out.println(this.attack() ;);

    }
   //public void superSaiyanTwo() {
      // System.out.println(this.name + " powered up to super saiyan 2");
     //  this.powerlevel += 10000;
    }
}

