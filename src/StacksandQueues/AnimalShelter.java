package StacksandQueues;

import java.util.LinkedList;

public class AnimalShelter {

    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }
    }

    static class AnimalQueue {
        LinkedList<Animal> queue = new LinkedList<Animal>();

        public void enqueue(Animal newAnimal) {
            queue.add(newAnimal);
        }

        public Animal dequeueAny() {
            return queue.poll();
        }

        public Animal dequeueDog() {
            int key = 0;
            while (queue.get(key) instanceof Cat) {
                key++;
            }
            Animal animal = queue.get(key);
            queue.remove(key);
            return animal;
        }

        public Animal dequeueCat() {
            int key = 0;
            while (queue.get(key) instanceof Dog) {
                key++;
            }
            Animal animal = queue.get(key);
            queue.remove(key);
            return animal;
        }
    }

    public static void main(String[] args) {
        AnimalQueue shelter = new AnimalQueue();
        shelter.enqueue(new Cat("Kitty"));
        shelter.enqueue(new Dog("Max"));
        shelter.enqueue(new Dog("Cooper"));
        shelter.enqueue(new Cat("Misty"));
        shelter.enqueue(new Cat("Lily"));
        System.out.println(shelter.dequeueAny().name);
        System.out.println(shelter.dequeueCat().name);
        System.out.println(shelter.dequeueAny().name);
        shelter.enqueue(new Dog("Rocky"));
        System.out.println(shelter.dequeueDog().name);
        System.out.println(shelter.dequeueAny().name);
        System.out.println(shelter.dequeueAny().name);
    }
}
