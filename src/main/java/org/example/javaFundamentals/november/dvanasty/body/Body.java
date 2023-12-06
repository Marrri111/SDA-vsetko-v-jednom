package org.example.javaFundamentals.november.dvanasty.body;

public class Body {
    private int height;
    private Head head;

    public Body(int height, String hairColor) {
        this.height = height;
        head = new Head(hairColor);
    }

    public Head getHead() {
        return head;
    }

    public class Hand{
        int fingerCount=5;
        public Hand() {
            Body.this.head.hairColor = "red";
        }
        public void cutFinger(){
            fingerCount--;
        }
    }
    public class Head {
        private String hairColor;

        public Head(String hairColor) {
            this.hairColor = hairColor;
        }

        void printBodyHeight() {
            System.out.println(height);
        }

        void paintHair(String color){
            hairColor = color;
        }
    }
}
