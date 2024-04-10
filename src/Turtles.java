public class Turtles {

        String name;
        String color;
        int dexterity;
        String weapon;

        public class Turtle {

                @Override
                public String toString() {
                        return "Turtle{" +
                                "name='" + name + '\'' +
                                ", color='" + color + '\'' +
                                ", dexterity=" + dexterity +

                                ",weapon="+ weapon+

                                '}';
                }

                public String getName() {
                        return name;
                }
                public String getColor() {
                        return color;
                }
                public int getDexterity() {return dexterity;}
                public String getWeapon(){return weapon;}


                public Penguin(String name, String color, int dexterity,int weapon) {
                        this.name = name;
                        this.color = color;
                        this.dexterity = dexterity;
                        this.weapon= weapon;

                }
        }


}
