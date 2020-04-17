package tr.salkan.code.java.pure.examples.compositionVsinheritance.composition;

public class HumanExample {


    public static void main(String[] args) {

        Hand hand = new Hand(true);
        Foot foot = new Foot(43);
        Face face = new Face(true);

        Human human = new Human(hand,foot,face);

        System.out.println(human);
    }

    static class Human {

        Hand hand;
        Foot foot;
        Face face;

        public Human(Hand hand, Foot foot, Face face) {
            this.hand = hand;
            this.foot = foot;
            this.face = face;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "hand clearing =" + hand.isClear +
                    ", foot number =" + foot.footNumber +
                    ", face has beard =" + face.hasBeard +
                    '}';
        }
    }


    static class Hand {

        boolean isClear = false;

        public Hand(boolean isClear) {
            this.isClear = isClear;
        }

        public boolean isClear() {
            return isClear;
        }

        public void setClear(boolean clear) {
            isClear = clear;
        }
    }

    static class Foot {

        int footNumber = 0;

        public Foot(int footNumber) {
            this.footNumber = footNumber;
        }

        public int getFootNumber() {
            return footNumber;
        }

        public void setFootNumber(int footNumber) {
            this.footNumber = footNumber;
        }
    }

    static class Face {

        boolean hasBeard = false;

        public Face(boolean hasBeard) {
            this.hasBeard = hasBeard;
        }

        public boolean isHasBeard() {
            return hasBeard;
        }

        public void setHasBeard(boolean hasBeard) {
            this.hasBeard = hasBeard;
        }
    }
}
