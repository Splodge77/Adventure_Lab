package Player.Magicians;

public enum Spell {

        FIREBALL(20, "Fire"),
        LIGHTNING(10, "Electric"),
        STUPIFY(25, "Psych");

        private final int hitValue;
        private final String element;

        Spell(int hitValue, String element) {
            this.hitValue = hitValue;
            this.element = element;
        }

        public int getHitValue(){
            return this.hitValue;
        }

        public String getElement(){
            return this.element;
        }
    }

