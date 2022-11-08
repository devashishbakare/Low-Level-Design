package com.DesignPattern.BuilderPattern;

public class Dog {

    private String breed;
    private String name;
    private String age;
    private int price;
    private String gender;

    public Dog(DogBuilder obj){
        this.breed = obj.breed;
        this.name = obj.name;
        this.age = obj.age;
        this.price = obj.price;
        this.gender = obj.gender;
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", price=" + price +
                ", gender='" + gender + '\'' +
                '}';
    }


    public static class DogBuilder{
        private String breed;
        private String name;
        private String age;
        private int price;
        private String gender;

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAge() {
            return age;
        }

        public DogBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public int getPrice() {
            return price;
        }

        public DogBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }



    }


}
