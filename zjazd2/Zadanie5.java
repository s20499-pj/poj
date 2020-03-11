/*
Summary: Zadanie 5 class Human
Author: Tomasz Baj s20499
 */
public class Zadanie5 {
    public static class Human {
        int age, weight, high;
        boolean sex;
        String name;
        String indexNumber;
        float feetSize;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

        public boolean isMale() {
            return sex;
        }
        public void isMale(boolean sex) {
            this.sex = sex;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public float getFeetSize() {
            return feetSize;
        }

        public void setFeetSize(float feetSize) {
            this.feetSize = feetSize;
        }

        public String getIndexNumber() {
            return indexNumber;
        }

        public void setIndexNumber(String indexNumber) {
            this.indexNumber = indexNumber;
        }
    }

    public static void main(String[] args) {
        Human tomasz = new Human();
        tomasz.setName("tomasz");
        tomasz.isMale(true);
        tomasz.setAge(26);
        tomasz.setHigh(175);
        tomasz.setWeight(80);
        tomasz.setFeetSize(42);
        tomasz.setIndexNumber("s20499");
    }
}
